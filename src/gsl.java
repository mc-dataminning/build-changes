import java.util.Calendar;

public class gsl<T extends dwx & dye> implements gse<T> {
   private final gfb a;
   private final gfb b;
   private final gfb c;
   private final boolean d = b();

   public gsl(gsf.a $$0) {
      this.a = new gfb($$0.a(git.X));
      this.b = new gfb($$0.a(git.aB));
      this.c = new gfb($$0.a(git.aC));
   }

   public static boolean b() {
      Calendar $$0 = Calendar.getInstance();
      return $$0.get(2) + 1 == 12 && $$0.get(5) >= 24 && $$0.get(5) <= 26;
   }

   @Override
   public void a(T $$0, float $$1, fjc $$2, gps $$3, int $$4, int $$5, fei $$6) {
      div $$7 = $$0.i();
      boolean $$8 = $$7 != null;
      dzz $$9 = $$8 ? $$0.m() : dmc.cE.m().b(dnd.c, ja.d);
      ear $$10 = $$9.b(dnd.d) ? $$9.c(dnd.d) : ear.a;
      if ($$9.b() instanceof dku<?> $$12) {
         boolean $$13 = $$10 != ear.a;
         $$2.a();
         float $$14 = $$9.c(dnd.c).p();
         $$2.a(0.5F, 0.5F, 0.5F);
         $$2.a(a.d.rotationDegrees(-$$14));
         $$2.a(-0.5F, -0.5F, -0.5F);
         doi.c<? extends dxf> $$15;
         if ($$8) {
            $$15 = $$12.a($$9, $$7, $$0.aw_(), true);
         } else {
            $$15 = doi.b::b;
         }

         float $$17 = $$15.apply(dnd.a($$0)).get($$1);
         $$17 = 1.0F - $$17;
         $$17 = 1.0F - $$17 * $$17 * $$17;
         int $$18 = $$15.apply(new gsi<>()).applyAsInt($$4);
         hkw $$19 = gqn.a($$0, $$10, this.d);
         fjg $$20 = $$19.a($$3, gqc::f);
         if ($$13) {
            if ($$10 == ear.b) {
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

   private void a(fjc $$0, fjg $$1, gfb $$2, float $$3, int $$4, int $$5) {
      $$2.a($$3);
      $$2.a($$0, $$1, $$4, $$5);
   }
}
