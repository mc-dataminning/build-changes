import java.util.Map;

public class zq implements zb<zh> {
   public static final ys<vr, zq> a = zb.a(zq::a, zq::new);
   private final Map<akj<? extends jw<?>>, awp.a> b;

   public zq(Map<akj<? extends jw<?>>, awp.a> $$0) {
      this.b = $$0;
   }

   private zq(vr $$0) {
      this.b = $$0.a(vr::r, awp.a::b);
   }

   private void a(vr $$0) {
      $$0.a(this.b, vr::b, ($$0x, $$1) -> $$1.a($$0x));
   }

   @Override
   public zd<zq> a() {
      return zr.i;
   }

   public void a(zh $$0) {
      $$0.a(this);
   }

   public Map<akj<? extends jw<?>>, awp.a> b() {
      return this.b;
   }
}
