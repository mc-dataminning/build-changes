import com.google.common.collect.ImmutableMap;
import java.util.Map;

public record xj(ya a) implements xf<xi> {
   private static final int b = 1048576;
   private static final Map<ahg, ui.a<? extends ya>> c = ImmutableMap.builder()
      .put(xy.a, xy::new)
      .put(xw.a, xw::new)
      .put(xx.a, xx::new)
      .put(xz.a, xz::new)
      .put(yc.a, yc::new)
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
      .build();

   public xj(ui $$0) {
      this(a($$0.t(), $$0));
   }

   private static ya a(ahg $$0, ui $$1) {
      ui.a<? extends ya> $$2 = c.get($$0);
      return (ya)($$2 != null ? $$2.apply($$1) : b($$0, $$1));
   }

   private static yb b(ahg $$0, ui $$1) {
      int $$2 = $$1.readableBytes();
      if ($$2 >= 0 && $$2 <= 1048576) {
         $$1.j($$2);
         return new yb($$0);
      } else {
         throw new IllegalArgumentException("Payload may not be larger than 1048576 bytes");
      }
   }

   @Override
   public void a(ui $$0) {
      $$0.a(this.a.a());
      this.a.a($$0);
   }

   public void a(xi $$0) {
      $$0.a(this);
   }
}
