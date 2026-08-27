public class wy implements ux<wp> {
   private final gu a;
   private final int b;
   private final int c;
   private final csl d;

   public wy(gu $$0, csl $$1, int $$2, int $$3) {
      this.a = $$0;
      this.d = $$1;
      this.b = $$2;
      this.c = $$3;
   }

   public wy(si $$0) {
      this.a = $$0.e();
      this.b = $$0.readUnsignedByte();
      this.c = $$0.readUnsignedByte();
      this.d = $$0.a(jb.f);
   }

   @Override
   public void a(si $$0) {
      $$0.a(this.a);
      $$0.k(this.b);
      $$0.k(this.c);
      $$0.a(jb.f, this.d);
   }

   public void a(wp $$0) {
      $$0.a(this);
   }

   public gu a() {
      return this.a;
   }

   public int d() {
      return this.b;
   }

   public int e() {
      return this.c;
   }

   public csl f() {
      return this.d;
   }
}
