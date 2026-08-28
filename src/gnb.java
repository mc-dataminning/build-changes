public class gnb<T extends bsy, M extends fui<T>> extends gns<T, M> {
   private static final akk a = new akk("textures/entity/elytra.png");
   private final fuf<T> b;

   public gnb(glc<T, M> $$0, fxe $$1) {
      super($$0);
      this.b = new fuf<>($$1.a(fxh.W));
   }

   public void a(fag $$0, gdx $$1, int $$2, T $$3, float $$4, float $$5, float $$6, float $$7, float $$8, float $$9) {
      cua $$10 = $$3.a(bsk.e);
      if ($$10.a(cud.nT)) {
         akk $$13;
         if ($$3 instanceof gcw $$11) {
            gqi $$12 = $$11.b();
            if ($$12.d() != null) {
               $$13 = $$12.d();
            } else if ($$12.c() != null && $$11.a(cmi.a)) {
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
         fak $$17 = gke.a($$1, gef.a($$13), false, $$10.x());
         this.b.a($$0, $$17, $$2, goz.d, 1.0F, 1.0F, 1.0F, 1.0F);
         $$0.b();
      }
   }
}
