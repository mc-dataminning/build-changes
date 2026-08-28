import java.util.Calendar;

public class gji<T extends dre & dsj> implements gjc<T> {
   private final fwo a;
   private final fwo b;
   private final fwo c;
   private boolean d;

   public gji(gjd.a $$0) {
      Calendar $$1 = Calendar.getInstance();
      if ($$1.get(2) + 1 == 12 && $$1.get(5) >= 24 && $$1.get(5) <= 26) {
         this.d = true;
      }

      this.a = new fwo($$0.a(gaa.K));
      this.b = new fwo($$0.a(gaa.af));
      this.c = new fwo($$0.a(gaa.ag));
   }

   @Override
   public void a(T $$0, float $$1, fcu $$2, ggv $$3, int $$4, int $$5) {
      dds $$6 = $$0.i();
      boolean $$7 = $$6 != null;
      dua $$8 = $$7 ? $$0.m() : dgx.cv.o().b(dhy.c, jj.d);
      dus $$9 = $$8.b(dhy.d) ? $$8.c(dhy.d) : dus.a;
      if ($$8.b() instanceof dfp<?> $$11) {
         boolean $$12 = $$9 != dus.a;
         $$2.a();
         float $$13 = $$8.c(dhy.c).p();
         $$2.a(0.5F, 0.5F, 0.5F);
         $$2.a(a.d.rotationDegrees(-$$13));
         $$2.a(-0.5F, -0.5F, -0.5F);
         djc.c<? extends drl> $$14;
         if ($$7) {
            $$14 = $$11.a($$8, $$6, $$0.aD_(), true);
         } else {
            $$14 = djc.b::b;
         }

         float $$16 = $$14.apply(dhy.a($$0)).get($$1);
         $$16 = 1.0F - $$16;
         $$16 = 1.0F - $$16 * $$16 * $$16;
         int $$17 = $$14.apply(new gjf<>()).applyAsInt($$4);
         gyq $$18 = ghm.a($$0, $$9, this.d);
         fcy $$19 = $$18.a($$3, ghe::e);
         if ($$12) {
            if ($$9 == dus.b) {
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

   private void a(fcu $$0, fcy $$1, fwo $$2, float $$3, int $$4, int $$5) {
      $$2.a($$3);
      $$2.a($$0, $$1, $$4, $$5);
   }
}
