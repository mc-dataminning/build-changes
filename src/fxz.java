import java.util.Calendar;

public class fxz<T extends dix & dka> implements fxt<T> {
   private static final String a = "bottom";
   private static final String b = "lid";
   private static final String c = "lock";
   private final fpj d;
   private final fpj e;
   private final fpj f;
   private final fpj g;
   private final fpj h;
   private final fpj i;
   private final fpj j;
   private final fpj k;
   private final fpj l;
   private boolean m;

   public fxz(fxu.a $$0) {
      Calendar $$1 = Calendar.getInstance();
      if ($$1.get(2) + 1 == 12 && $$1.get(5) >= 24 && $$1.get(5) <= 26) {
         this.m = true;
      }

      fpj $$2 = $$0.a(fpi.t);
      this.e = $$2.b("bottom");
      this.d = $$2.b("lid");
      this.f = $$2.b("lock");
      fpj $$3 = $$0.a(fpi.K);
      this.h = $$3.b("bottom");
      this.g = $$3.b("lid");
      this.i = $$3.b("lock");
      fpj $$4 = $$0.a(fpi.L);
      this.k = $$4.b("bottom");
      this.j = $$4.b("lid");
      this.l = $$4.b("lock");
   }

   public static fpp b() {
      fpr $$0 = new fpr();
      fps $$1 = $$0.a();
      $$1.a("bottom", fpo.c().a(0, 19).a(1.0F, 0.0F, 1.0F, 14.0F, 10.0F, 14.0F), fpl.a);
      $$1.a("lid", fpo.c().a(0, 0).a(1.0F, 0.0F, 0.0F, 14.0F, 5.0F, 14.0F), fpl.a(0.0F, 9.0F, 1.0F));
      $$1.a("lock", fpo.c().a(0, 0).a(7.0F, -2.0F, 14.0F, 2.0F, 4.0F, 1.0F), fpl.a(0.0F, 9.0F, 1.0F));
      return fpp.a($$0, 64, 64);
   }

   public static fpp c() {
      fpr $$0 = new fpr();
      fps $$1 = $$0.a();
      $$1.a("bottom", fpo.c().a(0, 19).a(1.0F, 0.0F, 1.0F, 15.0F, 10.0F, 14.0F), fpl.a);
      $$1.a("lid", fpo.c().a(0, 0).a(1.0F, 0.0F, 0.0F, 15.0F, 5.0F, 14.0F), fpl.a(0.0F, 9.0F, 1.0F));
      $$1.a("lock", fpo.c().a(0, 0).a(15.0F, -2.0F, 14.0F, 1.0F, 4.0F, 1.0F), fpl.a(0.0F, 9.0F, 1.0F));
      return fpp.a($$0, 64, 64);
   }

   public static fpp d() {
      fpr $$0 = new fpr();
      fps $$1 = $$0.a();
      $$1.a("bottom", fpo.c().a(0, 19).a(0.0F, 0.0F, 1.0F, 15.0F, 10.0F, 14.0F), fpl.a);
      $$1.a("lid", fpo.c().a(0, 0).a(0.0F, 0.0F, 0.0F, 15.0F, 5.0F, 14.0F), fpl.a(0.0F, 9.0F, 1.0F));
      $$1.a("lock", fpo.c().a(0, 0).a(0.0F, -2.0F, 14.0F, 1.0F, 4.0F, 1.0F), fpl.a(0.0F, 9.0F, 1.0F));
      return fpp.a($$0, 64, 64);
   }

   @Override
   public void a(T $$0, float $$1, esh $$2, fvt $$3, int $$4, int $$5) {
      cvr $$6 = $$0.i();
      boolean $$7 = $$6 != null;
      dlj $$8 = $$7 ? $$0.r() : cyu.cv.o().a(czv.c, ie.d);
      dmb $$9 = $$8.b(czv.d) ? $$8.c(czv.d) : dmb.a;
      if ($$8.b() instanceof cxm<?> $$11) {
         boolean $$12 = $$9 != dmb.a;
         $$2.a();
         float $$13 = $$8.c(czv.c).p();
         $$2.a(0.5F, 0.5F, 0.5F);
         $$2.a(a.d.rotationDegrees(-$$13));
         $$2.a(-0.5F, -0.5F, -0.5F);
         daz.c<? extends dje> $$14;
         if ($$7) {
            $$14 = $$11.a($$8, $$6, $$0.aE_(), true);
         } else {
            $$14 = daz.b::b;
         }

         float $$16 = $$14.apply(czv.a($$0)).get($$1);
         $$16 = 1.0F - $$16;
         $$16 = 1.0F - $$16 * $$16 * $$16;
         int $$17 = $$14.apply(new fxw<>()).applyAsInt($$4);
         gje $$18 = fwi.a($$0, $$9, this.m);
         esl $$19 = $$18.a($$3, fwb::d);
         if ($$12) {
            if ($$9 == dmb.b) {
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

   private void a(esh $$0, esl $$1, fpj $$2, fpj $$3, fpj $$4, float $$5, int $$6, int $$7) {
      $$2.e = -($$5 * (float) (Math.PI / 2));
      $$3.e = $$2.e;
      $$2.a($$0, $$1, $$6, $$7);
      $$3.a($$0, $$1, $$6, $$7);
      $$4.a($$0, $$1, $$6, $$7);
   }
}
