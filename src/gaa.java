import com.google.common.collect.Lists;
import java.util.List;

public class gaa implements gac {
   private static final wo a = wo.c("spectatorMenu.root.prompt");
   private final List<gad> b = Lists.newArrayList();

   public gaa() {
      this.b.add(new gag());
      this.b.add(new gah());
   }

   @Override
   public List<gad> a() {
      return this.b;
   }

   @Override
   public wo b() {
      return a;
   }
}
