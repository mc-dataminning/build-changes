import java.util.Calendar;

public class fzw<T extends dkg & dlj> implements fzq<T> {
   private static final String a = "bottom";
   private static final String b = "lid";
   private static final String c = "lock";
   private final frd d;
   private final frd e;
   private final frd f;
   private final frd g;
   private final frd h;
   private final frd i;
   private final frd j;
   private final frd k;
   private final frd l;
   private boolean m;

   public fzw(fzr.a $$0) {
      Calendar $$1 = Calendar.getInstance();
      if ($$1.get(2) + 1 == 12 && $$1.get(5) >= 24 && $$1.get(5) <= 26) {
         this.m = true;
      }

      frd $$2 = $$0.a(frc.t);
      this.e = $$2.b("bottom");
      this.d = $$2.b("lid");
      this.f = $$2.b("lock");
      frd $$3 = $$0.a(frc.K);
      this.h = $$3.b("bottom");
      this.g = $$3.b("lid");
      this.i = $$3.b("lock");
      frd $$4 = $$0.a(frc.L);
      this.k = $$4.b("bottom");
      this.j = $$4.b("lid");
      this.l = $$4.b("lock");
   }

   public static frj b() {
      frl $$0 = new frl();
      frm $$1 = $$0.a();
      $$1.a("bottom", fri.c().a(0, 19).a(1.0F, 0.0F, 1.0F, 14.0F, 10.0F, 14.0F), frf.a);
      $$1.a("lid", fri.c().a(0, 0).a(1.0F, 0.0F, 0.0F, 14.0F, 5.0F, 14.0F), frf.a(0.0F, 9.0F, 1.0F));
      $$1.a("lock", fri.c().a(0, 0).a(7.0F, -2.0F, 14.0F, 2.0F, 4.0F, 1.0F), frf.a(0.0F, 9.0F, 1.0F));
      return frj.a($$0, 64, 64);
   }

   public static frj c() {
      frl $$0 = new frl();
      frm $$1 = $$0.a();
      $$1.a("bottom", fri.c().a(0, 19).a(1.0F, 0.0F, 1.0F, 15.0F, 10.0F, 14.0F), frf.a);
      $$1.a("lid", fri.c().a(0, 0).a(1.0F, 0.0F, 0.0F, 15.0F, 5.0F, 14.0F), frf.a(0.0F, 9.0F, 1.0F));
      $$1.a("lock", fri.c().a(0, 0).a(15.0F, -2.0F, 14.0F, 1.0F, 4.0F, 1.0F), frf.a(0.0F, 9.0F, 1.0F));
      return frj.a($$0, 64, 64);
   }

   public static frj d() {
      frl $$0 = new frl();
      frm $$1 = $$0.a();
      $$1.a("bottom", fri.c().a(0, 19).a(0.0F, 0.0F, 1.0F, 15.0F, 10.0F, 14.0F), frf.a);
      $$1.a("lid", fri.c().a(0, 0).a(0.0F, 0.0F, 0.0F, 15.0F, 5.0F, 14.0F), frf.a(0.0F, 9.0F, 1.0F));
      $$1.a("lock", fri.c().a(0, 0).a(0.0F, -2.0F, 14.0F, 1.0F, 4.0F, 1.0F), frf.a(0.0F, 9.0F, 1.0F));
      return frj.a($$0, 64, 64);
   }

   @Override
   public void a(T $$0, float $$1, etz $$2, fxq $$3, int $$4, int $$5) {
      cwz $$6 = $$0.i();
      boolean $$7 = $$6 != null;
      dmz $$8 = $$7 ? $$0.n() : dac.cv.o().a(dbd.c, ih.d);
      dnr $$9 = $$8.b(dbd.d) ? $$8.c(dbd.d) : dnr.a;
      if ($$8.b() instanceof cyu<?> $$11) {
         boolean $$12 = $$9 != dnr.a;
         $$2.a();
         float $$13 = $$8.c(dbd.c).p();
         $$2.a(0.5F, 0.5F, 0.5F);
         $$2.a(a.d.rotationDegrees(-$$13));
         $$2.a(-0.5F, -0.5F, -0.5F);
         dch.c<? extends dkn> $$14;
         if ($$7) {
            $$14 = $$11.a($$8, $$6, $$0.aC_(), true);
         } else {
            $$14 = dch.b::b;
         }

         float $$16 = $$14.apply(dbd.a($$0)).get($$1);
         $$16 = 1.0F - $$16;
         $$16 = 1.0F - $$16 * $$16 * $$16;
         int $$17 = $$14.apply(new fzt<>()).applyAsInt($$4);
         glc $$18 = fyf.a($$0, $$9, this.m);
         eud $$19 = $$18.a($$3, fxy::d);
         if ($$12) {
            if ($$9 == dnr.b) {
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

   private void a(etz $$0, eud $$1, frd $$2, frd $$3, frd $$4, float $$5, int $$6, int $$7) {
      $$2.e = -($$5 * (float) (Math.PI / 2));
      $$3.e = $$2.e;
      $$2.a($$0, $$1, $$6, $$7);
      $$3.a($$0, $$1, $$6, $$7);
      $$4.a($$0, $$1, $$6, $$7);
   }
}
