import com.google.common.annotations.VisibleForTesting;
import com.mojang.datafixers.util.Pair;
import it.unimi.dsi.fastutil.ints.IntArrayList;
import it.unimi.dsi.fastutil.ints.IntStack;
import java.util.Optional;
import java.util.function.Predicate;

public class l {
   public static l.a a(iz $$0, je.a $$1, int $$2, je.a $$3, int $$4, Predicate<iz> $$5) {
      iz.a $$6 = $$0.j();
      je $$7 = je.a(je.b.b, $$1);
      je $$8 = $$7.g();
      je $$9 = je.a(je.b.b, $$3);
      je $$10 = $$9.g();
      int $$11 = a($$5, $$6.g($$0), $$7, $$2);
      int $$12 = a($$5, $$6.g($$0), $$8, $$2);
      int $$13 = $$11;
      l.b[] $$14 = new l.b[$$11 + 1 + $$12];
      $$14[$$11] = new l.b(a($$5, $$6.g($$0), $$9, $$4), a($$5, $$6.g($$0), $$10, $$4));
      int $$15 = $$14[$$11].a;

      for (int $$16 = 1; $$16 <= $$11; $$16++) {
         l.b $$17 = $$14[$$13 - ($$16 - 1)];
         $$14[$$13 - $$16] = new l.b(a($$5, $$6.g($$0).c($$7, $$16), $$9, $$17.a), a($$5, $$6.g($$0).c($$7, $$16), $$10, $$17.b));
      }

      for (int $$18 = 1; $$18 <= $$12; $$18++) {
         l.b $$19 = $$14[$$13 + $$18 - 1];
         $$14[$$13 + $$18] = new l.b(a($$5, $$6.g($$0).c($$8, $$18), $$9, $$19.a), a($$5, $$6.g($$0).c($$8, $$18), $$10, $$19.b));
      }

      int $$20 = 0;
      int $$21 = 0;
      int $$22 = 0;
      int $$23 = 0;
      int[] $$24 = new int[$$14.length];

      for (int $$25 = $$15; $$25 >= 0; $$25--) {
         for (int $$26 = 0; $$26 < $$14.length; $$26++) {
            l.b $$27 = $$14[$$26];
            int $$28 = $$15 - $$27.a;
            int $$29 = $$15 + $$27.b;
            $$24[$$26] = $$25 >= $$28 && $$25 <= $$29 ? $$29 + 1 - $$25 : 0;
         }

         Pair<l.b, Integer> $$30 = a($$24);
         l.b $$31 = (l.b)$$30.getFirst();
         int $$32 = 1 + $$31.b - $$31.a;
         int $$33 = (Integer)$$30.getSecond();
         if ($$32 * $$33 > $$22 * $$23) {
            $$20 = $$31.a;
            $$21 = $$25;
            $$22 = $$32;
            $$23 = $$33;
         }
      }

      return new l.a($$0.a($$1, $$20 - $$13).a($$3, $$21 - $$15), $$22, $$23);
   }

   private static int a(Predicate<iz> $$0, iz.a $$1, je $$2, int $$3) {
      int $$4 = 0;

      while ($$4 < $$3 && $$0.test($$1.c($$2))) {
         $$4++;
      }

      return $$4;
   }

   @VisibleForTesting
   static Pair<l.b, Integer> a(int[] $$0) {
      int $$1 = 0;
      int $$2 = 0;
      int $$3 = 0;
      IntStack $$4 = new IntArrayList();
      $$4.push(0);

      for (int $$5 = 1; $$5 <= $$0.length; $$5++) {
         int $$6 = $$5 == $$0.length ? 0 : $$0[$$5];

         while (!$$4.isEmpty()) {
            int $$7 = $$0[$$4.topInt()];
            if ($$6 >= $$7) {
               $$4.push($$5);
               break;
            }

            $$4.popInt();
            int $$8 = $$4.isEmpty() ? 0 : $$4.topInt() + 1;
            if ($$7 * ($$5 - $$8) > $$3 * ($$2 - $$1)) {
               $$2 = $$5;
               $$1 = $$8;
               $$3 = $$7;
            }
         }

         if ($$4.isEmpty()) {
            $$4.push($$5);
         }
      }

      return new Pair(new l.b($$1, $$2 - 1), $$3);
   }

   public static Optional<iz> a(dbg $$0, iz $$1, dfb $$2, je $$3, dfb $$4) {
      iz.a $$5 = $$1.j();

      dse $$6;
      do {
         $$5.c($$3);
         $$6 = $$0.a_($$5);
      } while ($$6.a($$2));

      return $$6.a($$4) ? Optional.of($$5) : Optional.empty();
   }

   public static class a {
      public final iz a;
      public final int b;
      public final int c;

      public a(iz $$0, int $$1, int $$2) {
         this.a = $$0;
         this.b = $$1;
         this.c = $$2;
      }
   }

   public static class b {
      public final int a;
      public final int b;

      public b(int $$0, int $$1) {
         this.a = $$0;
         this.b = $$1;
      }

      @Override
      public String toString() {
         return "IntBounds{min=" + this.a + ", max=" + this.b + "}";
      }
   }
}
