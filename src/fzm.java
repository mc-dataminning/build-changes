import com.google.common.collect.Lists;
import java.util.List;

public class fzm implements fzo {
   private static final xv a = xv.c("spectatorMenu.root.prompt");
   private final List<fzp> b = Lists.newArrayList();

   public fzm() {
      this.b.add(new fzs());
      this.b.add(new fzt());
   }

   @Override
   public List<fzp> a() {
      return this.b;
   }

   @Override
   public xv b() {
      return a;
   }
}
