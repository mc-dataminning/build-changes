import it.unimi.dsi.fastutil.longs.LongArrayList;
import it.unimi.dsi.fastutil.longs.LongList;

public final class gum extends guk {
   private static final long a = a(Runtime.getRuntime().maxMemory());
   private final LongList b = new LongArrayList();
   private final LongList c = new LongArrayList();
   private final LongList d = new LongArrayList();

   @Override
   public void a(gue $$0) {
      if (ffg.Q().C()) {
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
      this.b.add((long)ffg.Q().o());
      this.h();
      this.c.add(ffg.Q().p());
   }

   private void h() {
      long $$0 = Runtime.getRuntime().totalMemory();
      long $$1 = Runtime.getRuntime().freeMemory();
      long $$2 = $$0 - $$1;
      this.d.add(a($$2));
   }

   @Override
   public void b(gue $$0) {
      $$0.send(guf.c, $$0x -> {
         $$0x.a(guh.r, new LongArrayList(this.b));
         $$0x.a(guh.s, new LongArrayList(this.c));
         $$0x.a(guh.t, new LongArrayList(this.d));
         $$0x.a(guh.u, this.e());
         $$0x.a(guh.v, ffg.Q().m.aD());
         $$0x.a(guh.w, (int)a);
      });
      this.g();
   }

   private static long a(long $$0) {
      return $$0 / 1000L;
   }
}
