import it.unimi.dsi.fastutil.longs.Long2ObjectMap;
import it.unimi.dsi.fastutil.longs.Long2ObjectOpenHashMap;
import javax.annotation.Nullable;

public class ged {
   private final Long2ObjectMap<ged.a> a = new Long2ObjectOpenHashMap();

   @Nullable
   public gec a(czu $$0, im $$1, im $$2, int $$3) {
      int $$4 = jo.a($$1.u() - $$3);
      int $$5 = jo.a($$1.w() - $$3);
      int $$6 = jo.a($$2.u() + $$3);
      int $$7 = jo.a($$2.w() + $$3);
      ged.a[][] $$8 = new ged.a[$$6 - $$4 + 1][$$7 - $$5 + 1];

      for (int $$9 = $$4; $$9 <= $$6; $$9++) {
         for (int $$10 = $$5; $$10 <= $$7; $$10++) {
            $$8[$$9 - $$4][$$10 - $$5] = (ged.a)this.a.computeIfAbsent(czb.c($$9, $$10), $$1x -> new ged.a($$0.d(czb.a($$1x), czb.b($$1x))));
         }
      }

      if (a($$1, $$2, $$4, $$5, $$8)) {
         return null;
      } else {
         geb[][] $$11 = new geb[$$6 - $$4 + 1][$$7 - $$5 + 1];

         for (int $$12 = $$4; $$12 <= $$6; $$12++) {
            for (int $$13 = $$5; $$13 <= $$7; $$13++) {
               $$11[$$12 - $$4][$$13 - $$5] = $$8[$$12 - $$4][$$13 - $$5].b();
            }
         }

         return new gec($$0, $$4, $$5, $$11);
      }
   }

   private static boolean a(im $$0, im $$1, int $$2, int $$3, ged.a[][] $$4) {
      int $$5 = jo.a($$0.u());
      int $$6 = jo.a($$0.w());
      int $$7 = jo.a($$1.u());
      int $$8 = jo.a($$1.w());

      for (int $$9 = $$5; $$9 <= $$7; $$9++) {
         for (int $$10 = $$6; $$10 <= $$8; $$10++) {
            dse $$11 = $$4[$$9 - $$2][$$10 - $$3].a();
            if (!$$11.a($$0.v(), $$1.v())) {
               return false;
            }
         }
      }

      return true;
   }

   static final class a {
      private final dse a;
      @Nullable
      private geb b;

      a(dse $$0) {
         this.a = $$0;
      }

      public dse a() {
         return this.a;
      }

      public geb b() {
         if (this.b == null) {
            this.b = new geb(this.a);
         }

         return this.b;
      }
   }
}
