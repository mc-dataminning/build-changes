import java.util.Calendar;

public class guw<T extends dye & dzl> implements gup<T> {
   private final ghm a;
   private final ghm b;
   private final ghm c;
   private final boolean d = b();

   public guw(guq.a $$0) {
      this.a = new ghm($$0.a(glf.X));
      this.b = new ghm($$0.a(glf.aD));
      this.c = new ghm($$0.a(glf.aE));
   }

   public static boolean b() {
      Calendar $$0 = Calendar.getInstance();
      return $$0.get(2) + 1 == 12 && $$0.get(5) >= 24 && $$0.get(5) <= 26;
   }

   @Override
   public void a(T $$0, float $$1, flq $$2, gsc $$3, int $$4, int $$5, ffs $$6) {
      djz $$7 = $$0.i();
      boolean $$8 = $$7 != null;
      ebg $$9 = $$8 ? $$0.m() : dng.cG.m().b(doi.c, jc.d);
      eby $$10 = $$9.b(doi.d) ? $$9.c(doi.d) : eby.a;
      if ($$9.b() instanceof dly<?> $$12) {
         boolean $$13 = $$10 != eby.a;
         $$2.a();
         float $$14 = $$9.c(doi.c).p();
         $$2.a(0.5F, 0.5F, 0.5F);
         $$2.a(a.d.rotationDegrees(-$$14));
         $$2.a(-0.5F, -0.5F, -0.5F);
         dpm.c<? extends dym> $$15;
         if ($$8) {
            $$15 = $$12.a($$9, $$7, $$0.aB_(), true);
         } else {
            $$15 = dpm.b::b;
         }

         float $$17 = $$15.apply(doi.a($$0)).get($$1);
         $$17 = 1.0F - $$17;
         $$17 = 1.0F - $$17 * $$17 * $$17;
         int $$18 = $$15.apply(new gut<>()).applyAsInt($$4);
         hnj $$19 = gsw.a($$0, $$10, this.d);
         flt $$20 = $$19.a($$3, gsn::f);
         if ($$13) {
            if ($$10 == eby.b) {
               this.a($$2, $$20, this.b, $$17, $$18, $$5);
            } else {
               this.a($$2, $$20, this.c, $$17, $$18, $$5);
            }
         } else {
            this.a($$2, $$20, this.a, $$17, $$18, $$5);
         }

         $$2.b();
      }
   }

   private void a(flq $$0, flt $$1, ghm $$2, float $$3, int $$4, int $$5) {
      $$2.a($$3);
      $$2.a($$0, $$1, $$4, $$5);
   }
}
