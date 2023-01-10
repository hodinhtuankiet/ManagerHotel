package view;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JSeparator;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JSpinner;
import javax.swing.JToggleButton;
import javax.swing.JToolBar;
import javax.swing.JSplitPane;
import java.awt.Component;

import javax.swing.BorderFactory;
import javax.swing.Box;
import java.awt.Dimension;
import javax.swing.border.BevelBorder;
import javax.swing.border.Border;
import javax.swing.border.CompoundBorder;
import javax.swing.border.LineBorder;
import javax.swing.border.MatteBorder;
import javax.swing.border.TitledBorder;
import javax.swing.JTextField;
import java.awt.SystemColor;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import model.thiSinh;

import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.util.Date;
import java.awt.event.ActionEvent;

public class QuanLiKhachSan extends JFrame {

	private JPanel contentPane;
	private JTextField textField2;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField4;
	private JTextField textField_7;
	private JTable table;
	private JTextField txtThanhTon;
	private JTextField textField_8;
	private JTextField textField_6;
	private JTextField textField_thenganhang;
	private JTextField textField5;
	private JTextField textField_23;
	private JTextField textField_hinhthucthanhtoan;
	private JTextField textField3;
	private JTextField textField_tiendatcoc;
	private JTextField txtTrPhng;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					QuanLiKhachSan frame = new QuanLiKhachSan();
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
	public QuanLiKhachSan() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1319, 743);
		contentPane = new JPanel();
		setLocationRelativeTo(null);
		contentPane.setBackground(new Color(63, 186, 192));
		contentPane.setForeground(new Color(128, 0, 0));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JSeparator separator = new JSeparator();
		separator.setBackground(Color.DARK_GRAY);
		separator.setBounds(0, 53, 875, 8);
		contentPane.add(separator);
		
		Border b = BorderFactory.createLineBorder(Color.blue, 2);
		
		JLabel lblNewLabel_2 = new JLabel("Ngày CheckIn:");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblNewLabel_2.setBounds(68, 90, 135, 25);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_2_1 = new JLabel("Tên Khách Hàng:");
		lblNewLabel_2_1.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblNewLabel_2_1.setBounds(52, 125, 135, 25);
		contentPane.add(lblNewLabel_2_1);
		
		JLabel lblNewLabel_2_2 = new JLabel("Số CMND:");
		lblNewLabel_2_2.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblNewLabel_2_2.setBounds(96, 160, 82, 25);
		contentPane.add(lblNewLabel_2_2);
		
		JLabel lblNewLabel_2_3 = new JLabel("SĐT:");
		lblNewLabel_2_3.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblNewLabel_2_3.setBounds(126, 195, 42, 25);
		contentPane.add(lblNewLabel_2_3);
		
		JLabel lblNewLabel_2_4 = new JLabel("Quê Quán,Địa Chỉ:");
		lblNewLabel_2_4.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblNewLabel_2_4.setBounds(42, 230, 135, 25);
		contentPane.add(lblNewLabel_2_4);
		
		JLabel lblNewLabel_2_5 = new JLabel("Email:");
		lblNewLabel_2_5.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblNewLabel_2_5.setBounds(111, 265, 50, 25);
		contentPane.add(lblNewLabel_2_5);
		
		JLabel lblNewLabel_2_5_1 = new JLabel("Quốc Tịch:");
		lblNewLabel_2_5_1.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblNewLabel_2_5_1.setBounds(84, 297, 135, 25);
		contentPane.add(lblNewLabel_2_5_1);
		
		textField2 = new JTextField();
		textField2.setBounds(168, 93, 217, 21);
		contentPane.add(textField2);
		textField2.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(168, 125, 217, 21);
		contentPane.add(textField_1);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(168, 160, 217, 21);
		contentPane.add(textField_2);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(168, 195, 217, 21);
		contentPane.add(textField_3);
		
		textField_4 = new JTextField();
		textField_4.setColumns(10);
		textField_4.setBounds(169, 234, 217, 21);
		contentPane.add(textField_4);
		
		textField_5 = new JTextField();
		textField_5.setColumns(10);
		textField_5.setBounds(168, 268, 217, 21);
		contentPane.add(textField_5);
		
		textField4 = new JTextField();
		textField4.setColumns(10);
		textField4.setBounds(168, 300, 217, 21);
		contentPane.add(textField4);
		
		JLabel lblNewLabel_2_1_1 = new JLabel("Khách Hàng:");
		lblNewLabel_2_1_1.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblNewLabel_2_1_1.setBounds(395, 125, 135, 25);
		contentPane.add(lblNewLabel_2_1_1);
		
		JLabel lblNewLabel_2_1_2 = new JLabel("Giới Tính:");
		lblNewLabel_2_1_2.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblNewLabel_2_1_2.setBounds(441, 160, 135, 25);
		contentPane.add(lblNewLabel_2_1_2);
		
		JLabel lblNewLabel_2_1_3 = new JLabel("Ngày Sinh");
		lblNewLabel_2_1_3.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblNewLabel_2_1_3.setBounds(441, 195, 135, 25);
		contentPane.add(lblNewLabel_2_1_3);
		
		JLabel lblNewLabel_2_1_4 = new JLabel("Phí Phụ Thu:");
		lblNewLabel_2_1_4.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblNewLabel_2_1_4.setBounds(441, 230, 135, 25);
		contentPane.add(lblNewLabel_2_1_4);
		
		JLabel lblNewLabel_2_1_5 = new JLabel("Giảm Giá: ");
		lblNewLabel_2_1_5.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblNewLabel_2_1_5.setBounds(441, 265, 135, 25);
		contentPane.add(lblNewLabel_2_1_5);
		
		JLabel lblNewLabel_2_1_6 = new JLabel("Thanh Toán:");
		lblNewLabel_2_1_6.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblNewLabel_2_1_6.setBounds(441, 297, 135, 25);
		contentPane.add(lblNewLabel_2_1_6);
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setBounds(25, 77, 550, 274);
		contentPane.add(lblNewLabel_1);
		lblNewLabel_1.setBorder(b);
		
		textField_7 = new JTextField();
		textField_7.setBackground(Color.WHITE);
		textField_7.setBounds(0, 361, 892, 16);
		contentPane.add(textField_7);
		textField_7.setColumns(10);
		
		JScrollPane scrollPane = new JScrollPane((Component) null);
		scrollPane.setToolTipText("");
		scrollPane.setBounds(25, 387, 852, 170);
		contentPane.add(scrollPane);
		
		table = new JTable();
		table.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"Number Room", "Name Customer", "Address", "Date", "Gender", "Day Check in", "Room", "Price"
			}
		));
		scrollPane.setViewportView(table);
		Border b1 = BorderFactory.createLineBorder(Color.WHITE, 2);
		JPanel panel = new JPanel();
		panel.setBounds(895, 10, 410, 686);
		contentPane.add(panel);
		panel.setLayout(null);
		panel.setBorder(b1);
		
		txtThanhTon = new JTextField();
		txtThanhTon.setBounds(0, 0, 410, 34);
		panel.add(txtThanhTon);
		txtThanhTon.setFont(new Font("Tahoma", Font.BOLD, 18));
		txtThanhTon.setBackground(new Color(75, 0, 130));
		txtThanhTon.setForeground(new Color(255, 255, 255));
		txtThanhTon.setText("Thanh Toán");
		txtThanhTon.setColumns(10);
		
		textField_8 = new JTextField();
		textField_8.setBounds(10, 530, 380, 127);
		panel.add(textField_8);
		textField_8.setColumns(10);
		
		JLabel lblNewLabel_4 = new JLabel("Ghi Chú:");
		lblNewLabel_4.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblNewLabel_4.setForeground(new Color(0, 0, 0));
		lblNewLabel_4.setBounds(10, 495, 86, 25);
		panel.add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("Hình thức Thanh Toán:");
		lblNewLabel_5.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblNewLabel_5.setBounds(209, 101, 160, 31);
		panel.add(lblNewLabel_5);
		
		JLabel lblNewLabel_5_1 = new JLabel("Số ngày thuê:");
		lblNewLabel_5_1.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblNewLabel_5_1.setBounds(28, 118, 99, 31);
		panel.add(lblNewLabel_5_1);
		
		JLabel lblNewLabel_5_1_1 = new JLabel("Tiền Khách Đưa:");
		lblNewLabel_5_1_1.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblNewLabel_5_1_1.setBounds(31, 194, 118, 31);
		panel.add(lblNewLabel_5_1_1);
		
		JLabel lblNewLabel_5_1_2 = new JLabel("Trả Lại:");
		lblNewLabel_5_1_2.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblNewLabel_5_1_2.setBounds(28, 276, 160, 31);
		panel.add(lblNewLabel_5_1_2);
		
		JLabel lblNewLabel_5_1_3 = new JLabel("Ngày Trả Phòng");
		lblNewLabel_5_1_3.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblNewLabel_5_1_3.setBounds(39, 44, 110, 31);
		panel.add(lblNewLabel_5_1_3);
		
		JLabel lblNewLabel_5_1_4 = new JLabel("Hình thức Thanh Toán:");
		lblNewLabel_5_1_4.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblNewLabel_5_1_4.setBounds(209, 167, 160, 31);
		panel.add(lblNewLabel_5_1_4);
		
		JLabel lblNewLabel_5_1_5 = new JLabel("Tiền Đặt Cọc:");
		lblNewLabel_5_1_5.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblNewLabel_5_1_5.setBounds(209, 230, 110, 31);
		panel.add(lblNewLabel_5_1_5);
		
		textField_6 = new JTextField();
		textField_6.setBounds(28, 79, 140, 25);
		panel.add(textField_6);
		textField_6.setColumns(10);
		
		textField_thenganhang = new JTextField();
		textField_thenganhang.setColumns(10);
		textField_thenganhang.setBounds(28, 159, 140, 25);
		panel.add(textField_thenganhang);
		
		textField5 = new JTextField();
		textField5.setColumns(10);
		textField5.setBounds(28, 234, 140, 25);
		panel.add(textField5);
		
		textField_23 = new JTextField();
		textField_23.setColumns(10);
		textField_23.setBounds(28, 317, 140, 25);
		panel.add(textField_23);
		
		textField_hinhthucthanhtoan = new JTextField();
		textField_hinhthucthanhtoan.setColumns(10);
		textField_hinhthucthanhtoan.setBounds(209, 197, 140, 25);
		panel.add(textField_hinhthucthanhtoan);
		
		textField3 = new JTextField();
		textField3.setColumns(10);
		textField3.setBounds(209, 142, 140, 25);
		panel.add(textField3);
		
		textField_tiendatcoc = new JTextField();
		textField_tiendatcoc.setColumns(10);
		textField_tiendatcoc.setBounds(209, 269, 140, 25);
		panel.add(textField_tiendatcoc);
		
		JButton btnNewButton = new JButton("Payment");
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnNewButton.setBounds(209, 422, 149, 41);
		panel.add(btnNewButton);
		
		JButton btnReset = new JButton("Reset");
		btnReset.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField_hinhthucthanhtoan.setText("");
				textField3.setText("");
				textField_6.setText("");
				textField_thenganhang.setText("");
				textField_tiendatcoc.setText("");
				textField5.setText("");
				textField_23.setText("");
			}
		});
		btnReset.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnReset.setBounds(39, 422, 149, 41);
		panel.add(btnReset);
		
		txtTrPhng = new JTextField();
		txtTrPhng.setText("Trả Phòng:");
		txtTrPhng.setForeground(Color.WHITE);
		txtTrPhng.setFont(new Font("Tahoma", Font.BOLD, 18));
		txtTrPhng.setColumns(10);
		txtTrPhng.setBackground(new Color(75, 0, 130));
		txtTrPhng.setBounds(25, 10, 850, 33);
		contentPane.add(txtTrPhng);
		
		JButton btnNewButton_1 = new JButton("Trang Chủ");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new TrangChu().setVisible(true);
				dispose();
			}
		});
		btnNewButton_1.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnNewButton_1.setBounds(645, 618, 135, 48);
		contentPane.add(btnNewButton_1);
		
		JButton btnNewButton_1_1 = new JButton("In Bill");
		btnNewButton_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				inbill();
				
			}
		});
		btnNewButton_1_1.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnNewButton_1_1.setBounds(363, 618, 135, 48);
		contentPane.add(btnNewButton_1_1);
		
		JButton btnNewButton_2 = new JButton("Edit");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				hienthi();
				
			}

		});
		btnNewButton_2.setFont(new Font("Tahoma", Font.PLAIN, 17));
		btnNewButton_2.setBounds(95, 618, 124, 48);
		contentPane.add(btnNewButton_2);
		
		JLabel lblNewLabel_5_2 = new JLabel("- Phòng A(Phòng đôi) : ");
		lblNewLabel_5_2.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_5_2.setBounds(621, 102, 169, 13);
		contentPane.add(lblNewLabel_5_2);
		
		JLabel lblNewLabel_5_1_6 = new JLabel("- Phòng B(Phòng gia đình) : ");
		lblNewLabel_5_1_6.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_5_1_6.setBounds(600, 156, 226, 31);
		contentPane.add(lblNewLabel_5_1_6);
		
		JLabel lblNewLabel = new JLabel("500.000đ/đêm");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel.setBounds(631, 130, 109, 13);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_3 = new JLabel("1.000.000đ/đêm");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_3.setBounds(621, 190, 135, 33);
		contentPane.add(lblNewLabel_3);
		
		JLabel lblNewLabel_5_2_1 = new JLabel("- Phòng C(Phòng đơn) : ");
		lblNewLabel_5_2_1.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel_5_2_1.setBounds(608, 224, 198, 31);
		contentPane.add(lblNewLabel_5_2_1);
		
		JLabel lblNewLabel_6 = new JLabel("200.000đ/đêm");
		lblNewLabel_6.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_6.setBounds(621, 250, 135, 29);
		contentPane.add(lblNewLabel_6);
		
		JLabel lblNewLabel_5_3 = new JLabel("- Phòng D(Phòng Vip) : ");
		lblNewLabel_5_3.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel_5_3.setBounds(608, 277, 182, 31);
		contentPane.add(lblNewLabel_5_3);
		
		JLabel lblNewLabel_7 = new JLabel("1.300.000đ/đêm");
		lblNewLabel_7.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_7.setBounds(618, 308, 120, 25);
		contentPane.add(lblNewLabel_7);
		
		JSeparator separator_1 = new JSeparator();
		separator_1.setBounds(42, 593, 803, 8);
		contentPane.add(separator_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("");
		lblNewLabel_1_1.setBounds(596, 77, 279, 274);
		contentPane.add(lblNewLabel_1_1);
		lblNewLabel_1_1.setBorder(b);
	}
	private void inbill() {
		inBill b = new  inBill(textField_1.getText(), textField2.getText(), textField3.getText(), textField4.getText(), textField5.getText(), textField_23.getText());
		b.setVisible(true);
	}
	public thiSinh getThiSinhDangChon() {
		DefaultTableModel model = (DefaultTableModel) table.getModel();
		int i_row = table.getSelectedRow();

		// lấy thông tin thí sinh

		int maThiSinh = Integer.valueOf(model.getValueAt(i_row, 0) + "");

		String tenThiSinh = model.getValueAt(i_row, 1) + "";

		String tinh = model.getValueAt(i_row, 2) + "";

		String ngaysinh_1 = model.getValueAt(i_row, 3) + "";
		@SuppressWarnings("deprecation")
		Date ngaySinh = new Date(ngaysinh_1);

		String testGioiTinh = model.getValueAt(i_row, 4) + "";

		String ngaysinh_2 = model.getValueAt(i_row, 5) + "";
		@SuppressWarnings("deprecation")
		Date ngay_checkin = new Date(ngaysinh_2);
		
		float diemMon2 = Float.valueOf(model.getValueAt(i_row, 6) + "");
		float diemMon3 = Float.valueOf(model.getValueAt(i_row, 7) + "");

		thiSinh ts = new thiSinh(maThiSinh, tenThiSinh, null, ngaySinh, rootPaneCheckingEnabled, diemMon3, diemMon2, diemMon3);
		return ts;
	}
	private void hienthi() {
		
		
	}
}
