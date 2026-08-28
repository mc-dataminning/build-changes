import it.unimi.dsi.fastutil.longs.Long2ObjectMap;
import it.unimi.dsi.fastutil.longs.Long2ObjectOpenHashMap;
import javax.annotation.Nullable;

public class glh {
   private final Long2ObjectMap<glh.a> a = new Long2ObjectOpenHashMap();

   @Nullable
   public glg a(dev $$0, ki $$1) {
      glh.a $$2 = this.a($$0, $$1.a(), $$1.c());
      if ($$2.a().c($$1.b())) {
         return null;
      } else {
         int $$3 = $$1.a() - 1;
         int $$4 = $$1.c() - 1;
         int $$5 = $$1.a() + 1;
         int $$6 = $$1.c() + 1;
         glf[] $$7 = new glf[9];

         for (int $$8 = $$4; $$8 <= $$6; $$8++) {
            for (int $$9 = $$3; $$9 <= $$5; $$9++) {
               int $$10 = glg.a($$3, $$4, $$9, $$8);
               glh.a $$11 = $$9 == $$1.a() && $$8 == $$1.c() ? $$2 : this.a($$0, $$9, $$8);
               $$7[$$10] = $$11.b();
            }
         }

         return new glg($$0, $$3, $$4, $$7);
      }
   }

   private glh.a a(dev $$0, int $$1, int $$2) {
      return (glh.a)this.a.computeIfAbsent(deb.c($$1, $$2), $$1x -> new glh.a($$0.d(deb.a($$1x), deb.b($$1x))));
   }

   static final class a {
      private final dxj a;
      @Nullable
      private glf b;

      a(dxj $$0) {
         this.a = $$0;
      }

      public dxj a() {
         return this.a;
      }

      public glf b() {
         if (this.b == null) {
            this.b = new glf(this.a);
         }

         return this.b;
      }
   }
}
