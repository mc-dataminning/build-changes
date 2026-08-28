import it.unimi.dsi.fastutil.objects.Reference2ObjectArrayMap;
import java.util.List;
import java.util.Map;

public class ght implements AutoCloseable {
   private static final List<ghq> b = ghq.L();
   public static final int a = b.stream().mapToInt(ghq::M).sum();
   private final Map<ghq, fdb> c = ad.a(new Reference2ObjectArrayMap(b.size()), $$0 -> {
      for (ghq $$1 : b) {
         $$0.put($$1, new fdb($$1.M()));
      }
   });

   public fdb a(ghq $$0) {
      return this.c.get($$0);
   }

   public void a() {
      this.c.values().forEach(fdb::b);
   }

   public void b() {
      this.c.values().forEach(fdb::c);
   }

   @Override
   public void close() {
      this.c.values().forEach(fdb::close);
   }
}
