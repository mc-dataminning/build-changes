import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Maps;
import com.google.common.collect.ImmutableMap.Builder;
import java.util.Map;

public class gku {
   private static final Map<dso<?>, gkt<?>> a = Maps.newHashMap();

   private static <T extends dsm> void a(dso<? extends T> $$0, gkt<T> $$1) {
      a.put($$0, $$1);
   }

   public static Map<dso<?>, gks<?>> a(gkt.a $$0) {
      Builder<dso<?>, gks<?>> $$1 = ImmutableMap.builder();
      a.forEach(($$2, $$3) -> {
         try {
            $$1.put($$2, $$3.create($$0));
         } catch (Exception var5) {
            throw new IllegalStateException("Failed to create model for " + ly.j.b((dso<?>)$$2), var5);
         }
      });
      return $$1.build();
   }

   static {
      a(dso.h, glg::new);
      a(dso.i, glc::new);
      a(dso.j, gli::new);
      a(dso.k, gle::new);
      a(dso.b, gky::new);
      a(dso.d, gky::new);
      a(dso.c, gky::new);
      a(dso.m, glb::new);
      a(dso.D, gld::new);
      a(dso.n, gll::new);
      a(dso.v, glk::new);
      a(dso.o, gko::new);
      a(dso.p, glh::new);
      a(dso.t, gkn::new);
      a(dso.u, glj::new);
      a(dso.x, glf::new);
      a(dso.y, gkp::new);
      a(dso.z, gkz::new);
      a(dso.E, gkq::new);
      a(dso.G, gkx::new);
      a(dso.N, gkw::new);
      a(dso.O, gla::new);
      a(dso.Q, glm::new);
      a(dso.R, gln::new);
   }
}
