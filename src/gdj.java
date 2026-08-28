import it.unimi.dsi.fastutil.longs.Long2ObjectOpenHashMap;
import it.unimi.dsi.fastutil.longs.Long2ObjectMap.Entry;
import it.unimi.dsi.fastutil.objects.ObjectIterator;

public class gdj implements AutoCloseable {
   private final Long2ObjectOpenHashMap<gdj.a> a = new Long2ObjectOpenHashMap();
   private int b;
   private boolean c;

   public void a(jg $$0, dvd $$1, ggs $$2) {
      this.a.compute($$0.a(), ($$2x, $$3) -> $$3 != null ? $$3.a(this.b) : new gdj.a(this.b, $$1, $$2.dv()));
   }

   public boolean a(jg $$0, dvd $$1) {
      gdj.a $$2 = (gdj.a)this.a.get($$0.a());
      if ($$2 == null) {
         return false;
      } else {
         $$2.a($$1);
         return true;
      }
   }

   public void a(int $$0, gbx $$1) {
      ObjectIterator<Entry<gdj.a>> $$2 = this.a.long2ObjectEntrySet().iterator();

      while ($$2.hasNext()) {
         Entry<gdj.a> $$3 = (Entry<gdj.a>)$$2.next();
         gdj.a $$4 = (gdj.a)$$3.getValue();
         if ($$4.b <= $$0) {
            jg $$5 = jg.d($$3.getLongKey());
            $$2.remove();
            $$1.a($$5, $$4.c, $$4.a);
         }
      }
   }

   public gdj a() {
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
      final ezh a;
      int b;
      dvd c;

      a(int $$0, dvd $$1, ezh $$2) {
         this.b = $$0;
         this.c = $$1;
         this.a = $$2;
      }

      gdj.a a(int $$0) {
         this.b = $$0;
         return this;
      }

      void a(dvd $$0) {
         this.c = $$0;
      }
   }
}
