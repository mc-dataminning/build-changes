public class gkd extends gln<cjt, fvg<cjt>> {
   private static final akr a = akr.b("textures/entity/enderman/enderman.png");
   private final ayw i = ayw.a();

   public gkd(gkh.a $$0) {
      super($$0, new fvg<>($$0.a(fyh.Y)), 0.5F);
      this.a(new god<>(this));
      this.a(new gnu(this, $$0.c()));
   }

   public void a(cjt $$0, float $$1, float $$2, fbg $$3, gex $$4, int $$5) {
      dtc $$6 = $$0.gl();
      fvg<cjt> $$7 = this.a();
      $$7.a = $$6 != null;
      $$7.b = $$0.gm();
      super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   public exa a(cjt $$0, float $$1) {
      if ($$0.gm()) {
         double $$2 = 0.02 * (double)$$0.ec();
         return new exa(this.i.k() * $$2, 0.0, this.i.k() * $$2);
      } else {
         return super.a($$0, $$1);
      }
   }

   public akr a(cjt $$0) {
      return a;
   }
}
