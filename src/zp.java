public record zp(String b, int c) implements zb<zh> {
   public static final ys<vr, zp> a = zb.a(zp::a, zp::new);

   private zp(vr $$0) {
      this($$0.p(), $$0.l());
   }

   private void a(vr $$0) {
      $$0.a(this.b);
      $$0.c(this.c);
   }

   @Override
   public zd<zp> a() {
      return zr.h;
   }

   public void a(zh $$0) {
      $$0.a(this);
   }

   public int e() {
      return this.c;
   }
}
