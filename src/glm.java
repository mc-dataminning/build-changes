import it.unimi.dsi.fastutil.longs.Long2ObjectOpenHashMap;
import it.unimi.dsi.fastutil.longs.Long2ObjectMap.Entry;
import it.unimi.dsi.fastutil.objects.ObjectIterator;

public class glm implements AutoCloseable {
   private final Long2ObjectOpenHashMap<glm.a> a = new Long2ObjectOpenHashMap();
   private int b;
   private boolean c;

   public void a(iu $$0, eah $$1, gox $$2) {
      this.a.compute($$0.a(), ($$2x, $$3) -> $$3 != null ? $$3.a(this.b) : new glm.a(this.b, $$1, $$2.dt()));
   }

   public boolean a(iu $$0, eah $$1) {
      glm.a $$2 = (glm.a)this.a.get($$0.a());
      if ($$2 == null) {
         return false;
      } else {
         $$2.a($$1);
         return true;
      }
   }

   public void a(int $$0, gjz $$1) {
      ObjectIterator<Entry<glm.a>> $$2 = this.a.long2ObjectEntrySet().iterator();

      while ($$2.hasNext()) {
         Entry<glm.a> $$3 = (Entry<glm.a>)$$2.next();
         glm.a $$4 = (glm.a)$$3.getValue();
         if ($$4.b <= $$0) {
            iu $$5 = iu.d($$3.getLongKey());
            $$2.remove();
            $$1.a($$5, $$4.c, $$4.a);
         }
      }
   }

   public glm a() {
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
      final feq a;
      int b;
      eah c;

      a(int $$0, eah $$1, feq $$2) {
         this.b = $$0;
         this.c = $$1;
         this.a = $$2;
      }

      glm.a a(int $$0) {
         this.b = $$0;
         return this;
      }

      void a(eah $$0) {
         this.c = $$0;
      }
   }
}
