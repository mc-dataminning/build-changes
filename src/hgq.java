import it.unimi.dsi.fastutil.ints.Int2ObjectMap;
import it.unimi.dsi.fastutil.ints.Int2ObjectOpenHashMap;
import it.unimi.dsi.fastutil.objects.ObjectIterator;

public class hgq implements AutoCloseable {
   private final Int2ObjectMap<hgq.a> a = new Int2ObjectOpenHashMap();
   final hft b;

   public hgq(hft $$0) {
      this.b = $$0;
   }

   public void a(evo $$0, evq $$1) {
      this.c($$0, $$1).a();
   }

   public aku b(evo $$0, evq $$1) {
      hgq.a $$2 = this.c($$0, $$1);
      $$2.b();
      return $$2.d;
   }

   public void a() {
      ObjectIterator var1 = this.a.values().iterator();

      while (var1.hasNext()) {
         hgq.a $$0 = (hgq.a)var1.next();
         $$0.close();
      }

      this.a.clear();
   }

   private hgq.a c(evo $$0, evq $$1) {
      return (hgq.a)this.a.compute($$0.b(), ($$1x, $$2) -> {
         if ($$2 == null) {
            return new hgq.a($$1x, $$1);
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
      private final hfe b;
      private boolean c = true;
      final aku d;

      a(final int $$0, final evq $$1) {
         this.a = $$1;
         this.b = new hfe(128, 128, true);
         this.d = aku.b("map/" + $$0);
         hgq.this.b.a(this.d, this.b);
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
            ffr $$0 = this.b.e();
            if ($$0 != null) {
               for (int $$1 = 0; $$1 < 128; $$1++) {
                  for (int $$2 = 0; $$2 < 128; $$2++) {
                     int $$3 = $$2 + $$1 * 128;
                     $$0.a($$2, $$1, eua.b(this.a.g[$$3]));
                  }
               }
            }

            this.b.d();
            this.c = false;
         }
      }

      @Override
      public void close() {
         this.b.close();
      }
   }
}
