import it.unimi.dsi.fastutil.longs.Long2ObjectMap;
import it.unimi.dsi.fastutil.longs.Long2ObjectOpenHashMap;
import javax.annotation.Nullable;

public class gtn {
   private final Long2ObjectMap<gtn.a> a = new Long2ObjectOpenHashMap();

   @Nullable
   public gtm a(dja $$0, jx $$1) {
      gtn.a $$2 = this.a($$0, $$1.a(), $$1.c());
      if ($$2.a().c($$1.b())) {
         return null;
      } else {
         int $$3 = $$1.a() - 1;
         int $$4 = $$1.c() - 1;
         int $$5 = $$1.a() + 1;
         int $$6 = $$1.c() + 1;
         gtl[] $$7 = new gtl[9];

         for (int $$8 = $$4; $$8 <= $$6; $$8++) {
            for (int $$9 = $$3; $$9 <= $$5; $$9++) {
               int $$10 = gtm.a($$3, $$4, $$9, $$8);
               gtn.a $$11 = $$9 == $$1.a() && $$8 == $$1.c() ? $$2 : this.a($$0, $$9, $$8);
               $$7[$$10] = $$11.b();
            }
         }

         return new gtm($$0, $$3, $$4, $$7);
      }
   }

   private gtn.a a(dja $$0, int $$1, int $$2) {
      return (gtn.a)this.a.computeIfAbsent(dih.c($$1, $$2), $$1x -> new gtn.a($$0.d(dih.a($$1x), dih.b($$1x))));
   }

   static final class a {
      private final eco a;
      @Nullable
      private gtl b;

      a(eco $$0) {
         this.a = $$0;
      }

      public eco a() {
         return this.a;
      }

      public gtl b() {
         if (this.b == null) {
            this.b = new gtl(this.a);
         }

         return this.b;
      }
   }
}
