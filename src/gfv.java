import java.util.Calendar;

public class gfv<T extends dpi & dql> implements gfp<T> {
   private static final String a = "bottom";
   private static final String b = "lid";
   private static final String c = "lock";
   private final fxb d;
   private final fxb e;
   private final fxb f;
   private final fxb g;
   private final fxb h;
   private final fxb i;
   private final fxb j;
   private final fxb k;
   private final fxb l;
   private boolean m;

   public gfv(gfq.a $$0) {
      Calendar $$1 = Calendar.getInstance();
      if ($$1.get(2) + 1 == 12 && $$1.get(5) >= 24 && $$1.get(5) <= 26) {
         this.m = true;
      }

      fxb $$2 = $$0.a(fxa.x);
      this.e = $$2.b("bottom");
      this.d = $$2.b("lid");
      this.f = $$2.b("lock");
      fxb $$3 = $$0.a(fxa.O);
      this.h = $$3.b("bottom");
      this.g = $$3.b("lid");
      this.i = $$3.b("lock");
      fxb $$4 = $$0.a(fxa.P);
      this.k = $$4.b("bottom");
      this.j = $$4.b("lid");
      this.l = $$4.b("lock");
   }

   public static fxh b() {
      fxj $$0 = new fxj();
      fxk $$1 = $$0.a();
      $$1.a("bottom", fxg.c().a(0, 19).a(1.0F, 0.0F, 1.0F, 14.0F, 10.0F, 14.0F), fxd.a);
      $$1.a("lid", fxg.c().a(0, 0).a(1.0F, 0.0F, 0.0F, 14.0F, 5.0F, 14.0F), fxd.a(0.0F, 9.0F, 1.0F));
      $$1.a("lock", fxg.c().a(0, 0).a(7.0F, -2.0F, 14.0F, 2.0F, 4.0F, 1.0F), fxd.a(0.0F, 9.0F, 1.0F));
      return fxh.a($$0, 64, 64);
   }

   public static fxh c() {
      fxj $$0 = new fxj();
      fxk $$1 = $$0.a();
      $$1.a("bottom", fxg.c().a(0, 19).a(1.0F, 0.0F, 1.0F, 15.0F, 10.0F, 14.0F), fxd.a);
      $$1.a("lid", fxg.c().a(0, 0).a(1.0F, 0.0F, 0.0F, 15.0F, 5.0F, 14.0F), fxd.a(0.0F, 9.0F, 1.0F));
      $$1.a("lock", fxg.c().a(0, 0).a(15.0F, -2.0F, 14.0F, 1.0F, 4.0F, 1.0F), fxd.a(0.0F, 9.0F, 1.0F));
      return fxh.a($$0, 64, 64);
   }

   public static fxh d() {
      fxj $$0 = new fxj();
      fxk $$1 = $$0.a();
      $$1.a("bottom", fxg.c().a(0, 19).a(0.0F, 0.0F, 1.0F, 15.0F, 10.0F, 14.0F), fxd.a);
      $$1.a("lid", fxg.c().a(0, 0).a(0.0F, 0.0F, 0.0F, 15.0F, 5.0F, 14.0F), fxd.a(0.0F, 9.0F, 1.0F));
      $$1.a("lock", fxg.c().a(0, 0).a(0.0F, -2.0F, 14.0F, 1.0F, 4.0F, 1.0F), fxd.a(0.0F, 9.0F, 1.0F));
      return fxh.a($$0, 64, 64);
   }

   @Override
   public void a(T $$0, float $$1, ezz $$2, gdp $$3, int $$4, int $$5) {
      dbz $$6 = $$0.i();
      boolean $$7 = $$6 != null;
      dsd $$8 = $$7 ? $$0.n() : dfc.cv.o().a(dgd.c, je.d);
      dsv $$9 = $$8.b(dgd.d) ? $$8.c(dgd.d) : dsv.a;
      if ($$8.b() instanceof ddu<?> $$11) {
         boolean $$12 = $$9 != dsv.a;
         $$2.a();
         float $$13 = $$8.c(dgd.c).p();
         $$2.a(0.5F, 0.5F, 0.5F);
         $$2.a(a.d.rotationDegrees(-$$13));
         $$2.a(-0.5F, -0.5F, -0.5F);
         dhh.c<? extends dpp> $$14;
         if ($$7) {
            $$14 = $$11.a($$8, $$6, $$0.ay_(), true);
         } else {
            $$14 = dhh.b::b;
         }

         float $$16 = $$14.apply(dgd.a($$0)).get($$1);
         $$16 = 1.0F - $$16;
         $$16 = 1.0F - $$16 * $$16 * $$16;
         int $$17 = $$14.apply(new gfs<>()).applyAsInt($$4);
         gre $$18 = gee.a($$0, $$9, this.m);
         fad $$19 = $$18.a($$3, gdx::d);
         if ($$12) {
            if ($$9 == dsv.b) {
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

   private void a(ezz $$0, fad $$1, fxb $$2, fxb $$3, fxb $$4, float $$5, int $$6, int $$7) {
      $$2.e = -($$5 * (float) (Math.PI / 2));
      $$3.e = $$2.e;
      $$2.a($$0, $$1, $$6, $$7);
      $$3.a($$0, $$1, $$6, $$7);
      $$4.a($$0, $$1, $$6, $$7);
   }
}
