import java.util.Map;

public class gmm<T extends btn, M extends fty<T> & fug> extends gnh<T, M> {
   private final float a;
   private final float b;
   private final float c;
   private final Map<dlz.a, fvv> d;
   private final gdi e;

   public gmm(gkr<T, M> $$0, fwu $$1, gdi $$2) {
      this($$0, $$1, 1.0F, 1.0F, 1.0F, $$2);
   }

   public gmm(gkr<T, M> $$0, fwu $$1, float $$2, float $$3, float $$4, gdi $$5) {
      super($$0);
      this.a = $$2;
      this.b = $$3;
      this.c = $$4;
      this.d = ggb.a($$1);
      this.e = $$5;
   }

   public void a(ezw $$0, gdm $$1, int $$2, T $$3, float $$4, float $$5, float $$6, float $$7, float $$8, float $$9) {
      cun $$10 = $$3.a(bsz.f);
      if (!$$10.e()) {
         cui $$11 = $$10.g();
         $$0.a();
         $$0.b(this.a, this.b, this.c);
         boolean $$12 = $$3 instanceof cmi || $$3 instanceof ckv;
         if ($$3.p_() && !($$3 instanceof cmi)) {
            float $$13 = 2.0F;
            float $$14 = 1.4F;
            $$0.a(0.0F, 0.03125F, 0.0F);
            $$0.b(0.7F, 0.7F, 0.7F);
            $$0.a(0.0F, 1.0F, 0.0F);
         }

         this.c().d().a($$0);
         if ($$11 instanceof csl && ((csl)$$11).d() instanceof ddt) {
            float $$15 = 1.1875F;
            $$0.b(1.1875F, -1.1875F, -1.1875F);
            if ($$12) {
               $$0.a(0.0F, 0.0625F, 0.0F);
            }

            cxp $$16 = $$10.a(km.U);
            $$0.a(-0.5, 0.0, -0.5);
            dlz.a $$17 = ((ddt)((csl)$$11).d()).b();
            fvv $$18 = this.d.get($$17);
            gdu $$19 = ggb.a($$17, $$16);
            buo $$21;
            if ($$3.dc() instanceof btn $$20) {
               $$21 = $$20.aU;
            } else {
               $$21 = $$3.aU;
            }

            float $$23 = $$21.c($$6);
            ggb.a(null, 180.0F, $$23, $$0, $$1, $$2, $$18, $$19);
         } else if (!($$11 instanceof csc $$24) || $$24.m() != bsz.f) {
            a($$0, $$12);
            this.e.a($$3, $$10, cuk.f, false, $$0, $$1, $$2);
         }

         $$0.b();
      }
   }

   public static void a(ezw $$0, boolean $$1) {
      float $$2 = 0.625F;
      $$0.a(0.0F, -0.25F, 0.0F);
      $$0.a(a.d.rotationDegrees(180.0F));
      $$0.b(0.625F, -0.625F, -0.625F);
      if ($$1) {
         $$0.a(0.0F, 0.1875F, 0.0F);
      }
   }
}
