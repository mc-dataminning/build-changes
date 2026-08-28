import it.unimi.dsi.fastutil.ints.Int2ObjectMap;
import it.unimi.dsi.fastutil.ints.Int2ObjectOpenHashMap;
import it.unimi.dsi.fastutil.objects.ObjectIterator;

public class gxz implements AutoCloseable {
   private final Int2ObjectMap<gxz.a> a = new Int2ObjectOpenHashMap();
   final gxc b;

   public gxz(gxc $$0) {
      this.b = $$0;
   }

   public void a(esh $$0, esj $$1) {
      this.c($$0, $$1).a();
   }

   public alc b(esh $$0, esj $$1) {
      gxz.a $$2 = this.c($$0, $$1);
      $$2.b();
      return $$2.d;
   }

   public void a() {
      ObjectIterator var1 = this.a.values().iterator();

      while (var1.hasNext()) {
         gxz.a $$0 = (gxz.a)var1.next();
         $$0.close();
      }

      this.a.clear();
   }

   private gxz.a c(esh $$0, esj $$1) {
      return (gxz.a)this.a.compute($$0.b(), ($$1x, $$2) -> {
         if ($$2 == null) {
            return new gxz.a($$1x, $$1);
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
      private esj a;
      private final gwo b;
      private boolean c = true;
      final alc d;

      a(final int $$0, final esj $$1) {
         this.a = $$1;
         this.b = new gwo(128, 128, true);
         this.d = gxz.this.b.a("map/" + $$0, this.b);
      }

      void a(esj $$0) {
         boolean $$1 = this.a != $$0;
         this.a = $$0;
         this.c |= $$1;
      }

      public void a() {
         this.c = true;
      }

      void b() {
         if (this.c) {
            fce $$0 = this.b.f();
            if ($$0 != null) {
               for (int $$1 = 0; $$1 < 128; $$1++) {
                  for (int $$2 = 0; $$2 < 128; $$2++) {
                     int $$3 = $$2 + $$1 * 128;
                     $$0.a($$2, $$1, eqt.b(this.a.g[$$3]));
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
