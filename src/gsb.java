import it.unimi.dsi.fastutil.objects.Reference2ObjectArrayMap;
import java.util.List;
import java.util.Map;

public class gsb implements AutoCloseable {
   private static final List<gry> b = gry.N();
   public static final int a = b.stream().mapToInt(gry::O).sum();
   private final Map<gry, fla> c = ag.a(new Reference2ObjectArrayMap(b.size()), $$0 -> {
      for (gry $$1 : b) {
         $$0.put($$1, new fla($$1.O()));
      }
   });

   public fla a(gry $$0) {
      return this.c.get($$0);
   }

   public void a() {
      this.c.values().forEach(fla::b);
   }

   public void b() {
      this.c.values().forEach(fla::c);
   }

   @Override
   public void close() {
      this.c.values().forEach(fla::close);
   }
}
