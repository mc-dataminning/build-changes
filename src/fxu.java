public class fxu<T extends bkj, M extends ffx<T>> extends fyl<T, M> {
   private static final afw a = new afw("textures/entity/elytra.png");
   private final ffu<T> b;

   public fxu(fvy<T, M> $$0, fis $$1) {
      super($$0);
      this.b = new ffu<>($$1.a(fiv.Q));
   }

   public void a(emh $$0, fpb $$1, int $$2, T $$3, float $$4, float $$5, float $$6, float $$7, float $$8, float $$9) {
      ckj $$10 = $$3.c(bjy.e);
      if ($$10.a(ckm.nh)) {
         afw $$13;
         if ($$3 instanceof fnz $$11) {
            gba $$12 = $$11.b();
            if ($$12.d() != null) {
               $$13 = $$12.d();
            } else if ($$12.c() != null && $$11.a(ccy.a)) {
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
         eml $$17 = fvb.a($$1, fpj.a($$13), false, $$10.B());
         this.b.a($$0, $$17, $$2, fzr.d, 1.0F, 1.0F, 1.0F, 1.0F);
         $$0.b();
      }
   }
}
