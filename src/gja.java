public class gja extends gks<cjc, fui<cjc>> {
   private static final akk a = new akk("textures/entity/creeper/creeper.png");

   public gja(gjm.a $$0) {
      super($$0, new fui<>($$0.a(fxn.H)), 0.5F);
      this.a(new gnb(this, $$0.f()));
   }

   protected void a(cjc $$0, fam $$1, float $$2) {
      float $$3 = $$0.H($$2);
      float $$4 = 1.0F + ayg.a($$3 * 100.0F) * $$3 * 0.01F;
      $$3 = ayg.a($$3, 0.0F, 1.0F);
      $$3 *= $$3;
      $$3 *= $$3;
      float $$5 = (1.0F + $$3 * 0.4F) * $$4;
      float $$6 = (1.0F + $$3 * 0.1F) / $$4;
      $$1.b($$5, $$6, $$5);
   }

   protected float a(cjc $$0, float $$1) {
      float $$2 = $$0.H($$1);
      return (int)($$2 * 10.0F) % 2 == 0 ? 0.0F : ayg.a($$2, 0.5F, 1.0F);
   }

   public akk a(cjc $$0) {
      return a;
   }
}
