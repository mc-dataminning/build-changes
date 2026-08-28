import java.util.Calendar;

public class gop<T extends dty & dve> implements goj<T> {
   private final gbn a;
   private final gbn b;
   private final gbn c;
   private final boolean d = b();

   public gop(gok.a $$0) {
      this.a = new gbn($$0.a(gfb.V));
      this.b = new gbn($$0.a(gfb.at));
      this.c = new gbn($$0.a(gfb.au));
   }

   public static boolean b() {
      Calendar $$0 = Calendar.getInstance();
      return $$0.get(2) + 1 == 12 && $$0.get(5) >= 24 && $$0.get(5) <= 26;
   }

   @Override
   public void a(T $$0, float $$1, fft $$2, glx $$3, int $$4, int $$5) {
      dgh $$6 = $$0.i();
      boolean $$7 = $$6 != null;
      dww $$8 = $$7 ? $$0.m() : djn.cD.m().b(dko.c, jn.d);
      dxo $$9 = $$8.b(dko.d) ? $$8.c(dko.d) : dxo.a;
      if ($$8.b() instanceof dif<?> $$11) {
         boolean $$12 = $$9 != dxo.a;
         $$2.a();
         float $$13 = $$8.c(dko.c).p();
         $$2.a(0.5F, 0.5F, 0.5F);
         $$2.a(a.d.rotationDegrees(-$$13));
         $$2.a(-0.5F, -0.5F, -0.5F);
         dlt.c<? extends duf> $$14;
         if ($$7) {
            $$14 = $$11.a($$8, $$6, $$0.aA_(), true);
         } else {
            $$14 = dlt.b::b;
         }

         float $$16 = $$14.apply(dko.a($$0)).get($$1);
         $$16 = 1.0F - $$16;
         $$16 = 1.0F - $$16 * $$16 * $$16;
         int $$17 = $$14.apply(new gom<>()).applyAsInt($$4);
         hgy $$18 = gms.a($$0, $$9, this.d);
         ffx $$19 = $$18.a($$3, gmh::f);
         if ($$12) {
            if ($$9 == dxo.b) {
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

   private void a(fft $$0, ffx $$1, gbn $$2, float $$3, int $$4, int $$5) {
      $$2.a($$3);
      $$2.a($$0, $$1, $$4, $$5);
   }
}
