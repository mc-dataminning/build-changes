import it.unimi.dsi.fastutil.longs.Long2ObjectOpenHashMap;
import it.unimi.dsi.fastutil.longs.Long2ObjectMap.Entry;
import it.unimi.dsi.fastutil.objects.ObjectIterator;

public class gno implements AutoCloseable {
   private final Long2ObjectOpenHashMap<gno.a> a = new Long2ObjectOpenHashMap();
   private int b;
   private boolean c;

   public void a(iv $$0, ebe $$1, gqz $$2) {
      this.a.compute($$0.a(), ($$2x, $$3) -> $$3 != null ? $$3.a(this.b) : new gno.a(this.b, $$1, $$2.dt()));
   }

   public boolean a(iv $$0, ebe $$1) {
      gno.a $$2 = (gno.a)this.a.get($$0.a());
      if ($$2 == null) {
         return false;
      } else {
         $$2.a($$1);
         return true;
      }
   }

   public void a(int $$0, gmb $$1) {
      ObjectIterator<Entry<gno.a>> $$2 = this.a.long2ObjectEntrySet().iterator();

      while ($$2.hasNext()) {
         Entry<gno.a> $$3 = (Entry<gno.a>)$$2.next();
         gno.a $$4 = (gno.a)$$3.getValue();
         if ($$4.b <= $$0) {
            iv $$5 = iv.d($$3.getLongKey());
            $$2.remove();
            $$1.a($$5, $$4.c, $$4.a);
         }
      }
   }

   public gno a() {
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
      final ffq a;
      int b;
      ebe c;

      a(int $$0, ebe $$1, ffq $$2) {
         this.b = $$0;
         this.c = $$1;
         this.a = $$2;
      }

      gno.a a(int $$0) {
         this.b = $$0;
         return this;
      }

      void a(ebe $$0) {
         this.c = $$0;
      }
   }
}
