import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Maps;
import com.google.common.collect.ImmutableMap.Builder;
import java.util.Map;

public class goj {
   private static final Map<dtz<?>, goi<?>> a = Maps.newHashMap();

   private static <T extends dtx> void a(dtz<? extends T> $$0, goi<T> $$1) {
      a.put($$0, $$1);
   }

   public static Map<dtz<?>, goh<?>> a(goi.a $$0) {
      Builder<dtz<?>, goh<?>> $$1 = ImmutableMap.builder();
      a.forEach(($$2, $$3) -> {
         try {
            $$1.put($$2, $$3.create($$0));
         } catch (Exception var5) {
            throw new IllegalStateException("Failed to create model for " + mb.j.b((dtz<?>)$$2), var5);
         }
      });
      return $$1.build();
   }

   static {
      a(dtz.h, gov::new);
      a(dtz.i, gor::new);
      a(dtz.j, gox::new);
      a(dtz.l, got::new);
      a(dtz.b, gon::new);
      a(dtz.d, gon::new);
      a(dtz.c, gon::new);
      a(dtz.n, goq::new);
      a(dtz.E, gos::new);
      a(dtz.o, gpa::new);
      a(dtz.w, goz::new);
      a(dtz.p, god::new);
      a(dtz.q, gow::new);
      a(dtz.u, goc::new);
      a(dtz.v, goy::new);
      a(dtz.y, gou::new);
      a(dtz.z, goe::new);
      a(dtz.A, goo::new);
      a(dtz.F, gof::new);
      a(dtz.H, gom::new);
      a(dtz.O, gol::new);
      a(dtz.P, gop::new);
      a(dtz.R, gpb::new);
      a(dtz.S, gpc::new);
   }
}
