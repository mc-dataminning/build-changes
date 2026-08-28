public class gkf extends glp<cjt, fvi<cjt>> {
   private static final akr a = akr.b("textures/entity/enderman/enderman.png");
   private final ayw i = ayw.a();

   public gkf(gkj.a $$0) {
      super($$0, new fvi<>($$0.a(fyj.Y)), 0.5F);
      this.a(new gof<>(this));
      this.a(new gnw(this, $$0.c()));
   }

   public void a(cjt $$0, float $$1, float $$2, fbi $$3, gez $$4, int $$5) {
      dtc $$6 = $$0.gk();
      fvi<cjt> $$7 = this.a();
      $$7.a = $$6 != null;
      $$7.b = $$0.gl();
      super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   public exc a(cjt $$0, float $$1) {
      if ($$0.gl()) {
         double $$2 = 0.02 * (double)$$0.eb();
         return new exc(this.i.k() * $$2, 0.0, this.i.k() * $$2);
      } else {
         return super.a($$0, $$1);
      }
   }

   public akr a(cjt $$0) {
      return a;
   }
}
