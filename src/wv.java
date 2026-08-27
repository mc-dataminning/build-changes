public class wv implements uw<wo> {
   private final int a;
   private final gv b;
   private final int c;

   public wv(int $$0, gv $$1, int $$2) {
      this.a = $$0;
      this.b = $$1;
      this.c = $$2;
   }

   public wv(sh $$0) {
      this.a = $$0.m();
      this.b = $$0.e();
      this.c = $$0.readUnsignedByte();
   }

   @Override
   public void a(sh $$0) {
      $$0.c(this.a);
      $$0.a(this.b);
      $$0.k(this.c);
   }

   public void a(wo $$0) {
      $$0.a(this);
   }

   public int a() {
      return this.a;
   }

   public gv d() {
      return this.b;
   }

   public int e() {
      return this.c;
   }
}
