import it.unimi.dsi.fastutil.longs.Long2ObjectMap;
import it.unimi.dsi.fastutil.longs.Long2ObjectOpenHashMap;
import javax.annotation.Nullable;

public class ghc {
   private final Long2ObjectMap<ghc.a> a = new Long2ObjectOpenHashMap();

   @Nullable
   public ghb a(dcf $$0, ja $$1, ja $$2, int $$3) {
      int $$4 = kc.a($$1.u() - $$3);
      int $$5 = kc.a($$1.w() - $$3);
      int $$6 = kc.a($$2.u() + $$3);
      int $$7 = kc.a($$2.w() + $$3);
      ghc.a[][] $$8 = new ghc.a[$$6 - $$4 + 1][$$7 - $$5 + 1];

      for (int $$9 = $$4; $$9 <= $$6; $$9++) {
         for (int $$10 = $$5; $$10 <= $$7; $$10++) {
            $$8[$$9 - $$4][$$10 - $$5] = (ghc.a)this.a.computeIfAbsent(dbm.c($$9, $$10), $$1x -> new ghc.a($$0.d(dbm.a($$1x), dbm.b($$1x))));
         }
      }

      if (a($$1, $$2, $$4, $$5, $$8)) {
         return null;
      } else {
         gha[][] $$11 = new gha[$$6 - $$4 + 1][$$7 - $$5 + 1];

         for (int $$12 = $$4; $$12 <= $$6; $$12++) {
            for (int $$13 = $$5; $$13 <= $$7; $$13++) {
               $$11[$$12 - $$4][$$13 - $$5] = $$8[$$12 - $$4][$$13 - $$5].b();
            }
         }

         return new ghb($$0, $$4, $$5, $$11);
      }
   }

   private static boolean a(ja $$0, ja $$1, int $$2, int $$3, ghc.a[][] $$4) {
      int $$5 = kc.a($$0.u());
      int $$6 = kc.a($$0.w());
      int $$7 = kc.a($$1.u());
      int $$8 = kc.a($$1.w());

      for (int $$9 = $$5; $$9 <= $$7; $$9++) {
         for (int $$10 = $$6; $$10 <= $$8; $$10++) {
            duq $$11 = $$4[$$9 - $$2][$$10 - $$3].a();
            if (!$$11.a($$0.v(), $$1.v())) {
               return false;
            }
         }
      }

      return true;
   }

   static final class a {
      private final duq a;
      @Nullable
      private gha b;

      a(duq $$0) {
         this.a = $$0;
      }

      public duq a() {
         return this.a;
      }

      public gha b() {
         if (this.b == null) {
            this.b = new gha(this.a);
         }

         return this.b;
      }
   }
}
