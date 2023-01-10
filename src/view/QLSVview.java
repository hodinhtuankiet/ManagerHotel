package view;

import java.awt.EventQueue;



import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import model.QLSV;
import model.Tinh;
import model.thiSinh;

import javax.swing.JMenuBar;
import javax.swing.JMenu;
import java.awt.Font;
import java.awt.Image;
import java.awt.Toolkit;
import java.net.URL;
import java.util.ArrayList;
import java.util.Date;
import java.util.Set;
import java.util.TreeSet;

import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JSeparator;
import javax.swing.BorderFactory;
import javax.swing.Box;
import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.border.BevelBorder;
import javax.swing.border.Border;
import javax.swing.JLabel;
import javax.swing.JComboBox;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JTable;
import javax.swing.JScrollPane;
import javax.swing.table.DefaultTableModel;

import controller.QLSVcontroller;

import javax.swing.JCheckBox;
import javax.swing.JRadioButton;
import javax.swing.JSplitPane;
import java.awt.Color;
import java.awt.Label;
import javax.swing.border.LineBorder;
import java.awt.SystemColor;
import javax.swing.JSlider;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.SwingConstants;
import javax.swing.UIManager;
import javax.swing.DefaultComboBoxModel;

public class QLSVview extends JFrame {

	private JPanel contentPane;
	public QLSV model;
	public JTextField textField_timkiem;
	public JTable table;
	public JTextField textField_id;
	public JTextField textField_name;
	public JTextField textField_date;
	public JTextField textField_mon1;
	public JTextField textField_mon2;
	public JTextField textField_tien;
	public JComboBox comboBox_1_quequan;
	public ButtonGroup button;
	public JRadioButton rdbtnNewRadioButton_nam;
	public JRadioButton rdbtnNewRadioButton_nu;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					QLSVview frame = new QLSVview();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public QLSVview() {
		this.model = new QLSV();
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1042, 814);
		setLocationRelativeTo(null);
		ImageIcon icon = new ImageIcon("bun.jpg");
		this.setTitle("Quản Lí Sinh Viên ");
		this.setIconImage(icon.getImage());
		QLSVcontroller controller = new QLSVcontroller(this);

		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);

		Border border = BorderFactory.createLineBorder(Color.BLACK, 1);

		JMenu menufile = new JMenu("File");
		menufile.setFont(new Font("Segoe UI", Font.PLAIN, 18));
		menuBar.add(menufile);

		JMenuItem menuopen = new JMenuItem("Open");
		menuopen.setFont(new Font("Segoe UI", Font.PLAIN, 16));
		menufile.add(menuopen);

		JMenuItem mntmNewMenuItem = new JMenuItem("Close");
		mntmNewMenuItem.setFont(new Font("Segoe UI", Font.PLAIN, 16));
		menufile.add(mntmNewMenuItem);

		JSeparator separator_1 = new JSeparator();
		menufile.add(separator_1);

		JMenuItem menuabout = new JMenuItem("Exit");
		menuabout.setFont(new Font("Segoe UI", Font.PLAIN, 15));
		menufile.add(menuabout);

		JMenu mnNewMenu = new JMenu("About");
		mnNewMenu.setFont(new Font("Segoe UI", Font.PLAIN, 18));
		menuBar.add(mnNewMenu);

		JMenuItem mntmNewMenuItem_1 = new JMenuItem("About Me");
		mntmNewMenuItem_1.setFont(new Font("Segoe UI", Font.PLAIN, 15));
		mnNewMenu.add(mntmNewMenuItem_1);
		contentPane = new JPanel();
		contentPane.setForeground(SystemColor.activeCaptionText);
//		contentPane.setBackground(new Color(250, 128, 114));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);

		Box verticalBox = Box.createVerticalBox();
		verticalBox.setBounds(10, 142, 148, -30);
		contentPane.add(verticalBox);
		ArrayList<Tinh> tinh = Tinh.getDsTenTinh();
//		for (Tinh tinh2 : tinh) {
//			comboBox.addItem(tinh2.getTenTinh());
//		}

		JLabel lblNewLabel_1 = new JLabel("Search Number Room: ");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 17));
		lblNewLabel_1.setBounds(35, 24, 176, 21);
		contentPane.add(lblNewLabel_1);

		textField_timkiem = new JTextField();
		textField_timkiem.setBorder(border);
		textField_timkiem.setBackground(new Color(255, 255, 255));
		textField_timkiem.setBounds(209, 20, 256, 35);
		contentPane.add(textField_timkiem);
		textField_timkiem.setColumns(10);

		JButton Buttonsearch = new JButton("Search");
		Buttonsearch.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				timkiem();
			}
		});
		Buttonsearch.setBorder(border);
		Buttonsearch.setFont(new Font("Tahoma", Font.PLAIN, 21));
		Buttonsearch.setBounds(475, 20, 102, 35);
		contentPane.add(Buttonsearch);

		JSeparator separator = new JSeparator();
		separator.setBounds(35, 108, 972, 2);
		contentPane.add(separator);

		table = new JTable();
		table.setFillsViewportHeight(true);
		table.setColumnSelectionAllowed(true);
		table.setCellSelectionEnabled(true);
		table.setSurrendersFocusOnKeystroke(true);
		table.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		table.setFont(new Font("Tahoma", Font.PLAIN, 14));
		table.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"Number", "Name Customer", "Address", "Date", "Gender", "CMND", "Room", "Price:"
			}
		));
		table.getColumnModel().getColumn(0).setPreferredWidth(54);
		table.getColumnModel().getColumn(0).setMinWidth(17);
		table.getColumnModel().getColumn(1).setPreferredWidth(72);
		table.getColumnModel().getColumn(2).setPreferredWidth(86);
		table.getColumnModel().getColumn(3).setPreferredWidth(86);
		table.getColumnModel().getColumn(3).setMinWidth(20);
		table.getColumnModel().getColumn(3).setMaxWidth(1232131210);
		table.getColumnModel().getColumn(4).setPreferredWidth(81);
		table.getColumnModel().getColumn(5).setPreferredWidth(78);
		table.getColumnModel().getColumn(6).setPreferredWidth(78);
		table.getColumnModel().getColumn(7).setPreferredWidth(78);

		JScrollPane scrollPane = new JScrollPane(table);
		scrollPane.setToolTipText("");
		scrollPane.setBounds(10, 142, 998, 240);
		contentPane.add(scrollPane);

		JLabel lblNewLabel_3 = new JLabel("Customer Information: ");
		lblNewLabel_3.setForeground(new Color(0, 0, 0));
		lblNewLabel_3.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel_3.setBounds(372, 392, 208, 25);
		contentPane.add(lblNewLabel_3);

		JLabel lblNewLabel_id = new JLabel("Number Room: ");
		lblNewLabel_id.setForeground(new Color(0, 0, 0));
		lblNewLabel_id.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNewLabel_id.setBounds(41, 452, 117, 20);
		contentPane.add(lblNewLabel_id);

		JLabel lblNewLabel_name = new JLabel("Name Customer:");
		lblNewLabel_name.setForeground(SystemColor.activeCaptionText);
		lblNewLabel_name.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNewLabel_name.setBounds(23, 505, 135, 20);
		contentPane.add(lblNewLabel_name);

		JLabel lblNewLabel_3_3 = new JLabel("Address:");
		lblNewLabel_3_3.setForeground(SystemColor.activeCaptionText);
		lblNewLabel_3_3.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNewLabel_3_3.setBounds(71, 540, 77, 20);
		contentPane.add(lblNewLabel_3_3);

		textField_id = new JTextField();
		textField_id.setBorder(border);
		textField_id.setFont(new Font("Tahoma", Font.PLAIN, 14));
		textField_id.setBounds(155, 445, 135, 35);
		contentPane.add(textField_id);
		textField_id.setColumns(10);

		comboBox_1_quequan = new JComboBox();
		comboBox_1_quequan.setBorder(border);
		ArrayList<Tinh> t = Tinh.getDsTenTinh();
		comboBox_1_quequan.addItem(" ");
		for (Tinh tinh2 : tinh) {
			comboBox_1_quequan.addItem(tinh2.getTenTinh());
		}
		comboBox_1_quequan.setBounds(155, 535, 127, 34);
		contentPane.add(comboBox_1_quequan);

		JLabel lblNewLabel_date = new JLabel("Date:");
		lblNewLabel_date.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNewLabel_date.setBounds(83, 581, 57, 35);
		contentPane.add(lblNewLabel_date);

		textField_name = new JTextField();
		textField_name.setBorder(border);
		textField_name.setFont(new Font("Tahoma", Font.PLAIN, 14));
		textField_name.setBounds(155, 490, 133, 35);
		contentPane.add(textField_name);
		textField_name.setColumns(10);

		textField_date = new JTextField();
		textField_date.setBorder(border);
		textField_date.setFont(new Font("Tahoma", Font.PLAIN, 14));
		textField_date.setBounds(155, 579, 135, 34);
		contentPane.add(textField_date);
		textField_date.setColumns(10);

		JLabel lblNewLabel_3_5 = new JLabel("Gender:");
		lblNewLabel_3_5.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNewLabel_3_5.setBounds(313, 445, 94, 35);
		contentPane.add(lblNewLabel_3_5);

		rdbtnNewRadioButton_nam = new JRadioButton("Nam");
		rdbtnNewRadioButton_nam.setBorder(border);
		rdbtnNewRadioButton_nam.setFont(new Font("Tahoma", Font.PLAIN, 17));
		rdbtnNewRadioButton_nam.setBounds(391, 437, 62, 44);
		contentPane.add(rdbtnNewRadioButton_nam);

		rdbtnNewRadioButton_nu = new JRadioButton("Nữ");
		rdbtnNewRadioButton_nu.setBorder(new EmptyBorder(0, 0, 0, 0));
		rdbtnNewRadioButton_nu.setFont(new Font("Tahoma", Font.PLAIN, 17));
		rdbtnNewRadioButton_nu.setBounds(463, 437, 57, 43);
		contentPane.add(rdbtnNewRadioButton_nu);

		button = new ButtonGroup();
		button.add(rdbtnNewRadioButton_nam);
		button.add(rdbtnNewRadioButton_nu);

		JLabel lblNewLabel_3_6 = new JLabel("Số CMND:");
		lblNewLabel_3_6.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNewLabel_3_6.setBounds(313, 497, 71, 20);
		contentPane.add(lblNewLabel_3_6);

		JLabel lblNewLabel_3_7 = new JLabel("Room:");
		lblNewLabel_3_7.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNewLabel_3_7.setBounds(335, 540, 50, 20);
		contentPane.add(lblNewLabel_3_7);

		JLabel lblNewLabel_3_8 = new JLabel("Price:");
		lblNewLabel_3_8.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNewLabel_3_8.setBounds(344, 588, 40, 20);
		contentPane.add(lblNewLabel_3_8);

		textField_mon1 = new JTextField();
		textField_mon1.setBorder(border);
		textField_mon1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		textField_mon1.setBounds(401, 490, 191, 35);
		contentPane.add(textField_mon1);
		textField_mon1.setColumns(10);

		textField_mon2 = new JTextField();
		textField_mon2.setBorder(border);
		textField_mon2.setFont(new Font("Tahoma", Font.PLAIN, 14));
		textField_mon2.setBounds(395, 533, 197, 35);
		contentPane.add(textField_mon2);
		textField_mon2.setColumns(10);

		textField_tien = new JTextField();
		textField_tien.setBorder(border);
		textField_tien.setFont(new Font("Tahoma", Font.PLAIN, 14));
		textField_tien.setBounds(401, 581, 198, 35);
		contentPane.add(textField_tien);
		textField_tien.setColumns(10);

		JSeparator separator_2 = new JSeparator();
		separator_2.setBounds(41, 643, 953, 2);
		contentPane.add(separator_2);

		JButton btnNewButton_1 = new JButton("Reset");
		btnNewButton_1.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				remove();
				
			}
		});
		btnNewButton_1.setForeground(Color.BLACK);
		btnNewButton_1.setBackground(Color.PINK);
		btnNewButton_1.setBorder(border);
		btnNewButton_1.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnNewButton_1.setBounds(40, 664, 118, 53);
		contentPane.add(btnNewButton_1);
		btnNewButton_1.addActionListener(controller);

		JButton btnNewButton_1_1 = new JButton("Remove");
		btnNewButton_1_1.setForeground(Color.BLACK);
		btnNewButton_1_1.setBackground(Color.PINK);
		btnNewButton_1_1.setBorder(border);
		btnNewButton_1_1.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnNewButton_1_1.setBounds(242, 664, 118, 53);
		contentPane.add(btnNewButton_1_1);
		btnNewButton_1_1.addActionListener(controller);

		JButton btnNewButton_1_2 = new JButton("Edit");
		btnNewButton_1_2.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {
				hienThi();
			}
		});
		btnNewButton_1_2.setBackground(Color.PINK);
		btnNewButton_1_2.setBorder(border);
		btnNewButton_1_2.setForeground(Color.BLACK);
		btnNewButton_1_2.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnNewButton_1_2.setBounds(447, 664, 118, 53);
		contentPane.add(btnNewButton_1_2);
//		btnNewButton_1_2.addActionListener(controller);

		JButton btnNewButton_1_3 = new JButton("Save");
		btnNewButton_1_3.setBackground(Color.PINK);
		btnNewButton_1_3.setBorder(border);
		btnNewButton_1_3.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnNewButton_1_3.setBounds(646, 664, 118, 53);
		contentPane.add(btnNewButton_1_3);
		btnNewButton_1_3.addActionListener(controller);

		JButton btnNewButton_1_4 = new JButton("Cancle");
		btnNewButton_1_4.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {
				System.exit(0);
				
			}
		});
		btnNewButton_1_4.setBackground(Color.PINK);
		btnNewButton_1_4.setBorder(border);
		btnNewButton_1_4.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnNewButton_1_4.setBounds(838, 664, 118, 53);
		contentPane.add(btnNewButton_1_4);
//		btnNewButton_1_4.addActionListener(controller);

		ImageIcon icon4 = new ImageIcon("vku.png");
		Image icon1 = icon4.getImage();
		Image cai = icon1.getScaledInstance(130, 120, Image.SCALE_FAST);
		icon4 = new ImageIcon(cai);

		JSeparator separator_3 = new JSeparator();
		separator_3.setBounds(10, 148, 0, 234);
		contentPane.add(separator_3);

		JSeparator separator_4 = new JSeparator();
		separator_4.setBounds(61, 346, -49, -202);
		contentPane.add(separator_4);

		JSeparator separator_5 = new JSeparator();
		separator_5.setBounds(20, 130, -12, 263);
		contentPane.add(separator_5);

		JSeparator separator_6 = new JSeparator();
		separator_6.setBackground(Color.BLACK);
		separator_6.setForeground(SystemColor.inactiveCaptionText);
		separator_6.setBounds(23, 408, 339, 2);
		contentPane.add(separator_6);

		JSeparator separator_7 = new JSeparator();
		separator_7.setBackground(Color.BLACK);
		separator_7.setForeground(SystemColor.inactiveCaptionText);
		separator_7.setBounds(594, 408, 411, 2);
		contentPane.add(separator_7);
		
		JButton btnNewButton = new JButton("Trang Chủ");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				clickTrangChu();
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 16));
		btnNewButton.setBounds(770, 21, 135, 38);
		contentPane.add(btnNewButton);
		
		Border boder = BorderFactory.createLineBorder(Color.red, 1);
		
		JLabel lblNewLabel_4 = new JLabel("Bảng Giá Phòng");
		lblNewLabel_4.setForeground(Color.RED);
		lblNewLabel_4.setFont(new Font("Tahoma", Font.BOLD, 17));
		lblNewLabel_4.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_4.setBounds(661, 429, 332, 31);
		contentPane.add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("- Phòng A(Phòng đôi) : 500.000đ/đêm");
		lblNewLabel_5.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel_5.setBounds(661, 467, 309, 31);
		contentPane.add(lblNewLabel_5);
		
		JLabel lblNewLabel_5_1 = new JLabel("- Phòng B(Phòng gia đình) : 1.000.000đ/đêm");
		lblNewLabel_5_1.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel_5_1.setBounds(661, 503, 347, 31);
		contentPane.add(lblNewLabel_5_1);
		
		JLabel lblNewLabel_5_2 = new JLabel("- Phòng C(Phòng đơn) : 200.000đ/đêm");
		lblNewLabel_5_2.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel_5_2.setBounds(661, 544, 309, 31);
		contentPane.add(lblNewLabel_5_2);
		
		JLabel lblNewLabel_5_3 = new JLabel("- Phòng D(Phòng Vip) : 1.300.000đ/đêm");
		lblNewLabel_5_3.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel_5_3.setBounds(661, 583, 347, 31);
		contentPane.add(lblNewLabel_5_3);
		
		
		JLabel lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.setBounds(639, 420, 369, 203);
		contentPane.add(lblNewLabel_2);
		lblNewLabel_2.setBorder(boder);
		
		JLabel lblNewLabel = new JLabel("Book Room");
		lblNewLabel.setForeground(new Color(255, 0, 0));
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 22));
		lblNewLabel.setBounds(35, 80, 164, 21);
		contentPane.add(lblNewLabel);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"asdasd", "ádfdsaf", "ádfasdf", "ádfsadf"}));
		comboBox.setBounds(657, 27, 77, 44);
		contentPane.add(comboBox);
//		txtBookRoom.setColumns(10);
//		Border boder = BorderFactory.createLineBorder(Color.white, 1);

		this.setVisible(true);
	}

	public void remove() {
		textField_timkiem.setText("");
		textField_id.setText("");
		textField_name.setText("");
		textField_date.setText("");
		textField_mon1.setText("");
		textField_mon2.setText("");
		textField_tien.setText("");
	}
	
	public void addStudents(thiSinh thisinh) {
		DefaultTableModel model = (DefaultTableModel) table.getModel();
		if (!this.model.kiemtrathisinhtontai(thisinh)) {
			this.model.insert(thisinh);
			model.addRow(new Object[] { thisinh.getMaThiSinh() + "", thisinh.getTenThiSinh() + "",
					thisinh.getQueQuan().getTenTinh(),thisinh.getNgaySinh().getDate() + "/" + (thisinh.getNgaySinh().getMonth() + 1) + "/"
							+ (thisinh.getNgaySinh().getYear() + 1899),
					(thisinh.isGioiTinh() ? "Nam" : "Nữ")
					  ,
					thisinh.getDiemMon1() + "", thisinh.getDiemMon2() + "", thisinh.getDiemMon3() + "" });
		} else {
			this.model.update(thisinh);
			int sodong = model.getRowCount();
			for (int i = 0; i < sodong; i++) {
				String id = model.getValueAt(i, 0) + "";
				if (id.equals(thisinh.getMaThiSinh() + "")) {
					model.setValueAt(thisinh.getMaThiSinh() + "", i, 0);
					model.setValueAt(thisinh.getTenThiSinh() + "", i, 1);
					model.setValueAt(thisinh.getQueQuan().getTenTinh() + "", i, 2);
					model.setValueAt(thisinh.isGioiTinh() ? "Nam" : "Nữ", i, 3);
					model.setValueAt(thisinh.getNgaySinh().getDate() + "/" + (thisinh.getNgaySinh().getMonth() + 1)
							+ "/" + (thisinh.getNgaySinh().getYear() + 1899), i, 4);
					model.setValueAt(thisinh.getDiemMon1() + "", i, 6);
					model.setValueAt(thisinh.getDiemMon2() + "", i, 7);
				}
			}
		}
	}

	public thiSinh getThiSinhDangChon() {
		DefaultTableModel model = (DefaultTableModel) table.getModel();
		int i_row = table.getSelectedRow();

		// lấy thông tin thí sinh

		int maThiSinh = Integer.valueOf(model.getValueAt(i_row, 0) + "");

		String tenThiSinh = model.getValueAt(i_row, 1) + "";

		Tinh tinh = Tinh.getTinhByTen(model.getValueAt(i_row, 2) + "");

		String ngaysinh_1 = model.getValueAt(i_row, 3) + "";
		@SuppressWarnings("deprecation")
		Date ngaySinh = new Date(ngaysinh_1);

		String testGioiTinh = model.getValueAt(i_row, 4) + "";
		Boolean gioitinh = testGioiTinh.equals("Nam");

		float diemMon1 = Float.valueOf(model.getValueAt(i_row, 5) + "");
		float diemMon2 = Float.valueOf(model.getValueAt(i_row, 6) + "");
		float diemMon3 = Float.valueOf(model.getValueAt(i_row, 7) + "");

		thiSinh ts = new thiSinh(maThiSinh, tenThiSinh, tinh, ngaySinh, gioitinh, diemMon1, diemMon2, diemMon3);
		return ts;
	}

	public void hienThi() {
		thiSinh thisinh1 = getThiSinhDangChon();

		this.textField_id.setText(thisinh1.getMaThiSinh() + "");
		this.textField_name.setText(thisinh1.getTenThiSinh() + "");
		this.comboBox_1_quequan.setSelectedItem(thisinh1.getQueQuan().getTenTinh());
		this.textField_date.setText(thisinh1.getNgaySinh().getDate() + "/" + thisinh1.getNgaySinh().getMonth() + "/"
				+ thisinh1.getNgaySinh().getYear());
		this.button.setSelected(null, rootPaneCheckingEnabled);
		this.textField_mon1.setText(thisinh1.getDiemMon1() + "");
		this.textField_mon2.setText(thisinh1.getDiemMon2() + "");
		this.textField_tien.setText(thisinh1.getDiemMon3() + "");

	}

	public void removenho() {
		DefaultTableModel model = (DefaultTableModel) table.getModel();
		int i_row = table.getSelectedRow();
		int luaChon = JOptionPane.showConfirmDialog(this, "Mi có muốn xóa không ? ");
		if (luaChon == JOptionPane.YES_OPTION) {
			model.removeRow(i_row);
		}
	}
	public void clickTrangChu() {
		new TrangChu().setVisible(true);
		this.dispose();
	}

	public void save() {
		int maThiSinh = Integer.valueOf(this.textField_id.getText());
		String tenThiSinh = this.textField_name.getText();
		int queQuan = this.comboBox_1_quequan.getSelectedIndex();
		
		Tinh t = Tinh.getTinhById(queQuan-1);
		Date ngaySinh = new Date(this.textField_date.getText());
		Boolean gioitinh = true;
		
		if (this.rdbtnNewRadioButton_nam.isSelected()) {
			gioitinh = true;
		} else if (this.rdbtnNewRadioButton_nu.isSelected()) {
			gioitinh = false;
		}
		float diemMon1 = Float.valueOf(this.textField_mon1.getText());
		float diemMon2 = Float.valueOf(this.textField_mon2.getText());
		float diemMon3 = Float.valueOf(this.textField_tien.getText());

		thiSinh thisinh = new thiSinh(maThiSinh, tenThiSinh, t, ngaySinh, gioitinh, diemMon1, diemMon2, diemMon3);
		this.addStudents(thisinh);
	}
	public void timkiem() {
		String idStudentSearch = this.textField_timkiem.getText();
		DefaultTableModel model_table = (DefaultTableModel) table.getModel();
		int row = model_table.getRowCount();
		
		Set<Integer> idCuaThiSinhCanXoa = new TreeSet<Integer>();
		
		if (idStudentSearch.length() > 0) {
			for (int i = 0; i < row; i++) {
				String id = model_table.getValueAt(i, 0) + "";
				if (!id.equals(idStudentSearch)) {
					idCuaThiSinhCanXoa.add(Integer.valueOf(id));
				}
			}
		}
		for (Integer idCanXoa : idCuaThiSinhCanXoa) {
			System.out.println(idCanXoa);
			int soLuongDong = model_table.getRowCount();
			for (int i = 0; i < soLuongDong; i++) {
				String idTrongTable = model_table.getValueAt(i, 0) + "";
				System.out.println("idTrongTable: " + idTrongTable);
				if (idTrongTable.equals(idCanXoa.toString())) {
					System.out.println("Đã xóa: " + i);
					try {
						model_table.removeRow(i);
					} catch (Exception e) {
						e.printStackTrace();
					}
					break;
				}
			}
		}
		
	}
}
