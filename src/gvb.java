import it.unimi.dsi.fastutil.longs.Long2ObjectMap;
import it.unimi.dsi.fastutil.longs.Long2ObjectOpenHashMap;
import javax.annotation.Nullable;

public class gvb {
   private final Long2ObjectMap<gvb.a> a = new Long2ObjectOpenHashMap();

   @Nullable
   public gva a(dkj $$0, jz $$1) {
      gvb.a $$2 = this.a($$0, $$1.a(), $$1.c());
      if ($$2.a().c($$1.b())) {
         return null;
      } else {
         int $$3 = $$1.a() - 1;
         int $$4 = $$1.c() - 1;
         int $$5 = $$1.a() + 1;
         int $$6 = $$1.c() + 1;
         guz[] $$7 = new guz[9];

         for (int $$8 = $$4; $$8 <= $$6; $$8++) {
            for (int $$9 = $$3; $$9 <= $$5; $$9++) {
               int $$10 = gva.a($$3, $$4, $$9, $$8);
               gvb.a $$11 = $$9 == $$1.a() && $$8 == $$1.c() ? $$2 : this.a($$0, $$9, $$8);
               $$7[$$10] = $$11.b();
            }
         }

         return new gva($$0, $$3, $$4, $$7);
      }
   }

   private gvb.a a(dkj $$0, int $$1, int $$2) {
      return (gvb.a)this.a.computeIfAbsent(djo.c($$1, $$2), $$1x -> new gvb.a($$0.d(djo.a($$1x), djo.b($$1x))));
   }

   static final class a {
      private final edx a;
      @Nullable
      private guz b;

      a(edx $$0) {
         this.a = $$0;
      }

      public edx a() {
         return this.a;
      }

      public guz b() {
         if (this.b == null) {
            this.b = new guz(this.a);
         }

         return this.b;
      }
   }
}
