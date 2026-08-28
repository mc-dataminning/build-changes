public class gio extends ghr<cjq, ftv<cjq>> {
   private static final ale a = new ale("textures/entity/zombie/drowned.png");

   public gio(giw.a $$0) {
      super($$0, new ftv<>($$0.a(fwy.R)), new ftv<>($$0.a(fwy.S)), new ftv<>($$0.a(fwy.T)));
      this.a(new gmq<>(this, $$0.f()));
   }

   @Override
   public ale a(ckv $$0) {
      return a;
   }

   protected void a(cjq $$0, ezx $$1, float $$2, float $$3, float $$4, float $$5) {
      super.a($$0, $$1, $$2, $$3, $$4, $$5);
      float $$6 = $$0.a($$4);
      if ($$6 > 0.0F) {
         float $$7 = -10.0F - $$0.dH();
         float $$8 = ayy.i($$6, 0.0F, $$7);
         $$1.a(a.b.rotationDegrees($$8), 0.0F, $$0.dk() / 2.0F / $$5, 0.0F);
      }
   }
}
