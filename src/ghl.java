import it.unimi.dsi.fastutil.longs.Long2ObjectOpenHashMap;
import it.unimi.dsi.fastutil.longs.Long2ObjectMap.Entry;
import it.unimi.dsi.fastutil.objects.ObjectIterator;

public class ghl implements AutoCloseable {
   private final Long2ObjectOpenHashMap<ghl.a> a = new Long2ObjectOpenHashMap();
   private int b;
   private boolean c;

   public void a(ji $$0, dww $$1, gkv $$2) {
      this.a.compute($$0.a(), ($$2x, $$3) -> $$3 != null ? $$3.a(this.b) : new ghl.a(this.b, $$1, $$2.dt()));
   }

   public boolean a(ji $$0, dww $$1) {
      ghl.a $$2 = (ghl.a)this.a.get($$0.a());
      if ($$2 == null) {
         return false;
      } else {
         $$2.a($$1);
         return true;
      }
   }

   public void a(int $$0, gfy $$1) {
      ObjectIterator<Entry<ghl.a>> $$2 = this.a.long2ObjectEntrySet().iterator();

      while ($$2.hasNext()) {
         Entry<ghl.a> $$3 = (Entry<ghl.a>)$$2.next();
         ghl.a $$4 = (ghl.a)$$3.getValue();
         if ($$4.b <= $$0) {
            ji $$5 = ji.d($$3.getLongKey());
            $$2.remove();
            $$1.a($$5, $$4.c, $$4.a);
         }
      }
   }

   public ghl a() {
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
      final faz a;
      int b;
      dww c;

      a(int $$0, dww $$1, faz $$2) {
         this.b = $$0;
         this.c = $$1;
         this.a = $$2;
      }

      ghl.a a(int $$0) {
         this.b = $$0;
         return this;
      }

      void a(dww $$0) {
         this.c = $$0;
      }
   }
}
