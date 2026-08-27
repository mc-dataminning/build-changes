public class fwf extends fuj<bwa, fho<bwa>> {
   private static final aez a = new aez("textures/entity/wolf/wolf.png");
   private static final aez i = new aez("textures/entity/wolf/wolf_tame.png");
   private static final aez j = new aez("textures/entity/wolf/wolf_angry.png");

   public fwf(ftd.a $$0) {
      super($$0, new fho<>($$0.a(fhw.bV)), 0.5F);
      this.a(new fya(this));
   }

   protected float a(bwa $$0, float $$1) {
      return $$0.gm();
   }

   public void a(bwa $$0, float $$1, float $$2, elj $$3, foa $$4, int $$5) {
      if ($$0.gl()) {
         float $$6 = $$0.E($$2);
         this.f.a($$6, $$6, $$6);
      }

      super.a($$0, $$1, $$2, $$3, $$4, $$5);
      if ($$0.gl()) {
         this.f.a(1.0F, 1.0F, 1.0F);
      }
   }

   public aez a(bwa $$0) {
      if ($$0.s()) {
         return i;
      } else {
         return $$0.X_() ? j : a;
      }
   }
}
