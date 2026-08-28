import com.google.common.collect.Lists;
import java.util.List;

public class fve implements fvg {
   private static final xd a = xd.c("spectatorMenu.root.prompt");
   private final List<fvh> b = Lists.newArrayList();

   public fve() {
      this.b.add(new fvk());
      this.b.add(new fvl());
   }

   @Override
   public List<fvh> a() {
      return this.b;
   }

   @Override
   public xd b() {
      return a;
   }
}
