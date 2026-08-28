import it.unimi.dsi.fastutil.longs.Long2ObjectOpenHashMap;
import it.unimi.dsi.fastutil.longs.Long2ObjectMap.Entry;
import it.unimi.dsi.fastutil.objects.ObjectIterator;

public class get implements AutoCloseable {
   private final Long2ObjectOpenHashMap<get.a> a = new Long2ObjectOpenHashMap();
   private int b;
   private boolean c;

   public void a(jh $$0, dvv $$1, gic $$2) {
      this.a.compute($$0.a(), ($$2x, $$3) -> $$3 != null ? $$3.a(this.b) : new get.a(this.b, $$1, $$2.dt()));
   }

   public boolean a(jh $$0, dvv $$1) {
      get.a $$2 = (get.a)this.a.get($$0.a());
      if ($$2 == null) {
         return false;
      } else {
         $$2.a($$1);
         return true;
      }
   }

   public void a(int $$0, gdh $$1) {
      ObjectIterator<Entry<get.a>> $$2 = this.a.long2ObjectEntrySet().iterator();

      while ($$2.hasNext()) {
         Entry<get.a> $$3 = (Entry<get.a>)$$2.next();
         get.a $$4 = (get.a)$$3.getValue();
         if ($$4.b <= $$0) {
            jh $$5 = jh.d($$3.getLongKey());
            $$2.remove();
            $$1.a($$5, $$4.c, $$4.a);
         }
      }
   }

   public get a() {
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
      final ezy a;
      int b;
      dvv c;

      a(int $$0, dvv $$1, ezy $$2) {
         this.b = $$0;
         this.c = $$1;
         this.a = $$2;
      }

      get.a a(int $$0) {
         this.b = $$0;
         return this;
      }

      void a(dvv $$0) {
         this.c = $$0;
      }
   }
}
