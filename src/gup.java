import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Maps;
import com.google.common.collect.ImmutableMap.Builder;
import java.util.Map;

public class gup {
   private static final Map<dye<?>, guo<?>> a = Maps.newHashMap();

   private static <T extends dyc> void a(dye<? extends T> $$0, guo<T> $$1) {
      a.put($$0, $$1);
   }

   public static Map<dye<?>, gun<?>> a(guo.a $$0) {
      Builder<dye<?>, gun<?>> $$1 = ImmutableMap.builder();
      a.forEach(($$2, $$3) -> {
         try {
            $$1.put($$2, $$3.create($$0));
         } catch (Exception var5) {
            throw new IllegalStateException("Failed to create model for " + mg.j.b((dye<?>)$$2), var5);
         }
      });
      return $$1.build();
   }

   static {
      a(dye.h, gvc::new);
      a(dye.i, guy::new);
      a(dye.j, gve::new);
      a(dye.l, gva::new);
      a(dye.b, guu::new);
      a(dye.d, guu::new);
      a(dye.c, guu::new);
      a(dye.n, gux::new);
      a(dye.E, guz::new);
      a(dye.o, gvh::new);
      a(dye.w, gvg::new);
      a(dye.p, guj::new);
      a(dye.q, gvd::new);
      a(dye.u, gui::new);
      a(dye.v, guq::new);
      a(dye.U, gvf::new);
      a(dye.y, gvb::new);
      a(dye.z, guk::new);
      a(dye.A, guv::new);
      a(dye.F, gul::new);
      a(dye.H, gut::new);
      a(dye.O, gus::new);
      a(dye.P, guw::new);
      a(dye.R, gvi::new);
      a(dye.S, gvj::new);
   }
}
