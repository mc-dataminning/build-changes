import com.google.common.collect.Lists;
import java.util.List;

public class gef implements geh {
   private static final wy a = wy.c("spectatorMenu.root.prompt");
   private final List<gei> b = Lists.newArrayList();

   public gef() {
      this.b.add(new gel());
      this.b.add(new gem());
   }

   @Override
   public List<gei> a() {
      return this.b;
   }

   @Override
   public wy b() {
      return a;
   }
}
