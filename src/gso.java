import it.unimi.dsi.fastutil.objects.Reference2ObjectArrayMap;
import java.util.List;
import java.util.Map;

public class gso implements AutoCloseable {
   private static final List<gsl> b = gsl.N();
   public static final int a = b.stream().mapToInt(gsl::O).sum();
   private final Map<gsl, fll> c = ag.a(new Reference2ObjectArrayMap(b.size()), $$0 -> {
      for (gsl $$1 : b) {
         $$0.put($$1, new fll($$1.O()));
      }
   });

   public fll a(gsl $$0) {
      return this.c.get($$0);
   }

   public void a() {
      this.c.values().forEach(fll::b);
   }

   public void b() {
      this.c.values().forEach(fll::c);
   }

   @Override
   public void close() {
      this.c.values().forEach(fll::close);
   }
}
