import java.util.Calendar;

public class gjx<T extends drs & dsx> implements gjr<T> {
   private final fwy a;
   private final fwy b;
   private final fwy c;
   private boolean d;

   public gjx(gjs.a $$0) {
      Calendar $$1 = Calendar.getInstance();
      if ($$1.get(2) + 1 == 12 && $$1.get(5) >= 24 && $$1.get(5) <= 26) {
         this.d = true;
      }

      this.a = new fwy($$0.a(gak.K));
      this.b = new fwy($$0.a(gak.af));
      this.c = new fwy($$0.a(gak.ag));
   }

   @Override
   public void a(T $$0, float $$1, fde $$2, ghg $$3, int $$4, int $$5) {
      deg $$6 = $$0.i();
      boolean $$7 = $$6 != null;
      duo $$8 = $$7 ? $$0.m() : dhl.cv.o().b(dim.c, jj.d);
      dvg $$9 = $$8.b(dim.d) ? $$8.c(dim.d) : dvg.a;
      if ($$8.b() instanceof dgd<?> $$11) {
         boolean $$12 = $$9 != dvg.a;
         $$2.a();
         float $$13 = $$8.c(dim.c).p();
         $$2.a(0.5F, 0.5F, 0.5F);
         $$2.a(a.d.rotationDegrees(-$$13));
         $$2.a(-0.5F, -0.5F, -0.5F);
         djq.c<? extends drz> $$14;
         if ($$7) {
            $$14 = $$11.a($$8, $$6, $$0.aB_(), true);
         } else {
            $$14 = djq.b::b;
         }

         float $$16 = $$14.apply(dim.a($$0)).get($$1);
         $$16 = 1.0F - $$16;
         $$16 = 1.0F - $$16 * $$16 * $$16;
         int $$17 = $$14.apply(new gju<>()).applyAsInt($$4);
         gzh $$18 = gib.a($$0, $$9, this.d);
         fdi $$19 = $$18.a($$3, ghq::e);
         if ($$12) {
            if ($$9 == dvg.b) {
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

   private void a(fde $$0, fdi $$1, fwy $$2, float $$3, int $$4, int $$5) {
      $$2.a($$3);
      $$2.a($$0, $$1, $$4, $$5);
   }
}
