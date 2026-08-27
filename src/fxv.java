import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Maps;
import com.google.common.collect.ImmutableMap.Builder;
import java.util.Map;

public class fxv {
   private static final Map<diz<?>, fxu<?>> a = Maps.newHashMap();

   private static <T extends dix> void a(diz<? extends T> $$0, fxu<T> $$1) {
      a.put($$0, $$1);
   }

   public static Map<diz<?>, fxt<?>> a(fxu.a $$0) {
      Builder<diz<?>, fxt<?>> $$1 = ImmutableMap.builder();
      a.forEach(($$2, $$3) -> {
         try {
            $$1.put($$2, $$3.create($$0));
         } catch (Exception var5) {
            throw new IllegalStateException("Failed to create model for " + kf.k.b((diz<?>)$$2), var5);
         }
      });
      return $$1.build();
   }

   static {
      a(diz.h, fyh::new);
      a(diz.i, fyd::new);
      a(diz.j, fyj::new);
      a(diz.k, fyf::new);
      a(diz.b, fxz::new);
      a(diz.d, fxz::new);
      a(diz.c, fxz::new);
      a(diz.m, fyc::new);
      a(diz.D, fye::new);
      a(diz.n, fym::new);
      a(diz.v, fyl::new);
      a(diz.o, fxp::new);
      a(diz.p, fyi::new);
      a(diz.t, fxo::new);
      a(diz.u, fyk::new);
      a(diz.x, fyg::new);
      a(diz.y, fxq::new);
      a(diz.z, fya::new);
      a(diz.E, fxr::new);
      a(diz.G, fxy::new);
      a(diz.N, fxx::new);
      a(diz.O, fyb::new);
      a(diz.Q, fyn::new);
   }
}
