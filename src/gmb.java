import it.unimi.dsi.fastutil.longs.LongArrayList;
import it.unimi.dsi.fastutil.longs.LongList;

public final class gmb extends glz {
   private static final long a = a(Runtime.getRuntime().maxMemory());
   private final LongList b = new LongArrayList();
   private final LongList c = new LongArrayList();
   private final LongList d = new LongArrayList();

   @Override
   public void a(glt $$0) {
      if (exh.O().A()) {
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
      this.b.add((long)exh.O().n());
      this.h();
      this.c.add(exh.O().o());
   }

   private void h() {
      long $$0 = Runtime.getRuntime().totalMemory();
      long $$1 = Runtime.getRuntime().freeMemory();
      long $$2 = $$0 - $$1;
      this.d.add(a($$2));
   }

   @Override
   public void b(glt $$0) {
      $$0.send(glu.c, $$0x -> {
         $$0x.a(glw.r, new LongArrayList(this.b));
         $$0x.a(glw.s, new LongArrayList(this.c));
         $$0x.a(glw.t, new LongArrayList(this.d));
         $$0x.a(glw.u, this.e());
         $$0x.a(glw.v, exh.O().m.aA());
         $$0x.a(glw.w, (int)a);
      });
      this.g();
   }

   private static long a(long $$0) {
      return $$0 / 1000L;
   }
}
