import it.unimi.dsi.fastutil.longs.Long2ObjectMap;
import it.unimi.dsi.fastutil.longs.Long2ObjectOpenHashMap;
import javax.annotation.Nullable;

public class gph {
   private final Long2ObjectMap<gph.a> a = new Long2ObjectOpenHashMap();

   @Nullable
   public gpg a(dgg $$0, kk $$1) {
      gph.a $$2 = this.a($$0, $$1.a(), $$1.c());
      if ($$2.a().c($$1.b())) {
         return null;
      } else {
         int $$3 = $$1.a() - 1;
         int $$4 = $$1.c() - 1;
         int $$5 = $$1.a() + 1;
         int $$6 = $$1.c() + 1;
         gpf[] $$7 = new gpf[9];

         for (int $$8 = $$4; $$8 <= $$6; $$8++) {
            for (int $$9 = $$3; $$9 <= $$5; $$9++) {
               int $$10 = gpg.a($$3, $$4, $$9, $$8);
               gph.a $$11 = $$9 == $$1.a() && $$8 == $$1.c() ? $$2 : this.a($$0, $$9, $$8);
               $$7[$$10] = $$11.b();
            }
         }

         return new gpg($$0, $$3, $$4, $$7);
      }
   }

   private gph.a a(dgg $$0, int $$1, int $$2) {
      return (gph.a)this.a.computeIfAbsent(dfm.c($$1, $$2), $$1x -> new gph.a($$0.d(dfm.a($$1x), dfm.b($$1x))));
   }

   static final class a {
      private final dza a;
      @Nullable
      private gpf b;

      a(dza $$0) {
         this.a = $$0;
      }

      public dza a() {
         return this.a;
      }

      public gpf b() {
         if (this.b == null) {
            this.b = new gpf(this.a);
         }

         return this.b;
      }
   }
}
