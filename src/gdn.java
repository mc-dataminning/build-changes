import it.unimi.dsi.fastutil.longs.LongArrayList;
import it.unimi.dsi.fastutil.longs.LongList;

public final class gdn extends gdl {
   private static final long a = a(Runtime.getRuntime().maxMemory());
   private final LongList b = new LongArrayList();
   private final LongList c = new LongArrayList();
   private final LongList d = new LongArrayList();

   @Override
   public void a(gdf $$0) {
      if (eqm.O().A()) {
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
      this.b.add((long)eqm.O().n());
      this.h();
      this.c.add(eqm.O().o());
   }

   private void h() {
      long $$0 = Runtime.getRuntime().totalMemory();
      long $$1 = Runtime.getRuntime().freeMemory();
      long $$2 = $$0 - $$1;
      this.d.add(a($$2));
   }

   @Override
   public void b(gdf $$0) {
      $$0.send(gdg.c, $$0x -> {
         $$0x.a(gdi.r, new LongArrayList(this.b));
         $$0x.a(gdi.s, new LongArrayList(this.c));
         $$0x.a(gdi.t, new LongArrayList(this.d));
         $$0x.a(gdi.u, this.e());
         $$0x.a(gdi.v, eqm.O().m.ax());
         $$0x.a(gdi.w, (int)a);
      });
      this.g();
   }

   private static long a(long $$0) {
      return $$0 / 1000L;
   }
}
