import it.unimi.dsi.fastutil.longs.LongArrayList;
import it.unimi.dsi.fastutil.longs.LongList;

public final class hoq extends hoo {
   private static final long a = a(Runtime.getRuntime().maxMemory());
   private final LongList b = new LongArrayList();
   private final LongList c = new LongArrayList();
   private final LongList d = new LongArrayList();

   @Override
   public void a(hoi $$0) {
      if (foz.Q().C()) {
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
      this.b.add((long)foz.Q().o());
      this.h();
      this.c.add(foz.Q().p());
   }

   private void h() {
      long $$0 = Runtime.getRuntime().totalMemory();
      long $$1 = Runtime.getRuntime().freeMemory();
      long $$2 = $$0 - $$1;
      this.d.add(a($$2));
   }

   @Override
   public void b(hoi $$0) {
      $$0.send(hoj.c, $$0x -> {
         $$0x.a(hol.r, new LongArrayList(this.b));
         $$0x.a(hol.s, new LongArrayList(this.c));
         $$0x.a(hol.t, new LongArrayList(this.d));
         $$0x.a(hol.u, this.e());
         $$0x.a(hol.v, foz.Q().n.aH());
         $$0x.a(hol.w, (int)a);
      });
      this.g();
   }

   private static long a(long $$0) {
      return $$0 / 1000L;
   }
}
