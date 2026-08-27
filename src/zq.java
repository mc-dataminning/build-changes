import java.util.Map;

public class zq implements zb<zh> {
   public static final ys<vu, zq> a = zb.a(zq::a, zq::new);
   private final Map<akg<? extends jj<?>>, awj.a> b;

   public zq(Map<akg<? extends jj<?>>, awj.a> $$0) {
      this.b = $$0;
   }

   private zq(vu $$0) {
      this.b = $$0.a(vu::r, awj.a::b);
   }

   private void a(vu $$0) {
      $$0.a(this.b, vu::b, ($$0x, $$1) -> $$1.a($$0x));
   }

   @Override
   public zd<zq> a() {
      return zr.i;
   }

   public void a(zh $$0) {
      $$0.a(this);
   }

   public Map<akg<? extends jj<?>>, awj.a> b() {
      return this.b;
   }
}
