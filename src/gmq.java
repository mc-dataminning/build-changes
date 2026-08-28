import java.util.Map;

public class gmq<T extends btr, M extends fuc<T> & fuk> extends gnl<T, M> {
   private final float a;
   private final float b;
   private final float c;
   private final Map<dmd.a, fvz> d;
   private final gdm e;

   public gmq(gkv<T, M> $$0, fwy $$1, gdm $$2) {
      this($$0, $$1, 1.0F, 1.0F, 1.0F, $$2);
   }

   public gmq(gkv<T, M> $$0, fwy $$1, float $$2, float $$3, float $$4, gdm $$5) {
      super($$0);
      this.a = $$2;
      this.b = $$3;
      this.c = $$4;
      this.d = ggf.a($$1);
      this.e = $$5;
   }

   public void a(faa $$0, gdq $$1, int $$2, T $$3, float $$4, float $$5, float $$6, float $$7, float $$8, float $$9) {
      cur $$10 = $$3.a(btd.f);
      if (!$$10.e()) {
         cum $$11 = $$10.g();
         $$0.a();
         $$0.b(this.a, this.b, this.c);
         boolean $$12 = $$3 instanceof cmm || $$3 instanceof ckz;
         if ($$3.p_() && !($$3 instanceof cmm)) {
            float $$13 = 2.0F;
            float $$14 = 1.4F;
            $$0.a(0.0F, 0.03125F, 0.0F);
            $$0.b(0.7F, 0.7F, 0.7F);
            $$0.a(0.0F, 1.0F, 0.0F);
         }

         this.c().d().a($$0);
         if ($$11 instanceof csp && ((csp)$$11).d() instanceof ddx) {
            float $$15 = 1.1875F;
            $$0.b(1.1875F, -1.1875F, -1.1875F);
            if ($$12) {
               $$0.a(0.0F, 0.0625F, 0.0F);
            }

            cxt $$16 = $$10.a(km.V);
            $$0.a(-0.5, 0.0, -0.5);
            dmd.a $$17 = ((ddx)((csp)$$11).d()).b();
            fvz $$18 = this.d.get($$17);
            gdy $$19 = ggf.a($$17, $$16);
            bus $$21;
            if ($$3.dc() instanceof btr $$20) {
               $$21 = $$20.aU;
            } else {
               $$21 = $$3.aU;
            }

            float $$23 = $$21.c($$6);
            ggf.a(null, 180.0F, $$23, $$0, $$1, $$2, $$18, $$19);
         } else if (!($$11 instanceof csg $$24) || $$24.m() != btd.f) {
            a($$0, $$12);
            this.e.a($$3, $$10, cuo.f, false, $$0, $$1, $$2);
         }

         $$0.b();
      }
   }

   public static void a(faa $$0, boolean $$1) {
      float $$2 = 0.625F;
      $$0.a(0.0F, -0.25F, 0.0F);
      $$0.a(a.d.rotationDegrees(180.0F));
      $$0.b(0.625F, -0.625F, -0.625F);
      if ($$1) {
         $$0.a(0.0F, 0.1875F, 0.0F);
      }
   }
}
