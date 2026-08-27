public class fux extends ftu<bzo, fgr<bzo>> {
   private static final aer a = new aer("textures/entity/strider/strider.png");
   private static final aer i = new aer("textures/entity/strider/strider_cold.png");

   public fux(fso.a $$0) {
      super($$0, new fgr<>($$0.a(fhm.bx)), 0.5F);
      this.a(new fwx<>(this, new fgr<>($$0.a(fhm.by)), new aer("textures/entity/strider/strider_saddle.png")));
   }

   public aer a(bzo $$0) {
      return $$0.p() ? i : a;
   }

   protected void a(bzo $$0, elg $$1, float $$2) {
      if ($$0.i_()) {
         $$1.b(0.5F, 0.5F, 0.5F);
         this.d = 0.25F;
      } else {
         this.d = 0.5F;
      }
   }

   protected boolean b(bzo $$0) {
      return super.a($$0) || $$0.p();
   }
}
