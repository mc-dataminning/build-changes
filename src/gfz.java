import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Maps;
import com.google.common.collect.ImmutableMap.Builder;
import java.util.Map;

public class gfz {
   private static final Map<dpp<?>, gfy<?>> a = Maps.newHashMap();

   private static <T extends dpn> void a(dpp<? extends T> $$0, gfy<T> $$1) {
      a.put($$0, $$1);
   }

   public static Map<dpp<?>, gfx<?>> a(gfy.a $$0) {
      Builder<dpp<?>, gfx<?>> $$1 = ImmutableMap.builder();
      a.forEach(($$2, $$3) -> {
         try {
            $$1.put($$2, $$3.create($$0));
         } catch (Exception var5) {
            throw new IllegalStateException("Failed to create model for " + lq.j.b((dpp<?>)$$2), var5);
         }
      });
      return $$1.build();
   }

   static {
      a(dpp.h, ggl::new);
      a(dpp.i, ggh::new);
      a(dpp.j, ggn::new);
      a(dpp.k, ggj::new);
      a(dpp.b, ggd::new);
      a(dpp.d, ggd::new);
      a(dpp.c, ggd::new);
      a(dpp.m, ggg::new);
      a(dpp.D, ggi::new);
      a(dpp.n, ggq::new);
      a(dpp.v, ggp::new);
      a(dpp.o, gft::new);
      a(dpp.p, ggm::new);
      a(dpp.t, gfs::new);
      a(dpp.u, ggo::new);
      a(dpp.x, ggk::new);
      a(dpp.y, gfu::new);
      a(dpp.z, gge::new);
      a(dpp.E, gfv::new);
      a(dpp.G, ggc::new);
      a(dpp.N, ggb::new);
      a(dpp.O, ggf::new);
      a(dpp.Q, ggr::new);
      a(dpp.R, ggs::new);
   }
}
