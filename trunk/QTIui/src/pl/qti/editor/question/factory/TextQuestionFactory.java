package pl.qti.editor.question.factory;

import org.w3c.dom.Document;

import pl.qti.editor.exceptions.InvalidXmlException;
import pl.qti.editor.questions.TextQuestion;
import pl.qti.gui.AbstractQuestionPanel;
import pl.qti.gui.OpenQuestion;
import pl.qti.gui.QTIEditor;

public class TextQuestionFactory extends AbstractQuestionFactory {


	@Override
	public AbstractQuestionPanel makeQuestion(Document questionXml,
			QTIEditor editor) throws InvalidXmlException {
		this.question = new TextQuestion();
		this.questionPanel = new OpenQuestion(editor);
		this.questionXml = questionXml;
		super.makeHeader();
		return this.questionPanel;
	}

}
