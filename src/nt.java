import java.util.function.BiConsumer;

public record nt(jg.a a) implements nk {
   @Override
   public void generate(BiConsumer<alf<ezm>, ezm.a> $$0) {
      jg.b<dhs> $$1 = this.a.e(mg.bl);
      jg.b<dhq> $$2 = this.a.e(mg.bk);
      jg.b<dfq> $$3 = this.a.e(mg.aR);
      dho $$4 = new dho($$2.b(dhr.e), $$1.b(dht.q));
      dho $$5 = new dho($$2.b(dhr.e), $$1.b(dht.r));
      $$0.accept(
         ezd.ai,
         ezm.b()
            .a(
               ezl.a()
                  .a(fdj.a(1.0F))
                  .a(faa.a(a(czh.qq, czh.qr, $$5, $$3).b()).a(4))
                  .a(faa.a(a(czh.qu, czh.qv, $$4, $$3).b()).a(2))
                  .a(faa.a(a(czh.qy, czh.qz, $$4, $$3).b()).a(1))
            )
      );
      $$0.accept(
         ezd.ak,
         ezm.b()
            .a(ezl.a().a(fdj.a(1.0F)).a(faa.a(ezd.ai)))
            .a(
               ezl.a()
                  .a(fdj.a(1.0F))
                  .a(ezu.a(czh.pP).a(4))
                  .a(ezu.a(czh.pP).a(new fbi.a().a($$3.b(dfv.n), fdj.a(1.0F))))
                  .a(ezu.a(czh.pP).a(new fbi.a().a($$3.b(dfv.q), fdj.a(1.0F))))
                  .a(ezu.a(czh.pU))
            )
      );
      $$0.accept(
         ezd.aj,
         ezm.b()
            .a(ezl.a().a(fdj.a(1.0F)).a(faa.a(ezd.ai)))
            .a(
               ezl.a()
                  .a(fdj.a(1.0F))
                  .a(ezu.a(czh.pj).a(2))
                  .a(ezu.a(czh.pj).a(new fbi.a().a($$3.b(dfv.y), fdj.a(1.0F))))
                  .a(ezu.a(czh.pj).a(new fbi.a().a($$3.b(dfv.z), fdj.a(1.0F))))
            )
      );
   }

   public static ezm.a a(cyz $$0, cyz $$1, dho $$2, jg.b<dfq> $$3) {
      return ezm.b()
         .a(
            ezl.a()
               .a(fdj.a(1.0F))
               .a(fcv.a(0.5F))
               .a(ezu.a($$0).a(fbd.a(kj.W, $$2)).a(new fbi.a().a($$3.b(dfv.a), fdj.a(4.0F)).a($$3.b(dfv.e), fdj.a(4.0F)).a($$3.b(dfv.b), fdj.a(4.0F))))
         )
         .a(
            ezl.a()
               .a(fdj.a(1.0F))
               .a(fcv.a(0.5F))
               .a(ezu.a($$1).a(fbd.a(kj.W, $$2)).a(new fbi.a().a($$3.b(dfv.a), fdj.a(4.0F)).a($$3.b(dfv.e), fdj.a(4.0F)).a($$3.b(dfv.b), fdj.a(4.0F))))
         );
   }
}
