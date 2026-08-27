import com.google.common.collect.ImmutableMap;
import java.util.Map;

public record xk(yb a) implements xg<xj> {
   private static final int b = 1048576;
   private static final Map<ahh, uj.a<? extends yb>> c = ImmutableMap.builder()
      .put(xz.a, xz::new)
      .put(xx.a, xx::new)
      .put(xy.a, xy::new)
      .put(ya.a, ya::new)
      .put(yd.a, yd::new)
      .put(ye.a, ye::new)
      .put(yf.a, yf::new)
      .put(yg.a, yg::new)
      .put(yh.a, yh::new)
      .put(yi.a, yi::new)
      .put(yj.a, yj::new)
      .put(yk.a, yk::new)
      .put(yl.a, yl::new)
      .put(ym.a, ym::new)
      .put(yn.a, yn::new)
      .put(yo.a, yo::new)
      .put(yp.a, yp::new)
      .put(yq.a, yq::new)
      .put(yr.a, yr::new)
      .build();

   public xk(uj $$0) {
      this(a($$0.t(), $$0));
   }

   private static yb a(ahh $$0, uj $$1) {
      uj.a<? extends yb> $$2 = c.get($$0);
      return (yb)($$2 != null ? $$2.apply($$1) : b($$0, $$1));
   }

   private static yc b(ahh $$0, uj $$1) {
      int $$2 = $$1.readableBytes();
      if ($$2 >= 0 && $$2 <= 1048576) {
         $$1.j($$2);
         return new yc($$0);
      } else {
         throw new IllegalArgumentException("Payload may not be larger than 1048576 bytes");
      }
   }

   @Override
   public void a(uj $$0) {
      $$0.a(this.a.a());
      this.a.a($$0);
   }

   public void a(xj $$0) {
      $$0.a(this);
   }
}
