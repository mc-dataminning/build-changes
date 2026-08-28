import it.unimi.dsi.fastutil.longs.Long2ObjectMap;
import it.unimi.dsi.fastutil.longs.Long2ObjectOpenHashMap;
import javax.annotation.Nullable;

public class ggl {
   private final Long2ObjectMap<ggl.a> a = new Long2ObjectOpenHashMap();

   @Nullable
   public ggk a(dbw $$0, iz $$1, iz $$2, int $$3) {
      int $$4 = kb.a($$1.u() - $$3);
      int $$5 = kb.a($$1.w() - $$3);
      int $$6 = kb.a($$2.u() + $$3);
      int $$7 = kb.a($$2.w() + $$3);
      ggl.a[][] $$8 = new ggl.a[$$6 - $$4 + 1][$$7 - $$5 + 1];

      for (int $$9 = $$4; $$9 <= $$6; $$9++) {
         for (int $$10 = $$5; $$10 <= $$7; $$10++) {
            $$8[$$9 - $$4][$$10 - $$5] = (ggl.a)this.a.computeIfAbsent(dbd.c($$9, $$10), $$1x -> new ggl.a($$0.d(dbd.a($$1x), dbd.b($$1x))));
         }
      }

      if (a($$1, $$2, $$4, $$5, $$8)) {
         return null;
      } else {
         ggj[][] $$11 = new ggj[$$6 - $$4 + 1][$$7 - $$5 + 1];

         for (int $$12 = $$4; $$12 <= $$6; $$12++) {
            for (int $$13 = $$5; $$13 <= $$7; $$13++) {
               $$11[$$12 - $$4][$$13 - $$5] = $$8[$$12 - $$4][$$13 - $$5].b();
            }
         }

         return new ggk($$0, $$4, $$5, $$11);
      }
   }

   private static boolean a(iz $$0, iz $$1, int $$2, int $$3, ggl.a[][] $$4) {
      int $$5 = kb.a($$0.u());
      int $$6 = kb.a($$0.w());
      int $$7 = kb.a($$1.u());
      int $$8 = kb.a($$1.w());

      for (int $$9 = $$5; $$9 <= $$7; $$9++) {
         for (int $$10 = $$6; $$10 <= $$8; $$10++) {
            dug $$11 = $$4[$$9 - $$2][$$10 - $$3].a();
            if (!$$11.a($$0.v(), $$1.v())) {
               return false;
            }
         }
      }

      return true;
   }

   static final class a {
      private final dug a;
      @Nullable
      private ggj b;

      a(dug $$0) {
         this.a = $$0;
      }

      public dug a() {
         return this.a;
      }

      public ggj b() {
         if (this.b == null) {
            this.b = new ggj(this.a);
         }

         return this.b;
      }
   }
}
