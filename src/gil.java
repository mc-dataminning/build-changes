public class gil extends ggo<cdg, ftd<cdg>> {
   private static final ajt a = new ajt("textures/entity/wolf/wolf.png");
   private static final ajt i = new ajt("textures/entity/wolf/wolf_tame.png");
   private static final ajt j = new ajt("textures/entity/wolf/wolf_angry.png");

   public gil(gfi.a $$0) {
      super($$0, new ftd<>($$0.a(ftl.cc)), 0.5F);
      this.a(new gki(this, $$0.f()));
      this.a(new gkj(this));
   }

   protected float a(cdg $$0, float $$1) {
      return $$0.gv();
   }

   public void a(cdg $$0, float $$1, float $$2, ewi $$3, fzz $$4, int $$5) {
      if ($$0.gu()) {
         float $$6 = $$0.G($$2);
         this.f.a($$6, $$6, $$6);
      }

      super.a($$0, $$1, $$2, $$3, $$4, $$5);
      if ($$0.gu()) {
         this.f.a(1.0F, 1.0F, 1.0F);
      }
   }

   public ajt a(cdg $$0) {
      if ($$0.r()) {
         return i;
      } else {
         return $$0.Y_() ? j : a;
      }
   }
}
