import it.unimi.dsi.fastutil.longs.Long2ObjectMap;
import it.unimi.dsi.fastutil.longs.Long2ObjectOpenHashMap;
import javax.annotation.Nullable;

public class gcy {
   private final Long2ObjectMap<gcy.a> a = new Long2ObjectOpenHashMap();

   @Nullable
   public gcx a(cyx $$0, ib $$1, ib $$2, int $$3) {
      int $$4 = je.a($$1.u() - $$3);
      int $$5 = je.a($$1.w() - $$3);
      int $$6 = je.a($$2.u() + $$3);
      int $$7 = je.a($$2.w() + $$3);
      gcy.a[][] $$8 = new gcy.a[$$6 - $$4 + 1][$$7 - $$5 + 1];

      for (int $$9 = $$4; $$9 <= $$6; $$9++) {
         for (int $$10 = $$5; $$10 <= $$7; $$10++) {
            $$8[$$9 - $$4][$$10 - $$5] = (gcy.a)this.a.computeIfAbsent(cye.c($$9, $$10), $$1x -> new gcy.a($$0.d(cye.a($$1x), cye.b($$1x))));
         }
      }

      if (a($$1, $$2, $$4, $$5, $$8)) {
         return null;
      } else {
         gcw[][] $$11 = new gcw[$$6 - $$4 + 1][$$7 - $$5 + 1];

         for (int $$12 = $$4; $$12 <= $$6; $$12++) {
            for (int $$13 = $$5; $$13 <= $$7; $$13++) {
               $$11[$$12 - $$4][$$13 - $$5] = $$8[$$12 - $$4][$$13 - $$5].b();
            }
         }

         return new gcx($$0, $$4, $$5, $$11);
      }
   }

   private static boolean a(ib $$0, ib $$1, int $$2, int $$3, gcy.a[][] $$4) {
      int $$5 = je.a($$0.u());
      int $$6 = je.a($$0.w());
      int $$7 = je.a($$1.u());
      int $$8 = je.a($$1.w());

      for (int $$9 = $$5; $$9 <= $$7; $$9++) {
         for (int $$10 = $$6; $$10 <= $$8; $$10++) {
            drf $$11 = $$4[$$9 - $$2][$$10 - $$3].a();
            if (!$$11.a($$0.v(), $$1.v())) {
               return false;
            }
         }
      }

      return true;
   }

   static final class a {
      private final drf a;
      @Nullable
      private gcw b;

      a(drf $$0) {
         this.a = $$0;
      }

      public drf a() {
         return this.a;
      }

      public gcw b() {
         if (this.b == null) {
            this.b = new gcw(this.a);
         }

         return this.b;
      }
   }
}
