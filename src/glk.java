import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Maps;
import com.google.common.collect.ImmutableMap.Builder;
import java.util.Map;

public class glk {
   private static final Map<dst<?>, glj<?>> a = Maps.newHashMap();

   private static <T extends dsr> void a(dst<? extends T> $$0, glj<T> $$1) {
      a.put($$0, $$1);
   }

   public static Map<dst<?>, gli<?>> a(glj.a $$0) {
      Builder<dst<?>, gli<?>> $$1 = ImmutableMap.builder();
      a.forEach(($$2, $$3) -> {
         try {
            $$1.put($$2, $$3.create($$0));
         } catch (Exception var5) {
            throw new IllegalStateException("Failed to create model for " + lz.j.b((dst<?>)$$2), var5);
         }
      });
      return $$1.build();
   }

   static {
      a(dst.h, glw::new);
      a(dst.i, gls::new);
      a(dst.j, gly::new);
      a(dst.k, glu::new);
      a(dst.b, glo::new);
      a(dst.d, glo::new);
      a(dst.c, glo::new);
      a(dst.m, glr::new);
      a(dst.D, glt::new);
      a(dst.n, gmb::new);
      a(dst.v, gma::new);
      a(dst.o, gle::new);
      a(dst.p, glx::new);
      a(dst.t, gld::new);
      a(dst.u, glz::new);
      a(dst.x, glv::new);
      a(dst.y, glf::new);
      a(dst.z, glp::new);
      a(dst.E, glg::new);
      a(dst.G, gln::new);
      a(dst.N, glm::new);
      a(dst.O, glq::new);
      a(dst.Q, gmc::new);
      a(dst.R, gmd::new);
   }
}
