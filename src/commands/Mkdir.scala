package com.sajag16642
package commands

import filesystem.State

import com.sajag16642.files.{DirEntry, Directory}

/**
 * @author sajag16642
 */
class Mkdir(name: String) extends CreateEntry(name) {
  override def createEntry(state: State, entryName: String): DirEntry =
    Directory.empty(state.wd.path, entryName)
}
