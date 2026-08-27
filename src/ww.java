public class ww implements ux<wp> {
   private final int a;
   private final gu b;
   private final int c;

   public ww(int $$0, gu $$1, int $$2) {
      this.a = $$0;
      this.b = $$1;
      this.c = $$2;
   }

   public ww(si $$0) {
      this.a = $$0.m();
      this.b = $$0.e();
      this.c = $$0.readUnsignedByte();
   }

   @Override
   public void a(si $$0) {
      $$0.c(this.a);
      $$0.a(this.b);
      $$0.k(this.c);
   }

   public void a(wp $$0) {
      $$0.a(this);
   }

   public int a() {
      return this.a;
   }

   public gu d() {
      return this.b;
   }

   public int e() {
      return this.c;
   }
}
