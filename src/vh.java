import com.google.common.collect.ImmutableMap;
import java.util.Map;

public record vh(vw a) implements vd<vg> {
   private static final int b = 1048576;
   private static final Map<aex, so.a<? extends vw>> c = ImmutableMap.builder()
      .put(vv.a, vv::new)
      .put(vt.a, vt::new)
      .put(vu.a, vu::new)
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
      .put(wj.a, wj::new)
      .put(wk.a, wk::new)
      .put(wl.a, wl::new)
      .put(wm.a, wm::new)
      .build();

   public vh(so $$0) {
      this(a($$0.s(), $$0));
   }

   private static vw a(aex $$0, so $$1) {
      so.a<? extends vw> $$2 = c.get($$0);
      return (vw)($$2 != null ? $$2.apply($$1) : b($$0, $$1));
   }

   private static vx b(aex $$0, so $$1) {
      int $$2 = $$1.readableBytes();
      if ($$2 >= 0 && $$2 <= 1048576) {
         $$1.j($$2);
         return new vx($$0);
      } else {
         throw new IllegalArgumentException("Payload may not be larger than 1048576 bytes");
      }
   }

   @Override
   public void a(so $$0) {
      $$0.a(this.a.a());
      this.a.a($$0);
   }

   public void a(vg $$0) {
      $$0.a(this);
   }
}
