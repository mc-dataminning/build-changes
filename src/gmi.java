import it.unimi.dsi.fastutil.longs.Long2ObjectMap;
import it.unimi.dsi.fastutil.longs.Long2ObjectOpenHashMap;
import javax.annotation.Nullable;

public class gmi {
   private final Long2ObjectMap<gmi.a> a = new Long2ObjectOpenHashMap();

   @Nullable
   public gmh a(dff $$0, kj $$1) {
      gmi.a $$2 = this.a($$0, $$1.a(), $$1.c());
      if ($$2.a().c($$1.b())) {
         return null;
      } else {
         int $$3 = $$1.a() - 1;
         int $$4 = $$1.c() - 1;
         int $$5 = $$1.a() + 1;
         int $$6 = $$1.c() + 1;
         gmg[] $$7 = new gmg[9];

         for (int $$8 = $$4; $$8 <= $$6; $$8++) {
            for (int $$9 = $$3; $$9 <= $$5; $$9++) {
               int $$10 = gmh.a($$3, $$4, $$9, $$8);
               gmi.a $$11 = $$9 == $$1.a() && $$8 == $$1.c() ? $$2 : this.a($$0, $$9, $$8);
               $$7[$$10] = $$11.b();
            }
         }

         return new gmh($$0, $$3, $$4, $$7);
      }
   }

   private gmi.a a(dff $$0, int $$1, int $$2) {
      return (gmi.a)this.a.computeIfAbsent(del.c($$1, $$2), $$1x -> new gmi.a($$0.d(del.a($$1x), del.b($$1x))));
   }

   static final class a {
      private final dxt a;
      @Nullable
      private gmg b;

      a(dxt $$0) {
         this.a = $$0;
      }

      public dxt a() {
         return this.a;
      }

      public gmg b() {
         if (this.b == null) {
            this.b = new gmg(this.a);
         }

         return this.b;
      }
   }
}
