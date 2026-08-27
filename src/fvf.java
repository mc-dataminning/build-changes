import java.util.Calendar;

public class fvf<T extends dgo & dhr> implements fuz<T> {
   private static final String a = "bottom";
   private static final String b = "lid";
   private static final String c = "lock";
   private final fmp d;
   private final fmp e;
   private final fmp f;
   private final fmp g;
   private final fmp h;
   private final fmp i;
   private final fmp j;
   private final fmp k;
   private final fmp l;
   private boolean m;

   public fvf(fva.a $$0) {
      Calendar $$1 = Calendar.getInstance();
      if ($$1.get(2) + 1 == 12 && $$1.get(5) >= 24 && $$1.get(5) <= 26) {
         this.m = true;
      }

      fmp $$2 = $$0.a(fmo.u);
      this.e = $$2.b("bottom");
      this.d = $$2.b("lid");
      this.f = $$2.b("lock");
      fmp $$3 = $$0.a(fmo.L);
      this.h = $$3.b("bottom");
      this.g = $$3.b("lid");
      this.i = $$3.b("lock");
      fmp $$4 = $$0.a(fmo.M);
      this.k = $$4.b("bottom");
      this.j = $$4.b("lid");
      this.l = $$4.b("lock");
   }

   public static fmv b() {
      fmx $$0 = new fmx();
      fmy $$1 = $$0.a();
      $$1.a("bottom", fmu.c().a(0, 19).a(1.0F, 0.0F, 1.0F, 14.0F, 10.0F, 14.0F), fmr.a);
      $$1.a("lid", fmu.c().a(0, 0).a(1.0F, 0.0F, 0.0F, 14.0F, 5.0F, 14.0F), fmr.a(0.0F, 9.0F, 1.0F));
      $$1.a("lock", fmu.c().a(0, 0).a(7.0F, -2.0F, 14.0F, 2.0F, 4.0F, 1.0F), fmr.a(0.0F, 9.0F, 1.0F));
      return fmv.a($$0, 64, 64);
   }

   public static fmv c() {
      fmx $$0 = new fmx();
      fmy $$1 = $$0.a();
      $$1.a("bottom", fmu.c().a(0, 19).a(1.0F, 0.0F, 1.0F, 15.0F, 10.0F, 14.0F), fmr.a);
      $$1.a("lid", fmu.c().a(0, 0).a(1.0F, 0.0F, 0.0F, 15.0F, 5.0F, 14.0F), fmr.a(0.0F, 9.0F, 1.0F));
      $$1.a("lock", fmu.c().a(0, 0).a(15.0F, -2.0F, 14.0F, 1.0F, 4.0F, 1.0F), fmr.a(0.0F, 9.0F, 1.0F));
      return fmv.a($$0, 64, 64);
   }

   public static fmv d() {
      fmx $$0 = new fmx();
      fmy $$1 = $$0.a();
      $$1.a("bottom", fmu.c().a(0, 19).a(0.0F, 0.0F, 1.0F, 15.0F, 10.0F, 14.0F), fmr.a);
      $$1.a("lid", fmu.c().a(0, 0).a(0.0F, 0.0F, 0.0F, 15.0F, 5.0F, 14.0F), fmr.a(0.0F, 9.0F, 1.0F));
      $$1.a("lock", fmu.c().a(0, 0).a(0.0F, -2.0F, 14.0F, 1.0F, 4.0F, 1.0F), fmr.a(0.0F, 9.0F, 1.0F));
      return fmv.a($$0, 64, 64);
   }

   @Override
   public void a(T $$0, float $$1, ept $$2, fsz $$3, int $$4, int $$5) {
      cti $$6 = $$0.i();
      boolean $$7 = $$6 != null;
      dja $$8 = $$7 ? $$0.r() : cwl.cv.o().a(cxm.c, ic.d);
      djs $$9 = $$8.b(cxm.d) ? $$8.c(cxm.d) : djs.a;
      if ($$8.b() instanceof cvd<?> $$11) {
         boolean $$12 = $$9 != djs.a;
         $$2.a();
         float $$13 = $$8.c(cxm.c).p();
         $$2.a(0.5F, 0.5F, 0.5F);
         $$2.a(a.d.rotationDegrees(-$$13));
         $$2.a(-0.5F, -0.5F, -0.5F);
         cyq.c<? extends dgv> $$14;
         if ($$7) {
            $$14 = $$11.a($$8, $$6, $$0.aB_(), true);
         } else {
            $$14 = cyq.b::b;
         }

         float $$16 = $$14.apply(cxm.a($$0)).get($$1);
         $$16 = 1.0F - $$16;
         $$16 = 1.0F - $$16 * $$16 * $$16;
         int $$17 = $$14.apply(new fvc<>()).applyAsInt($$4);
         ggj $$18 = fto.a($$0, $$9, this.m);
         epx $$19 = $$18.a($$3, fth::d);
         if ($$12) {
            if ($$9 == djs.b) {
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

   private void a(ept $$0, epx $$1, fmp $$2, fmp $$3, fmp $$4, float $$5, int $$6, int $$7) {
      $$2.e = -($$5 * (float) (Math.PI / 2));
      $$3.e = $$2.e;
      $$2.a($$0, $$1, $$6, $$7);
      $$3.a($$0, $$1, $$6, $$7);
      $$4.a($$0, $$1, $$6, $$7);
   }
}
