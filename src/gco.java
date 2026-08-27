import java.util.Calendar;

public class gco<T extends dmo & dnr> implements gci<T> {
   private static final String a = "bottom";
   private static final String b = "lid";
   private static final String c = "lock";
   private final ftv d;
   private final ftv e;
   private final ftv f;
   private final ftv g;
   private final ftv h;
   private final ftv i;
   private final ftv j;
   private final ftv k;
   private final ftv l;
   private boolean m;

   public gco(gcj.a $$0) {
      Calendar $$1 = Calendar.getInstance();
      if ($$1.get(2) + 1 == 12 && $$1.get(5) >= 24 && $$1.get(5) <= 26) {
         this.m = true;
      }

      ftv $$2 = $$0.a(ftu.x);
      this.e = $$2.b("bottom");
      this.d = $$2.b("lid");
      this.f = $$2.b("lock");
      ftv $$3 = $$0.a(ftu.O);
      this.h = $$3.b("bottom");
      this.g = $$3.b("lid");
      this.i = $$3.b("lock");
      ftv $$4 = $$0.a(ftu.P);
      this.k = $$4.b("bottom");
      this.j = $$4.b("lid");
      this.l = $$4.b("lock");
   }

   public static fub b() {
      fud $$0 = new fud();
      fue $$1 = $$0.a();
      $$1.a("bottom", fua.c().a(0, 19).a(1.0F, 0.0F, 1.0F, 14.0F, 10.0F, 14.0F), ftx.a);
      $$1.a("lid", fua.c().a(0, 0).a(1.0F, 0.0F, 0.0F, 14.0F, 5.0F, 14.0F), ftx.a(0.0F, 9.0F, 1.0F));
      $$1.a("lock", fua.c().a(0, 0).a(7.0F, -2.0F, 14.0F, 2.0F, 4.0F, 1.0F), ftx.a(0.0F, 9.0F, 1.0F));
      return fub.a($$0, 64, 64);
   }

   public static fub c() {
      fud $$0 = new fud();
      fue $$1 = $$0.a();
      $$1.a("bottom", fua.c().a(0, 19).a(1.0F, 0.0F, 1.0F, 15.0F, 10.0F, 14.0F), ftx.a);
      $$1.a("lid", fua.c().a(0, 0).a(1.0F, 0.0F, 0.0F, 15.0F, 5.0F, 14.0F), ftx.a(0.0F, 9.0F, 1.0F));
      $$1.a("lock", fua.c().a(0, 0).a(15.0F, -2.0F, 14.0F, 1.0F, 4.0F, 1.0F), ftx.a(0.0F, 9.0F, 1.0F));
      return fub.a($$0, 64, 64);
   }

   public static fub d() {
      fud $$0 = new fud();
      fue $$1 = $$0.a();
      $$1.a("bottom", fua.c().a(0, 19).a(0.0F, 0.0F, 1.0F, 15.0F, 10.0F, 14.0F), ftx.a);
      $$1.a("lid", fua.c().a(0, 0).a(0.0F, 0.0F, 0.0F, 15.0F, 5.0F, 14.0F), ftx.a(0.0F, 9.0F, 1.0F));
      $$1.a("lock", fua.c().a(0, 0).a(0.0F, -2.0F, 14.0F, 1.0F, 4.0F, 1.0F), ftx.a(0.0F, 9.0F, 1.0F));
      return fub.a($$0, 64, 64);
   }

   @Override
   public void a(T $$0, float $$1, ewr $$2, gai $$3, int $$4, int $$5) {
      czg $$6 = $$0.i();
      boolean $$7 = $$6 != null;
      dpi $$8 = $$7 ? $$0.n() : dcj.cv.n().a(ddk.c, ij.d);
      dqa $$9 = $$8.b(ddk.d) ? $$8.c(ddk.d) : dqa.a;
      if ($$8.b() instanceof dbb<?> $$11) {
         boolean $$12 = $$9 != dqa.a;
         $$2.a();
         float $$13 = $$8.c(ddk.c).p();
         $$2.a(0.5F, 0.5F, 0.5F);
         $$2.a(a.d.rotationDegrees(-$$13));
         $$2.a(-0.5F, -0.5F, -0.5F);
         deo.c<? extends dmv> $$14;
         if ($$7) {
            $$14 = $$11.a($$8, $$6, $$0.az_(), true);
         } else {
            $$14 = deo.b::b;
         }

         float $$16 = $$14.apply(ddk.a($$0)).get($$1);
         $$16 = 1.0F - $$16;
         $$16 = 1.0F - $$16 * $$16 * $$16;
         int $$17 = $$14.apply(new gcl<>()).applyAsInt($$4);
         gnv $$18 = gax.a($$0, $$9, this.m);
         ewv $$19 = $$18.a($$3, gaq::d);
         if ($$12) {
            if ($$9 == dqa.b) {
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

   private void a(ewr $$0, ewv $$1, ftv $$2, ftv $$3, ftv $$4, float $$5, int $$6, int $$7) {
      $$2.e = -($$5 * (float) (Math.PI / 2));
      $$3.e = $$2.e;
      $$2.a($$0, $$1, $$6, $$7);
      $$3.a($$0, $$1, $$6, $$7);
      $$4.a($$0, $$1, $$6, $$7);
   }
}
