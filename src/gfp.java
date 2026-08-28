import java.util.Calendar;

public class gfp<T extends dpc & dqf> implements gfj<T> {
   private static final String a = "bottom";
   private static final String b = "lid";
   private static final String c = "lock";
   private final fwv d;
   private final fwv e;
   private final fwv f;
   private final fwv g;
   private final fwv h;
   private final fwv i;
   private final fwv j;
   private final fwv k;
   private final fwv l;
   private boolean m;

   public gfp(gfk.a $$0) {
      Calendar $$1 = Calendar.getInstance();
      if ($$1.get(2) + 1 == 12 && $$1.get(5) >= 24 && $$1.get(5) <= 26) {
         this.m = true;
      }

      fwv $$2 = $$0.a(fwu.x);
      this.e = $$2.b("bottom");
      this.d = $$2.b("lid");
      this.f = $$2.b("lock");
      fwv $$3 = $$0.a(fwu.O);
      this.h = $$3.b("bottom");
      this.g = $$3.b("lid");
      this.i = $$3.b("lock");
      fwv $$4 = $$0.a(fwu.P);
      this.k = $$4.b("bottom");
      this.j = $$4.b("lid");
      this.l = $$4.b("lock");
   }

   public static fxb b() {
      fxd $$0 = new fxd();
      fxe $$1 = $$0.a();
      $$1.a("bottom", fxa.c().a(0, 19).a(1.0F, 0.0F, 1.0F, 14.0F, 10.0F, 14.0F), fwx.a);
      $$1.a("lid", fxa.c().a(0, 0).a(1.0F, 0.0F, 0.0F, 14.0F, 5.0F, 14.0F), fwx.a(0.0F, 9.0F, 1.0F));
      $$1.a("lock", fxa.c().a(0, 0).a(7.0F, -2.0F, 14.0F, 2.0F, 4.0F, 1.0F), fwx.a(0.0F, 9.0F, 1.0F));
      return fxb.a($$0, 64, 64);
   }

   public static fxb c() {
      fxd $$0 = new fxd();
      fxe $$1 = $$0.a();
      $$1.a("bottom", fxa.c().a(0, 19).a(1.0F, 0.0F, 1.0F, 15.0F, 10.0F, 14.0F), fwx.a);
      $$1.a("lid", fxa.c().a(0, 0).a(1.0F, 0.0F, 0.0F, 15.0F, 5.0F, 14.0F), fwx.a(0.0F, 9.0F, 1.0F));
      $$1.a("lock", fxa.c().a(0, 0).a(15.0F, -2.0F, 14.0F, 1.0F, 4.0F, 1.0F), fwx.a(0.0F, 9.0F, 1.0F));
      return fxb.a($$0, 64, 64);
   }

   public static fxb d() {
      fxd $$0 = new fxd();
      fxe $$1 = $$0.a();
      $$1.a("bottom", fxa.c().a(0, 19).a(0.0F, 0.0F, 1.0F, 15.0F, 10.0F, 14.0F), fwx.a);
      $$1.a("lid", fxa.c().a(0, 0).a(0.0F, 0.0F, 0.0F, 15.0F, 5.0F, 14.0F), fwx.a(0.0F, 9.0F, 1.0F));
      $$1.a("lock", fxa.c().a(0, 0).a(0.0F, -2.0F, 14.0F, 1.0F, 4.0F, 1.0F), fwx.a(0.0F, 9.0F, 1.0F));
      return fxb.a($$0, 64, 64);
   }

   @Override
   public void a(T $$0, float $$1, ezt $$2, gdj $$3, int $$4, int $$5) {
      dbt $$6 = $$0.i();
      boolean $$7 = $$6 != null;
      drx $$8 = $$7 ? $$0.n() : dew.cv.n().a(dfx.c, je.d);
      dsp $$9 = $$8.b(dfx.d) ? $$8.c(dfx.d) : dsp.a;
      if ($$8.b() instanceof ddo<?> $$11) {
         boolean $$12 = $$9 != dsp.a;
         $$2.a();
         float $$13 = $$8.c(dfx.c).p();
         $$2.a(0.5F, 0.5F, 0.5F);
         $$2.a(a.d.rotationDegrees(-$$13));
         $$2.a(-0.5F, -0.5F, -0.5F);
         dhb.c<? extends dpj> $$14;
         if ($$7) {
            $$14 = $$11.a($$8, $$6, $$0.aA_(), true);
         } else {
            $$14 = dhb.b::b;
         }

         float $$16 = $$14.apply(dfx.a($$0)).get($$1);
         $$16 = 1.0F - $$16;
         $$16 = 1.0F - $$16 * $$16 * $$16;
         int $$17 = $$14.apply(new gfm<>()).applyAsInt($$4);
         gqy $$18 = gdy.a($$0, $$9, this.m);
         ezx $$19 = $$18.a($$3, gdr::d);
         if ($$12) {
            if ($$9 == dsp.b) {
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

   private void a(ezt $$0, ezx $$1, fwv $$2, fwv $$3, fwv $$4, float $$5, int $$6, int $$7) {
      $$2.e = -($$5 * (float) (Math.PI / 2));
      $$3.e = $$2.e;
      $$2.a($$0, $$1, $$6, $$7);
      $$3.a($$0, $$1, $$6, $$7);
      $$4.a($$0, $$1, $$6, $$7);
   }
}
