import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Maps;
import com.google.common.collect.ImmutableMap.Builder;
import java.util.Map;

public class gkj {
   private static final Map<dsi<?>, gki<?>> a = Maps.newHashMap();

   private static <T extends dsg> void a(dsi<? extends T> $$0, gki<T> $$1) {
      a.put($$0, $$1);
   }

   public static Map<dsi<?>, gkh<?>> a(gki.a $$0) {
      Builder<dsi<?>, gkh<?>> $$1 = ImmutableMap.builder();
      a.forEach(($$2, $$3) -> {
         try {
            $$1.put($$2, $$3.create($$0));
         } catch (Exception var5) {
            throw new IllegalStateException("Failed to create model for " + lx.j.b((dsi<?>)$$2), var5);
         }
      });
      return $$1.build();
   }

   static {
      a(dsi.h, gkv::new);
      a(dsi.i, gkr::new);
      a(dsi.j, gkx::new);
      a(dsi.k, gkt::new);
      a(dsi.b, gkn::new);
      a(dsi.d, gkn::new);
      a(dsi.c, gkn::new);
      a(dsi.m, gkq::new);
      a(dsi.D, gks::new);
      a(dsi.n, gla::new);
      a(dsi.v, gkz::new);
      a(dsi.o, gkd::new);
      a(dsi.p, gkw::new);
      a(dsi.t, gkc::new);
      a(dsi.u, gky::new);
      a(dsi.x, gku::new);
      a(dsi.y, gke::new);
      a(dsi.z, gko::new);
      a(dsi.E, gkf::new);
      a(dsi.G, gkm::new);
      a(dsi.N, gkl::new);
      a(dsi.O, gkp::new);
      a(dsi.Q, glb::new);
      a(dsi.R, glc::new);
   }
}
