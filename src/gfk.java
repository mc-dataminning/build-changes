import it.unimi.dsi.fastutil.objects.Reference2ObjectArrayMap;
import java.util.List;
import java.util.Map;

public class gfk implements AutoCloseable {
   private static final List<gfh> b = gfh.I();
   public static final int a = b.stream().mapToInt(gfh::J).sum();
   private final Map<gfh, fbf> c = ad.a(new Reference2ObjectArrayMap(b.size()), $$0 -> {
      for (gfh $$1 : b) {
         $$0.put($$1, new fbf($$1.J()));
      }
   });

   public fbf a(gfh $$0) {
      return this.c.get($$0);
   }

   public void a() {
      this.c.values().forEach(fbf::b);
   }

   public void b() {
      this.c.values().forEach(fbf::c);
   }

   @Override
   public void close() {
      this.c.values().forEach(fbf::close);
   }
}
