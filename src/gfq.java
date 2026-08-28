import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Maps;
import com.google.common.collect.ImmutableMap.Builder;
import java.util.Map;

public class gfq {
   private static final Map<dpj<?>, gfp<?>> a = Maps.newHashMap();

   private static <T extends dph> void a(dpj<? extends T> $$0, gfp<T> $$1) {
      a.put($$0, $$1);
   }

   public static Map<dpj<?>, gfo<?>> a(gfp.a $$0) {
      Builder<dpj<?>, gfo<?>> $$1 = ImmutableMap.builder();
      a.forEach(($$2, $$3) -> {
         try {
            $$1.put($$2, $$3.create($$0));
         } catch (Exception var5) {
            throw new IllegalStateException("Failed to create model for " + lp.k.b((dpj<?>)$$2), var5);
         }
      });
      return $$1.build();
   }

   static {
      a(dpj.h, ggc::new);
      a(dpj.i, gfy::new);
      a(dpj.j, gge::new);
      a(dpj.k, gga::new);
      a(dpj.b, gfu::new);
      a(dpj.d, gfu::new);
      a(dpj.c, gfu::new);
      a(dpj.m, gfx::new);
      a(dpj.D, gfz::new);
      a(dpj.n, ggh::new);
      a(dpj.v, ggg::new);
      a(dpj.o, gfk::new);
      a(dpj.p, ggd::new);
      a(dpj.t, gfj::new);
      a(dpj.u, ggf::new);
      a(dpj.x, ggb::new);
      a(dpj.y, gfl::new);
      a(dpj.z, gfv::new);
      a(dpj.E, gfm::new);
      a(dpj.G, gft::new);
      a(dpj.N, gfs::new);
      a(dpj.O, gfw::new);
      a(dpj.Q, ggi::new);
      a(dpj.R, ggj::new);
   }
}
