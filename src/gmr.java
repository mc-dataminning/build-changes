public class gmr<T extends bto, M extends ftz<T>> extends gni<T, M> {
   private static final ale a = new ale("textures/entity/elytra.png");
   private final ftw<T> b;

   public gmr(gks<T, M> $$0, fwv $$1) {
      super($$0);
      this.b = new ftw<>($$1.a(fwy.W));
   }

   public void a(ezx $$0, gdn $$1, int $$2, T $$3, float $$4, float $$5, float $$6, float $$7, float $$8, float $$9) {
      cuo $$10 = $$3.a(bta.e);
      if ($$10.a(cur.nT)) {
         ale $$13;
         if ($$3 instanceof gcm $$11) {
            gpy $$12 = $$11.b();
            if ($$12.d() != null) {
               $$13 = $$12.d();
            } else if ($$12.c() != null && $$11.a(cmx.a)) {
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
         fab $$17 = gju.a($$1, gdv.a($$13), false, $$10.y());
         this.b.a($$0, $$17, $$2, gop.d, 1.0F, 1.0F, 1.0F, 1.0F);
         $$0.b();
      }
   }
}
