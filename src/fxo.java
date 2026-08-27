import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Maps;
import com.google.common.collect.ImmutableMap.Builder;
import java.util.Map;

public class fxo {
   private static final Map<div<?>, fxn<?>> a = Maps.newHashMap();

   private static <T extends dit> void a(div<? extends T> $$0, fxn<T> $$1) {
      a.put($$0, $$1);
   }

   public static Map<div<?>, fxm<?>> a(fxn.a $$0) {
      Builder<div<?>, fxm<?>> $$1 = ImmutableMap.builder();
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
      a(div.h, fya::new);
      a(div.i, fxw::new);
      a(div.j, fyc::new);
      a(div.k, fxy::new);
      a(div.b, fxs::new);
      a(div.d, fxs::new);
      a(div.c, fxs::new);
      a(div.m, fxv::new);
      a(div.D, fxx::new);
      a(div.n, fyf::new);
      a(div.v, fye::new);
      a(div.o, fxi::new);
      a(div.p, fyb::new);
      a(div.t, fxh::new);
      a(div.u, fyd::new);
      a(div.x, fxz::new);
      a(div.y, fxj::new);
      a(div.z, fxt::new);
      a(div.E, fxk::new);
      a(div.G, fxr::new);
      a(div.N, fxq::new);
      a(div.O, fxu::new);
      a(div.Q, fyg::new);
   }
}
