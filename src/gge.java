public class gge extends geh<cch, fqw<cch>> {
   private static final ajh a = new ajh("textures/entity/wolf/wolf.png");
   private static final ajh i = new ajh("textures/entity/wolf/wolf_tame.png");
   private static final ajh j = new ajh("textures/entity/wolf/wolf_angry.png");

   public gge(gdb.a $$0) {
      super($$0, new fqw<>($$0.a(fre.cc)), 0.5F);
      this.a(new gib(this, $$0.f()));
      this.a(new gic(this));
   }

   protected float a(cch $$0, float $$1) {
      return $$0.gv();
   }

   public void a(cch $$0, float $$1, float $$2, eub $$3, fxs $$4, int $$5) {
      if ($$0.gu()) {
         float $$6 = $$0.G($$2);
         this.f.a($$6, $$6, $$6);
      }

      super.a($$0, $$1, $$2, $$3, $$4, $$5);
      if ($$0.gu()) {
         this.f.a(1.0F, 1.0F, 1.0F);
      }
   }

   public ajh a(cch $$0) {
      if ($$0.r()) {
         return i;
      } else {
         return $$0.Y_() ? j : a;
      }
   }
}
