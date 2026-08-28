import it.unimi.dsi.fastutil.longs.Long2ObjectOpenHashMap;
import it.unimi.dsi.fastutil.longs.Long2ObjectMap.Entry;
import it.unimi.dsi.fastutil.objects.ObjectIterator;

public class ghj implements AutoCloseable {
   private final Long2ObjectOpenHashMap<ghj.a> a = new Long2ObjectOpenHashMap();
   private int b;
   private boolean c;

   public void a(ji $$0, dwv $$1, gkt $$2) {
      this.a.compute($$0.a(), ($$2x, $$3) -> $$3 != null ? $$3.a(this.b) : new ghj.a(this.b, $$1, $$2.du()));
   }

   public boolean a(ji $$0, dwv $$1) {
      ghj.a $$2 = (ghj.a)this.a.get($$0.a());
      if ($$2 == null) {
         return false;
      } else {
         $$2.a($$1);
         return true;
      }
   }

   public void a(int $$0, gfw $$1) {
      ObjectIterator<Entry<ghj.a>> $$2 = this.a.long2ObjectEntrySet().iterator();

      while ($$2.hasNext()) {
         Entry<ghj.a> $$3 = (Entry<ghj.a>)$$2.next();
         ghj.a $$4 = (ghj.a)$$3.getValue();
         if ($$4.b <= $$0) {
            ji $$5 = ji.d($$3.getLongKey());
            $$2.remove();
            $$1.a($$5, $$4.c, $$4.a);
         }
      }
   }

   public ghj a() {
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
      final fay a;
      int b;
      dwv c;

      a(int $$0, dwv $$1, fay $$2) {
         this.b = $$0;
         this.c = $$1;
         this.a = $$2;
      }

      ghj.a a(int $$0) {
         this.b = $$0;
         return this;
      }

      void a(dwv $$0) {
         this.c = $$0;
      }
   }
}
