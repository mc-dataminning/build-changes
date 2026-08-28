import java.util.Map;

public class gmj<T extends btk, M extends ftv<T> & fud> extends gne<T, M> {
   private final float a;
   private final float b;
   private final float c;
   private final Map<dlw.a, fvs> d;
   private final gdf e;

   public gmj(gko<T, M> $$0, fwr $$1, gdf $$2) {
      this($$0, $$1, 1.0F, 1.0F, 1.0F, $$2);
   }

   public gmj(gko<T, M> $$0, fwr $$1, float $$2, float $$3, float $$4, gdf $$5) {
      super($$0);
      this.a = $$2;
      this.b = $$3;
      this.c = $$4;
      this.d = gfy.a($$1);
      this.e = $$5;
   }

   public void a(ezt $$0, gdj $$1, int $$2, T $$3, float $$4, float $$5, float $$6, float $$7, float $$8, float $$9) {
      cuk $$10 = $$3.a(bsw.f);
      if (!$$10.e()) {
         cuf $$11 = $$10.g();
         $$0.a();
         $$0.b(this.a, this.b, this.c);
         boolean $$12 = $$3 instanceof cmf || $$3 instanceof cks;
         if ($$3.p_() && !($$3 instanceof cmf)) {
            float $$13 = 2.0F;
            float $$14 = 1.4F;
            $$0.a(0.0F, 0.03125F, 0.0F);
            $$0.b(0.7F, 0.7F, 0.7F);
            $$0.a(0.0F, 1.0F, 0.0F);
         }

         this.c().d().a($$0);
         if ($$11 instanceof csi && ((csi)$$11).d() instanceof ddq) {
            float $$15 = 1.1875F;
            $$0.b(1.1875F, -1.1875F, -1.1875F);
            if ($$12) {
               $$0.a(0.0F, 0.0625F, 0.0F);
            }

            cxm $$16 = $$10.a(km.U);
            $$0.a(-0.5, 0.0, -0.5);
            dlw.a $$17 = ((ddq)((csi)$$11).d()).b();
            fvs $$18 = this.d.get($$17);
            gdr $$19 = gfy.a($$17, $$16);
            bul $$21;
            if ($$3.dc() instanceof btk $$20) {
               $$21 = $$20.aU;
            } else {
               $$21 = $$3.aU;
            }

            float $$23 = $$21.c($$6);
            gfy.a(null, 180.0F, $$23, $$0, $$1, $$2, $$18, $$19);
         } else if (!($$11 instanceof crz $$24) || $$24.m() != bsw.f) {
            a($$0, $$12);
            this.e.a($$3, $$10, cuh.f, false, $$0, $$1, $$2);
         }

         $$0.b();
      }
   }

   public static void a(ezt $$0, boolean $$1) {
      float $$2 = 0.625F;
      $$0.a(0.0F, -0.25F, 0.0F);
      $$0.a(a.d.rotationDegrees(180.0F));
      $$0.b(0.625F, -0.625F, -0.625F);
      if ($$1) {
         $$0.a(0.0F, 0.1875F, 0.0F);
      }
   }
}
