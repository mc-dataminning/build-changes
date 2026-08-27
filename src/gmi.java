import it.unimi.dsi.fastutil.longs.LongArrayList;
import it.unimi.dsi.fastutil.longs.LongList;

public final class gmi extends gmg {
   private static final long a = a(Runtime.getRuntime().maxMemory());
   private final LongList b = new LongArrayList();
   private final LongList c = new LongArrayList();
   private final LongList d = new LongArrayList();

   @Override
   public void a(gma $$0) {
      if (exo.P().B()) {
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
      this.b.add((long)exo.P().n());
      this.h();
      this.c.add(exo.P().o());
   }

   private void h() {
      long $$0 = Runtime.getRuntime().totalMemory();
      long $$1 = Runtime.getRuntime().freeMemory();
      long $$2 = $$0 - $$1;
      this.d.add(a($$2));
   }

   @Override
   public void b(gma $$0) {
      $$0.send(gmb.c, $$0x -> {
         $$0x.a(gmd.r, new LongArrayList(this.b));
         $$0x.a(gmd.s, new LongArrayList(this.c));
         $$0x.a(gmd.t, new LongArrayList(this.d));
         $$0x.a(gmd.u, this.e());
         $$0x.a(gmd.v, exo.P().m.aA());
         $$0x.a(gmd.w, (int)a);
      });
      this.g();
   }

   private static long a(long $$0) {
      return $$0 / 1000L;
   }
}
