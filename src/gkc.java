import java.util.Calendar;

public class gkc<T extends drv & dta> implements gjw<T> {
   private final fxc a;
   private final fxc b;
   private final fxc c;
   private boolean d;

   public gkc(gjx.a $$0) {
      Calendar $$1 = Calendar.getInstance();
      if ($$1.get(2) + 1 == 12 && $$1.get(5) >= 24 && $$1.get(5) <= 26) {
         this.d = true;
      }

      this.a = new fxc($$0.a(gap.K));
      this.b = new fxc($$0.a(gap.af));
      this.c = new fxc($$0.a(gap.ag));
   }

   @Override
   public void a(T $$0, float $$1, fdi $$2, ghl $$3, int $$4, int $$5) {
      dej $$6 = $$0.i();
      boolean $$7 = $$6 != null;
      dus $$8 = $$7 ? $$0.m() : dho.cv.n().b(dip.c, jk.d);
      dvk $$9 = $$8.b(dip.d) ? $$8.c(dip.d) : dvk.a;
      if ($$8.b() instanceof dgg<?> $$11) {
         boolean $$12 = $$9 != dvk.a;
         $$2.a();
         float $$13 = $$8.c(dip.c).p();
         $$2.a(0.5F, 0.5F, 0.5F);
         $$2.a(a.d.rotationDegrees(-$$13));
         $$2.a(-0.5F, -0.5F, -0.5F);
         djt.c<? extends dsc> $$14;
         if ($$7) {
            $$14 = $$11.a($$8, $$6, $$0.aC_(), true);
         } else {
            $$14 = djt.b::b;
         }

         float $$16 = $$14.apply(dip.a($$0)).get($$1);
         $$16 = 1.0F - $$16;
         $$16 = 1.0F - $$16 * $$16 * $$16;
         int $$17 = $$14.apply(new gjz<>()).applyAsInt($$4);
         gzm $$18 = gig.a($$0, $$9, this.d);
         fdm $$19 = $$18.a($$3, ghv::e);
         if ($$12) {
            if ($$9 == dvk.b) {
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

   private void a(fdi $$0, fdm $$1, fxc $$2, float $$3, int $$4, int $$5) {
      $$2.a($$3);
      $$2.a($$0, $$1, $$4, $$5);
   }
}
