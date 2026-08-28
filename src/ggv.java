import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Maps;
import com.google.common.collect.ImmutableMap.Builder;
import java.util.Map;

public class ggv {
   private static final Map<dqh<?>, ggu<?>> a = Maps.newHashMap();

   private static <T extends dqf> void a(dqh<? extends T> $$0, ggu<T> $$1) {
      a.put($$0, $$1);
   }

   public static Map<dqh<?>, ggt<?>> a(ggu.a $$0) {
      Builder<dqh<?>, ggt<?>> $$1 = ImmutableMap.builder();
      a.forEach(($$2, $$3) -> {
         try {
            $$1.put($$2, $$3.create($$0));
         } catch (Exception var5) {
            throw new IllegalStateException("Failed to create model for " + lt.j.b((dqh<?>)$$2), var5);
         }
      });
      return $$1.build();
   }

   static {
      a(dqh.h, ghh::new);
      a(dqh.i, ghd::new);
      a(dqh.j, ghj::new);
      a(dqh.k, ghf::new);
      a(dqh.b, ggz::new);
      a(dqh.d, ggz::new);
      a(dqh.c, ggz::new);
      a(dqh.m, ghc::new);
      a(dqh.D, ghe::new);
      a(dqh.n, ghm::new);
      a(dqh.v, ghl::new);
      a(dqh.o, ggp::new);
      a(dqh.p, ghi::new);
      a(dqh.t, ggo::new);
      a(dqh.u, ghk::new);
      a(dqh.x, ghg::new);
      a(dqh.y, ggq::new);
      a(dqh.z, gha::new);
      a(dqh.E, ggr::new);
      a(dqh.G, ggy::new);
      a(dqh.N, ggx::new);
      a(dqh.O, ghb::new);
      a(dqh.Q, ghn::new);
      a(dqh.R, gho::new);
   }
}
