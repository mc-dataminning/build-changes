import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Maps;
import com.google.common.collect.ImmutableMap.Builder;
import java.util.Map;

public class gol {
   private static final Map<dua<?>, gok<?>> a = Maps.newHashMap();

   private static <T extends dty> void a(dua<? extends T> $$0, gok<T> $$1) {
      a.put($$0, $$1);
   }

   public static Map<dua<?>, goj<?>> a(gok.a $$0) {
      Builder<dua<?>, goj<?>> $$1 = ImmutableMap.builder();
      a.forEach(($$2, $$3) -> {
         try {
            $$1.put($$2, $$3.create($$0));
         } catch (Exception var5) {
            throw new IllegalStateException("Failed to create model for " + mb.j.b((dua<?>)$$2), var5);
         }
      });
      return $$1.build();
   }

   static {
      a(dua.h, gox::new);
      a(dua.i, got::new);
      a(dua.j, goz::new);
      a(dua.l, gov::new);
      a(dua.b, gop::new);
      a(dua.d, gop::new);
      a(dua.c, gop::new);
      a(dua.n, gos::new);
      a(dua.E, gou::new);
      a(dua.o, gpc::new);
      a(dua.w, gpb::new);
      a(dua.p, gof::new);
      a(dua.q, goy::new);
      a(dua.u, goe::new);
      a(dua.v, gpa::new);
      a(dua.y, gow::new);
      a(dua.z, gog::new);
      a(dua.A, goq::new);
      a(dua.F, goh::new);
      a(dua.H, goo::new);
      a(dua.O, gon::new);
      a(dua.P, gor::new);
      a(dua.R, gpd::new);
      a(dua.S, gpe::new);
   }
}
