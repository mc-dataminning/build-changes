import it.unimi.dsi.fastutil.longs.Long2ObjectMap;
import it.unimi.dsi.fastutil.longs.Long2ObjectOpenHashMap;
import javax.annotation.Nullable;

public class fwd {
   private final Long2ObjectMap<fwd.a> a = new Long2ObjectOpenHashMap();

   @Nullable
   public fwc a(cto $$0, hx $$1, hx $$2, int $$3) {
      int $$4 = iz.a($$1.u() - $$3);
      int $$5 = iz.a($$1.w() - $$3);
      int $$6 = iz.a($$2.u() + $$3);
      int $$7 = iz.a($$2.w() + $$3);
      fwd.a[][] $$8 = new fwd.a[$$6 - $$4 + 1][$$7 - $$5 + 1];

      for (int $$9 = $$4; $$9 <= $$6; $$9++) {
         for (int $$10 = $$5; $$10 <= $$7; $$10++) {
            $$8[$$9 - $$4][$$10 - $$5] = (fwd.a)this.a.computeIfAbsent(csv.c($$9, $$10), $$1x -> new fwd.a($$0.d(csv.a($$1x), csv.b($$1x))));
         }
      }

      if (a($$1, $$2, $$4, $$5, $$8)) {
         return null;
      } else {
         fwb[][] $$11 = new fwb[$$6 - $$4 + 1][$$7 - $$5 + 1];

         for (int $$12 = $$4; $$12 <= $$6; $$12++) {
            for (int $$13 = $$5; $$13 <= $$7; $$13++) {
               $$11[$$12 - $$4][$$13 - $$5] = $$8[$$12 - $$4][$$13 - $$5].b();
            }
         }

         return new fwc($$0, $$4, $$5, $$11);
      }
   }

   private static boolean a(hx $$0, hx $$1, int $$2, int $$3, fwd.a[][] $$4) {
      int $$5 = iz.a($$0.u());
      int $$6 = iz.a($$0.w());
      int $$7 = iz.a($$1.u());
      int $$8 = iz.a($$1.w());

      for (int $$9 = $$5; $$9 <= $$7; $$9++) {
         for (int $$10 = $$6; $$10 <= $$8; $$10++) {
            dln $$11 = $$4[$$9 - $$2][$$10 - $$3].a();
            if (!$$11.a($$0.v(), $$1.v())) {
               return false;
            }
         }
      }

      return true;
   }

   static final class a {
      private final dln a;
      @Nullable
      private fwb b;

      a(dln $$0) {
         this.a = $$0;
      }

      public dln a() {
         return this.a;
      }

      public fwb b() {
         if (this.b == null) {
            this.b = new fwb(this.a);
         }

         return this.b;
      }
   }
}
