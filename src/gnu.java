import java.util.Map;

public class gnu<T extends btl, M extends fve<T> & fvm> extends gop<T, M> {
   private final float a;
   private final float b;
   private final float c;
   private final Map<dmz.a, fxb> d;
   private final gep e;

   public gnu(glz<T, M> $$0, fya $$1, gep $$2) {
      this($$0, $$1, 1.0F, 1.0F, 1.0F, $$2);
   }

   public gnu(glz<T, M> $$0, fya $$1, float $$2, float $$3, float $$4, gep $$5) {
      super($$0);
      this.a = $$2;
      this.b = $$3;
      this.c = $$4;
      this.d = ghi.a($$1);
      this.e = $$5;
   }

   public void a(fbc $$0, get $$1, int $$2, T $$3, float $$4, float $$5, float $$6, float $$7, float $$8, float $$9) {
      cuo $$10 = $$3.a(bsx.f);
      if (!$$10.e()) {
         cuj $$11 = $$10.g();
         $$0.a();
         $$0.b(this.a, this.b, this.c);
         boolean $$12 = $$3 instanceof cmi || $$3 instanceof ckv;
         if ($$3.o_() && !($$3 instanceof cmi)) {
            float $$13 = 2.0F;
            float $$14 = 1.4F;
            $$0.a(0.0F, 0.03125F, 0.0F);
            $$0.b(0.7F, 0.7F, 0.7F);
            $$0.a(0.0F, 1.0F, 0.0F);
         }

         this.c().d().a($$0);
         if ($$11 instanceof csm && ((csm)$$11).d() instanceof des) {
            float $$15 = 1.1875F;
            $$0.b(1.1875F, -1.1875F, -1.1875F);
            if ($$12) {
               $$0.a(0.0F, 0.0625F, 0.0F);
            }

            cxs $$16 = $$10.a(kq.W);
            $$0.a(-0.5, 0.0, -0.5);
            dmz.a $$17 = ((des)((csm)$$11).d()).b();
            fxb $$18 = this.d.get($$17);
            gfb $$19 = ghi.a($$17, $$16);
            bun $$21;
            if ($$3.dd() instanceof btl $$20) {
               $$21 = $$20.aU;
            } else {
               $$21 = $$3.aU;
            }

            float $$23 = $$21.c($$6);
            ghi.a(null, 180.0F, $$23, $$0, $$1, $$2, $$18, $$19);
         } else if (!($$11 instanceof csd $$24) || $$24.m() != bsx.f) {
            a($$0, $$12);
            this.e.a($$3, $$10, cul.f, false, $$0, $$1, $$2);
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
