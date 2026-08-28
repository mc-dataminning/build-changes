import javax.annotation.Nullable;

public class gwl<S extends gyg, M extends gbh<S>> extends gwa<S, M> {
   private final gbd a;
   private final gbd b;
   private final gvk c;

   public gwl(gti<S, M> $$0, gef $$1, gvk $$2) {
      super($$0);
      this.a = new gbd($$1.a(gei.aF));
      this.b = new gbd($$1.a(gei.aG));
      this.c = $$2;
   }

   public void a(fgl $$0, glg $$1, int $$2, S $$3, float $$4, float $$5) {
      cxg $$6 = $$3.Q;
      dfl $$7 = $$6.a(ku.D);
      if ($$7 != null && !$$7.c().isEmpty()) {
         alp $$8 = a($$3);
         gbd $$9 = $$3.ae ? this.b : this.a;
         alp $$10 = $$7.c().get();
         $$0.a();
         $$0.a(0.0F, 0.0F, 0.125F);
         $$9.a($$3);
         this.c.a(dfj.d.c, $$10, $$9, $$6, $$0, $$1, $$2, $$8);
         $$0.b();
      }
   }

   @Nullable
   private static alp a(gyg $$0) {
      if ($$0 instanceof gzb $$1) {
         hch $$2 = $$1.a;
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
