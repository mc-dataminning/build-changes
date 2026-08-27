import java.util.Map;

public class glk<T extends bsq, M extends fsw<T> & fte> extends gmf<T, M> {
   private final float a;
   private final float b;
   private final float c;
   private final Map<dlc.a, fut> d;
   private final gcg e;

   public glk(gjp<T, M> $$0, fvs $$1, gcg $$2) {
      this($$0, $$1, 1.0F, 1.0F, 1.0F, $$2);
   }

   public glk(gjp<T, M> $$0, fvs $$1, float $$2, float $$3, float $$4, gcg $$5) {
      super($$0);
      this.a = $$2;
      this.b = $$3;
      this.c = $$4;
      this.d = gez.a($$1);
      this.e = $$5;
   }

   public void a(eyu $$0, gck $$1, int $$2, T $$3, float $$4, float $$5, float $$6, float $$7, float $$8, float $$9) {
      ctq $$10 = $$3.a(bsd.f);
      if (!$$10.e()) {
         ctl $$11 = $$10.g();
         $$0.a();
         $$0.b(this.a, this.b, this.c);
         boolean $$12 = $$3 instanceof cll || $$3 instanceof cjy;
         if ($$3.p_() && !($$3 instanceof cll)) {
            float $$13 = 2.0F;
            float $$14 = 1.4F;
            $$0.a(0.0F, 0.03125F, 0.0F);
            $$0.b(0.7F, 0.7F, 0.7F);
            $$0.a(0.0F, 1.0F, 0.0F);
         }

         this.c().d().a($$0);
         if ($$11 instanceof cro && ((cro)$$11).d() instanceof dcw) {
            float $$15 = 1.1875F;
            $$0.b(1.1875F, -1.1875F, -1.1875F);
            if ($$12) {
               $$0.a(0.0F, 0.0625F, 0.0F);
            }

            cws $$16 = $$10.a(kb.U);
            $$0.a(-0.5, 0.0, -0.5);
            dlc.a $$17 = ((dcw)((cro)$$11).d()).b();
            fut $$18 = this.d.get($$17);
            gcs $$19 = gez.a($$17, $$16);
            btr $$21;
            if ($$3.dc() instanceof bsq $$20) {
               $$21 = $$20.aU;
            } else {
               $$21 = $$3.aU;
            }

            float $$23 = $$21.c($$6);
            gez.a(null, 180.0F, $$23, $$0, $$1, $$2, $$18, $$19);
         } else if (!($$11 instanceof crf $$24) || $$24.m() != bsd.f) {
            a($$0, $$12);
            this.e.a($$3, $$10, ctn.f, false, $$0, $$1, $$2);
         }

         $$0.b();
      }
   }

   public static void a(eyu $$0, boolean $$1) {
      float $$2 = 0.625F;
      $$0.a(0.0F, -0.25F, 0.0F);
      $$0.a(a.d.rotationDegrees(180.0F));
      $$0.b(0.625F, -0.625F, -0.625F);
      if ($$1) {
         $$0.a(0.0F, 0.1875F, 0.0F);
      }
   }
}
