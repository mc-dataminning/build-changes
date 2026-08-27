import java.util.Map;

public class gkd<T extends bre, M extends frr<T> & frz> extends gky<T, M> {
   private final float a;
   private final float b;
   private final float c;
   private final Map<djx.a, fto> d;
   private final gba e;

   public gkd(gii<T, M> $$0, fun $$1, gba $$2) {
      this($$0, $$1, 1.0F, 1.0F, 1.0F, $$2);
   }

   public gkd(gii<T, M> $$0, fun $$1, float $$2, float $$3, float $$4, gba $$5) {
      super($$0);
      this.a = $$2;
      this.b = $$3;
      this.c = $$4;
      this.d = gdt.a($$1);
      this.e = $$5;
   }

   public void a(exn $$0, gbe $$1, int $$2, T $$3, float $$4, float $$5, float $$6, float $$7, float $$8, float $$9) {
      csd $$10 = $$3.d(bqs.f);
      if (!$$10.d()) {
         cry $$11 = $$10.f();
         $$0.a();
         $$0.b(this.a, this.b, this.c);
         boolean $$12 = $$3 instanceof cjy || $$3 instanceof cil;
         if ($$3.p_() && !($$3 instanceof cjy)) {
            float $$13 = 2.0F;
            float $$14 = 1.4F;
            $$0.a(0.0F, 0.03125F, 0.0F);
            $$0.b(0.7F, 0.7F, 0.7F);
            $$0.a(0.0F, 1.0F, 0.0F);
         }

         this.c().d().a($$0);
         if ($$11 instanceof cqb && ((cqb)$$11).d() instanceof dbr) {
            float $$15 = 1.1875F;
            $$0.b(1.1875F, -1.1875F, -1.1875F);
            if ($$12) {
               $$0.a(0.0F, 0.0625F, 0.0F);
            }

            cvd $$16 = $$10.a(jz.L);
            $$0.a(-0.5, 0.0, -0.5);
            djx.a $$17 = ((dbr)((cqb)$$11).d()).b();
            fto $$18 = this.d.get($$17);
            gbm $$19 = gdt.a($$17, $$16);
            bse $$21;
            if ($$3.da() instanceof bre $$20) {
               $$21 = $$20.aV;
            } else {
               $$21 = $$3.aV;
            }

            float $$23 = $$21.c($$6);
            gdt.a(null, 180.0F, $$23, $$0, $$1, $$2, $$18, $$19);
         } else if (!($$11 instanceof cps $$24) || $$24.k() != bqs.f) {
            a($$0, $$12);
            this.e.a($$3, $$10, csa.f, false, $$0, $$1, $$2);
         }

         $$0.b();
      }
   }

   public static void a(exn $$0, boolean $$1) {
      float $$2 = 0.625F;
      $$0.a(0.0F, -0.25F, 0.0F);
      $$0.a(a.d.rotationDegrees(180.0F));
      $$0.b(0.625F, -0.625F, -0.625F);
      if ($$1) {
         $$0.a(0.0F, 0.1875F, 0.0F);
      }
   }
}
