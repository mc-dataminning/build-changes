import javax.annotation.Nullable;

public class guk<S extends gwe, M extends fzj<S>> extends gty<S, M> {
   private final fzf a;
   private final fzf b;
   private final gtj c;

   public guk(grh<S, M> $$0, gch $$1, gtj $$2) {
      super($$0);
      this.a = new fzf($$1.a(gck.aB));
      this.b = new fzf($$1.a(gck.aC));
      this.c = $$2;
   }

   public void a(fer $$0, gjg $$1, int $$2, S $$3, float $$4, float $$5) {
      cwm $$6 = $$3.Q;
      ddy $$7 = $$6.a(ku.D);
      if ($$7 != null && !$$7.c().isEmpty()) {
         alj $$8 = a($$3);
         fzf $$9 = $$3.ae ? this.b : this.a;
         alj $$10 = $$7.c().get();
         $$0.a();
         $$0.a(0.0F, 0.0F, 0.125F);
         $$9.a($$3);
         this.c.a(ddw.d.c, $$10, $$9, $$6, gjq::a, $$0, $$1, $$2, $$8);
         $$0.b();
      }
   }

   @Nullable
   private static alj a(gwe $$0) {
      if ($$0 instanceof gwz $$1) {
         haf $$2 = $$1.a;
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
