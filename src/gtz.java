import it.unimi.dsi.fastutil.longs.Long2ObjectMap;
import it.unimi.dsi.fastutil.longs.Long2ObjectOpenHashMap;
import javax.annotation.Nullable;

public class gtz {
   private final Long2ObjectMap<gtz.a> a = new Long2ObjectOpenHashMap();

   @Nullable
   public gty a(djh $$0, jy $$1) {
      gtz.a $$2 = this.a($$0, $$1.a(), $$1.c());
      if ($$2.a().c($$1.b())) {
         return null;
      } else {
         int $$3 = $$1.a() - 1;
         int $$4 = $$1.c() - 1;
         int $$5 = $$1.a() + 1;
         int $$6 = $$1.c() + 1;
         gtx[] $$7 = new gtx[9];

         for (int $$8 = $$4; $$8 <= $$6; $$8++) {
            for (int $$9 = $$3; $$9 <= $$5; $$9++) {
               int $$10 = gty.a($$3, $$4, $$9, $$8);
               gtz.a $$11 = $$9 == $$1.a() && $$8 == $$1.c() ? $$2 : this.a($$0, $$9, $$8);
               $$7[$$10] = $$11.b();
            }
         }

         return new gty($$0, $$3, $$4, $$7);
      }
   }

   private gtz.a a(djh $$0, int $$1, int $$2) {
      return (gtz.a)this.a.computeIfAbsent(dio.c($$1, $$2), $$1x -> new gtz.a($$0.d(dio.a($$1x), dio.b($$1x))));
   }

   static final class a {
      private final ecv a;
      @Nullable
      private gtx b;

      a(ecv $$0) {
         this.a = $$0;
      }

      public ecv a() {
         return this.a;
      }

      public gtx b() {
         if (this.b == null) {
            this.b = new gtx(this.a);
         }

         return this.b;
      }
   }
}
