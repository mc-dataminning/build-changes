import it.unimi.dsi.fastutil.objects.Reference2ObjectArrayMap;
import java.util.List;
import java.util.Map;

public class gqn implements AutoCloseable {
   private static final List<gqk> b = gqk.R();
   public static final int a = b.stream().mapToInt(gqk::S).sum();
   private final Map<gqk, fjg> c = af.a(new Reference2ObjectArrayMap(b.size()), $$0 -> {
      for (gqk $$1 : b) {
         $$0.put($$1, new fjg($$1.S()));
      }
   });

   public fjg a(gqk $$0) {
      return this.c.get($$0);
   }

   public void a() {
      this.c.values().forEach(fjg::b);
   }

   public void b() {
      this.c.values().forEach(fjg::c);
   }

   @Override
   public void close() {
      this.c.values().forEach(fjg::close);
   }
}
