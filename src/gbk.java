public class gbk extends gcg<cel, fmm<cel>> {
   private static final aiy a = new aiy("textures/entity/ghast/ghast.png");
   private static final aiy i = new aiy("textures/entity/ghast/ghast_shooting.png");

   public gbk(gba.a $$0) {
      super($$0, new fmm<>($$0.a(fpi.ac)), 1.5F);
   }

   public aiy a(cel $$0) {
      return $$0.u() ? i : a;
   }

   protected void a(cel $$0, esh $$1, float $$2) {
      float $$3 = 1.0F;
      float $$4 = 4.5F;
      float $$5 = 4.5F;
      $$1.b(4.5F, 4.5F, 4.5F);
   }
}
