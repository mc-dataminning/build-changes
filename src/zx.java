import java.util.Map;

public class zx implements zg<zm> {
   public static final yx<vw, zx> a = zg.a(zx::a, zx::new);
   private final Map<akq<? extends jz<?>>, awx.a> b;

   public zx(Map<akq<? extends jz<?>>, awx.a> $$0) {
      this.b = $$0;
   }

   private zx(vw $$0) {
      this.b = $$0.a(vw::r, awx.a::b);
   }

   private void a(vw $$0) {
      $$0.a(this.b, vw::b, ($$0x, $$1) -> $$1.a($$0x));
   }

   @Override
   public zi<zx> a() {
      return zy.k;
   }

   public void a(zm $$0) {
      $$0.a(this);
   }

   public Map<akq<? extends jz<?>>, awx.a> b() {
      return this.b;
   }
}
