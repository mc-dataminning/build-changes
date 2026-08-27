public class fyx extends fzt<ccj, fkb<ccj>> {
   private static final ahg a = new ahg("textures/entity/ghast/ghast.png");
   private static final ahg i = new ahg("textures/entity/ghast/ghast_shooting.png");

   public fyx(fyn.a $$0) {
      super($$0, new fkb<>($$0.a(fmw.ad)), 1.5F);
   }

   public ahg a(ccj $$0) {
      return $$0.u() ? i : a;
   }

   protected void a(ccj $$0, eqb $$1, float $$2) {
      float $$3 = 1.0F;
      float $$4 = 4.5F;
      float $$5 = 4.5F;
      $$1.b(4.5F, 4.5F, 4.5F);
   }
}
