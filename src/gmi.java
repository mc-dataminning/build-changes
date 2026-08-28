public class gmi extends gnj<ckz, ftj<ckz>> {
   private static final alf a = new alf("textures/entity/breeze/breeze_wind.png");
   private static final ftj<ckz> b = new ftj<>(ftj.a(128, 128).a());

   public gmi(gkt<ckz, ftj<ckz>> $$0) {
      super($$0);
   }

   public void a(ezy $$0, gdo $$1, int $$2, ckz $$3, float $$4, float $$5, float $$6, float $$7, float $$8, float $$9) {
      float $$10 = (float)$$3.ai + $$6;
      fac $$11 = $$1.getBuffer(gdw.a(a, this.a($$10) % 1.0F, 0.0F));
      b.a($$3, $$4, $$5, $$7, $$8, $$9);
      gid.a(b, b.e()).a($$0, $$11, $$2, goq.d, 1.0F, 1.0F, 1.0F, 1.0F);
   }

   private float a(float $$0) {
      return $$0 * 0.02F;
   }
}
