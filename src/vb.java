import com.google.common.collect.ImmutableMap;
import java.util.Map;

public record vb(vp a) implements ux<va> {
   private static final int b = 1048576;
   private static final Map<aer, si.a<? extends vp>> c = ImmutableMap.builder()
      .put(vo.a, vo::new)
      .put(vm.a, vm::new)
      .put(vn.a, vn::new)
      .put(vr.a, vr::new)
      .put(vs.a, vs::new)
      .put(vt.a, vt::new)
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
      .build();

   public vb(si $$0) {
      this(a($$0.s(), $$0));
   }

   private static vp a(aer $$0, si $$1) {
      si.a<? extends vp> $$2 = c.get($$0);
      return (vp)($$2 != null ? $$2.apply($$1) : b($$0, $$1));
   }

   private static vq b(aer $$0, si $$1) {
      int $$2 = $$1.readableBytes();
      if ($$2 >= 0 && $$2 <= 1048576) {
         $$1.j($$2);
         return new vq($$0);
      } else {
         throw new IllegalArgumentException("Payload may not be larger than 1048576 bytes");
      }
   }

   @Override
   public void a(si $$0) {
      $$0.a(this.a.a());
      this.a.a($$0);
   }

   public void a(va $$0) {
      $$0.a(this);
   }
}
