public class gdw extends gbz<caw, fot<caw>> {
   private static final aiy a = new aiy("textures/entity/wolf/wolf.png");
   private static final aiy i = new aiy("textures/entity/wolf/wolf_tame.png");
   private static final aiy j = new aiy("textures/entity/wolf/wolf_angry.png");

   public gdw(gat.a $$0) {
      super($$0, new fot<>($$0.a(fpb.bY)), 0.5F);
      this.a(new gft(this, $$0.f()));
      this.a(new gfu(this));
   }

   protected float a(caw $$0, float $$1) {
      return $$0.go();
   }

   public void a(caw $$0, float $$1, float $$2, esa $$3, fvm $$4, int $$5) {
      if ($$0.gn()) {
         float $$6 = $$0.E($$2);
         this.f.a($$6, $$6, $$6);
      }

      super.a($$0, $$1, $$2, $$3, $$4, $$5);
      if ($$0.gn()) {
         this.f.a(1.0F, 1.0F, 1.0F);
      }
   }

   public aiy a(caw $$0) {
      if ($$0.u()) {
         return i;
      } else {
         return $$0.aa_() ? j : a;
      }
   }
}
