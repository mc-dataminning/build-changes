import it.unimi.dsi.fastutil.ints.Int2ObjectMap;
import it.unimi.dsi.fastutil.ints.Int2ObjectOpenHashMap;
import it.unimi.dsi.fastutil.objects.ObjectIterator;

public class hlz implements AutoCloseable {
   private final Int2ObjectMap<hlz.a> a = new Int2ObjectOpenHashMap();
   final hlc b;

   public hlz(hlc $$0) {
      this.b = $$0;
   }

   public void a(ezh $$0, ezj $$1) {
      this.c($$0, $$1).a();
   }

   public ali b(ezh $$0, ezj $$1) {
      hlz.a $$2 = this.c($$0, $$1);
      $$2.b();
      return $$2.d;
   }

   public void a() {
      ObjectIterator var1 = this.a.values().iterator();

      while (var1.hasNext()) {
         hlz.a $$0 = (hlz.a)var1.next();
         $$0.close();
      }

      this.a.clear();
   }

   private hlz.a c(ezh $$0, ezj $$1) {
      return (hlz.a)this.a.compute($$0.b(), ($$1x, $$2) -> {
         if ($$2 == null) {
            return new hlz.a($$1x, $$1);
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
      private ezj a;
      private final hkn b;
      private boolean c = true;
      final ali d;

      a(final int $$0, final ezj $$1) {
         this.a = $$1;
         this.b = new hkn(() -> "Map " + $$0, 128, 128, true);
         this.d = ali.b("map/" + $$0);
         hlz.this.b.a(this.d, this.b);
      }

      void a(ezj $$0) {
         boolean $$1 = this.a != $$0;
         this.a = $$0;
         this.c |= $$1;
      }

      public void a() {
         this.c = true;
      }

      void b() {
         if (this.c) {
            fkg $$0 = this.b.c();
            if ($$0 != null) {
               for (int $$1 = 0; $$1 < 128; $$1++) {
                  for (int $$2 = 0; $$2 < 128; $$2++) {
                     int $$3 = $$2 + $$1 * 128;
                     $$0.b($$2, $$1, exs.b(this.a.h[$$3]));
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
