import it.unimi.dsi.fastutil.longs.Long2ObjectMap;
import it.unimi.dsi.fastutil.longs.Long2ObjectOpenHashMap;
import javax.annotation.Nullable;

public class gif {
   private final Long2ObjectMap<gif.a> a = new Long2ObjectOpenHashMap();

   @Nullable
   public gie a(dca $$0, ir $$1, ir $$2, int $$3) {
      int $$4 = jt.a($$1.u() - $$3);
      int $$5 = jt.a($$1.w() - $$3);
      int $$6 = jt.a($$2.u() + $$3);
      int $$7 = jt.a($$2.w() + $$3);
      gif.a[][] $$8 = new gif.a[$$6 - $$4 + 1][$$7 - $$5 + 1];

      for (int $$9 = $$4; $$9 <= $$6; $$9++) {
         for (int $$10 = $$5; $$10 <= $$7; $$10++) {
            $$8[$$9 - $$4][$$10 - $$5] = (gif.a)this.a.computeIfAbsent(dbh.c($$9, $$10), $$1x -> new gif.a($$0.c(dbh.a($$1x), dbh.b($$1x))));
         }
      }

      if (a($$1, $$2, $$4, $$5, $$8)) {
         return null;
      } else {
         gid[][] $$11 = new gid[$$6 - $$4 + 1][$$7 - $$5 + 1];

         for (int $$12 = $$4; $$12 <= $$6; $$12++) {
            for (int $$13 = $$5; $$13 <= $$7; $$13++) {
               $$11[$$12 - $$4][$$13 - $$5] = $$8[$$12 - $$4][$$13 - $$5].b();
            }
         }

         return new gie($$0, $$4, $$5, $$11);
      }
   }

   private static boolean a(ir $$0, ir $$1, int $$2, int $$3, gif.a[][] $$4) {
      int $$5 = jt.a($$0.u());
      int $$6 = jt.a($$0.w());
      int $$7 = jt.a($$1.u());
      int $$8 = jt.a($$1.w());

      for (int $$9 = $$5; $$9 <= $$7; $$9++) {
         for (int $$10 = $$6; $$10 <= $$8; $$10++) {
            dvi $$11 = $$4[$$9 - $$2][$$10 - $$3].a();
            if (!$$11.a($$0.v(), $$1.v())) {
               return false;
            }
         }
      }

      return true;
   }

   static final class a {
      private final dvi a;
      @Nullable
      private gid b;

      a(dvi $$0) {
         this.a = $$0;
      }

      public dvi a() {
         return this.a;
      }

      public gid b() {
         if (this.b == null) {
            this.b = new gid(this.a);
         }

         return this.b;
      }
   }
}
