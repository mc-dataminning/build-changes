import java.util.Calendar;

public class gnx<T extends duq & dvw> implements gnr<T> {
   private final gau a;
   private final gau b;
   private final gau c;
   private boolean d;

   public gnx(gns.a $$0) {
      Calendar $$1 = Calendar.getInstance();
      if ($$1.get(2) + 1 == 12 && $$1.get(5) >= 24 && $$1.get(5) <= 26) {
         this.d = true;
      }

      this.a = new gau($$0.a(gei.V));
      this.b = new gau($$0.a(gei.at));
      this.c = new gau($$0.a(gei.au));
   }

   @Override
   public void a(T $$0, float $$1, fgl $$2, glg $$3, int $$4, int $$5) {
      dgz $$6 = $$0.i();
      boolean $$7 = $$6 != null;
      dxo $$8 = $$7 ? $$0.m() : dkf.cD.m().b(dlg.c, jm.d);
      dyg $$9 = $$8.b(dlg.d) ? $$8.c(dlg.d) : dyg.a;
      if ($$8.b() instanceof dix<?> $$11) {
         boolean $$12 = $$9 != dyg.a;
         $$2.a();
         float $$13 = $$8.c(dlg.c).p();
         $$2.a(0.5F, 0.5F, 0.5F);
         $$2.a(a.d.rotationDegrees(-$$13));
         $$2.a(-0.5F, -0.5F, -0.5F);
         dml.c<? extends dux> $$14;
         if ($$7) {
            $$14 = $$11.a($$8, $$6, $$0.aB_(), true);
         } else {
            $$14 = dml.b::b;
         }

         float $$16 = $$14.apply(dlg.a($$0)).get($$1);
         $$16 = 1.0F - $$16;
         $$16 = 1.0F - $$16 * $$16 * $$16;
         int $$17 = $$14.apply(new gnu<>()).applyAsInt($$4);
         hdp $$18 = gmb.a($$0, $$9, this.d);
         fgp $$19 = $$18.a($$3, glq::f);
         if ($$12) {
            if ($$9 == dyg.b) {
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

   private void a(fgl $$0, fgp $$1, gau $$2, float $$3, int $$4, int $$5) {
      $$2.a($$3);
      $$2.a($$0, $$1, $$4, $$5);
   }
}
