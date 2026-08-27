public record zn(String b, int c) implements yz<zf> {
   public static final yq<vs, zn> a = yz.a(zn::a, zn::new);

   private zn(vs $$0) {
      this($$0.p(), $$0.l());
   }

   private void a(vs $$0) {
      $$0.a(this.b);
      $$0.c(this.c);
   }

   @Override
   public zb<zn> a() {
      return zp.h;
   }

   public void a(zf $$0) {
      $$0.a(this);
   }

   public int e() {
      return this.c;
   }
}
