public class gks extends gkp<cmi> {
   private static final akt a = new akt("textures/entity/illager/evoker_fangs.png");
   private final fvr<cmi> b;

   public gks(gkq.a $$0) {
      super($$0);
      this.b = new fvr<>($$0.a(fyr.af));
   }

   public void a(cmi $$0, float $$1, float $$2, fbc $$3, gfg $$4, int $$5) {
      float $$6 = $$0.a($$2);
      if ($$6 != 0.0F) {
         float $$7 = 2.0F;
         if ($$6 > 0.9F) {
            $$7 *= (1.0F - $$6) / 0.1F;
         }

         $$3.a();
         $$3.a(a.d.rotationDegrees(90.0F - $$0.dK()));
         $$3.b(-$$7, -$$7, $$7);
         float $$8 = 0.03125F;
         $$3.a(0.0, -0.626, 0.0);
         $$3.b(0.5F, 0.5F, 0.5F);
         this.b.a($$0, $$6, 0.0F, 0.0F, $$0.dK(), $$0.dM());
         fbg $$9 = $$4.getBuffer(this.b.a(a));
         this.b.a($$3, $$9, $$5, gqp.d, 1.0F, 1.0F, 1.0F, 1.0F);
         $$3.b();
         super.a($$0, $$1, $$2, $$3, $$4, $$5);
      }
   }

   public akt a(cmi $$0) {
      return a;
   }
}
