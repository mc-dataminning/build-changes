import it.unimi.dsi.fastutil.longs.Long2ObjectOpenHashMap;
import it.unimi.dsi.fastutil.longs.Long2ObjectMap.Entry;
import it.unimi.dsi.fastutil.objects.ObjectIterator;

public class fzq implements AutoCloseable {
   private final Long2ObjectOpenHashMap<fzq.a> a = new Long2ObjectOpenHashMap();
   private int b;
   private boolean c;

   public void a(ja $$0, dsh $$1, gcz $$2) {
      this.a.compute($$0.a(), ($$2x, $$3) -> $$3 != null ? $$3.a(this.b) : new fzq.a(this.b, $$1, $$2.dn()));
   }

   public boolean a(ja $$0, dsh $$1) {
      fzq.a $$2 = (fzq.a)this.a.get($$0.a());
      if ($$2 == null) {
         return false;
      } else {
         $$2.a($$1);
         return true;
      }
   }

   public void a(int $$0, fyd $$1) {
      ObjectIterator<Entry<fzq.a>> $$2 = this.a.long2ObjectEntrySet().iterator();

      while ($$2.hasNext()) {
         Entry<fzq.a> $$3 = (Entry<fzq.a>)$$2.next();
         fzq.a $$4 = (fzq.a)$$3.getValue();
         if ($$4.b <= $$0) {
            ja $$5 = ja.d($$3.getLongKey());
            $$2.remove();
            $$1.a($$5, $$4.c, $$4.a);
         }
      }
   }

   public fzq a() {
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
      final evz a;
      int b;
      dsh c;

      a(int $$0, dsh $$1, evz $$2) {
         this.b = $$0;
         this.c = $$1;
         this.a = $$2;
      }

      fzq.a a(int $$0) {
         this.b = $$0;
         return this;
      }

      void a(dsh $$0) {
         this.c = $$0;
      }
   }
}
