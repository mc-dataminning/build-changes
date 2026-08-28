import it.unimi.dsi.fastutil.longs.Long2ObjectOpenHashMap;
import it.unimi.dsi.fastutil.longs.Long2ObjectMap.Entry;
import it.unimi.dsi.fastutil.objects.ObjectIterator;

public class gkq implements AutoCloseable {
   private final Long2ObjectOpenHashMap<gkq.a> a = new Long2ObjectOpenHashMap();
   private int b;
   private boolean c;

   public void a(iu $$0, dzo $$1, goa $$2) {
      this.a.compute($$0.a(), ($$2x, $$3) -> $$3 != null ? $$3.a(this.b) : new gkq.a(this.b, $$1, $$2.dt()));
   }

   public boolean a(iu $$0, dzo $$1) {
      gkq.a $$2 = (gkq.a)this.a.get($$0.a());
      if ($$2 == null) {
         return false;
      } else {
         $$2.a($$1);
         return true;
      }
   }

   public void a(int $$0, gjd $$1) {
      ObjectIterator<Entry<gkq.a>> $$2 = this.a.long2ObjectEntrySet().iterator();

      while ($$2.hasNext()) {
         Entry<gkq.a> $$3 = (Entry<gkq.a>)$$2.next();
         gkq.a $$4 = (gkq.a)$$3.getValue();
         if ($$4.b <= $$0) {
            iu $$5 = iu.d($$3.getLongKey());
            $$2.remove();
            $$1.a($$5, $$4.c, $$4.a);
         }
      }
   }

   public gkq a() {
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
      final fdw a;
      int b;
      dzo c;

      a(int $$0, dzo $$1, fdw $$2) {
         this.b = $$0;
         this.c = $$1;
         this.a = $$2;
      }

      gkq.a a(int $$0) {
         this.b = $$0;
         return this;
      }

      void a(dzo $$0) {
         this.c = $$0;
      }
   }
}
