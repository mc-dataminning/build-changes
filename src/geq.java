import java.util.Calendar;

public class geq<T extends dog & dpj> implements gek<T> {
   private static final String a = "bottom";
   private static final String b = "lid";
   private static final String c = "lock";
   private final fvw d;
   private final fvw e;
   private final fvw f;
   private final fvw g;
   private final fvw h;
   private final fvw i;
   private final fvw j;
   private final fvw k;
   private final fvw l;
   private boolean m;

   public geq(gel.a $$0) {
      Calendar $$1 = Calendar.getInstance();
      if ($$1.get(2) + 1 == 12 && $$1.get(5) >= 24 && $$1.get(5) <= 26) {
         this.m = true;
      }

      fvw $$2 = $$0.a(fvv.x);
      this.e = $$2.b("bottom");
      this.d = $$2.b("lid");
      this.f = $$2.b("lock");
      fvw $$3 = $$0.a(fvv.O);
      this.h = $$3.b("bottom");
      this.g = $$3.b("lid");
      this.i = $$3.b("lock");
      fvw $$4 = $$0.a(fvv.P);
      this.k = $$4.b("bottom");
      this.j = $$4.b("lid");
      this.l = $$4.b("lock");
   }

   public static fwc b() {
      fwe $$0 = new fwe();
      fwf $$1 = $$0.a();
      $$1.a("bottom", fwb.c().a(0, 19).a(1.0F, 0.0F, 1.0F, 14.0F, 10.0F, 14.0F), fvy.a);
      $$1.a("lid", fwb.c().a(0, 0).a(1.0F, 0.0F, 0.0F, 14.0F, 5.0F, 14.0F), fvy.a(0.0F, 9.0F, 1.0F));
      $$1.a("lock", fwb.c().a(0, 0).a(7.0F, -2.0F, 14.0F, 2.0F, 4.0F, 1.0F), fvy.a(0.0F, 9.0F, 1.0F));
      return fwc.a($$0, 64, 64);
   }

   public static fwc c() {
      fwe $$0 = new fwe();
      fwf $$1 = $$0.a();
      $$1.a("bottom", fwb.c().a(0, 19).a(1.0F, 0.0F, 1.0F, 15.0F, 10.0F, 14.0F), fvy.a);
      $$1.a("lid", fwb.c().a(0, 0).a(1.0F, 0.0F, 0.0F, 15.0F, 5.0F, 14.0F), fvy.a(0.0F, 9.0F, 1.0F));
      $$1.a("lock", fwb.c().a(0, 0).a(15.0F, -2.0F, 14.0F, 1.0F, 4.0F, 1.0F), fvy.a(0.0F, 9.0F, 1.0F));
      return fwc.a($$0, 64, 64);
   }

   public static fwc d() {
      fwe $$0 = new fwe();
      fwf $$1 = $$0.a();
      $$1.a("bottom", fwb.c().a(0, 19).a(0.0F, 0.0F, 1.0F, 15.0F, 10.0F, 14.0F), fvy.a);
      $$1.a("lid", fwb.c().a(0, 0).a(0.0F, 0.0F, 0.0F, 15.0F, 5.0F, 14.0F), fvy.a(0.0F, 9.0F, 1.0F));
      $$1.a("lock", fwb.c().a(0, 0).a(0.0F, -2.0F, 14.0F, 1.0F, 4.0F, 1.0F), fvy.a(0.0F, 9.0F, 1.0F));
      return fwc.a($$0, 64, 64);
   }

   @Override
   public void a(T $$0, float $$1, eys $$2, gck $$3, int $$4, int $$5) {
      dax $$6 = $$0.i();
      boolean $$7 = $$6 != null;
      drb $$8 = $$7 ? $$0.n() : dea.cv.n().a(dfb.c, it.d);
      drt $$9 = $$8.b(dfb.d) ? $$8.c(dfb.d) : drt.a;
      if ($$8.b() instanceof dcs<?> $$11) {
         boolean $$12 = $$9 != drt.a;
         $$2.a();
         float $$13 = $$8.c(dfb.c).p();
         $$2.a(0.5F, 0.5F, 0.5F);
         $$2.a(a.d.rotationDegrees(-$$13));
         $$2.a(-0.5F, -0.5F, -0.5F);
         dgf.c<? extends don> $$14;
         if ($$7) {
            $$14 = $$11.a($$8, $$6, $$0.az_(), true);
         } else {
            $$14 = dgf.b::b;
         }

         float $$16 = $$14.apply(dfb.a($$0)).get($$1);
         $$16 = 1.0F - $$16;
         $$16 = 1.0F - $$16 * $$16 * $$16;
         int $$17 = $$14.apply(new gen<>()).applyAsInt($$4);
         gpz $$18 = gcz.a($$0, $$9, this.m);
         eyw $$19 = $$18.a($$3, gcs::d);
         if ($$12) {
            if ($$9 == drt.b) {
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

   private void a(eys $$0, eyw $$1, fvw $$2, fvw $$3, fvw $$4, float $$5, int $$6, int $$7) {
      $$2.e = -($$5 * (float) (Math.PI / 2));
      $$3.e = $$2.e;
      $$2.a($$0, $$1, $$6, $$7);
      $$3.a($$0, $$1, $$6, $$7);
      $$4.a($$0, $$1, $$6, $$7);
   }
}
