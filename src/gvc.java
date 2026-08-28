public class gvc extends gtk<cop, hav, gen> {
   private static final akv a = akv.b("textures/entity/wandering_trader.png");

   public gvc(gse.a $$0) {
      super($$0, new gen($$0.a(gfc.dw)), 0.5F);
      this.a(new gvx<>(this, $$0.f()));
      this.a(new gvw<>(this));
   }

   public akv a(hav $$0) {
      return a;
   }

   public hav b() {
      return new hav();
   }

   public void a(cop $$0, hav $$1, float $$2) {
      super.a($$0, $$1, $$2);
      gyz.a($$0, $$1, this.i);
      $$1.a = $$0.p() > 0;
   }
}
