import java.util.Calendar;

public class fzy<T extends dki & dll> implements fzs<T> {
   private static final String a = "bottom";
   private static final String b = "lid";
   private static final String c = "lock";
   private final frf d;
   private final frf e;
   private final frf f;
   private final frf g;
   private final frf h;
   private final frf i;
   private final frf j;
   private final frf k;
   private final frf l;
   private boolean m;

   public fzy(fzt.a $$0) {
      Calendar $$1 = Calendar.getInstance();
      if ($$1.get(2) + 1 == 12 && $$1.get(5) >= 24 && $$1.get(5) <= 26) {
         this.m = true;
      }

      frf $$2 = $$0.a(fre.x);
      this.e = $$2.b("bottom");
      this.d = $$2.b("lid");
      this.f = $$2.b("lock");
      frf $$3 = $$0.a(fre.O);
      this.h = $$3.b("bottom");
      this.g = $$3.b("lid");
      this.i = $$3.b("lock");
      frf $$4 = $$0.a(fre.P);
      this.k = $$4.b("bottom");
      this.j = $$4.b("lid");
      this.l = $$4.b("lock");
   }

   public static frl b() {
      frn $$0 = new frn();
      fro $$1 = $$0.a();
      $$1.a("bottom", frk.c().a(0, 19).a(1.0F, 0.0F, 1.0F, 14.0F, 10.0F, 14.0F), frh.a);
      $$1.a("lid", frk.c().a(0, 0).a(1.0F, 0.0F, 0.0F, 14.0F, 5.0F, 14.0F), frh.a(0.0F, 9.0F, 1.0F));
      $$1.a("lock", frk.c().a(0, 0).a(7.0F, -2.0F, 14.0F, 2.0F, 4.0F, 1.0F), frh.a(0.0F, 9.0F, 1.0F));
      return frl.a($$0, 64, 64);
   }

   public static frl c() {
      frn $$0 = new frn();
      fro $$1 = $$0.a();
      $$1.a("bottom", frk.c().a(0, 19).a(1.0F, 0.0F, 1.0F, 15.0F, 10.0F, 14.0F), frh.a);
      $$1.a("lid", frk.c().a(0, 0).a(1.0F, 0.0F, 0.0F, 15.0F, 5.0F, 14.0F), frh.a(0.0F, 9.0F, 1.0F));
      $$1.a("lock", frk.c().a(0, 0).a(15.0F, -2.0F, 14.0F, 1.0F, 4.0F, 1.0F), frh.a(0.0F, 9.0F, 1.0F));
      return frl.a($$0, 64, 64);
   }

   public static frl d() {
      frn $$0 = new frn();
      fro $$1 = $$0.a();
      $$1.a("bottom", frk.c().a(0, 19).a(0.0F, 0.0F, 1.0F, 15.0F, 10.0F, 14.0F), frh.a);
      $$1.a("lid", frk.c().a(0, 0).a(0.0F, 0.0F, 0.0F, 15.0F, 5.0F, 14.0F), frh.a(0.0F, 9.0F, 1.0F));
      $$1.a("lock", frk.c().a(0, 0).a(0.0F, -2.0F, 14.0F, 1.0F, 4.0F, 1.0F), frh.a(0.0F, 9.0F, 1.0F));
      return frl.a($$0, 64, 64);
   }

   @Override
   public void a(T $$0, float $$1, eub $$2, fxs $$3, int $$4, int $$5) {
      cxb $$6 = $$0.i();
      boolean $$7 = $$6 != null;
      dnb $$8 = $$7 ? $$0.n() : dae.cv.o().a(dbf.c, ih.d);
      dnt $$9 = $$8.b(dbf.d) ? $$8.c(dbf.d) : dnt.a;
      if ($$8.b() instanceof cyw<?> $$11) {
         boolean $$12 = $$9 != dnt.a;
         $$2.a();
         float $$13 = $$8.c(dbf.c).p();
         $$2.a(0.5F, 0.5F, 0.5F);
         $$2.a(a.d.rotationDegrees(-$$13));
         $$2.a(-0.5F, -0.5F, -0.5F);
         dcj.c<? extends dkp> $$14;
         if ($$7) {
            $$14 = $$11.a($$8, $$6, $$0.aC_(), true);
         } else {
            $$14 = dcj.b::b;
         }

         float $$16 = $$14.apply(dbf.a($$0)).get($$1);
         $$16 = 1.0F - $$16;
         $$16 = 1.0F - $$16 * $$16 * $$16;
         int $$17 = $$14.apply(new fzv<>()).applyAsInt($$4);
         glf $$18 = fyh.a($$0, $$9, this.m);
         euf $$19 = $$18.a($$3, fya::d);
         if ($$12) {
            if ($$9 == dnt.b) {
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

   private void a(eub $$0, euf $$1, frf $$2, frf $$3, frf $$4, float $$5, int $$6, int $$7) {
      $$2.e = -($$5 * (float) (Math.PI / 2));
      $$3.e = $$2.e;
      $$2.a($$0, $$1, $$6, $$7);
      $$3.a($$0, $$1, $$6, $$7);
      $$4.a($$0, $$1, $$6, $$7);
   }
}
