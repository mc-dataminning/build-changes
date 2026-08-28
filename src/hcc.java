import it.unimi.dsi.fastutil.ints.Int2ObjectMap;
import it.unimi.dsi.fastutil.ints.Int2ObjectOpenHashMap;
import it.unimi.dsi.fastutil.objects.ObjectIterator;

public class hcc implements AutoCloseable {
   private final Int2ObjectMap<hcc.a> a = new Int2ObjectOpenHashMap();
   final hbf b;

   public hcc(hbf $$0) {
      this.b = $$0;
   }

   public void a(evh $$0, evj $$1) {
      this.c($$0, $$1).a();
   }

   public alz b(evh $$0, evj $$1) {
      hcc.a $$2 = this.c($$0, $$1);
      $$2.b();
      return $$2.d;
   }

   public void a() {
      ObjectIterator var1 = this.a.values().iterator();

      while (var1.hasNext()) {
         hcc.a $$0 = (hcc.a)var1.next();
         $$0.close();
      }

      this.a.clear();
   }

   private hcc.a c(evh $$0, evj $$1) {
      return (hcc.a)this.a.compute($$0.b(), ($$1x, $$2) -> {
         if ($$2 == null) {
            return new hcc.a($$1x, $$1);
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
      private evj a;
      private final har b;
      private boolean c = true;
      final alz d;

      a(final int $$0, final evj $$1) {
         this.a = $$1;
         this.b = new har(128, 128, true);
         this.d = hcc.this.b.a("map/" + $$0, this.b);
      }

      void a(evj $$0) {
         boolean $$1 = this.a != $$0;
         this.a = $$0;
         this.c |= $$1;
      }

      public void a() {
         this.c = true;
      }

      void b() {
         if (this.c) {
            ffl $$0 = this.b.f();
            if ($$0 != null) {
               for (int $$1 = 0; $$1 < 128; $$1++) {
                  for (int $$2 = 0; $$2 < 128; $$2++) {
                     int $$3 = $$2 + $$1 * 128;
                     $$0.a($$2, $$1, ett.b(this.a.g[$$3]));
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
