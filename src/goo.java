import java.util.Calendar;

public class goo<T extends dtz & dvf> implements goi<T> {
   private final gbn a;
   private final gbn b;
   private final gbn c;
   private final boolean d = b();

   public goo(goj.a $$0) {
      this.a = new gbn($$0.a(gfb.V));
      this.b = new gbn($$0.a(gfb.at));
      this.c = new gbn($$0.a(gfb.au));
   }

   public static boolean b() {
      Calendar $$0 = Calendar.getInstance();
      return $$0.get(2) + 1 == 12 && $$0.get(5) >= 24 && $$0.get(5) <= 26;
   }

   @Override
   public void a(T $$0, float $$1, ffu $$2, glx $$3, int $$4, int $$5) {
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
         int $$17 = $$14.apply(new gol<>()).applyAsInt($$4);
         hgs $$18 = gms.a($$0, $$9, this.d);
         ffy $$19 = $$18.a($$3, gmh::f);
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

   private void a(ffu $$0, ffy $$1, gbn $$2, float $$3, int $$4, int $$5) {
      $$2.a($$3);
      $$2.a($$0, $$1, $$4, $$5);
   }
}
