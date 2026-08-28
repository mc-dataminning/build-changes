public class gix extends giu<cnf> {
   private static final ale a = new ale("textures/entity/illager/evoker_fangs.png");
   private final ftz<cnf> f;

   public gix(giv.a $$0) {
      super($$0);
      this.f = new ftz<>($$0.a(fwx.ac));
   }

   public void a(cnf $$0, float $$1, float $$2, ezw $$3, gdm $$4, int $$5) {
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
         this.f.a($$0, $$6, 0.0F, 0.0F, $$0.dF(), $$0.dH());
         faa $$9 = $$4.getBuffer(this.f.a(a));
         this.f.a($$3, $$9, $$5, goo.d, 1.0F, 1.0F, 1.0F, 1.0F);
         $$3.b();
         super.a($$0, $$1, $$2, $$3, $$4, $$5);
      }
   }

   public ale a(cnf $$0) {
      return a;
   }
}
