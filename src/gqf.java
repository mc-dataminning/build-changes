import it.unimi.dsi.fastutil.objects.Reference2ObjectArrayMap;
import java.util.List;
import java.util.Map;

public class gqf implements AutoCloseable {
   private static final List<gqc> b = gqc.Q();
   public static final int a = b.stream().mapToInt(gqc::R).sum();
   private final Map<gqc, fiz> c = af.a(new Reference2ObjectArrayMap(b.size()), $$0 -> {
      for (gqc $$1 : b) {
         $$0.put($$1, new fiz($$1.R()));
      }
   });

   public fiz a(gqc $$0) {
      return this.c.get($$0);
   }

   public void a() {
      this.c.values().forEach(fiz::b);
   }

   public void b() {
      this.c.values().forEach(fiz::c);
   }

   @Override
   public void close() {
      this.c.values().forEach(fiz::close);
   }
}
