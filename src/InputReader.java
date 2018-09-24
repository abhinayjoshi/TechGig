import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class InputReader {
    BufferedReader br;
    StringTokenizer st;

    public InputReader()
    {
        br = new BufferedReader(new InputStreamReader(System.in));
    }

    String next()
    {
        while (st == null || !st.hasMoreElements())
        {
            try
            {
                st = new StringTokenizer(br.readLine());
            }
            catch (IOException  e)
            {
                e.printStackTrace();
            }
        }
        return st.nextToken();
    }

    int nextInt()
    {
        return Integer.parseInt(next());
    }

    InputMessages fullLine()
    {
        String str = "";
        try
        {
            str = br.readLine();
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
        String[] messages = str.split(",");
        InputMessages inputMessages = new InputMessages();
        inputMessages.kingdoms = messages[0];
        inputMessages.message = messages[1];
        return inputMessages;
    }

    String[] getCompetitors()
    {
        String str = "";
        try
        {
            str = br.readLine();
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
        String[] competitors = str.split(" ");
        return competitors;
    }
}
