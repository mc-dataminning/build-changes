public class zj implements xg<zb> {
   private final hx a;
   private final int b;
   private final int c;
   private final cwy d;

   public zj(hx $$0, cwy $$1, int $$2, int $$3) {
      this.a = $$0;
      this.d = $$1;
      this.b = $$2;
      this.c = $$3;
   }

   public zj(uj $$0) {
      this.a = $$0.e();
      this.b = $$0.readUnsignedByte();
      this.c = $$0.readUnsignedByte();
      this.d = $$0.a(kd.e);
   }

   @Override
   public void a(uj $$0) {
      $$0.a(this.a);
      $$0.k(this.b);
      $$0.k(this.c);
      $$0.a(kd.e, this.d);
   }

   public void a(zb $$0) {
      $$0.a(this);
   }

   public hx a() {
      return this.a;
   }

   public int d() {
      return this.b;
   }

   public int e() {
      return this.c;
   }

   public cwy f() {
      return this.d;
   }
}
