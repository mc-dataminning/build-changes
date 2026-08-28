import it.unimi.dsi.fastutil.objects.Reference2ObjectArrayMap;
import java.util.List;
import java.util.Map;

public class glw implements AutoCloseable {
   private static final List<glt> b = glt.M();
   public static final int a = b.stream().mapToInt(glt::N).sum();
   private final Map<glt, fgn> c = ae.a(new Reference2ObjectArrayMap(b.size()), $$0 -> {
      for (glt $$1 : b) {
         $$0.put($$1, new fgn($$1.N()));
      }
   });

   public fgn a(glt $$0) {
      return this.c.get($$0);
   }

   public void a() {
      this.c.values().forEach(fgn::b);
   }

   public void b() {
      this.c.values().forEach(fgn::c);
   }

   @Override
   public void close() {
      this.c.values().forEach(fgn::close);
   }
}
