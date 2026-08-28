import it.unimi.dsi.fastutil.longs.Long2ObjectMap;
import it.unimi.dsi.fastutil.longs.Long2ObjectOpenHashMap;
import javax.annotation.Nullable;

public class grl {
   private final Long2ObjectMap<grl.a> a = new Long2ObjectOpenHashMap();

   @Nullable
   public grk a(dhp $$0, kl $$1) {
      grl.a $$2 = this.a($$0, $$1.a(), $$1.c());
      if ($$2.a().c($$1.b())) {
         return null;
      } else {
         int $$3 = $$1.a() - 1;
         int $$4 = $$1.c() - 1;
         int $$5 = $$1.a() + 1;
         int $$6 = $$1.c() + 1;
         grj[] $$7 = new grj[9];

         for (int $$8 = $$4; $$8 <= $$6; $$8++) {
            for (int $$9 = $$3; $$9 <= $$5; $$9++) {
               int $$10 = grk.a($$3, $$4, $$9, $$8);
               grl.a $$11 = $$9 == $$1.a() && $$8 == $$1.c() ? $$2 : this.a($$0, $$9, $$8);
               $$7[$$10] = $$11.b();
            }
         }

         return new grk($$0, $$3, $$4, $$7);
      }
   }

   private grl.a a(dhp $$0, int $$1, int $$2) {
      return (grl.a)this.a.computeIfAbsent(dgw.c($$1, $$2), $$1x -> new grl.a($$0.d(dgw.a($$1x), dgw.b($$1x))));
   }

   static final class a {
      private final eat a;
      @Nullable
      private grj b;

      a(eat $$0) {
         this.a = $$0;
      }

      public eat a() {
         return this.a;
      }

      public grj b() {
         if (this.b == null) {
            this.b = new grj(this.a);
         }

         return this.b;
      }
   }
}
