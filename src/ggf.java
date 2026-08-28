import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Maps;
import com.google.common.collect.ImmutableMap.Builder;
import java.util.Map;

public class ggf {
   private static final Map<dpr<?>, gge<?>> a = Maps.newHashMap();

   private static <T extends dpp> void a(dpr<? extends T> $$0, gge<T> $$1) {
      a.put($$0, $$1);
   }

   public static Map<dpr<?>, ggd<?>> a(gge.a $$0) {
      Builder<dpr<?>, ggd<?>> $$1 = ImmutableMap.builder();
      a.forEach(($$2, $$3) -> {
         try {
            $$1.put($$2, $$3.create($$0));
         } catch (Exception var5) {
            throw new IllegalStateException("Failed to create model for " + lq.j.b((dpr<?>)$$2), var5);
         }
      });
      return $$1.build();
   }

   static {
      a(dpr.h, ggr::new);
      a(dpr.i, ggn::new);
      a(dpr.j, ggt::new);
      a(dpr.k, ggp::new);
      a(dpr.b, ggj::new);
      a(dpr.d, ggj::new);
      a(dpr.c, ggj::new);
      a(dpr.m, ggm::new);
      a(dpr.D, ggo::new);
      a(dpr.n, ggw::new);
      a(dpr.v, ggv::new);
      a(dpr.o, gfz::new);
      a(dpr.p, ggs::new);
      a(dpr.t, gfy::new);
      a(dpr.u, ggu::new);
      a(dpr.x, ggq::new);
      a(dpr.y, gga::new);
      a(dpr.z, ggk::new);
      a(dpr.E, ggb::new);
      a(dpr.G, ggi::new);
      a(dpr.N, ggh::new);
      a(dpr.O, ggl::new);
      a(dpr.Q, ggx::new);
      a(dpr.R, ggy::new);
   }
}
