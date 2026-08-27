import java.util.Calendar;

public class fvm<T extends dgu & dhx> implements fvg<T> {
   private static final String a = "bottom";
   private static final String b = "lid";
   private static final String c = "lock";
   private final fmw d;
   private final fmw e;
   private final fmw f;
   private final fmw g;
   private final fmw h;
   private final fmw i;
   private final fmw j;
   private final fmw k;
   private final fmw l;
   private boolean m;

   public fvm(fvh.a $$0) {
      Calendar $$1 = Calendar.getInstance();
      if ($$1.get(2) + 1 == 12 && $$1.get(5) >= 24 && $$1.get(5) <= 26) {
         this.m = true;
      }

      fmw $$2 = $$0.a(fmv.u);
      this.e = $$2.b("bottom");
      this.d = $$2.b("lid");
      this.f = $$2.b("lock");
      fmw $$3 = $$0.a(fmv.L);
      this.h = $$3.b("bottom");
      this.g = $$3.b("lid");
      this.i = $$3.b("lock");
      fmw $$4 = $$0.a(fmv.M);
      this.k = $$4.b("bottom");
      this.j = $$4.b("lid");
      this.l = $$4.b("lock");
   }

   public static fnc b() {
      fne $$0 = new fne();
      fnf $$1 = $$0.a();
      $$1.a("bottom", fnb.c().a(0, 19).a(1.0F, 0.0F, 1.0F, 14.0F, 10.0F, 14.0F), fmy.a);
      $$1.a("lid", fnb.c().a(0, 0).a(1.0F, 0.0F, 0.0F, 14.0F, 5.0F, 14.0F), fmy.a(0.0F, 9.0F, 1.0F));
      $$1.a("lock", fnb.c().a(0, 0).a(7.0F, -2.0F, 14.0F, 2.0F, 4.0F, 1.0F), fmy.a(0.0F, 9.0F, 1.0F));
      return fnc.a($$0, 64, 64);
   }

   public static fnc c() {
      fne $$0 = new fne();
      fnf $$1 = $$0.a();
      $$1.a("bottom", fnb.c().a(0, 19).a(1.0F, 0.0F, 1.0F, 15.0F, 10.0F, 14.0F), fmy.a);
      $$1.a("lid", fnb.c().a(0, 0).a(1.0F, 0.0F, 0.0F, 15.0F, 5.0F, 14.0F), fmy.a(0.0F, 9.0F, 1.0F));
      $$1.a("lock", fnb.c().a(0, 0).a(15.0F, -2.0F, 14.0F, 1.0F, 4.0F, 1.0F), fmy.a(0.0F, 9.0F, 1.0F));
      return fnc.a($$0, 64, 64);
   }

   public static fnc d() {
      fne $$0 = new fne();
      fnf $$1 = $$0.a();
      $$1.a("bottom", fnb.c().a(0, 19).a(0.0F, 0.0F, 1.0F, 15.0F, 10.0F, 14.0F), fmy.a);
      $$1.a("lid", fnb.c().a(0, 0).a(0.0F, 0.0F, 0.0F, 15.0F, 5.0F, 14.0F), fmy.a(0.0F, 9.0F, 1.0F));
      $$1.a("lock", fnb.c().a(0, 0).a(0.0F, -2.0F, 14.0F, 1.0F, 4.0F, 1.0F), fmy.a(0.0F, 9.0F, 1.0F));
      return fnc.a($$0, 64, 64);
   }

   @Override
   public void a(T $$0, float $$1, eqa $$2, ftg $$3, int $$4, int $$5) {
      cto $$6 = $$0.i();
      boolean $$7 = $$6 != null;
      djg $$8 = $$7 ? $$0.r() : cwr.cv.o().a(cxs.c, ic.d);
      djy $$9 = $$8.b(cxs.d) ? $$8.c(cxs.d) : djy.a;
      if ($$8.b() instanceof cvj<?> $$11) {
         boolean $$12 = $$9 != djy.a;
         $$2.a();
         float $$13 = $$8.c(cxs.c).p();
         $$2.a(0.5F, 0.5F, 0.5F);
         $$2.a(a.d.rotationDegrees(-$$13));
         $$2.a(-0.5F, -0.5F, -0.5F);
         cyw.c<? extends dhb> $$14;
         if ($$7) {
            $$14 = $$11.a($$8, $$6, $$0.aB_(), true);
         } else {
            $$14 = cyw.b::b;
         }

         float $$16 = $$14.apply(cxs.a($$0)).get($$1);
         $$16 = 1.0F - $$16;
         $$16 = 1.0F - $$16 * $$16 * $$16;
         int $$17 = $$14.apply(new fvj<>()).applyAsInt($$4);
         ggp $$18 = ftv.a($$0, $$9, this.m);
         eqe $$19 = $$18.a($$3, fto::d);
         if ($$12) {
            if ($$9 == djy.b) {
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

   private void a(eqa $$0, eqe $$1, fmw $$2, fmw $$3, fmw $$4, float $$5, int $$6, int $$7) {
      $$2.e = -($$5 * (float) (Math.PI / 2));
      $$3.e = $$2.e;
      $$2.a($$0, $$1, $$6, $$7);
      $$3.a($$0, $$1, $$6, $$7);
      $$4.a($$0, $$1, $$6, $$7);
   }
}
