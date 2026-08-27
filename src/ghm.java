import java.util.Calendar;

public class ghm<T extends dqc & drh> implements ghg<T> {
   private static final String a = "bottom";
   private static final String b = "lid";
   private static final String c = "lock";
   private final fys d;
   private final fys e;
   private final fys f;
   private final fys g;
   private final fys h;
   private final fys i;
   private final fys j;
   private final fys k;
   private final fys l;
   private boolean m;

   public ghm(ghh.a $$0) {
      Calendar $$1 = Calendar.getInstance();
      if ($$1.get(2) + 1 == 12 && $$1.get(5) >= 24 && $$1.get(5) <= 26) {
         this.m = true;
      }

      fys $$2 = $$0.a(fyr.y);
      this.e = $$2.b("bottom");
      this.d = $$2.b("lid");
      this.f = $$2.b("lock");
      fys $$3 = $$0.a(fyr.P);
      this.h = $$3.b("bottom");
      this.g = $$3.b("lid");
      this.i = $$3.b("lock");
      fys $$4 = $$0.a(fyr.Q);
      this.k = $$4.b("bottom");
      this.j = $$4.b("lid");
      this.l = $$4.b("lock");
   }

   public static fyy b() {
      fza $$0 = new fza();
      fzb $$1 = $$0.a();
      $$1.a("bottom", fyx.c().a(0, 19).a(1.0F, 0.0F, 1.0F, 14.0F, 10.0F, 14.0F), fyu.a);
      $$1.a("lid", fyx.c().a(0, 0).a(1.0F, 0.0F, 0.0F, 14.0F, 5.0F, 14.0F), fyu.a(0.0F, 9.0F, 1.0F));
      $$1.a("lock", fyx.c().a(0, 0).a(7.0F, -2.0F, 14.0F, 2.0F, 4.0F, 1.0F), fyu.a(0.0F, 9.0F, 1.0F));
      return fyy.a($$0, 64, 64);
   }

   public static fyy c() {
      fza $$0 = new fza();
      fzb $$1 = $$0.a();
      $$1.a("bottom", fyx.c().a(0, 19).a(1.0F, 0.0F, 1.0F, 15.0F, 10.0F, 14.0F), fyu.a);
      $$1.a("lid", fyx.c().a(0, 0).a(1.0F, 0.0F, 0.0F, 15.0F, 5.0F, 14.0F), fyu.a(0.0F, 9.0F, 1.0F));
      $$1.a("lock", fyx.c().a(0, 0).a(15.0F, -2.0F, 14.0F, 1.0F, 4.0F, 1.0F), fyu.a(0.0F, 9.0F, 1.0F));
      return fyy.a($$0, 64, 64);
   }

   public static fyy d() {
      fza $$0 = new fza();
      fzb $$1 = $$0.a();
      $$1.a("bottom", fyx.c().a(0, 19).a(0.0F, 0.0F, 1.0F, 15.0F, 10.0F, 14.0F), fyu.a);
      $$1.a("lid", fyx.c().a(0, 0).a(0.0F, 0.0F, 0.0F, 15.0F, 5.0F, 14.0F), fyu.a(0.0F, 9.0F, 1.0F));
      $$1.a("lock", fyx.c().a(0, 0).a(0.0F, -2.0F, 14.0F, 1.0F, 4.0F, 1.0F), fyu.a(0.0F, 9.0F, 1.0F));
      return fyy.a($$0, 64, 64);
   }

   @Override
   public void a(T $$0, float $$1, fbc $$2, gfg $$3, int $$4, int $$5) {
      dca $$6 = $$0.i();
      boolean $$7 = $$6 != null;
      dtc $$8 = $$7 ? $$0.n() : dfe.dg.n().a(dgf.c, iw.d);
      dtu $$9 = $$8.b(dgf.d) ? $$8.c(dgf.d) : dtu.a;
      if ($$8.b() instanceof ddv<?> $$11) {
         boolean $$12 = $$9 != dtu.a;
         $$2.a();
         float $$13 = $$8.c(dgf.c).p();
         $$2.a(0.5F, 0.5F, 0.5F);
         $$2.a(a.d.rotationDegrees(-$$13));
         $$2.a(-0.5F, -0.5F, -0.5F);
         dhk.c<? extends dqj> $$14;
         if ($$7) {
            $$14 = $$11.a($$8, $$6, $$0.az_(), true);
         } else {
            $$14 = dhk.b::b;
         }

         float $$16 = $$14.apply(dgf.a($$0)).get($$1);
         $$16 = 1.0F - $$16;
         $$16 = 1.0F - $$16 * $$16 * $$16;
         int $$17 = $$14.apply(new ghj<>()).applyAsInt($$4);
         gtc $$18 = gfv.a($$0, $$9, this.m);
         fbg $$19 = $$18.a($$3, gfo::d);
         if ($$12) {
            if ($$9 == dtu.b) {
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

   private void a(fbc $$0, fbg $$1, fys $$2, fys $$3, fys $$4, float $$5, int $$6, int $$7) {
      $$2.e = -($$5 * (float) (Math.PI / 2));
      $$3.e = $$2.e;
      $$2.a($$0, $$1, $$6, $$7);
      $$3.a($$0, $$1, $$6, $$7);
      $$4.a($$0, $$1, $$6, $$7);
   }
}
