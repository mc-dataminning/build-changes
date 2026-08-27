public class gjb extends gkc<cic, fqe<cic>> {
   private static final ajv a = new ajv("textures/entity/breeze/breeze_wind.png");
   private static final fqe<cic> b = new fqe<>(fqe.a(128, 128).a());

   public gjb(ghm<cic, fqe<cic>> $$0) {
      super($$0);
   }

   public void a(ewr $$0, gai $$1, int $$2, cic $$3, float $$4, float $$5, float $$6, float $$7, float $$8, float $$9) {
      float $$10 = (float)$$3.ah + $$6;
      ewv $$11 = $$1.getBuffer(gaq.a(a, this.a($$10) % 1.0F, 0.0F));
      b.a($$3, $$4, $$5, $$7, $$8, $$9);
      gex.a(b, b.e()).a($$0, $$11, $$2, glj.d, 1.0F, 1.0F, 1.0F, 1.0F);
   }

   private float a(float $$0) {
      return $$0 * 0.02F;
   }
}
