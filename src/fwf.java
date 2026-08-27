public class fwf<T extends biy, M extends feo<T>> extends fww<T, M> {
   private static final aer a = new aer("textures/entity/elytra.png");
   private final fel<T> b;

   public fwf(fuj<T, M> $$0, fhj $$1) {
      super($$0);
      this.b = new fel<>($$1.a(fhm.Q));
   }

   public void a(elg $$0, fnl $$1, int $$2, T $$3, float $$4, float $$5, float $$6, float $$7, float $$8, float $$9) {
      ciy $$10 = $$3.c(bin.e);
      if ($$10.a(cjb.nh)) {
         aer $$13;
         if ($$3 instanceof fmk $$11) {
            fzl $$12 = $$11.b();
            if ($$12.c() != null) {
               $$13 = $$12.c();
            } else if ($$12.b() != null && $$11.a(cbo.a)) {
               $$13 = $$12.b();
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
         elk $$17 = ftm.a($$1, fnt.a($$13), false, $$10.B());
         this.b.a($$0, $$17, $$2, fyc.d, 1.0F, 1.0F, 1.0F, 1.0F);
         $$0.b();
      }
   }
}
