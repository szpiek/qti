package pl.qti.gui;

import java.util.ArrayList;

import pl.qti.editor.exceptions.XmlSaveException;
import pl.qti.editor.question.factory.MultipleChoiceFactory;

public class MultipleChoiceQuestion extends SimpleChoiceQuestion {

	private static final long serialVersionUID = 1L;
	
	public MultipleChoiceQuestion(QTIEditor editor) {
		super(editor);
		upperEnable();
		lowerEnable();
	}
	@Override
	public String getQuestionType() {
		return "Multiple Question";
	}
	
	public void saveToXML(String path)
	{
		//ostatni parametr to list z lowerBound, upperBound, defaultValue dokladnie w takiej kolejnosci jak podalem
		try {
			MultipleChoiceFactory.saveQuestion(getAnswers(), getQuestionName(), getQuestionText(), path, ((getShuffleValue() == true) ? "true" : "false"), getScoreValues());
		} catch (XmlSaveException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
