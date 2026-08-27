public class gcg extends gde<caw, fng<caw>> {
   private static final ajc a = new ajc("textures/entity/fox/fox.png");
   private static final ajc i = new ajc("textures/entity/fox/fox_sleep.png");
   private static final ajc j = new ajc("textures/entity/fox/snow_fox.png");
   private static final ajc k = new ajc("textures/entity/fox/snow_fox_sleep.png");

   public gcg(gby.a $$0) {
      super($$0, new fng<>($$0.a(fqe.Z)), 0.4F);
      this.a(new gfw(this, $$0.d()));
   }

   protected void a(caw $$0, etd $$1, float $$2, float $$3, float $$4, float $$5) {
      super.a($$0, $$1, $$2, $$3, $$4, $$5);
      if ($$0.gr() || $$0.gl()) {
         float $$6 = -awm.i($$4, $$0.N, $$0.dB());
         $$1.a(a.b.rotationDegrees($$6));
      }
   }

   public ajc a(caw $$0) {
      if ($$0.w() == caw.v.a) {
         return $$0.fF() ? i : a;
      } else {
         return $$0.fF() ? k : j;
      }
   }
}
