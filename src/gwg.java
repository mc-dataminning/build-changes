import it.unimi.dsi.fastutil.longs.LongArrayList;
import it.unimi.dsi.fastutil.longs.LongList;

public final class gwg extends gwe {
   private static final long a = a(Runtime.getRuntime().maxMemory());
   private final LongList b = new LongArrayList();
   private final LongList c = new LongArrayList();
   private final LongList d = new LongArrayList();

   @Override
   public void a(gvy $$0) {
      if (fgj.Q().C()) {
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
      this.b.add((long)fgj.Q().o());
      this.h();
      this.c.add(fgj.Q().p());
   }

   private void h() {
      long $$0 = Runtime.getRuntime().totalMemory();
      long $$1 = Runtime.getRuntime().freeMemory();
      long $$2 = $$0 - $$1;
      this.d.add(a($$2));
   }

   @Override
   public void b(gvy $$0) {
      $$0.send(gvz.c, $$0x -> {
         $$0x.a(gwb.r, new LongArrayList(this.b));
         $$0x.a(gwb.s, new LongArrayList(this.c));
         $$0x.a(gwb.t, new LongArrayList(this.d));
         $$0x.a(gwb.u, this.e());
         $$0x.a(gwb.v, fgj.Q().m.aD());
         $$0x.a(gwb.w, (int)a);
      });
      this.g();
   }

   private static long a(long $$0) {
      return $$0 / 1000L;
   }
}
