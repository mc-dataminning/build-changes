import it.unimi.dsi.fastutil.longs.LongArrayList;
import it.unimi.dsi.fastutil.longs.LongList;

public final class geg extends gee {
   private static final long a = a(Runtime.getRuntime().maxMemory());
   private final LongList b = new LongArrayList();
   private final LongList c = new LongArrayList();
   private final LongList d = new LongArrayList();

   @Override
   public void a(gdy $$0) {
      if (eqv.O().A()) {
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
      this.b.add((long)eqv.O().n());
      this.h();
      this.c.add(eqv.O().o());
   }

   private void h() {
      long $$0 = Runtime.getRuntime().totalMemory();
      long $$1 = Runtime.getRuntime().freeMemory();
      long $$2 = $$0 - $$1;
      this.d.add(a($$2));
   }

   @Override
   public void b(gdy $$0) {
      $$0.send(gdz.c, $$0x -> {
         $$0x.a(geb.r, new LongArrayList(this.b));
         $$0x.a(geb.s, new LongArrayList(this.c));
         $$0x.a(geb.t, new LongArrayList(this.d));
         $$0x.a(geb.u, this.e());
         $$0x.a(geb.v, eqv.O().m.az());
         $$0x.a(geb.w, (int)a);
      });
      this.g();
   }

   private static long a(long $$0) {
      return $$0 / 1000L;
   }
}
