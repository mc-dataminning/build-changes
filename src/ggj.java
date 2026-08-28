import java.util.Calendar;

public class ggj<T extends dpp & dqt> implements ggd<T> {
   private static final String a = "bottom";
   private static final String b = "lid";
   private static final String c = "lock";
   private final fxo d;
   private final fxo e;
   private final fxo f;
   private final fxo g;
   private final fxo h;
   private final fxo i;
   private final fxo j;
   private final fxo k;
   private final fxo l;
   private boolean m;

   public ggj(gge.a $$0) {
      Calendar $$1 = Calendar.getInstance();
      if ($$1.get(2) + 1 == 12 && $$1.get(5) >= 24 && $$1.get(5) <= 26) {
         this.m = true;
      }

      fxo $$2 = $$0.a(fxn.x);
      this.e = $$2.b("bottom");
      this.d = $$2.b("lid");
      this.f = $$2.b("lock");
      fxo $$3 = $$0.a(fxn.O);
      this.h = $$3.b("bottom");
      this.g = $$3.b("lid");
      this.i = $$3.b("lock");
      fxo $$4 = $$0.a(fxn.P);
      this.k = $$4.b("bottom");
      this.j = $$4.b("lid");
      this.l = $$4.b("lock");
   }

   public static fxu b() {
      fxw $$0 = new fxw();
      fxx $$1 = $$0.a();
      $$1.a("bottom", fxt.c().a(0, 19).a(1.0F, 0.0F, 1.0F, 14.0F, 10.0F, 14.0F), fxq.a);
      $$1.a("lid", fxt.c().a(0, 0).a(1.0F, 0.0F, 0.0F, 14.0F, 5.0F, 14.0F), fxq.a(0.0F, 9.0F, 1.0F));
      $$1.a("lock", fxt.c().a(0, 0).a(7.0F, -2.0F, 14.0F, 2.0F, 4.0F, 1.0F), fxq.a(0.0F, 9.0F, 1.0F));
      return fxu.a($$0, 64, 64);
   }

   public static fxu c() {
      fxw $$0 = new fxw();
      fxx $$1 = $$0.a();
      $$1.a("bottom", fxt.c().a(0, 19).a(1.0F, 0.0F, 1.0F, 15.0F, 10.0F, 14.0F), fxq.a);
      $$1.a("lid", fxt.c().a(0, 0).a(1.0F, 0.0F, 0.0F, 15.0F, 5.0F, 14.0F), fxq.a(0.0F, 9.0F, 1.0F));
      $$1.a("lock", fxt.c().a(0, 0).a(15.0F, -2.0F, 14.0F, 1.0F, 4.0F, 1.0F), fxq.a(0.0F, 9.0F, 1.0F));
      return fxu.a($$0, 64, 64);
   }

   public static fxu d() {
      fxw $$0 = new fxw();
      fxx $$1 = $$0.a();
      $$1.a("bottom", fxt.c().a(0, 19).a(0.0F, 0.0F, 1.0F, 15.0F, 10.0F, 14.0F), fxq.a);
      $$1.a("lid", fxt.c().a(0, 0).a(0.0F, 0.0F, 0.0F, 15.0F, 5.0F, 14.0F), fxq.a(0.0F, 9.0F, 1.0F));
      $$1.a("lock", fxt.c().a(0, 0).a(0.0F, -2.0F, 14.0F, 1.0F, 4.0F, 1.0F), fxq.a(0.0F, 9.0F, 1.0F));
      return fxu.a($$0, 64, 64);
   }

   @Override
   public void a(T $$0, float $$1, fam $$2, ged $$3, int $$4, int $$5) {
      dcf $$6 = $$0.i();
      boolean $$7 = $$6 != null;
      dsk $$8 = $$7 ? $$0.n() : dfj.cv.o().a(dgk.c, jf.d);
      dtc $$9 = $$8.b(dgk.d) ? $$8.c(dgk.d) : dtc.a;
      if ($$8.b() instanceof deb<?> $$11) {
         boolean $$12 = $$9 != dtc.a;
         $$2.a();
         float $$13 = $$8.c(dgk.c).p();
         $$2.a(0.5F, 0.5F, 0.5F);
         $$2.a(a.d.rotationDegrees(-$$13));
         $$2.a(-0.5F, -0.5F, -0.5F);
         dho.c<? extends dpw> $$14;
         if ($$7) {
            $$14 = $$11.a($$8, $$6, $$0.az_(), true);
         } else {
            $$14 = dho.b::b;
         }

         float $$16 = $$14.apply(dgk.a($$0)).get($$1);
         $$16 = 1.0F - $$16;
         $$16 = 1.0F - $$16 * $$16 * $$16;
         int $$17 = $$14.apply(new ggg<>()).applyAsInt($$4);
         grs $$18 = ges.a($$0, $$9, this.m);
         faq $$19 = $$18.a($$3, gel::d);
         if ($$12) {
            if ($$9 == dtc.b) {
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

   private void a(fam $$0, faq $$1, fxo $$2, fxo $$3, fxo $$4, float $$5, int $$6, int $$7) {
      $$2.e = -($$5 * (float) (Math.PI / 2));
      $$3.e = $$2.e;
      $$2.a($$0, $$1, $$6, $$7);
      $$3.a($$0, $$1, $$6, $$7);
      $$4.a($$0, $$1, $$6, $$7);
   }
}
