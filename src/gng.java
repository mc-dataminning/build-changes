import it.unimi.dsi.fastutil.longs.LongArrayList;
import it.unimi.dsi.fastutil.longs.LongList;

public final class gng extends gne {
   private static final long a = a(Runtime.getRuntime().maxMemory());
   private final LongList b = new LongArrayList();
   private final LongList c = new LongArrayList();
   private final LongList d = new LongArrayList();

   @Override
   public void a(gmy $$0) {
      if (eyk.P().B()) {
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
      this.b.add((long)eyk.P().n());
      this.h();
      this.c.add(eyk.P().o());
   }

   private void h() {
      long $$0 = Runtime.getRuntime().totalMemory();
      long $$1 = Runtime.getRuntime().freeMemory();
      long $$2 = $$0 - $$1;
      this.d.add(a($$2));
   }

   @Override
   public void b(gmy $$0) {
      $$0.send(gmz.c, $$0x -> {
         $$0x.a(gnb.r, new LongArrayList(this.b));
         $$0x.a(gnb.s, new LongArrayList(this.c));
         $$0x.a(gnb.t, new LongArrayList(this.d));
         $$0x.a(gnb.u, this.e());
         $$0x.a(gnb.v, eyk.P().m.aA());
         $$0x.a(gnb.w, (int)a);
      });
      this.g();
   }

   private static long a(long $$0) {
      return $$0 / 1000L;
   }
}
