import com.google.common.collect.Lists;
import java.util.List;

public class gdm implements gdo {
   private static final wy a = wy.c("spectatorMenu.root.prompt");
   private final List<gdp> b = Lists.newArrayList();

   public gdm() {
      this.b.add(new gds());
      this.b.add(new gdt());
   }

   @Override
   public List<gdp> a() {
      return this.b;
   }

   @Override
   public wy b() {
      return a;
   }
}
