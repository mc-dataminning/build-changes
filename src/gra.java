import it.unimi.dsi.fastutil.objects.Reference2ObjectArrayMap;
import java.util.List;
import java.util.Map;

public class gra implements AutoCloseable {
   private static final List<gqx> b = gqx.U();
   public static final int a = b.stream().mapToInt(gqx::V).sum();
   private final Map<gqx, fjv> c = ag.a(new Reference2ObjectArrayMap(b.size()), $$0 -> {
      for (gqx $$1 : b) {
         $$0.put($$1, new fjv($$1.V()));
      }
   });

   public fjv a(gqx $$0) {
      return this.c.get($$0);
   }

   public void a() {
      this.c.values().forEach(fjv::b);
   }

   public void b() {
      this.c.values().forEach(fjv::c);
   }

   @Override
   public void close() {
      this.c.values().forEach(fjv::close);
   }
}
