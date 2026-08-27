public class yb implements uo<ur> {
   private final float a;
   private final int b;
   private final float c;

   public yb(float $$0, int $$1, float $$2) {
      this.a = $$0;
      this.b = $$1;
      this.c = $$2;
   }

   public yb(sf $$0) {
      this.a = $$0.readFloat();
      this.b = $$0.m();
      this.c = $$0.readFloat();
   }

   @Override
   public void a(sf $$0) {
      $$0.writeFloat(this.a);
      $$0.d(this.b);
      $$0.writeFloat(this.c);
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

   public float d() {
      return this.c;
   }
}
