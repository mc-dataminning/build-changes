import it.unimi.dsi.fastutil.longs.Long2ObjectMap;
import it.unimi.dsi.fastutil.longs.Long2ObjectOpenHashMap;
import javax.annotation.Nullable;

public class gor {
   private final Long2ObjectMap<gor.a> a = new Long2ObjectOpenHashMap();

   @Nullable
   public goq a(dgz $$0, kj $$1) {
      gor.a $$2 = this.a($$0, $$1.a(), $$1.c());
      if ($$2.a().c($$1.b())) {
         return null;
      } else {
         int $$3 = $$1.a() - 1;
         int $$4 = $$1.c() - 1;
         int $$5 = $$1.a() + 1;
         int $$6 = $$1.c() + 1;
         gop[] $$7 = new gop[9];

         for (int $$8 = $$4; $$8 <= $$6; $$8++) {
            for (int $$9 = $$3; $$9 <= $$5; $$9++) {
               int $$10 = goq.a($$3, $$4, $$9, $$8);
               gor.a $$11 = $$9 == $$1.a() && $$8 == $$1.c() ? $$2 : this.a($$0, $$9, $$8);
               $$7[$$10] = $$11.b();
            }
         }

         return new goq($$0, $$3, $$4, $$7);
      }
   }

   private gor.a a(dgz $$0, int $$1, int $$2) {
      return (gor.a)this.a.computeIfAbsent(dgf.c($$1, $$2), $$1x -> new gor.a($$0.d(dgf.a($$1x), dgf.b($$1x))));
   }

   static final class a {
      private final dzt a;
      @Nullable
      private gop b;

      a(dzt $$0) {
         this.a = $$0;
      }

      public dzt a() {
         return this.a;
      }

      public gop b() {
         if (this.b == null) {
            this.b = new gop(this.a);
         }

         return this.b;
      }
   }
}
