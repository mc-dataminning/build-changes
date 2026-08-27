import com.google.common.collect.ImmutableMap;
import java.util.Map;

public record wo(xd a) implements wk<wn> {
   private static final int b = 1048576;
   private static final Map<agg, tu.a<? extends xd>> c = ImmutableMap.builder()
      .put(xc.a, xc::new)
      .put(xa.a, xa::new)
      .put(xb.a, xb::new)
      .put(xf.a, xf::new)
      .put(xg.a, xg::new)
      .put(xh.a, xh::new)
      .put(xi.a, xi::new)
      .put(xj.a, xj::new)
      .put(xk.a, xk::new)
      .put(xl.a, xl::new)
      .put(xm.a, xm::new)
      .put(xn.a, xn::new)
      .put(xo.a, xo::new)
      .put(xp.a, xp::new)
      .put(xq.a, xq::new)
      .put(xr.a, xr::new)
      .put(xs.a, xs::new)
      .put(xt.a, xt::new)
      .build();

   public wo(tu $$0) {
      this(a($$0.t(), $$0));
   }

   private static xd a(agg $$0, tu $$1) {
      tu.a<? extends xd> $$2 = c.get($$0);
      return (xd)($$2 != null ? $$2.apply($$1) : b($$0, $$1));
   }

   private static xe b(agg $$0, tu $$1) {
      int $$2 = $$1.readableBytes();
      if ($$2 >= 0 && $$2 <= 1048576) {
         $$1.j($$2);
         return new xe($$0);
      } else {
         throw new IllegalArgumentException("Payload may not be larger than 1048576 bytes");
      }
   }

   @Override
   public void a(tu $$0) {
      $$0.a(this.a.a());
      this.a.a($$0);
   }

   public void a(wn $$0) {
      $$0.a(this);
   }
}
