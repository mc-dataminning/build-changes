import it.unimi.dsi.fastutil.longs.Long2ObjectMap;
import it.unimi.dsi.fastutil.longs.Long2ObjectOpenHashMap;
import javax.annotation.Nullable;

public class gmr {
   private final Long2ObjectMap<gmr.a> a = new Long2ObjectOpenHashMap();

   @Nullable
   public gmq a(dfm $$0, kj $$1) {
      gmr.a $$2 = this.a($$0, $$1.a(), $$1.c());
      if ($$2.a().c($$1.b())) {
         return null;
      } else {
         int $$3 = $$1.a() - 1;
         int $$4 = $$1.c() - 1;
         int $$5 = $$1.a() + 1;
         int $$6 = $$1.c() + 1;
         gmp[] $$7 = new gmp[9];

         for (int $$8 = $$4; $$8 <= $$6; $$8++) {
            for (int $$9 = $$3; $$9 <= $$5; $$9++) {
               int $$10 = gmq.a($$3, $$4, $$9, $$8);
               gmr.a $$11 = $$9 == $$1.a() && $$8 == $$1.c() ? $$2 : this.a($$0, $$9, $$8);
               $$7[$$10] = $$11.b();
            }
         }

         return new gmq($$0, $$3, $$4, $$7);
      }
   }

   private gmr.a a(dfm $$0, int $$1, int $$2) {
      return (gmr.a)this.a.computeIfAbsent(des.c($$1, $$2), $$1x -> new gmr.a($$0.d(des.a($$1x), des.b($$1x))));
   }

   static final class a {
      private final dya a;
      @Nullable
      private gmp b;

      a(dya $$0) {
         this.a = $$0;
      }

      public dya a() {
         return this.a;
      }

      public gmp b() {
         if (this.b == null) {
            this.b = new gmp(this.a);
         }

         return this.b;
      }
   }
}
