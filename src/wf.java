import com.google.common.collect.ImmutableMap;
import java.util.Map;

public record wf(wu a) implements wb<we> {
   private static final int b = 1048576;
   private static final Map<afw, tl.a<? extends wu>> c = ImmutableMap.builder()
      .put(wt.a, wt::new)
      .put(wr.a, wr::new)
      .put(ws.a, ws::new)
      .put(ww.a, ww::new)
      .put(wx.a, wx::new)
      .put(wy.a, wy::new)
      .put(wz.a, wz::new)
      .put(xa.a, xa::new)
      .put(xb.a, xb::new)
      .put(xc.a, xc::new)
      .put(xd.a, xd::new)
      .put(xe.a, xe::new)
      .put(xf.a, xf::new)
      .put(xg.a, xg::new)
      .put(xh.a, xh::new)
      .put(xi.a, xi::new)
      .put(xj.a, xj::new)
      .put(xk.a, xk::new)
      .build();

   public wf(tl $$0) {
      this(a($$0.t(), $$0));
   }

   private static wu a(afw $$0, tl $$1) {
      tl.a<? extends wu> $$2 = c.get($$0);
      return (wu)($$2 != null ? $$2.apply($$1) : b($$0, $$1));
   }

   private static wv b(afw $$0, tl $$1) {
      int $$2 = $$1.readableBytes();
      if ($$2 >= 0 && $$2 <= 1048576) {
         $$1.j($$2);
         return new wv($$0);
      } else {
         throw new IllegalArgumentException("Payload may not be larger than 1048576 bytes");
      }
   }

   @Override
   public void a(tl $$0) {
      $$0.a(this.a.a());
      this.a.a($$0);
   }

   public void a(we $$0) {
      $$0.a(this);
   }
}
