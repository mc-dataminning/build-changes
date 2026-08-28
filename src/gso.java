import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Maps;
import com.google.common.collect.ImmutableMap.Builder;
import java.util.Map;

public class gso {
   private static final Map<dxh<?>, gsn<?>> a = Maps.newHashMap();

   private static <T extends dxf> void a(dxh<? extends T> $$0, gsn<T> $$1) {
      a.put($$0, $$1);
   }

   public static Map<dxh<?>, gsm<?>> a(gsn.a $$0) {
      Builder<dxh<?>, gsm<?>> $$1 = ImmutableMap.builder();
      a.forEach(($$2, $$3) -> {
         try {
            $$1.put($$2, $$3.create($$0));
         } catch (Exception var5) {
            throw new IllegalStateException("Failed to create model for " + mf.j.b((dxh<?>)$$2), var5);
         }
      });
      return $$1.build();
   }

   static {
      a(dxh.h, gtb::new);
      a(dxh.i, gsx::new);
      a(dxh.j, gtd::new);
      a(dxh.l, gsz::new);
      a(dxh.b, gst::new);
      a(dxh.d, gst::new);
      a(dxh.c, gst::new);
      a(dxh.n, gsw::new);
      a(dxh.E, gsy::new);
      a(dxh.o, gtg::new);
      a(dxh.w, gtf::new);
      a(dxh.p, gsi::new);
      a(dxh.q, gtc::new);
      a(dxh.u, gsh::new);
      a(dxh.v, gsp::new);
      a(dxh.U, gte::new);
      a(dxh.y, gta::new);
      a(dxh.z, gsj::new);
      a(dxh.A, gsu::new);
      a(dxh.F, gsk::new);
      a(dxh.H, gss::new);
      a(dxh.O, gsr::new);
      a(dxh.P, gsv::new);
      a(dxh.R, gth::new);
      a(dxh.S, gti::new);
   }
}
