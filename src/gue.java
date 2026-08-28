import it.unimi.dsi.fastutil.longs.Long2ObjectMap;
import it.unimi.dsi.fastutil.longs.Long2ObjectOpenHashMap;
import javax.annotation.Nullable;

public class gue {
   private final Long2ObjectMap<gue.a> a = new Long2ObjectOpenHashMap();

   @Nullable
   public gud a(djm $$0, jy $$1) {
      gue.a $$2 = this.a($$0, $$1.a(), $$1.c());
      if ($$2.a().c($$1.b())) {
         return null;
      } else {
         int $$3 = $$1.a() - 1;
         int $$4 = $$1.c() - 1;
         int $$5 = $$1.a() + 1;
         int $$6 = $$1.c() + 1;
         guc[] $$7 = new guc[9];

         for (int $$8 = $$4; $$8 <= $$6; $$8++) {
            for (int $$9 = $$3; $$9 <= $$5; $$9++) {
               int $$10 = gud.a($$3, $$4, $$9, $$8);
               gue.a $$11 = $$9 == $$1.a() && $$8 == $$1.c() ? $$2 : this.a($$0, $$9, $$8);
               $$7[$$10] = $$11.b();
            }
         }

         return new gud($$0, $$3, $$4, $$7);
      }
   }

   private gue.a a(djm $$0, int $$1, int $$2) {
      return (gue.a)this.a.computeIfAbsent(dir.c($$1, $$2), $$1x -> new gue.a($$0.d(dir.a($$1x), dir.b($$1x))));
   }

   static final class a {
      private final eda a;
      @Nullable
      private guc b;

      a(eda $$0) {
         this.a = $$0;
      }

      public eda a() {
         return this.a;
      }

      public guc b() {
         if (this.b == null) {
            this.b = new guc(this.a);
         }

         return this.b;
      }
   }
}
