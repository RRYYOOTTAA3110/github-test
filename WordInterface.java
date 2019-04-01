package QuizInterface;

import input_related.EnterOnConsole;
import quiz_type.Quiz1;
import quiz_type.Quiz2;
import quiz_type.Quiz3;

public interface WordInterface {

	//クイズのインスタンス
	Quiz1 quiz1 = new Quiz1();

	Quiz2 quiz2 = new Quiz2();

	Quiz3 quiz3 = new Quiz3();


	//4択クイズの文字列
	String a = "a";
	String b = "b";
	String c = "c";
	String d = "d";



	//入力用クラスの準備
	EnterOnConsole enter =new EnterOnConsole();

	/*---------------開始のセリフ-----------------*/

	String op1 = "私は映画泥棒だ！";
	String op2 = "上映される前に映画を盗んでやる！";
	String op3 = "ただし、それだけでは面白くないので、君たち観客と勝負しよう。";
	String op4 = "これから上映される映画に関するクイズに全て答えることが出来たなら、";
	String op5 = "上映をジャマせず去ってやろう。";
	String op6 = "だか答えられなければ君たちの負けだ！映画は上映されず、君たちの映画を盗んでやる。";
	String op7 = "では始めようか！";


	/*---------------問題の判定-----------------*/

	String rightAns = "正解！";
	String missAns = "不正解！";
	String improperAns = "まじめにやりなさい！";
	String retry = "もう一度！";
	String next = "次の問題だ！";
	String last = "次でラストだ！一発で当てないとゲームオーバーだぞ！";
	String congrats = "おめでとう！";
	String fail = "君はもう少し映画を観た方がいいぞ！\n悪いがこの映画は私が貰っていく！";


	/*---------------スパイダーマン-----------------*/
	//クイズ1
	String smQuiz1 ="この映画のジャンルは？";
	String spSelect1 ="A: SF\nB: ファンタジー\nC: アクション\nD: ホラー";
	String smTrivia1 ="この映画の監督は、ホラー映画でも有名だぞ！";

	//クイズ2
	String smQuiz2 ="この映画の制作年数は？";
	String spSelect2 ="A: 2002年\nB: 2012年\nC: 2017年\nD: 2018年";
	String smTrivia2 ="同じ年にメン・イン・ブラック２も公開されたぞ！";

	//クイズ3
	String smQuiz3 ="この映画の主演俳優は？";
	String spSelect3 ="A: アンドリュー・ガーフィールド\nB: トム・ホランド\nC: ジェイク・ジェイソン\nD: トビー・マグワイア";
	String smTrivia3 ="彼も当時は27歳だったのだね！";

	//クイズ4
	String smQuiz4 ="この映画のタイトルは？";
	String spSelect4 ="A: アメイジング・スパイダーマン\nB: スパイダーマン・スパイダーバース\nC: スパイダーマン・ホームカミング\nD: スパイダーマン";
	String smTrivia4_1 ="スパイダーマンばかりで混乱したと思うがよくここまで来たな！";
	String smTrivia4_2 ="次はもっと難しいクイズを用意しておこう！";
	String smTrivia4_3 ="シュッ！";


	/*---------------フォレストガンプ-----------------*/
	//クイズ1
	String fgQuiz1 ="この映画のジャンルは？";
	String fgSelect1 ="A: 戦争\nB: ヒューマンドラマ\nC: 恋愛\nD: SF";
	String fgTrivia1 ="この映画は「戦争」や「恋愛」の要素も含まれるけど、あとから文句言わないでね！";

	//クイズ2
	String fgQuiz2 ="この映画の名台詞は？";
	String fgSelect2 ="A: 大いなる力には大いなる責任が伴う\nB: 人生はチョコレートの箱、開けてみるまで分からない\nC: 道を知っていることと実際に歩くことは違う\nD: I'll be back";
	String fgTrivia2 ="この名台詞が分かったらもう何の映画か分かったよね？";

	//クイズ3
	String fgQuiz3 ="この作品は第67回アカデミー賞で6部門受賞しましたが、受賞できなかった部門はなに？";
	String fgSelect3 ="A: 助演男優賞\nB: 主演男優賞\nC: 監督賞\nD: 視覚効果賞";
	String fgTrivia3_1 ="作品賞/監督賞/脚色賞/主演男優賞/編集賞/視覚効果賞を受賞したんだ。";
	String fgTrivia3_2 ="助演男優賞はノミネートはされたけど受賞は逃したよ。";

	//クイズ4
	String fgQuiz4 ="この映画のタイトルは？";
	String fgSelect4 ="A: バック・トゥ・ザ・フューチャー\nB: グリーン・マイル\nC: ショーシャンクの空に\nD: フォレストガンプ／一期一会";
	String fgTrivia4_1 ="君もフォレスト・ガンプのように走り続けていれば";
	String fgTrivia4_2 ="素晴らしい出会いが待っているだろう！";
	String fgTrivia4_3 ="ダッ！";


	/*---------------椿三十郎-----------------*/
	//クイズ1
	String tsQuiz1 ="この映画のジャンルは？";
	String tsSelect1 ="A: サスペンス\nB: ミステリ\nC: 西部劇\nD: 時代劇";
	String tsTrivia1 ="昭和37年の元旦に公開された、お正月映画だぞ！";

	//クイズ2
	String tsQuiz2 ="この映画の監督は？";
	String tsSelect2 ="A: 伊藤 大輔\nB: 牧野 省三\nC: 黒澤 明\nD: 加藤 泰";
	String tsTrivia2_1 ="完璧主義の黒澤はこの作品に登場する1つの屋敷を";
	String tsTrivia2_2 ="3千万円かけて制作したようだ！";

	//クイズ3
	String tsQuiz3 ="この映画のクライマックスで三船敏郎が敵役の仲代達矢を斬る場面があるが、リアリティを出すために血のりに混ぜられたものはなに？";
	String tsSelect3 ="A: 油\nB: 砂糖\nC: 葡萄の皮\nD: 塩";
	String tsTrivia3_1 ="この時、血糊は圧搾空気を使ってホースで送られたが、";
	String tsTrivia3_2 ="あまりの勢いに仲代は吹き飛ばされそうになったらしいぞ！";

	//クイズ4
	String tsQuiz4 ="この映画のタイトルは？";
	String tsSelect4 ="A: 用心棒\nB: 椿三十郎\nC: 七人の侍\nD: 隠し砦の三悪人";
	String tsTrivia4_1 ="この作品はアクション色が強いと言われているが、";
	String tsTrivia4_2 ="実際の殺陣の場面は本編96分のうち僅か2分しかない。";
	String tsTrivia4_3 ="三船敏郎の殺陣がいかに凄まじく印象的であったか良く分かるね！";
	String tsTrivia4_4 ="君もその映画の知識がいつの日か武器になるだろう！";
	String tsTrivia4_5 ="あばよ！";

}
