import it.unimi.dsi.fastutil.longs.Long2ObjectMap;
import it.unimi.dsi.fastutil.longs.Long2ObjectOpenHashMap;
import javax.annotation.Nullable;

public class gvq {
   private final Long2ObjectMap<gvq.a> a = new Long2ObjectOpenHashMap();

   @Nullable
   public gvp a(djz $$0, jz $$1) {
      gvq.a $$2 = this.a($$0, $$1.a(), $$1.c());
      if ($$2.a().c($$1.b())) {
         return null;
      } else {
         int $$3 = $$1.a() - 1;
         int $$4 = $$1.c() - 1;
         int $$5 = $$1.a() + 1;
         int $$6 = $$1.c() + 1;
         gvo[] $$7 = new gvo[9];

         for (int $$8 = $$4; $$8 <= $$6; $$8++) {
            for (int $$9 = $$3; $$9 <= $$5; $$9++) {
               int $$10 = gvp.a($$3, $$4, $$9, $$8);
               gvq.a $$11 = $$9 == $$1.a() && $$8 == $$1.c() ? $$2 : this.a($$0, $$9, $$8);
               $$7[$$10] = $$11.b();
            }
         }

         return new gvp($$0, $$3, $$4, $$7);
      }
   }

   private gvq.a a(djz $$0, int $$1, int $$2) {
      return (gvq.a)this.a.computeIfAbsent(dje.c($$1, $$2), $$1x -> new gvq.a($$0.d(dje.a($$1x), dje.b($$1x))));
   }

   static final class a {
      private final edn a;
      @Nullable
      private gvo b;

      a(edn $$0) {
         this.a = $$0;
      }

      public edn a() {
         return this.a;
      }

      public gvo b() {
         if (this.b == null) {
            this.b = new gvo(this.a);
         }

         return this.b;
      }
   }
}
