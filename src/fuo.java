import java.util.Calendar;

public class fuo<T extends dgd & dhg> implements fui<T> {
   private static final String a = "bottom";
   private static final String b = "lid";
   private static final String c = "lock";
   private final fly d;
   private final fly e;
   private final fly f;
   private final fly g;
   private final fly h;
   private final fly i;
   private final fly j;
   private final fly k;
   private final fly l;
   private boolean m;

   public fuo(fuj.a $$0) {
      Calendar $$1 = Calendar.getInstance();
      if ($$1.get(2) + 1 == 12 && $$1.get(5) >= 24 && $$1.get(5) <= 26) {
         this.m = true;
      }

      fly $$2 = $$0.a(flx.u);
      this.e = $$2.b("bottom");
      this.d = $$2.b("lid");
      this.f = $$2.b("lock");
      fly $$3 = $$0.a(flx.L);
      this.h = $$3.b("bottom");
      this.g = $$3.b("lid");
      this.i = $$3.b("lock");
      fly $$4 = $$0.a(flx.M);
      this.k = $$4.b("bottom");
      this.j = $$4.b("lid");
      this.l = $$4.b("lock");
   }

   public static fme b() {
      fmg $$0 = new fmg();
      fmh $$1 = $$0.a();
      $$1.a("bottom", fmd.c().a(0, 19).a(1.0F, 0.0F, 1.0F, 14.0F, 10.0F, 14.0F), fma.a);
      $$1.a("lid", fmd.c().a(0, 0).a(1.0F, 0.0F, 0.0F, 14.0F, 5.0F, 14.0F), fma.a(0.0F, 9.0F, 1.0F));
      $$1.a("lock", fmd.c().a(0, 0).a(7.0F, -2.0F, 14.0F, 2.0F, 4.0F, 1.0F), fma.a(0.0F, 9.0F, 1.0F));
      return fme.a($$0, 64, 64);
   }

   public static fme c() {
      fmg $$0 = new fmg();
      fmh $$1 = $$0.a();
      $$1.a("bottom", fmd.c().a(0, 19).a(1.0F, 0.0F, 1.0F, 15.0F, 10.0F, 14.0F), fma.a);
      $$1.a("lid", fmd.c().a(0, 0).a(1.0F, 0.0F, 0.0F, 15.0F, 5.0F, 14.0F), fma.a(0.0F, 9.0F, 1.0F));
      $$1.a("lock", fmd.c().a(0, 0).a(15.0F, -2.0F, 14.0F, 1.0F, 4.0F, 1.0F), fma.a(0.0F, 9.0F, 1.0F));
      return fme.a($$0, 64, 64);
   }

   public static fme d() {
      fmg $$0 = new fmg();
      fmh $$1 = $$0.a();
      $$1.a("bottom", fmd.c().a(0, 19).a(0.0F, 0.0F, 1.0F, 15.0F, 10.0F, 14.0F), fma.a);
      $$1.a("lid", fmd.c().a(0, 0).a(0.0F, 0.0F, 0.0F, 15.0F, 5.0F, 14.0F), fma.a(0.0F, 9.0F, 1.0F));
      $$1.a("lock", fmd.c().a(0, 0).a(0.0F, -2.0F, 14.0F, 1.0F, 4.0F, 1.0F), fma.a(0.0F, 9.0F, 1.0F));
      return fme.a($$0, 64, 64);
   }

   @Override
   public void a(T $$0, float $$1, epd $$2, fsi $$3, int $$4, int $$5) {
      csy $$6 = $$0.i();
      boolean $$7 = $$6 != null;
      dip $$8 = $$7 ? $$0.r() : cwb.cv.o().a(cxc.c, ia.d);
      djh $$9 = $$8.b(cxc.d) ? $$8.c(cxc.d) : djh.a;
      if ($$8.b() instanceof cut<?> $$11) {
         boolean $$12 = $$9 != djh.a;
         $$2.a();
         float $$13 = $$8.c(cxc.c).p();
         $$2.a(0.5F, 0.5F, 0.5F);
         $$2.a(a.d.rotationDegrees(-$$13));
         $$2.a(-0.5F, -0.5F, -0.5F);
         cyg.c<? extends dgk> $$14;
         if ($$7) {
            $$14 = $$11.a($$8, $$6, $$0.aB_(), true);
         } else {
            $$14 = cyg.b::b;
         }

         float $$16 = $$14.apply(cxc.a($$0)).get($$1);
         $$16 = 1.0F - $$16;
         $$16 = 1.0F - $$16 * $$16 * $$16;
         int $$17 = $$14.apply(new ful<>()).applyAsInt($$4);
         gfs $$18 = fsx.a($$0, $$9, this.m);
         eph $$19 = $$18.a($$3, fsq::d);
         if ($$12) {
            if ($$9 == djh.b) {
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

   private void a(epd $$0, eph $$1, fly $$2, fly $$3, fly $$4, float $$5, int $$6, int $$7) {
      $$2.e = -($$5 * (float) (Math.PI / 2));
      $$3.e = $$2.e;
      $$2.a($$0, $$1, $$6, $$7);
      $$3.a($$0, $$1, $$6, $$7);
      $$4.a($$0, $$1, $$6, $$7);
   }
}
