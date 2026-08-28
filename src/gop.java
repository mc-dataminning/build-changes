import it.unimi.dsi.fastutil.longs.Long2ObjectMap;
import it.unimi.dsi.fastutil.longs.Long2ObjectOpenHashMap;
import javax.annotation.Nullable;

public class gop {
   private final Long2ObjectMap<gop.a> a = new Long2ObjectOpenHashMap();

   @Nullable
   public goo a(dha $$0, kj $$1) {
      gop.a $$2 = this.a($$0, $$1.a(), $$1.c());
      if ($$2.a().c($$1.b())) {
         return null;
      } else {
         int $$3 = $$1.a() - 1;
         int $$4 = $$1.c() - 1;
         int $$5 = $$1.a() + 1;
         int $$6 = $$1.c() + 1;
         gon[] $$7 = new gon[9];

         for (int $$8 = $$4; $$8 <= $$6; $$8++) {
            for (int $$9 = $$3; $$9 <= $$5; $$9++) {
               int $$10 = goo.a($$3, $$4, $$9, $$8);
               gop.a $$11 = $$9 == $$1.a() && $$8 == $$1.c() ? $$2 : this.a($$0, $$9, $$8);
               $$7[$$10] = $$11.b();
            }
         }

         return new goo($$0, $$3, $$4, $$7);
      }
   }

   private gop.a a(dha $$0, int $$1, int $$2) {
      return (gop.a)this.a.computeIfAbsent(dgg.c($$1, $$2), $$1x -> new gop.a($$0.d(dgg.a($$1x), dgg.b($$1x))));
   }

   static final class a {
      private final dzs a;
      @Nullable
      private gon b;

      a(dzs $$0) {
         this.a = $$0;
      }

      public dzs a() {
         return this.a;
      }

      public gon b() {
         if (this.b == null) {
            this.b = new gon(this.a);
         }

         return this.b;
      }
   }
}
