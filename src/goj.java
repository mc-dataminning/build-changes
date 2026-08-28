public class goj extends gpf<clg, gun, fye> {
   private static final alh a = alh.b("textures/entity/ghast/ghast.png");
   private static final alh b = alh.b("textures/entity/ghast/ghast_shooting.png");

   public goj(gnz.a $$0) {
      super($$0, new fye($$0.a(gba.aD)), 1.5F);
   }

   public alh a(gun $$0) {
      return $$0.a ? b : a;
   }

   public gun c() {
      return new gun();
   }

   public void a(clg $$0, gun $$1, float $$2) {
      super.a($$0, $$1, $$2);
      $$1.a = $$0.q();
   }
}
