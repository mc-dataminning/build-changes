import java.util.Calendar;

public class grw<T extends dwn & dxu> implements grp<T> {
   private final gep a;
   private final gep b;
   private final gep c;
   private final boolean d = b();

   public grw(grq.a $$0) {
      this.a = new gep($$0.a(gif.X));
      this.b = new gep($$0.a(gif.az));
      this.c = new gep($$0.a(gif.aA));
   }

   public static boolean b() {
      Calendar $$0 = Calendar.getInstance();
      return $$0.get(2) + 1 == 12 && $$0.get(5) >= 24 && $$0.get(5) <= 26;
   }

   @Override
   public void a(T $$0, float $$1, fiq $$2, gpd $$3, int $$4, int $$5) {
      dip $$6 = $$0.i();
      boolean $$7 = $$6 != null;
      dzo $$8 = $$7 ? $$0.m() : dlw.cD.m().b(dmx.c, ja.d);
      eag $$9 = $$8.b(dmx.d) ? $$8.c(dmx.d) : eag.a;
      if ($$8.b() instanceof dko<?> $$11) {
         boolean $$12 = $$9 != eag.a;
         $$2.a();
         float $$13 = $$8.c(dmx.c).p();
         $$2.a(0.5F, 0.5F, 0.5F);
         $$2.a(a.d.rotationDegrees(-$$13));
         $$2.a(-0.5F, -0.5F, -0.5F);
         doc.c<? extends dwv> $$14;
         if ($$7) {
            $$14 = $$11.a($$8, $$6, $$0.aw_(), true);
         } else {
            $$14 = doc.b::b;
         }

         float $$16 = $$14.apply(dmx.a($$0)).get($$1);
         $$16 = 1.0F - $$16;
         $$16 = 1.0F - $$16 * $$16 * $$16;
         int $$17 = $$14.apply(new grt<>()).applyAsInt($$4);
         hkg $$18 = gpy.a($$0, $$9, this.d);
         fiu $$19 = $$18.a($$3, gpn::f);
         if ($$12) {
            if ($$9 == eag.b) {
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

   private void a(fiq $$0, fiu $$1, gep $$2, float $$3, int $$4, int $$5) {
      $$2.a($$3);
      $$2.a($$0, $$1, $$4, $$5);
   }
}
