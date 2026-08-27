import it.unimi.dsi.fastutil.longs.Long2ObjectMap;
import it.unimi.dsi.fastutil.longs.Long2ObjectOpenHashMap;
import javax.annotation.Nullable;

public class gfj {
   private final Long2ObjectMap<gfj.a> a = new Long2ObjectOpenHashMap();

   @Nullable
   public gfi a(dax $$0, io $$1, io $$2, int $$3) {
      int $$4 = jq.a($$1.u() - $$3);
      int $$5 = jq.a($$1.w() - $$3);
      int $$6 = jq.a($$2.u() + $$3);
      int $$7 = jq.a($$2.w() + $$3);
      gfj.a[][] $$8 = new gfj.a[$$6 - $$4 + 1][$$7 - $$5 + 1];

      for (int $$9 = $$4; $$9 <= $$6; $$9++) {
         for (int $$10 = $$5; $$10 <= $$7; $$10++) {
            $$8[$$9 - $$4][$$10 - $$5] = (gfj.a)this.a.computeIfAbsent(dae.c($$9, $$10), $$1x -> new gfj.a($$0.d(dae.a($$1x), dae.b($$1x))));
         }
      }

      if (a($$1, $$2, $$4, $$5, $$8)) {
         return null;
      } else {
         gfh[][] $$11 = new gfh[$$6 - $$4 + 1][$$7 - $$5 + 1];

         for (int $$12 = $$4; $$12 <= $$6; $$12++) {
            for (int $$13 = $$5; $$13 <= $$7; $$13++) {
               $$11[$$12 - $$4][$$13 - $$5] = $$8[$$12 - $$4][$$13 - $$5].b();
            }
         }

         return new gfi($$0, $$4, $$5, $$11);
      }
   }

   private static boolean a(io $$0, io $$1, int $$2, int $$3, gfj.a[][] $$4) {
      int $$5 = jq.a($$0.u());
      int $$6 = jq.a($$0.w());
      int $$7 = jq.a($$1.u());
      int $$8 = jq.a($$1.w());

      for (int $$9 = $$5; $$9 <= $$7; $$9++) {
         for (int $$10 = $$6; $$10 <= $$8; $$10++) {
            dth $$11 = $$4[$$9 - $$2][$$10 - $$3].a();
            if (!$$11.a($$0.v(), $$1.v())) {
               return false;
            }
         }
      }

      return true;
   }

   static final class a {
      private final dth a;
      @Nullable
      private gfh b;

      a(dth $$0) {
         this.a = $$0;
      }

      public dth a() {
         return this.a;
      }

      public gfh b() {
         if (this.b == null) {
            this.b = new gfh(this.a);
         }

         return this.b;
      }
   }
}
