import it.unimi.dsi.fastutil.objects.Reference2ObjectArrayMap;
import java.util.List;
import java.util.Map;

public class grf implements AutoCloseable {
   private static final List<grc> b = grc.U();
   public static final int a = b.stream().mapToInt(grc::V).sum();
   private final Map<grc, fka> c = ag.a(new Reference2ObjectArrayMap(b.size()), $$0 -> {
      for (grc $$1 : b) {
         $$0.put($$1, new fka($$1.V()));
      }
   });

   public fka a(grc $$0) {
      return this.c.get($$0);
   }

   public void a() {
      this.c.values().forEach(fka::b);
   }

   public void b() {
      this.c.values().forEach(fka::c);
   }

   @Override
   public void close() {
      this.c.values().forEach(fka::close);
   }
}
