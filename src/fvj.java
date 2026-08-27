import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Maps;
import com.google.common.collect.ImmutableMap.Builder;
import java.util.Map;

public class fvj {
   private static final Map<dgx<?>, fvi<?>> a = Maps.newHashMap();

   private static <T extends dgv> void a(dgx<? extends T> $$0, fvi<T> $$1) {
      a.put($$0, $$1);
   }

   public static Map<dgx<?>, fvh<?>> a(fvi.a $$0) {
      Builder<dgx<?>, fvh<?>> $$1 = ImmutableMap.builder();
      a.forEach(($$2, $$3) -> {
         try {
            $$1.put($$2, $$3.create($$0));
         } catch (Exception var5) {
            throw new IllegalStateException("Failed to create model for " + kd.k.b((dgx<?>)$$2), var5);
         }
      });
      return $$1.build();
   }

   static {
      a(dgx.h, fvv::new);
      a(dgx.i, fvr::new);
      a(dgx.j, fvx::new);
      a(dgx.k, fvt::new);
      a(dgx.b, fvn::new);
      a(dgx.d, fvn::new);
      a(dgx.c, fvn::new);
      a(dgx.m, fvq::new);
      a(dgx.D, fvs::new);
      a(dgx.n, fwa::new);
      a(dgx.v, fvz::new);
      a(dgx.o, fvd::new);
      a(dgx.p, fvw::new);
      a(dgx.t, fvc::new);
      a(dgx.u, fvy::new);
      a(dgx.x, fvu::new);
      a(dgx.y, fve::new);
      a(dgx.z, fvo::new);
      a(dgx.E, fvf::new);
      a(dgx.G, fvm::new);
      a(dgx.N, fvl::new);
      a(dgx.O, fvp::new);
      a(dgx.Q, fwb::new);
   }
}
