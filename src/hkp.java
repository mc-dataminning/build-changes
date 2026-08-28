import it.unimi.dsi.fastutil.ints.Int2ObjectMap;
import it.unimi.dsi.fastutil.ints.Int2ObjectOpenHashMap;
import it.unimi.dsi.fastutil.objects.ObjectIterator;

public class hkp implements AutoCloseable {
   private final Int2ObjectMap<hkp.a> a = new Int2ObjectOpenHashMap();
   final hjs b;

   public hkp(hjs $$0) {
      this.b = $$0;
   }

   public void a(eyt $$0, eyv $$1) {
      this.c($$0, $$1).a();
   }

   public alg b(eyt $$0, eyv $$1) {
      hkp.a $$2 = this.c($$0, $$1);
      $$2.b();
      return $$2.d;
   }

   public void a() {
      ObjectIterator var1 = this.a.values().iterator();

      while (var1.hasNext()) {
         hkp.a $$0 = (hkp.a)var1.next();
         $$0.close();
      }

      this.a.clear();
   }

   private hkp.a c(eyt $$0, eyv $$1) {
      return (hkp.a)this.a.compute($$0.b(), ($$1x, $$2) -> {
         if ($$2 == null) {
            return new hkp.a($$1x, $$1);
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
      private eyv a;
      private final hjd b;
      private boolean c = true;
      final alg d;

      a(final int $$0, final eyv $$1) {
         this.a = $$1;
         this.b = new hjd(() -> "Map " + $$0, 128, 128, true);
         this.d = alg.b("map/" + $$0);
         hkp.this.b.a(this.d, this.b);
      }

      void a(eyv $$0) {
         boolean $$1 = this.a != $$0;
         this.a = $$0;
         this.c |= $$1;
      }

      public void a() {
         this.c = true;
      }

      void b() {
         if (this.c) {
            fiz $$0 = this.b.d();
            if ($$0 != null) {
               for (int $$1 = 0; $$1 < 128; $$1++) {
                  for (int $$2 = 0; $$2 < 128; $$2++) {
                     int $$3 = $$2 + $$1 * 128;
                     $$0.b($$2, $$1, exe.b(this.a.h[$$3]));
                  }
               }
            }

            this.b.c();
            this.c = false;
         }
      }

      @Override
      public void close() {
         this.b.close();
      }
   }
}
