import it.unimi.dsi.fastutil.longs.Long2ObjectMap;
import it.unimi.dsi.fastutil.longs.Long2ObjectOpenHashMap;
import javax.annotation.Nullable;

public class gsq {
   private final Long2ObjectMap<gsq.a> a = new Long2ObjectOpenHashMap();

   @Nullable
   public gsp a(dip $$0, jx $$1) {
      gsq.a $$2 = this.a($$0, $$1.a(), $$1.c());
      if ($$2.a().c($$1.b())) {
         return null;
      } else {
         int $$3 = $$1.a() - 1;
         int $$4 = $$1.c() - 1;
         int $$5 = $$1.a() + 1;
         int $$6 = $$1.c() + 1;
         gso[] $$7 = new gso[9];

         for (int $$8 = $$4; $$8 <= $$6; $$8++) {
            for (int $$9 = $$3; $$9 <= $$5; $$9++) {
               int $$10 = gsp.a($$3, $$4, $$9, $$8);
               gsq.a $$11 = $$9 == $$1.a() && $$8 == $$1.c() ? $$2 : this.a($$0, $$9, $$8);
               $$7[$$10] = $$11.b();
            }
         }

         return new gsp($$0, $$3, $$4, $$7);
      }
   }

   private gsq.a a(dip $$0, int $$1, int $$2) {
      return (gsq.a)this.a.computeIfAbsent(dhw.c($$1, $$2), $$1x -> new gsq.a($$0.d(dhw.a($$1x), dhw.b($$1x))));
   }

   static final class a {
      private final ebv a;
      @Nullable
      private gso b;

      a(ebv $$0) {
         this.a = $$0;
      }

      public ebv a() {
         return this.a;
      }

      public gso b() {
         if (this.b == null) {
            this.b = new gso(this.a);
         }

         return this.b;
      }
   }
}
