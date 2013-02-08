
import javax.swing.*;

/**
 * 
 * @author drawen
 */
public class ScoreTextAnasysJFrame extends JFrame {
	private ScoreMenu scoreMenu;

	/** Creates a new instance of ScoreTextAnasys */
	public ScoreTextAnasysJFrame(ScoreMenu scoreMenu) {
		this.scoreMenu = scoreMenu;
		this.setTitle("�ɼ����ı�ͼ");
		int[] score = scoreMenu.getAnasisOfScore();
		int number = scoreMenu.getNumberOfAttendTestStudent();
		Course course = scoreMenu.getCourse();
		float[] scoreOfTest = scoreMenu.getScoreOfTest();
		long[] id = scoreMenu.getIdOfStudents();
		float max = scoreMenu.getHighestScore();
		float min = scoreMenu.getLowestScore();
		float average = scoreMenu.getAverageScore();
		String courseText = "�γ̱�ţ�" + course.getId() + "\n�γ����ƣ�"
				+ course.getName() + "\n�γ�ѧ�֣�" + course.getCredit() + "\n�γ�ѧʱ��"
				+ course.getPeriod() + "\n";
		String scoreText = "\n�μӿ���������" + number + "\n����������"
				+ (number - score[0]) + "\n����������������\n0~59�֣�" + score[0]
				+ "��\n60~69�֣�" + score[1] + "��\n70~79��" + score[2]
				+ "��\n80~89�֣�" + score[3] + "��\n90��100�֣�" + score[4]
				+ "��\n��߷֣�" + max + "\n��ͷ֣�" + min + "\nƽ���֣�" + average
				+ "\n����������£�\n\nѧ��\t����\n";
		for (int i = 0; i < number; i++) {
			scoreText = scoreText + id[i] + "\t" + scoreOfTest[i] + "\n";
		}
		JEditorPane content = new JEditorPane();
		content.setEditable(false);
		content.setText(courseText + scoreText);
		JScrollPane pane = new JScrollPane();
		pane.setViewportView(content);
		this.add(pane);
	}

}
