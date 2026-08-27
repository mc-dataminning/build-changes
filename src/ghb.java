import it.unimi.dsi.fastutil.longs.LongArrayList;
import it.unimi.dsi.fastutil.longs.LongList;

public final class ghb extends ggz {
   private static final long a = a(Runtime.getRuntime().maxMemory());
   private final LongList b = new LongArrayList();
   private final LongList c = new LongArrayList();
   private final LongList d = new LongArrayList();

   @Override
   public void a(ggt $$0) {
      if (eti.N().z()) {
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
      this.b.add((long)eti.N().n());
      this.h();
      this.c.add(eti.N().o());
   }

   private void h() {
      long $$0 = Runtime.getRuntime().totalMemory();
      long $$1 = Runtime.getRuntime().freeMemory();
      long $$2 = $$0 - $$1;
      this.d.add(a($$2));
   }

   @Override
   public void b(ggt $$0) {
      $$0.send(ggu.c, $$0x -> {
         $$0x.a(ggw.r, new LongArrayList(this.b));
         $$0x.a(ggw.s, new LongArrayList(this.c));
         $$0x.a(ggw.t, new LongArrayList(this.d));
         $$0x.a(ggw.u, this.e());
         $$0x.a(ggw.v, eti.N().m.aA());
         $$0x.a(ggw.w, (int)a);
      });
      this.g();
   }

   private static long a(long $$0) {
      return $$0 / 1000L;
   }
}
