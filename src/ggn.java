import it.unimi.dsi.fastutil.longs.Long2ObjectMap;
import it.unimi.dsi.fastutil.longs.Long2ObjectOpenHashMap;
import javax.annotation.Nullable;

public class ggn {
   private final Long2ObjectMap<ggn.a> a = new Long2ObjectOpenHashMap();

   @Nullable
   public ggm a(dby $$0, iz $$1, iz $$2, int $$3) {
      int $$4 = kb.a($$1.u() - $$3);
      int $$5 = kb.a($$1.w() - $$3);
      int $$6 = kb.a($$2.u() + $$3);
      int $$7 = kb.a($$2.w() + $$3);
      ggn.a[][] $$8 = new ggn.a[$$6 - $$4 + 1][$$7 - $$5 + 1];

      for (int $$9 = $$4; $$9 <= $$6; $$9++) {
         for (int $$10 = $$5; $$10 <= $$7; $$10++) {
            $$8[$$9 - $$4][$$10 - $$5] = (ggn.a)this.a.computeIfAbsent(dbf.c($$9, $$10), $$1x -> new ggn.a($$0.d(dbf.a($$1x), dbf.b($$1x))));
         }
      }

      if (a($$1, $$2, $$4, $$5, $$8)) {
         return null;
      } else {
         ggl[][] $$11 = new ggl[$$6 - $$4 + 1][$$7 - $$5 + 1];

         for (int $$12 = $$4; $$12 <= $$6; $$12++) {
            for (int $$13 = $$5; $$13 <= $$7; $$13++) {
               $$11[$$12 - $$4][$$13 - $$5] = $$8[$$12 - $$4][$$13 - $$5].b();
            }
         }

         return new ggm($$0, $$4, $$5, $$11);
      }
   }

   private static boolean a(iz $$0, iz $$1, int $$2, int $$3, ggn.a[][] $$4) {
      int $$5 = kb.a($$0.u());
      int $$6 = kb.a($$0.w());
      int $$7 = kb.a($$1.u());
      int $$8 = kb.a($$1.w());

      for (int $$9 = $$5; $$9 <= $$7; $$9++) {
         for (int $$10 = $$6; $$10 <= $$8; $$10++) {
            dui $$11 = $$4[$$9 - $$2][$$10 - $$3].a();
            if (!$$11.a($$0.v(), $$1.v())) {
               return false;
            }
         }
      }

      return true;
   }

   static final class a {
      private final dui a;
      @Nullable
      private ggl b;

      a(dui $$0) {
         this.a = $$0;
      }

      public dui a() {
         return this.a;
      }

      public ggl b() {
         if (this.b == null) {
            this.b = new ggl(this.a);
         }

         return this.b;
      }
   }
}
