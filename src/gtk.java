import java.util.Calendar;

public class gtk<T extends dxr & dyy> implements gtd<T> {
   private final gfz a;
   private final gfz b;
   private final gfz c;
   private final boolean d = b();

   public gtk(gte.a $$0) {
      this.a = new gfz($$0.a(gjs.X));
      this.b = new gfz($$0.a(gjs.aD));
      this.c = new gfz($$0.a(gjs.aE));
   }

   public static boolean b() {
      Calendar $$0 = Calendar.getInstance();
      return $$0.get(2) + 1 == 12 && $$0.get(5) >= 24 && $$0.get(5) <= 26;
   }

   @Override
   public void a(T $$0, float $$1, fkd $$2, gqr $$3, int $$4, int $$5, ffc $$6) {
      djm $$7 = $$0.i();
      boolean $$8 = $$7 != null;
      eat $$9 = $$8 ? $$0.m() : dmt.cG.m().b(dnv.c, jb.d);
      ebl $$10 = $$9.b(dnv.d) ? $$9.c(dnv.d) : ebl.a;
      if ($$9.b() instanceof dll<?> $$12) {
         boolean $$13 = $$10 != ebl.a;
         $$2.a();
         float $$14 = $$9.c(dnv.c).p();
         $$2.a(0.5F, 0.5F, 0.5F);
         $$2.a(a.d.rotationDegrees(-$$14));
         $$2.a(-0.5F, -0.5F, -0.5F);
         doz.c<? extends dxz> $$15;
         if ($$8) {
            $$15 = $$12.a($$9, $$7, $$0.ax_(), true);
         } else {
            $$15 = doz.b::b;
         }

         float $$17 = $$15.apply(dnv.a($$0)).get($$1);
         $$17 = 1.0F - $$17;
         $$17 = 1.0F - $$17 * $$17 * $$17;
         int $$18 = $$15.apply(new gth<>()).applyAsInt($$4);
         hlx $$19 = grl.a($$0, $$10, this.d);
         fkh $$20 = $$19.a($$3, grc::f);
         if ($$13) {
            if ($$10 == ebl.b) {
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

   private void a(fkd $$0, fkh $$1, gfz $$2, float $$3, int $$4, int $$5) {
      $$2.a($$3);
      $$2.a($$0, $$1, $$4, $$5);
   }
}
