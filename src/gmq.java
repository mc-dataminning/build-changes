public class gmq<T extends btn, M extends fty<T>> extends gnh<T, M> {
   private static final ale a = new ale("textures/entity/elytra.png");
   private final ftv<T> b;

   public gmq(gkr<T, M> $$0, fwu $$1) {
      super($$0);
      this.b = new ftv<>($$1.a(fwx.W));
   }

   public void a(ezw $$0, gdm $$1, int $$2, T $$3, float $$4, float $$5, float $$6, float $$7, float $$8, float $$9) {
      cun $$10 = $$3.a(bsz.e);
      if ($$10.a(cuq.nT)) {
         ale $$13;
         if ($$3 instanceof gcl $$11) {
            gpx $$12 = $$11.b();
            if ($$12.d() != null) {
               $$13 = $$12.d();
            } else if ($$12.c() != null && $$11.a(cmw.a)) {
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
         faa $$17 = gjt.a($$1, gdu.a($$13), false, $$10.y());
         this.b.a($$0, $$17, $$2, goo.d, 1.0F, 1.0F, 1.0F, 1.0F);
         $$0.b();
      }
   }
}
