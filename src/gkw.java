public class gkw extends gli<cfv, fsm<cfv>> {
   private final fsm<cfv> a;

   public gkw(gis<cfv, fsm<cfv>> $$0, fux $$1) {
      super($$0);
      this.a = new fsm<>($$1.a(fva.aq));
   }

   public void a(exx $$0, gbo $$1, int $$2, cfv $$3, float $$4, float $$5, float $$6, float $$7, float $$8, float $$9) {
      csz $$10 = $$3.fQ();
      if ($$10.f() instanceof cqn $$11 && $$11.d() == cqn.a.a) {
         this.c().a(this.a);
         this.a.a($$3, $$4, $$5, $$6);
         this.a.a($$3, $$4, $$5, $$7, $$8, $$9);
         float $$15;
         float $$16;
         float $$14;
         if ($$10.a(avz.bz)) {
            int $$13 = cvp.a($$10, -6265536);
            $$14 = (float)axj.b.b($$13) / 255.0F;
            $$15 = (float)axj.b.c($$13) / 255.0F;
            $$16 = (float)axj.b.d($$13) / 255.0F;
         } else {
            $$14 = 1.0F;
            $$15 = 1.0F;
            $$16 = 1.0F;
         }

         eyb $$20 = $$1.getBuffer(gbw.e($$11.b()));
         this.a.a($$0, $$20, $$2, gmp.d, $$14, $$15, $$16, 1.0F);
         return;
      }
   }
}
