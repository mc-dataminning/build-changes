public class gfb extends gde<cbp, fpw<cbp>> {
   private static final ajc a = new ajc("textures/entity/wolf/wolf.png");
   private static final ajc i = new ajc("textures/entity/wolf/wolf_tame.png");
   private static final ajc j = new ajc("textures/entity/wolf/wolf_angry.png");

   public gfb(gby.a $$0) {
      super($$0, new fpw<>($$0.a(fqe.bY)), 0.5F);
      this.a(new ggy(this, $$0.f()));
      this.a(new ggz(this));
   }

   protected float a(cbp $$0, float $$1) {
      return $$0.gt();
   }

   public void a(cbp $$0, float $$1, float $$2, etd $$3, fwq $$4, int $$5) {
      if ($$0.gs()) {
         float $$6 = $$0.E($$2);
         this.f.a($$6, $$6, $$6);
      }

      super.a($$0, $$1, $$2, $$3, $$4, $$5);
      if ($$0.gs()) {
         this.f.a(1.0F, 1.0F, 1.0F);
      }
   }

   public ajc a(cbp $$0) {
      if ($$0.u()) {
         return i;
      } else {
         return $$0.aa_() ? j : a;
      }
   }
}
