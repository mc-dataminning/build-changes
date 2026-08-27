public class gkm extends glz<cis, fvo<cis>> {
   private static final akt a = new akt("textures/entity/enderman/enderman.png");
   private final ayt b = ayt.a();

   public gkm(gkq.a $$0) {
      super($$0, new fvo<>($$0.a(fyr.aa)), 0.5F);
      this.a(new gop<>(this));
      this.a(new gog(this, $$0.c()));
   }

   public void a(cis $$0, float $$1, float $$2, fbc $$3, gfg $$4, int $$5) {
      dtc $$6 = $$0.gy();
      fvo<cis> $$7 = this.a();
      $$7.a = $$6 != null;
      $$7.b = $$0.gz();
      super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   public ewu a(cis $$0, float $$1) {
      if ($$0.gz()) {
         double $$2 = 0.02 * (double)$$0.em();
         return new ewu(this.b.k() * $$2, 0.0, this.b.k() * $$2);
      } else {
         return super.a($$0, $$1);
      }
   }

   public akt a(cis $$0) {
      return a;
   }
}
