import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Maps;
import com.google.common.collect.ImmutableMap.Builder;
import java.util.Map;

public class gnx {
   private static final Map<duy<?>, gnw<?>> a = Maps.newHashMap();

   private static <T extends duw> void a(duy<? extends T> $$0, gnw<T> $$1) {
      a.put($$0, $$1);
   }

   public static Map<duy<?>, gnv<?>> a(gnw.a $$0) {
      Builder<duy<?>, gnv<?>> $$1 = ImmutableMap.builder();
      a.forEach(($$2, $$3) -> {
         try {
            $$1.put($$2, $$3.create($$0));
         } catch (Exception var5) {
            throw new IllegalStateException("Failed to create model for " + ma.j.b((duy<?>)$$2), var5);
         }
      });
      return $$1.build();
   }

   static {
      a(duy.h, goj::new);
      a(duy.i, gof::new);
      a(duy.j, gol::new);
      a(duy.l, goh::new);
      a(duy.b, gob::new);
      a(duy.d, gob::new);
      a(duy.c, gob::new);
      a(duy.n, goe::new);
      a(duy.E, gog::new);
      a(duy.o, goo::new);
      a(duy.w, gon::new);
      a(duy.p, gnr::new);
      a(duy.q, gok::new);
      a(duy.u, gnq::new);
      a(duy.v, gom::new);
      a(duy.y, goi::new);
      a(duy.z, gns::new);
      a(duy.A, goc::new);
      a(duy.F, gnt::new);
      a(duy.H, goa::new);
      a(duy.O, gnz::new);
      a(duy.P, god::new);
      a(duy.R, gop::new);
      a(duy.S, goq::new);
   }
}
