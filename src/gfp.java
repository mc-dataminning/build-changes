import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Maps;
import com.google.common.collect.ImmutableMap.Builder;
import java.util.Map;

public class gfp {
   private static final Map<dpi<?>, gfo<?>> a = Maps.newHashMap();

   private static <T extends dpg> void a(dpi<? extends T> $$0, gfo<T> $$1) {
      a.put($$0, $$1);
   }

   public static Map<dpi<?>, gfn<?>> a(gfo.a $$0) {
      Builder<dpi<?>, gfn<?>> $$1 = ImmutableMap.builder();
      a.forEach(($$2, $$3) -> {
         try {
            $$1.put($$2, $$3.create($$0));
         } catch (Exception var5) {
            throw new IllegalStateException("Failed to create model for " + lp.k.b((dpi<?>)$$2), var5);
         }
      });
      return $$1.build();
   }

   static {
      a(dpi.h, ggb::new);
      a(dpi.i, gfx::new);
      a(dpi.j, ggd::new);
      a(dpi.k, gfz::new);
      a(dpi.b, gft::new);
      a(dpi.d, gft::new);
      a(dpi.c, gft::new);
      a(dpi.m, gfw::new);
      a(dpi.D, gfy::new);
      a(dpi.n, ggg::new);
      a(dpi.v, ggf::new);
      a(dpi.o, gfj::new);
      a(dpi.p, ggc::new);
      a(dpi.t, gfi::new);
      a(dpi.u, gge::new);
      a(dpi.x, gga::new);
      a(dpi.y, gfk::new);
      a(dpi.z, gfu::new);
      a(dpi.E, gfl::new);
      a(dpi.G, gfs::new);
      a(dpi.N, gfr::new);
      a(dpi.O, gfv::new);
      a(dpi.Q, ggh::new);
      a(dpi.R, ggi::new);
   }
}
