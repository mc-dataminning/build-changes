public class xg implements vf<wy> {
   private final gw a;
   private final int b;
   private final int c;
   private final csx d;

   public xg(gw $$0, csx $$1, int $$2, int $$3) {
      this.a = $$0;
      this.d = $$1;
      this.b = $$2;
      this.c = $$3;
   }

   public xg(sq $$0) {
      this.a = $$0.e();
      this.b = $$0.readUnsignedByte();
      this.c = $$0.readUnsignedByte();
      this.d = $$0.a(jd.f);
   }

   @Override
   public void a(sq $$0) {
      $$0.a(this.a);
      $$0.k(this.b);
      $$0.k(this.c);
      $$0.a(jd.f, this.d);
   }

   public void a(wy $$0) {
      $$0.a(this);
   }

   public gw a() {
      return this.a;
   }

   public int d() {
      return this.b;
   }

   public int e() {
      return this.c;
   }

   public csx f() {
      return this.d;
   }
}
