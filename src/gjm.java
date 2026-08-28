import it.unimi.dsi.fastutil.longs.Long2ObjectOpenHashMap;
import it.unimi.dsi.fastutil.longs.Long2ObjectMap.Entry;
import it.unimi.dsi.fastutil.objects.ObjectIterator;

public class gjm implements AutoCloseable {
   private final Long2ObjectOpenHashMap<gjm.a> a = new Long2ObjectOpenHashMap();
   private int b;
   private boolean c;

   public void a(jj $$0, dym $$1, gmw $$2) {
      this.a.compute($$0.a(), ($$2x, $$3) -> $$3 != null ? $$3.a(this.b) : new gjm.a(this.b, $$1, $$2.dt()));
   }

   public boolean a(jj $$0, dym $$1) {
      gjm.a $$2 = (gjm.a)this.a.get($$0.a());
      if ($$2 == null) {
         return false;
      } else {
         $$2.a($$1);
         return true;
      }
   }

   public void a(int $$0, ghz $$1) {
      ObjectIterator<Entry<gjm.a>> $$2 = this.a.long2ObjectEntrySet().iterator();

      while ($$2.hasNext()) {
         Entry<gjm.a> $$3 = (Entry<gjm.a>)$$2.next();
         gjm.a $$4 = (gjm.a)$$3.getValue();
         if ($$4.b <= $$0) {
            jj $$5 = jj.d($$3.getLongKey());
            $$2.remove();
            $$1.a($$5, $$4.c, $$4.a);
         }
      }
   }

   public gjm a() {
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
      final fcu a;
      int b;
      dym c;

      a(int $$0, dym $$1, fcu $$2) {
         this.b = $$0;
         this.c = $$1;
         this.a = $$2;
      }

      gjm.a a(int $$0) {
         this.b = $$0;
         return this;
      }

      void a(dym $$0) {
         this.c = $$0;
      }
   }
}
