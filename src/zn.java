import java.util.Map;

public class zn implements yw<zc> {
   public static final yn<vl, zn> a = yw.a(zn::a, zn::new);
   private final Map<akt<? extends ke<?>>, axh.a> b;

   public zn(Map<akt<? extends ke<?>>, axh.a> $$0) {
      this.b = $$0;
   }

   private zn(vl $$0) {
      this.b = $$0.a(vl::r, axh.a::b);
   }

   private void a(vl $$0) {
      $$0.a(this.b, vl::b, ($$0x, $$1) -> $$1.a($$0x));
   }

   @Override
   public yy<zn> a() {
      return zo.k;
   }

   public void a(zc $$0) {
      $$0.a(this);
   }

   public Map<akt<? extends ke<?>>, axh.a> b() {
      return this.b;
   }
}
