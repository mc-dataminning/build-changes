import com.google.common.collect.ImmutableMap;
import java.util.Map;

public record vi(vx a) implements ve<vh> {
   private static final int b = 1048576;
   private static final Map<aex, sp.a<? extends vx>> c = ImmutableMap.builder()
      .put(vw.a, vw::new)
      .put(vu.a, vu::new)
      .put(vv.a, vv::new)
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
      .put(wn.a, wn::new)
      .build();

   public vi(sp $$0) {
      this(a($$0.s(), $$0));
   }

   private static vx a(aex $$0, sp $$1) {
      sp.a<? extends vx> $$2 = c.get($$0);
      return (vx)($$2 != null ? $$2.apply($$1) : b($$0, $$1));
   }

   private static vy b(aex $$0, sp $$1) {
      int $$2 = $$1.readableBytes();
      if ($$2 >= 0 && $$2 <= 1048576) {
         $$1.j($$2);
         return new vy($$0);
      } else {
         throw new IllegalArgumentException("Payload may not be larger than 1048576 bytes");
      }
   }

   @Override
   public void a(sp $$0) {
      $$0.a(this.a.a());
      this.a.a($$0);
   }

   public void a(vh $$0) {
      $$0.a(this);
   }
}
