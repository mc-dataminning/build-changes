import java.util.Calendar;

public class ghf<T extends dqh & drl> implements ggz<T> {
   private static final String a = "bottom";
   private static final String b = "lid";
   private static final String c = "lock";
   private final fyk d;
   private final fyk e;
   private final fyk f;
   private final fyk g;
   private final fyk h;
   private final fyk i;
   private final fyk j;
   private final fyk k;
   private final fyk l;
   private boolean m;

   public ghf(gha.a $$0) {
      Calendar $$1 = Calendar.getInstance();
      if ($$1.get(2) + 1 == 12 && $$1.get(5) >= 24 && $$1.get(5) <= 26) {
         this.m = true;
      }

      fyk $$2 = $$0.a(fyj.y);
      this.e = $$2.b("bottom");
      this.d = $$2.b("lid");
      this.f = $$2.b("lock");
      fyk $$3 = $$0.a(fyj.P);
      this.h = $$3.b("bottom");
      this.g = $$3.b("lid");
      this.i = $$3.b("lock");
      fyk $$4 = $$0.a(fyj.Q);
      this.k = $$4.b("bottom");
      this.j = $$4.b("lid");
      this.l = $$4.b("lock");
   }

   public static fyq b() {
      fys $$0 = new fys();
      fyt $$1 = $$0.a();
      $$1.a("bottom", fyp.c().a(0, 19).a(1.0F, 0.0F, 1.0F, 14.0F, 10.0F, 14.0F), fym.a);
      $$1.a("lid", fyp.c().a(0, 0).a(1.0F, 0.0F, 0.0F, 14.0F, 5.0F, 14.0F), fym.a(0.0F, 9.0F, 1.0F));
      $$1.a("lock", fyp.c().a(0, 0).a(7.0F, -2.0F, 14.0F, 2.0F, 4.0F, 1.0F), fym.a(0.0F, 9.0F, 1.0F));
      return fyq.a($$0, 64, 64);
   }

   public static fyq c() {
      fys $$0 = new fys();
      fyt $$1 = $$0.a();
      $$1.a("bottom", fyp.c().a(0, 19).a(1.0F, 0.0F, 1.0F, 15.0F, 10.0F, 14.0F), fym.a);
      $$1.a("lid", fyp.c().a(0, 0).a(1.0F, 0.0F, 0.0F, 15.0F, 5.0F, 14.0F), fym.a(0.0F, 9.0F, 1.0F));
      $$1.a("lock", fyp.c().a(0, 0).a(15.0F, -2.0F, 14.0F, 1.0F, 4.0F, 1.0F), fym.a(0.0F, 9.0F, 1.0F));
      return fyq.a($$0, 64, 64);
   }

   public static fyq d() {
      fys $$0 = new fys();
      fyt $$1 = $$0.a();
      $$1.a("bottom", fyp.c().a(0, 19).a(0.0F, 0.0F, 1.0F, 15.0F, 10.0F, 14.0F), fym.a);
      $$1.a("lid", fyp.c().a(0, 0).a(0.0F, 0.0F, 0.0F, 15.0F, 5.0F, 14.0F), fym.a(0.0F, 9.0F, 1.0F));
      $$1.a("lock", fyp.c().a(0, 0).a(0.0F, -2.0F, 14.0F, 1.0F, 4.0F, 1.0F), fym.a(0.0F, 9.0F, 1.0F));
      return fyq.a($$0, 64, 64);
   }

   @Override
   public void a(T $$0, float $$1, fbi $$2, gez $$3, int $$4, int $$5) {
      dcw $$6 = $$0.i();
      boolean $$7 = $$6 != null;
      dtc $$8 = $$7 ? $$0.n() : dga.cv.o().a(dhb.c, ji.d);
      dtu $$9 = $$8.b(dhb.d) ? $$8.c(dhb.d) : dtu.a;
      if ($$8.b() instanceof des<?> $$11) {
         boolean $$12 = $$9 != dtu.a;
         $$2.a();
         float $$13 = $$8.c(dhb.c).p();
         $$2.a(0.5F, 0.5F, 0.5F);
         $$2.a(a.d.rotationDegrees(-$$13));
         $$2.a(-0.5F, -0.5F, -0.5F);
         dif.c<? extends dqo> $$14;
         if ($$7) {
            $$14 = $$11.a($$8, $$6, $$0.aD_(), true);
         } else {
            $$14 = dif.b::b;
         }

         float $$16 = $$14.apply(dhb.a($$0)).get($$1);
         $$16 = 1.0F - $$16;
         $$16 = 1.0F - $$16 * $$16 * $$16;
         int $$17 = $$14.apply(new ghc<>()).applyAsInt($$4);
         gsq $$18 = gfo.a($$0, $$9, this.m);
         fbm $$19 = $$18.a($$3, gfh::d);
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

   private void a(fbi $$0, fbm $$1, fyk $$2, fyk $$3, fyk $$4, float $$5, int $$6, int $$7) {
      $$2.e = -($$5 * (float) (Math.PI / 2));
      $$3.e = $$2.e;
      $$2.a($$0, $$1, $$6, $$7);
      $$3.a($$0, $$1, $$6, $$7);
      $$4.a($$0, $$1, $$6, $$7);
   }
}
