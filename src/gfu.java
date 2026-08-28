import java.util.Calendar;

public class gfu<T extends dph & dqk> implements gfo<T> {
   private static final String a = "bottom";
   private static final String b = "lid";
   private static final String c = "lock";
   private final fxa d;
   private final fxa e;
   private final fxa f;
   private final fxa g;
   private final fxa h;
   private final fxa i;
   private final fxa j;
   private final fxa k;
   private final fxa l;
   private boolean m;

   public gfu(gfp.a $$0) {
      Calendar $$1 = Calendar.getInstance();
      if ($$1.get(2) + 1 == 12 && $$1.get(5) >= 24 && $$1.get(5) <= 26) {
         this.m = true;
      }

      fxa $$2 = $$0.a(fwz.x);
      this.e = $$2.b("bottom");
      this.d = $$2.b("lid");
      this.f = $$2.b("lock");
      fxa $$3 = $$0.a(fwz.O);
      this.h = $$3.b("bottom");
      this.g = $$3.b("lid");
      this.i = $$3.b("lock");
      fxa $$4 = $$0.a(fwz.P);
      this.k = $$4.b("bottom");
      this.j = $$4.b("lid");
      this.l = $$4.b("lock");
   }

   public static fxg b() {
      fxi $$0 = new fxi();
      fxj $$1 = $$0.a();
      $$1.a("bottom", fxf.c().a(0, 19).a(1.0F, 0.0F, 1.0F, 14.0F, 10.0F, 14.0F), fxc.a);
      $$1.a("lid", fxf.c().a(0, 0).a(1.0F, 0.0F, 0.0F, 14.0F, 5.0F, 14.0F), fxc.a(0.0F, 9.0F, 1.0F));
      $$1.a("lock", fxf.c().a(0, 0).a(7.0F, -2.0F, 14.0F, 2.0F, 4.0F, 1.0F), fxc.a(0.0F, 9.0F, 1.0F));
      return fxg.a($$0, 64, 64);
   }

   public static fxg c() {
      fxi $$0 = new fxi();
      fxj $$1 = $$0.a();
      $$1.a("bottom", fxf.c().a(0, 19).a(1.0F, 0.0F, 1.0F, 15.0F, 10.0F, 14.0F), fxc.a);
      $$1.a("lid", fxf.c().a(0, 0).a(1.0F, 0.0F, 0.0F, 15.0F, 5.0F, 14.0F), fxc.a(0.0F, 9.0F, 1.0F));
      $$1.a("lock", fxf.c().a(0, 0).a(15.0F, -2.0F, 14.0F, 1.0F, 4.0F, 1.0F), fxc.a(0.0F, 9.0F, 1.0F));
      return fxg.a($$0, 64, 64);
   }

   public static fxg d() {
      fxi $$0 = new fxi();
      fxj $$1 = $$0.a();
      $$1.a("bottom", fxf.c().a(0, 19).a(0.0F, 0.0F, 1.0F, 15.0F, 10.0F, 14.0F), fxc.a);
      $$1.a("lid", fxf.c().a(0, 0).a(0.0F, 0.0F, 0.0F, 15.0F, 5.0F, 14.0F), fxc.a(0.0F, 9.0F, 1.0F));
      $$1.a("lock", fxf.c().a(0, 0).a(0.0F, -2.0F, 14.0F, 1.0F, 4.0F, 1.0F), fxc.a(0.0F, 9.0F, 1.0F));
      return fxg.a($$0, 64, 64);
   }

   @Override
   public void a(T $$0, float $$1, ezy $$2, gdo $$3, int $$4, int $$5) {
      dby $$6 = $$0.i();
      boolean $$7 = $$6 != null;
      dsc $$8 = $$7 ? $$0.n() : dfb.cv.o().a(dgc.c, je.d);
      dsu $$9 = $$8.b(dgc.d) ? $$8.c(dgc.d) : dsu.a;
      if ($$8.b() instanceof ddt<?> $$11) {
         boolean $$12 = $$9 != dsu.a;
         $$2.a();
         float $$13 = $$8.c(dgc.c).p();
         $$2.a(0.5F, 0.5F, 0.5F);
         $$2.a(a.d.rotationDegrees(-$$13));
         $$2.a(-0.5F, -0.5F, -0.5F);
         dhg.c<? extends dpo> $$14;
         if ($$7) {
            $$14 = $$11.a($$8, $$6, $$0.ay_(), true);
         } else {
            $$14 = dhg.b::b;
         }

         float $$16 = $$14.apply(dgc.a($$0)).get($$1);
         $$16 = 1.0F - $$16;
         $$16 = 1.0F - $$16 * $$16 * $$16;
         int $$17 = $$14.apply(new gfr<>()).applyAsInt($$4);
         grd $$18 = ged.a($$0, $$9, this.m);
         fac $$19 = $$18.a($$3, gdw::d);
         if ($$12) {
            if ($$9 == dsu.b) {
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

   private void a(ezy $$0, fac $$1, fxa $$2, fxa $$3, fxa $$4, float $$5, int $$6, int $$7) {
      $$2.e = -($$5 * (float) (Math.PI / 2));
      $$3.e = $$2.e;
      $$2.a($$0, $$1, $$6, $$7);
      $$3.a($$0, $$1, $$6, $$7);
      $$4.a($$0, $$1, $$6, $$7);
   }
}
