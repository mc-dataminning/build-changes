import it.unimi.dsi.fastutil.longs.Long2ObjectMap;
import it.unimi.dsi.fastutil.longs.Long2ObjectOpenHashMap;
import javax.annotation.Nullable;

public class gtf {
   private final Long2ObjectMap<gtf.a> a = new Long2ObjectOpenHashMap();

   @Nullable
   public gte a(div $$0, jx $$1) {
      gtf.a $$2 = this.a($$0, $$1.a(), $$1.c());
      if ($$2.a().c($$1.b())) {
         return null;
      } else {
         int $$3 = $$1.a() - 1;
         int $$4 = $$1.c() - 1;
         int $$5 = $$1.a() + 1;
         int $$6 = $$1.c() + 1;
         gtd[] $$7 = new gtd[9];

         for (int $$8 = $$4; $$8 <= $$6; $$8++) {
            for (int $$9 = $$3; $$9 <= $$5; $$9++) {
               int $$10 = gte.a($$3, $$4, $$9, $$8);
               gtf.a $$11 = $$9 == $$1.a() && $$8 == $$1.c() ? $$2 : this.a($$0, $$9, $$8);
               $$7[$$10] = $$11.b();
            }
         }

         return new gte($$0, $$3, $$4, $$7);
      }
   }

   private gtf.a a(div $$0, int $$1, int $$2) {
      return (gtf.a)this.a.computeIfAbsent(dic.c($$1, $$2), $$1x -> new gtf.a($$0.d(dic.a($$1x), dic.b($$1x))));
   }

   static final class a {
      private final ecg a;
      @Nullable
      private gtd b;

      a(ecg $$0) {
         this.a = $$0;
      }

      public ecg a() {
         return this.a;
      }

      public gtd b() {
         if (this.b == null) {
            this.b = new gtd(this.a);
         }

         return this.b;
      }
   }
}
