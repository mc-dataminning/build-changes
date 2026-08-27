import com.google.common.collect.ImmutableMap;
import java.util.Map;

public record ws(xh a) implements wo<wr> {
   private static final int b = 1048576;
   private static final Map<agm, ty.a<? extends xh>> c = ImmutableMap.builder()
      .put(xg.a, xg::new)
      .put(xe.a, xe::new)
      .put(xf.a, xf::new)
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
      .put(xu.a, xu::new)
      .put(xv.a, xv::new)
      .put(xw.a, xw::new)
      .put(xx.a, xx::new)
      .build();

   public ws(ty $$0) {
      this(a($$0.t(), $$0));
   }

   private static xh a(agm $$0, ty $$1) {
      ty.a<? extends xh> $$2 = c.get($$0);
      return (xh)($$2 != null ? $$2.apply($$1) : b($$0, $$1));
   }

   private static xi b(agm $$0, ty $$1) {
      int $$2 = $$1.readableBytes();
      if ($$2 >= 0 && $$2 <= 1048576) {
         $$1.j($$2);
         return new xi($$0);
      } else {
         throw new IllegalArgumentException("Payload may not be larger than 1048576 bytes");
      }
   }

   @Override
   public void a(ty $$0) {
      $$0.a(this.a.a());
      this.a.a($$0);
   }

   public void a(wr $$0) {
      $$0.a(this);
   }
}
