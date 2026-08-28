import it.unimi.dsi.fastutil.longs.Long2ObjectMap;
import it.unimi.dsi.fastutil.longs.Long2ObjectOpenHashMap;
import javax.annotation.Nullable;

public class gpl {
   private final Long2ObjectMap<gpl.a> a = new Long2ObjectOpenHashMap();

   @Nullable
   public gpk a(dgj $$0, kk $$1) {
      gpl.a $$2 = this.a($$0, $$1.a(), $$1.c());
      if ($$2.a().c($$1.b())) {
         return null;
      } else {
         int $$3 = $$1.a() - 1;
         int $$4 = $$1.c() - 1;
         int $$5 = $$1.a() + 1;
         int $$6 = $$1.c() + 1;
         gpj[] $$7 = new gpj[9];

         for (int $$8 = $$4; $$8 <= $$6; $$8++) {
            for (int $$9 = $$3; $$9 <= $$5; $$9++) {
               int $$10 = gpk.a($$3, $$4, $$9, $$8);
               gpl.a $$11 = $$9 == $$1.a() && $$8 == $$1.c() ? $$2 : this.a($$0, $$9, $$8);
               $$7[$$10] = $$11.b();
            }
         }

         return new gpk($$0, $$3, $$4, $$7);
      }
   }

   private gpl.a a(dgj $$0, int $$1, int $$2) {
      return (gpl.a)this.a.computeIfAbsent(dfp.c($$1, $$2), $$1x -> new gpl.a($$0.d(dfp.a($$1x), dfp.b($$1x))));
   }

   static final class a {
      private final dzd a;
      @Nullable
      private gpj b;

      a(dzd $$0) {
         this.a = $$0;
      }

      public dzd a() {
         return this.a;
      }

      public gpj b() {
         if (this.b == null) {
            this.b = new gpj(this.a);
         }

         return this.b;
      }
   }
}
