import it.unimi.dsi.fastutil.longs.Long2ObjectMap;
import it.unimi.dsi.fastutil.longs.Long2ObjectOpenHashMap;
import javax.annotation.Nullable;

public class ggp {
   private final Long2ObjectMap<ggp.a> a = new Long2ObjectOpenHashMap();

   @Nullable
   public ggo a(dca $$0, iz $$1, iz $$2, int $$3) {
      int $$4 = kb.a($$1.u() - $$3);
      int $$5 = kb.a($$1.w() - $$3);
      int $$6 = kb.a($$2.u() + $$3);
      int $$7 = kb.a($$2.w() + $$3);
      ggp.a[][] $$8 = new ggp.a[$$6 - $$4 + 1][$$7 - $$5 + 1];

      for (int $$9 = $$4; $$9 <= $$6; $$9++) {
         for (int $$10 = $$5; $$10 <= $$7; $$10++) {
            $$8[$$9 - $$4][$$10 - $$5] = (ggp.a)this.a.computeIfAbsent(dbh.c($$9, $$10), $$1x -> new ggp.a($$0.d(dbh.a($$1x), dbh.b($$1x))));
         }
      }

      if (a($$1, $$2, $$4, $$5, $$8)) {
         return null;
      } else {
         ggn[][] $$11 = new ggn[$$6 - $$4 + 1][$$7 - $$5 + 1];

         for (int $$12 = $$4; $$12 <= $$6; $$12++) {
            for (int $$13 = $$5; $$13 <= $$7; $$13++) {
               $$11[$$12 - $$4][$$13 - $$5] = $$8[$$12 - $$4][$$13 - $$5].b();
            }
         }

         return new ggo($$0, $$4, $$5, $$11);
      }
   }

   private static boolean a(iz $$0, iz $$1, int $$2, int $$3, ggp.a[][] $$4) {
      int $$5 = kb.a($$0.u());
      int $$6 = kb.a($$0.w());
      int $$7 = kb.a($$1.u());
      int $$8 = kb.a($$1.w());

      for (int $$9 = $$5; $$9 <= $$7; $$9++) {
         for (int $$10 = $$6; $$10 <= $$8; $$10++) {
            duk $$11 = $$4[$$9 - $$2][$$10 - $$3].a();
            if (!$$11.a($$0.v(), $$1.v())) {
               return false;
            }
         }
      }

      return true;
   }

   static final class a {
      private final duk a;
      @Nullable
      private ggn b;

      a(duk $$0) {
         this.a = $$0;
      }

      public duk a() {
         return this.a;
      }

      public ggn b() {
         if (this.b == null) {
            this.b = new ggn(this.a);
         }

         return this.b;
      }
   }
}
