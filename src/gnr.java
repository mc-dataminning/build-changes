import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Maps;
import com.google.common.collect.ImmutableMap.Builder;
import java.util.Map;

public class gnr {
   private static final Map<dur<?>, gnq<?>> a = Maps.newHashMap();

   private static <T extends dup> void a(dur<? extends T> $$0, gnq<T> $$1) {
      a.put($$0, $$1);
   }

   public static Map<dur<?>, gnp<?>> a(gnq.a $$0) {
      Builder<dur<?>, gnp<?>> $$1 = ImmutableMap.builder();
      a.forEach(($$2, $$3) -> {
         try {
            $$1.put($$2, $$3.create($$0));
         } catch (Exception var5) {
            throw new IllegalStateException("Failed to create model for " + ma.j.b((dur<?>)$$2), var5);
         }
      });
      return $$1.build();
   }

   static {
      a(dur.h, god::new);
      a(dur.i, gnz::new);
      a(dur.j, gof::new);
      a(dur.l, gob::new);
      a(dur.b, gnv::new);
      a(dur.d, gnv::new);
      a(dur.c, gnv::new);
      a(dur.n, gny::new);
      a(dur.E, goa::new);
      a(dur.o, goi::new);
      a(dur.w, goh::new);
      a(dur.p, gnl::new);
      a(dur.q, goe::new);
      a(dur.u, gnk::new);
      a(dur.v, gog::new);
      a(dur.y, goc::new);
      a(dur.z, gnm::new);
      a(dur.A, gnw::new);
      a(dur.F, gnn::new);
      a(dur.H, gnu::new);
      a(dur.O, gnt::new);
      a(dur.P, gnx::new);
      a(dur.R, goj::new);
      a(dur.S, gok::new);
   }
}
