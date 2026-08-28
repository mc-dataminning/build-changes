import it.unimi.dsi.fastutil.objects.Reference2ObjectArrayMap;
import java.util.List;
import java.util.Map;

public class glx implements AutoCloseable {
   private static final List<glu> b = glu.M();
   public static final int a = b.stream().mapToInt(glu::N).sum();
   private final Map<glu, fgo> c = ae.a(new Reference2ObjectArrayMap(b.size()), $$0 -> {
      for (glu $$1 : b) {
         $$0.put($$1, new fgo($$1.N()));
      }
   });

   public fgo a(glu $$0) {
      return this.c.get($$0);
   }

   public void a() {
      this.c.values().forEach(fgo::b);
   }

   public void b() {
      this.c.values().forEach(fgo::c);
   }

   @Override
   public void close() {
      this.c.values().forEach(fgo::close);
   }
}
