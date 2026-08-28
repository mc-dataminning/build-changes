import com.google.common.collect.Lists;
import java.util.List;

public class fzh implements fzj {
   private static final xk a = xk.c("spectatorMenu.root.prompt");
   private final List<fzk> b = Lists.newArrayList();

   public fzh() {
      this.b.add(new fzn());
      this.b.add(new fzo());
   }

   @Override
   public List<fzk> a() {
      return this.b;
   }

   @Override
   public xk b() {
      return a;
   }
}
