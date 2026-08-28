import javax.annotation.Nullable;

public class hbg<S extends hde, M extends gfy<S>> extends hav<S, M> {
   private final gfu a;
   private final gfu b;
   private final hag c;

   public hbg(gye<S, M> $$0, giy $$1, hag $$2) {
      super($$0);
      this.a = new gfu($$1.a(gjb.aP));
      this.b = new gfu($$1.a(gjb.aQ));
      this.c = $$2;
   }

   public void a(fjj $$0, gqa $$1, int $$2, S $$3, float $$4, float $$5) {
      czd $$6 = $$3.W;
      dhm $$7 = $$6.a(kj.D);
      if ($$7 != null && !$$7.d().isEmpty()) {
         alg $$8 = a($$3);
         gfu $$9 = $$3.aj ? this.b : this.a;
         $$0.a();
         $$0.a(0.0F, 0.0F, 0.125F);
         $$9.a($$3);
         this.c.a(hld.d.c, $$7.d().get(), $$9, $$6, $$0, $$1, $$2, $$8);
         $$0.b();
      }
   }

   @Nullable
   private static alg a(hde $$0) {
      if ($$0 instanceof hdz $$1) {
         hjy $$2 = $$1.a;
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
