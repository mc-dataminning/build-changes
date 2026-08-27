import java.util.Map;

public class gok<T extends bso, M extends fvq<T> & fvy> extends gpi<T, M> {
   private final float a;
   private final float b;
   private final float c;
   private final Map<dms.a, fxp> d;
   private final gfc e;

   public gok(gmp<T, M> $$0, fyo $$1, gfc $$2) {
      this($$0, $$1, 1.0F, 1.0F, 1.0F, $$2);
   }

   public gok(gmp<T, M> $$0, fyo $$1, float $$2, float $$3, float $$4, gfc $$5) {
      super($$0);
      this.a = $$2;
      this.b = $$3;
      this.c = $$4;
      this.d = ghv.a($$1);
      this.e = $$5;
   }

   public void a(fbc $$0, gfg $$1, int $$2, T $$3, float $$4, float $$5, float $$6, float $$7, float $$8, float $$9) {
      cuh $$10 = $$3.d(bsc.f);
      if (!$$10.d()) {
         cuc $$11 = $$10.f();
         $$0.a();
         $$0.b(this.a, this.b, this.c);
         boolean $$12 = $$3 instanceof cll || $$3 instanceof cjy;
         if ($$3.o_() && !($$3 instanceof cll)) {
            float $$13 = 2.0F;
            float $$14 = 1.4F;
            $$0.a(0.0F, 0.03125F, 0.0F);
            $$0.b(0.7F, 0.7F, 0.7F);
            $$0.a(0.0F, 1.0F, 0.0F);
         }

         this.c().d().a($$0);
         if ($$11 instanceof csc && ((csc)$$11).d() instanceof ddx) {
            float $$15 = 1.1875F;
            $$0.b(1.1875F, -1.1875F, -1.1875F);
            if ($$12) {
               $$0.a(0.0F, 0.0625F, 0.0F);
            }

            cxs $$16 = $$10.a(ke.U);
            $$0.a(-0.5, 0.0, -0.5);
            dms.a $$17 = ((ddx)((csc)$$11).d()).b();
            fxp $$18 = this.d.get($$17);
            gfo $$19 = ghv.a($$17, $$16);
            bto $$21;
            if ($$3.dh() instanceof bso $$20) {
               $$21 = $$20.bf;
            } else {
               $$21 = $$3.bf;
            }

            float $$23 = $$21.c($$6);
            ghv.a(null, 180.0F, $$23, $$0, $$1, $$2, $$18, $$19);
         } else if (!($$11 instanceof crt $$24) || $$24.k() != bsc.f) {
            a($$0, $$12);
            this.e.a($$3, $$10, cue.f, false, $$0, $$1, $$2);
         }

         $$0.b();
      }
   }

   public static void a(fbc $$0, boolean $$1) {
      float $$2 = 0.625F;
      $$0.a(0.0F, -0.25F, 0.0F);
      $$0.a(a.d.rotationDegrees(180.0F));
      $$0.b(0.625F, -0.625F, -0.625F);
      if ($$1) {
         $$0.a(0.0F, 0.1875F, 0.0F);
      }
   }
}
