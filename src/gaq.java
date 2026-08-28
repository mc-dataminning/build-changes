import it.unimi.dsi.fastutil.longs.Long2ObjectOpenHashMap;
import it.unimi.dsi.fastutil.longs.Long2ObjectMap.Entry;
import it.unimi.dsi.fastutil.objects.ObjectIterator;

public class gaq implements AutoCloseable {
   private final Long2ObjectOpenHashMap<gaq.a> a = new Long2ObjectOpenHashMap();
   private int b;
   private boolean c;

   public void a(jd $$0, dtc $$1, gdz $$2) {
      this.a.compute($$0.a(), ($$2x, $$3) -> $$3 != null ? $$3.a(this.b) : new gaq.a(this.b, $$1, $$2.dn()));
   }

   public boolean a(jd $$0, dtc $$1) {
      gaq.a $$2 = (gaq.a)this.a.get($$0.a());
      if ($$2 == null) {
         return false;
      } else {
         $$2.a($$1);
         return true;
      }
   }

   public void a(int $$0, fzd $$1) {
      ObjectIterator<Entry<gaq.a>> $$2 = this.a.long2ObjectEntrySet().iterator();

      while ($$2.hasNext()) {
         Entry<gaq.a> $$3 = (Entry<gaq.a>)$$2.next();
         gaq.a $$4 = (gaq.a)$$3.getValue();
         if ($$4.b <= $$0) {
            jd $$5 = jd.d($$3.getLongKey());
            $$2.remove();
            $$1.a($$5, $$4.c, $$4.a);
         }
      }
   }

   public gaq a() {
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
      final exa a;
      int b;
      dtc c;

      a(int $$0, dtc $$1, exa $$2) {
         this.b = $$0;
         this.c = $$1;
         this.a = $$2;
      }

      gaq.a a(int $$0) {
         this.b = $$0;
         return this;
      }

      void a(dtc $$0) {
         this.c = $$0;
      }
   }
}
