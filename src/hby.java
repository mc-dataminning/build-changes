import javax.annotation.Nullable;

public class hby<S extends hdw, M extends ggp<S>> extends hbm<S, M> {
   private final ggl a;
   private final ggl b;
   private final hax c;

   public hby(gyv<S, M> $$0, gjp $$1, hax $$2) {
      super($$0);
      this.a = new ggl($$1.a(gjs.aP));
      this.b = new ggl($$1.a(gjs.aQ));
      this.c = $$2;
   }

   public void a(fkd $$0, gqr $$1, int $$2, S $$3, float $$4, float $$5) {
      czn $$6 = $$3.W;
      dhw $$7 = $$6.a(kk.D);
      if ($$7 != null && !$$7.d().isEmpty()) {
         alg $$8 = a($$3);
         ggl $$9 = $$3.aj ? this.b : this.a;
         $$0.a();
         $$0.a(0.0F, 0.0F, 0.125F);
         $$9.a($$3);
         this.c.a(hlw.d.c, $$7.d().get(), $$9, $$6, $$0, $$1, $$2, $$8);
         $$0.b();
      }
   }

   @Nullable
   private static alg a(hdw $$0) {
      if ($$0 instanceof her $$1) {
         hks $$2 = $$1.a;
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
