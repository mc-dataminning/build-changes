import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Maps;
import com.google.common.collect.ImmutableMap.Builder;
import java.util.Map;

public class gfr {
   private static final Map<dpk<?>, gfq<?>> a = Maps.newHashMap();

   private static <T extends dpi> void a(dpk<? extends T> $$0, gfq<T> $$1) {
      a.put($$0, $$1);
   }

   public static Map<dpk<?>, gfp<?>> a(gfq.a $$0) {
      Builder<dpk<?>, gfp<?>> $$1 = ImmutableMap.builder();
      a.forEach(($$2, $$3) -> {
         try {
            $$1.put($$2, $$3.create($$0));
         } catch (Exception var5) {
            throw new IllegalStateException("Failed to create model for " + lp.k.b((dpk<?>)$$2), var5);
         }
      });
      return $$1.build();
   }

   static {
      a(dpk.h, ggd::new);
      a(dpk.i, gfz::new);
      a(dpk.j, ggf::new);
      a(dpk.k, ggb::new);
      a(dpk.b, gfv::new);
      a(dpk.d, gfv::new);
      a(dpk.c, gfv::new);
      a(dpk.m, gfy::new);
      a(dpk.D, gga::new);
      a(dpk.n, ggi::new);
      a(dpk.v, ggh::new);
      a(dpk.o, gfl::new);
      a(dpk.p, gge::new);
      a(dpk.t, gfk::new);
      a(dpk.u, ggg::new);
      a(dpk.x, ggc::new);
      a(dpk.y, gfm::new);
      a(dpk.z, gfw::new);
      a(dpk.E, gfn::new);
      a(dpk.G, gfu::new);
      a(dpk.N, gft::new);
      a(dpk.O, gfx::new);
      a(dpk.Q, ggj::new);
      a(dpk.R, ggk::new);
   }
}
