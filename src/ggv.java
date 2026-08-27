public class ggv<T extends bpp, M extends foe<T>> extends ghm<T, M> {
   private static final ajh a = new ajh("textures/entity/elytra.png");
   private final fob<T> b;

   public ggv(gew<T, M> $$0, frb $$1) {
      super($$0);
      this.b = new fob<>($$1.a(fre.W));
   }

   public void a(eub $$0, fxs $$1, int $$2, T $$3, float $$4, float $$5, float $$6, float $$7, float $$8, float $$9) {
      cqm $$10 = $$3.d(bpe.e);
      if ($$10.a(cqp.nS)) {
         ajh $$13;
         if ($$3 instanceof fwr $$11) {
            gkb $$12 = $$11.b();
            if ($$12.d() != null) {
               $$13 = $$12.d();
            } else if ($$12.c() != null && $$11.a(civ.a)) {
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
         euf $$17 = gdz.a($$1, fya.a($$13), false, $$10.C());
         this.b.a($$0, $$17, $$2, git.d, 1.0F, 1.0F, 1.0F, 1.0F);
         $$0.b();
      }
   }
}
