import it.unimi.dsi.fastutil.objects.Reference2ObjectArrayMap;
import java.util.List;
import java.util.Map;

public class glt implements AutoCloseable {
   private static final List<glq> b = glq.Q();
   public static final int a = b.stream().mapToInt(glq::R).sum();
   private final Map<glq, fgi> c = ae.a(new Reference2ObjectArrayMap(b.size()), $$0 -> {
      for (glq $$1 : b) {
         $$0.put($$1, new fgi($$1.R()));
      }
   });

   public fgi a(glq $$0) {
      return this.c.get($$0);
   }

   public void a() {
      this.c.values().forEach(fgi::b);
   }

   public void b() {
      this.c.values().forEach(fgi::c);
   }

   @Override
   public void close() {
      this.c.values().forEach(fgi::close);
   }
}
