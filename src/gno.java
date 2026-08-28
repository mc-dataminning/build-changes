public class gno extends gop<ckx, fun<ckx>> {
   private static final akq a = akq.b("textures/entity/breeze/breeze_wind.png");
   private final fun<ckx> b;

   public gno(gkd.a $$0, glz<ckx, fun<ckx>> $$1) {
      super($$1);
      this.b = new fun<>($$0.a(fyd.t));
   }

   public void a(fbc $$0, get $$1, int $$2, ckx $$3, float $$4, float $$5, float $$6, float $$7, float $$8, float $$9) {
      float $$10 = (float)$$3.ai + $$6;
      fbg $$11 = $$1.getBuffer(gfb.a(a, this.a($$10) % 1.0F, 0.0F));
      this.b.a($$3, $$4, $$5, $$7, $$8, $$9);
      gjj.a(this.b, this.b.e()).a($$0, $$11, $$2, gpw.d);
   }

   private float a(float $$0) {
      return $$0 * 0.02F;
   }
}
