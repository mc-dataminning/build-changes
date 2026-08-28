import it.unimi.dsi.fastutil.ints.Int2ObjectMap;
import it.unimi.dsi.fastutil.ints.Int2ObjectOpenHashMap;
import it.unimi.dsi.fastutil.objects.ObjectIterator;

public class hch implements AutoCloseable {
   private final Int2ObjectMap<hch.a> a = new Int2ObjectOpenHashMap();
   final hbk b;

   public hch(hbk $$0) {
      this.b = $$0;
   }

   public void a(evo $$0, evq $$1) {
      this.c($$0, $$1).a();
   }

   public alz b(evo $$0, evq $$1) {
      hch.a $$2 = this.c($$0, $$1);
      $$2.b();
      return $$2.d;
   }

   public void a() {
      ObjectIterator var1 = this.a.values().iterator();

      while (var1.hasNext()) {
         hch.a $$0 = (hch.a)var1.next();
         $$0.close();
      }

      this.a.clear();
   }

   private hch.a c(evo $$0, evq $$1) {
      return (hch.a)this.a.compute($$0.b(), ($$1x, $$2) -> {
         if ($$2 == null) {
            return new hch.a($$1x, $$1);
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
      private evq a;
      private final haw b;
      private boolean c = true;
      final alz d;

      a(final int $$0, final evq $$1) {
         this.a = $$1;
         this.b = new haw(128, 128, true);
         this.d = hch.this.b.a("map/" + $$0, this.b);
      }

      void a(evq $$0) {
         boolean $$1 = this.a != $$0;
         this.a = $$0;
         this.c |= $$1;
      }

      public void a() {
         this.c = true;
      }

      void b() {
         if (this.c) {
            ffq $$0 = this.b.f();
            if ($$0 != null) {
               for (int $$1 = 0; $$1 < 128; $$1++) {
                  for (int $$2 = 0; $$2 < 128; $$2++) {
                     int $$3 = $$2 + $$1 * 128;
                     $$0.a($$2, $$1, eua.b(this.a.g[$$3]));
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
