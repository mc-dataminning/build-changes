public class xf implements ve<wx> {
   private final gw a;
   private final int b;
   private final int c;
   private final ctc d;

   public xf(gw $$0, ctc $$1, int $$2, int $$3) {
      this.a = $$0;
      this.d = $$1;
      this.b = $$2;
      this.c = $$3;
   }

   public xf(so $$0) {
      this.a = $$0.e();
      this.b = $$0.readUnsignedByte();
      this.c = $$0.readUnsignedByte();
      this.d = $$0.a(jb.f);
   }

   @Override
   public void a(so $$0) {
      $$0.a(this.a);
      $$0.k(this.b);
      $$0.k(this.c);
      $$0.a(jb.f, this.d);
   }

   public void a(wx $$0) {
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

   public ctc f() {
      return this.d;
   }
}
