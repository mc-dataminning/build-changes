import java.util.Map;

public class gny<T extends btn, M extends fvi<T> & fvq> extends got<T, M> {
   private final float a;
   private final float b;
   private final float c;
   private final Map<dnb.a, fxf> d;
   private final get e;

   public gny(gmd<T, M> $$0, fye $$1, get $$2) {
      this($$0, $$1, 1.0F, 1.0F, 1.0F, $$2);
   }

   public gny(gmd<T, M> $$0, fye $$1, float $$2, float $$3, float $$4, get $$5) {
      super($$0);
      this.a = $$2;
      this.b = $$3;
      this.c = $$4;
      this.d = ghm.a($$1);
      this.e = $$5;
   }

   public void a(fbg $$0, gex $$1, int $$2, T $$3, float $$4, float $$5, float $$6, float $$7, float $$8, float $$9) {
      cuq $$10 = $$3.a(bsy.f);
      if (!$$10.e()) {
         cul $$11 = $$10.g();
         $$0.a();
         $$0.b(this.a, this.b, this.c);
         boolean $$12 = $$3 instanceof cmk || $$3 instanceof ckx;
         if ($$3.o_() && !($$3 instanceof cmk)) {
            float $$13 = 2.0F;
            float $$14 = 1.4F;
            $$0.a(0.0F, 0.03125F, 0.0F);
            $$0.b(0.7F, 0.7F, 0.7F);
            $$0.a(0.0F, 1.0F, 0.0F);
         }

         this.c().d().a($$0);
         if ($$11 instanceof cso && ((cso)$$11).d() instanceof deu) {
            float $$15 = 1.1875F;
            $$0.b(1.1875F, -1.1875F, -1.1875F);
            if ($$12) {
               $$0.a(0.0F, 0.0625F, 0.0F);
            }

            cxu $$16 = $$10.a(kq.W);
            $$0.a(-0.5, 0.0, -0.5);
            dnb.a $$17 = ((deu)((cso)$$11).d()).b();
            fxf $$18 = this.d.get($$17);
            gff $$19 = ghm.a($$17, $$16);
            bup $$21;
            if ($$3.dd() instanceof btn $$20) {
               $$21 = $$20.aU;
            } else {
               $$21 = $$3.aU;
            }

            float $$23 = $$21.c($$6);
            ghm.a(null, 180.0F, $$23, $$0, $$1, $$2, $$18, $$19);
         } else if (!($$11 instanceof csf $$24) || $$24.m() != bsy.f) {
            a($$0, $$12);
            this.e.a($$3, $$10, cun.f, false, $$0, $$1, $$2);
         }

         $$0.b();
      }
   }

   public static void a(fbg $$0, boolean $$1) {
      float $$2 = 0.625F;
      $$0.a(0.0F, -0.25F, 0.0F);
      $$0.a(a.d.rotationDegrees(180.0F));
      $$0.b(0.625F, -0.625F, -0.625F);
      if ($$1) {
         $$0.a(0.0F, 0.1875F, 0.0F);
      }
   }
}
