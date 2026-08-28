import it.unimi.dsi.fastutil.longs.LongArrayList;
import it.unimi.dsi.fastutil.longs.LongList;

public final class hpd extends hpb {
   private static final long a = a(Runtime.getRuntime().maxMemory());
   private final LongList b = new LongArrayList();
   private final LongList c = new LongArrayList();
   private final LongList d = new LongArrayList();

   @Override
   public void a(hov $$0) {
      if (fpo.Q().C()) {
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
      this.b.add((long)fpo.Q().o());
      this.h();
      this.c.add(fpo.Q().p());
   }

   private void h() {
      long $$0 = Runtime.getRuntime().totalMemory();
      long $$1 = Runtime.getRuntime().freeMemory();
      long $$2 = $$0 - $$1;
      this.d.add(a($$2));
   }

   @Override
   public void b(hov $$0) {
      $$0.send(how.c, $$0x -> {
         $$0x.a(hoy.r, new LongArrayList(this.b));
         $$0x.a(hoy.s, new LongArrayList(this.c));
         $$0x.a(hoy.t, new LongArrayList(this.d));
         $$0x.a(hoy.u, this.e());
         $$0x.a(hoy.v, fpo.Q().n.aH());
         $$0x.a(hoy.w, (int)a);
      });
      this.g();
   }

   private static long a(long $$0) {
      return $$0 / 1000L;
   }
}
