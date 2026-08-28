import com.google.common.collect.Lists;
import java.util.List;

public class fzn implements fzp {
   private static final xv a = xv.c("spectatorMenu.root.prompt");
   private final List<fzq> b = Lists.newArrayList();

   public fzn() {
      this.b.add(new fzt());
      this.b.add(new fzu());
   }

   @Override
   public List<fzq> a() {
      return this.b;
   }

   @Override
   public xv b() {
      return a;
   }
}
