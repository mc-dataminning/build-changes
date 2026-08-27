import it.unimi.dsi.fastutil.longs.Long2ObjectOpenHashMap;
import it.unimi.dsi.fastutil.longs.Long2ObjectMap.Entry;
import it.unimi.dsi.fastutil.objects.ObjectIterator;

public class fwy implements AutoCloseable {
   private final Long2ObjectOpenHashMap<fwy.a> a = new Long2ObjectOpenHashMap();
   private int b;
   private boolean c;

   public void a(im $$0, dpy $$1, gag $$2) {
      this.a.compute($$0.a(), ($$2x, $$3) -> $$3 != null ? $$3.a(this.b) : new fwy.a(this.b, $$1, $$2.dl()));
   }

   public boolean a(im $$0, dpy $$1) {
      fwy.a $$2 = (fwy.a)this.a.get($$0.a());
      if ($$2 == null) {
         return false;
      } else {
         $$2.a($$1);
         return true;
      }
   }

   public void a(int $$0, fvm $$1) {
      ObjectIterator<Entry<fwy.a>> $$2 = this.a.long2ObjectEntrySet().iterator();

      while ($$2.hasNext()) {
         Entry<fwy.a> $$3 = (Entry<fwy.a>)$$2.next();
         fwy.a $$4 = (fwy.a)$$3.getValue();
         if ($$4.b <= $$0) {
            im $$5 = im.d($$3.getLongKey());
            $$2.remove();
            $$1.a($$5, $$4.c, $$4.a);
         }
      }
   }

   public fwy a() {
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
      final etf a;
      int b;
      dpy c;

      a(int $$0, dpy $$1, etf $$2) {
         this.b = $$0;
         this.c = $$1;
         this.a = $$2;
      }

      fwy.a a(int $$0) {
         this.b = $$0;
         return this;
      }

      void a(dpy $$0) {
         this.c = $$0;
      }
   }
}
