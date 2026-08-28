import java.util.Calendar;

public class gnv<T extends dup & dvv> implements gnp<T> {
   private final gas a;
   private final gas b;
   private final gas c;
   private boolean d;

   public gnv(gnq.a $$0) {
      Calendar $$1 = Calendar.getInstance();
      if ($$1.get(2) + 1 == 12 && $$1.get(5) >= 24 && $$1.get(5) <= 26) {
         this.d = true;
      }

      this.a = new gas($$0.a(geg.S));
      this.b = new gas($$0.a(geg.aq));
      this.c = new gas($$0.a(geg.ar));
   }

   @Override
   public void a(T $$0, float $$1, fgl $$2, gle $$3, int $$4, int $$5) {
      dha $$6 = $$0.i();
      boolean $$7 = $$6 != null;
      dxn $$8 = $$7 ? $$0.m() : dkg.cD.m().b(dli.c, jm.d);
      dyf $$9 = $$8.b(dli.d) ? $$8.c(dli.d) : dyf.a;
      if ($$8.b() instanceof diy<?> $$11) {
         boolean $$12 = $$9 != dyf.a;
         $$2.a();
         float $$13 = $$8.c(dli.c).p();
         $$2.a(0.5F, 0.5F, 0.5F);
         $$2.a(a.d.rotationDegrees(-$$13));
         $$2.a(-0.5F, -0.5F, -0.5F);
         dmn.c<? extends duw> $$14;
         if ($$7) {
            $$14 = $$11.a($$8, $$6, $$0.aB_(), true);
         } else {
            $$14 = dmn.b::b;
         }

         float $$16 = $$14.apply(dli.a($$0)).get($$1);
         $$16 = 1.0F - $$16;
         $$16 = 1.0F - $$16 * $$16 * $$16;
         int $$17 = $$14.apply(new gns<>()).applyAsInt($$4);
         hdn $$18 = glz.a($$0, $$9, this.d);
         fgp $$19 = $$18.a($$3, glo::e);
         if ($$12) {
            if ($$9 == dyf.b) {
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

   private void a(fgl $$0, fgp $$1, gas $$2, float $$3, int $$4, int $$5) {
      $$2.a($$3);
      $$2.a($$0, $$1, $$4, $$5);
   }
}
