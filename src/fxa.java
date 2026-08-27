public class fxa<T extends bji, M extends fff<T>> extends fxr<T, M> {
   private static final aey a = new aey("textures/entity/elytra.png");
   private final ffc<T> b;

   public fxa(fve<T, M> $$0, fia $$1) {
      super($$0);
      this.b = new ffc<>($$1.a(fid.Q));
   }

   public void a(elr $$0, fog $$1, int $$2, T $$3, float $$4, float $$5, float $$6, float $$7, float $$8, float $$9) {
      cjh $$10 = $$3.c(bix.e);
      if ($$10.a(cjk.nh)) {
         aey $$13;
         if ($$3 instanceof fnf $$11) {
            gag $$12 = $$11.b();
            if ($$12.d() != null) {
               $$13 = $$12.d();
            } else if ($$12.c() != null && $$11.a(cbx.a)) {
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
         elv $$17 = fuh.a($$1, foo.a($$13), false, $$10.B());
         this.b.a($$0, $$17, $$2, fyx.d, 1.0F, 1.0F, 1.0F, 1.0F);
         $$0.b();
      }
   }
}
