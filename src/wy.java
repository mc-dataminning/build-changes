import com.google.common.collect.ImmutableMap;
import java.util.Map;

public record wy(xo a) implements wu<wx> {
   private static final int b = 1048576;
   private static final Map<agt, ue.a<? extends xo>> c = ImmutableMap.builder()
      .put(xm.a, xm::new)
      .put(xk.a, xk::new)
      .put(xl.a, xl::new)
      .put(xn.a, xn::new)
      .put(xq.a, xq::new)
      .put(xr.a, xr::new)
      .put(xs.a, xs::new)
      .put(xt.a, xt::new)
      .put(xu.a, xu::new)
      .put(xv.a, xv::new)
      .put(xw.a, xw::new)
      .put(xx.a, xx::new)
      .put(xy.a, xy::new)
      .put(xz.a, xz::new)
      .put(ya.a, ya::new)
      .put(yb.a, yb::new)
      .put(yc.a, yc::new)
      .put(yd.a, yd::new)
      .put(ye.a, ye::new)
      .build();

   public wy(ue $$0) {
      this(a($$0.t(), $$0));
   }

   private static xo a(agt $$0, ue $$1) {
      ue.a<? extends xo> $$2 = c.get($$0);
      return (xo)($$2 != null ? $$2.apply($$1) : b($$0, $$1));
   }

   private static xp b(agt $$0, ue $$1) {
      int $$2 = $$1.readableBytes();
      if ($$2 >= 0 && $$2 <= 1048576) {
         $$1.j($$2);
         return new xp($$0);
      } else {
         throw new IllegalArgumentException("Payload may not be larger than 1048576 bytes");
      }
   }

   @Override
   public void a(ue $$0) {
      $$0.a(this.a.a());
      this.a.a($$0);
   }

   public void a(wx $$0) {
      $$0.a(this);
   }
}
