public class gbc extends gby<ceh, fmf<ceh>> {
   private static final aiy a = new aiy("textures/entity/ghast/ghast.png");
   private static final aiy i = new aiy("textures/entity/ghast/ghast_shooting.png");

   public gbc(gas.a $$0) {
      super($$0, new fmf<>($$0.a(fpb.ac)), 1.5F);
   }

   public aiy a(ceh $$0) {
      return $$0.u() ? i : a;
   }

   protected void a(ceh $$0, esa $$1, float $$2) {
      float $$3 = 1.0F;
      float $$4 = 4.5F;
      float $$5 = 4.5F;
      $$1.b(4.5F, 4.5F, 4.5F);
   }
}
