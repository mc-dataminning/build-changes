import java.util.Calendar;

public class gkn<T extends dsg & dtl> implements gkh<T> {
   private final fxn a;
   private final fxn b;
   private final fxn c;
   private boolean d;

   public gkn(gki.a $$0) {
      Calendar $$1 = Calendar.getInstance();
      if ($$1.get(2) + 1 == 12 && $$1.get(5) >= 24 && $$1.get(5) <= 26) {
         this.d = true;
      }

      this.a = new fxn($$0.a(gba.K));
      this.b = new fxn($$0.a(gba.af));
      this.c = new fxn($$0.a(gba.ag));
   }

   @Override
   public void a(T $$0, float $$1, fdt $$2, ghw $$3, int $$4, int $$5) {
      dev $$6 = $$0.i();
      boolean $$7 = $$6 != null;
      dvd $$8 = $$7 ? $$0.m() : dia.cv.m().b(djb.c, jl.d);
      dvv $$9 = $$8.b(djb.d) ? $$8.c(djb.d) : dvv.a;
      if ($$8.b() instanceof dgs<?> $$11) {
         boolean $$12 = $$9 != dvv.a;
         $$2.a();
         float $$13 = $$8.c(djb.c).p();
         $$2.a(0.5F, 0.5F, 0.5F);
         $$2.a(a.d.rotationDegrees(-$$13));
         $$2.a(-0.5F, -0.5F, -0.5F);
         dkf.c<? extends dsn> $$14;
         if ($$7) {
            $$14 = $$11.a($$8, $$6, $$0.aC_(), true);
         } else {
            $$14 = dkf.b::b;
         }

         float $$16 = $$14.apply(djb.a($$0)).get($$1);
         $$16 = 1.0F - $$16;
         $$16 = 1.0F - $$16 * $$16 * $$16;
         int $$17 = $$14.apply(new gkk<>()).applyAsInt($$4);
         hab $$18 = gir.a($$0, $$9, this.d);
         fdx $$19 = $$18.a($$3, gig::e);
         if ($$12) {
            if ($$9 == dvv.b) {
               this.a($$2, $$19, this.b, $$16, $$17, $$5);
            } else {
               this.a($$2, $$19, this.c, $$16, $$17, $$5);
            }
         } else {
            this.a($$2, $$19, this.a, $$16, $$17, $$5);
         }

         $$2.b();
      }
   }

   private void a(fdt $$0, fdx $$1, fxn $$2, float $$3, int $$4, int $$5) {
      $$2.a($$3);
      $$2.a($$0, $$1, $$4, $$5);
   }
}
