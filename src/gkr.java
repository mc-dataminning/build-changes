import it.unimi.dsi.fastutil.longs.Long2ObjectMap;
import it.unimi.dsi.fastutil.longs.Long2ObjectOpenHashMap;
import javax.annotation.Nullable;

public class gkr {
   private final Long2ObjectMap<gkr.a> a = new Long2ObjectOpenHashMap();

   @Nullable
   public gkq a(deg $$0, kg $$1) {
      gkr.a $$2 = this.a($$0, $$1.a(), $$1.c());
      if ($$2.a().c($$1.b())) {
         return null;
      } else {
         int $$3 = $$1.a() - 1;
         int $$4 = $$1.c() - 1;
         int $$5 = $$1.a() + 1;
         int $$6 = $$1.c() + 1;
         gkp[] $$7 = new gkp[9];

         for (int $$8 = $$4; $$8 <= $$6; $$8++) {
            for (int $$9 = $$3; $$9 <= $$5; $$9++) {
               int $$10 = gkq.a($$3, $$4, $$9, $$8);
               gkr.a $$11 = $$9 == $$1.a() && $$8 == $$1.c() ? $$2 : this.a($$0, $$9, $$8);
               $$7[$$10] = $$11.b();
            }
         }

         return new gkq($$0, $$3, $$4, $$7);
      }
   }

   private gkr.a a(deg $$0, int $$1, int $$2) {
      return (gkr.a)this.a.computeIfAbsent(ddm.c($$1, $$2), $$1x -> new gkr.a($$0.d(ddm.a($$1x), ddm.b($$1x))));
   }

   static final class a {
      private final dwu a;
      @Nullable
      private gkp b;

      a(dwu $$0) {
         this.a = $$0;
      }

      public dwu a() {
         return this.a;
      }

      public gkp b() {
         if (this.b == null) {
            this.b = new gkp(this.a);
         }

         return this.b;
      }
   }
}
