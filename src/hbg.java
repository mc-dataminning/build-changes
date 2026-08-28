public class hbg extends gzo<crp, hgz, gkn> {
   private static final ali a = ali.b("textures/entity/wandering_trader.png");

   public hbg(gyi.a $$0) {
      super($$0, new gkn($$0.a(gld.dO)), 0.5F);
      this.a(new hcb<>(this, $$0.f()));
      this.a(new hca<>(this));
   }

   public ali a(hgz $$0) {
      return a;
   }

   public hgz b() {
      return new hgz();
   }

   public void a(crp $$0, hgz $$1, float $$2) {
      super.a($$0, $$1, $$2);
      hfe.a($$0, $$1, this.h);
      $$1.a = $$0.q() > 0;
   }
}
