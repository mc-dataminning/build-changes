import it.unimi.dsi.fastutil.longs.Long2ObjectOpenHashMap;
import it.unimi.dsi.fastutil.longs.Long2ObjectMap.Entry;
import it.unimi.dsi.fastutil.objects.ObjectIterator;

public class gil implements AutoCloseable {
   private final Long2ObjectOpenHashMap<gil.a> a = new Long2ObjectOpenHashMap();
   private int b;
   private boolean c;

   public void a(ji $$0, dxq $$1, glv $$2) {
      this.a.compute($$0.a(), ($$2x, $$3) -> $$3 != null ? $$3.a(this.b) : new gil.a(this.b, $$1, $$2.ds()));
   }

   public boolean a(ji $$0, dxq $$1) {
      gil.a $$2 = (gil.a)this.a.get($$0.a());
      if ($$2 == null) {
         return false;
      } else {
         $$2.a($$1);
         return true;
      }
   }

   public void a(int $$0, ggy $$1) {
      ObjectIterator<Entry<gil.a>> $$2 = this.a.long2ObjectEntrySet().iterator();

      while ($$2.hasNext()) {
         Entry<gil.a> $$3 = (Entry<gil.a>)$$2.next();
         gil.a $$4 = (gil.a)$$3.getValue();
         if ($$4.b <= $$0) {
            ji $$5 = ji.d($$3.getLongKey());
            $$2.remove();
            $$1.a($$5, $$4.c, $$4.a);
         }
      }
   }

   public gil a() {
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
      dxq c;

      a(int $$0, dxq $$1, fbx $$2) {
         this.b = $$0;
         this.c = $$1;
         this.a = $$2;
      }

      gil.a a(int $$0) {
         this.b = $$0;
         return this;
      }

      void a(dxq $$0) {
         this.c = $$0;
      }
   }
}
