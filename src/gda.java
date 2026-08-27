public class gda extends gcx<cjc> {
   private static final ajh a = new ajh("textures/entity/illager/evoker_fangs.png");
   private final fod<cjc> f;

   public gda(gcy.a $$0) {
      super($$0);
      this.f = new fod<>($$0.a(frc.Y));
   }

   public void a(cjc $$0, float $$1, float $$2, etz $$3, fxq $$4, int $$5) {
      float $$6 = $$0.a($$2);
      if ($$6 != 0.0F) {
         float $$7 = 2.0F;
         if ($$6 > 0.9F) {
            $$7 *= (1.0F - $$6) / 0.1F;
         }

         $$3.a();
         $$3.a(a.d.rotationDegrees(90.0F - $$0.dC()));
         $$3.b(-$$7, -$$7, $$7);
         float $$8 = 0.03125F;
         $$3.a(0.0, -0.626, 0.0);
         $$3.b(0.5F, 0.5F, 0.5F);
         this.f.a($$0, $$6, 0.0F, 0.0F, $$0.dC(), $$0.dE());
         eud $$9 = $$4.getBuffer(this.f.a(a));
         this.f.a($$3, $$9, $$5, giq.d, 1.0F, 1.0F, 1.0F, 1.0F);
         $$3.b();
         super.a($$0, $$1, $$2, $$3, $$4, $$5);
      }
   }

   public ajh a(cjc $$0) {
      return a;
   }
}
