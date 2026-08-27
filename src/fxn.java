import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Maps;
import com.google.common.collect.ImmutableMap.Builder;
import java.util.Map;

public class fxn {
   private static final Map<div<?>, fxm<?>> a = Maps.newHashMap();

   private static <T extends dit> void a(div<? extends T> $$0, fxm<T> $$1) {
      a.put($$0, $$1);
   }

   public static Map<div<?>, fxl<?>> a(fxm.a $$0) {
      Builder<div<?>, fxl<?>> $$1 = ImmutableMap.builder();
      a.forEach(($$2, $$3) -> {
         try {
            $$1.put($$2, $$3.create($$0));
         } catch (Exception var5) {
            throw new IllegalStateException("Failed to create model for " + kf.k.b((div<?>)$$2), var5);
         }
      });
      return $$1.build();
   }

   static {
      a(div.h, fxz::new);
      a(div.i, fxv::new);
      a(div.j, fyb::new);
      a(div.k, fxx::new);
      a(div.b, fxr::new);
      a(div.d, fxr::new);
      a(div.c, fxr::new);
      a(div.m, fxu::new);
      a(div.D, fxw::new);
      a(div.n, fye::new);
      a(div.v, fyd::new);
      a(div.o, fxh::new);
      a(div.p, fya::new);
      a(div.t, fxg::new);
      a(div.u, fyc::new);
      a(div.x, fxy::new);
      a(div.y, fxi::new);
      a(div.z, fxs::new);
      a(div.E, fxj::new);
      a(div.G, fxq::new);
      a(div.N, fxp::new);
      a(div.O, fxt::new);
      a(div.Q, fyf::new);
   }
}
