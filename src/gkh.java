public class gkh<T extends bre, M extends frr<T>> extends gky<T, M> {
   private static final akf a = new akf("textures/entity/elytra.png");
   private final fro<T> b;

   public gkh(gii<T, M> $$0, fun $$1) {
      super($$0);
      this.b = new fro<>($$1.a(fuq.W));
   }

   public void a(exn $$0, gbe $$1, int $$2, T $$3, float $$4, float $$5, float $$6, float $$7, float $$8, float $$9) {
      csd $$10 = $$3.d(bqs.e);
      if ($$10.a(csg.nT)) {
         akf $$13;
         if ($$3 instanceof gad $$11) {
            gnn $$12 = $$11.b();
            if ($$12.d() != null) {
               $$13 = $$12.d();
            } else if ($$12.c() != null && $$11.a(ckm.a)) {
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
         exr $$17 = ghl.a($$1, gbm.a($$13), false, $$10.x());
         this.b.a($$0, $$17, $$2, gmf.d, 1.0F, 1.0F, 1.0F, 1.0F);
         $$0.b();
      }
   }
}
