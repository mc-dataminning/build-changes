import javax.annotation.Nullable;

public class gwo<S extends gyj, M extends gbk<S>> extends gwd<S, M> {
   private final gbg a;
   private final gbg b;
   private final gvn c;

   public gwo(gtl<S, M> $$0, gei $$1, gvn $$2) {
      super($$0);
      this.a = new gbg($$1.a(gel.aC));
      this.b = new gbg($$1.a(gel.aD));
      this.c = $$2;
   }

   public void a(fgq $$0, glj $$1, int $$2, S $$3, float $$4, float $$5) {
      cxo $$6 = $$3.Q;
      dft $$7 = $$6.a(ku.D);
      if ($$7 != null && !$$7.c().isEmpty()) {
         alz $$8 = a($$3);
         gbg $$9 = $$3.ae ? this.b : this.a;
         alz $$10 = $$7.c().get();
         $$0.a();
         $$0.a(0.0F, 0.0F, 0.125F);
         $$9.a($$3);
         this.c.a(dfr.d.c, $$10, $$9, $$6, $$0, $$1, $$2, $$8);
         $$0.b();
      }
   }

   @Nullable
   private static alz a(gyj $$0) {
      if ($$0 instanceof gze $$1) {
         hck $$2 = $$1.a;
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
