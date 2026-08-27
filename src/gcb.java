import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Maps;
import com.google.common.collect.ImmutableMap.Builder;
import java.util.Map;

public class gcb {
   private static final Map<dmh<?>, gca<?>> a = Maps.newHashMap();

   private static <T extends dmf> void a(dmh<? extends T> $$0, gca<T> $$1) {
      a.put($$0, $$1);
   }

   public static Map<dmh<?>, gbz<?>> a(gca.a $$0) {
      Builder<dmh<?>, gbz<?>> $$1 = ImmutableMap.builder();
      a.forEach(($$2, $$3) -> {
         try {
            $$1.put($$2, $$3.create($$0));
         } catch (Exception var5) {
            throw new IllegalStateException("Failed to create model for " + kr.k.b((dmh<?>)$$2), var5);
         }
      });
      return $$1.build();
   }

   static {
      a(dmh.h, gcn::new);
      a(dmh.i, gcj::new);
      a(dmh.j, gcp::new);
      a(dmh.k, gcl::new);
      a(dmh.b, gcf::new);
      a(dmh.d, gcf::new);
      a(dmh.c, gcf::new);
      a(dmh.m, gci::new);
      a(dmh.D, gck::new);
      a(dmh.n, gcs::new);
      a(dmh.v, gcr::new);
      a(dmh.o, gbv::new);
      a(dmh.p, gco::new);
      a(dmh.t, gbu::new);
      a(dmh.u, gcq::new);
      a(dmh.x, gcm::new);
      a(dmh.y, gbw::new);
      a(dmh.z, gcg::new);
      a(dmh.E, gbx::new);
      a(dmh.G, gce::new);
      a(dmh.N, gcd::new);
      a(dmh.O, gch::new);
      a(dmh.Q, gct::new);
      a(dmh.R, gcu::new);
   }
}
