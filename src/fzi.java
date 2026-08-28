import it.unimi.dsi.fastutil.longs.Long2ObjectOpenHashMap;
import it.unimi.dsi.fastutil.longs.Long2ObjectMap.Entry;
import it.unimi.dsi.fastutil.objects.ObjectIterator;

public class fzi implements AutoCloseable {
   private final Long2ObjectOpenHashMap<fzi.a> a = new Long2ObjectOpenHashMap();
   private int b;
   private boolean c;

   public void a(iz $$0, dsd $$1, gcr $$2) {
      this.a.compute($$0.a(), ($$2x, $$3) -> $$3 != null ? $$3.a(this.b) : new fzi.a(this.b, $$1, $$2.dn()));
   }

   public boolean a(iz $$0, dsd $$1) {
      fzi.a $$2 = (fzi.a)this.a.get($$0.a());
      if ($$2 == null) {
         return false;
      } else {
         $$2.a($$1);
         return true;
      }
   }

   public void a(int $$0, fxw $$1) {
      ObjectIterator<Entry<fzi.a>> $$2 = this.a.long2ObjectEntrySet().iterator();

      while ($$2.hasNext()) {
         Entry<fzi.a> $$3 = (Entry<fzi.a>)$$2.next();
         fzi.a $$4 = (fzi.a)$$3.getValue();
         if ($$4.b <= $$0) {
            iz $$5 = iz.d($$3.getLongKey());
            $$2.remove();
            $$1.a($$5, $$4.c, $$4.a);
         }
      }
   }

   public fzi a() {
      this.b++;
      this.c = true;
      return this;
   }

   @Override
   public void close() {
      this.c = false;
   }

   public int b() {
      return this.b;
   }

   public boolean c() {
      return this.c;
   }

   static class a {
      final evs a;
      int b;
      dsd c;

      a(int $$0, dsd $$1, evs $$2) {
         this.b = $$0;
         this.c = $$1;
         this.a = $$2;
      }

      fzi.a a(int $$0) {
         this.b = $$0;
         return this;
      }

      void a(dsd $$0) {
         this.c = $$0;
      }
   }
}
