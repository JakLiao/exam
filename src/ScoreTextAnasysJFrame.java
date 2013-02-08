
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
		this.setTitle("成绩单文本图");
		int[] score = scoreMenu.getAnasisOfScore();
		int number = scoreMenu.getNumberOfAttendTestStudent();
		Course course = scoreMenu.getCourse();
		float[] scoreOfTest = scoreMenu.getScoreOfTest();
		long[] id = scoreMenu.getIdOfStudents();
		float max = scoreMenu.getHighestScore();
		float min = scoreMenu.getLowestScore();
		float average = scoreMenu.getAverageScore();
		String courseText = "课程编号：" + course.getId() + "\n课程名称："
				+ course.getName() + "\n课程学分：" + course.getCredit() + "\n课程学时："
				+ course.getPeriod() + "\n";
		String scoreText = "\n参加考试人数：" + number + "\n及格人数："
				+ (number - score[0]) + "\n各个分数段人数：\n0~59分：" + score[0]
				+ "人\n60~69分：" + score[1] + "人\n70~79分" + score[2]
				+ "人\n80~89分：" + score[3] + "人\n90～100分：" + score[4]
				+ "人\n最高分：" + max + "\n最低分：" + min + "\n平均分：" + average
				+ "\n具体分数如下：\n\n学号\t分数\n";
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
