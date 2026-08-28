import it.unimi.dsi.fastutil.objects.Reference2ObjectArrayMap;
import java.util.List;
import java.util.Map;

public class gly implements AutoCloseable {
   private static final List<glv> b = glv.M();
   public static final int a = b.stream().mapToInt(glv::N).sum();
   private final Map<glv, fgp> c = ae.a(new Reference2ObjectArrayMap(b.size()), $$0 -> {
      for (glv $$1 : b) {
         $$0.put($$1, new fgp($$1.N()));
      }
   });

   public fgp a(glv $$0) {
      return this.c.get($$0);
   }

   public void a() {
      this.c.values().forEach(fgp::b);
   }

   public void b() {
      this.c.values().forEach(fgp::c);
   }

   @Override
   public void close() {
      this.c.values().forEach(fgp::close);
   }
}
