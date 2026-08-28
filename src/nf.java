import java.util.function.BiConsumer;

public record nf(jo.a a) implements mx {
   @Override
   public void generate(BiConsumer<akq<erw>, erw.a> $$0) {
      jo.b<cxa> $$1 = this.a.a(lu.aX).orElseThrow();
      jo.b<cwy> $$2 = this.a.a(lu.aW).orElseThrow();
      jo.b<dac> $$3 = this.a.b(lu.aL);
      cwx $$4 = new cwx($$2.a(cwz.e).orElseThrow(), $$1.a(cxb.q).orElseThrow());
      cwx $$5 = new cwx($$2.a(cwz.e).orElseThrow(), $$1.a(cxb.r).orElseThrow());
      $$0.accept(
         ern.aj,
         erw.b()
            .a(
               erv.a()
                  .a(evv.a(1.0F))
                  .a(esk.a(a(cut.pC, cut.pD, $$5, $$3).b()).a(4))
                  .a(esk.a(a(cut.pG, cut.pH, $$4, $$3).b()).a(2))
                  .a(esk.a(a(cut.pK, cut.pL, $$4, $$3).b()).a(1))
            )
      );
      $$0.accept(
         ern.al,
         erw.b()
            .a(erv.a().a(evv.a(1.0F)).a(esk.a(ern.aj)))
            .a(
               erv.a()
                  .a(evv.a(1.0F))
                  .a(ese.a(cut.pb).a(4))
                  .a(ese.a(cut.pb).a(new ets.a().a($$3.b(dah.n), evv.a(1.0F))))
                  .a(ese.a(cut.pb).a(new ets.a().a($$3.b(dah.q), evv.a(1.0F))))
                  .a(ese.a(cut.pg))
            )
      );
      $$0.accept(
         ern.ak,
         erw.b()
            .a(erv.a().a(evv.a(1.0F)).a(esk.a(ern.aj)))
            .a(
               erv.a()
                  .a(evv.a(1.0F))
                  .a(ese.a(cut.ov).a(2))
                  .a(ese.a(cut.ov).a(new ets.a().a($$3.b(dah.y), evv.a(1.0F))))
                  .a(ese.a(cut.ov).a(new ets.a().a($$3.b(dah.z), evv.a(1.0F))))
            )
      );
   }

   public static erw.a a(cul $$0, cul $$1, cwx $$2, jo.b<dac> $$3) {
      return erw.b()
         .a(
            erv.a()
               .a(evv.a(1.0F))
               .a(evh.a(0.5F))
               .a(ese.a($$0).a(etn.a(kq.K, $$2)).a(new ets.a().a($$3.b(dah.a), evv.a(4.0F)).a($$3.b(dah.e), evv.a(4.0F)).a($$3.b(dah.b), evv.a(4.0F))))
         )
         .a(
            erv.a()
               .a(evv.a(1.0F))
               .a(evh.a(0.5F))
               .a(ese.a($$1).a(etn.a(kq.K, $$2)).a(new ets.a().a($$3.b(dah.a), evv.a(4.0F)).a($$3.b(dah.e), evv.a(4.0F)).a($$3.b(dah.b), evv.a(4.0F))))
         );
   }
}
