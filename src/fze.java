public class fze extends fxi<bxz, fkk<bxz>> {
   private static final agm a = new agm("textures/entity/wolf/wolf.png");
   private static final agm i = new agm("textures/entity/wolf/wolf_tame.png");
   private static final agm j = new agm("textures/entity/wolf/wolf_angry.png");

   public fze(fwc.a $$0) {
      super($$0, new fkk<>($$0.a(fks.bV)), 0.5F);
      this.a(new gaz(this));
   }

   protected float a(bxz $$0, float $$1) {
      return $$0.gn();
   }

   public void a(bxz $$0, float $$1, float $$2, eob $$3, fqz $$4, int $$5) {
      if ($$0.gm()) {
         float $$6 = $$0.E($$2);
         this.f.a($$6, $$6, $$6);
      }

      super.a($$0, $$1, $$2, $$3, $$4, $$5);
      if ($$0.gm()) {
         this.f.a(1.0F, 1.0F, 1.0F);
      }
   }

   public agm a(bxz $$0) {
      if ($$0.u()) {
         return i;
      } else {
         return $$0.aa_() ? j : a;
      }
   }
}
