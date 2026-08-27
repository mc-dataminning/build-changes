import it.unimi.dsi.fastutil.longs.LongArrayList;
import it.unimi.dsi.fastutil.longs.LongList;

public final class gjs extends gjq {
   private static final long a = a(Runtime.getRuntime().maxMemory());
   private final LongList b = new LongArrayList();
   private final LongList c = new LongArrayList();
   private final LongList d = new LongArrayList();

   @Override
   public void a(gjk $$0) {
      if (evg.O().A()) {
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
      this.b.add((long)evg.O().n());
      this.h();
      this.c.add(evg.O().o());
   }

   private void h() {
      long $$0 = Runtime.getRuntime().totalMemory();
      long $$1 = Runtime.getRuntime().freeMemory();
      long $$2 = $$0 - $$1;
      this.d.add(a($$2));
   }

   @Override
   public void b(gjk $$0) {
      $$0.send(gjl.c, $$0x -> {
         $$0x.a(gjn.r, new LongArrayList(this.b));
         $$0x.a(gjn.s, new LongArrayList(this.c));
         $$0x.a(gjn.t, new LongArrayList(this.d));
         $$0x.a(gjn.u, this.e());
         $$0x.a(gjn.v, evg.O().m.aA());
         $$0x.a(gjn.w, (int)a);
      });
      this.g();
   }

   private static long a(long $$0) {
      return $$0 / 1000L;
   }
}
