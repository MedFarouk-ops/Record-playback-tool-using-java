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
		qaScreenAction.gotoxy(235, 366);
		qaScreenAction.gotoxy(240, 371);
		qaScreenAction.gotoxy(240, 375);
		qaScreenAction.gotoxy(242, 381);
		qaScreenAction.gotoxy(244, 385);
		qaScreenAction.gotoxy(247, 389);
		qaScreenAction.gotoxy(250, 394);
		qaScreenAction.gotoxy(253, 398);
		qaScreenAction.gotoxy(256, 406);
		qaScreenAction.gotoxy(260, 412);
		qaScreenAction.gotoxy(264, 415);
		qaScreenAction.gotoxy(269, 420);
		qaScreenAction.gotoxy(273, 426);
		qaScreenAction.gotoxy(279, 434);
		qaScreenAction.gotoxy(285, 441);
		qaScreenAction.gotoxy(291, 451);
		qaScreenAction.gotoxy(297, 457);
		qaScreenAction.gotoxy(303, 467);
		qaScreenAction.gotoxy(310, 474);
		qaScreenAction.gotoxy(320, 485);
		qaScreenAction.gotoxy(324, 491);
		qaScreenAction.gotoxy(333, 499);
		qaScreenAction.gotoxy(341, 509);
		qaScreenAction.gotoxy(351, 519);
		qaScreenAction.gotoxy(361, 527);
		qaScreenAction.gotoxy(372, 536);
		qaScreenAction.gotoxy(384, 543);
		qaScreenAction.gotoxy(399, 553);
		qaScreenAction.gotoxy(415, 564);
		qaScreenAction.gotoxy(433, 574);
		qaScreenAction.gotoxy(452, 584);
		qaScreenAction.gotoxy(478, 597);
		qaScreenAction.gotoxy(502, 611);
		qaScreenAction.gotoxy(526, 626);
		qaScreenAction.gotoxy(546, 634);
		qaScreenAction.gotoxy(574, 644);
		qaScreenAction.gotoxy(600, 656);
		qaScreenAction.gotoxy(627, 664);
		qaScreenAction.gotoxy(652, 673);
		qaScreenAction.gotoxy(680, 683);
		qaScreenAction.gotoxy(707, 689);
		qaScreenAction.gotoxy(742, 700);
		qaScreenAction.gotoxy(777, 710);
		qaScreenAction.gotoxy(809, 717);
		qaScreenAction.gotoxy(845, 728);
		qaScreenAction.gotoxy(883, 738);
		qaScreenAction.gotoxy(918, 749);
		qaScreenAction.gotoxy(946, 752);
		qaScreenAction.gotoxy(983, 757);
		qaScreenAction.gotoxy(1015, 762);
		qaScreenAction.gotoxy(1043, 766);
		qaScreenAction.gotoxy(1066, 768);
		qaScreenAction.gotoxy(1084, 771);
		qaScreenAction.gotoxy(1102, 774);
		qaScreenAction.gotoxy(1120, 776);
		qaScreenAction.gotoxy(1133, 778);
		qaScreenAction.gotoxy(1145, 778);
		qaScreenAction.gotoxy(1157, 778);
		qaScreenAction.gotoxy(1170, 778);
		qaScreenAction.gotoxy(1183, 778);
		qaScreenAction.gotoxy(1197, 778);
		qaScreenAction.gotoxy(1214, 774);
		qaScreenAction.gotoxy(1233, 769);
		qaScreenAction.gotoxy(1253, 763);
		qaScreenAction.gotoxy(1279, 757);
		qaScreenAction.gotoxy(1301, 751);
		qaScreenAction.gotoxy(1321, 743);
		qaScreenAction.gotoxy(1335, 740);
		qaScreenAction.gotoxy(1347, 736);
		qaScreenAction.gotoxy(1357, 732);
		qaScreenAction.gotoxy(1367, 726);
		qaScreenAction.gotoxy(1374, 723);
		qaScreenAction.gotoxy(1380, 717);
		qaScreenAction.gotoxy(1386, 711);
		qaScreenAction.gotoxy(1391, 706);
		qaScreenAction.gotoxy(1397, 700);
		qaScreenAction.gotoxy(1404, 691);
		qaScreenAction.gotoxy(1410, 682);
		qaScreenAction.gotoxy(1414, 676);
		qaScreenAction.gotoxy(1418, 670);
		qaScreenAction.gotoxy(1422, 660);
		qaScreenAction.gotoxy(1424, 656);
		qaScreenAction.gotoxy(1429, 647);
		qaScreenAction.gotoxy(1433, 641);
		qaScreenAction.gotoxy(1435, 633);
		qaScreenAction.gotoxy(1439, 627);
		qaScreenAction.gotoxy(1441, 619);
		qaScreenAction.gotoxy(1445, 613);
		qaScreenAction.gotoxy(1447, 604);
		qaScreenAction.gotoxy(1449, 596);
		qaScreenAction.gotoxy(1451, 588);
		qaScreenAction.gotoxy(1451, 575);
		qaScreenAction.gotoxy(1453, 562);
		qaScreenAction.gotoxy(1453, 548);
		qaScreenAction.gotoxy(1453, 532);
		qaScreenAction.gotoxy(1453, 513);
		qaScreenAction.gotoxy(1453, 493);
		qaScreenAction.gotoxy(1449, 474);
		qaScreenAction.gotoxy(1446, 459);
		qaScreenAction.gotoxy(1446, 447);
		qaScreenAction.gotoxy(1444, 434);
		qaScreenAction.gotoxy(1442, 421);
		qaScreenAction.gotoxy(1440, 409);
		qaScreenAction.gotoxy(1440, 397);
		qaScreenAction.gotoxy(1437, 371);
		qaScreenAction.gotoxy(1437, 333);
		qaScreenAction.gotoxy(1437, 311);
		qaScreenAction.gotoxy(1433, 292);
		qaScreenAction.gotoxy(1427, 278);
		qaScreenAction.gotoxy(1425, 264);
		qaScreenAction.gotoxy(1420, 253);
		qaScreenAction.gotoxy(1418, 242);
		qaScreenAction.gotoxy(1414, 236);
		qaScreenAction.gotoxy(1412, 233);
		qaScreenAction.gotoxy(1412, 232);
		qaScreenAction.gotoxy(1407, 232);
		qaScreenAction.gotoxy(1402, 232);
		qaScreenAction.gotoxy(1397, 235);
		qaScreenAction.gotoxy(1389, 237);
		qaScreenAction.gotoxy(1382, 239);
		qaScreenAction.gotoxy(1375, 241);
		qaScreenAction.gotoxy(1370, 243);
		qaScreenAction.gotoxy(1364, 245);
		qaScreenAction.gotoxy(1361, 245);
		qaScreenAction.gotoxy(1360, 246);
		qaScreenAction.gotoxy(1356, 247);
		qaScreenAction.gotoxy(1355, 248);
		qaScreenAction.gotoxy(1354, 248);
		qaScreenAction.gotoxy(1353, 249);
		qaScreenAction.gotoxy(1351, 249);
		qaScreenAction.gotoxy(1351, 250);
		qaScreenAction.gotoxy(1350, 250);
		qaScreenAction.gotoxy(1349, 250);
		qaScreenAction.gotoxy(1348, 250);
		qaScreenAction.gotoxy(1347, 250);
		qaScreenAction.gotoxy(1344, 250);
		qaScreenAction.gotoxy(1342, 250);
		qaScreenAction.gotoxy(1338, 251);
		qaScreenAction.gotoxy(1338, 252);
		qaScreenAction.gotoxy(1336, 252);
		qaScreenAction.gotoxy(1334, 253);
		qaScreenAction.gotoxy(1333, 255);
		qaScreenAction.gotoxy(1332, 255);
		qaScreenAction.gotoxy(1332, 255);
		qaScreenAction.gotoxy(1331, 255);
		qaScreenAction.gotoxy(1329, 255);
		qaScreenAction.gotoxy(1329, 256);
		qaScreenAction.gotoxy(1328, 257);
		qaScreenAction.clickNhold(true);
		qaScreenAction.gotoxy(1328, 258);
		qaScreenAction.gotoxy(1328, 259);
		qaScreenAction.gotoxy(1328, 260);
		qaScreenAction.gotoxy(1328, 262);
		qaScreenAction.gotoxy(1328, 263);
		qaScreenAction.gotoxy(1328, 264);
		qaScreenAction.gotoxy(1328, 265);
		qaScreenAction.gotoxy(1328, 267);
		qaScreenAction.gotoxy(1328, 269);
		qaScreenAction.gotoxy(1328, 269);
		qaScreenAction.gotoxy(1330, 271);
		qaScreenAction.gotoxy(1330, 272);
		qaScreenAction.gotoxy(1331, 273);
		qaScreenAction.gotoxy(1331, 274);
		qaScreenAction.gotoxy(1333, 276);
		qaScreenAction.gotoxy(1335, 277);
		qaScreenAction.gotoxy(1335, 278);
		qaScreenAction.gotoxy(1337, 279);
		qaScreenAction.gotoxy(1339, 280);
		qaScreenAction.gotoxy(1339, 280);
		qaScreenAction.gotoxy(1340, 281);
		qaScreenAction.gotoxy(1340, 282);
		qaScreenAction.gotoxy(1342, 283);
		qaScreenAction.gotoxy(1344, 284);
		qaScreenAction.gotoxy(1344, 284);
		qaScreenAction.gotoxy(1345, 285);
		qaScreenAction.gotoxy(1346, 286);
		qaScreenAction.gotoxy(1348, 287);
		qaScreenAction.gotoxy(1348, 288);
		qaScreenAction.gotoxy(1349, 289);
		qaScreenAction.gotoxy(1352, 290);
		qaScreenAction.gotoxy(1353, 293);
		qaScreenAction.gotoxy(1355, 295);
		qaScreenAction.gotoxy(1356, 296);
		qaScreenAction.gotoxy(1358, 297);
		qaScreenAction.gotoxy(1358, 302);
		qaScreenAction.gotoxy(1359, 302);
		qaScreenAction.gotoxy(1361, 304);
		qaScreenAction.gotoxy(1363, 306);
		qaScreenAction.gotoxy(1364, 309);
		qaScreenAction.gotoxy(1365, 311);
		qaScreenAction.gotoxy(1366, 312);
		qaScreenAction.gotoxy(1368, 315);
		qaScreenAction.gotoxy(1369, 317);
		qaScreenAction.gotoxy(1370, 319);
		qaScreenAction.gotoxy(1372, 322);
		qaScreenAction.gotoxy(1372, 324);
		qaScreenAction.gotoxy(1374, 328);
		qaScreenAction.gotoxy(1375, 330);
		qaScreenAction.gotoxy(1376, 335);
		qaScreenAction.gotoxy(1377, 336);
		qaScreenAction.gotoxy(1378, 339);
		qaScreenAction.gotoxy(1378, 341);
		qaScreenAction.gotoxy(1379, 346);
		qaScreenAction.gotoxy(1380, 346);
		qaScreenAction.gotoxy(1380, 350);
		qaScreenAction.gotoxy(1381, 350);
		qaScreenAction.gotoxy(1381, 352);
		qaScreenAction.gotoxy(1381, 353);
		qaScreenAction.gotoxy(1382, 354);
		qaScreenAction.gotoxy(1382, 356);
		qaScreenAction.gotoxy(1382, 356);
		qaScreenAction.gotoxy(1382, 357);
		qaScreenAction.gotoxy(1382, 358);
		qaScreenAction.gotoxy(1384, 359);
		qaScreenAction.gotoxy(1384, 361);
		qaScreenAction.gotoxy(1384, 362);
		qaScreenAction.gotoxy(1384, 363);
		qaScreenAction.gotoxy(1385, 365);
		qaScreenAction.gotoxy(1385, 366);
		qaScreenAction.gotoxy(1386, 368);
		qaScreenAction.gotoxy(1387, 369);
		qaScreenAction.clickNhold(false);
		qaScreenAction.clickNhold(true);
		qaScreenAction.clickNhold(false);
		qaScreenAction.click();
		qaScreenAction.gotoxy(1386, 369);
		qaScreenAction.gotoxy(1376, 369);
		qaScreenAction.gotoxy(1360, 369);
		qaScreenAction.gotoxy(1333, 369);
		qaScreenAction.gotoxy(1289, 369);
		qaScreenAction.gotoxy(1162, 369);
		qaScreenAction.gotoxy(1096, 358);
		qaScreenAction.gotoxy(1024, 349);
		qaScreenAction.gotoxy(963, 337);
		qaScreenAction.gotoxy(900, 329);
		qaScreenAction.gotoxy(841, 321);
		qaScreenAction.gotoxy(778, 313);
		qaScreenAction.gotoxy(698, 300);
		qaScreenAction.gotoxy(616, 291);
		qaScreenAction.gotoxy(544, 278);
		qaScreenAction.gotoxy(473, 270);
		qaScreenAction.gotoxy(412, 262);
		qaScreenAction.gotoxy(348, 249);
		qaScreenAction.gotoxy(296, 246);
		qaScreenAction.gotoxy(250, 246);
		qaScreenAction.gotoxy(214, 246);
		qaScreenAction.gotoxy(196, 247);
		qaScreenAction.gotoxy(184, 249);
		qaScreenAction.gotoxy(175, 252);
		qaScreenAction.gotoxy(169, 252);
		qaScreenAction.gotoxy(167, 253);
		qaScreenAction.gotoxy(165, 255);
		qaScreenAction.gotoxy(163, 257);
		qaScreenAction.gotoxy(162, 258);
		qaScreenAction.gotoxy(160, 262);
		qaScreenAction.gotoxy(160, 265);
		qaScreenAction.gotoxy(159, 266);
		qaScreenAction.gotoxy(157, 269);
		qaScreenAction.gotoxy(157, 270);
		qaScreenAction.gotoxy(157, 273);
		qaScreenAction.gotoxy(157, 276);
		qaScreenAction.gotoxy(157, 279);
		qaScreenAction.gotoxy(157, 284);
		qaScreenAction.gotoxy(157, 287);
		qaScreenAction.gotoxy(162, 293);
		qaScreenAction.gotoxy(164, 298);
		qaScreenAction.gotoxy(168, 304);
		qaScreenAction.gotoxy(174, 308);
		qaScreenAction.gotoxy(181, 314);
		qaScreenAction.gotoxy(187, 318);
		qaScreenAction.gotoxy(193, 322);
		qaScreenAction.gotoxy(201, 326);
		qaScreenAction.gotoxy(209, 333);
		qaScreenAction.gotoxy(219, 339);
		qaScreenAction.gotoxy(233, 346);
		qaScreenAction.gotoxy(253, 355);
		qaScreenAction.gotoxy(279, 365);
		qaScreenAction.gotoxy(300, 369);
		qaScreenAction.gotoxy(316, 372);
		qaScreenAction.gotoxy(335, 378);
		qaScreenAction.gotoxy(350, 380);
		qaScreenAction.gotoxy(359, 380);
		qaScreenAction.gotoxy(365, 380);
		qaScreenAction.gotoxy(372, 380);
		qaScreenAction.gotoxy(374, 380);
		qaScreenAction.gotoxy(377, 380);
		qaScreenAction.gotoxy(380, 380);
		qaScreenAction.gotoxy(382, 379);
		qaScreenAction.gotoxy(384, 378);
		qaScreenAction.gotoxy(386, 378);
		qaScreenAction.gotoxy(387, 378);
		qaScreenAction.gotoxy(389, 377);
		qaScreenAction.gotoxy(390, 377);
		qaScreenAction.gotoxy(391, 377);
		qaScreenAction.gotoxy(391, 376);
		qaScreenAction.gotoxy(391, 376);
		qaScreenAction.gotoxy(391, 375);
		qaScreenAction.gotoxy(391, 374);
		qaScreenAction.gotoxy(391, 373);
		qaScreenAction.gotoxy(391, 372);
		qaScreenAction.gotoxy(391, 371);
		qaScreenAction.gotoxy(389, 371);
		qaScreenAction.gotoxy(388, 369);
		qaScreenAction.gotoxy(387, 369);
		qaScreenAction.gotoxy(385, 369);
		qaScreenAction.gotoxy(382, 368);
		qaScreenAction.gotoxy(381, 368);
		qaScreenAction.gotoxy(380, 368);
		qaScreenAction.gotoxy(377, 367);
		qaScreenAction.gotoxy(377, 366);
		qaScreenAction.gotoxy(376, 366);
		qaScreenAction.clickNhold(true);
		qaScreenAction.clickNhold(false);
		qaScreenAction.click();

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