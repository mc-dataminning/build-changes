import it.unimi.dsi.fastutil.longs.Long2ObjectMap;
import it.unimi.dsi.fastutil.longs.Long2ObjectOpenHashMap;
import javax.annotation.Nullable;

public class gpk {
   private final Long2ObjectMap<gpk.a> a = new Long2ObjectOpenHashMap();

   @Nullable
   public gpj a(dgi $$0, kk $$1) {
      gpk.a $$2 = this.a($$0, $$1.a(), $$1.c());
      if ($$2.a().c($$1.b())) {
         return null;
      } else {
         int $$3 = $$1.a() - 1;
         int $$4 = $$1.c() - 1;
         int $$5 = $$1.a() + 1;
         int $$6 = $$1.c() + 1;
         gpi[] $$7 = new gpi[9];

         for (int $$8 = $$4; $$8 <= $$6; $$8++) {
            for (int $$9 = $$3; $$9 <= $$5; $$9++) {
               int $$10 = gpj.a($$3, $$4, $$9, $$8);
               gpk.a $$11 = $$9 == $$1.a() && $$8 == $$1.c() ? $$2 : this.a($$0, $$9, $$8);
               $$7[$$10] = $$11.b();
            }
         }

         return new gpj($$0, $$3, $$4, $$7);
      }
   }

   private gpk.a a(dgi $$0, int $$1, int $$2) {
      return (gpk.a)this.a.computeIfAbsent(dfo.c($$1, $$2), $$1x -> new gpk.a($$0.d(dfo.a($$1x), dfo.b($$1x))));
   }

   static final class a {
      private final dzc a;
      @Nullable
      private gpi b;

      a(dzc $$0) {
         this.a = $$0;
      }

      public dzc a() {
         return this.a;
      }

      public gpi b() {
         if (this.b == null) {
            this.b = new gpi(this.a);
         }

         return this.b;
      }
   }
}
