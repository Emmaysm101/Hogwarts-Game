import java.io.*;
import java.util.*;
import java.lang.*;

public class Final{
    static String CLS = "\033[2J\033[1;1H";
    static String Red = "\033[31;1m";
    static String Green = "\033[32;1m";
    static String Yellow = "\033[33;1m";
    static String Blue = "\033[34;1m";
    static String Purple = "\033[35;1m";
    static String Cyan = "\033[36;1m";
    static String White = "\033[37;1m";
    static String Normal = "\033[0m";

    static ArrayList<Room> vertex = new ArrayList<Room>();
    static ArrayList<Room> path = new ArrayList<Room>();

    public static void main(String[] args) throws IOException {
        Scanner in = new Scanner(System.in);
        File file = new File("vertex.txt");
        Scanner infile = new Scanner(file);
        String input = "";
        while (infile.hasNextLine()) {
            input = infile.nextLine();
            vertex.add(new Room(input));
        }

        file = new File("edge.txt");
        infile = new Scanner(file);
        String from, direction, to;
        int count = 0;
        while (infile.hasNext()) {
            count++;
            from = infile.next();
            direction = infile.next();
            to = infile.next();

            int indexFrom = 0;

            while (!vertex.get(indexFrom).roomName.equals(from)) {
                indexFrom++;
            }
            int indexTo = 0;
            while (!vertex.get(indexTo).roomName.equals(to)) {
                indexTo++;
            }
            if (direction.equals("north")) {
                vertex.get(indexFrom).north = vertex.get(indexTo);
                vertex.get(indexTo).south = vertex.get(indexFrom);
            }
            if (direction.equals("south")) {
                vertex.get(indexFrom).south = vertex.get(indexTo);
                vertex.get(indexTo).north = vertex.get(indexFrom);
            }
            if (direction.equals("east")) {
                vertex.get(indexFrom).east = vertex.get(indexTo);
                vertex.get(indexTo).west = vertex.get(indexFrom);
            }
            if (direction.equals("west")) {
                vertex.get(indexFrom).west = vertex.get(indexTo);
                vertex.get(indexTo).east = vertex.get(indexFrom);
            }
        }
        introScreen();
        System.out.println(vertex.size() + " vertices read from file");
        System.out.println(count + " edges read from file");
        System.out.print(Green+"Press <Enter> to continue"+Normal);
        String enter = in.nextLine();
        System.out.print(CLS);


        //Loop to step through castle
        Room t = vertex.get(0);
        char choice = ' ';
        int wand = 0, magicLevel = 0, stone = 0;
        while (choice != 'q') {
            System.out.println(Blue+"You are in room: "+Yellow + t.roomName+Normal);
            if (t == vertex.get(0) || t == vertex.get(3) || t == vertex.get(6) || t == vertex.get(8)){
                System.out.println("----------------------------------------");
                System.out.println("|                                      |");
                System.out.println("|                                      |");
                System.out.println("|                                      |");
                System.out.println("|                                      |");
                System.out.println("|                                      |");
                System.out.println("-------------|          |---------------");
            }
            else if (t == vertex.get(1) || t == vertex.get(12) || t == vertex.get(7) || t == vertex.get(20)){
                System.out.println("-------------|          |---------------");
                System.out.println("|                                      |");
                System.out.println("-                                      -");
                System.out.println("                                        ");
                System.out.println("-                                      -");
                System.out.println("|                                      |");
                System.out.println("-------------|          |---------------");
            }
            else if (t == vertex.get(11)){
                System.out.println("-------------|          |---------------");
                System.out.println("|                                      |");
                System.out.println("|                                      |");
                System.out.println("|                                      |");
                System.out.println("|                                      |");
                System.out.println("|                                      |");
                System.out.println("-------------|          |---------------");
            }
            else if (t == vertex.get(2) || t == vertex.get(5)){
                System.out.println("-------------|          |---------------");
                System.out.println("|                                      |");
                System.out.println("-                                      -");
                System.out.println("                                        ");
                System.out.println("-                                      -");
                System.out.println("|                                      |");
                System.out.println("----------------------------------------");
            }
            else if (t == vertex.get(4)){
                System.out.println("----------------------------------------");
                System.out.println("|                                      |");
                System.out.println("|                                      -");
                System.out.println("|                                       ");
                System.out.println("|                                      -");
                System.out.println("|                                      |");
                System.out.println("----------------------------------------");
            }
            else if (t == vertex.get(9)) {
                System.out.println("-------------|          |---------------");
                System.out.println("|                                      |");
                System.out.println("|                                      |");
                System.out.println("|                                      |");
                System.out.println("|                                      |");
                System.out.println("|                                      |");
                System.out.println("----------------------------------------");
            }
            else if (t == vertex.get(10) || t == vertex.get(19) || t == vertex.get(21)){
                System.out.println("----------------------------------------");
                System.out.println("|                                      |");
                System.out.println("-                                      |");
                System.out.println("                                       |");
                System.out.println("-                                      |");
                System.out.println("|                                      |");
                System.out.println("----------------------------------------");
            }
            else if (t == vertex.get(13)) {
                System.out.println("----------------------------------------");
                System.out.println("|                                      |");
                System.out.println("-                                      -");
                System.out.println("                                        ");
                System.out.println("-                                      -");
                System.out.println("|                                      |");
                System.out.println("-------------|          |---------------");
            }
            else if (t == vertex.get(14) || t == vertex.get(17) || t == vertex.get(24) || t == vertex.get(23) || t == vertex.get(18)){
                System.out.println("----------------------------------------");
                System.out.println("|                                      |");
                System.out.println("-                                      -");
                System.out.println("                                        ");
                System.out.println("-                                      -");
                System.out.println("|                                      |");
                System.out.println("----------------------------------------");
            }
            else if (t == vertex.get(15)){
                System.out.println("----------------------------------------");
                System.out.println("|                                      |");
                System.out.println("|                                      -");
                System.out.println("|                                       ");
                System.out.println("|                                      -");
                System.out.println("|                                      |");
                System.out.println("-------------|          |---------------");
            }
            else if (t == vertex.get(22)) {
                System.out.println("-------------|          |---------------");
                System.out.println("|                                      |");
                System.out.println("-                                      |");
                System.out.println("                                       |");
                System.out.println("-                                      |");
                System.out.println("|                                      |");
                System.out.println("----------------------------------------");
            }
            else if (t == vertex.get(16)){
                System.out.println("-------------|          |---------------");
                System.out.println("|                                      |");
                System.out.println("|                                      -");
                System.out.println("|                                       ");
                System.out.println("|                                      -");
                System.out.println("|                                      |");
                System.out.println("----------------------------------------");
            }

            System.out.println(Red+"n,s,w,e"+Normal+"= move  "+Red+"f"+Normal+"= finding path"+Red+"  q"+Normal+"=quit");
            System.out.print("Enter command: ");
            choice = in.nextLine().charAt(0);
            if (choice == 's' && t.south != null) {
                t = t.south;
            } else if (choice == 'n' && t.north != null) {
                t = t.north;
            } else if (choice == 'w' && t.west != null) {
                t = t.west;
            } else if (choice == 'e' && t.east != null) {
                t = t.east;
            } else if (choice == 'f') {
                int n;
                System.out.println(Red+"0"+Normal+" = EntranceOfHogwarts");
                System.out.println(Red+"1"+Normal+" = MainHall");
                System.out.println(Red+"2"+Normal+" = GreatHall");
                System.out.println(Red+"3"+Normal+" = CommonRoom");
                System.out.println(Red+"4"+Normal+" = Kitchen");
                System.out.println(Red+"5"+Normal+" = Courtyard");
                System.out.println(Red+"6"+Normal+" = Hagrid'sHut");
                System.out.println(Red+"7"+Normal+" = BroomstickPractice");
                System.out.println(Red+"8"+Normal+" = Greenhouse");
                System.out.println(Red+"9"+Normal+" = QuidditchPitch");
                System.out.println(Red+"10"+Normal+" = WhompingWillow");
                System.out.println(Red+"11"+Normal+" = TrophyRoom");
                System.out.println(Red+"12"+Normal+" = Library");
                System.out.println(Red+"13"+Normal+" = Transfiguration");
                System.out.println(Red+"14"+Normal+" = HistoryOfMagic");
                System.out.println(Red+"15"+Normal+" = Herbology");
                System.out.println(Red+"16"+Normal+" = DefenceAgainstDarkArt");
                System.out.println(Red+"17"+Normal+" = Potions");
                System.out.println(Red+"18"+Normal+" = Charms");
                System.out.println(Red+"19"+Normal+" = Teacher'sRoom");
                System.out.println(Red+"20"+Normal+" = Tower");
                System.out.println(Red+"21"+Normal+" = Dumbledore'sOffice");
                System.out.println(Red+"22"+Normal+" = Owlry");
                System.out.println(Red+"23"+Normal+" = SecretHallway");
                System.out.println(Red+"24"+Normal+" = SecretChamber");
                System.out.println(Red+"25"+Normal+" = RoomOfRequirement");
                System.out.println(Green+"Enter the room name number that you are looking for"+Normal);
                n = in.nextInt();
                if (n >= 0 && n<=25) {
                    Dijkstra(t, vertex.get(n));
                    System.out.println("The shortest path to go to " + vertex.get(n).roomName + " is");
                    for (int i = 0; i < path.size(); i++) {
                        System.out.print(Blue +"\t" + path.get(i).roomName + Normal);
                    }
                }
                else
                    System.out.println(Red+"Incorrect input!!!"+Normal);
                System.out.println();
                in.nextLine();
            }
            if (t == vertex.get(10)){
                wand =1 ;
                System.out.println(Red+"You got the wand!"+Normal);
            }
            if (t == vertex.get(13)){
                int selection=0;
                while (selection !=9) {
                    System.out.println(Yellow+"************************************************"+Normal);
                    System.out.println("If you pass the test, you can get a magic point");
                    System.out.println("What form does Mcgonagall turn into during Harry's first transfiguration class?");
                    System.out.println(Red+"1"+Normal+".Hamster"+Red+"    2"+Normal+".Owl"+Red+"    3"+Normal+".Cat    (If you want to pass "+Red+"9"+Normal+".Exit)");
                    System.out.println(Yellow+"************************************************"+Normal);
                    System.out.print("Chose a number: ");
                    selection = in.nextInt();
                    if (selection == 3) {
                        System.out.println(Yellow+"Correct answer!"+Normal);
                        magicLevel += 1;
                        System.out.println(Blue+"Your magic level is "+Yellow + magicLevel+Normal);
                        in.nextLine();
                        break;
                    } else if (selection == 1 || selection == 2){
                        System.out.println(Yellow+"Your answer is wrong."+Normal);
                        in.nextLine();
                    }
                    else {
                        in.nextLine();
                        break;
                    }
                }
            }
            if (t == vertex.get(14)){
                int selection = 0;
                while (selection != 9) {
                    System.out.println(Yellow+"************************************************"+Normal);
                    System.out.println("If you pass the test, you can get a magic point");
                    System.out.println("Which Hogwarts founder created the Chamber of Secrets?");
                    System.out.println(Red+"1"+Normal+".Salazar Slytherin"+Red+"    2"+Normal+".Rowena Ravenclaw"+Red+"    3"+Normal+".Godric Gryffindor    (If you want to pass "+Red+"9"+Normal+".Exit)");
                    System.out.println(Yellow+"************************************************"+Normal);
                    System.out.print("Chose a number: ");
                    selection = in.nextInt();
                    if (selection == 1) {
                        System.out.println(Yellow+"Correct answer!"+Normal);
                        magicLevel += 1;
                        System.out.println(Blue+"Your magic level is "+Yellow + magicLevel+Normal);
                        in.nextLine();
                        break;
                    } else if (selection == 3 || selection == 2){
                        System.out.println(Yellow+"Your answer is wrong."+Normal);
                        in.nextLine();
                    }
                    else {
                        in.nextLine();
                        break;
                    }
                }
            }
            if (t == vertex.get(15)){
                int selection = 0;
                while (selection != 9) {
                    System.out.println(Yellow+"************************************************"+Normal);
                    System.out.println("If you pass the test, you can get a magic point");
                    System.out.println("Who gives Harry the gillyweed before the second test?");
                    System.out.println(Red+"1"+Normal+".Dobby"+Red+"    2"+Normal+".Hermione"+Red+"    3"+Normal+".Malfoy    (If you want to pass "+Red+"9"+Normal+".Exit)");
                    System.out.println(Yellow+"************************************************"+Normal);
                    System.out.print("Chose a number: ");
                    selection = in.nextInt();
                    if (selection == 1) {
                        System.out.println(Yellow+"Correct answer!"+Normal);
                        magicLevel += 1;
                        System.out.println(Blue+"Your magic level is "+Yellow + magicLevel+Normal);
                        in.nextLine();
                        break;
                    } else if (selection == 3 || selection == 2){
                        System.out.println(Yellow+"Your answer is wrong."+Normal);
                        in.nextLine();
                    }
                    else {
                        in.nextLine();
                        break;
                    }
                }
            }
            if (t == vertex.get(16)){
                int selection = 0;
                while (selection != 9) {
                    System.out.println(Yellow+"************************************************"+Normal);
                    System.out.println("If you pass the test, you can get a magic point");
                    System.out.println("What's the best spell to use against a boggart?");
                    System.out.println(Red+"1"+Normal+".Levicorpus"+Red+"    2"+Normal+".Riddikulus"+Red+"    3"+Normal+".Avada Kedavra    (If you want to pass "+Red+"9"+Normal+".Exit)");
                    System.out.println(Yellow+"************************************************"+Normal);
                    System.out.print("Chose a number: ");
                    selection = in.nextInt();
                    if (selection == 2) {
                        System.out.println(Yellow+"Correct answer!"+Normal);
                        magicLevel += 1;
                        System.out.println(Blue+"Your magic level is "+Yellow + magicLevel+Normal);
                        in.nextLine();
                        break;
                    } else if (selection == 1 || selection == 3){
                        System.out.println(Yellow+"Your answer is wrong."+Normal);
                        in.nextLine();
                    }
                    else {
                        in.nextLine();
                        break;
                    }
                }
            }
            if (t == vertex.get(17)){
                int selection = 0;
                while (selection != 9) {
                    System.out.println(Yellow+"************************************************"+Normal);
                    System.out.println("If you pass the test, you can get a magic point");
                    System.out.println("What's one side effect of using Pepperup Potion?");
                    System.out.println(Red+"1"+Normal+".You fart loads"+Red+"    2"+Normal+".Steam comes out of your ears"+Red+"    3"+Normal+".You sneeze constantly    (If you want to pass "+Red+"9"+Normal+".Exit)");
                    System.out.println(Yellow+"************************************************"+Normal);
                    System.out.print("Chose a number: ");
                    selection = in.nextInt();
                    if (selection == 2) {
                        System.out.println(Yellow+"Correct answer!"+Normal);
                        magicLevel += 1;
                        System.out.println(Blue+"Your magic level is "+Yellow + magicLevel+Normal);
                        in.nextLine();
                        break;
                    } else if (selection == 1 || selection == 3){
                        System.out.println(Yellow+"Your answer is wrong."+Normal);
                        in.nextLine();
                    }
                    else {
                        in.nextLine();
                        break;
                    }
                }
            }
            if (t == vertex.get(18)){
                int selection = 0;
                while (selection != 9) {
                    System.out.println(Yellow+"************************************************"+Normal);
                    System.out.println("If you pass the test, you can get a magic point");
                    System.out.println("Which spell is known as the summoning charm?");
                    System.out.println(Red+"1"+Normal+".Wingardium Leviosa"+Red+"    2"+Normal+".Accio"+Red+"    3"+Normal+".Repulso    (If you want to pass "+Red+"9"+Normal+".Exit)");
                    System.out.println(Yellow+"************************************************"+Normal);
                    System.out.print("Chose a number: ");
                    selection = in.nextInt();
                    if (selection == 2) {
                        System.out.println(Yellow+"Correct answer!"+Normal);
                        magicLevel += 1;
                        System.out.println(Blue+"Your magic level is "+Yellow + magicLevel+Normal);
                        in.nextLine();
                        break;
                    } else if (selection == 1 || selection == 3){
                        System.out.println(Yellow+"Your answer is wrong."+Normal);
                        in.nextLine();
                    }
                    else {
                        in.nextLine();
                        break;
                    }
                }
            }
            if (t == vertex.get(24)){
                int selection = 0;
                while (selection != 9) {
                    System.out.println(Yellow+"************************************************"+Normal);
                    System.out.println("If you pass the test, you can get the Sorcerer's Stone");
                    System.out.println("Which teacher is trying to steal the Sorcerer's Stone?");
                    System.out.println(Red+"1"+Normal+".Snape"+Red+"    2"+Normal+".Dumbledore"+Red+"    3"+Normal+".Quirrell    (If you want to pass "+Red+"9"+Normal+".Exit)");
                    System.out.println(Yellow+"************************************************"+Normal);
                    System.out.print("Chose a number: ");
                    selection = in.nextInt();
                    if (selection == 3) {
                        System.out.println(Yellow+"Correct answer!"+Normal);
                        stone =1;
                        System.out.println(Blue+"You got the Sorcerer's stone!! "+Normal);
                        in.nextLine();
                        break;
                    } else if (selection == 1 || selection == 2){
                        System.out.println(Yellow+"Your answer is wrong."+Normal);
                        in.nextLine();
                    }
                    else {
                        in.nextLine();
                        break;
                    }
                }
            }
            if (t == vertex.get(25)){
                if (wand >=1 && magicLevel >=5 && stone ==1){
                    winnerScreen();
                    System.out.println(Red+"You win!"+Normal);
                    System.out.println(Red+"You just graduated from Hogwarts"+Normal);
                    break;
                }
                else {
                    System.out.println("----------------------------------------");
                    System.out.println("|                                      |");
                    System.out.println("|                                      -");
                    System.out.println("|                                       ");
                    System.out.println("|                                      -");
                    System.out.println("|                                      |");
                    System.out.println("----------------------------------------");
                }
            }
			//System.out.print(CLS);
        }

    }
    static void Dijkstra(Room start, Room finish) {
        for (int i = 0; i < vertex.size(); i++) {
            if (vertex.get(i) == start)
                vertex.get(i).distance = 0;
            else
                vertex.get(i).distance = 1000;
            vertex.get(i).visited = false;
        }
        Room temp = start;
        while (!finish.visited) {
            temp.visited = true;
            if (temp.north != null && !temp.north.visited && temp.north.distance > temp.distance + 1)
                temp.north.distance = 1 + temp.distance;
            if (temp.south != null && !temp.south.visited && temp.south.distance > temp.distance + 1)
                temp.south.distance = 1 + temp.distance;
            if (temp.east != null && !temp.east.visited && temp.east.distance > temp.distance + 1)
                temp.east.distance = 1 + temp.distance;
            if (temp.west != null && !temp.west.visited && temp.west.distance > temp.distance + 1)
                temp.west.distance = 1 + temp.distance;
            int smallest = 1000;
            int smallestIndex = 0;
            for (int i = 0; i < vertex.size(); i++) {
                if (!vertex.get(i).visited && vertex.get(i).distance < smallest) {
                    smallest = vertex.get(i).distance;
                    smallestIndex = i;
                }
            }
            temp = vertex.get(smallestIndex);
        }
        temp = finish;
        path.clear();
        path.add(0, finish);
        while (temp != start) {
            int n = 1000, s = 1000, e = 1000, w = 1000;
            if (temp.north != null) n = temp.north.distance;
            if (temp.south != null) s = temp.south.distance;
            if (temp.east != null) e = temp.east.distance;
            if (temp.west != null) w = temp.west.distance;
            if (n < s && n < e && n < w)
                temp = temp.north;
            else if (s < e && s < w)
                temp = temp.south;
            else if (e < w)
                temp = temp.east;
            else
                temp = temp.west;
            path.add(0, temp);
        }
    }
    public static void introScreen(){
        System.out.println(Yellow+"         ___                             | '  \\");
        System.out.println("    ___  \\ /  ___         ,'\\_           | .-. \\        /|");
        System.out.println("    \\ /  | |,'__ \\  ,'\\_  |   \\          | | | |      ,' |_   /|");
        System.out.println("  _ | |  | |\\/  \\ \\ |   \\ | |\\_|    _    | |_| |   _ '-. .-',' |_   _");
        System.out.println(" // | |  | |____| | | |\\_|| |__    //    |     | ,'_`. | | '-. .-',' `. ,'\\_");
        System.out.println(" \\\\_| |_,' .-, _  | | |   | |\\ \\  //    .| |\\_/ | / \\ || |   | | / |\\  \\|   \\");
        System.out.println("  `-. .-'| |/ / | | | |   | | \\ \\//     |  |    | | | || |   | | | |_\\ || |\\_|");
        System.out.println("    | |  | || \\_| | | |   /_\\  \\ /      | |`    | | | || |   | | | .---'| |");
        System.out.println("    | |  | |\\___,_\\ /_\\ _      //       | |     | \\_/ || |   | | | |  /\\| |");
        System.out.println("    /_\\  | |           //_____//       .||`      `._,' | |   | | \\ `-' /| |");
        System.out.println("         /_\\           `------'        \\ |   AND        `.\\  | |  `._,' /_\\");
        System.out.println("                                        \\|       THE          `.\\");
        System.out.println("                                             _  _  _  _  __ _  __ _ /_");
        System.out.println("                                            (_`/ \\|_)/ '|_ |_)|_ |_)(_");
        System.out.println("                                            ._)\\_/| \\\\_,|__| \\|__| \\ _)");
        System.out.println("                                                            _ ___ _      _");
        System.out.println("                                                           (_` | / \\|\\ ||__");
        System.out.println("                                                          ._) | \\_/| \\||___"+Normal);
    }
    public static void winnerScreen(){
        System.out.println(Yellow+"                   (   .                   _ _ _ _ _");
        System.out.println("    (   .     .  .=##                      ]-I-I-I-[                    /");
        System.out.println("  .=##   .  (      ( .                     \\ `  ' /        \\\\\\' ,      / //");
        System.out.println("    ( .   .=##  .       .                   |'  []          \\\\\\//    _/ //'");
        System.out.println("  .     .   ( .    .        _----|          |.  '|           \\_-//' /  //<'");
        System.out.println("                             ----|_----|    | ' .|             \\ ///  >   \\\\\\`");
        System.out.println("    ]-I-I-I-I-[       ----|      |     |    |. ` |            /,)-^>>  _\\`");
        System.out.println("     \\ `   '_/            |     / \\    |    | /^\\|            (/   \\\\ / \\\\\\");
        System.out.println("      []  `__|            ^    / ^ \\   ^    | |*||                  //  //\\\\\\");
        System.out.println("      |__   ,|           / \\  / ^ ^`\\ / \\   | ===|                 ((`");
        System.out.println("   ___| ___ ,|__        / ^  /=_=_=_=\\ ^ \\  |, `_|");
        System.out.println("   I_I__I_I__I_I       (====(_________)_^___|____|____");
        System.out.println("   \\-\\--|-|--/-/       |     I  [ ]__I I_I__|____I_I_|  ");
        System.out.println("    |[] `    '|__   _  |_   _|`__  ._[  _-\\--|-|--/-/ ");
        System.out.println("   / \\  [] ` .|  |-| |-| |-| |_| |_| |_| | []   [] |   ");
        System.out.println("  <===>    `  |.            .      .     |    '    |");
        System.out.println("  ] []|  `    |   []    --   []      `   |   [] '  |");
        System.out.println("  <===>.  `   |  .   '  .       '  .[]   | '       |    ");
        System.out.println("   \\_/    .   |       .       '          |   `  [] |   ");
        System.out.println("    | []    . |   .  .           ,  .    | ,    .  |    ");
        System.out.println("    |    . '  |       . []  '            |    []'  |");
        System.out.println("   / \\   ..   |  `      .    .     `[]   | -   `   |   ");
        System.out.println("  <===>      .|=-=-=-=-=-=-=-=-=-=-=-=-=-|    .   / \\  ");
        System.out.println("  ] []|` ` [] |`  .  .   _________   .   |-      <===>  ");
        System.out.println("  <===>  `  ' | '   |||  |       |  |||  |  []   <===>  ");
        System.out.println("   \\_/     -- |   . |||  |       |  |||  | .  '   \\_/ ");
        System.out.println("  ./|' . . . .|. . .||||/|_______|\\|||| /|. . . . .|\\_"+Normal);
    }
}
class Room {
    String roomName;
    Room north, south, east, west;
    boolean visited;
    int distance;

    Room(String theRoomName) {
        roomName = theRoomName;
    }
}

