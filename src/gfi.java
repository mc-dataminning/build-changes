import it.unimi.dsi.fastutil.objects.Reference2ObjectArrayMap;
import java.util.List;
import java.util.Map;

public class gfi implements AutoCloseable {
   private static final List<gff> b = gff.H();
   public static final int a = b.stream().mapToInt(gff::I).sum();
   private final Map<gff, fbd> c = ad.a(new Reference2ObjectArrayMap(b.size()), $$0 -> {
      for (gff $$1 : b) {
         $$0.put($$1, new fbd($$1.I()));
      }
   });

   public fbd a(gff $$0) {
      return this.c.get($$0);
   }

   public void a() {
      this.c.values().forEach(fbd::b);
   }

   public void b() {
      this.c.values().forEach(fbd::c);
   }

   @Override
   public void close() {
      this.c.values().forEach(fbd::close);
   }
}
