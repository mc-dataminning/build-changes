import javax.annotation.Nullable;

public class gwq<S extends gyl, M extends gbm<S>> extends gwf<S, M> {
   private final gbi a;
   private final gbi b;
   private final gvp c;

   public gwq(gtn<S, M> $$0, gek $$1, gvp $$2) {
      super($$0);
      this.a = new gbi($$1.a(gen.aC));
      this.b = new gbi($$1.a(gen.aD));
      this.c = $$2;
   }

   public void a(fgs $$0, gll $$1, int $$2, S $$3, float $$4, float $$5) {
      cxp $$6 = $$3.Q;
      dfu $$7 = $$6.a(ku.D);
      if ($$7 != null && !$$7.c().isEmpty()) {
         alz $$8 = a($$3);
         gbi $$9 = $$3.ae ? this.b : this.a;
         alz $$10 = $$7.c().get();
         $$0.a();
         $$0.a(0.0F, 0.0F, 0.125F);
         $$9.a($$3);
         this.c.a(dfs.d.c, $$10, $$9, $$6, $$0, $$1, $$2, $$8);
         $$0.b();
      }
   }

   @Nullable
   private static alz a(gyl $$0) {
      if ($$0 instanceof gzg $$1) {
         hcm $$2 = $$1.a;
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
