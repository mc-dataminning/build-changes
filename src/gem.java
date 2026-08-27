import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Maps;
import com.google.common.collect.ImmutableMap.Builder;
import java.util.Map;

public class gem {
   private static final Map<doi<?>, gel<?>> a = Maps.newHashMap();

   private static <T extends dog> void a(doi<? extends T> $$0, gel<T> $$1) {
      a.put($$0, $$1);
   }

   public static Map<doi<?>, gek<?>> a(gel.a $$0) {
      Builder<doi<?>, gek<?>> $$1 = ImmutableMap.builder();
      a.forEach(($$2, $$3) -> {
         try {
            $$1.put($$2, $$3.create($$0));
         } catch (Exception var5) {
            throw new IllegalStateException("Failed to create model for " + le.k.b((doi<?>)$$2), var5);
         }
      });
      return $$1.build();
   }

   static {
      a(doi.h, gey::new);
      a(doi.i, geu::new);
      a(doi.j, gfa::new);
      a(doi.k, gew::new);
      a(doi.b, geq::new);
      a(doi.d, geq::new);
      a(doi.c, geq::new);
      a(doi.m, get::new);
      a(doi.D, gev::new);
      a(doi.n, gfd::new);
      a(doi.v, gfc::new);
      a(doi.o, geg::new);
      a(doi.p, gez::new);
      a(doi.t, gef::new);
      a(doi.u, gfb::new);
      a(doi.x, gex::new);
      a(doi.y, geh::new);
      a(doi.z, ger::new);
      a(doi.E, gei::new);
      a(doi.G, gep::new);
      a(doi.N, geo::new);
      a(doi.O, ges::new);
      a(doi.Q, gfe::new);
      a(doi.R, gff::new);
   }
}
