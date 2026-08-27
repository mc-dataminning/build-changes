import it.unimi.dsi.fastutil.longs.LongArrayList;
import it.unimi.dsi.fastutil.longs.LongList;

public final class gki extends gkg {
   private static final long a = a(Runtime.getRuntime().maxMemory());
   private final LongList b = new LongArrayList();
   private final LongList c = new LongArrayList();
   private final LongList d = new LongArrayList();

   @Override
   public void a(gka $$0) {
      if (evr.O().A()) {
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
      this.b.add((long)evr.O().n());
      this.h();
      this.c.add(evr.O().o());
   }

   private void h() {
      long $$0 = Runtime.getRuntime().totalMemory();
      long $$1 = Runtime.getRuntime().freeMemory();
      long $$2 = $$0 - $$1;
      this.d.add(a($$2));
   }

   @Override
   public void b(gka $$0) {
      $$0.send(gkb.c, $$0x -> {
         $$0x.a(gkd.r, new LongArrayList(this.b));
         $$0x.a(gkd.s, new LongArrayList(this.c));
         $$0x.a(gkd.t, new LongArrayList(this.d));
         $$0x.a(gkd.u, this.e());
         $$0x.a(gkd.v, evr.O().m.aA());
         $$0x.a(gkd.w, (int)a);
      });
      this.g();
   }

   private static long a(long $$0) {
      return $$0 / 1000L;
   }
}
