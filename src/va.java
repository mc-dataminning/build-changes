import com.google.common.collect.ImmutableMap;
import java.util.Map;

public record va(vo a) implements uw<uz> {
   private static final int b = 1048576;
   private static final Map<aep, sh.a<? extends vo>> c = ImmutableMap.builder()
      .put(vn.a, vn::new)
      .put(vl.a, vl::new)
      .put(vm.a, vm::new)
      .put(vq.a, vq::new)
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
      .build();

   public va(sh $$0) {
      this(a($$0.s(), $$0));
   }

   private static vo a(aep $$0, sh $$1) {
      sh.a<? extends vo> $$2 = c.get($$0);
      return (vo)($$2 != null ? $$2.apply($$1) : b($$0, $$1));
   }

   private static vp b(aep $$0, sh $$1) {
      int $$2 = $$1.readableBytes();
      if ($$2 >= 0 && $$2 <= 1048576) {
         $$1.j($$2);
         return new vp($$0);
      } else {
         throw new IllegalArgumentException("Payload may not be larger than 1048576 bytes");
      }
   }

   @Override
   public void a(sh $$0) {
      $$0.a(this.a.a());
      this.a.a($$0);
   }

   public void a(uz $$0) {
      $$0.a(this);
   }
}
