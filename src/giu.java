public class giu extends gkm<ciz, fuc<ciz>> {
   private static final akk a = new akk("textures/entity/creeper/creeper.png");

   public giu(gjg.a $$0) {
      super($$0, new fuc<>($$0.a(fxh.H)), 0.5F);
      this.a(new gmv(this, $$0.f()));
   }

   protected void a(ciz $$0, fag $$1, float $$2) {
      float $$3 = $$0.H($$2);
      float $$4 = 1.0F + aye.a($$3 * 100.0F) * $$3 * 0.01F;
      $$3 = aye.a($$3, 0.0F, 1.0F);
      $$3 *= $$3;
      $$3 *= $$3;
      float $$5 = (1.0F + $$3 * 0.4F) * $$4;
      float $$6 = (1.0F + $$3 * 0.1F) / $$4;
      $$1.b($$5, $$6, $$5);
   }

   protected float a(ciz $$0, float $$1) {
      float $$2 = $$0.H($$1);
      return (int)($$2 * 10.0F) % 2 == 0 ? 0.0F : aye.a($$2, 0.5F, 1.0F);
   }

   public akk a(ciz $$0) {
      return a;
   }
}
