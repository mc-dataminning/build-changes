public class yw implements wu<yo> {
   private final hv a;
   private final int b;
   private final int c;
   private final cvz d;

   public yw(hv $$0, cvz $$1, int $$2, int $$3) {
      this.a = $$0;
      this.d = $$1;
      this.b = $$2;
      this.c = $$3;
   }

   public yw(ue $$0) {
      this.a = $$0.e();
      this.b = $$0.readUnsignedByte();
      this.c = $$0.readUnsignedByte();
      this.d = $$0.a(kb.e);
   }

   @Override
   public void a(ue $$0) {
      $$0.a(this.a);
      $$0.k(this.b);
      $$0.k(this.c);
      $$0.a(kb.e, this.d);
   }

   public void a(yo $$0) {
      $$0.a(this);
   }

   public hv a() {
      return this.a;
   }

   public int d() {
      return this.b;
   }

   public int e() {
      return this.c;
   }

   public cvz f() {
      return this.d;
   }
}
