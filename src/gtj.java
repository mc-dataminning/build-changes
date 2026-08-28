import javax.annotation.Nullable;

public class gtj<S extends gvd, M extends fyk<S>> extends gsx<S, M> {
   private final fyg a;
   private final fyg b;
   private final gsi c;

   public gtj(gqg<S, M> $$0, gbi $$1, gsi $$2) {
      super($$0);
      this.a = new fyg($$1.a(gbl.ar));
      this.b = new fyg($$1.a(gbl.as));
      this.c = $$2;
   }

   public void a(feb $$0, gih $$1, int $$2, S $$3, float $$4, float $$5) {
      cwb $$6 = $$3.Q;
      ddn $$7 = $$6.a(ku.D);
      if ($$7 != null && !$$7.c().isEmpty()) {
         ali $$8 = a($$3);
         fyg $$9 = $$3.ae ? this.b : this.a;
         ali $$10 = $$7.c().get();
         $$0.a();
         $$0.a(0.0F, 0.0F, 0.125F);
         $$9.a($$3);
         this.c.a(ddl.d.c, $$10, $$9, $$6, gir::a, $$0, $$1, $$2, $$8);
         $$0.b();
      }
   }

   @Nullable
   private static ali a(gvd $$0) {
      if ($$0 instanceof gvy $$1) {
         gze $$2 = $$1.a;
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
