import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Maps;
import com.google.common.collect.ImmutableMap.Builder;
import java.util.Map;

public class fvv {
   private static final Map<dhf<?>, fvu<?>> a = Maps.newHashMap();

   private static <T extends dhd> void a(dhf<? extends T> $$0, fvu<T> $$1) {
      a.put($$0, $$1);
   }

   public static Map<dhf<?>, fvt<?>> a(fvu.a $$0) {
      Builder<dhf<?>, fvt<?>> $$1 = ImmutableMap.builder();
      a.forEach(($$2, $$3) -> {
         try {
            $$1.put($$2, $$3.create($$0));
         } catch (Exception var5) {
            throw new IllegalStateException("Failed to create model for " + kd.k.b((dhf<?>)$$2), var5);
         }
      });
      return $$1.build();
   }

   static {
      a(dhf.h, fwh::new);
      a(dhf.i, fwd::new);
      a(dhf.j, fwj::new);
      a(dhf.k, fwf::new);
      a(dhf.b, fvz::new);
      a(dhf.d, fvz::new);
      a(dhf.c, fvz::new);
      a(dhf.m, fwc::new);
      a(dhf.D, fwe::new);
      a(dhf.n, fwm::new);
      a(dhf.v, fwl::new);
      a(dhf.o, fvp::new);
      a(dhf.p, fwi::new);
      a(dhf.t, fvo::new);
      a(dhf.u, fwk::new);
      a(dhf.x, fwg::new);
      a(dhf.y, fvq::new);
      a(dhf.z, fwa::new);
      a(dhf.E, fvr::new);
      a(dhf.G, fvy::new);
      a(dhf.N, fvx::new);
      a(dhf.O, fwb::new);
      a(dhf.Q, fwn::new);
   }
}
