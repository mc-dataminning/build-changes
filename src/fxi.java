import it.unimi.dsi.fastutil.longs.Long2ObjectOpenHashMap;
import it.unimi.dsi.fastutil.longs.Long2ObjectMap.Entry;
import it.unimi.dsi.fastutil.objects.ObjectIterator;

public class fxi implements AutoCloseable {
   private final Long2ObjectOpenHashMap<fxi.a> a = new Long2ObjectOpenHashMap();
   private int b;
   private boolean c;

   public void a(in $$0, dqh $$1, gaq $$2) {
      this.a.compute($$0.a(), ($$2x, $$3) -> $$3 != null ? $$3.a(this.b) : new fxi.a(this.b, $$1, $$2.dl()));
   }

   public boolean a(in $$0, dqh $$1) {
      fxi.a $$2 = (fxi.a)this.a.get($$0.a());
      if ($$2 == null) {
         return false;
      } else {
         $$2.a($$1);
         return true;
      }
   }

   public void a(int $$0, fvw $$1) {
      ObjectIterator<Entry<fxi.a>> $$2 = this.a.long2ObjectEntrySet().iterator();

      while ($$2.hasNext()) {
         Entry<fxi.a> $$3 = (Entry<fxi.a>)$$2.next();
         fxi.a $$4 = (fxi.a)$$3.getValue();
         if ($$4.b <= $$0) {
            in $$5 = in.d($$3.getLongKey());
            $$2.remove();
            $$1.a($$5, $$4.c, $$4.a);
         }
      }
   }

   public fxi a() {
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
      final etp a;
      int b;
      dqh c;

      a(int $$0, dqh $$1, etp $$2) {
         this.b = $$0;
         this.c = $$1;
         this.a = $$2;
      }

      fxi.a a(int $$0) {
         this.b = $$0;
         return this;
      }

      void a(dqh $$0) {
         this.c = $$0;
      }
   }
}
