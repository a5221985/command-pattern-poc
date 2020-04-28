package org.startup.java.command_pattern_poc.commands;

import org.startup.java.command_pattern_poc.editor.Editor;

public class CopyCommand extends Command {
	
	public CopyCommand(Editor editor) {
		super(editor);
	}

	@Override
	public boolean execute() {
		editor.clipboard = editor.textField.getSelectedText();
		return false;
	}

}
