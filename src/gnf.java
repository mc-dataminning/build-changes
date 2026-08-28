import java.util.Map;

public class gnf<T extends btc, M extends fuq<T> & fuy> extends goa<T, M> {
   private final float a;
   private final float b;
   private final float c;
   private final Map<dmk.a, fwn> d;
   private final geb e;

   public gnf(glk<T, M> $$0, fxm $$1, geb $$2) {
      this($$0, $$1, 1.0F, 1.0F, 1.0F, $$2);
   }

   public gnf(glk<T, M> $$0, fxm $$1, float $$2, float $$3, float $$4, geb $$5) {
      super($$0);
      this.a = $$2;
      this.b = $$3;
      this.c = $$4;
      this.d = ggu.a($$1);
      this.e = $$5;
   }

   public void a(fao $$0, gef $$1, int $$2, T $$3, float $$4, float $$5, float $$6, float $$7, float $$8, float $$9) {
      cud $$10 = $$3.a(bso.f);
      if (!$$10.e()) {
         cty $$11 = $$10.g();
         $$0.a();
         $$0.b(this.a, this.b, this.c);
         boolean $$12 = $$3 instanceof cly || $$3 instanceof ckl;
         if ($$3.o_() && !($$3 instanceof cly)) {
            float $$13 = 2.0F;
            float $$14 = 1.4F;
            $$0.a(0.0F, 0.03125F, 0.0F);
            $$0.b(0.7F, 0.7F, 0.7F);
            $$0.a(0.0F, 1.0F, 0.0F);
         }

         this.c().d().a($$0);
         if ($$11 instanceof csc && ((csc)$$11).d() instanceof dee) {
            float $$15 = 1.1875F;
            $$0.b(1.1875F, -1.1875F, -1.1875F);
            if ($$12) {
               $$0.a(0.0F, 0.0625F, 0.0F);
            }

            cxe $$16 = $$10.a(kn.V);
            $$0.a(-0.5, 0.0, -0.5);
            dmk.a $$17 = ((dee)((csc)$$11).d()).b();
            fwn $$18 = this.d.get($$17);
            gen $$19 = ggu.a($$17, $$16);
            bud $$21;
            if ($$3.de() instanceof btc $$20) {
               $$21 = $$20.aV;
            } else {
               $$21 = $$3.aV;
            }

            float $$23 = $$21.c($$6);
            ggu.a(null, 180.0F, $$23, $$0, $$1, $$2, $$18, $$19);
         } else if (!($$11 instanceof crt $$24) || $$24.m() != bso.f) {
            a($$0, $$12);
            this.e.a($$3, $$10, cua.f, false, $$0, $$1, $$2);
         }

         $$0.b();
      }
   }

   public static void a(fao $$0, boolean $$1) {
      float $$2 = 0.625F;
      $$0.a(0.0F, -0.25F, 0.0F);
      $$0.a(a.d.rotationDegrees(180.0F));
      $$0.b(0.625F, -0.625F, -0.625F);
      if ($$1) {
         $$0.a(0.0F, 0.1875F, 0.0F);
      }
   }
}
