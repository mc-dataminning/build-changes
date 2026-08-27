import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Maps;
import com.google.common.collect.ImmutableMap.Builder;
import java.util.Map;

public class fvb {
   private static final Map<dgq<?>, fva<?>> a = Maps.newHashMap();

   private static <T extends dgo> void a(dgq<? extends T> $$0, fva<T> $$1) {
      a.put($$0, $$1);
   }

   public static Map<dgq<?>, fuz<?>> a(fva.a $$0) {
      Builder<dgq<?>, fuz<?>> $$1 = ImmutableMap.builder();
      a.forEach(($$2, $$3) -> {
         try {
            $$1.put($$2, $$3.create($$0));
         } catch (Exception var5) {
            throw new IllegalStateException("Failed to create model for " + kd.k.b((dgq<?>)$$2), var5);
         }
      });
      return $$1.build();
   }

   static {
      a(dgq.h, fvn::new);
      a(dgq.i, fvj::new);
      a(dgq.j, fvp::new);
      a(dgq.k, fvl::new);
      a(dgq.b, fvf::new);
      a(dgq.d, fvf::new);
      a(dgq.c, fvf::new);
      a(dgq.m, fvi::new);
      a(dgq.D, fvk::new);
      a(dgq.n, fvs::new);
      a(dgq.v, fvr::new);
      a(dgq.o, fuv::new);
      a(dgq.p, fvo::new);
      a(dgq.t, fuu::new);
      a(dgq.u, fvq::new);
      a(dgq.x, fvm::new);
      a(dgq.y, fuw::new);
      a(dgq.z, fvg::new);
      a(dgq.E, fux::new);
      a(dgq.G, fve::new);
      a(dgq.N, fvd::new);
      a(dgq.O, fvh::new);
      a(dgq.Q, fvt::new);
   }
}
