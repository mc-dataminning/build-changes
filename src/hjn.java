import it.unimi.dsi.fastutil.ints.Int2ObjectMap;
import it.unimi.dsi.fastutil.ints.Int2ObjectOpenHashMap;
import it.unimi.dsi.fastutil.objects.ObjectIterator;

public class hjn implements AutoCloseable {
   private final Int2ObjectMap<hjn.a> a = new Int2ObjectOpenHashMap();
   final hir b;

   public hjn(hir $$0) {
      this.b = $$0;
   }

   public void a(exz $$0, eyb $$1) {
      this.c($$0, $$1).a();
   }

   public alg b(exz $$0, eyb $$1) {
      hjn.a $$2 = this.c($$0, $$1);
      $$2.b();
      return $$2.d;
   }

   public void a() {
      ObjectIterator var1 = this.a.values().iterator();

      while (var1.hasNext()) {
         hjn.a $$0 = (hjn.a)var1.next();
         $$0.close();
      }

      this.a.clear();
   }

   private hjn.a c(exz $$0, eyb $$1) {
      return (hjn.a)this.a.compute($$0.b(), ($$1x, $$2) -> {
         if ($$2 == null) {
            return new hjn.a($$1x, $$1);
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
      private eyb a;
      private final hic b;
      private boolean c = true;
      final alg d;

      a(final int $$0, final eyb $$1) {
         this.a = $$1;
         this.b = new hic(128, 128, true);
         this.d = alg.b("map/" + $$0);
         hjn.this.b.a(this.d, this.b);
      }

      void a(eyb $$0) {
         boolean $$1 = this.a != $$0;
         this.a = $$0;
         this.c |= $$1;
      }

      public void a() {
         this.c = true;
      }

      void b() {
         if (this.c) {
            fic $$0 = this.b.e();
            if ($$0 != null) {
               for (int $$1 = 0; $$1 < 128; $$1++) {
                  for (int $$2 = 0; $$2 < 128; $$2++) {
                     int $$3 = $$2 + $$1 * 128;
                     $$0.a($$2, $$1, ewk.b(this.a.h[$$3]));
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
