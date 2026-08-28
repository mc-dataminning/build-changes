import it.unimi.dsi.fastutil.longs.Long2ObjectOpenHashMap;
import it.unimi.dsi.fastutil.longs.Long2ObjectMap.Entry;
import it.unimi.dsi.fastutil.objects.ObjectIterator;

public class gas implements AutoCloseable {
   private final Long2ObjectOpenHashMap<gas.a> a = new Long2ObjectOpenHashMap();
   private int b;
   private boolean c;

   public void a(jd $$0, dtc $$1, geb $$2) {
      this.a.compute($$0.a(), ($$2x, $$3) -> $$3 != null ? $$3.a(this.b) : new gas.a(this.b, $$1, $$2.dm()));
   }

   public boolean a(jd $$0, dtc $$1) {
      gas.a $$2 = (gas.a)this.a.get($$0.a());
      if ($$2 == null) {
         return false;
      } else {
         $$2.a($$1);
         return true;
      }
   }

   public void a(int $$0, fzf $$1) {
      ObjectIterator<Entry<gas.a>> $$2 = this.a.long2ObjectEntrySet().iterator();

      while ($$2.hasNext()) {
         Entry<gas.a> $$3 = (Entry<gas.a>)$$2.next();
         gas.a $$4 = (gas.a)$$3.getValue();
         if ($$4.b <= $$0) {
            jd $$5 = jd.d($$3.getLongKey());
            $$2.remove();
            $$1.a($$5, $$4.c, $$4.a);
         }
      }
   }

   public gas a() {
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
      final exc a;
      int b;
      dtc c;

      a(int $$0, dtc $$1, exc $$2) {
         this.b = $$0;
         this.c = $$1;
         this.a = $$2;
      }

      gas.a a(int $$0) {
         this.b = $$0;
         return this;
      }

      void a(dtc $$0) {
         this.c = $$0;
      }
   }
}
