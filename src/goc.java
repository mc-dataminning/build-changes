import java.util.Calendar;

public class goc<T extends dux & dwd> implements gnw<T> {
   private final gaz a;
   private final gaz b;
   private final gaz c;
   private boolean d;

   public goc(gnx.a $$0) {
      Calendar $$1 = Calendar.getInstance();
      if ($$1.get(2) + 1 == 12 && $$1.get(5) >= 24 && $$1.get(5) <= 26) {
         this.d = true;
      }

      this.a = new gaz($$0.a(gen.S));
      this.b = new gaz($$0.a(gen.aq));
      this.c = new gaz($$0.a(gen.ar));
   }

   @Override
   public void a(T $$0, float $$1, fgs $$2, gll $$3, int $$4, int $$5) {
      dhi $$6 = $$0.i();
      boolean $$7 = $$6 != null;
      dxv $$8 = $$7 ? $$0.m() : dko.cD.m().b(dlq.c, jm.d);
      dyn $$9 = $$8.b(dlq.d) ? $$8.c(dlq.d) : dyn.a;
      if ($$8.b() instanceof djg<?> $$11) {
         boolean $$12 = $$9 != dyn.a;
         $$2.a();
         float $$13 = $$8.c(dlq.c).p();
         $$2.a(0.5F, 0.5F, 0.5F);
         $$2.a(a.d.rotationDegrees(-$$13));
         $$2.a(-0.5F, -0.5F, -0.5F);
         dmv.c<? extends dve> $$14;
         if ($$7) {
            $$14 = $$11.a($$8, $$6, $$0.aB_(), true);
         } else {
            $$14 = dmv.b::b;
         }

         float $$16 = $$14.apply(dlq.a($$0)).get($$1);
         $$16 = 1.0F - $$16;
         $$16 = 1.0F - $$16 * $$16 * $$16;
         int $$17 = $$14.apply(new gnz<>()).applyAsInt($$4);
         hdu $$18 = gmg.a($$0, $$9, this.d);
         fgw $$19 = $$18.a($$3, glv::f);
         if ($$12) {
            if ($$9 == dyn.b) {
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

   private void a(fgs $$0, fgw $$1, gaz $$2, float $$3, int $$4, int $$5) {
      $$2.a($$3);
      $$2.a($$0, $$1, $$4, $$5);
   }
}
