package com.sajag16642
package files

/**
 * @author sajag16642
 */
class File(override val parentPath: String, override val name: String, contents: String) extends DirEntry(parentPath, name) {


  override def asDirectory: Directory =
  throw new FileSystemException("File cannot be converted to a directory!!")

  override def asFile: File = this

  override def getType: String = "File"

  override def isDirectory: Boolean = false

  override def isFile: Boolean = true

  def setContent(newContents: String): File =
  new File(parentPath, name, newContents)

  def appendContent(newContents: String): File =
  setContent(contents+"\n"+newContents)

  def getContents: String = this.contents
}

object File {
  def empty(parentPath: String, name: String): File = {
    new File(parentPath, name, "")
  }
}
