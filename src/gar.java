import it.unimi.dsi.fastutil.longs.Long2ObjectMap;
import it.unimi.dsi.fastutil.longs.Long2ObjectOpenHashMap;
import javax.annotation.Nullable;

public class gar {
   private final Long2ObjectMap<gar.a> a = new Long2ObjectOpenHashMap();

   @Nullable
   public gaq a(cxb $$0, ib $$1, ib $$2, int $$3) {
      int $$4 = je.a($$1.u() - $$3);
      int $$5 = je.a($$1.w() - $$3);
      int $$6 = je.a($$2.u() + $$3);
      int $$7 = je.a($$2.w() + $$3);
      gar.a[][] $$8 = new gar.a[$$6 - $$4 + 1][$$7 - $$5 + 1];

      for (int $$9 = $$4; $$9 <= $$6; $$9++) {
         for (int $$10 = $$5; $$10 <= $$7; $$10++) {
            $$8[$$9 - $$4][$$10 - $$5] = (gar.a)this.a.computeIfAbsent(cwi.c($$9, $$10), $$1x -> new gar.a($$0.d(cwi.a($$1x), cwi.b($$1x))));
         }
      }

      if (a($$1, $$2, $$4, $$5, $$8)) {
         return null;
      } else {
         gap[][] $$11 = new gap[$$6 - $$4 + 1][$$7 - $$5 + 1];

         for (int $$12 = $$4; $$12 <= $$6; $$12++) {
            for (int $$13 = $$5; $$13 <= $$7; $$13++) {
               $$11[$$12 - $$4][$$13 - $$5] = $$8[$$12 - $$4][$$13 - $$5].b();
            }
         }

         return new gaq($$0, $$4, $$5, $$11);
      }
   }

   private static boolean a(ib $$0, ib $$1, int $$2, int $$3, gar.a[][] $$4) {
      int $$5 = je.a($$0.u());
      int $$6 = je.a($$0.w());
      int $$7 = je.a($$1.u());
      int $$8 = je.a($$1.w());

      for (int $$9 = $$5; $$9 <= $$7; $$9++) {
         for (int $$10 = $$6; $$10 <= $$8; $$10++) {
            dpi $$11 = $$4[$$9 - $$2][$$10 - $$3].a();
            if (!$$11.a($$0.v(), $$1.v())) {
               return false;
            }
         }
      }

      return true;
   }

   static final class a {
      private final dpi a;
      @Nullable
      private gap b;

      a(dpi $$0) {
         this.a = $$0;
      }

      public dpi a() {
         return this.a;
      }

      public gap b() {
         if (this.b == null) {
            this.b = new gap(this.a);
         }

         return this.b;
      }
   }
}
