import java.util.Map;

public class gkn<T extends bsa, M extends fsb<T> & fsj> extends gli<T, M> {
   private final float a;
   private final float b;
   private final float c;
   private final Map<dkg.a, fty> d;
   private final gbk e;

   public gkn(gis<T, M> $$0, fux $$1, gbk $$2) {
      this($$0, $$1, 1.0F, 1.0F, 1.0F, $$2);
   }

   public gkn(gis<T, M> $$0, fux $$1, float $$2, float $$3, float $$4, gbk $$5) {
      super($$0);
      this.a = $$2;
      this.b = $$3;
      this.c = $$4;
      this.d = ged.a($$1);
      this.e = $$5;
   }

   public void a(exx $$0, gbo $$1, int $$2, T $$3, float $$4, float $$5, float $$6, float $$7, float $$8, float $$9) {
      csz $$10 = $$3.d(bro.f);
      if (!$$10.d()) {
         csu $$11 = $$10.f();
         $$0.a();
         $$0.b(this.a, this.b, this.c);
         boolean $$12 = $$3 instanceof cku || $$3 instanceof cjh;
         if ($$3.p_() && !($$3 instanceof cku)) {
            float $$13 = 2.0F;
            float $$14 = 1.4F;
            $$0.a(0.0F, 0.03125F, 0.0F);
            $$0.b(0.7F, 0.7F, 0.7F);
            $$0.a(0.0F, 1.0F, 0.0F);
         }

         this.c().d().a($$0);
         if ($$11 instanceof cqx && ((cqx)$$11).d() instanceof dca) {
            float $$15 = 1.1875F;
            $$0.b(1.1875F, -1.1875F, -1.1875F);
            if ($$12) {
               $$0.a(0.0F, 0.0625F, 0.0F);
            }

            cvz $$16 = $$10.a(ka.S);
            $$0.a(-0.5, 0.0, -0.5);
            dkg.a $$17 = ((dca)((cqx)$$11).d()).b();
            fty $$18 = this.d.get($$17);
            gbw $$19 = ged.a($$17, $$16);
            bta $$21;
            if ($$3.da() instanceof bsa $$20) {
               $$21 = $$20.aV;
            } else {
               $$21 = $$3.aV;
            }

            float $$23 = $$21.c($$6);
            ged.a(null, 180.0F, $$23, $$0, $$1, $$2, $$18, $$19);
         } else if (!($$11 instanceof cqo $$24) || $$24.k() != bro.f) {
            a($$0, $$12);
            this.e.a($$3, $$10, csw.f, false, $$0, $$1, $$2);
         }

         $$0.b();
      }
   }

   public static void a(exx $$0, boolean $$1) {
      float $$2 = 0.625F;
      $$0.a(0.0F, -0.25F, 0.0F);
      $$0.a(a.d.rotationDegrees(180.0F));
      $$0.b(0.625F, -0.625F, -0.625F);
      if ($$1) {
         $$0.a(0.0F, 0.1875F, 0.0F);
      }
   }
}
