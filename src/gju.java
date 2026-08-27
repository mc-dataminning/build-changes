import it.unimi.dsi.fastutil.longs.LongArrayList;
import it.unimi.dsi.fastutil.longs.LongList;

public final class gju extends gjs {
   private static final long a = a(Runtime.getRuntime().maxMemory());
   private final LongList b = new LongArrayList();
   private final LongList c = new LongArrayList();
   private final LongList d = new LongArrayList();

   @Override
   public void a(gjm $$0) {
      if (evi.O().A()) {
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
      this.b.add((long)evi.O().n());
      this.h();
      this.c.add(evi.O().o());
   }

   private void h() {
      long $$0 = Runtime.getRuntime().totalMemory();
      long $$1 = Runtime.getRuntime().freeMemory();
      long $$2 = $$0 - $$1;
      this.d.add(a($$2));
   }

   @Override
   public void b(gjm $$0) {
      $$0.send(gjn.c, $$0x -> {
         $$0x.a(gjp.r, new LongArrayList(this.b));
         $$0x.a(gjp.s, new LongArrayList(this.c));
         $$0x.a(gjp.t, new LongArrayList(this.d));
         $$0x.a(gjp.u, this.e());
         $$0x.a(gjp.v, evi.O().m.aA());
         $$0x.a(gjp.w, (int)a);
      });
      this.g();
   }

   private static long a(long $$0) {
      return $$0 / 1000L;
   }
}
