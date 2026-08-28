import java.util.List;

public record gsf(List<grt> b) implements hme {
   @Override
   public hma bake(gsg $$0, hls $$1, hly $$2, hlu $$3) {
      return a(this.b, $$0, $$1.a(), $$2, $$3);
   }

   public static hma a(List<grt> $$0, gsg $$1, hmd $$2, hly $$3, hlu $$4) {
      hma.a $$5 = new hma.a();

      for (grt $$6 : $$0) {
         $$6.c().forEach(($$6x, $$7) -> {
            hjk $$8 = $$2.a($$1, $$7.c(), $$4);
            if ($$7.a() == null) {
               $$5.a(a($$6, $$7, $$8, $$6x, $$3));
            } else {
               $$5.a(jb.a($$3.a().c(), $$7.a()), a($$6, $$7, $$8, $$6x, $$3));
            }
         });
      }

      return $$5.a();
   }

   private static grs a(grt $$0, gru $$1, hjk $$2, jb $$3, hly $$4) {
      return grz.a($$0.a(), $$0.b(), $$1, $$2, $$3, $$4, $$0.d(), $$0.e(), $$0.f());
   }

   public List<grt> a() {
      return this.b;
   }
}
