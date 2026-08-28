import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Maps;
import com.google.common.collect.ImmutableMap.Builder;
import java.util.Map;

public class gur {
   private static final Map<dyg<?>, guq<?>> a = Maps.newHashMap();

   private static <T extends dye> void a(dyg<? extends T> $$0, guq<T> $$1) {
      a.put($$0, $$1);
   }

   public static Map<dyg<?>, gup<?>> a(guq.a $$0) {
      Builder<dyg<?>, gup<?>> $$1 = ImmutableMap.builder();
      a.forEach(($$2, $$3) -> {
         try {
            $$1.put($$2, $$3.create($$0));
         } catch (Exception var5) {
            throw new IllegalStateException("Failed to create model for " + mh.j.b((dyg<?>)$$2), var5);
         }
      });
      return $$1.build();
   }

   static {
      a(dyg.h, gve::new);
      a(dyg.i, gva::new);
      a(dyg.j, gvg::new);
      a(dyg.l, gvc::new);
      a(dyg.b, guw::new);
      a(dyg.d, guw::new);
      a(dyg.c, guw::new);
      a(dyg.n, guz::new);
      a(dyg.E, gvb::new);
      a(dyg.o, gvj::new);
      a(dyg.w, gvi::new);
      a(dyg.p, gul::new);
      a(dyg.q, gvf::new);
      a(dyg.u, guk::new);
      a(dyg.v, gus::new);
      a(dyg.U, gvh::new);
      a(dyg.y, gvd::new);
      a(dyg.z, gum::new);
      a(dyg.A, gux::new);
      a(dyg.F, gun::new);
      a(dyg.H, guv::new);
      a(dyg.O, guu::new);
      a(dyg.P, guy::new);
      a(dyg.R, gvk::new);
      a(dyg.S, gvl::new);
   }
}
