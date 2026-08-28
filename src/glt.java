import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Maps;
import com.google.common.collect.ImmutableMap.Builder;
import java.util.Map;

public class glt {
   private static final Map<dta<?>, gls<?>> a = Maps.newHashMap();

   private static <T extends dsy> void a(dta<? extends T> $$0, gls<T> $$1) {
      a.put($$0, $$1);
   }

   public static Map<dta<?>, glr<?>> a(gls.a $$0) {
      Builder<dta<?>, glr<?>> $$1 = ImmutableMap.builder();
      a.forEach(($$2, $$3) -> {
         try {
            $$1.put($$2, $$3.create($$0));
         } catch (Exception var5) {
            throw new IllegalStateException("Failed to create model for " + lz.j.b((dta<?>)$$2), var5);
         }
      });
      return $$1.build();
   }

   static {
      a(dta.h, gmf::new);
      a(dta.i, gmb::new);
      a(dta.j, gmh::new);
      a(dta.k, gmd::new);
      a(dta.b, glx::new);
      a(dta.d, glx::new);
      a(dta.c, glx::new);
      a(dta.m, gma::new);
      a(dta.D, gmc::new);
      a(dta.n, gmk::new);
      a(dta.v, gmj::new);
      a(dta.o, gln::new);
      a(dta.p, gmg::new);
      a(dta.t, glm::new);
      a(dta.u, gmi::new);
      a(dta.x, gme::new);
      a(dta.y, glo::new);
      a(dta.z, gly::new);
      a(dta.E, glp::new);
      a(dta.G, glw::new);
      a(dta.N, glv::new);
      a(dta.O, glz::new);
      a(dta.Q, gml::new);
      a(dta.R, gmm::new);
   }
}
