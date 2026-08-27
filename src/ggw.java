import it.unimi.dsi.fastutil.longs.LongArrayList;
import it.unimi.dsi.fastutil.longs.LongList;

public final class ggw extends ggu {
   private static final long a = a(Runtime.getRuntime().maxMemory());
   private final LongList b = new LongArrayList();
   private final LongList c = new LongArrayList();
   private final LongList d = new LongArrayList();

   @Override
   public void a(ggo $$0) {
      if (etd.N().z()) {
         super.a($$0);
      }
   }

   private void g() {
      this.b.clear();
      this.c.clear();
      this.d.clear();
   }

   @Override
   public void f() {
      this.b.add((long)etd.N().n());
      this.h();
      this.c.add(etd.N().o());
   }

   private void h() {
      long $$0 = Runtime.getRuntime().totalMemory();
      long $$1 = Runtime.getRuntime().freeMemory();
      long $$2 = $$0 - $$1;
      this.d.add(a($$2));
   }

   @Override
   public void b(ggo $$0) {
      $$0.send(ggp.c, $$0x -> {
         $$0x.a(ggr.r, new LongArrayList(this.b));
         $$0x.a(ggr.s, new LongArrayList(this.c));
         $$0x.a(ggr.t, new LongArrayList(this.d));
         $$0x.a(ggr.u, this.e());
         $$0x.a(ggr.v, etd.N().m.aA());
         $$0x.a(ggr.w, (int)a);
      });
      this.g();
   }

   private static long a(long $$0) {
      return $$0 / 1000L;
   }
}
