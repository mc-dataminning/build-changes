import it.unimi.dsi.fastutil.longs.Long2ObjectMap;
import it.unimi.dsi.fastutil.longs.Long2ObjectOpenHashMap;
import javax.annotation.Nullable;

public class gqj {
   private final Long2ObjectMap<gqj.a> a = new Long2ObjectOpenHashMap();

   @Nullable
   public gqi a(dgz $$0, kk $$1) {
      gqj.a $$2 = this.a($$0, $$1.a(), $$1.c());
      if ($$2.a().c($$1.b())) {
         return null;
      } else {
         int $$3 = $$1.a() - 1;
         int $$4 = $$1.c() - 1;
         int $$5 = $$1.a() + 1;
         int $$6 = $$1.c() + 1;
         gqh[] $$7 = new gqh[9];

         for (int $$8 = $$4; $$8 <= $$6; $$8++) {
            for (int $$9 = $$3; $$9 <= $$5; $$9++) {
               int $$10 = gqi.a($$3, $$4, $$9, $$8);
               gqj.a $$11 = $$9 == $$1.a() && $$8 == $$1.c() ? $$2 : this.a($$0, $$9, $$8);
               $$7[$$10] = $$11.b();
            }
         }

         return new gqi($$0, $$3, $$4, $$7);
      }
   }

   private gqj.a a(dgz $$0, int $$1, int $$2) {
      return (gqj.a)this.a.computeIfAbsent(dgg.c($$1, $$2), $$1x -> new gqj.a($$0.d(dgg.a($$1x), dgg.b($$1x))));
   }

   static final class a {
      private final dzw a;
      @Nullable
      private gqh b;

      a(dzw $$0) {
         this.a = $$0;
      }

      public dzw a() {
         return this.a;
      }

      public gqh b() {
         if (this.b == null) {
            this.b = new gqh(this.a);
         }

         return this.b;
      }
   }
}
