import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Maps;
import com.google.common.collect.ImmutableMap.Builder;
import java.util.Map;

public class fvh {
   private static final Map<dgw<?>, fvg<?>> a = Maps.newHashMap();

   private static <T extends dgu> void a(dgw<? extends T> $$0, fvg<T> $$1) {
      a.put($$0, $$1);
   }

   public static Map<dgw<?>, fvf<?>> a(fvg.a $$0) {
      Builder<dgw<?>, fvf<?>> $$1 = ImmutableMap.builder();
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
      a(dgw.h, fvt::new);
      a(dgw.i, fvp::new);
      a(dgw.j, fvv::new);
      a(dgw.k, fvr::new);
      a(dgw.b, fvl::new);
      a(dgw.d, fvl::new);
      a(dgw.c, fvl::new);
      a(dgw.m, fvo::new);
      a(dgw.D, fvq::new);
      a(dgw.n, fvy::new);
      a(dgw.v, fvx::new);
      a(dgw.o, fvb::new);
      a(dgw.p, fvu::new);
      a(dgw.t, fva::new);
      a(dgw.u, fvw::new);
      a(dgw.x, fvs::new);
      a(dgw.y, fvc::new);
      a(dgw.z, fvm::new);
      a(dgw.E, fvd::new);
      a(dgw.G, fvk::new);
      a(dgw.N, fvj::new);
      a(dgw.O, fvn::new);
      a(dgw.Q, fvz::new);
   }
}
