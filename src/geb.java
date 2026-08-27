import it.unimi.dsi.fastutil.longs.LongArrayList;
import it.unimi.dsi.fastutil.longs.LongList;

public final class geb extends gdz {
   private static final long a = a(Runtime.getRuntime().maxMemory());
   private final LongList b = new LongArrayList();
   private final LongList c = new LongArrayList();
   private final LongList d = new LongArrayList();

   @Override
   public void a(gdt $$0) {
      if (eqq.O().A()) {
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
      this.b.add((long)eqq.O().n());
      this.h();
      this.c.add(eqq.O().o());
   }

   private void h() {
      long $$0 = Runtime.getRuntime().totalMemory();
      long $$1 = Runtime.getRuntime().freeMemory();
      long $$2 = $$0 - $$1;
      this.d.add(a($$2));
   }

   @Override
   public void b(gdt $$0) {
      $$0.send(gdu.c, $$0x -> {
         $$0x.a(gdw.r, new LongArrayList(this.b));
         $$0x.a(gdw.s, new LongArrayList(this.c));
         $$0x.a(gdw.t, new LongArrayList(this.d));
         $$0x.a(gdw.u, this.e());
         $$0x.a(gdw.v, eqq.O().m.ay());
         $$0x.a(gdw.w, (int)a);
      });
      this.g();
   }

   private static long a(long $$0) {
      return $$0 / 1000L;
   }
}
