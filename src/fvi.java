import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Maps;
import com.google.common.collect.ImmutableMap.Builder;
import java.util.Map;

public class fvi {
   private static final Map<dgw<?>, fvh<?>> a = Maps.newHashMap();

   private static <T extends dgu> void a(dgw<? extends T> $$0, fvh<T> $$1) {
      a.put($$0, $$1);
   }

   public static Map<dgw<?>, fvg<?>> a(fvh.a $$0) {
      Builder<dgw<?>, fvg<?>> $$1 = ImmutableMap.builder();
      a.forEach(($$2, $$3) -> {
         try {
            $$1.put($$2, $$3.create($$0));
         } catch (Exception var5) {
            throw new IllegalStateException("Failed to create model for " + kd.k.b((dgw<?>)$$2), var5);
         }
      });
      return $$1.build();
   }

   static {
      a(dgw.h, fvu::new);
      a(dgw.i, fvq::new);
      a(dgw.j, fvw::new);
      a(dgw.k, fvs::new);
      a(dgw.b, fvm::new);
      a(dgw.d, fvm::new);
      a(dgw.c, fvm::new);
      a(dgw.m, fvp::new);
      a(dgw.D, fvr::new);
      a(dgw.n, fvz::new);
      a(dgw.v, fvy::new);
      a(dgw.o, fvc::new);
      a(dgw.p, fvv::new);
      a(dgw.t, fvb::new);
      a(dgw.u, fvx::new);
      a(dgw.x, fvt::new);
      a(dgw.y, fvd::new);
      a(dgw.z, fvn::new);
      a(dgw.E, fve::new);
      a(dgw.G, fvl::new);
      a(dgw.N, fvk::new);
      a(dgw.O, fvo::new);
      a(dgw.Q, fwa::new);
   }
}
