import com.google.common.collect.ImmutableMap;
import java.util.Map;

public record xh(xx a) implements xd<xg> {
   private static final int b = 1048576;
   private static final Map<ahd, ug.a<? extends xx>> c = ImmutableMap.builder()
      .put(xv.a, xv::new)
      .put(xt.a, xt::new)
      .put(xu.a, xu::new)
      .put(xw.a, xw::new)
      .put(xz.a, xz::new)
      .put(ya.a, ya::new)
      .put(yb.a, yb::new)
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
      .build();

   public xh(ug $$0) {
      this(a($$0.t(), $$0));
   }

   private static xx a(ahd $$0, ug $$1) {
      ug.a<? extends xx> $$2 = c.get($$0);
      return (xx)($$2 != null ? $$2.apply($$1) : b($$0, $$1));
   }

   private static xy b(ahd $$0, ug $$1) {
      int $$2 = $$1.readableBytes();
      if ($$2 >= 0 && $$2 <= 1048576) {
         $$1.j($$2);
         return new xy($$0);
      } else {
         throw new IllegalArgumentException("Payload may not be larger than 1048576 bytes");
      }
   }

   @Override
   public void a(ug $$0) {
      $$0.a(this.a.a());
      this.a.a($$0);
   }

   public void a(xg $$0) {
      $$0.a(this);
   }
}
