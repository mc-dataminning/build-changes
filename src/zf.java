import it.unimi.dsi.fastutil.shorts.ShortIterator;
import it.unimi.dsi.fastutil.shorts.ShortSet;
import java.util.function.BiConsumer;

public class zf implements va<ws> {
   private static final int a = 12;
   private final hz b;
   private final short[] c;
   private final dfe[] d;

   public zf(hz $$0, ShortSet $$1, dhm $$2) {
      this.b = $$0;
      int $$3 = $$1.size();
      this.c = new short[$$3];
      this.d = new dfe[$$3];
      int $$4 = 0;

      for (ShortIterator var6 = $$1.iterator(); var6.hasNext(); $$4++) {
         short $$5 = (Short)var6.next();
         this.c[$$4] = $$5;
         this.d[$$4] = $$2.a(hz.a($$5), hz.b($$5), hz.c($$5));
      }
   }

   public zf(sl $$0) {
      this.b = hz.a($$0.readLong());
      int $$1 = $$0.m();
      this.c = new short[$$1];
      this.d = new dfe[$$1];

      for (int $$2 = 0; $$2 < $$1; $$2++) {
         long $$3 = $$0.n();
         this.c[$$2] = (short)((int)($$3 & 4095L));
         this.d[$$2] = csq.o.a((int)($$3 >>> 12));
      }
   }

   @Override
   public void a(sl $$0) {
      $$0.b(this.b.s());
      $$0.c(this.c.length);

      for (int $$1 = 0; $$1 < this.c.length; $$1++) {
         $$0.a((long)csq.i(this.d[$$1]) << 12 | (long)this.c[$$1]);
      }
   }

   public void a(ws $$0) {
      $$0.a(this);
   }

   public void a(BiConsumer<gw, dfe> $$0) {
      gw.a $$1 = new gw.a();

      for (int $$2 = 0; $$2 < this.c.length; $$2++) {
         short $$3 = this.c[$$2];
         $$1.d(this.b.d($$3), this.b.e($$3), this.b.f($$3));
         $$0.accept($$1, this.d[$$2]);
      }
   }
}
