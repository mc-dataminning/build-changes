import it.unimi.dsi.fastutil.longs.Long2ObjectOpenHashMap;
import it.unimi.dsi.fastutil.longs.Long2ObjectMap.Entry;
import it.unimi.dsi.fastutil.objects.ObjectIterator;

public class ggw implements AutoCloseable {
   private final Long2ObjectOpenHashMap<ggw.a> a = new Long2ObjectOpenHashMap();
   private int b;
   private boolean c;

   public void a(jh $$0, dxu $$1, gkg $$2) {
      this.a.compute($$0.a(), ($$2x, $$3) -> $$3 != null ? $$3.a(this.b) : new ggw.a(this.b, $$1, $$2.du()));
   }

   public boolean a(jh $$0, dxu $$1) {
      ggw.a $$2 = (ggw.a)this.a.get($$0.a());
      if ($$2 == null) {
         return false;
      } else {
         $$2.a($$1);
         return true;
      }
   }

   public void a(int $$0, gfj $$1) {
      ObjectIterator<Entry<ggw.a>> $$2 = this.a.long2ObjectEntrySet().iterator();

      while ($$2.hasNext()) {
         Entry<ggw.a> $$3 = (Entry<ggw.a>)$$2.next();
         ggw.a $$4 = (ggw.a)$$3.getValue();
         if ($$4.b <= $$0) {
            jh $$5 = jh.d($$3.getLongKey());
            $$2.remove();
            $$1.a($$5, $$4.c, $$4.a);
         }
      }
   }

   public ggw a() {
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
      final fbx a;
      int b;
      dxu c;

      a(int $$0, dxu $$1, fbx $$2) {
         this.b = $$0;
         this.c = $$1;
         this.a = $$2;
      }

      ggw.a a(int $$0) {
         this.b = $$0;
         return this;
      }

      void a(dxu $$0) {
         this.c = $$0;
      }
   }
}
