import java.util.Calendar;

public class gon<T extends dtx & dvd> implements goh<T> {
   private final gbl a;
   private final gbl b;
   private final gbl c;
   private final boolean d = b();

   public gon(goi.a $$0) {
      this.a = new gbl($$0.a(gez.V));
      this.b = new gbl($$0.a(gez.at));
      this.c = new gbl($$0.a(gez.au));
   }

   public static boolean b() {
      Calendar $$0 = Calendar.getInstance();
      return $$0.get(2) + 1 == 12 && $$0.get(5) >= 24 && $$0.get(5) <= 26;
   }

   @Override
   public void a(T $$0, float $$1, ffs $$2, glv $$3, int $$4, int $$5) {
      dgg $$6 = $$0.i();
      boolean $$7 = $$6 != null;
      dwv $$8 = $$7 ? $$0.m() : djm.cD.m().b(dkn.c, jn.d);
      dxn $$9 = $$8.b(dkn.d) ? $$8.c(dkn.d) : dxn.a;
      if ($$8.b() instanceof die<?> $$11) {
         boolean $$12 = $$9 != dxn.a;
         $$2.a();
         float $$13 = $$8.c(dkn.c).p();
         $$2.a(0.5F, 0.5F, 0.5F);
         $$2.a(a.d.rotationDegrees(-$$13));
         $$2.a(-0.5F, -0.5F, -0.5F);
         dls.c<? extends due> $$14;
         if ($$7) {
            $$14 = $$11.a($$8, $$6, $$0.aA_(), true);
         } else {
            $$14 = dls.b::b;
         }

         float $$16 = $$14.apply(dkn.a($$0)).get($$1);
         $$16 = 1.0F - $$16;
         $$16 = 1.0F - $$16 * $$16 * $$16;
         int $$17 = $$14.apply(new gok<>()).applyAsInt($$4);
         hgt $$18 = gmq.a($$0, $$9, this.d);
         ffw $$19 = $$18.a($$3, gmf::f);
         if ($$12) {
            if ($$9 == dxn.b) {
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

   private void a(ffs $$0, ffw $$1, gbl $$2, float $$3, int $$4, int $$5) {
      $$2.a($$3);
      $$2.a($$0, $$1, $$4, $$5);
   }
}
