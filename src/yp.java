public class yp implements wo<yh> {
   private final hx a;
   private final int b;
   private final int c;
   private final cvf d;

   public yp(hx $$0, cvf $$1, int $$2, int $$3) {
      this.a = $$0;
      this.d = $$1;
      this.b = $$2;
      this.c = $$3;
   }

   public yp(ty $$0) {
      this.a = $$0.e();
      this.b = $$0.readUnsignedByte();
      this.c = $$0.readUnsignedByte();
      this.d = $$0.a(kc.f);
   }

   @Override
   public void a(ty $$0) {
      $$0.a(this.a);
      $$0.k(this.b);
      $$0.k(this.c);
      $$0.a(kc.f, this.d);
   }

   public void a(yh $$0) {
      $$0.a(this);
   }

   public hx a() {
      return this.a;
   }

   public int d() {
      return this.b;
   }

   public int e() {
      return this.c;
   }

   public cvf f() {
      return this.d;
   }
}
