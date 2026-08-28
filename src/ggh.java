import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Maps;
import com.google.common.collect.ImmutableMap.Builder;
import java.util.Map;

public class ggh {
   private static final Map<dps<?>, ggg<?>> a = Maps.newHashMap();

   private static <T extends dpq> void a(dps<? extends T> $$0, ggg<T> $$1) {
      a.put($$0, $$1);
   }

   public static Map<dps<?>, ggf<?>> a(ggg.a $$0) {
      Builder<dps<?>, ggf<?>> $$1 = ImmutableMap.builder();
      a.forEach(($$2, $$3) -> {
         try {
            $$1.put($$2, $$3.create($$0));
         } catch (Exception var5) {
            throw new IllegalStateException("Failed to create model for " + lq.j.b((dps<?>)$$2), var5);
         }
      });
      return $$1.build();
   }

   static {
      a(dps.h, ggt::new);
      a(dps.i, ggp::new);
      a(dps.j, ggv::new);
      a(dps.k, ggr::new);
      a(dps.b, ggl::new);
      a(dps.d, ggl::new);
      a(dps.c, ggl::new);
      a(dps.m, ggo::new);
      a(dps.D, ggq::new);
      a(dps.n, ggy::new);
      a(dps.v, ggx::new);
      a(dps.o, ggb::new);
      a(dps.p, ggu::new);
      a(dps.t, gga::new);
      a(dps.u, ggw::new);
      a(dps.x, ggs::new);
      a(dps.y, ggc::new);
      a(dps.z, ggm::new);
      a(dps.E, ggd::new);
      a(dps.G, ggk::new);
      a(dps.N, ggj::new);
      a(dps.O, ggn::new);
      a(dps.Q, ggz::new);
      a(dps.R, gha::new);
   }
}
