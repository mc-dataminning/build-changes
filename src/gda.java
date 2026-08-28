import com.google.common.collect.Lists;
import java.util.List;

public class gda implements gdc {
   private static final ww a = ww.c("spectatorMenu.root.prompt");
   private final List<gdd> b = Lists.newArrayList();

   public gda() {
      this.b.add(new gdg());
      this.b.add(new gdh());
   }

   @Override
   public List<gdd> a() {
      return this.b;
   }

   @Override
   public ww b() {
      return a;
   }
}
