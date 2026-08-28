import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Maps;
import com.google.common.collect.ImmutableMap.Builder;
import java.util.Map;

public class ggz {
   private static final Map<dqj<?>, ggy<?>> a = Maps.newHashMap();

   private static <T extends dqh> void a(dqj<? extends T> $$0, ggy<T> $$1) {
      a.put($$0, $$1);
   }

   public static Map<dqj<?>, ggx<?>> a(ggy.a $$0) {
      Builder<dqj<?>, ggx<?>> $$1 = ImmutableMap.builder();
      a.forEach(($$2, $$3) -> {
         try {
            $$1.put($$2, $$3.create($$0));
         } catch (Exception var5) {
            throw new IllegalStateException("Failed to create model for " + lt.j.b((dqj<?>)$$2), var5);
         }
      });
      return $$1.build();
   }

   static {
      a(dqj.h, ghl::new);
      a(dqj.i, ghh::new);
      a(dqj.j, ghn::new);
      a(dqj.k, ghj::new);
      a(dqj.b, ghd::new);
      a(dqj.d, ghd::new);
      a(dqj.c, ghd::new);
      a(dqj.m, ghg::new);
      a(dqj.D, ghi::new);
      a(dqj.n, ghq::new);
      a(dqj.v, ghp::new);
      a(dqj.o, ggt::new);
      a(dqj.p, ghm::new);
      a(dqj.t, ggs::new);
      a(dqj.u, gho::new);
      a(dqj.x, ghk::new);
      a(dqj.y, ggu::new);
      a(dqj.z, ghe::new);
      a(dqj.E, ggv::new);
      a(dqj.G, ghc::new);
      a(dqj.N, ghb::new);
      a(dqj.O, ghf::new);
      a(dqj.Q, ghr::new);
      a(dqj.R, ghs::new);
   }
}
