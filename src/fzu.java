import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Maps;
import com.google.common.collect.ImmutableMap.Builder;
import java.util.Map;

public class fzu {
   private static final Map<dkk<?>, fzt<?>> a = Maps.newHashMap();

   private static <T extends dki> void a(dkk<? extends T> $$0, fzt<T> $$1) {
      a.put($$0, $$1);
   }

   public static Map<dkk<?>, fzs<?>> a(fzt.a $$0) {
      Builder<dkk<?>, fzs<?>> $$1 = ImmutableMap.builder();
      a.forEach(($$2, $$3) -> {
         try {
            $$1.put($$2, $$3.create($$0));
         } catch (Exception var5) {
            throw new IllegalStateException("Failed to create model for " + ki.k.b((dkk<?>)$$2), var5);
         }
      });
      return $$1.build();
   }

   static {
      a(dkk.h, gag::new);
      a(dkk.i, gac::new);
      a(dkk.j, gai::new);
      a(dkk.k, gae::new);
      a(dkk.b, fzy::new);
      a(dkk.d, fzy::new);
      a(dkk.c, fzy::new);
      a(dkk.m, gab::new);
      a(dkk.D, gad::new);
      a(dkk.n, gal::new);
      a(dkk.v, gak::new);
      a(dkk.o, fzo::new);
      a(dkk.p, gah::new);
      a(dkk.t, fzn::new);
      a(dkk.u, gaj::new);
      a(dkk.x, gaf::new);
      a(dkk.y, fzp::new);
      a(dkk.z, fzz::new);
      a(dkk.E, fzq::new);
      a(dkk.G, fzx::new);
      a(dkk.N, fzw::new);
      a(dkk.O, gaa::new);
      a(dkk.Q, gam::new);
      a(dkk.R, gan::new);
   }
}
