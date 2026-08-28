import java.util.Calendar;

public class goq<T extends dtz & dvf> implements gok<T> {
   private final gbo a;
   private final gbo b;
   private final gbo c;
   private final boolean d = b();

   public goq(gol.a $$0) {
      this.a = new gbo($$0.a(gfc.V));
      this.b = new gbo($$0.a(gfc.at));
      this.c = new gbo($$0.a(gfc.au));
   }

   public static boolean b() {
      Calendar $$0 = Calendar.getInstance();
      return $$0.get(2) + 1 == 12 && $$0.get(5) >= 24 && $$0.get(5) <= 26;
   }

   @Override
   public void a(T $$0, float $$1, ffu $$2, gly $$3, int $$4, int $$5) {
      dgi $$6 = $$0.i();
      boolean $$7 = $$6 != null;
      dwx $$8 = $$7 ? $$0.m() : djo.cD.m().b(dkp.c, jn.d);
      dxp $$9 = $$8.b(dkp.d) ? $$8.c(dkp.d) : dxp.a;
      if ($$8.b() instanceof dig<?> $$11) {
         boolean $$12 = $$9 != dxp.a;
         $$2.a();
         float $$13 = $$8.c(dkp.c).p();
         $$2.a(0.5F, 0.5F, 0.5F);
         $$2.a(a.d.rotationDegrees(-$$13));
         $$2.a(-0.5F, -0.5F, -0.5F);
         dlu.c<? extends dug> $$14;
         if ($$7) {
            $$14 = $$11.a($$8, $$6, $$0.aA_(), true);
         } else {
            $$14 = dlu.b::b;
         }

         float $$16 = $$14.apply(dkp.a($$0)).get($$1);
         $$16 = 1.0F - $$16;
         $$16 = 1.0F - $$16 * $$16 * $$16;
         int $$17 = $$14.apply(new gon<>()).applyAsInt($$4);
         hgz $$18 = gmt.a($$0, $$9, this.d);
         ffy $$19 = $$18.a($$3, gmi::f);
         if ($$12) {
            if ($$9 == dxp.b) {
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

   private void a(ffu $$0, ffy $$1, gbo $$2, float $$3, int $$4, int $$5) {
      $$2.a($$3);
      $$2.a($$0, $$1, $$4, $$5);
   }
}
