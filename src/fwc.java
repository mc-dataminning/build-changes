import it.unimi.dsi.fastutil.longs.Long2ObjectOpenHashMap;
import it.unimi.dsi.fastutil.longs.Long2ObjectMap.Entry;
import it.unimi.dsi.fastutil.objects.ObjectIterator;

public class fwc implements AutoCloseable {
   private final Long2ObjectOpenHashMap<fwc.a> a = new Long2ObjectOpenHashMap();
   private int b;
   private boolean c;

   public void a(id $$0, dpi $$1, fzk $$2) {
      this.a.compute($$0.a(), ($$2x, $$3) -> $$3 != null ? $$3.a(this.b) : new fwc.a(this.b, $$1, $$2.dk()));
   }

   public boolean a(id $$0, dpi $$1) {
      fwc.a $$2 = (fwc.a)this.a.get($$0.a());
      if ($$2 == null) {
         return false;
      } else {
         $$2.a($$1);
         return true;
      }
   }

   public void a(int $$0, fuq $$1) {
      ObjectIterator<Entry<fwc.a>> $$2 = this.a.long2ObjectEntrySet().iterator();

      while ($$2.hasNext()) {
         Entry<fwc.a> $$3 = (Entry<fwc.a>)$$2.next();
         fwc.a $$4 = (fwc.a)$$3.getValue();
         if ($$4.b <= $$0) {
            id $$5 = id.d($$3.getLongKey());
            $$2.remove();
            $$1.a($$5, $$4.c, $$4.a);
         }
      }
   }

   public fwc a() {
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
      final esj a;
      int b;
      dpi c;

      a(int $$0, dpi $$1, esj $$2) {
         this.b = $$0;
         this.c = $$1;
         this.a = $$2;
      }

      fwc.a a(int $$0) {
         this.b = $$0;
         return this;
      }

      void a(dpi $$0) {
         this.c = $$0;
      }
   }
}
