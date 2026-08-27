import java.util.Map;

public class gjh<T extends bqt, M extends fqv<T> & frd> extends gkc<T, M> {
   private final float a;
   private final float b;
   private final float c;
   private final Map<dji.a, fss> d;
   private final gae e;

   public gjh(ghm<T, M> $$0, ftr $$1, gae $$2) {
      this($$0, $$1, 1.0F, 1.0F, 1.0F, $$2);
   }

   public gjh(ghm<T, M> $$0, ftr $$1, float $$2, float $$3, float $$4, gae $$5) {
      super($$0);
      this.a = $$2;
      this.b = $$3;
      this.c = $$4;
      this.d = gcx.a($$1);
      this.e = $$5;
   }

   public void a(ewr $$0, gai $$1, int $$2, T $$3, float $$4, float $$5, float $$6, float $$7, float $$8, float $$9) {
      crs $$10 = $$3.d(bqh.f);
      if (!$$10.d()) {
         crn $$11 = $$10.f();
         $$0.a();
         $$0.b(this.a, this.b, this.c);
         boolean $$12 = $$3 instanceof cjn || $$3 instanceof cia;
         if ($$3.p_() && !($$3 instanceof cjn)) {
            float $$13 = 2.0F;
            float $$14 = 1.4F;
            $$0.a(0.0F, 0.03125F, 0.0F);
            $$0.b(0.7F, 0.7F, 0.7F);
            $$0.a(0.0F, 1.0F, 0.0F);
         }

         this.c().d().a($$0);
         if ($$11 instanceof cpq && ((cpq)$$11).d() instanceof dbd) {
            float $$15 = 1.1875F;
            $$0.b(1.1875F, -1.1875F, -1.1875F);
            if ($$12) {
               $$0.a(0.0F, 0.0625F, 0.0F);
            }

            cup $$16 = $$10.a(jr.L);
            $$0.a(-0.5, 0.0, -0.5);
            dji.a $$17 = ((dbd)((cpq)$$11).d()).b();
            fss $$18 = this.d.get($$17);
            gaq $$19 = gcx.a($$17, $$16);
            brt $$21;
            if ($$3.cZ() instanceof bqt $$20) {
               $$21 = $$20.aT;
            } else {
               $$21 = $$3.aT;
            }

            float $$23 = $$21.c($$6);
            gcx.a(null, 180.0F, $$23, $$0, $$1, $$2, $$18, $$19);
         } else if (!($$11 instanceof cph $$24) || $$24.k() != bqh.f) {
            a($$0, $$12);
            this.e.a($$3, $$10, crp.f, false, $$0, $$1, $$2);
         }

         $$0.b();
      }
   }

   public static void a(ewr $$0, boolean $$1) {
      float $$2 = 0.625F;
      $$0.a(0.0F, -0.25F, 0.0F);
      $$0.a(a.d.rotationDegrees(180.0F));
      $$0.b(0.625F, -0.625F, -0.625F);
      if ($$1) {
         $$0.a(0.0F, 0.1875F, 0.0F);
      }
   }
}
