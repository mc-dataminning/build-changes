import it.unimi.dsi.fastutil.longs.Long2ObjectMap;
import it.unimi.dsi.fastutil.longs.Long2ObjectOpenHashMap;
import javax.annotation.Nullable;

public class ggm {
   private final Long2ObjectMap<ggm.a> a = new Long2ObjectOpenHashMap();

   @Nullable
   public ggl a(dbx $$0, iz $$1, iz $$2, int $$3) {
      int $$4 = kb.a($$1.u() - $$3);
      int $$5 = kb.a($$1.w() - $$3);
      int $$6 = kb.a($$2.u() + $$3);
      int $$7 = kb.a($$2.w() + $$3);
      ggm.a[][] $$8 = new ggm.a[$$6 - $$4 + 1][$$7 - $$5 + 1];

      for (int $$9 = $$4; $$9 <= $$6; $$9++) {
         for (int $$10 = $$5; $$10 <= $$7; $$10++) {
            $$8[$$9 - $$4][$$10 - $$5] = (ggm.a)this.a.computeIfAbsent(dbe.c($$9, $$10), $$1x -> new ggm.a($$0.d(dbe.a($$1x), dbe.b($$1x))));
         }
      }

      if (a($$1, $$2, $$4, $$5, $$8)) {
         return null;
      } else {
         ggk[][] $$11 = new ggk[$$6 - $$4 + 1][$$7 - $$5 + 1];

         for (int $$12 = $$4; $$12 <= $$6; $$12++) {
            for (int $$13 = $$5; $$13 <= $$7; $$13++) {
               $$11[$$12 - $$4][$$13 - $$5] = $$8[$$12 - $$4][$$13 - $$5].b();
            }
         }

         return new ggl($$0, $$4, $$5, $$11);
      }
   }

   private static boolean a(iz $$0, iz $$1, int $$2, int $$3, ggm.a[][] $$4) {
      int $$5 = kb.a($$0.u());
      int $$6 = kb.a($$0.w());
      int $$7 = kb.a($$1.u());
      int $$8 = kb.a($$1.w());

      for (int $$9 = $$5; $$9 <= $$7; $$9++) {
         for (int $$10 = $$6; $$10 <= $$8; $$10++) {
            duh $$11 = $$4[$$9 - $$2][$$10 - $$3].a();
            if (!$$11.a($$0.v(), $$1.v())) {
               return false;
            }
         }
      }

      return true;
   }

   static final class a {
      private final duh a;
      @Nullable
      private ggk b;

      a(duh $$0) {
         this.a = $$0;
      }

      public duh a() {
         return this.a;
      }

      public ggk b() {
         if (this.b == null) {
            this.b = new ggk(this.a);
         }

         return this.b;
      }
   }
}
