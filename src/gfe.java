import it.unimi.dsi.fastutil.objects.Reference2ObjectArrayMap;
import java.util.List;
import java.util.Map;

public class gfe implements AutoCloseable {
   private static final List<gfb> b = gfb.F();
   public static final int a = b.stream().mapToInt(gfb::G).sum();
   private final Map<gfb, faz> c = ad.a(new Reference2ObjectArrayMap(b.size()), $$0 -> {
      for (gfb $$1 : b) {
         $$0.put($$1, new faz($$1.G()));
      }
   });

   public faz a(gfb $$0) {
      return this.c.get($$0);
   }

   public void a() {
      this.c.values().forEach(faz::b);
   }

   public void b() {
      this.c.values().forEach(faz::c);
   }

   @Override
   public void close() {
      this.c.values().forEach(faz::close);
   }
}
