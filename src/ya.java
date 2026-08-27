public class ya implements uo<ur> {
   private final float a;
   private final int b;
   private final int c;

   public ya(float $$0, int $$1, int $$2) {
      this.a = $$0;
      this.b = $$1;
      this.c = $$2;
   }

   public ya(sf $$0) {
      this.a = $$0.readFloat();
      this.c = $$0.m();
      this.b = $$0.m();
   }

   @Override
   public void a(sf $$0) {
      $$0.writeFloat(this.a);
      $$0.d(this.c);
      $$0.d(this.b);
   }

   public void a(ur $$0) {
      $$0.a(this);
   }

   public float a() {
      return this.a;
   }

   public int c() {
      return this.b;
   }

   public int d() {
      return this.c;
   }
}
