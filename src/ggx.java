public class ggx extends ghj<cdh, fon<cdh>> {
   private final fon<cdh> a;

   public ggx(get<cdh, fon<cdh>> $$0, fqz $$1) {
      super($$0);
      this.a = new fon<>($$1.a(frc.am));
   }

   public void a(etz $$0, fxq $$1, int $$2, cdh $$3, float $$4, float $$5, float $$6, float $$7, float $$8, float $$9) {
      cqk $$10 = $$3.fP();
      if ($$10.d() instanceof cnv $$11 && $$11.c() == cnv.a.a) {
         this.c().a(this.a);
         this.a.a($$3, $$4, $$5, $$6);
         this.a.a($$3, $$4, $$5, $$7, $$8, $$9);
         float $$15;
         float $$16;
         float $$14;
         if ($$10.a(auv.ba)) {
            int $$13 = cpd.b($$10);
            $$14 = (float)($$13 >> 16 & 0xFF) / 255.0F;
            $$15 = (float)($$13 >> 8 & 0xFF) / 255.0F;
            $$16 = (float)($$13 & 0xFF) / 255.0F;
         } else {
            $$14 = 1.0F;
            $$15 = 1.0F;
            $$16 = 1.0F;
         }

         eud $$20 = $$1.getBuffer(fxy.e($$11.b()));
         this.a.a($$0, $$20, $$2, giq.d, $$14, $$15, $$16, 1.0F);
         return;
      }
   }
}
