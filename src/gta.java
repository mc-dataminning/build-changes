import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Maps;
import com.google.common.collect.ImmutableMap.Builder;
import java.util.Map;

public class gta {
   private static final Map<dxo<?>, gsz<?>> a = Maps.newHashMap();

   private static <T extends dxm> void a(dxo<? extends T> $$0, gsz<T> $$1) {
      a.put($$0, $$1);
   }

   public static Map<dxo<?>, gsy<?>> a(gsz.a $$0) {
      Builder<dxo<?>, gsy<?>> $$1 = ImmutableMap.builder();
      a.forEach(($$2, $$3) -> {
         try {
            $$1.put($$2, $$3.create($$0));
         } catch (Exception var5) {
            throw new IllegalStateException("Failed to create model for " + mg.j.b((dxo<?>)$$2), var5);
         }
      });
      return $$1.build();
   }

   static {
      a(dxo.h, gtn::new);
      a(dxo.i, gtj::new);
      a(dxo.j, gtp::new);
      a(dxo.l, gtl::new);
      a(dxo.b, gtf::new);
      a(dxo.d, gtf::new);
      a(dxo.c, gtf::new);
      a(dxo.n, gti::new);
      a(dxo.E, gtk::new);
      a(dxo.o, gts::new);
      a(dxo.w, gtr::new);
      a(dxo.p, gsu::new);
      a(dxo.q, gto::new);
      a(dxo.u, gst::new);
      a(dxo.v, gtb::new);
      a(dxo.U, gtq::new);
      a(dxo.y, gtm::new);
      a(dxo.z, gsv::new);
      a(dxo.A, gtg::new);
      a(dxo.F, gsw::new);
      a(dxo.H, gte::new);
      a(dxo.O, gtd::new);
      a(dxo.P, gth::new);
      a(dxo.R, gtt::new);
      a(dxo.S, gtu::new);
   }
}
