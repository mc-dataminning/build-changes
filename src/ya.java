public class ya implements wb<xu> {
   private final int a;
   private final ht b;
   private final int c;

   public ya(int $$0, ht $$1, int $$2) {
      this.a = $$0;
      this.b = $$1;
      this.c = $$2;
   }

   public ya(tl $$0) {
      this.a = $$0.n();
      this.b = $$0.e();
      this.c = $$0.readUnsignedByte();
   }

   @Override
   public void a(tl $$0) {
      $$0.c(this.a);
      $$0.a(this.b);
      $$0.k(this.c);
   }

   public void a(xu $$0) {
      $$0.a(this);
   }

   public int a() {
      return this.a;
   }

   public ht d() {
      return this.b;
   }

   public int e() {
      return this.c;
   }
}
