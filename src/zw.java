import java.util.Map;

public class zw implements zf<zl> {
   public static final yw<vu, zw> a = zf.a(zw::a, zw::new);
   private final Map<alf<? extends js<?>>, axt.a> b;

   public zw(Map<alf<? extends js<?>>, axt.a> $$0) {
      this.b = $$0;
   }

   private zw(vu $$0) {
      this.b = $$0.a(vu::r, axt.a::b);
   }

   private void a(vu $$0) {
      $$0.a(this.b, vu::b, ($$0x, $$1) -> $$1.a($$0x));
   }

   @Override
   public zh<zw> a() {
      return zx.k;
   }

   public void a(zl $$0) {
      $$0.a(this);
   }

   public Map<alf<? extends js<?>>, axt.a> b() {
      return this.b;
   }
}
