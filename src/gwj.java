import javax.annotation.Nullable;

public class gwj<S extends gye, M extends gbf<S>> extends gvy<S, M> {
   private final gbb a;
   private final gbb b;
   private final gvi c;

   public gwj(gtg<S, M> $$0, ged $$1, gvi $$2) {
      super($$0);
      this.a = new gbb($$1.a(geg.aC));
      this.b = new gbb($$1.a(geg.aD));
      this.c = $$2;
   }

   public void a(fgl $$0, gle $$1, int $$2, S $$3, float $$4, float $$5) {
      cxk $$6 = $$3.Q;
      dfm $$7 = $$6.a(ku.D);
      if ($$7 != null && !$$7.c().isEmpty()) {
         alz $$8 = a($$3);
         gbb $$9 = $$3.ae ? this.b : this.a;
         alz $$10 = $$7.c().get();
         $$0.a();
         $$0.a(0.0F, 0.0F, 0.125F);
         $$9.a($$3);
         this.c.a(dfk.d.c, $$10, $$9, $$6, glo::a, $$0, $$1, $$2, $$8);
         $$0.b();
      }
   }

   @Nullable
   private static alz a(gye $$0) {
      if ($$0 instanceof gyz $$1) {
         hcf $$2 = $$1.a;
         if ($$2.d() != null) {
            return $$2.d();
         }

         if ($$2.c() != null && $$1.aw) {
            return $$2.c();
         }
      }

      return null;
   }
}
