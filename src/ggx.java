import it.unimi.dsi.fastutil.longs.Long2ObjectOpenHashMap;
import it.unimi.dsi.fastutil.longs.Long2ObjectMap.Entry;
import it.unimi.dsi.fastutil.objects.ObjectIterator;

public class ggx implements AutoCloseable {
   private final Long2ObjectOpenHashMap<ggx.a> a = new Long2ObjectOpenHashMap();
   private int b;
   private boolean c;

   public void a(jh $$0, dxv $$1, gkh $$2) {
      this.a.compute($$0.a(), ($$2x, $$3) -> $$3 != null ? $$3.a(this.b) : new ggx.a(this.b, $$1, $$2.du()));
   }

   public boolean a(jh $$0, dxv $$1) {
      ggx.a $$2 = (ggx.a)this.a.get($$0.a());
      if ($$2 == null) {
         return false;
      } else {
         $$2.a($$1);
         return true;
      }
   }

   public void a(int $$0, gfk $$1) {
      ObjectIterator<Entry<ggx.a>> $$2 = this.a.long2ObjectEntrySet().iterator();

      while ($$2.hasNext()) {
         Entry<ggx.a> $$3 = (Entry<ggx.a>)$$2.next();
         ggx.a $$4 = (ggx.a)$$3.getValue();
         if ($$4.b <= $$0) {
            jh $$5 = jh.d($$3.getLongKey());
            $$2.remove();
            $$1.a($$5, $$4.c, $$4.a);
         }
      }
   }

   public ggx a() {
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
      final fby a;
      int b;
      dxv c;

      a(int $$0, dxv $$1, fby $$2) {
         this.b = $$0;
         this.c = $$1;
         this.a = $$2;
      }

      ggx.a a(int $$0) {
         this.b = $$0;
         return this;
      }

      void a(dxv $$0) {
         this.c = $$0;
      }
   }
}
