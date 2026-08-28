import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Maps;
import com.google.common.collect.ImmutableMap.Builder;
import java.util.Map;

public class gjy {
   private static final Map<drx<?>, gjx<?>> a = Maps.newHashMap();

   private static <T extends drv> void a(drx<? extends T> $$0, gjx<T> $$1) {
      a.put($$0, $$1);
   }

   public static Map<drx<?>, gjw<?>> a(gjx.a $$0) {
      Builder<drx<?>, gjw<?>> $$1 = ImmutableMap.builder();
      a.forEach(($$2, $$3) -> {
         try {
            $$1.put($$2, $$3.create($$0));
         } catch (Exception var5) {
            throw new IllegalStateException("Failed to create model for " + lv.j.b((drx<?>)$$2), var5);
         }
      });
      return $$1.build();
   }

   static {
      a(drx.h, gkk::new);
      a(drx.i, gkg::new);
      a(drx.j, gkm::new);
      a(drx.k, gki::new);
      a(drx.b, gkc::new);
      a(drx.d, gkc::new);
      a(drx.c, gkc::new);
      a(drx.m, gkf::new);
      a(drx.D, gkh::new);
      a(drx.n, gkp::new);
      a(drx.v, gko::new);
      a(drx.o, gjs::new);
      a(drx.p, gkl::new);
      a(drx.t, gjr::new);
      a(drx.u, gkn::new);
      a(drx.x, gkj::new);
      a(drx.y, gjt::new);
      a(drx.z, gkd::new);
      a(drx.E, gju::new);
      a(drx.G, gkb::new);
      a(drx.N, gka::new);
      a(drx.O, gke::new);
      a(drx.Q, gkq::new);
      a(drx.R, gkr::new);
   }
}
