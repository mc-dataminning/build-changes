import it.unimi.dsi.fastutil.longs.Long2ObjectMap;
import it.unimi.dsi.fastutil.longs.Long2ObjectOpenHashMap;
import javax.annotation.Nullable;

public class ghw {
   private final Long2ObjectMap<ghw.a> a = new Long2ObjectOpenHashMap();

   @Nullable
   public ghv a(dcw $$0, kf $$1) {
      ghw.a $$2 = this.a($$0, $$1.a(), $$1.c());
      if ($$2.a().c($$1.b())) {
         return null;
      } else {
         int $$3 = $$1.a() - 1;
         int $$4 = $$1.c() - 1;
         int $$5 = $$1.a() + 1;
         int $$6 = $$1.c() + 1;
         ghu[] $$7 = new ghu[9];

         for (int $$8 = $$4; $$8 <= $$6; $$8++) {
            for (int $$9 = $$3; $$9 <= $$5; $$9++) {
               int $$10 = ghv.a($$3, $$4, $$9, $$8);
               ghw.a $$11 = $$9 == $$1.a() && $$8 == $$1.c() ? $$2 : this.a($$0, $$9, $$8);
               $$7[$$10] = $$11.b();
            }
         }

         return new ghv($$0, $$3, $$4, $$7);
      }
   }

   private ghw.a a(dcw $$0, int $$1, int $$2) {
      return (ghw.a)this.a.computeIfAbsent(dcd.c($$1, $$2), $$1x -> new ghw.a($$0.d(dcd.a($$1x), dcd.b($$1x))));
   }

   static final class a {
      private final dvi a;
      @Nullable
      private ghu b;

      a(dvi $$0) {
         this.a = $$0;
      }

      public dvi a() {
         return this.a;
      }

      public ghu b() {
         if (this.b == null) {
            this.b = new ghu(this.a);
         }

         return this.b;
      }
   }
}
