import it.unimi.dsi.fastutil.longs.Long2ObjectOpenHashMap;
import it.unimi.dsi.fastutil.longs.Long2ObjectMap.Entry;
import it.unimi.dsi.fastutil.objects.ObjectIterator;

public class gek implements AutoCloseable {
   private final Long2ObjectOpenHashMap<gek.a> a = new Long2ObjectOpenHashMap();
   private int b;
   private boolean c;

   public void a(jh $$0, dvo $$1, ght $$2) {
      this.a.compute($$0.a(), ($$2x, $$3) -> $$3 != null ? $$3.a(this.b) : new gek.a(this.b, $$1, $$2.dw()));
   }

   public boolean a(jh $$0, dvo $$1) {
      gek.a $$2 = (gek.a)this.a.get($$0.a());
      if ($$2 == null) {
         return false;
      } else {
         $$2.a($$1);
         return true;
      }
   }

   public void a(int $$0, gcy $$1) {
      ObjectIterator<Entry<gek.a>> $$2 = this.a.long2ObjectEntrySet().iterator();

      while ($$2.hasNext()) {
         Entry<gek.a> $$3 = (Entry<gek.a>)$$2.next();
         gek.a $$4 = (gek.a)$$3.getValue();
         if ($$4.b <= $$0) {
            jh $$5 = jh.d($$3.getLongKey());
            $$2.remove();
            $$1.a($$5, $$4.c, $$4.a);
         }
      }
   }

   public gek a() {
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
      final ezr a;
      int b;
      dvo c;

      a(int $$0, dvo $$1, ezr $$2) {
         this.b = $$0;
         this.c = $$1;
         this.a = $$2;
      }

      gek.a a(int $$0) {
         this.b = $$0;
         return this;
      }

      void a(dvo $$0) {
         this.c = $$0;
      }
   }
}
