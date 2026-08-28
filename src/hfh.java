import it.unimi.dsi.fastutil.ints.Int2ObjectMap;
import it.unimi.dsi.fastutil.ints.Int2ObjectOpenHashMap;
import it.unimi.dsi.fastutil.objects.ObjectIterator;

public class hfh implements AutoCloseable {
   private final Int2ObjectMap<hfh.a> a = new Int2ObjectOpenHashMap();
   final hek b;

   public hfh(hek $$0) {
      this.b = $$0;
   }

   public void a(eur $$0, eut $$1) {
      this.c($$0, $$1).a();
   }

   public aku b(eur $$0, eut $$1) {
      hfh.a $$2 = this.c($$0, $$1);
      $$2.b();
      return $$2.d;
   }

   public void a() {
      ObjectIterator var1 = this.a.values().iterator();

      while (var1.hasNext()) {
         hfh.a $$0 = (hfh.a)var1.next();
         $$0.close();
      }

      this.a.clear();
   }

   private hfh.a c(eur $$0, eut $$1) {
      return (hfh.a)this.a.compute($$0.b(), ($$1x, $$2) -> {
         if ($$2 == null) {
            return new hfh.a($$1x, $$1);
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
      private eut a;
      private final hdw b;
      private boolean c = true;
      final aku d;

      a(final int $$0, final eut $$1) {
         this.a = $$1;
         this.b = new hdw(128, 128, true);
         this.d = hfh.this.b.a("map/" + $$0, this.b);
      }

      void a(eut $$0) {
         boolean $$1 = this.a != $$0;
         this.a = $$0;
         this.c |= $$1;
      }

      public void a() {
         this.c = true;
      }

      void b() {
         if (this.c) {
            feu $$0 = this.b.f();
            if ($$0 != null) {
               for (int $$1 = 0; $$1 < 128; $$1++) {
                  for (int $$2 = 0; $$2 < 128; $$2++) {
                     int $$3 = $$2 + $$1 * 128;
                     $$0.a($$2, $$1, etd.b(this.a.g[$$3]));
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
