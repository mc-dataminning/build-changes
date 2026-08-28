import it.unimi.dsi.fastutil.longs.Long2ObjectMap;
import it.unimi.dsi.fastutil.longs.Long2ObjectOpenHashMap;
import javax.annotation.Nullable;

public class gow {
   private final Long2ObjectMap<gow.a> a = new Long2ObjectOpenHashMap();

   @Nullable
   public gov a(dhi $$0, kj $$1) {
      gow.a $$2 = this.a($$0, $$1.a(), $$1.c());
      if ($$2.a().c($$1.b())) {
         return null;
      } else {
         int $$3 = $$1.a() - 1;
         int $$4 = $$1.c() - 1;
         int $$5 = $$1.a() + 1;
         int $$6 = $$1.c() + 1;
         gou[] $$7 = new gou[9];

         for (int $$8 = $$4; $$8 <= $$6; $$8++) {
            for (int $$9 = $$3; $$9 <= $$5; $$9++) {
               int $$10 = gov.a($$3, $$4, $$9, $$8);
               gow.a $$11 = $$9 == $$1.a() && $$8 == $$1.c() ? $$2 : this.a($$0, $$9, $$8);
               $$7[$$10] = $$11.b();
            }
         }

         return new gov($$0, $$3, $$4, $$7);
      }
   }

   private gow.a a(dhi $$0, int $$1, int $$2) {
      return (gow.a)this.a.computeIfAbsent(dgo.c($$1, $$2), $$1x -> new gow.a($$0.d(dgo.a($$1x), dgo.b($$1x))));
   }

   static final class a {
      private final eaa a;
      @Nullable
      private gou b;

      a(eaa $$0) {
         this.a = $$0;
      }

      public eaa a() {
         return this.a;
      }

      public gou b() {
         if (this.b == null) {
            this.b = new gou(this.a);
         }

         return this.b;
      }
   }
}
