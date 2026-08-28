import it.unimi.dsi.fastutil.longs.Long2ObjectOpenHashMap;
import it.unimi.dsi.fastutil.longs.Long2ObjectMap.Entry;
import it.unimi.dsi.fastutil.objects.ObjectIterator;

public class gdu implements AutoCloseable {
   private final Long2ObjectOpenHashMap<gdu.a> a = new Long2ObjectOpenHashMap();
   private int b;
   private boolean c;

   public void a(jh $$0, dvj $$1, ghd $$2) {
      this.a.compute($$0.a(), ($$2x, $$3) -> $$3 != null ? $$3.a(this.b) : new gdu.a(this.b, $$1, $$2.dv()));
   }

   public boolean a(jh $$0, dvj $$1) {
      gdu.a $$2 = (gdu.a)this.a.get($$0.a());
      if ($$2 == null) {
         return false;
      } else {
         $$2.a($$1);
         return true;
      }
   }

   public void a(int $$0, gci $$1) {
      ObjectIterator<Entry<gdu.a>> $$2 = this.a.long2ObjectEntrySet().iterator();

      while ($$2.hasNext()) {
         Entry<gdu.a> $$3 = (Entry<gdu.a>)$$2.next();
         gdu.a $$4 = (gdu.a)$$3.getValue();
         if ($$4.b <= $$0) {
            jh $$5 = jh.d($$3.getLongKey());
            $$2.remove();
            $$1.a($$5, $$4.c, $$4.a);
         }
      }
   }

   public gdu a() {
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
      final ezn a;
      int b;
      dvj c;

      a(int $$0, dvj $$1, ezn $$2) {
         this.b = $$0;
         this.c = $$1;
         this.a = $$2;
      }

      gdu.a a(int $$0) {
         this.b = $$0;
         return this;
      }

      void a(dvj $$0) {
         this.c = $$0;
      }
   }
}
