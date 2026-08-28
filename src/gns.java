public class gns extends got<ckz, fur<ckz>> {
   private static final akr a = akr.b("textures/entity/breeze/breeze_wind.png");
   private final fur<ckz> b;

   public gns(gkh.a $$0, gmd<ckz, fur<ckz>> $$1) {
      super($$1);
      this.b = new fur<>($$0.a(fyh.t));
   }

   public void a(fbg $$0, gex $$1, int $$2, ckz $$3, float $$4, float $$5, float $$6, float $$7, float $$8, float $$9) {
      float $$10 = (float)$$3.ai + $$6;
      fbk $$11 = $$1.getBuffer(gff.a(a, this.a($$10) % 1.0F, 0.0F));
      this.b.a($$3, $$4, $$5, $$7, $$8, $$9);
      gjn.a(this.b, this.b.e()).a($$0, $$11, $$2, gqa.d);
   }

   private float a(float $$0) {
      return $$0 * 0.02F;
   }
}
