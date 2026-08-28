import com.google.common.collect.Lists;
import java.util.List;

public class fxm implements fxo {
   private static final xj a = xj.c("spectatorMenu.root.prompt");
   private final List<fxp> b = Lists.newArrayList();

   public fxm() {
      this.b.add(new fxs());
      this.b.add(new fxt());
   }

   @Override
   public List<fxp> a() {
      return this.b;
   }

   @Override
   public xj b() {
      return a;
   }
}
