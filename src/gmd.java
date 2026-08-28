import it.unimi.dsi.fastutil.longs.Long2ObjectOpenHashMap;
import it.unimi.dsi.fastutil.longs.Long2ObjectMap.Entry;
import it.unimi.dsi.fastutil.objects.ObjectIterator;

public class gmd implements AutoCloseable {
   private final Long2ObjectOpenHashMap<gmd.a> a = new Long2ObjectOpenHashMap();
   private int b;
   private boolean c;

   public void a(iv $$0, eat $$1, gpo $$2) {
      this.a.compute($$0.a(), ($$2x, $$3) -> $$3 != null ? $$3.a(this.b) : new gmd.a(this.b, $$1, $$2.ds()));
   }

   public boolean a(iv $$0, eat $$1) {
      gmd.a $$2 = (gmd.a)this.a.get($$0.a());
      if ($$2 == null) {
         return false;
      } else {
         $$2.a($$1);
         return true;
      }
   }

   public void a(int $$0, gkq $$1) {
      ObjectIterator<Entry<gmd.a>> $$2 = this.a.long2ObjectEntrySet().iterator();

      while ($$2.hasNext()) {
         Entry<gmd.a> $$3 = (Entry<gmd.a>)$$2.next();
         gmd.a $$4 = (gmd.a)$$3.getValue();
         if ($$4.b <= $$0) {
            iv $$5 = iv.d($$3.getLongKey());
            $$2.remove();
            $$1.a($$5, $$4.c, $$4.a);
         }
      }
   }

   public gmd a() {
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
      final ffc a;
      int b;
      eat c;

      a(int $$0, eat $$1, ffc $$2) {
         this.b = $$0;
         this.c = $$1;
         this.a = $$2;
      }

      gmd.a a(int $$0) {
         this.b = $$0;
         return this;
      }

      void a(eat $$0) {
         this.c = $$0;
      }
   }
}
