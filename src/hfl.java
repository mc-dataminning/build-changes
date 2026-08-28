import it.unimi.dsi.fastutil.ints.Int2ObjectMap;
import it.unimi.dsi.fastutil.ints.Int2ObjectOpenHashMap;
import it.unimi.dsi.fastutil.objects.ObjectIterator;

public class hfl implements AutoCloseable {
   private final Int2ObjectMap<hfl.a> a = new Int2ObjectOpenHashMap();
   final heo b;

   public hfl(heo $$0) {
      this.b = $$0;
   }

   public void a(eup $$0, eur $$1) {
      this.c($$0, $$1).a();
   }

   public aku b(eup $$0, eur $$1) {
      hfl.a $$2 = this.c($$0, $$1);
      $$2.b();
      return $$2.d;
   }

   public void a() {
      ObjectIterator var1 = this.a.values().iterator();

      while (var1.hasNext()) {
         hfl.a $$0 = (hfl.a)var1.next();
         $$0.close();
      }

      this.a.clear();
   }

   private hfl.a c(eup $$0, eur $$1) {
      return (hfl.a)this.a.compute($$0.b(), ($$1x, $$2) -> {
         if ($$2 == null) {
            return new hfl.a($$1x, $$1);
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
      private eur a;
      private final hdz b;
      private boolean c = true;
      final aku d;

      a(final int $$0, final eur $$1) {
         this.a = $$1;
         this.b = new hdz(128, 128, true);
         this.d = aku.b("map/" + $$0);
         hfl.this.b.a(this.d, this.b);
      }

      void a(eur $$0) {
         boolean $$1 = this.a != $$0;
         this.a = $$0;
         this.c |= $$1;
      }

      public void a() {
         this.c = true;
      }

      void b() {
         if (this.c) {
            fes $$0 = this.b.f();
            if ($$0 != null) {
               for (int $$1 = 0; $$1 < 128; $$1++) {
                  for (int $$2 = 0; $$2 < 128; $$2++) {
                     int $$3 = $$2 + $$1 * 128;
                     $$0.a($$2, $$1, etb.b(this.a.g[$$3]));
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
