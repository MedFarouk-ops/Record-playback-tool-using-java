package com.qatester.services;

import java.awt.Color;
import java.awt.GraphicsDevice;
import java.awt.GraphicsEnvironment;
import java.awt.Rectangle;
import java.awt.Robot;
import java.awt.image.BufferedImage;
import java.util.ArrayList;
import java.util.HashMap;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class QaScreenActions {

	Robot MYROBOT;
	Color SCREEN[][];
	int SCREEN_X;
	int SCREEN_Y;
	int WINDOW_X;
	int WINDOW_Y;
	int TYPE_DELAY = 0;
	int MOUSE_DELAY = 1;
	int SKILL = 0;
	int X, Y;
	int lastX, lastY;
	int savedX, savedY;
	int RED, GREEN, BLUE;
	Color PIX_CLOSE_ACTIVE_OFF_MOUSE;
	Color PIX_CLOSE_ACTIVE_ON_MOUSE;
	HashMap<Character, Integer> KEYMAP;
	ArrayList<Integer> randKeys;
	GraphicsEnvironment grEnv;
	GraphicsDevice grDevice;
	JPanel drawPanel;
	BufferedImage bufImg;
	Rectangle rect;

	public static void main(String[] args) {
		
		QaScreenActions qaScreenAction =  new QaScreenActions();
		qaScreenAction.initialize();
		qaScreenAction.gotoxy(230, 364);
		qaScreenAction.gotoxy(234, 366);
		qaScreenAction.gotoxy(239, 366);
		qaScreenAction.gotoxy(245, 366);
		qaScreenAction.gotoxy(254, 366);
		qaScreenAction.gotoxy(264, 368);
		qaScreenAction.gotoxy(277, 370);
		qaScreenAction.gotoxy(288, 370);
		qaScreenAction.gotoxy(301, 373);
		qaScreenAction.gotoxy(314, 375);
		qaScreenAction.gotoxy(328, 377);
		qaScreenAction.gotoxy(341, 379);
		qaScreenAction.gotoxy(360, 382);
		qaScreenAction.gotoxy(383, 385);
		qaScreenAction.gotoxy(406, 388);
		qaScreenAction.gotoxy(436, 394);
		qaScreenAction.gotoxy(469, 397);
		qaScreenAction.gotoxy(511, 401);
		qaScreenAction.gotoxy(551, 408);
		qaScreenAction.gotoxy(587, 412);
		qaScreenAction.gotoxy(628, 415);
		qaScreenAction.gotoxy(666, 415);
		qaScreenAction.gotoxy(702, 415);
		qaScreenAction.gotoxy(742, 415);
		qaScreenAction.gotoxy(778, 415);
		qaScreenAction.gotoxy(813, 415);
		qaScreenAction.gotoxy(846, 415);
		qaScreenAction.gotoxy(876, 415);
		qaScreenAction.gotoxy(903, 415);
		qaScreenAction.gotoxy(927, 415);
		qaScreenAction.gotoxy(955, 415);
		qaScreenAction.gotoxy(971, 415);
		qaScreenAction.gotoxy(990, 415);
		qaScreenAction.gotoxy(1007, 415);
		qaScreenAction.gotoxy(1023, 415);
		qaScreenAction.gotoxy(1038, 415);
		qaScreenAction.gotoxy(1054, 415);
		qaScreenAction.gotoxy(1069, 415);
		qaScreenAction.gotoxy(1083, 415);
		qaScreenAction.gotoxy(1095, 415);
		qaScreenAction.gotoxy(1106, 415);
		qaScreenAction.gotoxy(1118, 415);
		qaScreenAction.gotoxy(1127, 413);
		qaScreenAction.gotoxy(1138, 410);
		qaScreenAction.gotoxy(1149, 407);
		qaScreenAction.gotoxy(1156, 404);
		qaScreenAction.gotoxy(1165, 401);
		qaScreenAction.gotoxy(1172, 398);
		qaScreenAction.gotoxy(1181, 395);
		qaScreenAction.gotoxy(1190, 393);
		qaScreenAction.gotoxy(1195, 391);
		qaScreenAction.gotoxy(1206, 389);
		qaScreenAction.gotoxy(1215, 387);
		qaScreenAction.gotoxy(1223, 387);
		qaScreenAction.gotoxy(1231, 385);
		qaScreenAction.gotoxy(1239, 383);
		qaScreenAction.gotoxy(1247, 383);
		qaScreenAction.gotoxy(1255, 381);
		qaScreenAction.gotoxy(1261, 381);
		qaScreenAction.gotoxy(1267, 379);
		qaScreenAction.gotoxy(1272, 377);
		qaScreenAction.gotoxy(1277, 375);
		qaScreenAction.gotoxy(1281, 375);
		qaScreenAction.gotoxy(1286, 371);
		qaScreenAction.gotoxy(1289, 370);
		qaScreenAction.gotoxy(1294, 368);
		qaScreenAction.gotoxy(1297, 366);
		qaScreenAction.gotoxy(1303, 364);
		qaScreenAction.gotoxy(1306, 362);
		qaScreenAction.gotoxy(1312, 361);
		qaScreenAction.gotoxy(1315, 359);
		qaScreenAction.gotoxy(1319, 358);
		qaScreenAction.gotoxy(1324, 357);
		qaScreenAction.gotoxy(1328, 356);
		qaScreenAction.gotoxy(1329, 356);
		qaScreenAction.gotoxy(1332, 354);
		qaScreenAction.gotoxy(1333, 354);
		qaScreenAction.gotoxy(1334, 354);
		qaScreenAction.gotoxy(1335, 354);
		qaScreenAction.gotoxy(1335, 352);
		qaScreenAction.gotoxy(1334, 350);
		qaScreenAction.gotoxy(1328, 346);
		qaScreenAction.gotoxy(1321, 345);
		qaScreenAction.gotoxy(1315, 342);
		qaScreenAction.gotoxy(1312, 342);
		qaScreenAction.gotoxy(1308, 342);
		qaScreenAction.gotoxy(1306, 341);
		qaScreenAction.gotoxy(1305, 341);
		qaScreenAction.gotoxy(1304, 341);
		qaScreenAction.gotoxy(1302, 341);
		qaScreenAction.gotoxy(1299, 341);
		qaScreenAction.gotoxy(1298, 341);
		qaScreenAction.gotoxy(1297, 341);
		qaScreenAction.gotoxy(1294, 341);
		qaScreenAction.gotoxy(1293, 341);
		qaScreenAction.gotoxy(1290, 341);
		qaScreenAction.gotoxy(1288, 341);
		qaScreenAction.gotoxy(1285, 341);
		qaScreenAction.gotoxy(1282, 341);
		qaScreenAction.gotoxy(1281, 341);
		qaScreenAction.gotoxy(1278, 341);
		qaScreenAction.gotoxy(1277, 341);
		qaScreenAction.gotoxy(1276, 341);
		qaScreenAction.gotoxy(1274, 341);
		qaScreenAction.gotoxy(1273, 341);
		qaScreenAction.gotoxy(1270, 341);
		qaScreenAction.gotoxy(1267, 341);
		qaScreenAction.gotoxy(1266, 341);
		qaScreenAction.gotoxy(1263, 341);
		qaScreenAction.gotoxy(1260, 341);
		qaScreenAction.gotoxy(1258, 341);
		qaScreenAction.gotoxy(1256, 341);
		qaScreenAction.gotoxy(1254, 341);
		qaScreenAction.gotoxy(1251, 341);
		qaScreenAction.gotoxy(1250, 341);
		qaScreenAction.gotoxy(1247, 341);
		qaScreenAction.gotoxy(1244, 341);
		qaScreenAction.gotoxy(1243, 341);
		qaScreenAction.gotoxy(1240, 341);
		qaScreenAction.gotoxy(1238, 341);
		qaScreenAction.gotoxy(1237, 341);
		qaScreenAction.gotoxy(1236, 341);
		qaScreenAction.gotoxy(1235, 341);
		qaScreenAction.gotoxy(1233, 341);
		qaScreenAction.gotoxy(1232, 341);
		qaScreenAction.gotoxy(1231, 341);
		qaScreenAction.gotoxy(1228, 341);
		qaScreenAction.gotoxy(1226, 341);
		qaScreenAction.gotoxy(1225, 339);
		qaScreenAction.gotoxy(1224, 339);
		qaScreenAction.clickNhold(true);
		qaScreenAction.gotoxy(1223, 341);
		qaScreenAction.clickNhold(true);
		qaScreenAction.gotoxy(1224, 344);
		qaScreenAction.clickNhold(true);
		qaScreenAction.gotoxy(1225, 345);
		qaScreenAction.clickNhold(true);
		qaScreenAction.gotoxy(1226, 347);
		qaScreenAction.clickNhold(true);
		qaScreenAction.gotoxy(1227, 349);
		qaScreenAction.clickNhold(true);
		qaScreenAction.gotoxy(1231, 352);
		qaScreenAction.clickNhold(true);
		qaScreenAction.gotoxy(1232, 355);
		qaScreenAction.clickNhold(true);
		qaScreenAction.gotoxy(1237, 358);
		qaScreenAction.clickNhold(true);
		qaScreenAction.gotoxy(1238, 360);
		qaScreenAction.clickNhold(true);
		qaScreenAction.gotoxy(1243, 364);
		qaScreenAction.clickNhold(true);
		qaScreenAction.gotoxy(1244, 366);
		qaScreenAction.clickNhold(true);
		qaScreenAction.gotoxy(1246, 367);
		qaScreenAction.clickNhold(true);
		qaScreenAction.gotoxy(1247, 368);
		qaScreenAction.clickNhold(true);
		qaScreenAction.gotoxy(1250, 370);
		qaScreenAction.clickNhold(true);
		qaScreenAction.gotoxy(1251, 371);
		qaScreenAction.clickNhold(true);
		qaScreenAction.gotoxy(1252, 373);
		qaScreenAction.clickNhold(true);
		qaScreenAction.gotoxy(1253, 376);
		qaScreenAction.clickNhold(true);
		qaScreenAction.gotoxy(1254, 376);
		qaScreenAction.clickNhold(true);
		qaScreenAction.gotoxy(1256, 379);
		qaScreenAction.clickNhold(true);
		qaScreenAction.gotoxy(1256, 380);
		qaScreenAction.clickNhold(true);
		qaScreenAction.gotoxy(1258, 383);
		qaScreenAction.clickNhold(true);
		qaScreenAction.gotoxy(1261, 387);
		qaScreenAction.clickNhold(true);
		qaScreenAction.gotoxy(1264, 392);
		qaScreenAction.clickNhold(true);
		qaScreenAction.gotoxy(1267, 394);
		qaScreenAction.clickNhold(true);
		qaScreenAction.gotoxy(1269, 399);
		qaScreenAction.clickNhold(true);
		qaScreenAction.gotoxy(1274, 404);
		qaScreenAction.clickNhold(true);
		qaScreenAction.gotoxy(1276, 405);
		qaScreenAction.clickNhold(true);
		qaScreenAction.gotoxy(1278, 409);
		qaScreenAction.clickNhold(true);
		qaScreenAction.gotoxy(1281, 412);
		qaScreenAction.clickNhold(true);
		qaScreenAction.gotoxy(1283, 414);
		qaScreenAction.clickNhold(true);
		qaScreenAction.gotoxy(1284, 416);
		qaScreenAction.clickNhold(true);
		qaScreenAction.gotoxy(1285, 418);
		qaScreenAction.clickNhold(true);
		qaScreenAction.gotoxy(1287, 420);
		qaScreenAction.clickNhold(true);
		qaScreenAction.gotoxy(1287, 422);
		qaScreenAction.clickNhold(true);
		qaScreenAction.gotoxy(1287, 422);
		qaScreenAction.clickNhold(true);
		qaScreenAction.gotoxy(1288, 423);
		qaScreenAction.clickNhold(true);
		qaScreenAction.gotoxy(1289, 424);
		qaScreenAction.clickNhold(true);
		qaScreenAction.gotoxy(1289, 426);
		qaScreenAction.clickNhold(true);
		qaScreenAction.gotoxy(1289, 429);
		qaScreenAction.clickNhold(true);
		qaScreenAction.gotoxy(1290, 430);
		qaScreenAction.clickNhold(true);
		qaScreenAction.gotoxy(1290, 431);
		qaScreenAction.clickNhold(true);
		qaScreenAction.gotoxy(1291, 433);
		qaScreenAction.clickNhold(true);
		qaScreenAction.gotoxy(1292, 436);
		qaScreenAction.clickNhold(true);
		qaScreenAction.gotoxy(1293, 439);
		qaScreenAction.clickNhold(true);
		qaScreenAction.gotoxy(1294, 441);
		qaScreenAction.clickNhold(true);
		qaScreenAction.gotoxy(1295, 442);
		qaScreenAction.clickNhold(true);
		qaScreenAction.gotoxy(1295, 444);
		qaScreenAction.clickNhold(true);
		qaScreenAction.gotoxy(1296, 445);
		qaScreenAction.clickNhold(true);
		qaScreenAction.gotoxy(1296, 446);
		qaScreenAction.clickNhold(true);
		qaScreenAction.gotoxy(1296, 447);
		qaScreenAction.clickNhold(true);
		qaScreenAction.gotoxy(1298, 449);
		qaScreenAction.clickNhold(true);
		qaScreenAction.gotoxy(1298, 450);
		qaScreenAction.clickNhold(true);
		qaScreenAction.gotoxy(1298, 451);
		qaScreenAction.clickNhold(false);
		qaScreenAction.gotoxy(1298, 451);
		qaScreenAction.gotoxy(1293, 451);
		qaScreenAction.gotoxy(1291, 451);
		qaScreenAction.gotoxy(1284, 451);
		qaScreenAction.gotoxy(1280, 451);
		qaScreenAction.gotoxy(1274, 449);
		qaScreenAction.gotoxy(1264, 449);
		qaScreenAction.gotoxy(1254, 445);
		qaScreenAction.gotoxy(1244, 442);
		qaScreenAction.gotoxy(1234, 440);
		qaScreenAction.gotoxy(1220, 435);
		qaScreenAction.gotoxy(1206, 431);
		qaScreenAction.gotoxy(1186, 425);
		qaScreenAction.gotoxy(1157, 419);
		qaScreenAction.gotoxy(1127, 409);
		qaScreenAction.gotoxy(1098, 406);
		qaScreenAction.gotoxy(1064, 399);
		qaScreenAction.gotoxy(1028, 388);
		qaScreenAction.gotoxy(1000, 385);
		qaScreenAction.gotoxy(966, 381);
		qaScreenAction.gotoxy(935, 375);
		qaScreenAction.gotoxy(909, 372);
		qaScreenAction.gotoxy(883, 369);
		qaScreenAction.gotoxy(857, 366);
		qaScreenAction.gotoxy(839, 363);
		qaScreenAction.gotoxy(819, 360);
		qaScreenAction.gotoxy(797, 355);
		qaScreenAction.gotoxy(779, 352);
		qaScreenAction.gotoxy(763, 352);
		qaScreenAction.gotoxy(745, 349);
		qaScreenAction.gotoxy(734, 347);
		qaScreenAction.gotoxy(721, 345);
		qaScreenAction.gotoxy(710, 345);
		qaScreenAction.gotoxy(703, 343);
		qaScreenAction.gotoxy(694, 343);
		qaScreenAction.gotoxy(687, 343);
		qaScreenAction.gotoxy(680, 343);
		qaScreenAction.gotoxy(672, 343);
		qaScreenAction.gotoxy(666, 343);
		qaScreenAction.gotoxy(659, 343);
		qaScreenAction.gotoxy(651, 343);
		qaScreenAction.gotoxy(643, 343);
		qaScreenAction.gotoxy(635, 343);
		qaScreenAction.gotoxy(624, 343);
		qaScreenAction.gotoxy(612, 343);
		qaScreenAction.gotoxy(599, 343);
		qaScreenAction.gotoxy(587, 343);
		qaScreenAction.gotoxy(571, 343);
		qaScreenAction.gotoxy(556, 343);
		qaScreenAction.gotoxy(537, 341);
		qaScreenAction.gotoxy(514, 338);
		qaScreenAction.gotoxy(491, 335);
		qaScreenAction.gotoxy(467, 329);
		qaScreenAction.gotoxy(439, 326);
		qaScreenAction.gotoxy(410, 322);
		qaScreenAction.gotoxy(381, 316);
		qaScreenAction.gotoxy(353, 313);
		qaScreenAction.gotoxy(323, 313);
		qaScreenAction.gotoxy(302, 310);
		qaScreenAction.gotoxy(280, 310);
		qaScreenAction.gotoxy(266, 310);
		qaScreenAction.gotoxy(251, 310);
		qaScreenAction.gotoxy(238, 310);
		qaScreenAction.gotoxy(227, 310);
		qaScreenAction.gotoxy(217, 310);
		qaScreenAction.gotoxy(206, 310);
		qaScreenAction.gotoxy(198, 310);
		qaScreenAction.gotoxy(190, 310);
		qaScreenAction.gotoxy(185, 310);
		qaScreenAction.gotoxy(177, 310);
		qaScreenAction.gotoxy(175, 310);
		qaScreenAction.gotoxy(171, 310);
		qaScreenAction.gotoxy(170, 311);
		qaScreenAction.gotoxy(167, 314);
		qaScreenAction.gotoxy(166, 315);
		qaScreenAction.gotoxy(165, 316);
		qaScreenAction.gotoxy(163, 317);
		qaScreenAction.gotoxy(163, 318);
		qaScreenAction.gotoxy(161, 321);
		qaScreenAction.gotoxy(160, 324);
		qaScreenAction.gotoxy(158, 328);
		qaScreenAction.gotoxy(158, 331);
		qaScreenAction.gotoxy(158, 334);
		qaScreenAction.gotoxy(156, 339);
		qaScreenAction.gotoxy(156, 341);
		qaScreenAction.gotoxy(155, 344);
		qaScreenAction.gotoxy(155, 346);
		qaScreenAction.gotoxy(155, 348);
		qaScreenAction.gotoxy(155, 349);
		qaScreenAction.gotoxy(155, 350);
		qaScreenAction.gotoxy(155, 352);
		qaScreenAction.clickNhold(false);

	}

	void go() {
		initialize();
		gotoxy(1500, 1500);	
	}

	void initialize() {
		grEnv = GraphicsEnvironment.getLocalGraphicsEnvironment();
		grDevice = grEnv.getDefaultScreenDevice();
		updateScreenInfo();
		setKeyMap();
		try {
			MYROBOT = new Robot();
		} catch (Exception e) {
			JOptionPane.showOptionDialog(null, "Can't build the robot!", "Error", -1, 1, null, null, this);
			System.exit(1);
		}
		X = SCREEN_X / 2;
		Y = SCREEN_Y / 2;
		// MYROBOT.mouseMove(X, Y);
		PIX_CLOSE_ACTIVE_OFF_MOUSE = new Color(184, 67, 44);
		PIX_CLOSE_ACTIVE_ON_MOUSE = new Color(210, 35, 2);
	}

	void updateScreenInfo() {
		SCREEN_X = grDevice.getDisplayMode().getWidth();
		SCREEN_Y = grDevice.getDisplayMode().getHeight();
		WINDOW_X = grEnv.getMaximumWindowBounds().width;
		WINDOW_Y = grEnv.getMaximumWindowBounds().height;
	}

	void setKeyMap() {
		KEYMAP = new HashMap<Character, Integer>();
		KEYMAP.put('q', 81);
		KEYMAP.put('w', 87);
		KEYMAP.put('e', 69);
		KEYMAP.put('r', 82);
		KEYMAP.put('t', 84);
		KEYMAP.put('y', 89);
		KEYMAP.put('u', 85);
		KEYMAP.put('i', 73);
		KEYMAP.put('o', 79);
		KEYMAP.put('p', 80);
		KEYMAP.put('a', 65);
		KEYMAP.put('s', 83);
		KEYMAP.put('d', 68);
		KEYMAP.put('f', 70);
		KEYMAP.put('g', 71);
		KEYMAP.put('h', 72);
		KEYMAP.put('j', 74);
		KEYMAP.put('k', 75);
		KEYMAP.put('l', 76);
		KEYMAP.put('z', 90);
		KEYMAP.put('x', 88);
		KEYMAP.put('c', 67);
		KEYMAP.put('v', 86);
		KEYMAP.put('b', 66);
		KEYMAP.put('n', 78);
		KEYMAP.put('m', 77);
		KEYMAP.put('1', 49);
		KEYMAP.put('2', 50);
		KEYMAP.put('3', 51);
		KEYMAP.put('4', 52);
		KEYMAP.put('5', 53);
		KEYMAP.put('6', 54);
		KEYMAP.put('7', 55);
		KEYMAP.put('8', 56);
		KEYMAP.put('9', 57);
		KEYMAP.put('0', 48);
		KEYMAP.put(' ', 32);

		randKeys = new ArrayList<Integer>();
		for (int j = 44; j < 94; j++) {
			randKeys.add(j);
		}
		randKeys.remove(randKeys.indexOf(58));
		randKeys.remove(randKeys.indexOf(60));
		randKeys.remove(randKeys.indexOf(62));
		randKeys.remove(randKeys.indexOf(63));
		randKeys.remove(randKeys.indexOf(64));
	}

	void typeHuman(String letters) {
		MYROBOT.setAutoDelay(TYPE_DELAY);
		char[] letter = letters.toCharArray();
		for (int i = 0; i < letter.length; i++) {
			System.out.print(letter[i]);
			try {
				if ((int) (Math.random() * SKILL) == (int) (Math.random() * SKILL) / 2) {
					int limit = (int) ((Math.random() * 3) + 1);
					for (int j = 0; j < limit; j++) {
						int k = (int) (Math.random() * (randKeys.size() - 1));
						manuPress(randKeys.get(k));
					}
					sleep(200);
					for (int j = 0; j < limit; j++) {
						backspace();
					}
				}
				if ((Character.isLowerCase(letter[i])) || (Character.isDigit(letter[i]))) {
					MYROBOT.keyPress(KEYMAP.get(letter[i]));
					MYROBOT.keyRelease(KEYMAP.get(letter[i]));
				} else {
					letter[i] = Character.toLowerCase(letter[i]);
					MYROBOT.keyPress(16);
					MYROBOT.keyPress(KEYMAP.get(letter[i]));
					MYROBOT.keyRelease(KEYMAP.get(letter[i]));
					MYROBOT.keyRelease(16);
				}
			} catch (Exception e) {
				switch (letter[i]) {
				case '!': {
					manuPressSHIFTED(49);
					break;
				}
				case '@': {
					manuPressSHIFTED(50);
					break;
				}
				case '#': {
					manuPressSHIFTED(51);
					break;
				}
				case '$': {
					manuPressSHIFTED(52);
					break;
				}
				case '%': {
					manuPressSHIFTED(53);
					break;
				}
				case '^': {
					manuPressSHIFTED(54);
					break;
				}
				case '&': {
					manuPressSHIFTED(55);
					break;
				}
				case '*': {
					manuPressSHIFTED(56);
					break;
				}
				case '(': {
					manuPressSHIFTED(57);
					break;
				}
				case ')': {
					manuPressSHIFTED(48);
					break;
				}
				case '?': {
					manuPressSHIFTED(47);
					break;
				}
				case '/': {
					manuPress(47);
					break;
				}
				case ':': {
					manuPressSHIFTED(59);
					break;
				}
				case ';': {
					manuPress(59);
					break;
				}
				case '.': {
					manuPress(46);
					break;
				}
				case ',': {
					manuPress(44);
					break;
				}
				case '"': {
					manuPressSHIFTED(222);
					break;
				}
				case '\'': {
					manuPress(222);
					break;
				}
				case '[': {
					manuPress(91);
					break;
				}
				case ']': {
					manuPress(93);
					break;
				}
				case '{': {
					manuPressSHIFTED(91);
					break;
				}
				case '}': {
					manuPressSHIFTED(93);
					break;
				}
				case '\\': {
					manuPress(92);
					break;
				}
				case '|': {
					manuPressSHIFTED(92);
					break;
				}
				case '=': {
					manuPressSHIFTED(61);
					break;
				}
				case '+': {
					manuPressSHIFTED(61);
					break;
				}
				case '-': {
					manuPress(45);
					break;
				}
				case '_': {
					manuPressSHIFTED(45);
					break;
				}
				case '`': {
					manuPress(192);
					break;
				}
				case '~': {
					manuPressSHIFTED(192);
					break;
				}
				case '<': {
					manuPressSHIFTED(44);
					break;
				}
				case '>': {
					manuPressSHIFTED(46);
					break;
				}

				}
			}

		}
		System.out.println("");
	}

	void type(String letters) {
		MYROBOT.setAutoDelay(TYPE_DELAY);
		char[] letter = letters.toCharArray();
		for (int i = 0; i < letter.length; i++) {
			System.out.print(letter[i]);
			try {
				if ((Character.isLowerCase(letter[i])) || (Character.isDigit(letter[i]))) {
					MYROBOT.keyPress(KEYMAP.get(letter[i]));
					MYROBOT.keyRelease(KEYMAP.get(letter[i]));
				} else {
					letter[i] = Character.toLowerCase(letter[i]);
					MYROBOT.keyPress(16);
					MYROBOT.keyPress(KEYMAP.get(letter[i]));
					MYROBOT.keyRelease(KEYMAP.get(letter[i]));
					MYROBOT.keyRelease(16);
				}
			} catch (Exception e) {
				switch (letter[i]) {
				case '!': {
					manuPressSHIFTED(49);
					break;
				}
				case '@': {
					manuPressSHIFTED(50);
					break;
				}
				case '#': {
					manuPressSHIFTED(51);
					break;
				}
				case '$': {
					manuPressSHIFTED(52);
					break;
				}
				case '%': {
					manuPressSHIFTED(53);
					break;
				}
				case '^': {
					manuPressSHIFTED(54);
					break;
				}
				case '&': {
					manuPressSHIFTED(55);
					break;
				}
				case '*': {
					manuPressSHIFTED(56);
					break;
				}
				case '(': {
					manuPressSHIFTED(57);
					break;
				}
				case ')': {
					manuPressSHIFTED(48);
					break;
				}
				case '?': {
					manuPressSHIFTED(47);
					break;
				}
				case '/': {
					manuPress(47);
					break;
				}
				case ':': {
					manuPressSHIFTED(59);
					break;
				}
				case ';': {
					manuPress(59);
					break;
				}
				case '.': {
					manuPress(46);
					break;
				}
				case ',': {
					manuPress(44);
					break;
				}
				case '"': {
					manuPressSHIFTED(222);
					break;
				}
				case '\'': {
					manuPress(222);
					break;
				}
				case '[': {
					manuPress(91);
					break;
				}
				case ']': {
					manuPress(93);
					break;
				}
				case '{': {
					manuPressSHIFTED(91);
					break;
				}
				case '}': {
					manuPressSHIFTED(93);
					break;
				}
				case '\\': {
					manuPress(92);
					break;
				}
				case '|': {
					manuPressSHIFTED(92);
					break;
				}
				case '=': {
					manuPressSHIFTED(61);
					break;
				}
				case '+': {
					manuPressSHIFTED(61);
					break;
				}
				case '-': {
					manuPress(45);
					break;
				}
				case '_': {
					manuPressSHIFTED(45);
					break;
				}
				case '`': {
					manuPress(192);
					break;
				}
				case '~': {
					manuPressSHIFTED(192);
					break;
				}
				case '<': {
					manuPressSHIFTED(44);
					break;
				}
				case '>': {
					manuPressSHIFTED(46);
					break;
				}

				}
			}

		}
		System.out.println("");
	}

	void typeln(String letters) {
		type(letters);
		enter();
	}

	void typelnHuman(String letters) {
		typeHuman(letters);
		enter();
	}

	void getRun() {
		MYROBOT.keyPress(524);
		MYROBOT.keyPress(82);
		MYROBOT.keyRelease(82);
		MYROBOT.keyRelease(524);
		sleep(500);
	}

	void combinePress(int keyOne, int keyTwo) {
		MYROBOT.keyPress(keyOne);
		MYROBOT.keyPress(keyTwo);
		MYROBOT.keyRelease(keyTwo);
		MYROBOT.keyRelease(keyOne);
	}

	void combinePress(int keyOne, int keyTwo, int keyThree) {
		MYROBOT.keyPress(keyOne);
		MYROBOT.keyPress(keyTwo);
		MYROBOT.keyPress(keyThree);
		MYROBOT.keyRelease(keyThree);
		MYROBOT.keyRelease(keyTwo);
		MYROBOT.keyRelease(keyOne);
	}

	void altTab() {
		MYROBOT.keyPress(18);
		MYROBOT.keyPress(9);
		MYROBOT.keyRelease(9);
		MYROBOT.keyRelease(18);
	}

	void winD() {
		MYROBOT.keyPress(524);
		MYROBOT.keyPress(68);
		MYROBOT.keyRelease(68);
		MYROBOT.keyRelease(524);
	}

	void altF4() {
		MYROBOT.keyPress(18);
		MYROBOT.keyPress(115);
		MYROBOT.keyRelease(115);
		MYROBOT.keyRelease(18);
	}

	void enter() {
		MYROBOT.keyPress(10);
		MYROBOT.keyRelease(10);
	}

	void backspace() {
		MYROBOT.keyPress(8);
		MYROBOT.keyRelease(8);
	}

	void sleep(long duration) {
		try {
			Thread.sleep(duration);
		} catch (Exception e) {
		}
	}

	void click() {
		MYROBOT.mousePress(16);
		MYROBOT.mouseRelease(16);
	}

	void doubleClick() {
		click();
		click();
	}

	void clickNhold(boolean tof) {
		if (tof) {
			MYROBOT.mousePress(16);
		} else {
			MYROBOT.mouseRelease(16);
		}
	}

	void rightClick() {
		MYROBOT.mousePress(4);
		MYROBOT.mouseRelease(4);
	}

	void rightclickHold(boolean tof) {
		if (tof) {
			MYROBOT.mousePress(4);
		} else {
			MYROBOT.mouseRelease(4);
		}
	}

	void middleClick() {
		MYROBOT.mousePress(8);
		MYROBOT.mouseRelease(8);
	}

	void manuPress(int code) {
		MYROBOT.keyRelease(16);
		MYROBOT.keyPress(code);
		MYROBOT.keyRelease(code);
	}

	void manuPressSHIFTED(int code) {
		MYROBOT.keyPress(16);
		MYROBOT.keyPress(code);
		MYROBOT.keyRelease(code);
		MYROBOT.keyRelease(16);
	}

	void gotoxy(int goX, int goY) {
		lastX = X;
		lastY = Y;
		MYROBOT.setAutoDelay(MOUSE_DELAY);
		int initX = X;
		int initY = Y;
		if (goX == X) {
			if (goY > Y) {
				for (int i = Y; i <= goY; i++) {
					Y = i;
					MYROBOT.mouseMove(X, Y);
				}
			} else {
				for (int i = Y; i >= goY; i--) {
					Y = i;
					MYROBOT.mouseMove(X, Y);
				}
			}
		} else if (goX > X) {
			for (int i = 0; i <= (goX - initX); i++) {
				X = initX + i;
				Y = initY + ((i * (goY - initY)) / (goX - initX));
				MYROBOT.mouseMove(X, Y);
			}

		} else {
			for (int i = 0; i >= (goX - initX); i--) {
				X = initX + i;
				Y = initY + ((i * (goY - initY)) / (goX - initX));
				MYROBOT.mouseMove(X, Y);
			}
		}
	}

	void getRGB(Color pixel) {
		RED = pixel.getRed();
		GREEN = pixel.getGreen();
		BLUE = pixel.getBlue();
		System.out.println(RED + "," + GREEN + "," + BLUE);
	}

	void savePoint() {
		savedX = X;
		savedY = Y;
	}

	void captureScreen() {
		System.out.println("Capturing...");
		SCREEN = new Color[SCREEN_X][SCREEN_Y];
		for (int i = 0; i < SCREEN_X; i++) {
			for (int j = 0; j < SCREEN_Y / 2; j++) {
				SCREEN[i][j] = MYROBOT.getPixelColor(i, j);
			}
		}
		System.out.println("Capturing done");
	}

	void gotoPixel(Color pixel) {
		if (MYROBOT.getPixelColor(X, Y).getRGB() != pixel.getRGB()) {
			for (int i = SCREEN_X - 4; i >= 0; i--) {
				for (int j = 3; j < SCREEN_Y / 2; j++) {
					if ((MYROBOT.getPixelColor(i, j).getRGB() == pixel.getRGB())) {
						gotoxy(i, j);
						i = -1;
						break;
					}
				}
			}
		}
		if (MYROBOT.getPixelColor(X, Y).getRGB() == pixel.getRGB()) {
			while (MYROBOT.getPixelColor(X, Y).getRGB() == pixel.getRGB()) {
				gotoxy((X - 1), Y);
			}
		}
	}

	void emergeFromPixel(Color pixel) {
		if (MYROBOT.getPixelColor(X, Y).getRGB() != pixel.getRGB()) {
			for (int i = SCREEN_X - 4; i >= 0; i--) {
				for (int j = 3; j < SCREEN_Y / 2; j++) {
					if ((MYROBOT.getPixelColor(i, j).getRGB() == pixel.getRGB())) {
						MYROBOT.mouseMove(i, j);
						X = i;
						Y = j;
						i = -1;
						break;
					}
				}
			}
		}
	}

	void shift(char dir) {
		int initX = X;
		Color initPixel;
		dir = Character.toUpperCase(dir);
		switch (dir) {
		case 'L': {
			gotoxy((X - 8), Y);
			initPixel = MYROBOT.getPixelColor(X, Y);
			while (MYROBOT.getPixelColor(X, Y).getRGB() == initPixel.getRGB()) {
				gotoxy((X - 1), Y);
			}
			initX = X;
			for (int i = initX; i > initX - 20; i--) {
				if (MYROBOT.getPixelColor(i, Y).getRGB() == initPixel.getRGB()) {
					gotoxy(i, Y);
					while (MYROBOT.getPixelColor(X, Y).getRGB() == initPixel.getRGB()) {
						gotoxy((X - 1), Y);
					}
					break;
				}
			}
			break;
		}
		case 'R': {
			initPixel = MYROBOT.getPixelColor(X, Y);
			while (MYROBOT.getPixelColor(X, Y).getRGB() == initPixel.getRGB()) {
				gotoxy((X + 1), Y);
			}
			initX = X;
			for (int i = initX; i < initX + 20; i++) {
				if (MYROBOT.getPixelColor(i, Y).getRGB() == initPixel.getRGB()) {
					gotoxy(i, Y);
					while (MYROBOT.getPixelColor(X, Y).getRGB() == initPixel.getRGB()) {
						gotoxy((X + 1), Y);
					}
					break;
				}
			}
			gotoxy((X + 8), Y);
			break;
		}
		}
	}

	void emergeFromButton(String butName) {
		int tempDelay = TYPE_DELAY;
		TYPE_DELAY = 0;
		MYROBOT.setAutoDelay(TYPE_DELAY);
		butName = butName.toUpperCase();
		if (butName.equals("CLOSE")) {
			emergeFromPixel(PIX_CLOSE_ACTIVE_OFF_MOUSE);
		} else if (butName.equals("MAXIMIZE")) {
			emergeFromPixel(PIX_CLOSE_ACTIVE_OFF_MOUSE);
			shift('L');
		} else if (butName.equals("MINIMIZE")) {
			emergeFromPixel(PIX_CLOSE_ACTIVE_OFF_MOUSE);
			shift('L');
			shift('L');
		} else if (butName.equals("START")) {
			MYROBOT.mouseMove(20, SCREEN_Y - 10);
		}
		TYPE_DELAY = tempDelay;
		MYROBOT.setAutoDelay(TYPE_DELAY);
	}

	void gotoButton(String butName) {
		butName = butName.toUpperCase();
		if (butName.equals("CLOSE")) {
			if (MYROBOT.getPixelColor(X, Y).getRGB() != PIX_CLOSE_ACTIVE_ON_MOUSE.getRGB()) {
				gotoPixel(PIX_CLOSE_ACTIVE_OFF_MOUSE);
			}
		} else if (butName.equals("MAXIMIZE")) {
			gotoPixel(PIX_CLOSE_ACTIVE_OFF_MOUSE);
			shift('L');
		} else if (butName.equals("MINIMIZE")) {
			gotoPixel(PIX_CLOSE_ACTIVE_OFF_MOUSE);
			shift('L');
			shift('L');
		} else if (butName.equals("START")) {
			gotoxy(20, SCREEN_Y - 10);
		}
	}

	void catchTitleBar() {
		gotoButton("CLOSE");
		gotoxy(X - 150, Y);
	}

	void pressKey(String keyName) {
		keyName = keyName.toUpperCase();
		if (keyName.equals("ESC")) {
			manuPress(27);
		}
	}

	void closeAllWindows() {
		while ((MYROBOT.getPixelColor(65, SCREEN_Y - 35).getRed() > 213)
				&& (MYROBOT.getPixelColor(65, SCREEN_Y - 35).getGreen() > 220)
				&& (MYROBOT.getPixelColor(65, SCREEN_Y - 35).getBlue() > 228)) {
			altTab();
			gotoButton("CLOSE");
			sleep(100);
			click();
			sleep(50);
		}
	}

	void quickCloseAllWindows() {
		while ((MYROBOT.getPixelColor(65, SCREEN_Y - 35).getRed() > 213)
				&& (MYROBOT.getPixelColor(65, SCREEN_Y - 35).getGreen() > 220)
				&& (MYROBOT.getPixelColor(65, SCREEN_Y - 35).getBlue() > 228)) {
			winD();
			sleep(100);
			altTab();
			altF4();
			type("n");
		}
	}

	void getNotepad() {
		int saveDelay = TYPE_DELAY;
		TYPE_DELAY = 0;
		MYROBOT.setAutoDelay(0);
		MYROBOT.keyPress(524);
		MYROBOT.keyPress(82);
		MYROBOT.keyRelease(82);
		MYROBOT.keyRelease(524);
		sleep(200);
		typeln("notepad");
		sleep(500);
		TYPE_DELAY = saveDelay;
		MYROBOT.setAutoDelay(TYPE_DELAY);
	}

	void closeActiveWindow() {
		gotoButton("CLOSE");
		click();
		type("n");
	}

	void openMyComputer() {
		gotoxy(50, 50);
		doubleClick();
	}

	void lockMouse() {
		Thread lockMouse = new Thread(new Runnable() {

			@Override
			public void run() {
				while (true) {
					MYROBOT.mouseMove(X, Y);
					sleep(100);
				}
			}
		});
		lockMouse.start();
	}
}