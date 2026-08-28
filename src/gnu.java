public class gnu extends gov<ckz, fut<ckz>> {
   private static final akr a = akr.b("textures/entity/breeze/breeze_wind.png");
   private final fut<ckz> b;

   public gnu(gkj.a $$0, gmf<ckz, fut<ckz>> $$1) {
      super($$1);
      this.b = new fut<>($$0.a(fyj.t));
   }

   public void a(fbi $$0, gez $$1, int $$2, ckz $$3, float $$4, float $$5, float $$6, float $$7, float $$8, float $$9) {
      float $$10 = (float)$$3.ai + $$6;
      fbm $$11 = $$1.getBuffer(gfh.a(a, this.a($$10) % 1.0F, 0.0F));
      this.b.a($$3, $$4, $$5, $$7, $$8, $$9);
      gjp.a(this.b, this.b.e()).a($$0, $$11, $$2, gqc.d);
   }

   private float a(float $$0) {
      return $$0 * 0.02F;
   }
}
