public class gla extends glz<ciw, fvu<ciw>> {
   private static final akt a = new akt("textures/entity/ghast/ghast.png");
   private static final akt b = new akt("textures/entity/ghast/ghast_shooting.png");

   public gla(gkq.a $$0) {
      super($$0, new fvu<>($$0.a(fyr.aj)), 1.5F);
   }

   public akt a(ciw $$0) {
      return $$0.r() ? b : a;
   }

   protected void a(ciw $$0, fbc $$1, float $$2) {
      float $$3 = 1.0F;
      float $$4 = 4.5F;
      float $$5 = 4.5F;
      $$1.b(4.5F, 4.5F, 4.5F);
   }
}
