import it.unimi.dsi.fastutil.longs.LongArrayList;
import it.unimi.dsi.fastutil.longs.LongList;

public final class ggj extends ggh {
   private static final long a = a(Runtime.getRuntime().maxMemory());
   private final LongList b = new LongArrayList();
   private final LongList c = new LongArrayList();
   private final LongList d = new LongArrayList();

   @Override
   public void a(ggb $$0) {
      if (esr.N().z()) {
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
      this.b.add((long)esr.N().n());
      this.h();
      this.c.add(esr.N().o());
   }

   private void h() {
      long $$0 = Runtime.getRuntime().totalMemory();
      long $$1 = Runtime.getRuntime().freeMemory();
      long $$2 = $$0 - $$1;
      this.d.add(a($$2));
   }

   @Override
   public void b(ggb $$0) {
      $$0.send(ggc.c, $$0x -> {
         $$0x.a(gge.r, new LongArrayList(this.b));
         $$0x.a(gge.s, new LongArrayList(this.c));
         $$0x.a(gge.t, new LongArrayList(this.d));
         $$0x.a(gge.u, this.e());
         $$0x.a(gge.v, esr.N().m.aA());
         $$0x.a(gge.w, (int)a);
      });
      this.g();
   }

   private static long a(long $$0) {
      return $$0 / 1000L;
   }
}
