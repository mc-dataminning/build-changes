import com.google.common.collect.Lists;
import java.util.List;

public class fxe implements fxg {
   private static final xl a = xl.c("spectatorMenu.root.prompt");
   private final List<fxh> b = Lists.newArrayList();

   public fxe() {
      this.b.add(new fxk());
      this.b.add(new fxl());
   }

   @Override
   public List<fxh> a() {
      return this.b;
   }

   @Override
   public xl b() {
      return a;
   }
}
