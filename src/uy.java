public class uy implements uo<ur> {
   private final int a;
   private final gu b;
   private final int c;

   public uy(int $$0, gu $$1, int $$2) {
      this.a = $$0;
      this.b = $$1;
      this.c = $$2;
   }

   public uy(sf $$0) {
      this.a = $$0.m();
      this.b = $$0.f();
      this.c = $$0.readUnsignedByte();
   }

   @Override
   public void a(sf $$0) {
      $$0.d(this.a);
      $$0.a(this.b);
      $$0.writeByte(this.c);
   }

   public void a(ur $$0) {
      $$0.a(this);
   }

   public int a() {
      return this.a;
   }

   public gu c() {
      return this.b;
   }

   public int d() {
      return this.c;
   }
}
