import it.unimi.dsi.fastutil.longs.LongArrayList;
import it.unimi.dsi.fastutil.longs.LongList;

public final class gec extends gea {
   private static final long a = a(Runtime.getRuntime().maxMemory());
   private final LongList b = new LongArrayList();
   private final LongList c = new LongArrayList();
   private final LongList d = new LongArrayList();

   @Override
   public void a(gdu $$0) {
      if (eqp.O().A()) {
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
      this.b.add((long)eqp.O().n());
      this.h();
      this.c.add(eqp.O().o());
   }

   private void h() {
      long $$0 = Runtime.getRuntime().totalMemory();
      long $$1 = Runtime.getRuntime().freeMemory();
      long $$2 = $$0 - $$1;
      this.d.add(a($$2));
   }

   @Override
   public void b(gdu $$0) {
      $$0.send(gdv.c, $$0x -> {
         $$0x.a(gdx.r, new LongArrayList(this.b));
         $$0x.a(gdx.s, new LongArrayList(this.c));
         $$0x.a(gdx.t, new LongArrayList(this.d));
         $$0x.a(gdx.u, this.e());
         $$0x.a(gdx.v, eqp.O().m.az());
         $$0x.a(gdx.w, (int)a);
      });
      this.g();
   }

   private static long a(long $$0) {
      return $$0 / 1000L;
   }
}
