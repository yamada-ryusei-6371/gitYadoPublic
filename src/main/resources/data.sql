-- users テーブルにデータを挿入するクエリ
INSERT INTO users (name, year, month, day, address, mail, tel, password, account_name, point)
VALUES
('伊藤一郎', '2004', '2', '29', '北海道札幌市', 'itou.itiro@risukiru.com', '111-2222-3333', 'itirohimitu', 'イチロー', 1000),
('伊藤二郎', '2024', '2', '28', '東京都新宿区', 'itou.jiro@risukiru.com', '000-0000-0000', 'jirohimitu', '二チロー', 2000)
;

-- languages テーブルにデータを挿入するクエリ
INSERT INTO customers (hotel_name, price, address, information, hotel_tel, hotel_room, image)
VALUES
-- 北海道
('定山渓ビューホテル',40000, '北海道札幌市南区定山渓温泉東2丁目', '札幌の奥座敷「定山渓」に佇む巨大スパ・リゾート。すべてのお客様に、楽しく、美味しく、心地よい寛ぎの時間を。', '011-598-3223', 100, 'hokkai_jouzankei.jpg'),
('定山渓万世閣ホテルミリオーネ',30000, '北海道札幌市南区定山渓温泉東2丁目', '湯の浮力に身を任せ全身の力を抜く寝湯を含む４つの内風呂と風を感じる庭園露天風呂。温泉ならではの柔らかな肌触りの湯に身体を沈めると、目の前には定山渓の山々。新緑、紅葉、冠雪、樹氷、空色に映える季節の移ろいがリラックスのときを静かに彩ります。男湯の荒々しい大海、女湯の野花を散りばめた壁画が印象的な和風呂もご用意しております。', '0570-08-3500', 200, 'hokkai_manseikaku.jpg'),
('鹿の湯',15000, '北海道札幌市南区定山渓温泉西3丁目32番地', '野生の鹿が傷を癒した、という云われからその名が付いた鹿の湯。定山渓の開湯当時から名湯と北の温泉文化を伝承老舗旅館ならではのおもてなし。末永く語り継がれるようなやすらぎの時間を、ごゆっくり。', '011-598-211', 300, 'hokkai_sika.jpg'),
('花もみじ',10000, '北海道札幌市南区定山渓温泉西3丁目', '定山渓温泉の老舗宿鹿の湯 別館、花もみじ。日本情緒あふれる佇まいの中に北海道ならではの感性と時代にふさわしいおもてなしが綾なしています。', '011-598-2311', 400, 'hokkai_hana.jpg'),
-- ('はるとの湯',2000,'北海道札幌市?????','格安で泊まれる宿及びお風呂になります。伊藤悠人が誠心誠意おもてなしいたします'),

-- 青森
('不老ふ死の湯',15000, '青森県西津軽郡深浦町舮作下清滝１５−１', '不老ふ死温泉の象徴ともいえる、海岸と一体化するようにしつらえられたひょうたん型の露天風呂。海までの距離は約1m、まさに遮るものが何もない絶景自慢の露天風呂です。空や海はもちろん、あたり一面が黄金色に染まる夕暮れ時の景色は圧巻です。', '0173-74-3500', 100, 'aomori_hurou.jpg'),
('極楽湯',10000, '青森県青森市東大野2丁目4-21', '温泉 : 天然温泉, ジェットバス, シェイプアップバス, 電気風呂, 水風呂, 青森桧葉湯, 遠赤外線タワーサウナ', '017-739-4126', 200, 'aomori_gokuraku.jpg'),
('蔦温泉旅館',15000, '青森県十和田市奥瀬蔦野湯１', '青森県の奥入瀬渓流入口の近くに佇む一軒宿、蔦温泉。久安三年には、既にこの地に湯治小屋があったことが文献に残っています。日本でも珍しい足元から湧き出てくる秘湯と、清らかな水が流れる大自然の息吹を感じながら、どこか懐かしいひとときをお過ごしください。', '0176-74-2311', 300, 'aomori_tsuta.jpg'),

-- 秋田
('田沢湖高原温泉郷 ・ 亀の井ホテル',15000, '秋田県仙北市田沢湖生保内字駒ヶ岳2-32', '美肌効果が期待できる、天然保湿成分のメタケイ酸が豊富な源泉。森林浴の後のような爽快感を感じさせる露天風呂に、広葉樹の四季の色づきが写り込む大浴場をお楽しみください。', '0187-46-2131', 100, 'akita_tazawako.jpg'),
('男鹿温泉',10000, '秋田県男鹿市北浦湯本字草木原21-2', 'ユネスコ無形文化遺産にも登録された国指定重要無形民俗文化財「男鹿のナマハゲ」を象徴とする温泉', '0185-33-3191', 200, 'akita_ogashi.jpg'),
('湯瀬温泉',10000, '秋田県鹿角市八幡平字湯瀬湯端43番地', '渓流のせせらぎが聴こえる露天風呂', '0186-33-2311', 300, 'akita_yuse.jpg'),

-- 宮城
('大江戸温泉物語 幸雲閣',9000, '宮城県大崎市鳴子温泉車湯17', 'クレンジング効果のある黒湯（本館）と保湿効果のある白湯（別館）の２つの温泉が堪能できる', '050-3538-5698', 100, 'miyagi_kounkaku.jpg'),
('名湯の宿 鳴子ホテル',15000, '宮城県大崎市鳴子温泉字湯元３６', '彩り豊かに透明、乳白色、うぐいす色など様々な色に変化する源泉かけ流しの湯は敷地内に3種の源泉を有しており、泉質の異なる湯が楽しめます', '0229-83-2001', 200, 'miyagi_naruko.jpg'),
('大江戸温泉物語 ますや',14000, '宮城県大崎市鳴子温泉字湯元82', '鳴子温泉郷の山河を一望する露天風呂とグルメバイキングを楽しむ温泉宿', '050-3538-5795', 300, 'miyagi_masuya.jpg'),

-- 岩手
('つなぎ温泉愛真館',30000, '岩手県盛岡市繋字塗沢40-4', '開湯900年盛岡の奥座敷 ・ 源義家も癒された歴史ある名泉', '019-689-2111', 100, 'iwate_aisinkan.jpg'),
('花巻温泉 ホテル 紅葉館',20000, '岩手県 花巻市 湯本1-125', '花巻温泉にご宿泊のお客様は、ホテル3館の湯めぐりを無料でお楽しみいただけます。岩露天風呂や岩盤露天風呂などをめぐるも良し、気に入ったお風呂に何度も入るのも良し、お好みのスタイルで湯めぐり三昧。', '0198-37-2111', 200, 'iwate_momijikan.jpg'),
('大沢温泉 山水閣',25000, '岩手県 花巻市 湯口大沢181', '大沢温泉山水閣は、洗練された近代建築の純和風旅館です。宴会場、会議室、カラオケBOX、お夜食処、リラクセーション施設は山水閣にございます。', '0198-25-2021', 300, 'iwate_sansuikaku.jpg'),

-- 福島
('くつろぎ宿 新滝',35000,'福島県会津若松市東山町湯本川向２２２','東山温泉の歴史は、千三百年前の僧・行基上人の発見により始まりました。それから絶えることなく岩盤から温泉が湧きいで、江戸時代には会津藩の湯治場として栄え、会津若松の奥座敷として発展したと伝わっています。当館には、そんな歴代の会津藩公の湯治場だった岩風呂をはじめ、戊辰戦争のときに土方歳三が刀傷を癒した猿の湯に由縁あるお風呂など、４種類の源泉かけ流しのお風呂がございます。','0242-26-0001', 100, 'hukushima_shintaki.jpg'),
('東山温泉 庄助の宿 瀧の湯',15000,'福島県会津若松市東山温泉108','会津の名所「伏見ヶ滝」を望む、絶景露天風呂と貸切風呂が自慢の湯宿です。東山温泉は「竹久夢二」や「与謝野晶子」などの文人墨客も訪れた温泉地で、東北三楽郷のひとつとして、山形のかみのやま温泉、湯野浜温泉とともに古くから親しまれています。','0242-29-1000', 200, 'hukushima_oboro.jpg'),
('水織音の宿 山水荘',15000,'福島県福島市土湯温泉町字油畑55','福島の美しい自然の中で二段の滝を眺めながら入る珍しい露天風呂。二層に分かれたダイナミックな大浴場など温泉の醍醐味がたっぷりと。','024-595-2141', 300, 'hukushima_sansui.jpg'),

-- 山形
('萬国屋',15000,'山形県鶴岡市湯温海丁１','庄内屈指の規模を誇る大浴場と庭園露天風呂。千年にも及ぶ長い間、湯治場として栄えてきました。松尾芭蕉、与謝野晶子などの文人墨客が数多く訪れた歴史ある名湯を、源泉かけ流しでお楽しみいただけます。','0570-00-8598', 100, 'yamagata_bankokuya.jpg'),
('ゆめみの宿 観松館',10000,'山形県最上郡最上町大堀９８７','江戸時代 ・ 戸沢藩（現在の新庄市）の城主の奥座敷として、瀬見温泉は栄えました。昔ながらの温泉情緒を残したたたずまいの里です。四季折々に趣を変える周りの山々、お部屋にいてもせせらぎが聞こえてくる清流小国川。ゆっくりとお過ごしください','0233-42-2311', 200, 'yamagata_kansyokan.jpg'),
('日本の宿 古窯',17000,'山形県上山市葉山5-20','古窯の湯めぐり みるみる美人のお化粧温泉と共に雄大な蔵王連峰と上山の夜景をお楽しみください','0570-00-5454', 300, 'yamagata_koyoga.jpg'),

-- 群馬
('草津温泉ホテル',28600, '群馬県吾妻郡草津町大字草津465-4', '草津の中でも最大級の温泉が自慢。標高1200ｍに広がる豊富な湯量と泉質のよさを誇る温泉地。', '279-88-1111', 100, 'gunma_kusatu.jpg'),
('みなかみホテルジュラク',42000, '群馬県利根郡みなかみ町湯原665', '400年以上昔、建明寺の和尚と村人みんなで掘り起こした宝の湯。幸せなホテルステイとなりますように、時間毎に変わるドリンク＆フード等をご用意しております。', '0278-72-2521', 200, 'gunma_juraku.jpg'),
('原源の宿 ホテル木暮',28800, '群馬県吾妻郡草津町大字草津465-4', '上州の山々を望む高台に湧く北関東最大級の湯殿、伊香保の源泉「黄金の湯」。 湧出したそのままの泉質で使用する源泉掛け流しの湯が、旅の疲れを癒やします。 たちこめる湯けむりの中、心まで解き放たれる至福のひとときを。', '0279-72-2701', 300, 'gunma_kogure.jpg'),

-- 千葉
('鴨川グランドホテル',18100, '千葉県鴨川市広場820', '海を見つめるリゾートホテル。太平洋を臨む絶景のリゾートホテル。「海」と「山」のアクティビィティが豊富に存在します。赤ちゃんにも優しい家族三世代で楽しむ温泉宿', '0288-77-0025', 100, 'tiba_kamo.jpg'),
('東京湯楽城',10000, '千葉県富里市七栄650-35', '東京八重洲駅から一駅直行！音と光のダイナミックな噴水ショー祭りやイルミネーションによる特別「水花火」、四季折々の映像、満点の星空がいっぱいで天井を彩るプロジェクションマッピング等別世界の空間で毎日から非日常へ。', '0476-91-6866', 200, 'tiba_yuraku.jpg'),
('ホテル川端',19800, '千葉県館山市西川名855', '南房総・館山の紺碧な海、大島、富士山、太平洋を望む海岸、鄙の地、鄙の宿心地よい潮風がお迎えを致します。 天然温泉、お風呂の後は房総の新鮮な素材をたっぷり使用した磯懐石風のお料理を堪能できます。', '0470-29-0341', 300, 'tiba_kawa.jpg'),

-- 東京
('三井ガーデンホテル豊洲プレミア',48100, '東京都江東区豊洲2-2-1', '黒を基調にしたシックな洗い場が備えられた内湯、外気を感じながら東京湾の夜景を一望できる外湯のどちらも広々とした浴槽で、手足を思いきりのばして浸かることができる。', '03-3534-3931', 100, 'tokyo_toyosu.jpg'),
('青梅石神温泉 清流の宿 おくたま路',58000, '東京都青梅市二俣尾2-371', '自然に囲まれた、五感を癒すリゾート旅館。都心より約1時間半の抜群のアクセスながら、奥多摩の美しい自然の景観と、清流・多摩川の眺望が旅人を非日常の空間に誘う宿。それが「おくたま路」です。', '0428-78-9711', 200, 'tokyo_okutama.jpg'),
('ラビスタ東京ベイ',35800, ' 東京都江東区豊洲6-4-40', '夜は、きらめく海とビルの光を眺めながら、 最上階の天然温泉大浴場でリフレッシュ。開放感あふれる露天風呂も完備。ビジネスや遊びの疲れを洗い流したあとは、 スタイリッシュな客室でリラックスタイム。', '03-5548-2001', 300, 'tokyo_rabisuta.jpg'),

-- 茨城
('筑波山ホテル 青木屋',15200, '茨城県つくば市筑波753-1', '屋上にある展望大浴場では昼は田園豊かな関東平野 夜は満天の星空を180度の大パノラマで一望できます', '029-866-0311', 100, 'ibaragi_aokiya.jpg'),
('久慈サンピア日立',26980, '茨城県日立市みなと町6-1', '天然鉱石の薬石光明石を使用した湯は柔らかく「活性の湯」と呼ばれるほど肌がつるつるになるのも魅力のひとつ。昇る朝日を見ながら一日をスタートすれば、旅の足も軽やかです。', '0294-53-8000', 200, 'ibaragi_kujisunpia.jpg'),
('悠久の宿滝美館',32000, '茨城県久慈郡大子町袋田21-1', '周辺には登山、ハイキングコース、久慈川の渓流釣りの他、観光名所が点在し、大子ゴルフコース、鷹彦スリーカントリーをはじめ、名門ゴルフ場も多数あります。日本三名瀑のひとつ「袋田の滝」は一番近いお宿で、歩いて３分程でお楽しみいただけます。', '0295-72-4181', 300, 'ibaragi_yukyunoyado.jpg'),

-- 神奈川
('大滝ホテル',14300, '神奈川県足柄下郡湯河原町宮上750-1', '敷地内から湧く良質で豊富な源泉と料理長が厳選した季節の素材を活かした山海の幸がお薦めです', '0465-62-7111', 100, 'kanagawa_otaki.jpg'),
('箱根湯本ホテル',14300, '神奈川県足柄下郡箱根町湯本茶屋97', '清流のせせらぎの音で眠り、小鳥のさえずりで目をさまし、見晴らしのよい各施設からは 箱根の自然を充分に楽しめるように設計されています。美しい渓谷に面し、静かな環境と完備した諸施設は 皆様を素敵な安らぎの時間へといざないます。', '0460-85-8800', 200, 'kanagawa_hakone.jpg'),
('ホテル眺望山荘',50880, '神奈川県足柄下郡湯河原町宮下698-25', '海・山・街が一望でき、まさに眺望山荘。オゾンをふんだんに含んだ自然が、都会の雑踏や仕事で疲れた心をやさしく包みます。', '0465-62-0816', 300, 'kanagawa_cyoubou.jpg'),

-- 埼玉
('長生館',21000, '埼玉県秩父郡長瀞町長瀞449', '当館は荒川のすぐ上に位置しており、大正13年に国の名勝・天然記念物に指定された長瀞渓谷を一望することができます。全ての客室と庭園が長瀞渓谷に面しており、四季折々の風景を楽しめます。', '0494-66-1115', 100, 'saitama_choseikan.jpg'),
('亀の井ホテル 長瀞寄居',26400, '埼玉県大里郡寄居町末野2267', '肌が潤う、まろやかな泉質。とろみのある天然温泉で湯浴みを満喫。最上階の展望露天風呂では、雄大な山並み、眼下に荒川や秩父鉄道、見上げれば満天の星空に癒されます。', '048-581-1165', 200, 'saitama_kamenoi.jpg'),
('ニューサンピア埼玉おこぜ',20000, '埼玉県入間郡越生町古池700', '周辺の散策路は緑一色、展望台からは越生(おごせ)の大自然が一望でき、日々の喧騒を忘れてのんびり過ごせます。','049-292-6111', 300, 'saitama_okoze.jpg'),

-- 栃木
('ホテル・フロラシオン那須',30800,'栃木県那須郡那須町大字高久丙1796', '那須の隠れ家へようこそ。四大美人泉質の温泉「美人の湯」と、ビュッフェスタイルのお食事とともに大自然に囲まれて、ゆっくりお寛ぎください','0287-76-6333', 100, 'totigi_nasu.jpg'),
('ホテル鬼怒川御苑',40320, '栃木県日光市藤原1-1', '渓谷美と優しいお湯に癒されるグルメバイキングが自慢の温泉ホテル。','050-3852-4766', 200, 'totigi_kinugawa.jpg'),
('日光 星の宿',56100, '栃木県日光市上鉢石町1115', '当館自慢の庭園は、ロビー、客室、温泉、食事処など様々な角度からご覧いただけます。美しい自然を感じながらのお食事は格別す。','0288-54-1105', 300, 'totigi_nikko.jpg'),

--京都
('宮津温泉 ホテル丹後/別館なかむら荘',6140,'京都府宮津市新浜1980-1','歴史ある町並みと復活した温泉','0772-22-4355', 100, 'kyoto_tango.jpg'),
('夕日ヶ浦 みのり温泉',18700,'京都府京丹後市網野町浜詰','全国にその名を馳せる美しい夕日は一生の思い出に','0772-74-9350', 200, 'kyoto_minori.jpg'),
('湯ノ花温泉 京ごはんと露天風呂の宿ゆのはな月や',23400,'京都府亀岡市稗田野町芦ノ山流田3-1','京の奥座敷に湧き出でる戦国武将の隠し湯','0771-22-5645', 300, 'kyoto_yunohana.jpg'),

--滋賀
('琵琶湖おごと温泉 天然源泉の宿 ことゆう',8800,'滋賀県大津市苗鹿3丁目9-5','風情ある水郷めぐりも楽しめる','077-577-3160', 100, 'siga_ogoto.jpg'),
('長浜太閤温泉- グランドメルキュール琵琶湖リゾート＆スパ',13000,' 滋賀県長浜市大島町38番地','黒壁スクエアの町並みと秀吉ゆかりの「子宝の湯」','0749-64-2000', 200, 'siga_nagahama.jpg'),
('るり温泉 琵琶湖ホテル',13500,'滋賀県大津市浜町2-40','日本最大の面積を誇る琵琶湖畔に湧く温泉','077-524-7111', 300, 'siga_ruri.jpg'),

--兵庫
('有馬温泉 有馬きらり',19000,'兵庫県神戸市北区有馬町 池の尻292-2','美しい桜も愛でられる「関西の奥座敷」','078-904-2295', 100, 'hyogo_arima.jpg'),
('城崎温泉 川口屋城崎リバーサイドホテル',19900,'兵庫県豊岡市城崎町湯島８８０−１','大谿川沿いが雰囲気抜群。外湯めぐりが楽しい文学の温泉街',' 0796-32-2611', 200, 'hyogo_jozaki.jpg'),
('湯村温泉 湯村温泉とみや',15000,'兵庫県美方郡新温泉町湯206-1','源泉の荒湯は98℃、川も湯になる豊富な湯量','0796-93-9999', 300, 'hyogo_yumura.jpg'),

--三重
('湯の山温泉 湯の山温泉グリーンホテル',20900,'三重県三重郡菰野町千草7054-173','美しい紅葉や多彩な高原植物も見られる温泉地',' 059-392-3110', 100, 'mie_yunoyama.jpg'),
('志摩・浜島温泉 プレミアリゾート夕雅伊勢志摩',12000,'三重県志摩市浜島町浜島1645','真珠発祥の地「英虞湾」に囲まれたリゾート','0599-53-1551', 200, 'mie_yuga.jpg'),
('鳥羽答志島 波音の宿中村屋',13200,'三重県鳥羽市答志町2137-3','古の都人も絶賛した海の幸を堪能','0599-37-2065', 300, 'mie_toba.jpg'),

--奈良
('洞川温泉 洞川温泉桝源旅館',13750,'奈良県吉野郡天川村洞川189','女性禁制の修験の山にある温泉','0747640316' ,100, 'nara_tenkawa.jpg'),
('信貴山温泉 信貴山観光ホテル',9900,'奈良県生駒郡三郷町信貴山西2-40','悠久の時間が流れる霊地に湧く温泉','0745-72-4801', 200, 'nara_sinki.jpg'),
('宝来温泉 奈良パークホテル',9900,'奈良県奈良市宝来4丁目18-1','悠久の歴史をたどる大和路の拠点','0742-44-5255', 300, 'nara_hourai.jpg'),

--大阪
('石切温泉 ホテルセイリュウ',10900,'大阪府東大阪市上石切町1丁目11-12','生駒山麓から望む大阪・神戸の夜景の湯','072-981-5001', 100, 'osaka_seiryu.jpg'),
('犬鳴山温泉 み奈美亭',9790,'大阪府泉佐野市大木2236','大阪市街地に近い大自然豊かな秘湯','072-459-7336', 200, 'osaka_inunaki.jpg'),
('関空温泉 関空温泉ホテルガーデンパレス',12980,'大阪府泉佐野市中町1丁目3-51','毎分約400Lの湧出量を誇る泉佐野市初の天然温泉','072-462-4026', 300, 'osaka_kanku.jpg'),

--和歌山
('南紀白浜温泉　ホテルサンリゾート白浜',9800,'和歌山県西牟婁郡白浜町堅田2500-185','日本三大古湯のひとつの海のリゾート','0739-82-2391', 100, 'waka_shirahama.jpg'),
('南紀勝浦温泉　亀の井ホテル',1400,'和歌山県田辺市目良24-1','世界遺産と温泉の町','0739-24-2900', 200, 'waka_katuura.jpg'),
('龍神温泉　季楽里龍神',15950,'和歌山県田辺市龍神村龍神189','秘境の地に湧く歴史ある“日本三美人の湯','0739-79-0331', 300, 'waka_ryujin.jpg'),

--鳥取県
('三朝温泉 三朝ロイヤルホテル',9900,'鳥取県東伯群三朝町三朝365-1','世界有数のラドン含有量の湯を満喫','0858-43-0431', 100, 'tottori_santyo.jpg'),
('皆生温泉 三井別館',9000,'鳥取県米子市皆生温泉3-12-33','海の資源がもたらす快適性を利用して心身を癒す','0859-31-1100', 200, 'tottori_sani.jpg'),
('はわい温泉 千年亭',13700,'鳥取県東伯郡湯梨浜町はわい温泉5-22','美しい東郷湖の湖底から湧き出る温泉','0858-35-4052', 300, 'tottori_hawai.jpg'),

--島根県
('玉造温泉 松乃湯',15400,'島根県松江市玉湯町玉造255番地','湯の町の情あふれる…〝神の湯〟と呼ばれる美肌の聖地','0852-62-0634', 100, 'simane_matu.jpg'),
('松江しんじ湖温泉 松平閣',16500,'島根県松江市千鳥町83','宍道湖北岸、古都「松江」に湧く良泉','0852-21-6195', 200, 'simane_sinji.jpg'),
('美又温泉 かめや旅館',17500,'島根県浜田市金城町追原11番乙地','「日本一の美人湯」との評判も高い川沿いの温泉','0855-42-1686', 300, 'simane_kameya.jpg'),

--岡山県
('湯郷温泉 湯郷グランドホテル',14000,'岡山県美作市湯郷566-1','「白鷺伝説」残る古湯と山の味覚を堪能','0868-72-0374', 100, 'okayama_yunogou.jpg'),
('湯原温泉 八景',17800,'岡山県真庭市湯原温泉','全国露天風呂番付「西の横綱」と称される砂湯がある温泉','0867-62-2526', 200, 'okayama_hakkei.jpg'),
('たまの温泉 ダイヤモンド瀬戸内マリンホテル',12000,'岡山県玉野市築港１丁目１−１１','温暖な瀬戸内の浜辺に湧く天然泉','0836-81-2111', 300, 'okayama_daiyamondo.jpg'),

--広島県
('宮浜温泉 安芸グランドホテル',20300,'広島県廿日市市宮浜温泉','瀬戸内の美味を肴に安芸の美酒に酔いしれる','0829-30-3533', 100, 'hiroshima_aki.jpg'),
('鞆の浦温泉 景勝館 漣亭',20000,'広島県福山市鞆町鞆136','景勝地・鞆の浦に湯けむり上げる効能高き良泉','0849-82-1123', 200, 'hiroshima_sazanami.jpg'),
('きのえ温泉 ホテル清風館',18000,'広島県豊田郡大崎上島町沖浦１９００','美しい瀬戸内海の景色を眺望できる温泉','0846-62-0555', 300, 'hiroshima_seihu.jpg'),

--山口県
('萩温泉 萩観光ホテル',14300,'山口県萩市椿東6089-4','城下町も楽しみな効能豊かな湯をどうぞ','083-827-599', 100, 'yamaguti_hagi.jpg'),
('長門湯本温泉 大山谷荘',29700,'山口県長門市深川湯本1257','自然やパワースポットに触れられる温泉地','0837-25-3611', 200, 'yamaguti_nagato.jpg'),
('湯田温泉 名勝 山水園',18700,'山口県山口市湯田温泉5丁目2-20','維新の志士が集い、奇才が愛したいで湯','083-920-3000', 300, 'yamaguti_yuda.jpg'),

--香川県
('塩江温泉 新樺川観光ホテル',6500,'香川県高松市塩江町','名僧・行基ゆかりの山あいの温泉地','0878-93-0148', 100, 'kagawa_shionoe.jpg'),
('こんぴら温泉郷 紅梅亭',18000,'香川県仲多度郡琴平町685-21','1368段の石段を登るこんぴら詣と名湯を満喫','0877-75-3500', 200, 'kagawa_koubai.jpg'),
('小豆島温泉 小豆島国際ホテル',11000,'香川県小豆郡土庄町銀波浦甲24-67','オリーブと『二十四の瞳』の島に湧く温泉','0879-62-2111', 300, 'kagawa_syodo.jpg'), 

--徳島県
('大歩危温泉 峡谷の湯宿 大歩危峡まんなか',8000,'徳島県三好市山城町西宇1259-1','化粧水要らずの強アルカリ、美肌泉','088-384-2111', 100, 'tokushima_oboke.jpg'),
('神山温泉 神山温泉ホテル四季の里',14000,'徳島県名西郡神山町神領本上角80-2','西日本で屈指の名湯を誇る佇まいの里中温泉','088-676-1117', 200, 'tokushima_kamiyama.jpg'),
('月ヶ谷温泉 月の宿',12600,'徳島県勝浦郡上勝町福原平間７１−１','弘法大師ゆかりの温泉と地産地消の会席が魅力','088-546-0203', 300, 'tokushima_tuki.jpg'),

--愛媛県
('道後温泉 大和屋本店',19800,'愛媛県松山市道後湯之町5番6号','「道後温泉本館」に代表される3000年の歴史を誇る名湯','089-935-8880', 100, 'ehime_yamatoya.jpg'),
('奥道後温泉 奥道後壱湯の守',15400,'愛媛県松山市末町２６７','美肌を作るアルカリ泉と豊かな自然に癒される','089-977-1111', 200, 'ehime_itiyu.jpg'),
('鈍川温泉 皆楽荘',11000,'愛媛県今治市玉川町鈍川276','「伊予の仙境」に湧き出る美人の湯','089-855-2211', 300, 'ehime_kairakusou.jpg'), 

--高知県
('あしずり温泉郷 ホテル足摺園',12000,'高県土佐清水市足摺岬４７８−５','南国情緒漂う、海と自然に抱かれた温泉郷','0880-88-0331', 100, 'kouti_ashizuri.jpg'),
('三翠園温泉 高知城下の天然温泉 三翠園',12000,'高知県高知市鷹匠町1-3-35','重要文化財が現存！名宿に湧く高知県初の天然高温泉','0888-22-0138', 200, 'kouti_sansui.jpg'),
('土佐龍温泉 三陽荘',14300,'高知県土佐市宇佐町竜５０４−１','塩分が含まれ保温効果に優れた『黄金の湯』','0120-15-4592', 300, 'kouti_sanyo.jpg'),

-- 富山　　　
('リバーリトリート雅樂倶',30500, '富山県富山市春日56-2', '神通峡を望むロケーション、館内外にあふれるアート、豊富な富山の地の食材を使用したお料理、良質な温泉・・・', '076-467-5550', 100, 'toyama_garaku.jpg'),
('庄川温泉郷 大牧温泉',43000, '富山県南砺市利賀村大牧44', '船でしか行けない秘境の一軒宿', '0763-82-0363', 200, 'toyama_omaki.jpg'),
('天然温泉剱の湯 御宿 野乃',11000, '富山県富山市総曲輪3丁目9-2', '天然温泉檜風呂がある客室', '076-421-5489', 300, 'toyama_nono.jpg'),

-- 石川　　　
('山代温泉 ゆのくに天祥',34000, '石川県加賀市山代温泉19-49-1', '開湯1300年。北陸随一のいで湯の街 山代温泉。', '0761-77-1234', 100, 'ishi_yunokuni.jpg'),
('山代温泉 瑠璃光',43000, '石川県加賀市山代温泉19-58-1', '加賀温泉郷の伝統や文化に立脚した、温泉旅館本来のおもてなしを大切に。','0761-77-2323', 200, 'ishi_ruri.jpg'),
('山中温泉 吉祥やまなか',40000, '石川県加賀市山中温泉東町一丁目ホ14-3', '加賀の贅を尽くした寛ぎを。', '0761-78-5656', 300, 'ishi_yamanaka.jpg'),

-- 福井　
('あわら温泉 清風荘',70000, '福井県あわら市温泉3丁目 803', '北陸最大級の庭園露天風呂。', '0776-77-2500', 100, 'hukui_awara.jpg'),
('越前海岸 はまゆう 松石庵',22000, '福井県丹生郡越前町茂原5-40-1', '雄大な日本海の景色を眺めながら、越前南部温泉に浸かる。', '0778-39-1230', 200, 'hukui_etizen.jpg'),
('糸生温泉 泰澄の杜',16300, '福井県丹生郡越前町小倉88-55-1', '小鳥がさえずり、青空と木々の香りに包みこまれるような開放感のある露天風呂。', '0778-34-2322', 300, 'hukui_ito.jpg'),

-- 長野　
('信州別所温泉 玉屋旅館',35000, '長野県上田市別所温泉227', '平安の世より「美人の湯」として語りつがれる別所温泉。', '0268-38-3015', 100, 'nagano_gyokuya.jpg'),
('上諏訪温泉 双泉の宿 朱白',27000, '長野県諏訪市湖岸通り3-2-2', '上諏訪温泉で唯一、二つの源泉を有する宿。', '0266-52-2660', 200, 'nagano_sousen.jpg'),
('浅間温泉 錦の湯 地本屋',14000, '長野県松本市浅間温泉3-14-6', '1300年の歴史を支え続けている温泉場。', '0263-46-2332', 300, 'nagano_nishiki.jpg'),

-- 岐阜
('下呂温泉 湯之島館',35800, '岐阜県下呂市湯之島645番地', '昭和6年創業、国登録有形文化財の宿。', '0576-25-4126', 100, 'gihu_gero.jpg'),
('飛騨高山温泉 宝生閣',30000, '岐阜県高山市馬場町1-88', '高山の古都を見晴らす絶景。', '0577-34-0700', 200, 'gihu_hosyokaku.jpg'),
('長良川温泉 石金',17600, '岐阜県岐阜市長良112', '穏やかに佇む金華山と岐阜城を眺めながら入っていただく温泉は、「日本の温泉100選」にも選ばれた自慢の温泉。', '058-231-8156', 300, 'gihu_ishikin.jpg'),

-- 静岡
('熱海温泉 湯宿一番地',26000, '静岡県熱海市春日町1-2', '湯宿一番地の温泉のこだわりと、古より伝われてきた名湯熱海温泉。', '0557-81-3651', 100, 'sizu_atami.jpg'),
('伊東温泉 暖香園',13200, '静岡県伊東市竹の内1-3-6', '豊富な湧出量を誇る、名湯「伊東温泉」。', '0557-37-0011', 200, 'sizu_dankoen.jpg'),
('伊豆長岡温泉 三養荘',79700, '静岡県伊豆の国市ままの上270', '離宮にいるような、至福の滞在。', '055-947-1111', 300, 'sizu_izu.jpg'),

-- 愛知
('西浦温泉 旬景浪漫 銀波荘',37400, '愛知県蒲郡市西浦町大山25', '絶景温泉に癒され、三河の美味を五感で楽しむ宿。', '0533-57-1515', 100, 'aiti_nishiura.jpg'),
('三谷温泉 松風園',22000, '愛知県蒲郡市三谷町鳶欠14-4', '穏やかに晴れ渡る空と海、刻々と色を変えていく美しい夕陽と眼前の海。', '0533-68-6611', 200, 'aiti_mitani.jpg'),
('南知多温泉郷 源氏香 ',26400, '愛知県知多郡南知多町山海屋敷103', '南知多温泉郷、薫りでもてなす和風旅苑。', '0569-62-3737', 300, 'aiti_genji-koh.jpg'),

-- 福岡
('原鶴グランドスカイホテル',20710, '福岡県朝倉市杷木久喜宮1820-1', '(弱)アルカリ性単純温泉と(単純)硫黄泉の「W美肌の湯」で美肌効果が期待できます', '050-1807-3059', 100, 'hukuoka_haraduru.jpg'),
('桑之屋',27500, '福岡県うきは市浮羽町古川1099-10', '筑後川を眺めながら、源泉100%の露天風呂でゆっくりお過ごしいただけます', '0943-77-2148', 200 ,'hukuoka_kuwanoya.jpg'),
('二日市温泉大丸別荘',44000, '福岡県筑紫野市湯町1丁目20-1', '大正亭・平安亭・昭和亭・蓮魚庵──雰囲気の異なる四種のお部屋で、心ゆくまでおくつろぎください', '092-924-3939', 300, 'hukuoka_hutukaiti.jpg'),

-- 大分
('古都の花心',39220, '大分県由布市湯布院町川上1017-5', '温泉は全て貸し切りとなっており、入浴中の札を掛け、中から鍵をかけてご入浴いただけます', '0977-85-4557', 100, 'oita_hana.jpg'),
('大江戸温泉物語 別府清風',56628, '大分県別府市北浜2丁目12-21', 'オーシャンビューの絶景露天風呂で、ゆっくりお休みいただけます', '050-3852-4437', 200, 'oita_beppu.jpg'),
('ゆふいん湯平温泉 山荘松屋',32300, '大分県由布市湯布院町大字湯平803-1', '弱塩泉の内湯・露天風呂は全て貸し切り無料にてご利用いただけます', '0977-86-2151', 300, 'oita_matuya.jpg'),

-- 宮崎
('青島グランドホテル',20600, '宮崎市青島1-16-64', '日本でも珍しい畳敷きの温泉「大名露天」で、大海原を眺めながら休息の時間をお過ごしください', '0985-65-0111', 200, 'miyazaki_aoshima.jpg'),
('ホテル日南北郷リゾート',24640, '宮崎県日南市北郷町郷之原甲2821-1', '神経痛／筋肉痛／関節痛などに効くナトリウム炭酸水素塩・塩化物温泉で、お客様のお身体を癒すことができます', '0987-55-3333', 100, 'miyazaki_nitinankitagou.jpg'),
('常盤荘',24000, '宮崎県都城市山田町中霧島2455-2', 'スタンダードな東館客室か露天風呂付客室、以上2種のお部屋をご用意してお待ちしております', '0986-64-2246', 300, 'miyazaki_tokiwaso.jpg'),

-- 熊本
('熊本・山鹿温泉 富士ホテル',39800, '熊本県山鹿市昭和町506', '泉質はラジウムを含んだ弱アルカリ性で、まろやかな肌触りの湯を全館で体験いただけます', '0968-43-4146', 100, 'kumamoto_yamaga.jpg'),
('黒川温泉',79200, '熊本県阿蘇郡南小国町満願寺6608', '穴風呂と呼ばれる、洞窟の中に掘られた温泉が自慢です', '0967-44-0916', 200, 'kumamoto_kurokawa.jpg'),
('ホテルグリーンピア南阿蘇',20900, '熊本県阿蘇郡南阿蘇村久石4411-9', '阿蘇五岳を臨むお部屋と温泉で、旅の疲れをゆっくりと癒すことができます', '0967-67-2131', 300, 'kumamoto_minamiaso.jpg'),

-- 鹿児島
('霧島国際ホテル',98000, '鹿児島県霧島市牧園町高千穂3930番地12', '趣の異なる源泉掛け流しの天然温泉を、10種類以上ご用意してお待ちしております', '0995-78-2621', 100, 'kago_kirishima.jpg'),
('鹿児島 砂むし温泉 指宿白水館',67000, '鹿児島県指宿市東方12126-12', '指宿特有の砂むし温泉・江戸時代のお風呂を再現した元禄風呂にて癒しの時間をお過ごしください', '0993-22-3131', 200, 'kago_sunamushi.jpg'),
('さくらさくら温泉', 29000, '鹿児島県霧島市霧島田口2324-7', '天然掛け流しで乳白色の硫黄泉は、全国的にも珍しい弱酸性の天然泥湯です。お料理にもこだわり、心を込めて皆様をおもてなしいたします。', '0995-57-1227', 300, 'kago_sakura.jpg'),

-- 佐賀
('富士ビラ 山華の正',35600, '佐賀県佐賀市富士町大字小副川2208-1', '地下から湧き出る温泉「美人の湯」は日本屈指のアルカリ性泉質で、内風呂と露天風呂の両方でご堪能いただけます', '0952-58-2120', 100, 'saga_sanga.jpg'),
('セントラルホテル武雄温泉駅前',10140, '佐賀県武雄市武雄町昭和16-12', '高アルカリ性の重曹を含む泉質での低刺激な温泉で、お子様からご高齢者様まで安心してご利用いただけます', '0954-20-1234', 200, 'saga_takeo.jpg'),
('和多屋別荘',132000, '佐賀県嬉野市嬉野町下宿乙738', '泉質は、美肌に効果があるといわれる無色透明の「重曹泉」で、成分にナトリウムが多く含まれているため、角質化した皮膚をなめらかにしてくれます', '0954-23-6161', 300, 'saga_wataya.jpg'),

-- 長崎
('雲仙スカイホテル',34000, '長崎県雲仙市小浜町雲仙323-1', '「絹笠の湯」と「白雲の湯」の2種の露天・大浴場をご利用いただけます', '0957-73-3345', 100, 'nagasaki_sky.jpg'),
('平戸海上ホテル',24000, '長崎県平戸市大久保町2231-3', '露天風呂は海に面しており、朝日を眺めながらご入浴いただけます', '0950-22-3800', 200, 'nagasaki_hirato.jpg'),
('雲仙温泉 青雲荘',29600, '長崎県雲仙市小浜町雲仙500-1', '「美肌の湯」と呼ばれる乳白色のお湯を、雲仙の大自然に囲まれながらご堪能いただけます', '0957-73-3273', 300, 'nagasaki_seiun.jpg'),

-- 沖縄
('HOTEL SANSUI NAHA 琉球温泉 波之上の湯', 10000, '沖縄県那覇市辻2丁目25番-1', 'じゃらんnetランキング第１位 ・ 天然温泉とシースループールを完備した那覇空港に最も近いアーバンリゾート', '0120-996-941', 100, 'okinawa_sansui.jpg'),
('シギラベイサイドスイートアラマンダ', 20000, '沖縄県宮古島市上野新里926-25', '日常とは異なるゆるやかな時間がこのホテルには流れています。風にそよぐ南国の木々や花々。ウミガメが悠々と泳ぐラグーン。テラスからは、視界いっぱいに広がる青い海。五感を通じて得られるすべての体験が宮古島の記憶として刻まれていきます。', '0980-74-7100', 200, 'okinawa_aramanda.jpg'),
('琉球温泉 瀬長島ホテル', 15000, '沖縄県豊見城市字瀬長174-5', '琉球温泉龍神の湯 ・ 沖縄県瀬長島の地下1,000mから湧き出る天然温泉を贅沢に使用した大露天風呂で青々とした沖縄の空と海の雄大なロケーション、那覇空港第二滑走路に着陸する迫力のある飛行機、慶良間諸島に沈む夕陽やきらめく星空などの絶景をお楽しみください。', '0120-504-209', 300, 'okinawa_senagajima.jpg');

-- reservations テーブルにデータを挿入するクエリ
INSERT INTO reservations (user_id, hotel_id, price, hotel_day, checkIn, human)
VALUES
(1, 1, 40000, '2024-11-30', '11',1),
(2, 4, 10000, '2025-12-30', '12',2);

-- stars テーブルにデータを挿入するクエリ
INSERT INTO stars (user_id, hotel_id, evalue, star)
VALUES
(1, 1, '素晴らしいホテルでした',5);

-- favorites テーブルにデータを挿入するクエリ
INSERT INTO favorites (user_id, hotel_id)
VALUES
(1, 1);

-- coupons テーブルにデータを挿入するクエリ
INSERT INTO coupons (user_id, hotel_id, coupon)
VALUES
(1, 1, '5％引きクーポン');

-- zerorooms 
INSERT INTO zerorooms (hotel_id, room_id)
VALUES 
(1,1);
