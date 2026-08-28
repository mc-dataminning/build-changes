import it.unimi.dsi.fastutil.longs.Long2ObjectMap;
import it.unimi.dsi.fastutil.longs.Long2ObjectOpenHashMap;
import javax.annotation.Nullable;

public class gvo {
   private final Long2ObjectMap<gvo.a> a = new Long2ObjectOpenHashMap();

   @Nullable
   public gvn a(djx $$0, jy $$1) {
      gvo.a $$2 = this.a($$0, $$1.a(), $$1.c());
      if ($$2.a().c($$1.b())) {
         return null;
      } else {
         int $$3 = $$1.a() - 1;
         int $$4 = $$1.c() - 1;
         int $$5 = $$1.a() + 1;
         int $$6 = $$1.c() + 1;
         gvm[] $$7 = new gvm[9];

         for (int $$8 = $$4; $$8 <= $$6; $$8++) {
            for (int $$9 = $$3; $$9 <= $$5; $$9++) {
               int $$10 = gvn.a($$3, $$4, $$9, $$8);
               gvo.a $$11 = $$9 == $$1.a() && $$8 == $$1.c() ? $$2 : this.a($$0, $$9, $$8);
               $$7[$$10] = $$11.b();
            }
         }

         return new gvn($$0, $$3, $$4, $$7);
      }
   }

   private gvo.a a(djx $$0, int $$1, int $$2) {
      return (gvo.a)this.a.computeIfAbsent(djc.c($$1, $$2), $$1x -> new gvo.a($$0.d(djc.a($$1x), djc.b($$1x))));
   }

   static final class a {
      private final edl a;
      @Nullable
      private gvm b;

      a(edl $$0) {
         this.a = $$0;
      }

      public edl a() {
         return this.a;
      }

      public gvm b() {
         if (this.b == null) {
            this.b = new gvm(this.a);
         }

         return this.b;
      }
   }
}
