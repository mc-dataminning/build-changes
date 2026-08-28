import java.util.Calendar;

public class gfw<T extends dpj & dqm> implements gfq<T> {
   private static final String a = "bottom";
   private static final String b = "lid";
   private static final String c = "lock";
   private final fxc d;
   private final fxc e;
   private final fxc f;
   private final fxc g;
   private final fxc h;
   private final fxc i;
   private final fxc j;
   private final fxc k;
   private final fxc l;
   private boolean m;

   public gfw(gfr.a $$0) {
      Calendar $$1 = Calendar.getInstance();
      if ($$1.get(2) + 1 == 12 && $$1.get(5) >= 24 && $$1.get(5) <= 26) {
         this.m = true;
      }

      fxc $$2 = $$0.a(fxb.x);
      this.e = $$2.b("bottom");
      this.d = $$2.b("lid");
      this.f = $$2.b("lock");
      fxc $$3 = $$0.a(fxb.O);
      this.h = $$3.b("bottom");
      this.g = $$3.b("lid");
      this.i = $$3.b("lock");
      fxc $$4 = $$0.a(fxb.P);
      this.k = $$4.b("bottom");
      this.j = $$4.b("lid");
      this.l = $$4.b("lock");
   }

   public static fxi b() {
      fxk $$0 = new fxk();
      fxl $$1 = $$0.a();
      $$1.a("bottom", fxh.c().a(0, 19).a(1.0F, 0.0F, 1.0F, 14.0F, 10.0F, 14.0F), fxe.a);
      $$1.a("lid", fxh.c().a(0, 0).a(1.0F, 0.0F, 0.0F, 14.0F, 5.0F, 14.0F), fxe.a(0.0F, 9.0F, 1.0F));
      $$1.a("lock", fxh.c().a(0, 0).a(7.0F, -2.0F, 14.0F, 2.0F, 4.0F, 1.0F), fxe.a(0.0F, 9.0F, 1.0F));
      return fxi.a($$0, 64, 64);
   }

   public static fxi c() {
      fxk $$0 = new fxk();
      fxl $$1 = $$0.a();
      $$1.a("bottom", fxh.c().a(0, 19).a(1.0F, 0.0F, 1.0F, 15.0F, 10.0F, 14.0F), fxe.a);
      $$1.a("lid", fxh.c().a(0, 0).a(1.0F, 0.0F, 0.0F, 15.0F, 5.0F, 14.0F), fxe.a(0.0F, 9.0F, 1.0F));
      $$1.a("lock", fxh.c().a(0, 0).a(15.0F, -2.0F, 14.0F, 1.0F, 4.0F, 1.0F), fxe.a(0.0F, 9.0F, 1.0F));
      return fxi.a($$0, 64, 64);
   }

   public static fxi d() {
      fxk $$0 = new fxk();
      fxl $$1 = $$0.a();
      $$1.a("bottom", fxh.c().a(0, 19).a(0.0F, 0.0F, 1.0F, 15.0F, 10.0F, 14.0F), fxe.a);
      $$1.a("lid", fxh.c().a(0, 0).a(0.0F, 0.0F, 0.0F, 15.0F, 5.0F, 14.0F), fxe.a(0.0F, 9.0F, 1.0F));
      $$1.a("lock", fxh.c().a(0, 0).a(0.0F, -2.0F, 14.0F, 1.0F, 4.0F, 1.0F), fxe.a(0.0F, 9.0F, 1.0F));
      return fxi.a($$0, 64, 64);
   }

   @Override
   public void a(T $$0, float $$1, faa $$2, gdq $$3, int $$4, int $$5) {
      dca $$6 = $$0.i();
      boolean $$7 = $$6 != null;
      dse $$8 = $$7 ? $$0.n() : dfd.cv.o().a(dge.c, je.d);
      dsw $$9 = $$8.b(dge.d) ? $$8.c(dge.d) : dsw.a;
      if ($$8.b() instanceof ddv<?> $$11) {
         boolean $$12 = $$9 != dsw.a;
         $$2.a();
         float $$13 = $$8.c(dge.c).p();
         $$2.a(0.5F, 0.5F, 0.5F);
         $$2.a(a.d.rotationDegrees(-$$13));
         $$2.a(-0.5F, -0.5F, -0.5F);
         dhi.c<? extends dpq> $$14;
         if ($$7) {
            $$14 = $$11.a($$8, $$6, $$0.ay_(), true);
         } else {
            $$14 = dhi.b::b;
         }

         float $$16 = $$14.apply(dge.a($$0)).get($$1);
         $$16 = 1.0F - $$16;
         $$16 = 1.0F - $$16 * $$16 * $$16;
         int $$17 = $$14.apply(new gft<>()).applyAsInt($$4);
         grf $$18 = gef.a($$0, $$9, this.m);
         fae $$19 = $$18.a($$3, gdy::d);
         if ($$12) {
            if ($$9 == dsw.b) {
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

   private void a(faa $$0, fae $$1, fxc $$2, fxc $$3, fxc $$4, float $$5, int $$6, int $$7) {
      $$2.e = -($$5 * (float) (Math.PI / 2));
      $$3.e = $$2.e;
      $$2.a($$0, $$1, $$6, $$7);
      $$3.a($$0, $$1, $$6, $$7);
      $$4.a($$0, $$1, $$6, $$7);
   }
}
