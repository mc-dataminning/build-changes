import it.unimi.dsi.fastutil.objects.Reference2ObjectArrayMap;
import java.util.List;
import java.util.Map;

public class gij implements AutoCloseable {
   private static final List<gig> b = gig.L();
   public static final int a = b.stream().mapToInt(gig::M).sum();
   private final Map<gig, fdq> c = ad.a(new Reference2ObjectArrayMap(b.size()), $$0 -> {
      for (gig $$1 : b) {
         $$0.put($$1, new fdq($$1.M()));
      }
   });

   public fdq a(gig $$0) {
      return this.c.get($$0);
   }

   public void a() {
      this.c.values().forEach(fdq::b);
   }

   public void b() {
      this.c.values().forEach(fdq::c);
   }

   @Override
   public void close() {
      this.c.values().forEach(fdq::close);
   }
}
