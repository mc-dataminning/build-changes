public class yc implements wb<xu> {
   private final ht a;
   private final int b;
   private final int c;
   private final cua d;

   public yc(ht $$0, cua $$1, int $$2, int $$3) {
      this.a = $$0;
      this.d = $$1;
      this.b = $$2;
      this.c = $$3;
   }

   public yc(tl $$0) {
      this.a = $$0.e();
      this.b = $$0.readUnsignedByte();
      this.c = $$0.readUnsignedByte();
      this.d = $$0.a(jy.f);
   }

   @Override
   public void a(tl $$0) {
      $$0.a(this.a);
      $$0.k(this.b);
      $$0.k(this.c);
      $$0.a(jy.f, this.d);
   }

   public void a(xu $$0) {
      $$0.a(this);
   }

   public ht a() {
      return this.a;
   }

   public int d() {
      return this.b;
   }

   public int e() {
      return this.c;
   }

   public cua f() {
      return this.d;
   }
}
