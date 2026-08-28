import it.unimi.dsi.fastutil.longs.Long2ObjectOpenHashMap;
import it.unimi.dsi.fastutil.longs.Long2ObjectMap.Entry;
import it.unimi.dsi.fastutil.objects.ObjectIterator;

public class fzj implements AutoCloseable {
   private final Long2ObjectOpenHashMap<fzj.a> a = new Long2ObjectOpenHashMap();
   private int b;
   private boolean c;

   public void a(iz $$0, dse $$1, gcs $$2) {
      this.a.compute($$0.a(), ($$2x, $$3) -> $$3 != null ? $$3.a(this.b) : new fzj.a(this.b, $$1, $$2.dn()));
   }

   public boolean a(iz $$0, dse $$1) {
      fzj.a $$2 = (fzj.a)this.a.get($$0.a());
      if ($$2 == null) {
         return false;
      } else {
         $$2.a($$1);
         return true;
      }
   }

   public void a(int $$0, fxx $$1) {
      ObjectIterator<Entry<fzj.a>> $$2 = this.a.long2ObjectEntrySet().iterator();

      while ($$2.hasNext()) {
         Entry<fzj.a> $$3 = (Entry<fzj.a>)$$2.next();
         fzj.a $$4 = (fzj.a)$$3.getValue();
         if ($$4.b <= $$0) {
            iz $$5 = iz.d($$3.getLongKey());
            $$2.remove();
            $$1.a($$5, $$4.c, $$4.a);
         }
      }
   }

   public fzj a() {
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
      final evt a;
      int b;
      dse c;

      a(int $$0, dse $$1, evt $$2) {
         this.b = $$0;
         this.c = $$1;
         this.a = $$2;
      }

      fzj.a a(int $$0) {
         this.b = $$0;
         return this;
      }

      void a(dse $$0) {
         this.c = $$0;
      }
   }
}
