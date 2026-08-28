import it.unimi.dsi.fastutil.longs.Long2ObjectMap;
import it.unimi.dsi.fastutil.longs.Long2ObjectOpenHashMap;
import javax.annotation.Nullable;

public class gkb {
   private final Long2ObjectMap<gkb.a> a = new Long2ObjectOpenHashMap();

   @Nullable
   public gka a(dds $$0, kg $$1) {
      gkb.a $$2 = this.a($$0, $$1.a(), $$1.c());
      if ($$2.a().c($$1.b())) {
         return null;
      } else {
         int $$3 = $$1.a() - 1;
         int $$4 = $$1.c() - 1;
         int $$5 = $$1.a() + 1;
         int $$6 = $$1.c() + 1;
         gjz[] $$7 = new gjz[9];

         for (int $$8 = $$4; $$8 <= $$6; $$8++) {
            for (int $$9 = $$3; $$9 <= $$5; $$9++) {
               int $$10 = gka.a($$3, $$4, $$9, $$8);
               gkb.a $$11 = $$9 == $$1.a() && $$8 == $$1.c() ? $$2 : this.a($$0, $$9, $$8);
               $$7[$$10] = $$11.b();
            }
         }

         return new gka($$0, $$3, $$4, $$7);
      }
   }

   private gkb.a a(dds $$0, int $$1, int $$2) {
      return (gkb.a)this.a.computeIfAbsent(dcy.c($$1, $$2), $$1x -> new gkb.a($$0.d(dcy.a($$1x), dcy.b($$1x))));
   }

   static final class a {
      private final dwg a;
      @Nullable
      private gjz b;

      a(dwg $$0) {
         this.a = $$0;
      }

      public dwg a() {
         return this.a;
      }

      public gjz b() {
         if (this.b == null) {
            this.b = new gjz(this.a);
         }

         return this.b;
      }
   }
}
