import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Maps;
import com.google.common.collect.ImmutableMap.Builder;
import java.util.Map;

public class gfs {
   private static final Map<dpl<?>, gfr<?>> a = Maps.newHashMap();

   private static <T extends dpj> void a(dpl<? extends T> $$0, gfr<T> $$1) {
      a.put($$0, $$1);
   }

   public static Map<dpl<?>, gfq<?>> a(gfr.a $$0) {
      Builder<dpl<?>, gfq<?>> $$1 = ImmutableMap.builder();
      a.forEach(($$2, $$3) -> {
         try {
            $$1.put($$2, $$3.create($$0));
         } catch (Exception var5) {
            throw new IllegalStateException("Failed to create model for " + lp.k.b((dpl<?>)$$2), var5);
         }
      });
      return $$1.build();
   }

   static {
      a(dpl.h, gge::new);
      a(dpl.i, gga::new);
      a(dpl.j, ggg::new);
      a(dpl.k, ggc::new);
      a(dpl.b, gfw::new);
      a(dpl.d, gfw::new);
      a(dpl.c, gfw::new);
      a(dpl.m, gfz::new);
      a(dpl.D, ggb::new);
      a(dpl.n, ggj::new);
      a(dpl.v, ggi::new);
      a(dpl.o, gfm::new);
      a(dpl.p, ggf::new);
      a(dpl.t, gfl::new);
      a(dpl.u, ggh::new);
      a(dpl.x, ggd::new);
      a(dpl.y, gfn::new);
      a(dpl.z, gfx::new);
      a(dpl.E, gfo::new);
      a(dpl.G, gfv::new);
      a(dpl.N, gfu::new);
      a(dpl.O, gfy::new);
      a(dpl.Q, ggk::new);
      a(dpl.R, ggl::new);
   }
}
