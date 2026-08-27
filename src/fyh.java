public class fyh extends fye<cfl> {
   private static final ahd a = new ahd("textures/entity/illager/evoker_fangs.png");
   private final fjq<cfl> f;

   public fyh(fyf.a $$0) {
      super($$0);
      this.f = new fjq<>($$0.a(fmo.Z));
   }

   public void a(cfl $$0, float $$1, float $$2, ept $$3, fsz $$4, int $$5) {
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
         epx $$9 = $$4.getBuffer(this.f.a(a));
         this.f.a($$3, $$9, $$5, gdw.d, 1.0F, 1.0F, 1.0F, 1.0F);
         $$3.b();
         super.a($$0, $$1, $$2, $$3, $$4, $$5);
      }
   }

   public ahd a(cfl $$0) {
      return a;
   }
}
