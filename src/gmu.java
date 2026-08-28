public class gmu<T extends btr, M extends fuc<T>> extends gnl<T, M> {
   private static final alf a = new alf("textures/entity/elytra.png");
   private final ftz<T> b;

   public gmu(gkv<T, M> $$0, fwy $$1) {
      super($$0);
      this.b = new ftz<>($$1.a(fxb.W));
   }

   public void a(faa $$0, gdq $$1, int $$2, T $$3, float $$4, float $$5, float $$6, float $$7, float $$8, float $$9) {
      cur $$10 = $$3.a(btd.e);
      if ($$10.a(cuu.nT)) {
         alf $$13;
         if ($$3 instanceof gcp $$11) {
            gqb $$12 = $$11.b();
            if ($$12.d() != null) {
               $$13 = $$12.d();
            } else if ($$12.c() != null && $$11.a(cna.a)) {
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
         fae $$17 = gjx.a($$1, gdy.a($$13), false, $$10.y());
         this.b.a($$0, $$17, $$2, gos.d, 1.0F, 1.0F, 1.0F, 1.0F);
         $$0.b();
      }
   }
}
