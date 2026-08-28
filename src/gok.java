import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Maps;
import com.google.common.collect.ImmutableMap.Builder;
import java.util.Map;

public class gok {
   private static final Map<dub<?>, goj<?>> a = Maps.newHashMap();

   private static <T extends dtz> void a(dub<? extends T> $$0, goj<T> $$1) {
      a.put($$0, $$1);
   }

   public static Map<dub<?>, goi<?>> a(goj.a $$0) {
      Builder<dub<?>, goi<?>> $$1 = ImmutableMap.builder();
      a.forEach(($$2, $$3) -> {
         try {
            $$1.put($$2, $$3.create($$0));
         } catch (Exception var5) {
            throw new IllegalStateException("Failed to create model for " + mb.j.b((dub<?>)$$2), var5);
         }
      });
      return $$1.build();
   }

   static {
      a(dub.h, gow::new);
      a(dub.i, gos::new);
      a(dub.j, goy::new);
      a(dub.l, gou::new);
      a(dub.b, goo::new);
      a(dub.d, goo::new);
      a(dub.c, goo::new);
      a(dub.n, gor::new);
      a(dub.E, got::new);
      a(dub.o, gpb::new);
      a(dub.w, gpa::new);
      a(dub.p, goe::new);
      a(dub.q, gox::new);
      a(dub.u, god::new);
      a(dub.v, goz::new);
      a(dub.y, gov::new);
      a(dub.z, gof::new);
      a(dub.A, gop::new);
      a(dub.F, gog::new);
      a(dub.H, gon::new);
      a(dub.O, gom::new);
      a(dub.P, goq::new);
      a(dub.R, gpc::new);
      a(dub.S, gpd::new);
   }
}
