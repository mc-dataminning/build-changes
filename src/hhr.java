import it.unimi.dsi.fastutil.ints.Int2ObjectMap;
import it.unimi.dsi.fastutil.ints.Int2ObjectOpenHashMap;
import it.unimi.dsi.fastutil.objects.ObjectIterator;

public class hhr implements AutoCloseable {
   private final Int2ObjectMap<hhr.a> a = new Int2ObjectOpenHashMap();
   final hgu b;

   public hhr(hgu $$0) {
      this.b = $$0;
   }

   public void a(ewl $$0, ewn $$1) {
      this.c($$0, $$1).a();
   }

   public ald b(ewl $$0, ewn $$1) {
      hhr.a $$2 = this.c($$0, $$1);
      $$2.b();
      return $$2.d;
   }

   public void a() {
      ObjectIterator var1 = this.a.values().iterator();

      while (var1.hasNext()) {
         hhr.a $$0 = (hhr.a)var1.next();
         $$0.close();
      }

      this.a.clear();
   }

   private hhr.a c(ewl $$0, ewn $$1) {
      return (hhr.a)this.a.compute($$0.b(), ($$1x, $$2) -> {
         if ($$2 == null) {
            return new hhr.a($$1x, $$1);
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
      private ewn a;
      private final hgf b;
      private boolean c = true;
      final ald d;

      a(final int $$0, final ewn $$1) {
         this.a = $$1;
         this.b = new hgf(128, 128, true);
         this.d = ald.b("map/" + $$0);
         hhr.this.b.a(this.d, this.b);
      }

      void a(ewn $$0) {
         boolean $$1 = this.a != $$0;
         this.a = $$0;
         this.c |= $$1;
      }

      public void a() {
         this.c = true;
      }

      void b() {
         if (this.c) {
            fgo $$0 = this.b.e();
            if ($$0 != null) {
               for (int $$1 = 0; $$1 < 128; $$1++) {
                  for (int $$2 = 0; $$2 < 128; $$2++) {
                     int $$3 = $$2 + $$1 * 128;
                     $$0.a($$2, $$1, eux.b(this.a.g[$$3]));
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
