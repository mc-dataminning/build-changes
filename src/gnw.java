import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Maps;
import com.google.common.collect.ImmutableMap.Builder;
import java.util.Map;

public class gnw {
   private static final Map<duy<?>, gnv<?>> a = Maps.newHashMap();

   private static <T extends duw> void a(duy<? extends T> $$0, gnv<T> $$1) {
      a.put($$0, $$1);
   }

   public static Map<duy<?>, gnu<?>> a(gnv.a $$0) {
      Builder<duy<?>, gnu<?>> $$1 = ImmutableMap.builder();
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
      a(duy.h, goi::new);
      a(duy.i, goe::new);
      a(duy.j, gok::new);
      a(duy.l, gog::new);
      a(duy.b, goa::new);
      a(duy.d, goa::new);
      a(duy.c, goa::new);
      a(duy.n, god::new);
      a(duy.E, gof::new);
      a(duy.o, gon::new);
      a(duy.w, gom::new);
      a(duy.p, gnq::new);
      a(duy.q, goj::new);
      a(duy.u, gnp::new);
      a(duy.v, gol::new);
      a(duy.y, goh::new);
      a(duy.z, gnr::new);
      a(duy.A, gob::new);
      a(duy.F, gns::new);
      a(duy.H, gnz::new);
      a(duy.O, gny::new);
      a(duy.P, goc::new);
      a(duy.R, goo::new);
      a(duy.S, gop::new);
   }
}
