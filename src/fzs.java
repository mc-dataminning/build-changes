import it.unimi.dsi.fastutil.longs.LongArrayList;
import it.unimi.dsi.fastutil.longs.LongList;

public final class fzs extends fzq {
   private static final long a = a(Runtime.getRuntime().maxMemory());
   private final LongList b = new LongArrayList();
   private final LongList c = new LongArrayList();
   private final LongList d = new LongArrayList();

   @Override
   public void a(fzk $$0) {
      if (enn.N().z()) {
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
      this.b.add((long)enn.N().m());
      this.h();
      this.c.add(enn.N().n());
   }

   private void h() {
      long $$0 = Runtime.getRuntime().totalMemory();
      long $$1 = Runtime.getRuntime().freeMemory();
      long $$2 = $$0 - $$1;
      this.d.add(a($$2));
   }

   @Override
   public void b(fzk $$0) {
      $$0.send(fzl.c, $$0x -> {
         $$0x.a(fzn.r, new LongArrayList(this.b));
         $$0x.a(fzn.s, new LongArrayList(this.c));
         $$0x.a(fzn.t, new LongArrayList(this.d));
         $$0x.a(fzn.u, this.e());
         $$0x.a(fzn.v, enn.N().m.ax());
         $$0x.a(fzn.w, (int)a);
      });
      this.g();
   }

   private static long a(long $$0) {
      return $$0 / 1000L;
   }
}
