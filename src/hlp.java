import it.unimi.dsi.fastutil.ints.Int2ObjectMap;
import it.unimi.dsi.fastutil.ints.Int2ObjectOpenHashMap;
import it.unimi.dsi.fastutil.objects.ObjectIterator;

public class hlp implements AutoCloseable {
   private final Int2ObjectMap<hlp.a> a = new Int2ObjectOpenHashMap();
   final hks b;

   public hlp(hks $$0) {
      this.b = $$0;
   }

   public void a(ezt $$0, ezv $$1) {
      this.c($$0, $$1).a();
   }

   public alr b(ezt $$0, ezv $$1) {
      hlp.a $$2 = this.c($$0, $$1);
      $$2.b();
      return $$2.d;
   }

   public void a() {
      ObjectIterator var1 = this.a.values().iterator();

      while (var1.hasNext()) {
         hlp.a $$0 = (hlp.a)var1.next();
         $$0.close();
      }

      this.a.clear();
   }

   private hlp.a c(ezt $$0, ezv $$1) {
      return (hlp.a)this.a.compute($$0.b(), ($$1x, $$2) -> {
         if ($$2 == null) {
            return new hlp.a($$1x, $$1);
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
      private ezv a;
      private final hkd b;
      private boolean c = true;
      final alr d;

      a(final int $$0, final ezv $$1) {
         this.a = $$1;
         this.b = new hkd(() -> "Map " + $$0, 128, 128, true);
         this.d = alr.b("map/" + $$0);
         hlp.this.b.a(this.d, this.b);
      }

      void a(ezv $$0) {
         boolean $$1 = this.a != $$0;
         this.a = $$0;
         this.c |= $$1;
      }

      public void a() {
         this.c = true;
      }

      void b() {
         if (this.c) {
            fkf $$0 = this.b.c();
            if ($$0 != null) {
               for (int $$1 = 0; $$1 < 128; $$1++) {
                  for (int $$2 = 0; $$2 < 128; $$2++) {
                     int $$3 = $$2 + $$1 * 128;
                     $$0.b($$2, $$1, eye.b(this.a.h[$$3]));
                  }
               }
            }

            this.b.b();
            this.c = false;
         }
      }

      @Override
      public void close() {
         this.b.close();
      }
   }
}
