import java.util.Calendar;

public class fxs<T extends dit & djw> implements fxm<T> {
   private static final String a = "bottom";
   private static final String b = "lid";
   private static final String c = "lock";
   private final fpc d;
   private final fpc e;
   private final fpc f;
   private final fpc g;
   private final fpc h;
   private final fpc i;
   private final fpc j;
   private final fpc k;
   private final fpc l;
   private boolean m;

   public fxs(fxn.a $$0) {
      Calendar $$1 = Calendar.getInstance();
      if ($$1.get(2) + 1 == 12 && $$1.get(5) >= 24 && $$1.get(5) <= 26) {
         this.m = true;
      }

      fpc $$2 = $$0.a(fpb.t);
      this.e = $$2.b("bottom");
      this.d = $$2.b("lid");
      this.f = $$2.b("lock");
      fpc $$3 = $$0.a(fpb.K);
      this.h = $$3.b("bottom");
      this.g = $$3.b("lid");
      this.i = $$3.b("lock");
      fpc $$4 = $$0.a(fpb.L);
      this.k = $$4.b("bottom");
      this.j = $$4.b("lid");
      this.l = $$4.b("lock");
   }

   public static fpi b() {
      fpk $$0 = new fpk();
      fpl $$1 = $$0.a();
      $$1.a("bottom", fph.c().a(0, 19).a(1.0F, 0.0F, 1.0F, 14.0F, 10.0F, 14.0F), fpe.a);
      $$1.a("lid", fph.c().a(0, 0).a(1.0F, 0.0F, 0.0F, 14.0F, 5.0F, 14.0F), fpe.a(0.0F, 9.0F, 1.0F));
      $$1.a("lock", fph.c().a(0, 0).a(7.0F, -2.0F, 14.0F, 2.0F, 4.0F, 1.0F), fpe.a(0.0F, 9.0F, 1.0F));
      return fpi.a($$0, 64, 64);
   }

   public static fpi c() {
      fpk $$0 = new fpk();
      fpl $$1 = $$0.a();
      $$1.a("bottom", fph.c().a(0, 19).a(1.0F, 0.0F, 1.0F, 15.0F, 10.0F, 14.0F), fpe.a);
      $$1.a("lid", fph.c().a(0, 0).a(1.0F, 0.0F, 0.0F, 15.0F, 5.0F, 14.0F), fpe.a(0.0F, 9.0F, 1.0F));
      $$1.a("lock", fph.c().a(0, 0).a(15.0F, -2.0F, 14.0F, 1.0F, 4.0F, 1.0F), fpe.a(0.0F, 9.0F, 1.0F));
      return fpi.a($$0, 64, 64);
   }

   public static fpi d() {
      fpk $$0 = new fpk();
      fpl $$1 = $$0.a();
      $$1.a("bottom", fph.c().a(0, 19).a(0.0F, 0.0F, 1.0F, 15.0F, 10.0F, 14.0F), fpe.a);
      $$1.a("lid", fph.c().a(0, 0).a(0.0F, 0.0F, 0.0F, 15.0F, 5.0F, 14.0F), fpe.a(0.0F, 9.0F, 1.0F));
      $$1.a("lock", fph.c().a(0, 0).a(0.0F, -2.0F, 14.0F, 1.0F, 4.0F, 1.0F), fpe.a(0.0F, 9.0F, 1.0F));
      return fpi.a($$0, 64, 64);
   }

   @Override
   public void a(T $$0, float $$1, esa $$2, fvm $$3, int $$4, int $$5) {
      cvn $$6 = $$0.i();
      boolean $$7 = $$6 != null;
      dlf $$8 = $$7 ? $$0.r() : cyq.cv.o().a(czr.c, ie.d);
      dlx $$9 = $$8.b(czr.d) ? $$8.c(czr.d) : dlx.a;
      if ($$8.b() instanceof cxi<?> $$11) {
         boolean $$12 = $$9 != dlx.a;
         $$2.a();
         float $$13 = $$8.c(czr.c).p();
         $$2.a(0.5F, 0.5F, 0.5F);
         $$2.a(a.d.rotationDegrees(-$$13));
         $$2.a(-0.5F, -0.5F, -0.5F);
         dav.c<? extends dja> $$14;
         if ($$7) {
            $$14 = $$11.a($$8, $$6, $$0.aE_(), true);
         } else {
            $$14 = dav.b::b;
         }

         float $$16 = $$14.apply(czr.a($$0)).get($$1);
         $$16 = 1.0F - $$16;
         $$16 = 1.0F - $$16 * $$16 * $$16;
         int $$17 = $$14.apply(new fxp<>()).applyAsInt($$4);
         gix $$18 = fwb.a($$0, $$9, this.m);
         ese $$19 = $$18.a($$3, fvu::d);
         if ($$12) {
            if ($$9 == dlx.b) {
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

   private void a(esa $$0, ese $$1, fpc $$2, fpc $$3, fpc $$4, float $$5, int $$6, int $$7) {
      $$2.e = -($$5 * (float) (Math.PI / 2));
      $$3.e = $$2.e;
      $$2.a($$0, $$1, $$6, $$7);
      $$3.a($$0, $$1, $$6, $$7);
      $$4.a($$0, $$1, $$6, $$7);
   }
}
