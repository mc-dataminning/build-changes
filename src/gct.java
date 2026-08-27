public class gct extends gbw<cfo, foa<cfo>> {
   private static final ajh a = new ajh("textures/entity/zombie/drowned.png");

   public gct(gdb.a $$0) {
      super($$0, new foa<>($$0.a(fre.R)), new foa<>($$0.a(fre.S)), new foa<>($$0.a(fre.T)));
      this.a(new ggu<>(this, $$0.f()));
   }

   @Override
   public ajh a(cgt $$0) {
      return a;
   }

   protected void a(cfo $$0, eub $$1, float $$2, float $$3, float $$4, float $$5) {
      super.a($$0, $$1, $$2, $$3, $$4, $$5);
      float $$6 = $$0.a($$4);
      if ($$6 > 0.0F) {
         float $$7 = -10.0F - $$0.dE();
         float $$8 = aww.i($$6, 0.0F, $$7);
         $$1.a(a.b.rotationDegrees($$8), 0.0F, $$0.dh() / 2.0F / $$5, 0.0F);
      }
   }
}
