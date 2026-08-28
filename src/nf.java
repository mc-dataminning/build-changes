import java.util.function.BiConsumer;

public record nf(jo.a a) implements mx {
   @Override
   public void generate(BiConsumer<akq<eru>, eru.a> $$0) {
      jo.b<cxa> $$1 = this.a.a(lu.aX).orElseThrow();
      jo.b<cwy> $$2 = this.a.a(lu.aW).orElseThrow();
      jo.b<dac> $$3 = this.a.b(lu.aL);
      cwx $$4 = new cwx($$2.a(cwz.e).orElseThrow(), $$1.a(cxb.q).orElseThrow());
      cwx $$5 = new cwx($$2.a(cwz.e).orElseThrow(), $$1.a(cxb.r).orElseThrow());
      $$0.accept(
         erl.aj,
         eru.b()
            .a(
               ert.a()
                  .a(evt.a(1.0F))
                  .a(esi.a(a(cut.pC, cut.pD, $$5, $$3).b()).a(4))
                  .a(esi.a(a(cut.pG, cut.pH, $$4, $$3).b()).a(2))
                  .a(esi.a(a(cut.pK, cut.pL, $$4, $$3).b()).a(1))
            )
      );
      $$0.accept(
         erl.al,
         eru.b()
            .a(ert.a().a(evt.a(1.0F)).a(esi.a(erl.aj)))
            .a(
               ert.a()
                  .a(evt.a(1.0F))
                  .a(esc.a(cut.pb).a(4))
                  .a(esc.a(cut.pb).a(new etq.a().a($$3.b(dah.n), evt.a(1.0F))))
                  .a(esc.a(cut.pb).a(new etq.a().a($$3.b(dah.q), evt.a(1.0F))))
                  .a(esc.a(cut.pg))
            )
      );
      $$0.accept(
         erl.ak,
         eru.b()
            .a(ert.a().a(evt.a(1.0F)).a(esi.a(erl.aj)))
            .a(
               ert.a()
                  .a(evt.a(1.0F))
                  .a(esc.a(cut.ov).a(2))
                  .a(esc.a(cut.ov).a(new etq.a().a($$3.b(dah.y), evt.a(1.0F))))
                  .a(esc.a(cut.ov).a(new etq.a().a($$3.b(dah.z), evt.a(1.0F))))
            )
      );
   }

   public static eru.a a(cul $$0, cul $$1, cwx $$2, jo.b<dac> $$3) {
      return eru.b()
         .a(
            ert.a()
               .a(evt.a(1.0F))
               .a(evf.a(0.5F))
               .a(esc.a($$0).a(etl.a(kq.K, $$2)).a(new etq.a().a($$3.b(dah.a), evt.a(4.0F)).a($$3.b(dah.e), evt.a(4.0F)).a($$3.b(dah.b), evt.a(4.0F))))
         )
         .a(
            ert.a()
               .a(evt.a(1.0F))
               .a(evf.a(0.5F))
               .a(esc.a($$1).a(etl.a(kq.K, $$2)).a(new etq.a().a($$3.b(dah.a), evt.a(4.0F)).a($$3.b(dah.e), evt.a(4.0F)).a($$3.b(dah.b), evt.a(4.0F))))
         );
   }
}
