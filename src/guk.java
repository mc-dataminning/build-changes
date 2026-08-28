public class guk extends gtk<chw, haj, geb> {
   private static final akv a = akv.b("textures/entity/snow_golem.png");

   public guk(gse.a $$0) {
      super($$0, new geb($$0.a(gfc.cS)), 0.5F);
      this.a(new gwy(this, $$0.d()));
   }

   public akv a(haj $$0) {
      return a;
   }

   public haj b() {
      return new haj();
   }

   public void a(chw $$0, haj $$1, float $$2) {
      super.a($$0, $$1, $$2);
      $$1.a = $$0.p();
   }
}
