import java.util.Calendar;

public class gdu<T extends dnm & dop> implements gdo<T> {
   private static final String a = "bottom";
   private static final String b = "lid";
   private static final String c = "lock";
   private final fvb d;
   private final fvb e;
   private final fvb f;
   private final fvb g;
   private final fvb h;
   private final fvb i;
   private final fvb j;
   private final fvb k;
   private final fvb l;
   private boolean m;

   public gdu(gdp.a $$0) {
      Calendar $$1 = Calendar.getInstance();
      if ($$1.get(2) + 1 == 12 && $$1.get(5) >= 24 && $$1.get(5) <= 26) {
         this.m = true;
      }

      fvb $$2 = $$0.a(fva.x);
      this.e = $$2.b("bottom");
      this.d = $$2.b("lid");
      this.f = $$2.b("lock");
      fvb $$3 = $$0.a(fva.O);
      this.h = $$3.b("bottom");
      this.g = $$3.b("lid");
      this.i = $$3.b("lock");
      fvb $$4 = $$0.a(fva.P);
      this.k = $$4.b("bottom");
      this.j = $$4.b("lid");
      this.l = $$4.b("lock");
   }

   public static fvh b() {
      fvj $$0 = new fvj();
      fvk $$1 = $$0.a();
      $$1.a("bottom", fvg.c().a(0, 19).a(1.0F, 0.0F, 1.0F, 14.0F, 10.0F, 14.0F), fvd.a);
      $$1.a("lid", fvg.c().a(0, 0).a(1.0F, 0.0F, 0.0F, 14.0F, 5.0F, 14.0F), fvd.a(0.0F, 9.0F, 1.0F));
      $$1.a("lock", fvg.c().a(0, 0).a(7.0F, -2.0F, 14.0F, 2.0F, 4.0F, 1.0F), fvd.a(0.0F, 9.0F, 1.0F));
      return fvh.a($$0, 64, 64);
   }

   public static fvh c() {
      fvj $$0 = new fvj();
      fvk $$1 = $$0.a();
      $$1.a("bottom", fvg.c().a(0, 19).a(1.0F, 0.0F, 1.0F, 15.0F, 10.0F, 14.0F), fvd.a);
      $$1.a("lid", fvg.c().a(0, 0).a(1.0F, 0.0F, 0.0F, 15.0F, 5.0F, 14.0F), fvd.a(0.0F, 9.0F, 1.0F));
      $$1.a("lock", fvg.c().a(0, 0).a(15.0F, -2.0F, 14.0F, 1.0F, 4.0F, 1.0F), fvd.a(0.0F, 9.0F, 1.0F));
      return fvh.a($$0, 64, 64);
   }

   public static fvh d() {
      fvj $$0 = new fvj();
      fvk $$1 = $$0.a();
      $$1.a("bottom", fvg.c().a(0, 19).a(0.0F, 0.0F, 1.0F, 15.0F, 10.0F, 14.0F), fvd.a);
      $$1.a("lid", fvg.c().a(0, 0).a(0.0F, 0.0F, 0.0F, 15.0F, 5.0F, 14.0F), fvd.a(0.0F, 9.0F, 1.0F));
      $$1.a("lock", fvg.c().a(0, 0).a(0.0F, -2.0F, 14.0F, 1.0F, 4.0F, 1.0F), fvd.a(0.0F, 9.0F, 1.0F));
      return fvh.a($$0, 64, 64);
   }

   @Override
   public void a(T $$0, float $$1, exx $$2, gbo $$3, int $$4, int $$5) {
      dad $$6 = $$0.i();
      boolean $$7 = $$6 != null;
      dqh $$8 = $$7 ? $$0.n() : ddg.cv.n().a(deh.c, is.d);
      dqz $$9 = $$8.b(deh.d) ? $$8.c(deh.d) : dqz.a;
      if ($$8.b() instanceof dby<?> $$11) {
         boolean $$12 = $$9 != dqz.a;
         $$2.a();
         float $$13 = $$8.c(deh.c).p();
         $$2.a(0.5F, 0.5F, 0.5F);
         $$2.a(a.d.rotationDegrees(-$$13));
         $$2.a(-0.5F, -0.5F, -0.5F);
         dfl.c<? extends dnt> $$14;
         if ($$7) {
            $$14 = $$11.a($$8, $$6, $$0.az_(), true);
         } else {
            $$14 = dfl.b::b;
         }

         float $$16 = $$14.apply(deh.a($$0)).get($$1);
         $$16 = 1.0F - $$16;
         $$16 = 1.0F - $$16 * $$16 * $$16;
         int $$17 = $$14.apply(new gdr<>()).applyAsInt($$4);
         gpc $$18 = gcd.a($$0, $$9, this.m);
         eyb $$19 = $$18.a($$3, gbw::d);
         if ($$12) {
            if ($$9 == dqz.b) {
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

   private void a(exx $$0, eyb $$1, fvb $$2, fvb $$3, fvb $$4, float $$5, int $$6, int $$7) {
      $$2.e = -($$5 * (float) (Math.PI / 2));
      $$3.e = $$2.e;
      $$2.a($$0, $$1, $$6, $$7);
      $$3.a($$0, $$1, $$6, $$7);
      $$4.a($$0, $$1, $$6, $$7);
   }
}
