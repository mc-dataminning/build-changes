import it.unimi.dsi.fastutil.longs.LongArrayList;
import it.unimi.dsi.fastutil.longs.LongList;

public final class gei extends geg {
   private static final long a = a(Runtime.getRuntime().maxMemory());
   private final LongList b = new LongArrayList();
   private final LongList c = new LongArrayList();
   private final LongList d = new LongArrayList();

   @Override
   public void a(gea $$0) {
      if (eqx.O().A()) {
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
      this.b.add((long)eqx.O().n());
      this.h();
      this.c.add(eqx.O().o());
   }

   private void h() {
      long $$0 = Runtime.getRuntime().totalMemory();
      long $$1 = Runtime.getRuntime().freeMemory();
      long $$2 = $$0 - $$1;
      this.d.add(a($$2));
   }

   @Override
   public void b(gea $$0) {
      $$0.send(geb.c, $$0x -> {
         $$0x.a(ged.r, new LongArrayList(this.b));
         $$0x.a(ged.s, new LongArrayList(this.c));
         $$0x.a(ged.t, new LongArrayList(this.d));
         $$0x.a(ged.u, this.e());
         $$0x.a(ged.v, eqx.O().m.az());
         $$0x.a(ged.w, (int)a);
      });
      this.g();
   }

   private static long a(long $$0) {
      return $$0 / 1000L;
   }
}
