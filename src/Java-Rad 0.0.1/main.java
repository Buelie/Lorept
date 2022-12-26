import java.awt.Color;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.Desktop;
import javax.swing.*;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.text.*;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import java.io.File;
import java.io.IOException;

public class Main extends JFrame{
    //系统菜单
    private JMenuItem Save;
    private JMenuItem Close;
    //工具菜单
    private JMenuItem Plugin;
    private JMenuItem Extend;
    private JMenuItem Set;
    //背景切换
    private JMenuItem Black;
    private JMenuItem White;
    //说明
    private JMenuItem User_text;
    public Main(){

        Toolkit tok = Toolkit.getDefaultToolkit();
        Image image = tok.getImage("src/img/icon.png");
        setIconImage(image);
        setResizable(true);
        setTitle("Lorept数据包生成工具");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(500,100,854,480);
        this.getContentPane().setBackground(new Color(255,255,255));

        JMenuBar menu = new JMenuBar();
        setJMenuBar(menu);
        //系统菜单
        JMenu system = new JMenu("系统");
        menu.add(system);
        Save = new JMenuItem("保存");
        system.add(Save);
        Close = new JMenuItem("关闭");
        system.add(Close);
        //工具菜单
        JMenu tool = new JMenu("工具");
        menu.add(tool);
        Plugin = new JMenuItem("插件");
        tool.add(Plugin);
        Extend = new JMenuItem("扩展");
        tool.add(Extend);
        tool.addSeparator();
        Set = new JMenuItem("设置");
        tool.add(Set);
        //背景色切换
        JMenu bg = new JMenu("样式");
        menu.add(bg);
        Black = new JMenuItem("深色");
        Black.setToolTipText("实验性功能");
        bg.add(Black);
        bg.addSeparator();
        White = new JMenuItem("浅色");
        bg.add(White);
        User_text = new JMenuItem("菜单栏除关闭设置外仅对主页生效!");
        menu.add(User_text);

        FlowLayout centre = new FlowLayout(FlowLayout.CENTER);
        JPanel data = new JPanel(centre);
        getContentPane().add(data,BorderLayout.PAGE_START);

        JButton rep = new JButton("合成表生成");
        data.add(rep);

        JButton lan = new JButton("成就/进度");
        data.add(lan);

        JButton lsc = new JButton("结构/地形");
        data.add(lsc);

        rep.addActionListener(new ActionListener() {
            public void actionPerformed(final ActionEvent e) {
                JFrame rp = new JFrame();
                rp.setTitle("合成表生成");
                rp.setBounds(500,100,854,480);
                rp.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
                rp.setResizable(true);
                rp.setVisible(true);

                JPanel rsp = new JPanel(centre);
                getContentPane().add(rsp,BorderLayout.PAGE_START);
                JPanel rsp1 = new JPanel(centre);
                getContentPane().add(rsp1,BorderLayout.LINE_START);
                JPanel rsp2 = new JPanel(centre);

                JComboBox RepItem = new JComboBox();
                JComboBox RepItem1 = new JComboBox();
                JComboBox RepItem2 = new JComboBox();
                JComboBox RepItem3 = new JComboBox();
                JComboBox RepItem4 = new JComboBox();
                JComboBox RepItem5 = new JComboBox();
                JComboBox RepItem6 = new JComboBox();
                JComboBox RepItem7 = new JComboBox();
                JComboBox RepItem8 = new JComboBox();

                RepItem.addItem("铁锭");

                RepItem1.addItem("铁锭");

                RepItem2.addItem("铁锭");

                RepItem3.addItem("铁锭");

                RepItem4.addItem("铁锭");

                RepItem5.addItem("铁锭");

                RepItem6.addItem("铁锭");

                RepItem7.addItem("铁锭");

                RepItem8.addItem("铁锭");

                rsp.add(RepItem);
                rsp.add(RepItem1);
                rsp.add(RepItem2);
                rsp1.add(RepItem3);
                rsp1.add(RepItem4);
                rsp1.add(RepItem5);
                rsp2.add(RepItem6);
                rsp2.add(RepItem7);
                rsp2.add(RepItem8);

                rp.add(rsp);
                rp.add(rsp1);
                rp.add(rsp2);
                rsp.setVisible(true);
                rsp1.setVisible(true);
                rsp2.setVisible(true);
            }
        });
        lan.addActionListener(new ActionListener() {
            public void actionPerformed(final ActionEvent e) {
                JFrame ln = new JFrame();
                ln.setTitle("成就/进度生成");
                ln.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
                ln.setBounds(500,100,854,480);
                ln.setResizable(true);
                ln.setVisible(true);
                ln.add(menu,BorderLayout.PAGE_START);
            }
        });
        Black.addActionListener(new ActionListener() {
            public void actionPerformed(final ActionEvent e) {
                getContentPane().setBackground(new Color(25,25,25));
            }
        });
        White.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                menu.setBackground(new Color(255,255,255));
                getContentPane().setBackground(new Color(255,255,255));
            }
        });
        Close.addActionListener(new ActionListener() {
            public void actionPerformed(final ActionEvent e) {
                System.exit(0);
            }
        });
    }
    public static void main(String[] args){
        Main frame = new Main();
        frame.setVisible(true);
    }
}
