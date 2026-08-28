import it.unimi.dsi.fastutil.longs.LongArrayList;
import it.unimi.dsi.fastutil.longs.LongList;

public final class gun extends gul {
   private static final long a = a(Runtime.getRuntime().maxMemory());
   private final LongList b = new LongArrayList();
   private final LongList c = new LongArrayList();
   private final LongList d = new LongArrayList();

   @Override
   public void a(guf $$0) {
      if (ffh.Q().C()) {
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
      this.b.add((long)ffh.Q().o());
      this.h();
      this.c.add(ffh.Q().p());
   }

   private void h() {
      long $$0 = Runtime.getRuntime().totalMemory();
      long $$1 = Runtime.getRuntime().freeMemory();
      long $$2 = $$0 - $$1;
      this.d.add(a($$2));
   }

   @Override
   public void b(guf $$0) {
      $$0.send(gug.c, $$0x -> {
         $$0x.a(gui.r, new LongArrayList(this.b));
         $$0x.a(gui.s, new LongArrayList(this.c));
         $$0x.a(gui.t, new LongArrayList(this.d));
         $$0x.a(gui.u, this.e());
         $$0x.a(gui.v, ffh.Q().m.aD());
         $$0x.a(gui.w, (int)a);
      });
      this.g();
   }

   private static long a(long $$0) {
      return $$0 / 1000L;
   }
}
