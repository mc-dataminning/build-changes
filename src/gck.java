import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Maps;
import com.google.common.collect.ImmutableMap.Builder;
import java.util.Map;

public class gck {
   private static final Map<dmq<?>, gcj<?>> a = Maps.newHashMap();

   private static <T extends dmo> void a(dmq<? extends T> $$0, gcj<T> $$1) {
      a.put($$0, $$1);
   }

   public static Map<dmq<?>, gci<?>> a(gcj.a $$0) {
      Builder<dmq<?>, gci<?>> $$1 = ImmutableMap.builder();
      a.forEach(($$2, $$3) -> {
         try {
            $$1.put($$2, $$3.create($$0));
         } catch (Exception var5) {
            throw new IllegalStateException("Failed to create model for " + kt.k.b((dmq<?>)$$2), var5);
         }
      });
      return $$1.build();
   }

   static {
      a(dmq.h, gcw::new);
      a(dmq.i, gcs::new);
      a(dmq.j, gcy::new);
      a(dmq.k, gcu::new);
      a(dmq.b, gco::new);
      a(dmq.d, gco::new);
      a(dmq.c, gco::new);
      a(dmq.m, gcr::new);
      a(dmq.D, gct::new);
      a(dmq.n, gdb::new);
      a(dmq.v, gda::new);
      a(dmq.o, gce::new);
      a(dmq.p, gcx::new);
      a(dmq.t, gcd::new);
      a(dmq.u, gcz::new);
      a(dmq.x, gcv::new);
      a(dmq.y, gcf::new);
      a(dmq.z, gcp::new);
      a(dmq.E, gcg::new);
      a(dmq.G, gcn::new);
      a(dmq.N, gcm::new);
      a(dmq.O, gcq::new);
      a(dmq.Q, gdc::new);
      a(dmq.R, gdd::new);
   }
}
