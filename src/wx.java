public class wx implements uw<wo> {
   private final gv a;
   private final int b;
   private final int c;
   private final csk d;

   public wx(gv $$0, csk $$1, int $$2, int $$3) {
      this.a = $$0;
      this.d = $$1;
      this.b = $$2;
      this.c = $$3;
   }

   public wx(sh $$0) {
      this.a = $$0.e();
      this.b = $$0.readUnsignedByte();
      this.c = $$0.readUnsignedByte();
      this.d = $$0.a(jc.f);
   }

   @Override
   public void a(sh $$0) {
      $$0.a(this.a);
      $$0.k(this.b);
      $$0.k(this.c);
      $$0.a(jc.f, this.d);
   }

   public void a(wo $$0) {
      $$0.a(this);
   }

   public gv a() {
      return this.a;
   }

   public int d() {
      return this.b;
   }

   public int e() {
      return this.c;
   }

   public csk f() {
      return this.d;
   }
}
