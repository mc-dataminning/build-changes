import java.util.Calendar;

public class glo<T extends dsr & dtw> implements gli<T> {
   private final fyo a;
   private final fyo b;
   private final fyo c;
   private boolean d;

   public glo(glj.a $$0) {
      Calendar $$1 = Calendar.getInstance();
      if ($$1.get(2) + 1 == 12 && $$1.get(5) >= 24 && $$1.get(5) <= 26) {
         this.d = true;
      }

      this.a = new fyo($$0.a(gcb.K));
      this.b = new fyo($$0.a(gcb.af));
      this.c = new fyo($$0.a(gcb.ag));
   }

   @Override
   public void a(T $$0, float $$1, fek $$2, gix $$3, int $$4, int $$5) {
      dff $$6 = $$0.i();
      boolean $$7 = $$6 != null;
      dvo $$8 = $$7 ? $$0.m() : dil.cv.m().b(djm.c, jm.d);
      dwg $$9 = $$8.b(djm.d) ? $$8.c(djm.d) : dwg.a;
      if ($$8.b() instanceof dhd<?> $$11) {
         boolean $$12 = $$9 != dwg.a;
         $$2.a();
         float $$13 = $$8.c(djm.c).p();
         $$2.a(0.5F, 0.5F, 0.5F);
         $$2.a(a.d.rotationDegrees(-$$13));
         $$2.a(-0.5F, -0.5F, -0.5F);
         dkq.c<? extends dsy> $$14;
         if ($$7) {
            $$14 = $$11.a($$8, $$6, $$0.aB_(), true);
         } else {
            $$14 = dkq.b::b;
         }

         float $$16 = $$14.apply(djm.a($$0)).get($$1);
         $$16 = 1.0F - $$16;
         $$16 = 1.0F - $$16 * $$16 * $$16;
         int $$17 = $$14.apply(new gll<>()).applyAsInt($$4);
         hbc $$18 = gjs.a($$0, $$9, this.d);
         feo $$19 = $$18.a($$3, gjh::e);
         if ($$12) {
            if ($$9 == dwg.b) {
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

   private void a(fek $$0, feo $$1, fyo $$2, float $$3, int $$4, int $$5) {
      $$2.a($$3);
      $$2.a($$0, $$1, $$4, $$5);
   }
}
