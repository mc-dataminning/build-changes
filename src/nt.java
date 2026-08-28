import java.util.function.BiConsumer;

public record nt(jg.a a) implements nk {
   @Override
   public void generate(BiConsumer<alf<eze>, eze.a> $$0) {
      jg.b<dhn> $$1 = this.a.e(mg.bk);
      jg.b<dhl> $$2 = this.a.e(mg.bj);
      jg.b<dfl> $$3 = this.a.e(mg.aQ);
      dhj $$4 = new dhj($$2.b(dhm.e), $$1.b(dho.q));
      dhj $$5 = new dhj($$2.b(dhm.e), $$1.b(dho.r));
      $$0.accept(
         eyv.ai,
         eze.b()
            .a(
               ezd.a()
                  .a(fdb.a(1.0F))
                  .a(ezs.a(a(czc.qn, czc.qo, $$5, $$3).b()).a(4))
                  .a(ezs.a(a(czc.qr, czc.qs, $$4, $$3).b()).a(2))
                  .a(ezs.a(a(czc.qv, czc.qw, $$4, $$3).b()).a(1))
            )
      );
      $$0.accept(
         eyv.ak,
         eze.b()
            .a(ezd.a().a(fdb.a(1.0F)).a(ezs.a(eyv.ai)))
            .a(
               ezd.a()
                  .a(fdb.a(1.0F))
                  .a(ezm.a(czc.pM).a(4))
                  .a(ezm.a(czc.pM).a(new fba.a().a($$3.b(dfq.n), fdb.a(1.0F))))
                  .a(ezm.a(czc.pM).a(new fba.a().a($$3.b(dfq.q), fdb.a(1.0F))))
                  .a(ezm.a(czc.pR))
            )
      );
      $$0.accept(
         eyv.aj,
         eze.b()
            .a(ezd.a().a(fdb.a(1.0F)).a(ezs.a(eyv.ai)))
            .a(
               ezd.a()
                  .a(fdb.a(1.0F))
                  .a(ezm.a(czc.pg).a(2))
                  .a(ezm.a(czc.pg).a(new fba.a().a($$3.b(dfq.y), fdb.a(1.0F))))
                  .a(ezm.a(czc.pg).a(new fba.a().a($$3.b(dfq.z), fdb.a(1.0F))))
            )
      );
   }

   public static eze.a a(cyu $$0, cyu $$1, dhj $$2, jg.b<dfl> $$3) {
      return eze.b()
         .a(
            ezd.a()
               .a(fdb.a(1.0F))
               .a(fcn.a(0.5F))
               .a(ezm.a($$0).a(fav.a(kj.W, $$2)).a(new fba.a().a($$3.b(dfq.a), fdb.a(4.0F)).a($$3.b(dfq.e), fdb.a(4.0F)).a($$3.b(dfq.b), fdb.a(4.0F))))
         )
         .a(
            ezd.a()
               .a(fdb.a(1.0F))
               .a(fcn.a(0.5F))
               .a(ezm.a($$1).a(fav.a(kj.W, $$2)).a(new fba.a().a($$3.b(dfq.a), fdb.a(4.0F)).a($$3.b(dfq.e), fdb.a(4.0F)).a($$3.b(dfq.b), fdb.a(4.0F))))
         );
   }
}
