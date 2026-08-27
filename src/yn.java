public class yn implements wo<yh> {
   private final int a;
   private final hx b;
   private final int c;

   public yn(int $$0, hx $$1, int $$2) {
      this.a = $$0;
      this.b = $$1;
      this.c = $$2;
   }

   public yn(ty $$0) {
      this.a = $$0.n();
      this.b = $$0.e();
      this.c = $$0.readUnsignedByte();
   }

   @Override
   public void a(ty $$0) {
      $$0.c(this.a);
      $$0.a(this.b);
      $$0.k(this.c);
   }

   public void a(yh $$0) {
      $$0.a(this);
   }

   public int a() {
      return this.a;
   }

   public hx d() {
      return this.b;
   }

   public int e() {
      return this.c;
   }
}
