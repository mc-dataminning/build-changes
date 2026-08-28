import java.util.Calendar;

public class guu<T extends dyc & dzj> implements gun<T> {
   private final ghk a;
   private final ghk b;
   private final ghk c;
   private final boolean d = b();

   public guu(guo.a $$0) {
      this.a = new ghk($$0.a(gld.X));
      this.b = new ghk($$0.a(gld.aD));
      this.c = new ghk($$0.a(gld.aE));
   }

   public static boolean b() {
      Calendar $$0 = Calendar.getInstance();
      return $$0.get(2) + 1 == 12 && $$0.get(5) >= 24 && $$0.get(5) <= 26;
   }

   @Override
   public void a(T $$0, float $$1, flo $$2, gsa $$3, int $$4, int $$5, ffq $$6) {
      djx $$7 = $$0.i();
      boolean $$8 = $$7 != null;
      ebe $$9 = $$8 ? $$0.m() : dne.cG.m().b(dog.c, jb.d);
      ebw $$10 = $$9.b(dog.d) ? $$9.c(dog.d) : ebw.a;
      if ($$9.b() instanceof dlw<?> $$12) {
         boolean $$13 = $$10 != ebw.a;
         $$2.a();
         float $$14 = $$9.c(dog.c).p();
         $$2.a(0.5F, 0.5F, 0.5F);
         $$2.a(a.d.rotationDegrees(-$$14));
         $$2.a(-0.5F, -0.5F, -0.5F);
         dpk.c<? extends dyk> $$15;
         if ($$8) {
            $$15 = $$12.a($$9, $$7, $$0.aB_(), true);
         } else {
            $$15 = dpk.b::b;
         }

         float $$17 = $$15.apply(dog.a($$0)).get($$1);
         $$17 = 1.0F - $$17;
         $$17 = 1.0F - $$17 * $$17 * $$17;
         int $$18 = $$15.apply(new gur<>()).applyAsInt($$4);
         hnh $$19 = gsu.a($$0, $$10, this.d);
         flr $$20 = $$19.a($$3, gsl::f);
         if ($$13) {
            if ($$10 == ebw.b) {
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

   private void a(flo $$0, flr $$1, ghk $$2, float $$3, int $$4, int $$5) {
      $$2.a($$3);
      $$2.a($$0, $$1, $$4, $$5);
   }
}
