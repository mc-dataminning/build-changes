public class ged extends gfe<cfj, flk<cfj>> {
   private static final aiy a = new aiy("textures/entity/breeze/breeze_wind.png");
   private static final flk<cfj> b = new flk<>(flk.a(128, 128).a());

   public ged(gco<cfj, flk<cfj>> $$0) {
      super($$0);
   }

   public void a(esa $$0, fvm $$1, int $$2, cfj $$3, float $$4, float $$5, float $$6, float $$7, float $$8, float $$9) {
      float $$10 = (float)$$3.ag + $$6;
      ese $$11 = $$1.getBuffer(fvu.a(a, this.a($$10) % 1.0F, 0.0F));
      b.a($$3, $$4, $$5, $$7, $$8, $$9);
      fzz.a(b, b.e()).a($$0, $$11, $$2, ggl.d, 1.0F, 1.0F, 1.0F, 1.0F);
   }

   private float a(float $$0) {
      return $$0 * 0.02F;
   }
}
