public class gny<T extends btl, M extends fve<T>> extends gop<T, M> {
   private static final akq a = akq.b("textures/entity/elytra.png");
   private final fvb<T> b;

   public gny(glz<T, M> $$0, fya $$1) {
      super($$0);
      this.b = new fvb<>($$1.a(fyd.X));
   }

   public void a(fbc $$0, get $$1, int $$2, T $$3, float $$4, float $$5, float $$6, float $$7, float $$8, float $$9) {
      cuo $$10 = $$3.a(bsx.e);
      if ($$10.a(cur.nT)) {
         akq $$13;
         if ($$3 instanceof gds $$11) {
            grf $$12 = $$11.b();
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
         fbg $$17 = glb.a($$1, gfb.a($$13), $$10.x());
         this.b.a($$0, $$17, $$2, gpw.d);
         $$0.b();
      }
   }
}
