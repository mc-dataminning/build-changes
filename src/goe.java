public class goe<T extends btn, M extends fvk<T>> extends gov<T, M> {
   private static final akr a = akr.b("textures/entity/elytra.png");
   private final fvh<T> b;

   public goe(gmf<T, M> $$0, fyg $$1) {
      super($$0);
      this.b = new fvh<>($$1.a(fyj.X));
   }

   public void a(fbi $$0, gez $$1, int $$2, T $$3, float $$4, float $$5, float $$6, float $$7, float $$8, float $$9) {
      cuq $$10 = $$3.a(bsy.e);
      if ($$10.a(cut.nT)) {
         akr $$13;
         if ($$3 instanceof gdy $$11) {
            grl $$12 = $$11.b();
            if ($$12.d() != null) {
               $$13 = $$12.d();
            } else if ($$12.c() != null && $$11.a(cmy.a)) {
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
         fbm $$17 = glh.a($$1, gfh.a($$13), $$10.x());
         this.b.a($$0, $$17, $$2, gqc.d);
         $$0.b();
      }
   }
}
