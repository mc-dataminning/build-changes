import it.unimi.dsi.fastutil.longs.Long2ObjectMap;
import it.unimi.dsi.fastutil.longs.Long2ObjectOpenHashMap;
import javax.annotation.Nullable;

public class fwf {
   private final Long2ObjectMap<fwf.a> a = new Long2ObjectOpenHashMap();

   @Nullable
   public fwe a(ctp $$0, hx $$1, hx $$2, int $$3) {
      int $$4 = iz.a($$1.u() - $$3);
      int $$5 = iz.a($$1.w() - $$3);
      int $$6 = iz.a($$2.u() + $$3);
      int $$7 = iz.a($$2.w() + $$3);
      fwf.a[][] $$8 = new fwf.a[$$6 - $$4 + 1][$$7 - $$5 + 1];

      for (int $$9 = $$4; $$9 <= $$6; $$9++) {
         for (int $$10 = $$5; $$10 <= $$7; $$10++) {
            $$8[$$9 - $$4][$$10 - $$5] = (fwf.a)this.a.computeIfAbsent(csw.c($$9, $$10), $$1x -> new fwf.a($$0.d(csw.a($$1x), csw.b($$1x))));
         }
      }

      if (a($$1, $$2, $$4, $$5, $$8)) {
         return null;
      } else {
         fwd[][] $$11 = new fwd[$$6 - $$4 + 1][$$7 - $$5 + 1];

         for (int $$12 = $$4; $$12 <= $$6; $$12++) {
            for (int $$13 = $$5; $$13 <= $$7; $$13++) {
               $$11[$$12 - $$4][$$13 - $$5] = $$8[$$12 - $$4][$$13 - $$5].b();
            }
         }

         return new fwe($$0, $$4, $$5, $$11);
      }
   }

   private static boolean a(hx $$0, hx $$1, int $$2, int $$3, fwf.a[][] $$4) {
      int $$5 = iz.a($$0.u());
      int $$6 = iz.a($$0.w());
      int $$7 = iz.a($$1.u());
      int $$8 = iz.a($$1.w());

      for (int $$9 = $$5; $$9 <= $$7; $$9++) {
         for (int $$10 = $$6; $$10 <= $$8; $$10++) {
            dlo $$11 = $$4[$$9 - $$2][$$10 - $$3].a();
            if (!$$11.a($$0.v(), $$1.v())) {
               return false;
            }
         }
      }

      return true;
   }

   static final class a {
      private final dlo a;
      @Nullable
      private fwd b;

      a(dlo $$0) {
         this.a = $$0;
      }

      public dlo a() {
         return this.a;
      }

      public fwd b() {
         if (this.b == null) {
            this.b = new fwd(this.a);
         }

         return this.b;
      }
   }
}
