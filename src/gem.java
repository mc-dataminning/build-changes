import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Maps;
import com.google.common.collect.ImmutableMap.Builder;
import java.util.Map;

public class gem {
   private static final Map<dok<?>, gel<?>> a = Maps.newHashMap();

   private static <T extends doi> void a(dok<? extends T> $$0, gel<T> $$1) {
      a.put($$0, $$1);
   }

   public static Map<dok<?>, gek<?>> a(gel.a $$0) {
      Builder<dok<?>, gek<?>> $$1 = ImmutableMap.builder();
      a.forEach(($$2, $$3) -> {
         try {
            $$1.put($$2, $$3.create($$0));
         } catch (Exception var5) {
            throw new IllegalStateException("Failed to create model for " + le.k.b((dok<?>)$$2), var5);
         }
      });
      return $$1.build();
   }

   static {
      a(dok.h, gey::new);
      a(dok.i, geu::new);
      a(dok.j, gfa::new);
      a(dok.k, gew::new);
      a(dok.b, geq::new);
      a(dok.d, geq::new);
      a(dok.c, geq::new);
      a(dok.m, get::new);
      a(dok.D, gev::new);
      a(dok.n, gfd::new);
      a(dok.v, gfc::new);
      a(dok.o, geg::new);
      a(dok.p, gez::new);
      a(dok.t, gef::new);
      a(dok.u, gfb::new);
      a(dok.x, gex::new);
      a(dok.y, geh::new);
      a(dok.z, ger::new);
      a(dok.E, gei::new);
      a(dok.G, gep::new);
      a(dok.N, geo::new);
      a(dok.O, ges::new);
      a(dok.Q, gfe::new);
      a(dok.R, gff::new);
   }
}
