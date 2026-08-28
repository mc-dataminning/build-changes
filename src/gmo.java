import java.util.Map;

public class gmo<T extends btp, M extends fua<T> & fui> extends gnj<T, M> {
   private final float a;
   private final float b;
   private final float c;
   private final Map<dmb.a, fvx> d;
   private final gdk e;

   public gmo(gkt<T, M> $$0, fww $$1, gdk $$2) {
      this($$0, $$1, 1.0F, 1.0F, 1.0F, $$2);
   }

   public gmo(gkt<T, M> $$0, fww $$1, float $$2, float $$3, float $$4, gdk $$5) {
      super($$0);
      this.a = $$2;
      this.b = $$3;
      this.c = $$4;
      this.d = ggd.a($$1);
      this.e = $$5;
   }

   public void a(ezy $$0, gdo $$1, int $$2, T $$3, float $$4, float $$5, float $$6, float $$7, float $$8, float $$9) {
      cup $$10 = $$3.a(btb.f);
      if (!$$10.e()) {
         cuk $$11 = $$10.g();
         $$0.a();
         $$0.b(this.a, this.b, this.c);
         boolean $$12 = $$3 instanceof cmk || $$3 instanceof ckx;
         if ($$3.p_() && !($$3 instanceof cmk)) {
            float $$13 = 2.0F;
            float $$14 = 1.4F;
            $$0.a(0.0F, 0.03125F, 0.0F);
            $$0.b(0.7F, 0.7F, 0.7F);
            $$0.a(0.0F, 1.0F, 0.0F);
         }

         this.c().d().a($$0);
         if ($$11 instanceof csn && ((csn)$$11).d() instanceof ddv) {
            float $$15 = 1.1875F;
            $$0.b(1.1875F, -1.1875F, -1.1875F);
            if ($$12) {
               $$0.a(0.0F, 0.0625F, 0.0F);
            }

            cxr $$16 = $$10.a(km.V);
            $$0.a(-0.5, 0.0, -0.5);
            dmb.a $$17 = ((ddv)((csn)$$11).d()).b();
            fvx $$18 = this.d.get($$17);
            gdw $$19 = ggd.a($$17, $$16);
            buq $$21;
            if ($$3.dc() instanceof btp $$20) {
               $$21 = $$20.aU;
            } else {
               $$21 = $$3.aU;
            }

            float $$23 = $$21.c($$6);
            ggd.a(null, 180.0F, $$23, $$0, $$1, $$2, $$18, $$19);
         } else if (!($$11 instanceof cse $$24) || $$24.m() != btb.f) {
            a($$0, $$12);
            this.e.a($$3, $$10, cum.f, false, $$0, $$1, $$2);
         }

         $$0.b();
      }
   }

   public static void a(ezy $$0, boolean $$1) {
      float $$2 = 0.625F;
      $$0.a(0.0F, -0.25F, 0.0F);
      $$0.a(a.d.rotationDegrees(180.0F));
      $$0.b(0.625F, -0.625F, -0.625F);
      if ($$1) {
         $$0.a(0.0F, 0.1875F, 0.0F);
      }
   }
}
