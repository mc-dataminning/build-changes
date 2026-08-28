import javax.annotation.Nullable;

public class gtz<S extends gvt, M extends fza<S>> extends gtn<S, M> {
   private final fyw a;
   private final fyw b;
   private final gsy c;

   public gtz(gqw<S, M> $$0, gby $$1, gsy $$2) {
      super($$0);
      this.a = new fyw($$1.a(gcb.ar));
      this.b = new fyw($$1.a(gcb.as));
      this.c = $$2;
   }

   public void a(fek $$0, gix $$1, int $$2, S $$3, float $$4, float $$5) {
      cwf $$6 = $$3.Q;
      ddr $$7 = $$6.a(ku.D);
      if ($$7 != null && !$$7.c().isEmpty()) {
         all $$8 = a($$3);
         fyw $$9 = $$3.ae ? this.b : this.a;
         all $$10 = $$7.c().get();
         $$0.a();
         $$0.a(0.0F, 0.0F, 0.125F);
         $$9.a($$3);
         this.c.a(ddp.d.c, $$10, $$9, $$6, gjh::a, $$0, $$1, $$2, $$8);
         $$0.b();
      }
   }

   @Nullable
   private static all a(gvt $$0) {
      if ($$0 instanceof gwo $$1) {
         gzu $$2 = $$1.a;
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
