import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Maps;
import com.google.common.collect.ImmutableMap.Builder;
import java.util.Map;

public class gom {
   private static final Map<dub<?>, gol<?>> a = Maps.newHashMap();

   private static <T extends dtz> void a(dub<? extends T> $$0, gol<T> $$1) {
      a.put($$0, $$1);
   }

   public static Map<dub<?>, gok<?>> a(gol.a $$0) {
      Builder<dub<?>, gok<?>> $$1 = ImmutableMap.builder();
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
      a(dub.h, goy::new);
      a(dub.i, gou::new);
      a(dub.j, gpa::new);
      a(dub.l, gow::new);
      a(dub.b, goq::new);
      a(dub.d, goq::new);
      a(dub.c, goq::new);
      a(dub.n, got::new);
      a(dub.E, gov::new);
      a(dub.o, gpd::new);
      a(dub.w, gpc::new);
      a(dub.p, gog::new);
      a(dub.q, goz::new);
      a(dub.u, gof::new);
      a(dub.v, gpb::new);
      a(dub.y, gox::new);
      a(dub.z, goh::new);
      a(dub.A, gor::new);
      a(dub.F, goi::new);
      a(dub.H, gop::new);
      a(dub.O, goo::new);
      a(dub.P, gos::new);
      a(dub.R, gpe::new);
      a(dub.S, gpf::new);
   }
}
