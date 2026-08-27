public class gen<T extends bog, M extends fmb<T>> extends gfe<T, M> {
   private static final aiy a = new aiy("textures/entity/elytra.png");
   private final fly<T> b;

   public gen(gco<T, M> $$0, foy $$1) {
      super($$0);
      this.b = new fly<>($$1.a(fpb.S));
   }

   public void a(esa $$0, fvm $$1, int $$2, T $$3, float $$4, float $$5, float $$6, float $$7, float $$8, float $$9) {
      coz $$10 = $$3.c(bnv.e);
      if ($$10.a(cpc.nS)) {
         aiy $$13;
         if ($$3 instanceof ful $$11) {
            ght $$12 = $$11.b();
            if ($$12.d() != null) {
               $$13 = $$12.d();
            } else if ($$12.c() != null && $$11.a(chi.a)) {
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
         ese $$17 = gbr.a($$1, fvu.a($$13), false, $$10.C());
         this.b.a($$0, $$17, $$2, ggl.d, 1.0F, 1.0F, 1.0F, 1.0F);
         $$0.b();
      }
   }
}
