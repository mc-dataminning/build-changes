import java.util.Calendar;

public class gob<T extends duw & dwc> implements gnv<T> {
   private final gay a;
   private final gay b;
   private final gay c;
   private boolean d;

   public gob(gnw.a $$0) {
      Calendar $$1 = Calendar.getInstance();
      if ($$1.get(2) + 1 == 12 && $$1.get(5) >= 24 && $$1.get(5) <= 26) {
         this.d = true;
      }

      this.a = new gay($$0.a(gem.S));
      this.b = new gay($$0.a(gem.aq));
      this.c = new gay($$0.a(gem.ar));
   }

   @Override
   public void a(T $$0, float $$1, fgr $$2, glk $$3, int $$4, int $$5) {
      dhh $$6 = $$0.i();
      boolean $$7 = $$6 != null;
      dxu $$8 = $$7 ? $$0.m() : dkn.cD.m().b(dlp.c, jm.d);
      dym $$9 = $$8.b(dlp.d) ? $$8.c(dlp.d) : dym.a;
      if ($$8.b() instanceof djf<?> $$11) {
         boolean $$12 = $$9 != dym.a;
         $$2.a();
         float $$13 = $$8.c(dlp.c).p();
         $$2.a(0.5F, 0.5F, 0.5F);
         $$2.a(a.d.rotationDegrees(-$$13));
         $$2.a(-0.5F, -0.5F, -0.5F);
         dmu.c<? extends dvd> $$14;
         if ($$7) {
            $$14 = $$11.a($$8, $$6, $$0.aB_(), true);
         } else {
            $$14 = dmu.b::b;
         }

         float $$16 = $$14.apply(dlp.a($$0)).get($$1);
         $$16 = 1.0F - $$16;
         $$16 = 1.0F - $$16 * $$16 * $$16;
         int $$17 = $$14.apply(new gny<>()).applyAsInt($$4);
         hdt $$18 = gmf.a($$0, $$9, this.d);
         fgv $$19 = $$18.a($$3, glu::f);
         if ($$12) {
            if ($$9 == dym.b) {
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

   private void a(fgr $$0, fgv $$1, gay $$2, float $$3, int $$4, int $$5) {
      $$2.a($$3);
      $$2.a($$0, $$1, $$4, $$5);
   }
}
