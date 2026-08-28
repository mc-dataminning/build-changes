import java.util.List;

public record gtv(List<gtj> b) implements hnw {
   @Override
   public hns bake(gtx $$0, hnl $$1, hnr $$2, hnn $$3) {
      return a(this.b, $$0, $$1.a(), $$2, $$3);
   }

   public static hns a(List<gtj> $$0, gtx $$1, hnv $$2, hnr $$3, hnn $$4) {
      hns.a $$5 = new hns.a();

      for (gtj $$6 : $$0) {
         $$6.c().forEach(($$6x, $$7) -> {
            hlc $$8 = $$2.a($$1, $$7.c(), $$4);
            if ($$7.a() == null) {
               $$5.a(a($$6, $$7, $$8, $$6x, $$3));
            } else {
               $$5.a(jc.a($$3.a().c(), $$7.a()), a($$6, $$7, $$8, $$6x, $$3));
            }
         });
      }

      return $$5.a();
   }

   private static gti a(gtj $$0, gtk $$1, hlc $$2, jc $$3, hnr $$4) {
      return gtq.a($$0.a(), $$0.b(), $$1, $$2, $$3, $$4, $$0.d(), $$0.e(), $$0.f());
   }

   public List<gtj> a() {
      return this.b;
   }
}
