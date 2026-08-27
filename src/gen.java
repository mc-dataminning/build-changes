import it.unimi.dsi.fastutil.longs.Long2ObjectMap;
import it.unimi.dsi.fastutil.longs.Long2ObjectOpenHashMap;
import javax.annotation.Nullable;

public class gen {
   private final Long2ObjectMap<gen.a> a = new Long2ObjectOpenHashMap();

   @Nullable
   public gem a(dad $$0, in $$1, in $$2, int $$3) {
      int $$4 = jp.a($$1.u() - $$3);
      int $$5 = jp.a($$1.w() - $$3);
      int $$6 = jp.a($$2.u() + $$3);
      int $$7 = jp.a($$2.w() + $$3);
      gen.a[][] $$8 = new gen.a[$$6 - $$4 + 1][$$7 - $$5 + 1];

      for (int $$9 = $$4; $$9 <= $$6; $$9++) {
         for (int $$10 = $$5; $$10 <= $$7; $$10++) {
            $$8[$$9 - $$4][$$10 - $$5] = (gen.a)this.a.computeIfAbsent(czk.c($$9, $$10), $$1x -> new gen.a($$0.d(czk.a($$1x), czk.b($$1x))));
         }
      }

      if (a($$1, $$2, $$4, $$5, $$8)) {
         return null;
      } else {
         gel[][] $$11 = new gel[$$6 - $$4 + 1][$$7 - $$5 + 1];

         for (int $$12 = $$4; $$12 <= $$6; $$12++) {
            for (int $$13 = $$5; $$13 <= $$7; $$13++) {
               $$11[$$12 - $$4][$$13 - $$5] = $$8[$$12 - $$4][$$13 - $$5].b();
            }
         }

         return new gem($$0, $$4, $$5, $$11);
      }
   }

   private static boolean a(in $$0, in $$1, int $$2, int $$3, gen.a[][] $$4) {
      int $$5 = jp.a($$0.u());
      int $$6 = jp.a($$0.w());
      int $$7 = jp.a($$1.u());
      int $$8 = jp.a($$1.w());

      for (int $$9 = $$5; $$9 <= $$7; $$9++) {
         for (int $$10 = $$6; $$10 <= $$8; $$10++) {
            dsn $$11 = $$4[$$9 - $$2][$$10 - $$3].a();
            if (!$$11.a($$0.v(), $$1.v())) {
               return false;
            }
         }
      }

      return true;
   }

   static final class a {
      private final dsn a;
      @Nullable
      private gel b;

      a(dsn $$0) {
         this.a = $$0;
      }

      public dsn a() {
         return this.a;
      }

      public gel b() {
         if (this.b == null) {
            this.b = new gel(this.a);
         }

         return this.b;
      }
   }
}
