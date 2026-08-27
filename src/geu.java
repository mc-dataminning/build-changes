public class geu<T extends boi, M extends fmi<T>> extends gfl<T, M> {
   private static final aiy a = new aiy("textures/entity/elytra.png");
   private final fmf<T> b;

   public geu(gcv<T, M> $$0, fpf $$1) {
      super($$0);
      this.b = new fmf<>($$1.a(fpi.S));
   }

   public void a(esh $$0, fvt $$1, int $$2, T $$3, float $$4, float $$5, float $$6, float $$7, float $$8, float $$9) {
      cpd $$10 = $$3.c(bnx.e);
      if ($$10.a(cpg.nS)) {
         aiy $$13;
         if ($$3 instanceof fus $$11) {
            gia $$12 = $$11.b();
            if ($$12.d() != null) {
               $$13 = $$12.d();
            } else if ($$12.c() != null && $$11.a(chm.a)) {
               $$13 = $$12.c();
            } else {
               $$13 = a;
            }
         } else {
            $$13 = a;
         }

         $$0.a();
         $$0.a(0.0F, 0.0F, 0.125F);
         this.c().a(this.b);
         this.b.a($$3, $$4, $$5, $$7, $$8, $$9);
         esl $$17 = gby.a($$1, fwb.a($$13), false, $$10.C());
         this.b.a($$0, $$17, $$2, ggs.d, 1.0F, 1.0F, 1.0F, 1.0F);
         $$0.b();
      }
   }
}
