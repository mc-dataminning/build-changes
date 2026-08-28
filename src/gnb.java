import it.unimi.dsi.fastutil.longs.Long2ObjectOpenHashMap;
import it.unimi.dsi.fastutil.longs.Long2ObjectMap.Entry;
import it.unimi.dsi.fastutil.objects.ObjectIterator;

public class gnb implements AutoCloseable {
   private final Long2ObjectOpenHashMap<gnb.a> a = new Long2ObjectOpenHashMap();
   private int b;
   private boolean c;

   public void a(iw $$0, ebq $$1, gqm $$2) {
      this.a.compute($$0.a(), ($$2x, $$3) -> $$3 != null ? $$3.a(this.b) : new gnb.a(this.b, $$1, $$2.dt()));
   }

   public boolean a(iw $$0, ebq $$1) {
      gnb.a $$2 = (gnb.a)this.a.get($$0.a());
      if ($$2 == null) {
         return false;
      } else {
         $$2.a($$1);
         return true;
      }
   }

   public void a(int $$0, glo $$1) {
      ObjectIterator<Entry<gnb.a>> $$2 = this.a.long2ObjectEntrySet().iterator();

      while ($$2.hasNext()) {
         Entry<gnb.a> $$3 = (Entry<gnb.a>)$$2.next();
         gnb.a $$4 = (gnb.a)$$3.getValue();
         if ($$4.b <= $$0) {
            iw $$5 = iw.d($$3.getLongKey());
            $$2.remove();
            $$1.a($$5, $$4.c, $$4.a);
         }
      }
   }

   public gnb a() {
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
      final fgc a;
      int b;
      ebq c;

      a(int $$0, ebq $$1, fgc $$2) {
         this.b = $$0;
         this.c = $$1;
         this.a = $$2;
      }

      gnb.a a(int $$0) {
         this.b = $$0;
         return this;
      }

      void a(ebq $$0) {
         this.c = $$0;
      }
   }
}
