import it.unimi.dsi.fastutil.objects.Reference2ObjectArrayMap;
import java.util.List;
import java.util.Map;

public class gml implements AutoCloseable {
   private static final List<gmi> b = gmi.Q();
   public static final int a = b.stream().mapToInt(gmi::R).sum();
   private final Map<gmi, ffr> c = af.a(new Reference2ObjectArrayMap(b.size()), $$0 -> {
      for (gmi $$1 : b) {
         $$0.put($$1, new ffr($$1.R()));
      }
   });

   public ffr a(gmi $$0) {
      return this.c.get($$0);
   }

   public void a() {
      this.c.values().forEach(ffr::b);
   }

   public void b() {
      this.c.values().forEach(ffr::c);
   }

   @Override
   public void close() {
      this.c.values().forEach(ffr::close);
   }
}
