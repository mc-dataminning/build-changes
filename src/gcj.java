import it.unimi.dsi.fastutil.longs.Long2ObjectOpenHashMap;
import it.unimi.dsi.fastutil.longs.Long2ObjectMap.Entry;
import it.unimi.dsi.fastutil.objects.ObjectIterator;

public class gcj implements AutoCloseable {
   private final Long2ObjectOpenHashMap<gcj.a> a = new Long2ObjectOpenHashMap();
   private int b;
   private boolean c;

   public void a(je $$0, dua $$1, gfs $$2) {
      this.a.compute($$0.a(), ($$2x, $$3) -> $$3 != null ? $$3.a(this.b) : new gcj.a(this.b, $$1, $$2.dq()));
   }

   public boolean a(je $$0, dua $$1) {
      gcj.a $$2 = (gcj.a)this.a.get($$0.a());
      if ($$2 == null) {
         return false;
      } else {
         $$2.a($$1);
         return true;
      }
   }

   public void a(int $$0, gax $$1) {
      ObjectIterator<Entry<gcj.a>> $$2 = this.a.long2ObjectEntrySet().iterator();

      while ($$2.hasNext()) {
         Entry<gcj.a> $$3 = (Entry<gcj.a>)$$2.next();
         gcj.a $$4 = (gcj.a)$$3.getValue();
         if ($$4.b <= $$0) {
            je $$5 = je.d($$3.getLongKey());
            $$2.remove();
            $$1.a($$5, $$4.c, $$4.a);
         }
      }
   }

   public gcj a() {
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
      final eye a;
      int b;
      dua c;

      a(int $$0, dua $$1, eye $$2) {
         this.b = $$0;
         this.c = $$1;
         this.a = $$2;
      }

      gcj.a a(int $$0) {
         this.b = $$0;
         return this;
      }

      void a(dua $$0) {
         this.c = $$0;
      }
   }
}
