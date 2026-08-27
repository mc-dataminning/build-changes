import java.util.Calendar;

public class fvn<T extends dgv & dhy> implements fvh<T> {
   private static final String a = "bottom";
   private static final String b = "lid";
   private static final String c = "lock";
   private final fmx d;
   private final fmx e;
   private final fmx f;
   private final fmx g;
   private final fmx h;
   private final fmx i;
   private final fmx j;
   private final fmx k;
   private final fmx l;
   private boolean m;

   public fvn(fvi.a $$0) {
      Calendar $$1 = Calendar.getInstance();
      if ($$1.get(2) + 1 == 12 && $$1.get(5) >= 24 && $$1.get(5) <= 26) {
         this.m = true;
      }

      fmx $$2 = $$0.a(fmw.u);
      this.e = $$2.b("bottom");
      this.d = $$2.b("lid");
      this.f = $$2.b("lock");
      fmx $$3 = $$0.a(fmw.L);
      this.h = $$3.b("bottom");
      this.g = $$3.b("lid");
      this.i = $$3.b("lock");
      fmx $$4 = $$0.a(fmw.M);
      this.k = $$4.b("bottom");
      this.j = $$4.b("lid");
      this.l = $$4.b("lock");
   }

   public static fnd b() {
      fnf $$0 = new fnf();
      fng $$1 = $$0.a();
      $$1.a("bottom", fnc.c().a(0, 19).a(1.0F, 0.0F, 1.0F, 14.0F, 10.0F, 14.0F), fmz.a);
      $$1.a("lid", fnc.c().a(0, 0).a(1.0F, 0.0F, 0.0F, 14.0F, 5.0F, 14.0F), fmz.a(0.0F, 9.0F, 1.0F));
      $$1.a("lock", fnc.c().a(0, 0).a(7.0F, -2.0F, 14.0F, 2.0F, 4.0F, 1.0F), fmz.a(0.0F, 9.0F, 1.0F));
      return fnd.a($$0, 64, 64);
   }

   public static fnd c() {
      fnf $$0 = new fnf();
      fng $$1 = $$0.a();
      $$1.a("bottom", fnc.c().a(0, 19).a(1.0F, 0.0F, 1.0F, 15.0F, 10.0F, 14.0F), fmz.a);
      $$1.a("lid", fnc.c().a(0, 0).a(1.0F, 0.0F, 0.0F, 15.0F, 5.0F, 14.0F), fmz.a(0.0F, 9.0F, 1.0F));
      $$1.a("lock", fnc.c().a(0, 0).a(15.0F, -2.0F, 14.0F, 1.0F, 4.0F, 1.0F), fmz.a(0.0F, 9.0F, 1.0F));
      return fnd.a($$0, 64, 64);
   }

   public static fnd d() {
      fnf $$0 = new fnf();
      fng $$1 = $$0.a();
      $$1.a("bottom", fnc.c().a(0, 19).a(0.0F, 0.0F, 1.0F, 15.0F, 10.0F, 14.0F), fmz.a);
      $$1.a("lid", fnc.c().a(0, 0).a(0.0F, 0.0F, 0.0F, 15.0F, 5.0F, 14.0F), fmz.a(0.0F, 9.0F, 1.0F));
      $$1.a("lock", fnc.c().a(0, 0).a(0.0F, -2.0F, 14.0F, 1.0F, 4.0F, 1.0F), fmz.a(0.0F, 9.0F, 1.0F));
      return fnd.a($$0, 64, 64);
   }

   @Override
   public void a(T $$0, float $$1, eqb $$2, fth $$3, int $$4, int $$5) {
      ctp $$6 = $$0.i();
      boolean $$7 = $$6 != null;
      djh $$8 = $$7 ? $$0.r() : cws.cv.o().a(cxt.c, ic.d);
      djz $$9 = $$8.b(cxt.d) ? $$8.c(cxt.d) : djz.a;
      if ($$8.b() instanceof cvk<?> $$11) {
         boolean $$12 = $$9 != djz.a;
         $$2.a();
         float $$13 = $$8.c(cxt.c).p();
         $$2.a(0.5F, 0.5F, 0.5F);
         $$2.a(a.d.rotationDegrees(-$$13));
         $$2.a(-0.5F, -0.5F, -0.5F);
         cyx.c<? extends dhc> $$14;
         if ($$7) {
            $$14 = $$11.a($$8, $$6, $$0.aB_(), true);
         } else {
            $$14 = cyx.b::b;
         }

         float $$16 = $$14.apply(cxt.a($$0)).get($$1);
         $$16 = 1.0F - $$16;
         $$16 = 1.0F - $$16 * $$16 * $$16;
         int $$17 = $$14.apply(new fvk<>()).applyAsInt($$4);
         ggq $$18 = ftw.a($$0, $$9, this.m);
         eqf $$19 = $$18.a($$3, ftp::d);
         if ($$12) {
            if ($$9 == djz.b) {
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

   private void a(eqb $$0, eqf $$1, fmx $$2, fmx $$3, fmx $$4, float $$5, int $$6, int $$7) {
      $$2.e = -($$5 * (float) (Math.PI / 2));
      $$3.e = $$2.e;
      $$2.a($$0, $$1, $$6, $$7);
      $$3.a($$0, $$1, $$6, $$7);
      $$4.a($$0, $$1, $$6, $$7);
   }
}
