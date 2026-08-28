import it.unimi.dsi.fastutil.longs.LongArrayList;
import it.unimi.dsi.fastutil.longs.LongList;

public final class gvt extends gvr {
   private static final long a = a(Runtime.getRuntime().maxMemory());
   private final LongList b = new LongArrayList();
   private final LongList c = new LongArrayList();
   private final LongList d = new LongArrayList();

   @Override
   public void a(gvl $$0) {
      if (fgm.Q().C()) {
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
      this.b.add((long)fgm.Q().o());
      this.h();
      this.c.add(fgm.Q().p());
   }

   private void h() {
      long $$0 = Runtime.getRuntime().totalMemory();
      long $$1 = Runtime.getRuntime().freeMemory();
      long $$2 = $$0 - $$1;
      this.d.add(a($$2));
   }

   @Override
   public void b(gvl $$0) {
      $$0.send(gvm.c, $$0x -> {
         $$0x.a(gvo.r, new LongArrayList(this.b));
         $$0x.a(gvo.s, new LongArrayList(this.c));
         $$0x.a(gvo.t, new LongArrayList(this.d));
         $$0x.a(gvo.u, this.e());
         $$0x.a(gvo.v, fgm.Q().m.aD());
         $$0x.a(gvo.w, (int)a);
      });
      this.g();
   }

   private static long a(long $$0) {
      return $$0 / 1000L;
   }
}
