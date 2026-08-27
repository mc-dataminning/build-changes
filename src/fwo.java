public class fwo<T extends biy, M extends fet<T>> extends fxf<T, M> {
   private static final aer a = new aer("textures/entity/elytra.png");
   private final feq<T> b;

   public fwo(fus<T, M> $$0, fho $$1) {
      super($$0);
      this.b = new feq<>($$1.a(fhr.Q));
   }

   public void a(elf $$0, fnu $$1, int $$2, T $$3, float $$4, float $$5, float $$6, float $$7, float $$8, float $$9) {
      cix $$10 = $$3.c(bin.e);
      if ($$10.a(cja.nh)) {
         aer $$13;
         if ($$3 instanceof fmt $$11) {
            fzu $$12 = $$11.b();
            if ($$12.d() != null) {
               $$13 = $$12.d();
            } else if ($$12.c() != null && $$11.a(cbn.a)) {
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
         elj $$17 = ftv.a($$1, foc.a($$13), false, $$10.B());
         this.b.a($$0, $$17, $$2, fyl.d, 1.0F, 1.0F, 1.0F, 1.0F);
         $$0.b();
      }
   }
}
