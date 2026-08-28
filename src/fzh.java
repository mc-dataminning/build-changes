import it.unimi.dsi.fastutil.longs.Long2ObjectOpenHashMap;
import it.unimi.dsi.fastutil.longs.Long2ObjectMap.Entry;
import it.unimi.dsi.fastutil.objects.ObjectIterator;

public class fzh implements AutoCloseable {
   private final Long2ObjectOpenHashMap<fzh.a> a = new Long2ObjectOpenHashMap();
   private int b;
   private boolean c;

   public void a(iz $$0, dsc $$1, gcq $$2) {
      this.a.compute($$0.a(), ($$2x, $$3) -> $$3 != null ? $$3.a(this.b) : new fzh.a(this.b, $$1, $$2.dn()));
   }

   public boolean a(iz $$0, dsc $$1) {
      fzh.a $$2 = (fzh.a)this.a.get($$0.a());
      if ($$2 == null) {
         return false;
      } else {
         $$2.a($$1);
         return true;
      }
   }

   public void a(int $$0, fxv $$1) {
      ObjectIterator<Entry<fzh.a>> $$2 = this.a.long2ObjectEntrySet().iterator();

      while ($$2.hasNext()) {
         Entry<fzh.a> $$3 = (Entry<fzh.a>)$$2.next();
         fzh.a $$4 = (fzh.a)$$3.getValue();
         if ($$4.b <= $$0) {
            iz $$5 = iz.d($$3.getLongKey());
            $$2.remove();
            $$1.a($$5, $$4.c, $$4.a);
         }
      }
   }

   public fzh a() {
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
      final evr a;
      int b;
      dsc c;

      a(int $$0, dsc $$1, evr $$2) {
         this.b = $$0;
         this.c = $$1;
         this.a = $$2;
      }

      fzh.a a(int $$0) {
         this.b = $$0;
         return this;
      }

      void a(dsc $$0) {
         this.c = $$0;
      }
   }
}
