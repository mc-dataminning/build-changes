import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Maps;
import com.google.common.collect.ImmutableMap.Builder;
import java.util.Map;

public class guc {
   private static final Map<dyq<?>, gub<?>> a = Maps.newHashMap();

   private static <T extends dyo> void a(dyq<? extends T> $$0, gub<T> $$1) {
      a.put($$0, $$1);
   }

   public static Map<dyq<?>, gua<?>> a(gub.a $$0) {
      Builder<dyq<?>, gua<?>> $$1 = ImmutableMap.builder();
      a.forEach(($$2, $$3) -> {
         try {
            $$1.put($$2, $$3.create($$0));
         } catch (Exception var5) {
            throw new IllegalStateException("Failed to create model for " + mh.j.b((dyq<?>)$$2), var5);
         }
      });
      return $$1.build();
   }

   static {
      a(dyq.h, gup::new);
      a(dyq.i, gul::new);
      a(dyq.j, gur::new);
      a(dyq.l, gun::new);
      a(dyq.b, guh::new);
      a(dyq.d, guh::new);
      a(dyq.c, guh::new);
      a(dyq.n, guk::new);
      a(dyq.E, gum::new);
      a(dyq.o, guu::new);
      a(dyq.w, gut::new);
      a(dyq.p, gtw::new);
      a(dyq.q, guq::new);
      a(dyq.u, gtv::new);
      a(dyq.v, gud::new);
      a(dyq.U, gus::new);
      a(dyq.y, guo::new);
      a(dyq.z, gtx::new);
      a(dyq.A, gui::new);
      a(dyq.F, gty::new);
      a(dyq.H, gug::new);
      a(dyq.O, guf::new);
      a(dyq.P, guj::new);
      a(dyq.R, guv::new);
      a(dyq.S, guw::new);
   }
}
