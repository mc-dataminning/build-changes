public class goc<T extends btn, M extends fvi<T>> extends got<T, M> {
   private static final akr a = akr.b("textures/entity/elytra.png");
   private final fvf<T> b;

   public goc(gmd<T, M> $$0, fye $$1) {
      super($$0);
      this.b = new fvf<>($$1.a(fyh.X));
   }

   public void a(fbg $$0, gex $$1, int $$2, T $$3, float $$4, float $$5, float $$6, float $$7, float $$8, float $$9) {
      cuq $$10 = $$3.a(bsy.e);
      if ($$10.a(cut.nT)) {
         akr $$13;
         if ($$3 instanceof gdw $$11) {
            grj $$12 = $$11.b();
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
         fbk $$17 = glf.a($$1, gff.a($$13), $$10.x());
         this.b.a($$0, $$17, $$2, gqa.d);
         $$0.b();
      }
   }
}
