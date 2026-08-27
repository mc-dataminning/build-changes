import it.unimi.dsi.fastutil.longs.Long2ObjectMap;
import it.unimi.dsi.fastutil.longs.Long2ObjectOpenHashMap;
import javax.annotation.Nullable;

public class gdh {
   private final Long2ObjectMap<gdh.a> a = new Long2ObjectOpenHashMap();

   @Nullable
   public gdg a(czg $$0, id $$1, id $$2, int $$3) {
      int $$4 = jg.a($$1.u() - $$3);
      int $$5 = jg.a($$1.w() - $$3);
      int $$6 = jg.a($$2.u() + $$3);
      int $$7 = jg.a($$2.w() + $$3);
      gdh.a[][] $$8 = new gdh.a[$$6 - $$4 + 1][$$7 - $$5 + 1];

      for (int $$9 = $$4; $$9 <= $$6; $$9++) {
         for (int $$10 = $$5; $$10 <= $$7; $$10++) {
            $$8[$$9 - $$4][$$10 - $$5] = (gdh.a)this.a.computeIfAbsent(cyn.c($$9, $$10), $$1x -> new gdh.a($$0.d(cyn.a($$1x), cyn.b($$1x))));
         }
      }

      if (a($$1, $$2, $$4, $$5, $$8)) {
         return null;
      } else {
         gdf[][] $$11 = new gdf[$$6 - $$4 + 1][$$7 - $$5 + 1];

         for (int $$12 = $$4; $$12 <= $$6; $$12++) {
            for (int $$13 = $$5; $$13 <= $$7; $$13++) {
               $$11[$$12 - $$4][$$13 - $$5] = $$8[$$12 - $$4][$$13 - $$5].b();
            }
         }

         return new gdg($$0, $$4, $$5, $$11);
      }
   }

   private static boolean a(id $$0, id $$1, int $$2, int $$3, gdh.a[][] $$4) {
      int $$5 = jg.a($$0.u());
      int $$6 = jg.a($$0.w());
      int $$7 = jg.a($$1.u());
      int $$8 = jg.a($$1.w());

      for (int $$9 = $$5; $$9 <= $$7; $$9++) {
         for (int $$10 = $$6; $$10 <= $$8; $$10++) {
            dro $$11 = $$4[$$9 - $$2][$$10 - $$3].a();
            if (!$$11.a($$0.v(), $$1.v())) {
               return false;
            }
         }
      }

      return true;
   }

   static final class a {
      private final dro a;
      @Nullable
      private gdf b;

      a(dro $$0) {
         this.a = $$0;
      }

      public dro a() {
         return this.a;
      }

      public gdf b() {
         if (this.b == null) {
            this.b = new gdf(this.a);
         }

         return this.b;
      }
   }
}
