import java.util.Calendar;

public class ggz<T extends dqf & drj> implements ggt<T> {
   private static final String a = "bottom";
   private static final String b = "lid";
   private static final String c = "lock";
   private final fye d;
   private final fye e;
   private final fye f;
   private final fye g;
   private final fye h;
   private final fye i;
   private final fye j;
   private final fye k;
   private final fye l;
   private boolean m;

   public ggz(ggu.a $$0) {
      Calendar $$1 = Calendar.getInstance();
      if ($$1.get(2) + 1 == 12 && $$1.get(5) >= 24 && $$1.get(5) <= 26) {
         this.m = true;
      }

      fye $$2 = $$0.a(fyd.y);
      this.e = $$2.b("bottom");
      this.d = $$2.b("lid");
      this.f = $$2.b("lock");
      fye $$3 = $$0.a(fyd.P);
      this.h = $$3.b("bottom");
      this.g = $$3.b("lid");
      this.i = $$3.b("lock");
      fye $$4 = $$0.a(fyd.Q);
      this.k = $$4.b("bottom");
      this.j = $$4.b("lid");
      this.l = $$4.b("lock");
   }

   public static fyk b() {
      fym $$0 = new fym();
      fyn $$1 = $$0.a();
      $$1.a("bottom", fyj.c().a(0, 19).a(1.0F, 0.0F, 1.0F, 14.0F, 10.0F, 14.0F), fyg.a);
      $$1.a("lid", fyj.c().a(0, 0).a(1.0F, 0.0F, 0.0F, 14.0F, 5.0F, 14.0F), fyg.a(0.0F, 9.0F, 1.0F));
      $$1.a("lock", fyj.c().a(0, 0).a(7.0F, -2.0F, 14.0F, 2.0F, 4.0F, 1.0F), fyg.a(0.0F, 9.0F, 1.0F));
      return fyk.a($$0, 64, 64);
   }

   public static fyk c() {
      fym $$0 = new fym();
      fyn $$1 = $$0.a();
      $$1.a("bottom", fyj.c().a(0, 19).a(1.0F, 0.0F, 1.0F, 15.0F, 10.0F, 14.0F), fyg.a);
      $$1.a("lid", fyj.c().a(0, 0).a(1.0F, 0.0F, 0.0F, 15.0F, 5.0F, 14.0F), fyg.a(0.0F, 9.0F, 1.0F));
      $$1.a("lock", fyj.c().a(0, 0).a(15.0F, -2.0F, 14.0F, 1.0F, 4.0F, 1.0F), fyg.a(0.0F, 9.0F, 1.0F));
      return fyk.a($$0, 64, 64);
   }

   public static fyk d() {
      fym $$0 = new fym();
      fyn $$1 = $$0.a();
      $$1.a("bottom", fyj.c().a(0, 19).a(0.0F, 0.0F, 1.0F, 15.0F, 10.0F, 14.0F), fyg.a);
      $$1.a("lid", fyj.c().a(0, 0).a(0.0F, 0.0F, 0.0F, 15.0F, 5.0F, 14.0F), fyg.a(0.0F, 9.0F, 1.0F));
      $$1.a("lock", fyj.c().a(0, 0).a(0.0F, -2.0F, 14.0F, 1.0F, 4.0F, 1.0F), fyg.a(0.0F, 9.0F, 1.0F));
      return fyk.a($$0, 64, 64);
   }

   @Override
   public void a(T $$0, float $$1, fbc $$2, get $$3, int $$4, int $$5) {
      dcu $$6 = $$0.i();
      boolean $$7 = $$6 != null;
      dta $$8 = $$7 ? $$0.n() : dfy.cv.o().a(dgz.c, ji.d);
      dts $$9 = $$8.b(dgz.d) ? $$8.c(dgz.d) : dts.a;
      if ($$8.b() instanceof deq<?> $$11) {
         boolean $$12 = $$9 != dts.a;
         $$2.a();
         float $$13 = $$8.c(dgz.c).p();
         $$2.a(0.5F, 0.5F, 0.5F);
         $$2.a(a.d.rotationDegrees(-$$13));
         $$2.a(-0.5F, -0.5F, -0.5F);
         did.c<? extends dqm> $$14;
         if ($$7) {
            $$14 = $$11.a($$8, $$6, $$0.az_(), true);
         } else {
            $$14 = did.b::b;
         }

         float $$16 = $$14.apply(dgz.a($$0)).get($$1);
         $$16 = 1.0F - $$16;
         $$16 = 1.0F - $$16 * $$16 * $$16;
         int $$17 = $$14.apply(new ggw<>()).applyAsInt($$4);
         gsj $$18 = gfi.a($$0, $$9, this.m);
         fbg $$19 = $$18.a($$3, gfb::d);
         if ($$12) {
            if ($$9 == dts.b) {
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

   private void a(fbc $$0, fbg $$1, fye $$2, fye $$3, fye $$4, float $$5, int $$6, int $$7) {
      $$2.e = -($$5 * (float) (Math.PI / 2));
      $$3.e = $$2.e;
      $$2.a($$0, $$1, $$6, $$7);
      $$3.a($$0, $$1, $$6, $$7);
      $$4.a($$0, $$1, $$6, $$7);
   }
}
