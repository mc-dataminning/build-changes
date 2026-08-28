import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Maps;
import com.google.common.collect.ImmutableMap.Builder;
import java.util.Map;

public class gtf {
   private static final Map<dxt<?>, gte<?>> a = Maps.newHashMap();

   private static <T extends dxr> void a(dxt<? extends T> $$0, gte<T> $$1) {
      a.put($$0, $$1);
   }

   public static Map<dxt<?>, gtd<?>> a(gte.a $$0) {
      Builder<dxt<?>, gtd<?>> $$1 = ImmutableMap.builder();
      a.forEach(($$2, $$3) -> {
         try {
            $$1.put($$2, $$3.create($$0));
         } catch (Exception var5) {
            throw new IllegalStateException("Failed to create model for " + mg.j.b((dxt<?>)$$2), var5);
         }
      });
      return $$1.build();
   }

   static {
      a(dxt.h, gts::new);
      a(dxt.i, gto::new);
      a(dxt.j, gtu::new);
      a(dxt.l, gtq::new);
      a(dxt.b, gtk::new);
      a(dxt.d, gtk::new);
      a(dxt.c, gtk::new);
      a(dxt.n, gtn::new);
      a(dxt.E, gtp::new);
      a(dxt.o, gtx::new);
      a(dxt.w, gtw::new);
      a(dxt.p, gsz::new);
      a(dxt.q, gtt::new);
      a(dxt.u, gsy::new);
      a(dxt.v, gtg::new);
      a(dxt.U, gtv::new);
      a(dxt.y, gtr::new);
      a(dxt.z, gta::new);
      a(dxt.A, gtl::new);
      a(dxt.F, gtb::new);
      a(dxt.H, gtj::new);
      a(dxt.O, gti::new);
      a(dxt.P, gtm::new);
      a(dxt.R, gty::new);
      a(dxt.S, gtz::new);
   }
}
