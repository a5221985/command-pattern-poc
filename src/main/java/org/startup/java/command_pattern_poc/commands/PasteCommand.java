package org.startup.java.command_pattern_poc.commands;

import org.startup.java.command_pattern_poc.editor.Editor;

public class PasteCommand extends Command {

	public PasteCommand(Editor editor) {
		super(editor);
	}

	@Override
	public boolean execute() {
		if (editor.clipboard == null || editor.clipboard.isEmpty()) return false;
		backup();
		editor.textField.insert(editor.clipboard, editor.textField.getCaretPosition());
		return false;
	}

}
