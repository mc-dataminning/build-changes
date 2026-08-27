import it.unimi.dsi.fastutil.longs.LongArrayList;
import it.unimi.dsi.fastutil.longs.LongList;

public final class gjt extends gjr {
   private static final long a = a(Runtime.getRuntime().maxMemory());
   private final LongList b = new LongArrayList();
   private final LongList c = new LongArrayList();
   private final LongList d = new LongArrayList();

   @Override
   public void a(gjl $$0) {
      if (evh.O().A()) {
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
      this.b.add((long)evh.O().n());
      this.h();
      this.c.add(evh.O().o());
   }

   private void h() {
      long $$0 = Runtime.getRuntime().totalMemory();
      long $$1 = Runtime.getRuntime().freeMemory();
      long $$2 = $$0 - $$1;
      this.d.add(a($$2));
   }

   @Override
   public void b(gjl $$0) {
      $$0.send(gjm.c, $$0x -> {
         $$0x.a(gjo.r, new LongArrayList(this.b));
         $$0x.a(gjo.s, new LongArrayList(this.c));
         $$0x.a(gjo.t, new LongArrayList(this.d));
         $$0x.a(gjo.u, this.e());
         $$0x.a(gjo.v, evh.O().m.aA());
         $$0x.a(gjo.w, (int)a);
      });
      this.g();
   }

   private static long a(long $$0) {
      return $$0 / 1000L;
   }
}
