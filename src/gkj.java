public class gkj extends gkg<cnh> {
   private static final akr a = akr.b("textures/entity/illager/evoker_fangs.png");
   private final fvj<cnh> g;

   public gkj(gkh.a $$0) {
      super($$0);
      this.g = new fvj<>($$0.a(fyh.ad));
   }

   public void a(cnh $$0, float $$1, float $$2, fbg $$3, gex $$4, int $$5) {
      float $$6 = $$0.a($$2);
      if ($$6 != 0.0F) {
         float $$7 = 2.0F;
         if ($$6 > 0.9F) {
            $$7 *= (1.0F - $$6) / 0.1F;
         }

         $$3.a();
         $$3.a(a.d.rotationDegrees(90.0F - $$0.dF()));
         $$3.b(-$$7, -$$7, $$7);
         float $$8 = 0.03125F;
         $$3.a(0.0, -0.626, 0.0);
         $$3.b(0.5F, 0.5F, 0.5F);
         this.g.a($$0, $$6, 0.0F, 0.0F, $$0.dF(), $$0.dH());
         fbk $$9 = $$4.getBuffer(this.g.a(a));
         this.g.a($$3, $$9, $$5, gqa.d);
         $$3.b();
         super.a($$0, $$1, $$2, $$3, $$4, $$5);
      }
   }

   public akr a(cnh $$0) {
      return a;
   }
}
