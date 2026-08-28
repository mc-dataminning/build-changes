import it.unimi.dsi.fastutil.longs.Long2ObjectMap;
import it.unimi.dsi.fastutil.longs.Long2ObjectOpenHashMap;
import javax.annotation.Nullable;

public class gls {
   private final Long2ObjectMap<gls.a> a = new Long2ObjectOpenHashMap();

   @Nullable
   public glr a(dfb $$0, kj $$1) {
      gls.a $$2 = this.a($$0, $$1.a(), $$1.c());
      if ($$2.a().c($$1.b())) {
         return null;
      } else {
         int $$3 = $$1.a() - 1;
         int $$4 = $$1.c() - 1;
         int $$5 = $$1.a() + 1;
         int $$6 = $$1.c() + 1;
         glq[] $$7 = new glq[9];

         for (int $$8 = $$4; $$8 <= $$6; $$8++) {
            for (int $$9 = $$3; $$9 <= $$5; $$9++) {
               int $$10 = glr.a($$3, $$4, $$9, $$8);
               gls.a $$11 = $$9 == $$1.a() && $$8 == $$1.c() ? $$2 : this.a($$0, $$9, $$8);
               $$7[$$10] = $$11.b();
            }
         }

         return new glr($$0, $$3, $$4, $$7);
      }
   }

   private gls.a a(dfb $$0, int $$1, int $$2) {
      return (gls.a)this.a.computeIfAbsent(deh.c($$1, $$2), $$1x -> new gls.a($$0.d(deh.a($$1x), deh.b($$1x))));
   }

   static final class a {
      private final dxp a;
      @Nullable
      private glq b;

      a(dxp $$0) {
         this.a = $$0;
      }

      public dxp a() {
         return this.a;
      }

      public glq b() {
         if (this.b == null) {
            this.b = new glq(this.a);
         }

         return this.b;
      }
   }
}
