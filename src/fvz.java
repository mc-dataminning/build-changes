public class fvz extends fud<bvm, fhj<bvm>> {
   private static final aer a = new aer("textures/entity/wolf/wolf.png");
   private static final aer i = new aer("textures/entity/wolf/wolf_tame.png");
   private static final aer j = new aer("textures/entity/wolf/wolf_angry.png");

   public fvz(fsx.a $$0) {
      super($$0, new fhj<>($$0.a(fhr.bV)), 0.5F);
      this.a(new fxu(this));
   }

   protected float a(bvm $$0, float $$1) {
      return $$0.gi();
   }

   public void a(bvm $$0, float $$1, float $$2, elf $$3, fnu $$4, int $$5) {
      if ($$0.gh()) {
         float $$6 = $$0.E($$2);
         this.f.a($$6, $$6, $$6);
      }

      super.a($$0, $$1, $$2, $$3, $$4, $$5);
      if ($$0.gh()) {
         this.f.a(1.0F, 1.0F, 1.0F);
      }
   }

   public aer a(bvm $$0) {
      if ($$0.p()) {
         return i;
      } else {
         return $$0.S_() ? j : a;
      }
   }
}
