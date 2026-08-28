import it.unimi.dsi.fastutil.ints.Int2ObjectMap;
import it.unimi.dsi.fastutil.ints.Int2ObjectOpenHashMap;
import it.unimi.dsi.fastutil.objects.ObjectIterator;

public class hix implements AutoCloseable {
   private final Int2ObjectMap<hix.a> a = new Int2ObjectOpenHashMap();
   final hib b;

   public hix(hib $$0) {
      this.b = $$0;
   }

   public void a(exn $$0, exp $$1) {
      this.c($$0, $$1).a();
   }

   public ale b(exn $$0, exp $$1) {
      hix.a $$2 = this.c($$0, $$1);
      $$2.b();
      return $$2.d;
   }

   public void a() {
      ObjectIterator var1 = this.a.values().iterator();

      while (var1.hasNext()) {
         hix.a $$0 = (hix.a)var1.next();
         $$0.close();
      }

      this.a.clear();
   }

   private hix.a c(exn $$0, exp $$1) {
      return (hix.a)this.a.compute($$0.b(), ($$1x, $$2) -> {
         if ($$2 == null) {
            return new hix.a($$1x, $$1);
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
      private exp a;
      private final hhm b;
      private boolean c = true;
      final ale d;

      a(final int $$0, final exp $$1) {
         this.a = $$1;
         this.b = new hhm(128, 128, true);
         this.d = ale.b("map/" + $$0);
         hix.this.b.a(this.d, this.b);
      }

      void a(exp $$0) {
         boolean $$1 = this.a != $$0;
         this.a = $$0;
         this.c |= $$1;
      }

      public void a() {
         this.c = true;
      }

      void b() {
         if (this.c) {
            fhq $$0 = this.b.e();
            if ($$0 != null) {
               for (int $$1 = 0; $$1 < 128; $$1++) {
                  for (int $$2 = 0; $$2 < 128; $$2++) {
                     int $$3 = $$2 + $$1 * 128;
                     $$0.a($$2, $$1, evz.b(this.a.g[$$3]));
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
