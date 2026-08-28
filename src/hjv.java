import it.unimi.dsi.fastutil.ints.Int2ObjectMap;
import it.unimi.dsi.fastutil.ints.Int2ObjectOpenHashMap;
import it.unimi.dsi.fastutil.objects.ObjectIterator;

public class hjv implements AutoCloseable {
   private final Int2ObjectMap<hjv.a> a = new Int2ObjectOpenHashMap();
   final hiz b;

   public hjv(hiz $$0) {
      this.b = $$0;
   }

   public void a(eyh $$0, eyj $$1) {
      this.c($$0, $$1).a();
   }

   public alg b(eyh $$0, eyj $$1) {
      hjv.a $$2 = this.c($$0, $$1);
      $$2.b();
      return $$2.d;
   }

   public void a() {
      ObjectIterator var1 = this.a.values().iterator();

      while (var1.hasNext()) {
         hjv.a $$0 = (hjv.a)var1.next();
         $$0.close();
      }

      this.a.clear();
   }

   private hjv.a c(eyh $$0, eyj $$1) {
      return (hjv.a)this.a.compute($$0.b(), ($$1x, $$2) -> {
         if ($$2 == null) {
            return new hjv.a($$1x, $$1);
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
      private eyj a;
      private final hik b;
      private boolean c = true;
      final alg d;

      a(final int $$0, final eyj $$1) {
         this.a = $$1;
         this.b = new hik(128, 128, true);
         this.d = alg.b("map/" + $$0);
         hjv.this.b.a(this.d, this.b);
      }

      void a(eyj $$0) {
         boolean $$1 = this.a != $$0;
         this.a = $$0;
         this.c |= $$1;
      }

      public void a() {
         this.c = true;
      }

      void b() {
         if (this.c) {
            fik $$0 = this.b.e();
            if ($$0 != null) {
               for (int $$1 = 0; $$1 < 128; $$1++) {
                  for (int $$2 = 0; $$2 < 128; $$2++) {
                     int $$3 = $$2 + $$1 * 128;
                     $$0.a($$2, $$1, ews.b(this.a.h[$$3]));
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
