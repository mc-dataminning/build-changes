import javax.annotation.Nullable;

public class hay<S extends hcw, M extends gfq<S>> extends han<S, M> {
   private final gfm a;
   private final gfm b;
   private final gzy c;

   public hay(gxw<S, M> $$0, giq $$1, gzy $$2) {
      super($$0);
      this.a = new gfm($$1.a(git.aN));
      this.b = new gfm($$1.a(git.aO));
      this.c = $$2;
   }

   public void a(fjc $$0, gps $$1, int $$2, S $$3, float $$4, float $$5) {
      cyy $$6 = $$3.W;
      dhh $$7 = $$6.a(kj.D);
      if ($$7 != null && !$$7.d().isEmpty()) {
         alg $$8 = a($$3);
         gfm $$9 = $$3.aj ? this.b : this.a;
         $$0.a();
         $$0.a(0.0F, 0.0F, 0.125F);
         $$9.a($$3);
         this.c.a(hkv.d.c, $$7.d().get(), $$9, $$6, $$0, $$1, $$2, $$8);
         $$0.b();
      }
   }

   @Nullable
   private static alg a(hcw $$0) {
      if ($$0 instanceof hdr $$1) {
         hjq $$2 = $$1.a;
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
