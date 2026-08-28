import it.unimi.dsi.fastutil.ints.Int2ObjectMap;
import it.unimi.dsi.fastutil.ints.Int2ObjectOpenHashMap;
import it.unimi.dsi.fastutil.objects.ObjectIterator;

public class hki implements AutoCloseable {
   private final Int2ObjectMap<hki.a> a = new Int2ObjectOpenHashMap();
   final hjm b;

   public hki(hjm $$0) {
      this.b = $$0;
   }

   public void a(eyo $$0, eyq $$1) {
      this.c($$0, $$1).a();
   }

   public alg b(eyo $$0, eyq $$1) {
      hki.a $$2 = this.c($$0, $$1);
      $$2.b();
      return $$2.d;
   }

   public void a() {
      ObjectIterator var1 = this.a.values().iterator();

      while (var1.hasNext()) {
         hki.a $$0 = (hki.a)var1.next();
         $$0.close();
      }

      this.a.clear();
   }

   private hki.a c(eyo $$0, eyq $$1) {
      return (hki.a)this.a.compute($$0.b(), ($$1x, $$2) -> {
         if ($$2 == null) {
            return new hki.a($$1x, $$1);
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
      private eyq a;
      private final hix b;
      private boolean c = true;
      final alg d;

      a(final int $$0, final eyq $$1) {
         this.a = $$1;
         this.b = new hix(() -> "Map " + $$0, 128, 128, true);
         this.d = alg.b("map/" + $$0);
         hki.this.b.a(this.d, this.b);
      }

      void a(eyq $$0) {
         boolean $$1 = this.a != $$0;
         this.a = $$0;
         this.c |= $$1;
      }

      public void a() {
         this.c = true;
      }

      void b() {
         if (this.c) {
            fiu $$0 = this.b.f();
            if ($$0 != null) {
               for (int $$1 = 0; $$1 < 128; $$1++) {
                  for (int $$2 = 0; $$2 < 128; $$2++) {
                     int $$3 = $$2 + $$1 * 128;
                     $$0.a($$2, $$1, ewz.b(this.a.h[$$3]));
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
