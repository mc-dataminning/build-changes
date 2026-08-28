import it.unimi.dsi.fastutil.longs.Long2ObjectMap;
import it.unimi.dsi.fastutil.longs.Long2ObjectOpenHashMap;
import javax.annotation.Nullable;

public class gpj {
   private final Long2ObjectMap<gpj.a> a = new Long2ObjectOpenHashMap();

   @Nullable
   public gpi a(dgh $$0, kk $$1) {
      gpj.a $$2 = this.a($$0, $$1.a(), $$1.c());
      if ($$2.a().c($$1.b())) {
         return null;
      } else {
         int $$3 = $$1.a() - 1;
         int $$4 = $$1.c() - 1;
         int $$5 = $$1.a() + 1;
         int $$6 = $$1.c() + 1;
         gph[] $$7 = new gph[9];

         for (int $$8 = $$4; $$8 <= $$6; $$8++) {
            for (int $$9 = $$3; $$9 <= $$5; $$9++) {
               int $$10 = gpi.a($$3, $$4, $$9, $$8);
               gpj.a $$11 = $$9 == $$1.a() && $$8 == $$1.c() ? $$2 : this.a($$0, $$9, $$8);
               $$7[$$10] = $$11.b();
            }
         }

         return new gpi($$0, $$3, $$4, $$7);
      }
   }

   private gpj.a a(dgh $$0, int $$1, int $$2) {
      return (gpj.a)this.a.computeIfAbsent(dfn.c($$1, $$2), $$1x -> new gpj.a($$0.d(dfn.a($$1x), dfn.b($$1x))));
   }

   static final class a {
      private final dzb a;
      @Nullable
      private gph b;

      a(dzb $$0) {
         this.a = $$0;
      }

      public dzb a() {
         return this.a;
      }

      public gph b() {
         if (this.b == null) {
            this.b = new gph(this.a);
         }

         return this.b;
      }
   }
}
