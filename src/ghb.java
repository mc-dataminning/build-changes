import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Maps;
import com.google.common.collect.ImmutableMap.Builder;
import java.util.Map;

public class ghb {
   private static final Map<dqj<?>, gha<?>> a = Maps.newHashMap();

   private static <T extends dqh> void a(dqj<? extends T> $$0, gha<T> $$1) {
      a.put($$0, $$1);
   }

   public static Map<dqj<?>, ggz<?>> a(gha.a $$0) {
      Builder<dqj<?>, ggz<?>> $$1 = ImmutableMap.builder();
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
      a(dqj.h, ghn::new);
      a(dqj.i, ghj::new);
      a(dqj.j, ghp::new);
      a(dqj.k, ghl::new);
      a(dqj.b, ghf::new);
      a(dqj.d, ghf::new);
      a(dqj.c, ghf::new);
      a(dqj.m, ghi::new);
      a(dqj.D, ghk::new);
      a(dqj.n, ghs::new);
      a(dqj.v, ghr::new);
      a(dqj.o, ggv::new);
      a(dqj.p, gho::new);
      a(dqj.t, ggu::new);
      a(dqj.u, ghq::new);
      a(dqj.x, ghm::new);
      a(dqj.y, ggw::new);
      a(dqj.z, ghg::new);
      a(dqj.E, ggx::new);
      a(dqj.G, ghe::new);
      a(dqj.N, ghd::new);
      a(dqj.O, ghh::new);
      a(dqj.Q, ght::new);
      a(dqj.R, ghu::new);
   }
}
