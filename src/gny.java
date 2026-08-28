import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Maps;
import com.google.common.collect.ImmutableMap.Builder;
import java.util.Map;

public class gny {
   private static final Map<duz<?>, gnx<?>> a = Maps.newHashMap();

   private static <T extends dux> void a(duz<? extends T> $$0, gnx<T> $$1) {
      a.put($$0, $$1);
   }

   public static Map<duz<?>, gnw<?>> a(gnx.a $$0) {
      Builder<duz<?>, gnw<?>> $$1 = ImmutableMap.builder();
      a.forEach(($$2, $$3) -> {
         try {
            $$1.put($$2, $$3.create($$0));
         } catch (Exception var5) {
            throw new IllegalStateException("Failed to create model for " + ma.j.b((duz<?>)$$2), var5);
         }
      });
      return $$1.build();
   }

   static {
      a(duz.h, gok::new);
      a(duz.i, gog::new);
      a(duz.j, gom::new);
      a(duz.l, goi::new);
      a(duz.b, goc::new);
      a(duz.d, goc::new);
      a(duz.c, goc::new);
      a(duz.n, gof::new);
      a(duz.E, goh::new);
      a(duz.o, gop::new);
      a(duz.w, goo::new);
      a(duz.p, gns::new);
      a(duz.q, gol::new);
      a(duz.u, gnr::new);
      a(duz.v, gon::new);
      a(duz.y, goj::new);
      a(duz.z, gnt::new);
      a(duz.A, god::new);
      a(duz.F, gnu::new);
      a(duz.H, gob::new);
      a(duz.O, goa::new);
      a(duz.P, goe::new);
      a(duz.R, goq::new);
      a(duz.S, gor::new);
   }
}
