import it.unimi.dsi.fastutil.objects.Reference2ObjectArrayMap;
import java.util.List;
import java.util.Map;

public class glr implements AutoCloseable {
   private static final List<glo> b = glo.M();
   public static final int a = b.stream().mapToInt(glo::N).sum();
   private final Map<glo, fgi> c = ae.a(new Reference2ObjectArrayMap(b.size()), $$0 -> {
      for (glo $$1 : b) {
         $$0.put($$1, new fgi($$1.N()));
      }
   });

   public fgi a(glo $$0) {
      return this.c.get($$0);
   }

   public void a() {
      this.c.values().forEach(fgi::b);
   }

   public void b() {
      this.c.values().forEach(fgi::c);
   }

   @Override
   public void close() {
      this.c.values().forEach(fgi::close);
   }
}
