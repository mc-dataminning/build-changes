public class fvs extends fup<bzx, fhi<bzx>> {
   private static final aey a = new aey("textures/entity/strider/strider.png");
   private static final aey i = new aey("textures/entity/strider/strider_cold.png");

   public fvs(ftj.a $$0) {
      super($$0, new fhi<>($$0.a(fid.bx)), 0.5F);
      this.a(new fxs<>(this, new fhi<>($$0.a(fid.by)), new aey("textures/entity/strider/strider_saddle.png")));
   }

   public aey a(bzx $$0) {
      return $$0.s() ? i : a;
   }

   protected void a(bzx $$0, elr $$1, float $$2) {
      if ($$0.m_()) {
         $$1.b(0.5F, 0.5F, 0.5F);
         this.d = 0.25F;
      } else {
         this.d = 0.5F;
      }
   }

   protected boolean b(bzx $$0) {
      return super.a($$0) || $$0.s();
   }
}
