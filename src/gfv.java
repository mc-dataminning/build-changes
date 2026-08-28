import com.google.common.collect.Lists;
import java.util.List;

public class gfv implements gfx {
   private static final xa a = xa.c("spectatorMenu.root.prompt");
   private final List<gfy> b = Lists.newArrayList();

   public gfv() {
      this.b.add(new ggb());
      this.b.add(new ggc());
   }

   @Override
   public List<gfy> a() {
      return this.b;
   }

   @Override
   public xa b() {
      return a;
   }
}
