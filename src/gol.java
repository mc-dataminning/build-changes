import it.unimi.dsi.fastutil.objects.Reference2ObjectArrayMap;
import java.util.List;
import java.util.Map;

public class gol implements AutoCloseable {
   private static final List<goi> b = goi.Q();
   public static final int a = b.stream().mapToInt(goi::R).sum();
   private final Map<goi, fhl> c = af.a(new Reference2ObjectArrayMap(b.size()), $$0 -> {
      for (goi $$1 : b) {
         $$0.put($$1, new fhl($$1.R()));
      }
   });

   public fhl a(goi $$0) {
      return this.c.get($$0);
   }

   public void a() {
      this.c.values().forEach(fhl::b);
   }

   public void b() {
      this.c.values().forEach(fhl::c);
   }

   @Override
   public void close() {
      this.c.values().forEach(fhl::close);
   }
}
