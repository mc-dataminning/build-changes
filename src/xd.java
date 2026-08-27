public class xd implements vd<ww> {
   private final int a;
   private final gw b;
   private final int c;

   public xd(int $$0, gw $$1, int $$2) {
      this.a = $$0;
      this.b = $$1;
      this.c = $$2;
   }

   public xd(so $$0) {
      this.a = $$0.m();
      this.b = $$0.e();
      this.c = $$0.readUnsignedByte();
   }

   @Override
   public void a(so $$0) {
      $$0.c(this.a);
      $$0.a(this.b);
      $$0.k(this.c);
   }

   public void a(ww $$0) {
      $$0.a(this);
   }

   public int a() {
      return this.a;
   }

   public gw d() {
      return this.b;
   }

   public int e() {
      return this.c;
   }
}
