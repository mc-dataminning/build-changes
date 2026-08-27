public class fwu<T extends bjm, M extends fey<T>> extends fxl<T, M> {
   private static final aez a = new aez("textures/entity/elytra.png");
   private final fev<T> b;

   public fwu(fuy<T, M> $$0, fht $$1) {
      super($$0);
      this.b = new fev<>($$1.a(fhw.Q));
   }

   public void a(elj $$0, foa $$1, int $$2, T $$3, float $$4, float $$5, float $$6, float $$7, float $$8, float $$9) {
      cjl $$10 = $$3.c(bjb.e);
      if ($$10.a(cjo.nh)) {
         aez $$13;
         if ($$3 instanceof fmz $$11) {
            gaa $$12 = $$11.b();
            if ($$12.d() != null) {
               $$13 = $$12.d();
            } else if ($$12.c() != null && $$11.a(ccb.a)) {
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
         eln $$17 = fub.a($$1, foi.a($$13), false, $$10.B());
         this.b.a($$0, $$17, $$2, fyr.d, 1.0F, 1.0F, 1.0F, 1.0F);
         $$0.b();
      }
   }
}
