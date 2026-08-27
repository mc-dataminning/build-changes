import com.google.common.collect.ImmutableMap;
import java.util.Map;

public record ve(vs a) implements va<vd> {
   private static final int b = 1048576;
   private static final Map<aeu, sl.a<? extends vs>> c = ImmutableMap.builder()
      .put(vr.a, vr::new)
      .put(vp.a, vp::new)
      .put(vq.a, vq::new)
      .put(vu.a, vu::new)
      .put(vv.a, vv::new)
      .put(vw.a, vw::new)
      .put(vx.a, vx::new)
      .put(vy.a, vy::new)
      .put(vz.a, vz::new)
      .put(wa.a, wa::new)
      .put(wb.a, wb::new)
      .put(wc.a, wc::new)
      .put(wd.a, wd::new)
      .put(we.a, we::new)
      .put(wf.a, wf::new)
      .put(wg.a, wg::new)
      .put(wh.a, wh::new)
      .put(wi.a, wi::new)
      .build();

   public ve(sl $$0) {
      this(a($$0.s(), $$0));
   }

   private static vs a(aeu $$0, sl $$1) {
      sl.a<? extends vs> $$2 = c.get($$0);
      return (vs)($$2 != null ? $$2.apply($$1) : b($$0, $$1));
   }

   private static vt b(aeu $$0, sl $$1) {
      int $$2 = $$1.readableBytes();
      if ($$2 >= 0 && $$2 <= 1048576) {
         $$1.j($$2);
         return new vt($$0);
      } else {
         throw new IllegalArgumentException("Payload may not be larger than 1048576 bytes");
      }
   }

   @Override
   public void a(sl $$0) {
      $$0.a(this.a.a());
      this.a.a($$0);
   }

   public void a(vd $$0) {
      $$0.a(this);
   }
}
