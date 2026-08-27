public class zf implements xd<yx> {
   private final hx a;
   private final int b;
   private final int c;
   private final cwj d;

   public zf(hx $$0, cwj $$1, int $$2, int $$3) {
      this.a = $$0;
      this.d = $$1;
      this.b = $$2;
      this.c = $$3;
   }

   public zf(ug $$0) {
      this.a = $$0.e();
      this.b = $$0.readUnsignedByte();
      this.c = $$0.readUnsignedByte();
      this.d = $$0.a(kd.e);
   }

   @Override
   public void a(ug $$0) {
      $$0.a(this.a);
      $$0.k(this.b);
      $$0.k(this.c);
      $$0.a(kd.e, this.d);
   }

   public void a(yx $$0) {
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

   public cwj f() {
      return this.d;
   }
}
