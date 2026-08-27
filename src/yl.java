public class yl implements wk<yd> {
   private final ht a;
   private final int b;
   private final int c;
   private final cva d;

   public yl(ht $$0, cva $$1, int $$2, int $$3) {
      this.a = $$0;
      this.d = $$1;
      this.b = $$2;
      this.c = $$3;
   }

   public yl(tu $$0) {
      this.a = $$0.e();
      this.b = $$0.readUnsignedByte();
      this.c = $$0.readUnsignedByte();
      this.d = $$0.a(jy.f);
   }

   @Override
   public void a(tu $$0) {
      $$0.a(this.a);
      $$0.k(this.b);
      $$0.k(this.c);
      $$0.a(jy.f, this.d);
   }

   public void a(yd $$0) {
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

   public cva f() {
      return this.d;
   }
}
