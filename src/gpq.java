import it.unimi.dsi.fastutil.objects.Reference2ObjectArrayMap;
import java.util.List;
import java.util.Map;

public class gpq implements AutoCloseable {
   private static final List<gpn> b = gpn.Q();
   public static final int a = b.stream().mapToInt(gpn::R).sum();
   private final Map<gpn, fin> c = af.a(new Reference2ObjectArrayMap(b.size()), $$0 -> {
      for (gpn $$1 : b) {
         $$0.put($$1, new fin($$1.R()));
      }
   });

   public fin a(gpn $$0) {
      return this.c.get($$0);
   }

   public void a() {
      this.c.values().forEach(fin::b);
   }

   public void b() {
      this.c.values().forEach(fin::c);
   }

   @Override
   public void close() {
      this.c.values().forEach(fin::close);
   }
}
