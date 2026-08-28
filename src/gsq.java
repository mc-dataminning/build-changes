import it.unimi.dsi.fastutil.objects.Reference2ObjectArrayMap;
import java.util.List;
import java.util.Map;

public class gsq implements AutoCloseable {
   private static final List<gsn> b = gsn.N();
   public static final int a = b.stream().mapToInt(gsn::O).sum();
   private final Map<gsn, fln> c = ag.a(new Reference2ObjectArrayMap(b.size()), $$0 -> {
      for (gsn $$1 : b) {
         $$0.put($$1, new fln($$1.O()));
      }
   });

   public fln a(gsn $$0) {
      return this.c.get($$0);
   }

   public void a() {
      this.c.values().forEach(fln::b);
   }

   public void b() {
      this.c.values().forEach(fln::c);
   }

   @Override
   public void close() {
      this.c.values().forEach(fln::close);
   }
}
