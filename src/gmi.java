import it.unimi.dsi.fastutil.objects.Reference2ObjectArrayMap;
import java.util.List;
import java.util.Map;

public class gmi implements AutoCloseable {
   private static final List<gmf> b = gmf.Q();
   public static final int a = b.stream().mapToInt(gmf::R).sum();
   private final Map<gmf, ffp> c = af.a(new Reference2ObjectArrayMap(b.size()), $$0 -> {
      for (gmf $$1 : b) {
         $$0.put($$1, new ffp($$1.R()));
      }
   });

   public ffp a(gmf $$0) {
      return this.c.get($$0);
   }

   public void a() {
      this.c.values().forEach(ffp::b);
   }

   public void b() {
      this.c.values().forEach(ffp::c);
   }

   @Override
   public void close() {
      this.c.values().forEach(ffp::close);
   }
}
