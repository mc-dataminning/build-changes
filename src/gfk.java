public class gfk extends geh<cgn, fqi<cgn>> {
   private static final ajh a = new ajh("textures/entity/strider/strider.png");
   private static final ajh i = new ajh("textures/entity/strider/strider_cold.png");
   private static final float j = 0.5F;

   public gfk(gdb.a $$0) {
      super($$0, new fqi<>($$0.a(fre.bD)), 0.5F);
      this.a(new ghn<>(this, new fqi<>($$0.a(fre.bE)), new ajh("textures/entity/strider/strider_saddle.png")));
   }

   public ajh a(cgn $$0) {
      return $$0.r() ? i : a;
   }

   protected float b(cgn $$0) {
      float $$1 = super.b($$0);
      return $$0.o_() ? $$1 * 0.5F : $$1;
   }

   protected void a(cgn $$0, eub $$1, float $$2) {
      float $$3 = $$0.ea();
      $$1.b($$3, $$3, $$3);
   }

   protected boolean c(cgn $$0) {
      return super.a($$0) || $$0.r();
   }
}
