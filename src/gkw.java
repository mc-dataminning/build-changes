import it.unimi.dsi.fastutil.longs.Long2ObjectMap;
import it.unimi.dsi.fastutil.longs.Long2ObjectOpenHashMap;
import javax.annotation.Nullable;

public class gkw {
   private final Long2ObjectMap<gkw.a> a = new Long2ObjectOpenHashMap();

   @Nullable
   public gkv a(dej $$0, kh $$1) {
      gkw.a $$2 = this.a($$0, $$1.a(), $$1.c());
      if ($$2.a().c($$1.b())) {
         return null;
      } else {
         int $$3 = $$1.a() - 1;
         int $$4 = $$1.c() - 1;
         int $$5 = $$1.a() + 1;
         int $$6 = $$1.c() + 1;
         gku[] $$7 = new gku[9];

         for (int $$8 = $$4; $$8 <= $$6; $$8++) {
            for (int $$9 = $$3; $$9 <= $$5; $$9++) {
               int $$10 = gkv.a($$3, $$4, $$9, $$8);
               gkw.a $$11 = $$9 == $$1.a() && $$8 == $$1.c() ? $$2 : this.a($$0, $$9, $$8);
               $$7[$$10] = $$11.b();
            }
         }

         return new gkv($$0, $$3, $$4, $$7);
      }
   }

   private gkw.a a(dej $$0, int $$1, int $$2) {
      return (gkw.a)this.a.computeIfAbsent(ddp.c($$1, $$2), $$1x -> new gkw.a($$0.d(ddp.a($$1x), ddp.b($$1x))));
   }

   static final class a {
      private final dwy a;
      @Nullable
      private gku b;

      a(dwy $$0) {
         this.a = $$0;
      }

      public dwy a() {
         return this.a;
      }

      public gku b() {
         if (this.b == null) {
            this.b = new gku(this.a);
         }

         return this.b;
      }
   }
}
