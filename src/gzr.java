import it.unimi.dsi.fastutil.ints.Int2ObjectMap;
import it.unimi.dsi.fastutil.ints.Int2ObjectOpenHashMap;
import it.unimi.dsi.fastutil.objects.ObjectIterator;

public class gzr implements AutoCloseable {
   private final Int2ObjectMap<gzr.a> a = new Int2ObjectOpenHashMap();
   final gyu b;

   public gzr(gyu $$0) {
      this.b = $$0;
   }

   public void a(etg $$0, eti $$1) {
      this.c($$0, $$1).a();
   }

   public all b(etg $$0, eti $$1) {
      gzr.a $$2 = this.c($$0, $$1);
      $$2.b();
      return $$2.d;
   }

   public void a() {
      ObjectIterator var1 = this.a.values().iterator();

      while (var1.hasNext()) {
         gzr.a $$0 = (gzr.a)var1.next();
         $$0.close();
      }

      this.a.clear();
   }

   private gzr.a c(etg $$0, eti $$1) {
      return (gzr.a)this.a.compute($$0.b(), ($$1x, $$2) -> {
         if ($$2 == null) {
            return new gzr.a($$1x, $$1);
         } else {
            $$2.a($$1);
            return $$2;
         }
      });
   }

   @Override
   public void close() {
      this.a();
   }

   class a implements AutoCloseable {
      private eti a;
      private final gyg b;
      private boolean c = true;
      final all d;

      a(final int $$0, final eti $$1) {
         this.a = $$1;
         this.b = new gyg(128, 128, true);
         this.d = gzr.this.b.a("map/" + $$0, this.b);
      }

      void a(eti $$0) {
         boolean $$1 = this.a != $$0;
         this.a = $$0;
         this.c |= $$1;
      }

      public void a() {
         this.c = true;
      }

      void b() {
         if (this.c) {
            fdk $$0 = this.b.f();
            if ($$0 != null) {
               for (int $$1 = 0; $$1 < 128; $$1++) {
                  for (int $$2 = 0; $$2 < 128; $$2++) {
                     int $$3 = $$2 + $$1 * 128;
                     $$0.a($$2, $$1, ers.b(this.a.g[$$3]));
                  }
               }
            }

            this.b.e();
            this.c = false;
         }
      }

      @Override
      public void close() {
         this.b.close();
      }
   }
}
