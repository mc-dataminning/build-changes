import java.util.Calendar;

public class gtf<T extends dxm & dyt> implements gsy<T> {
   private final gfu a;
   private final gfu b;
   private final gfu c;
   private final boolean d = b();

   public gtf(gsz.a $$0) {
      this.a = new gfu($$0.a(gjn.X));
      this.b = new gfu($$0.a(gjn.aD));
      this.c = new gfu($$0.a(gjn.aE));
   }

   public static boolean b() {
      Calendar $$0 = Calendar.getInstance();
      return $$0.get(2) + 1 == 12 && $$0.get(5) >= 24 && $$0.get(5) <= 26;
   }

   @Override
   public void a(T $$0, float $$1, fjy $$2, gqm $$3, int $$4, int $$5, fex $$6) {
      djh $$7 = $$0.i();
      boolean $$8 = $$7 != null;
      eao $$9 = $$8 ? $$0.m() : dmo.cG.m().b(dnq.c, jb.d);
      ebg $$10 = $$9.b(dnq.d) ? $$9.c(dnq.d) : ebg.a;
      if ($$9.b() instanceof dlg<?> $$12) {
         boolean $$13 = $$10 != ebg.a;
         $$2.a();
         float $$14 = $$9.c(dnq.c).p();
         $$2.a(0.5F, 0.5F, 0.5F);
         $$2.a(a.d.rotationDegrees(-$$14));
         $$2.a(-0.5F, -0.5F, -0.5F);
         dou.c<? extends dxu> $$15;
         if ($$8) {
            $$15 = $$12.a($$9, $$7, $$0.ax_(), true);
         } else {
            $$15 = dou.b::b;
         }

         float $$17 = $$15.apply(dnq.a($$0)).get($$1);
         $$17 = 1.0F - $$17;
         $$17 = 1.0F - $$17 * $$17 * $$17;
         int $$18 = $$15.apply(new gtc<>()).applyAsInt($$4);
         hlq $$19 = grg.a($$0, $$10, this.d);
         fkc $$20 = $$19.a($$3, gqx::f);
         if ($$13) {
            if ($$10 == ebg.b) {
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

   private void a(fjy $$0, fkc $$1, gfu $$2, float $$3, int $$4, int $$5) {
      $$2.a($$3);
      $$2.a($$0, $$1, $$4, $$5);
   }
}
