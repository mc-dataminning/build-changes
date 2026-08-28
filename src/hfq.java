import it.unimi.dsi.fastutil.ints.Int2ObjectMap;
import it.unimi.dsi.fastutil.ints.Int2ObjectOpenHashMap;
import it.unimi.dsi.fastutil.objects.ObjectIterator;

public class hfq implements AutoCloseable {
   private final Int2ObjectMap<hfq.a> a = new Int2ObjectOpenHashMap();
   final het b;

   public hfq(het $$0) {
      this.b = $$0;
   }

   public void a(euq $$0, eus $$1) {
      this.c($$0, $$1).a();
   }

   public akv b(euq $$0, eus $$1) {
      hfq.a $$2 = this.c($$0, $$1);
      $$2.b();
      return $$2.d;
   }

   public void a() {
      ObjectIterator var1 = this.a.values().iterator();

      while (var1.hasNext()) {
         hfq.a $$0 = (hfq.a)var1.next();
         $$0.close();
      }

      this.a.clear();
   }

   private hfq.a c(euq $$0, eus $$1) {
      return (hfq.a)this.a.compute($$0.b(), ($$1x, $$2) -> {
         if ($$2 == null) {
            return new hfq.a($$1x, $$1);
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
      private eus a;
      private final hee b;
      private boolean c = true;
      final akv d;

      a(final int $$0, final eus $$1) {
         this.a = $$1;
         this.b = new hee(128, 128, true);
         this.d = akv.b("map/" + $$0);
         hfq.this.b.a(this.d, this.b);
      }

      void a(eus $$0) {
         boolean $$1 = this.a != $$0;
         this.a = $$0;
         this.c |= $$1;
      }

      public void a() {
         this.c = true;
      }

      void b() {
         if (this.c) {
            fet $$0 = this.b.e();
            if ($$0 != null) {
               for (int $$1 = 0; $$1 < 128; $$1++) {
                  for (int $$2 = 0; $$2 < 128; $$2++) {
                     int $$3 = $$2 + $$1 * 128;
                     $$0.a($$2, $$1, etc.b(this.a.g[$$3]));
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
