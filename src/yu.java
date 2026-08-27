public class yu implements wu<yo> {
   private final int a;
   private final hv b;
   private final int c;

   public yu(int $$0, hv $$1, int $$2) {
      this.a = $$0;
      this.b = $$1;
      this.c = $$2;
   }

   public yu(ue $$0) {
      this.a = $$0.n();
      this.b = $$0.e();
      this.c = $$0.readUnsignedByte();
   }

   @Override
   public void a(ue $$0) {
      $$0.c(this.a);
      $$0.a(this.b);
      $$0.k(this.c);
   }

   public void a(yo $$0) {
      $$0.a(this);
   }

   public int a() {
      return this.a;
   }

   public hv d() {
      return this.b;
   }

   public int e() {
      return this.c;
   }
}
