import com.google.common.collect.Lists;
import java.util.List;

public class gfx implements gfz {
   private static final xc a = xc.c("spectatorMenu.root.prompt");
   private final List<gga> b = Lists.newArrayList();

   public gfx() {
      this.b.add(new ggd());
      this.b.add(new gge());
   }

   @Override
   public List<gga> a() {
      return this.b;
   }

   @Override
   public xc b() {
      return a;
   }
}
