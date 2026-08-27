import java.util.Calendar;

public class fyw<T extends djl & dko> implements fyq<T> {
   private static final String a = "bottom";
   private static final String b = "lid";
   private static final String c = "lock";
   private final fqf d;
   private final fqf e;
   private final fqf f;
   private final fqf g;
   private final fqf h;
   private final fqf i;
   private final fqf j;
   private final fqf k;
   private final fqf l;
   private boolean m;

   public fyw(fyr.a $$0) {
      Calendar $$1 = Calendar.getInstance();
      if ($$1.get(2) + 1 == 12 && $$1.get(5) >= 24 && $$1.get(5) <= 26) {
         this.m = true;
      }

      fqf $$2 = $$0.a(fqe.t);
      this.e = $$2.b("bottom");
      this.d = $$2.b("lid");
      this.f = $$2.b("lock");
      fqf $$3 = $$0.a(fqe.K);
      this.h = $$3.b("bottom");
      this.g = $$3.b("lid");
      this.i = $$3.b("lock");
      fqf $$4 = $$0.a(fqe.L);
      this.k = $$4.b("bottom");
      this.j = $$4.b("lid");
      this.l = $$4.b("lock");
   }

   public static fql b() {
      fqn $$0 = new fqn();
      fqo $$1 = $$0.a();
      $$1.a("bottom", fqk.c().a(0, 19).a(1.0F, 0.0F, 1.0F, 14.0F, 10.0F, 14.0F), fqh.a);
      $$1.a("lid", fqk.c().a(0, 0).a(1.0F, 0.0F, 0.0F, 14.0F, 5.0F, 14.0F), fqh.a(0.0F, 9.0F, 1.0F));
      $$1.a("lock", fqk.c().a(0, 0).a(7.0F, -2.0F, 14.0F, 2.0F, 4.0F, 1.0F), fqh.a(0.0F, 9.0F, 1.0F));
      return fql.a($$0, 64, 64);
   }

   public static fql c() {
      fqn $$0 = new fqn();
      fqo $$1 = $$0.a();
      $$1.a("bottom", fqk.c().a(0, 19).a(1.0F, 0.0F, 1.0F, 15.0F, 10.0F, 14.0F), fqh.a);
      $$1.a("lid", fqk.c().a(0, 0).a(1.0F, 0.0F, 0.0F, 15.0F, 5.0F, 14.0F), fqh.a(0.0F, 9.0F, 1.0F));
      $$1.a("lock", fqk.c().a(0, 0).a(15.0F, -2.0F, 14.0F, 1.0F, 4.0F, 1.0F), fqh.a(0.0F, 9.0F, 1.0F));
      return fql.a($$0, 64, 64);
   }

   public static fql d() {
      fqn $$0 = new fqn();
      fqo $$1 = $$0.a();
      $$1.a("bottom", fqk.c().a(0, 19).a(0.0F, 0.0F, 1.0F, 15.0F, 10.0F, 14.0F), fqh.a);
      $$1.a("lid", fqk.c().a(0, 0).a(0.0F, 0.0F, 0.0F, 15.0F, 5.0F, 14.0F), fqh.a(0.0F, 9.0F, 1.0F));
      $$1.a("lock", fqk.c().a(0, 0).a(0.0F, -2.0F, 14.0F, 1.0F, 4.0F, 1.0F), fqh.a(0.0F, 9.0F, 1.0F));
      return fql.a($$0, 64, 64);
   }

   @Override
   public void a(T $$0, float $$1, etd $$2, fwq $$3, int $$4, int $$5) {
      cwe $$6 = $$0.i();
      boolean $$7 = $$6 != null;
      dme $$8 = $$7 ? $$0.n() : czh.cv.o().a(dai.c, ih.d);
      dmw $$9 = $$8.b(dai.d) ? $$8.c(dai.d) : dmw.a;
      if ($$8.b() instanceof cxz<?> $$11) {
         boolean $$12 = $$9 != dmw.a;
         $$2.a();
         float $$13 = $$8.c(dai.c).p();
         $$2.a(0.5F, 0.5F, 0.5F);
         $$2.a(a.d.rotationDegrees(-$$13));
         $$2.a(-0.5F, -0.5F, -0.5F);
         dbm.c<? extends djs> $$14;
         if ($$7) {
            $$14 = $$11.a($$8, $$6, $$0.aD_(), true);
         } else {
            $$14 = dbm.b::b;
         }

         float $$16 = $$14.apply(dai.a($$0)).get($$1);
         $$16 = 1.0F - $$16;
         $$16 = 1.0F - $$16 * $$16 * $$16;
         int $$17 = $$14.apply(new fyt<>()).applyAsInt($$4);
         gkc $$18 = fxf.a($$0, $$9, this.m);
         eth $$19 = $$18.a($$3, fwy::d);
         if ($$12) {
            if ($$9 == dmw.b) {
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

   private void a(etd $$0, eth $$1, fqf $$2, fqf $$3, fqf $$4, float $$5, int $$6, int $$7) {
      $$2.e = -($$5 * (float) (Math.PI / 2));
      $$3.e = $$2.e;
      $$2.a($$0, $$1, $$6, $$7);
      $$3.a($$0, $$1, $$6, $$7);
      $$4.a($$0, $$1, $$6, $$7);
   }
}
