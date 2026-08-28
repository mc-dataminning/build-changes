import it.unimi.dsi.fastutil.longs.Long2ObjectOpenHashMap;
import it.unimi.dsi.fastutil.longs.Long2ObjectMap.Entry;
import it.unimi.dsi.fastutil.objects.ObjectIterator;

public class fzg implements AutoCloseable {
   private final Long2ObjectOpenHashMap<fzg.a> a = new Long2ObjectOpenHashMap();
   private int b;
   private boolean c;

   public void a(iz $$0, dsb $$1, gcp $$2) {
      this.a.compute($$0.a(), ($$2x, $$3) -> $$3 != null ? $$3.a(this.b) : new fzg.a(this.b, $$1, $$2.dn()));
   }

   public boolean a(iz $$0, dsb $$1) {
      fzg.a $$2 = (fzg.a)this.a.get($$0.a());
      if ($$2 == null) {
         return false;
      } else {
         $$2.a($$1);
         return true;
      }
   }

   public void a(int $$0, fxu $$1) {
      ObjectIterator<Entry<fzg.a>> $$2 = this.a.long2ObjectEntrySet().iterator();

      while ($$2.hasNext()) {
         Entry<fzg.a> $$3 = (Entry<fzg.a>)$$2.next();
         fzg.a $$4 = (fzg.a)$$3.getValue();
         if ($$4.b <= $$0) {
            iz $$5 = iz.d($$3.getLongKey());
            $$2.remove();
            $$1.a($$5, $$4.c, $$4.a);
         }
      }
   }

   public fzg a() {
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
      final evq a;
      int b;
      dsb c;

      a(int $$0, dsb $$1, evq $$2) {
         this.b = $$0;
         this.c = $$1;
         this.a = $$2;
      }

      fzg.a a(int $$0) {
         this.b = $$0;
         return this;
      }

      void a(dsb $$0) {
         this.c = $$0;
      }
   }
}
