public class za implements wb<xu> {
   private final int a;
   private final int b;
   private final int c;

   public za(int $$0, int $$1, int $$2) {
      this.a = $$0;
      this.b = $$1;
      this.c = $$2;
   }

   public za(tl $$0) {
      this.a = $$0.readUnsignedByte();
      this.b = $$0.n();
      this.c = $$0.readInt();
   }

   @Override
   public void a(tl $$0) {
      $$0.k(this.a);
      $$0.c(this.b);
      $$0.p(this.c);
   }

   public void a(xu $$0) {
      $$0.a(this);
   }

   public int a() {
      return this.a;
   }

   public int d() {
      return this.b;
   }

   public int e() {
      return this.c;
   }
}
