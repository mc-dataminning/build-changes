import javax.annotation.Nullable;

public class hdi<S extends hfg, M extends gia<S>> extends hcw<S, M> {
   private final ghw a;
   private final ghw b;
   private final hch c;

   public hdi(haf<S, M> $$0, gla $$1, hch $$2) {
      super($$0);
      this.a = new ghw($$1.a(gld.aP));
      this.b = new ghw($$1.a(gld.aQ));
      this.c = $$2;
   }

   public void a(flo $$0, gsa $$1, int $$2, S $$3, float $$4, float $$5) {
      czy $$6 = $$3.W;
      dih $$7 = $$6.a(kk.D);
      if ($$7 != null && !$$7.d().isEmpty()) {
         ali $$8 = a($$3);
         ghw $$9 = $$3.aj ? this.b : this.a;
         $$0.a();
         $$0.a(0.0F, 0.0F, 0.125F);
         $$9.a($$3);
         this.c.a(hng.d.c, $$7.d().get(), $$9, $$6, $$0, $$1, $$2, $$8);
         $$0.b();
      }
   }

   @Nullable
   private static ali a(hfg $$0) {
      if ($$0 instanceof hgb $$1) {
         hmc $$2 = $$1.a;
         if ($$2.d() != null) {
            return $$2.d();
         }

         if ($$2.c() != null && $$1.ay) {
            return $$2.c();
         }
      }

      return null;
   }
}
