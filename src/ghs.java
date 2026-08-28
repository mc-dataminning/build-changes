import it.unimi.dsi.fastutil.longs.Long2ObjectMap;
import it.unimi.dsi.fastutil.longs.Long2ObjectOpenHashMap;
import javax.annotation.Nullable;

public class ghs {
   private final Long2ObjectMap<ghs.a> a = new Long2ObjectOpenHashMap();

   @Nullable
   public ghr a(dcu $$0, kf $$1) {
      ghs.a $$2 = this.a($$0, $$1.a(), $$1.c());
      if ($$2.a().c($$1.b())) {
         return null;
      } else {
         int $$3 = $$1.a() - 1;
         int $$4 = $$1.c() - 1;
         int $$5 = $$1.a() + 1;
         int $$6 = $$1.c() + 1;
         ghq[] $$7 = new ghq[9];

         for (int $$8 = $$4; $$8 <= $$6; $$8++) {
            for (int $$9 = $$3; $$9 <= $$5; $$9++) {
               int $$10 = ghr.a($$3, $$4, $$9, $$8);
               ghs.a $$11 = $$9 == $$1.a() && $$8 == $$1.c() ? $$2 : this.a($$0, $$9, $$8);
               $$7[$$10] = $$11.b();
            }
         }

         return new ghr($$0, $$3, $$4, $$7);
      }
   }

   private ghs.a a(dcu $$0, int $$1, int $$2) {
      return (ghs.a)this.a.computeIfAbsent(dcb.c($$1, $$2), $$1x -> new ghs.a($$0.d(dcb.a($$1x), dcb.b($$1x))));
   }

   static final class a {
      private final dvg a;
      @Nullable
      private ghq b;

      a(dvg $$0) {
         this.a = $$0;
      }

      public dvg a() {
         return this.a;
      }

      public ghq b() {
         if (this.b == null) {
            this.b = new ghq(this.a);
         }

         return this.b;
      }
   }
}
