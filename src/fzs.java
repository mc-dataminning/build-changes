import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Maps;
import com.google.common.collect.ImmutableMap.Builder;
import java.util.Map;

public class fzs {
   private static final Map<dki<?>, fzr<?>> a = Maps.newHashMap();

   private static <T extends dkg> void a(dki<? extends T> $$0, fzr<T> $$1) {
      a.put($$0, $$1);
   }

   public static Map<dki<?>, fzq<?>> a(fzr.a $$0) {
      Builder<dki<?>, fzq<?>> $$1 = ImmutableMap.builder();
      a.forEach(($$2, $$3) -> {
         try {
            $$1.put($$2, $$3.create($$0));
         } catch (Exception var5) {
            throw new IllegalStateException("Failed to create model for " + ki.k.b((dki<?>)$$2), var5);
         }
      });
      return $$1.build();
   }

   static {
      a(dki.h, gae::new);
      a(dki.i, gaa::new);
      a(dki.j, gag::new);
      a(dki.k, gac::new);
      a(dki.b, fzw::new);
      a(dki.d, fzw::new);
      a(dki.c, fzw::new);
      a(dki.m, fzz::new);
      a(dki.D, gab::new);
      a(dki.n, gaj::new);
      a(dki.v, gai::new);
      a(dki.o, fzm::new);
      a(dki.p, gaf::new);
      a(dki.t, fzl::new);
      a(dki.u, gah::new);
      a(dki.x, gad::new);
      a(dki.y, fzn::new);
      a(dki.z, fzx::new);
      a(dki.E, fzo::new);
      a(dki.G, fzv::new);
      a(dki.N, fzu::new);
      a(dki.O, fzy::new);
      a(dki.Q, gak::new);
      a(dki.R, gal::new);
   }
}
