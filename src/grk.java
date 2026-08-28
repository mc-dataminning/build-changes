public class grk<S extends gug, M extends fxo<S>> extends gsb<S, M> {
   private static final ale a = ale.b("textures/entity/elytra.png");
   private final fxk b;
   private final fxk c;

   public grk(gpk<S, M> $$0, gam $$1) {
      super($$0);
      this.b = new fxk($$1.a(gap.ar));
      this.c = new fxk($$1.a(gap.as));
   }

   public void a(fdi $$0, ghl $$1, int $$2, S $$3, float $$4, float $$5) {
      if ($$3.Q.a(cvw.nU)) {
         ale $$8;
         if ($$3 instanceof gvb $$6) {
            gyh $$7 = $$6.a;
            if ($$7.d() != null) {
               $$8 = $$7.d();
            } else if ($$7.c() != null && $$6.aw) {
               $$8 = $$7.c();
            } else {
               $$8 = a;
            }
         } else {
            $$8 = a;
         }

         fxk $$12 = $$3.ae ? this.c : this.b;
         $$0.a();
         $$0.a(0.0F, 0.0F, 0.125F);
         $$12.a($$3);
         fdm $$13 = gom.a($$1, ghv.a($$8), $$3.Q.A());
         $$12.a($$0, $$13, $$2, gwx.d);
         $$0.b();
      }
   }
}
