import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Maps;
import com.google.common.collect.ImmutableMap.Builder;
import java.util.Map;

public class ghi {
   private static final Map<dqe<?>, ghh<?>> a = Maps.newHashMap();

   private static <T extends dqc> void a(dqe<? extends T> $$0, ghh<T> $$1) {
      a.put($$0, $$1);
   }

   public static Map<dqe<?>, ghg<?>> a(ghh.a $$0) {
      Builder<dqe<?>, ghg<?>> $$1 = ImmutableMap.builder();
      a.forEach(($$2, $$3) -> {
         try {
            $$1.put($$2, $$3.create($$0));
         } catch (Exception var5) {
            throw new IllegalStateException("Failed to create model for " + lh.k.b((dqe<?>)$$2), var5);
         }
      });
      return $$1.build();
   }

   static {
      a(dqe.i, ghu::new);
      a(dqe.j, ghq::new);
      a(dqe.k, ghw::new);
      a(dqe.l, ghs::new);
      a(dqe.c, ghm::new);
      a(dqe.e, ghm::new);
      a(dqe.d, ghm::new);
      a(dqe.n, ghp::new);
      a(dqe.E, ghr::new);
      a(dqe.o, ghz::new);
      a(dqe.w, ghy::new);
      a(dqe.p, ghc::new);
      a(dqe.q, ghv::new);
      a(dqe.u, ghb::new);
      a(dqe.v, ghx::new);
      a(dqe.y, ght::new);
      a(dqe.z, ghd::new);
      a(dqe.A, ghn::new);
      a(dqe.F, ghe::new);
      a(dqe.H, ghl::new);
      a(dqe.O, ghk::new);
      a(dqe.P, gho::new);
      a(dqe.R, gia::new);
      a(dqe.S, gib::new);
   }
}
