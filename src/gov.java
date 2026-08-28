import it.unimi.dsi.fastutil.longs.Long2ObjectMap;
import it.unimi.dsi.fastutil.longs.Long2ObjectOpenHashMap;
import javax.annotation.Nullable;

public class gov {
   private final Long2ObjectMap<gov.a> a = new Long2ObjectOpenHashMap();

   @Nullable
   public gou a(dhh $$0, kj $$1) {
      gov.a $$2 = this.a($$0, $$1.a(), $$1.c());
      if ($$2.a().c($$1.b())) {
         return null;
      } else {
         int $$3 = $$1.a() - 1;
         int $$4 = $$1.c() - 1;
         int $$5 = $$1.a() + 1;
         int $$6 = $$1.c() + 1;
         got[] $$7 = new got[9];

         for (int $$8 = $$4; $$8 <= $$6; $$8++) {
            for (int $$9 = $$3; $$9 <= $$5; $$9++) {
               int $$10 = gou.a($$3, $$4, $$9, $$8);
               gov.a $$11 = $$9 == $$1.a() && $$8 == $$1.c() ? $$2 : this.a($$0, $$9, $$8);
               $$7[$$10] = $$11.b();
            }
         }

         return new gou($$0, $$3, $$4, $$7);
      }
   }

   private gov.a a(dhh $$0, int $$1, int $$2) {
      return (gov.a)this.a.computeIfAbsent(dgn.c($$1, $$2), $$1x -> new gov.a($$0.d(dgn.a($$1x), dgn.b($$1x))));
   }

   static final class a {
      private final dzz a;
      @Nullable
      private got b;

      a(dzz $$0) {
         this.a = $$0;
      }

      public dzz a() {
         return this.a;
      }

      public got b() {
         if (this.b == null) {
            this.b = new got(this.a);
         }

         return this.b;
      }
   }
}
