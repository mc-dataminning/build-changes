import it.unimi.dsi.fastutil.longs.LongArrayList;
import it.unimi.dsi.fastutil.longs.LongList;

public final class gdi extends gdg {
   private static final long a = a(Runtime.getRuntime().maxMemory());
   private final LongList b = new LongArrayList();
   private final LongList c = new LongArrayList();
   private final LongList d = new LongArrayList();

   @Override
   public void a(gda $$0) {
      if (eqn.N().z()) {
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
      this.b.add((long)eqn.N().m());
      this.h();
      this.c.add(eqn.N().n());
   }

   private void h() {
      long $$0 = Runtime.getRuntime().totalMemory();
      long $$1 = Runtime.getRuntime().freeMemory();
      long $$2 = $$0 - $$1;
      this.d.add(a($$2));
   }

   @Override
   public void b(gda $$0) {
      $$0.send(gdb.c, $$0x -> {
         $$0x.a(gdd.r, new LongArrayList(this.b));
         $$0x.a(gdd.s, new LongArrayList(this.c));
         $$0x.a(gdd.t, new LongArrayList(this.d));
         $$0x.a(gdd.u, this.e());
         $$0x.a(gdd.v, eqn.N().m.ax());
         $$0x.a(gdd.w, (int)a);
      });
      this.g();
   }

   private static long a(long $$0) {
      return $$0 / 1000L;
   }
}
