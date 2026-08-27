import com.google.common.collect.ImmutableMap;
import java.util.Map;

public record vj(vy a) implements vf<vi> {
   private static final int b = 1048576;
   private static final Map<aey, sq.a<? extends vy>> c = ImmutableMap.builder()
      .put(vx.a, vx::new)
      .put(vv.a, vv::new)
      .put(vw.a, vw::new)
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
      .put(wo.a, wo::new)
      .build();

   public vj(sq $$0) {
      this(a($$0.s(), $$0));
   }

   private static vy a(aey $$0, sq $$1) {
      sq.a<? extends vy> $$2 = c.get($$0);
      return (vy)($$2 != null ? $$2.apply($$1) : b($$0, $$1));
   }

   private static vz b(aey $$0, sq $$1) {
      int $$2 = $$1.readableBytes();
      if ($$2 >= 0 && $$2 <= 1048576) {
         $$1.j($$2);
         return new vz($$0);
      } else {
         throw new IllegalArgumentException("Payload may not be larger than 1048576 bytes");
      }
   }

   @Override
   public void a(sq $$0) {
      $$0.a(this.a.a());
      this.a.a($$0);
   }

   public void a(vi $$0) {
      $$0.a(this);
   }
}
