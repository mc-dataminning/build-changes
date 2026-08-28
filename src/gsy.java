import javax.annotation.Nullable;

public class gsy<S extends gus, M extends fxz<S>> extends gsm<S, M> {
   private final fxv a;
   private final fxv b;
   private final grx c;

   public gsy(gpv<S, M> $$0, gax $$1, grx $$2) {
      super($$0);
      this.a = new fxv($$1.a(gba.ar));
      this.b = new fxv($$1.a(gba.as));
      this.c = $$2;
   }

   public void a(fdt $$0, ghw $$1, int $$2, S $$3, float $$4, float $$5) {
      cvx $$6 = $$3.Q;
      ddh $$7 = $$6.a(kt.D);
      if ($$7 != null && !$$7.c().isEmpty()) {
         alh $$8 = a($$3);
         fxv $$9 = $$3.ae ? this.b : this.a;
         alh $$10 = $$7.c().get();
         $$0.a();
         $$0.a(0.0F, 0.0F, 0.125F);
         $$9.a($$3);
         this.c.a(ddf.d.c, $$10, $$9, $$6, gig::a, $$0, $$1, $$2, $$8);
         $$0.b();
      }
   }

   @Nullable
   private static alh a(gus $$0) {
      if ($$0 instanceof gvn $$1) {
         gyt $$2 = $$1.a;
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
