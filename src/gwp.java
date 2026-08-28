import javax.annotation.Nullable;

public class gwp<S extends gyk, M extends gbl<S>> extends gwe<S, M> {
   private final gbh a;
   private final gbh b;
   private final gvo c;

   public gwp(gtm<S, M> $$0, gej $$1, gvo $$2) {
      super($$0);
      this.a = new gbh($$1.a(gem.aC));
      this.b = new gbh($$1.a(gem.aD));
      this.c = $$2;
   }

   public void a(fgr $$0, glk $$1, int $$2, S $$3, float $$4, float $$5) {
      cxo $$6 = $$3.Q;
      dft $$7 = $$6.a(ku.D);
      if ($$7 != null && !$$7.c().isEmpty()) {
         alz $$8 = a($$3);
         gbh $$9 = $$3.ae ? this.b : this.a;
         alz $$10 = $$7.c().get();
         $$0.a();
         $$0.a(0.0F, 0.0F, 0.125F);
         $$9.a($$3);
         this.c.a(dfr.d.c, $$10, $$9, $$6, $$0, $$1, $$2, $$8);
         $$0.b();
      }
   }

   @Nullable
   private static alz a(gyk $$0) {
      if ($$0 instanceof gzf $$1) {
         hcl $$2 = $$1.a;
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
