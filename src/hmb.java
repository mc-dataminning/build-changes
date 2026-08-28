import it.unimi.dsi.fastutil.ints.Int2ObjectMap;
import it.unimi.dsi.fastutil.ints.Int2ObjectOpenHashMap;
import it.unimi.dsi.fastutil.objects.ObjectIterator;

public class hmb implements AutoCloseable {
   private final Int2ObjectMap<hmb.a> a = new Int2ObjectOpenHashMap();
   final hle b;

   public hmb(hle $$0) {
      this.b = $$0;
   }

   public void a(ezj $$0, ezl $$1) {
      this.c($$0, $$1).a();
   }

   public alk b(ezj $$0, ezl $$1) {
      hmb.a $$2 = this.c($$0, $$1);
      $$2.b();
      return $$2.d;
   }

   public void a() {
      ObjectIterator var1 = this.a.values().iterator();

      while (var1.hasNext()) {
         hmb.a $$0 = (hmb.a)var1.next();
         $$0.close();
      }

      this.a.clear();
   }

   private hmb.a c(ezj $$0, ezl $$1) {
      return (hmb.a)this.a.compute($$0.b(), ($$1x, $$2) -> {
         if ($$2 == null) {
            return new hmb.a($$1x, $$1);
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
      private ezl a;
      private final hkp b;
      private boolean c = true;
      final alk d;

      a(final int $$0, final ezl $$1) {
         this.a = $$1;
         this.b = new hkp(() -> "Map " + $$0, 128, 128, true);
         this.d = alk.b("map/" + $$0);
         hmb.this.b.a(this.d, this.b);
      }

      void a(ezl $$0) {
         boolean $$1 = this.a != $$0;
         this.a = $$0;
         this.c |= $$1;
      }

      public void a() {
         this.c = true;
      }

      void b() {
         if (this.c) {
            fki $$0 = this.b.c();
            if ($$0 != null) {
               for (int $$1 = 0; $$1 < 128; $$1++) {
                  for (int $$2 = 0; $$2 < 128; $$2++) {
                     int $$3 = $$2 + $$1 * 128;
                     $$0.b($$2, $$1, exu.b(this.a.h[$$3]));
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
