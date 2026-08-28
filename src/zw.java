import java.util.Map;

public class zw implements zf<zl> {
   public static final yw<vv, zw> a = zf.a(zw::a, zw::new);
   private final Map<akp<? extends jz<?>>, aww.a> b;

   public zw(Map<akp<? extends jz<?>>, aww.a> $$0) {
      this.b = $$0;
   }

   private zw(vv $$0) {
      this.b = $$0.a(vv::r, aww.a::b);
   }

   private void a(vv $$0) {
      $$0.a(this.b, vv::b, ($$0x, $$1) -> $$1.a($$0x));
   }

   @Override
   public zh<zw> a() {
      return zx.k;
   }

   public void a(zl $$0) {
      $$0.a(this);
   }

   public Map<akp<? extends jz<?>>, aww.a> b() {
      return this.b;
   }
}
