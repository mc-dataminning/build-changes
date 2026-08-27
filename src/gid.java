public class gid extends giz<ciw, fta<ciw>> {
   private static final akm a = new akm("textures/entity/ghast/ghast.png");
   private static final akm i = new akm("textures/entity/ghast/ghast_shooting.png");

   public gid(ght.a $$0) {
      super($$0, new fta<>($$0.a(fvv.ag)), 1.5F);
   }

   public akm a(ciw $$0) {
      return $$0.s() ? i : a;
   }

   protected void a(ciw $$0, eys $$1, float $$2) {
      float $$3 = 1.0F;
      float $$4 = 4.5F;
      float $$5 = 4.5F;
      $$1.b(4.5F, 4.5F, 4.5F);
   }
}
