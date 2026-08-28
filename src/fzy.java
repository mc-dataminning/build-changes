import it.unimi.dsi.fastutil.longs.Long2ObjectOpenHashMap;
import it.unimi.dsi.fastutil.longs.Long2ObjectMap.Entry;
import it.unimi.dsi.fastutil.objects.ObjectIterator;

public class fzy implements AutoCloseable {
   private final Long2ObjectOpenHashMap<fzy.a> a = new Long2ObjectOpenHashMap();
   private int b;
   private boolean c;

   public void a(ja $$0, dsl $$1, gdh $$2) {
      this.a.compute($$0.a(), ($$2x, $$3) -> $$3 != null ? $$3.a(this.b) : new fzy.a(this.b, $$1, $$2.dp()));
   }

   public boolean a(ja $$0, dsl $$1) {
      fzy.a $$2 = (fzy.a)this.a.get($$0.a());
      if ($$2 == null) {
         return false;
      } else {
         $$2.a($$1);
         return true;
      }
   }

   public void a(int $$0, fyl $$1) {
      ObjectIterator<Entry<fzy.a>> $$2 = this.a.long2ObjectEntrySet().iterator();

      while ($$2.hasNext()) {
         Entry<fzy.a> $$3 = (Entry<fzy.a>)$$2.next();
         fzy.a $$4 = (fzy.a)$$3.getValue();
         if ($$4.b <= $$0) {
            ja $$5 = ja.d($$3.getLongKey());
            $$2.remove();
            $$1.a($$5, $$4.c, $$4.a);
         }
      }
   }

   public fzy a() {
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
      final ewh a;
      int b;
      dsl c;

      a(int $$0, dsl $$1, ewh $$2) {
         this.b = $$0;
         this.c = $$1;
         this.a = $$2;
      }

      fzy.a a(int $$0) {
         this.b = $$0;
         return this;
      }

      void a(dsl $$0) {
         this.c = $$0;
      }
   }
}
