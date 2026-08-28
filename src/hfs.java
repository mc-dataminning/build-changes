import it.unimi.dsi.fastutil.ints.Int2ObjectMap;
import it.unimi.dsi.fastutil.ints.Int2ObjectOpenHashMap;
import it.unimi.dsi.fastutil.objects.ObjectIterator;

public class hfs implements AutoCloseable {
   private final Int2ObjectMap<hfs.a> a = new Int2ObjectOpenHashMap();
   final hev b;

   public hfs(hev $$0) {
      this.b = $$0;
   }

   public void a(eus $$0, euu $$1) {
      this.c($$0, $$1).a();
   }

   public akv b(eus $$0, euu $$1) {
      hfs.a $$2 = this.c($$0, $$1);
      $$2.b();
      return $$2.d;
   }

   public void a() {
      ObjectIterator var1 = this.a.values().iterator();

      while (var1.hasNext()) {
         hfs.a $$0 = (hfs.a)var1.next();
         $$0.close();
      }

      this.a.clear();
   }

   private hfs.a c(eus $$0, euu $$1) {
      return (hfs.a)this.a.compute($$0.b(), ($$1x, $$2) -> {
         if ($$2 == null) {
            return new hfs.a($$1x, $$1);
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
      private euu a;
      private final heg b;
      private boolean c = true;
      final akv d;

      a(final int $$0, final euu $$1) {
         this.a = $$1;
         this.b = new heg(128, 128, true);
         this.d = akv.b("map/" + $$0);
         hfs.this.b.a(this.d, this.b);
      }

      void a(euu $$0) {
         boolean $$1 = this.a != $$0;
         this.a = $$0;
         this.c |= $$1;
      }

      public void a() {
         this.c = true;
      }

      void b() {
         if (this.c) {
            fev $$0 = this.b.e();
            if ($$0 != null) {
               for (int $$1 = 0; $$1 < 128; $$1++) {
                  for (int $$2 = 0; $$2 < 128; $$2++) {
                     int $$3 = $$2 + $$1 * 128;
                     $$0.a($$2, $$1, ete.b(this.a.g[$$3]));
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
