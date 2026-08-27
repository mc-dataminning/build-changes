public class fwa<T extends biw, M extends fek<T>> extends fwr<T, M> {
   private static final aep a = new aep("textures/entity/elytra.png");
   private final feh<T> b;

   public fwa(fue<T, M> $$0, fhf $$1) {
      super($$0);
      this.b = new feh<>($$1.a(fhi.Q));
   }

   public void a(elh $$0, fng $$1, int $$2, T $$3, float $$4, float $$5, float $$6, float $$7, float $$8, float $$9) {
      ciw $$10 = $$3.c(bil.e);
      if ($$10.a(ciz.nh)) {
         aep $$13;
         if ($$3 instanceof fmf $$11) {
            fzg $$12 = $$11.b();
            if ($$12.c() != null) {
               $$13 = $$12.c();
            } else if ($$12.b() != null && $$11.a(cbm.a)) {
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
         ell $$17 = fth.a($$1, fno.a($$13), false, $$10.B());
         this.b.a($$0, $$17, $$2, fxx.d, 1.0F, 1.0F, 1.0F, 1.0F);
         $$0.b();
      }
   }
}
