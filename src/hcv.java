import it.unimi.dsi.fastutil.longs.LongArrayList;
import it.unimi.dsi.fastutil.longs.LongList;

public final class hcv extends hct {
   private static final long a = a(Runtime.getRuntime().maxMemory());
   private final LongList b = new LongArrayList();
   private final LongList c = new LongArrayList();
   private final LongList d = new LongArrayList();

   @Override
   public void a(hcn $$0) {
      if (fip.Q().C()) {
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
      this.b.add((long)fip.Q().o());
      this.h();
      this.c.add(fip.Q().p());
   }

   private void h() {
      long $$0 = Runtime.getRuntime().totalMemory();
      long $$1 = Runtime.getRuntime().freeMemory();
      long $$2 = $$0 - $$1;
      this.d.add(a($$2));
   }

   @Override
   public void b(hcn $$0) {
      $$0.send(hco.c, $$0x -> {
         $$0x.a(hcq.r, new LongArrayList(this.b));
         $$0x.a(hcq.s, new LongArrayList(this.c));
         $$0x.a(hcq.t, new LongArrayList(this.d));
         $$0x.a(hcq.u, this.e());
         $$0x.a(hcq.v, fip.Q().n.aG());
         $$0x.a(hcq.w, (int)a);
      });
      this.g();
   }

   private static long a(long $$0) {
      return $$0 / 1000L;
   }
}
