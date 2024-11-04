import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArticleIterator implements Iterator<ArticleComponent> {
    
    private int index;
    private List<ArticleComponent> iterator = new ArrayList<>();

    public ArticleIterator(List<ArticleComponent> iterator)
    {
        index = 0;
        this.iterator = iterator;
    }

    @Override
    public boolean hasNext()
    {
        return (index < iterator.size());
    }

    @Override
    public ArticleComponent next()
    {
        return (iterator.get(index++));
    }

}
