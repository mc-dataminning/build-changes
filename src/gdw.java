import it.unimi.dsi.fastutil.longs.LongArrayList;
import it.unimi.dsi.fastutil.longs.LongList;

public final class gdw extends gdu {
   private static final long a = a(Runtime.getRuntime().maxMemory());
   private final LongList b = new LongArrayList();
   private final LongList c = new LongArrayList();
   private final LongList d = new LongArrayList();

   @Override
   public void a(gdo $$0) {
      if (eql.O().A()) {
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
      this.b.add((long)eql.O().n());
      this.h();
      this.c.add(eql.O().o());
   }

   private void h() {
      long $$0 = Runtime.getRuntime().totalMemory();
      long $$1 = Runtime.getRuntime().freeMemory();
      long $$2 = $$0 - $$1;
      this.d.add(a($$2));
   }

   @Override
   public void b(gdo $$0) {
      $$0.send(gdp.c, $$0x -> {
         $$0x.a(gdr.r, new LongArrayList(this.b));
         $$0x.a(gdr.s, new LongArrayList(this.c));
         $$0x.a(gdr.t, new LongArrayList(this.d));
         $$0x.a(gdr.u, this.e());
         $$0x.a(gdr.v, eql.O().m.ay());
         $$0x.a(gdr.w, (int)a);
      });
      this.g();
   }

   private static long a(long $$0) {
      return $$0 / 1000L;
   }
}
