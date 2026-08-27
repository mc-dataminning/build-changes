import java.util.Calendar;

public class gcf<T extends dmf & dni> implements gbz<T> {
   private static final String a = "bottom";
   private static final String b = "lid";
   private static final String c = "lock";
   private final ftm d;
   private final ftm e;
   private final ftm f;
   private final ftm g;
   private final ftm h;
   private final ftm i;
   private final ftm j;
   private final ftm k;
   private final ftm l;
   private boolean m;

   public gcf(gca.a $$0) {
      Calendar $$1 = Calendar.getInstance();
      if ($$1.get(2) + 1 == 12 && $$1.get(5) >= 24 && $$1.get(5) <= 26) {
         this.m = true;
      }

      ftm $$2 = $$0.a(ftl.x);
      this.e = $$2.b("bottom");
      this.d = $$2.b("lid");
      this.f = $$2.b("lock");
      ftm $$3 = $$0.a(ftl.O);
      this.h = $$3.b("bottom");
      this.g = $$3.b("lid");
      this.i = $$3.b("lock");
      ftm $$4 = $$0.a(ftl.P);
      this.k = $$4.b("bottom");
      this.j = $$4.b("lid");
      this.l = $$4.b("lock");
   }

   public static fts b() {
      ftu $$0 = new ftu();
      ftv $$1 = $$0.a();
      $$1.a("bottom", ftr.c().a(0, 19).a(1.0F, 0.0F, 1.0F, 14.0F, 10.0F, 14.0F), fto.a);
      $$1.a("lid", ftr.c().a(0, 0).a(1.0F, 0.0F, 0.0F, 14.0F, 5.0F, 14.0F), fto.a(0.0F, 9.0F, 1.0F));
      $$1.a("lock", ftr.c().a(0, 0).a(7.0F, -2.0F, 14.0F, 2.0F, 4.0F, 1.0F), fto.a(0.0F, 9.0F, 1.0F));
      return fts.a($$0, 64, 64);
   }

   public static fts c() {
      ftu $$0 = new ftu();
      ftv $$1 = $$0.a();
      $$1.a("bottom", ftr.c().a(0, 19).a(1.0F, 0.0F, 1.0F, 15.0F, 10.0F, 14.0F), fto.a);
      $$1.a("lid", ftr.c().a(0, 0).a(1.0F, 0.0F, 0.0F, 15.0F, 5.0F, 14.0F), fto.a(0.0F, 9.0F, 1.0F));
      $$1.a("lock", ftr.c().a(0, 0).a(15.0F, -2.0F, 14.0F, 1.0F, 4.0F, 1.0F), fto.a(0.0F, 9.0F, 1.0F));
      return fts.a($$0, 64, 64);
   }

   public static fts d() {
      ftu $$0 = new ftu();
      ftv $$1 = $$0.a();
      $$1.a("bottom", ftr.c().a(0, 19).a(0.0F, 0.0F, 1.0F, 15.0F, 10.0F, 14.0F), fto.a);
      $$1.a("lid", ftr.c().a(0, 0).a(0.0F, 0.0F, 0.0F, 15.0F, 5.0F, 14.0F), fto.a(0.0F, 9.0F, 1.0F));
      $$1.a("lock", ftr.c().a(0, 0).a(0.0F, -2.0F, 14.0F, 1.0F, 4.0F, 1.0F), fto.a(0.0F, 9.0F, 1.0F));
      return fts.a($$0, 64, 64);
   }

   @Override
   public void a(T $$0, float $$1, ewi $$2, fzz $$3, int $$4, int $$5) {
      cyx $$6 = $$0.i();
      boolean $$7 = $$6 != null;
      doz $$8 = $$7 ? $$0.n() : dca.cv.n().a(ddb.c, ih.d);
      dpr $$9 = $$8.b(ddb.d) ? $$8.c(ddb.d) : dpr.a;
      if ($$8.b() instanceof das<?> $$11) {
         boolean $$12 = $$9 != dpr.a;
         $$2.a();
         float $$13 = $$8.c(ddb.c).p();
         $$2.a(0.5F, 0.5F, 0.5F);
         $$2.a(a.d.rotationDegrees(-$$13));
         $$2.a(-0.5F, -0.5F, -0.5F);
         def.c<? extends dmm> $$14;
         if ($$7) {
            $$14 = $$11.a($$8, $$6, $$0.aA_(), true);
         } else {
            $$14 = def.b::b;
         }

         float $$16 = $$14.apply(ddb.a($$0)).get($$1);
         $$16 = 1.0F - $$16;
         $$16 = 1.0F - $$16 * $$16 * $$16;
         int $$17 = $$14.apply(new gcc<>()).applyAsInt($$4);
         gnm $$18 = gao.a($$0, $$9, this.m);
         ewm $$19 = $$18.a($$3, gah::d);
         if ($$12) {
            if ($$9 == dpr.b) {
               this.a($$2, $$19, this.g, this.i, this.h, $$16, $$17, $$5);
            } else {
               this.a($$2, $$19, this.j, this.l, this.k, $$16, $$17, $$5);
            }
         } else {
            this.a($$2, $$19, this.d, this.f, this.e, $$16, $$17, $$5);
         }

         $$2.b();
      }
   }

   private void a(ewi $$0, ewm $$1, ftm $$2, ftm $$3, ftm $$4, float $$5, int $$6, int $$7) {
      $$2.e = -($$5 * (float) (Math.PI / 2));
      $$3.e = $$2.e;
      $$2.a($$0, $$1, $$6, $$7);
      $$3.a($$0, $$1, $$6, $$7);
      $$4.a($$0, $$1, $$6, $$7);
   }
}
