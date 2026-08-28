import java.util.List;

public record gtt(List<gth> b) implements hnu {
   @Override
   public hnq bake(gtv $$0, hnj $$1, hnp $$2, hnl $$3) {
      return a(this.b, $$0, $$1.a(), $$2, $$3);
   }

   public static hnq a(List<gth> $$0, gtv $$1, hnt $$2, hnp $$3, hnl $$4) {
      hnq.a $$5 = new hnq.a();

      for (gth $$6 : $$0) {
         $$6.c().forEach(($$6x, $$7) -> {
            hla $$8 = $$2.a($$1, $$7.c(), $$4);
            if ($$7.a() == null) {
               $$5.a(a($$6, $$7, $$8, $$6x, $$3));
            } else {
               $$5.a(jb.a($$3.a().c(), $$7.a()), a($$6, $$7, $$8, $$6x, $$3));
            }
         });
      }

      return $$5.a();
   }

   private static gtg a(gth $$0, gti $$1, hla $$2, jb $$3, hnp $$4) {
      return gto.a($$0.a(), $$0.b(), $$1, $$2, $$3, $$4, $$0.d(), $$0.e(), $$0.f());
   }

   public List<gth> a() {
      return this.b;
   }
}
