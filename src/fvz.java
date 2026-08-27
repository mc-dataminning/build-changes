import java.util.Calendar;

public class fvz<T extends dhd & dig> implements fvt<T> {
   private static final String a = "bottom";
   private static final String b = "lid";
   private static final String c = "lock";
   private final fnj d;
   private final fnj e;
   private final fnj f;
   private final fnj g;
   private final fnj h;
   private final fnj i;
   private final fnj j;
   private final fnj k;
   private final fnj l;
   private boolean m;

   public fvz(fvu.a $$0) {
      Calendar $$1 = Calendar.getInstance();
      if ($$1.get(2) + 1 == 12 && $$1.get(5) >= 24 && $$1.get(5) <= 26) {
         this.m = true;
      }

      fnj $$2 = $$0.a(fni.t);
      this.e = $$2.b("bottom");
      this.d = $$2.b("lid");
      this.f = $$2.b("lock");
      fnj $$3 = $$0.a(fni.K);
      this.h = $$3.b("bottom");
      this.g = $$3.b("lid");
      this.i = $$3.b("lock");
      fnj $$4 = $$0.a(fni.L);
      this.k = $$4.b("bottom");
      this.j = $$4.b("lid");
      this.l = $$4.b("lock");
   }

   public static fnp b() {
      fnr $$0 = new fnr();
      fns $$1 = $$0.a();
      $$1.a("bottom", fno.c().a(0, 19).a(1.0F, 0.0F, 1.0F, 14.0F, 10.0F, 14.0F), fnl.a);
      $$1.a("lid", fno.c().a(0, 0).a(1.0F, 0.0F, 0.0F, 14.0F, 5.0F, 14.0F), fnl.a(0.0F, 9.0F, 1.0F));
      $$1.a("lock", fno.c().a(0, 0).a(7.0F, -2.0F, 14.0F, 2.0F, 4.0F, 1.0F), fnl.a(0.0F, 9.0F, 1.0F));
      return fnp.a($$0, 64, 64);
   }

   public static fnp c() {
      fnr $$0 = new fnr();
      fns $$1 = $$0.a();
      $$1.a("bottom", fno.c().a(0, 19).a(1.0F, 0.0F, 1.0F, 15.0F, 10.0F, 14.0F), fnl.a);
      $$1.a("lid", fno.c().a(0, 0).a(1.0F, 0.0F, 0.0F, 15.0F, 5.0F, 14.0F), fnl.a(0.0F, 9.0F, 1.0F));
      $$1.a("lock", fno.c().a(0, 0).a(15.0F, -2.0F, 14.0F, 1.0F, 4.0F, 1.0F), fnl.a(0.0F, 9.0F, 1.0F));
      return fnp.a($$0, 64, 64);
   }

   public static fnp d() {
      fnr $$0 = new fnr();
      fns $$1 = $$0.a();
      $$1.a("bottom", fno.c().a(0, 19).a(0.0F, 0.0F, 1.0F, 15.0F, 10.0F, 14.0F), fnl.a);
      $$1.a("lid", fno.c().a(0, 0).a(0.0F, 0.0F, 0.0F, 15.0F, 5.0F, 14.0F), fnl.a(0.0F, 9.0F, 1.0F));
      $$1.a("lock", fno.c().a(0, 0).a(0.0F, -2.0F, 14.0F, 1.0F, 4.0F, 1.0F), fnl.a(0.0F, 9.0F, 1.0F));
      return fnp.a($$0, 64, 64);
   }

   @Override
   public void a(T $$0, float $$1, eqk $$2, ftt $$3, int $$4, int $$5) {
      ctx $$6 = $$0.i();
      boolean $$7 = $$6 != null;
      djp $$8 = $$7 ? $$0.r() : cxa.cv.o().a(cyb.c, ic.d);
      dkh $$9 = $$8.b(cyb.d) ? $$8.c(cyb.d) : dkh.a;
      if ($$8.b() instanceof cvs<?> $$11) {
         boolean $$12 = $$9 != dkh.a;
         $$2.a();
         float $$13 = $$8.c(cyb.c).p();
         $$2.a(0.5F, 0.5F, 0.5F);
         $$2.a(a.d.rotationDegrees(-$$13));
         $$2.a(-0.5F, -0.5F, -0.5F);
         czf.c<? extends dhk> $$14;
         if ($$7) {
            $$14 = $$11.a($$8, $$6, $$0.aE_(), true);
         } else {
            $$14 = czf.b::b;
         }

         float $$16 = $$14.apply(cyb.a($$0)).get($$1);
         $$16 = 1.0F - $$16;
         $$16 = 1.0F - $$16 * $$16 * $$16;
         int $$17 = $$14.apply(new fvw<>()).applyAsInt($$4);
         ghe $$18 = fui.a($$0, $$9, this.m);
         eqo $$19 = $$18.a($$3, fub::d);
         if ($$12) {
            if ($$9 == dkh.b) {
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

   private void a(eqk $$0, eqo $$1, fnj $$2, fnj $$3, fnj $$4, float $$5, int $$6, int $$7) {
      $$2.e = -($$5 * (float) (Math.PI / 2));
      $$3.e = $$2.e;
      $$2.a($$0, $$1, $$6, $$7);
      $$3.a($$0, $$1, $$6, $$7);
      $$4.a($$0, $$1, $$6, $$7);
   }
}
