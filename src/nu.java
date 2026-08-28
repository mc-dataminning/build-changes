import java.util.function.BiConsumer;

public record nu(jh.a a) implements nl {
   @Override
   public void generate(BiConsumer<alf<ezt>, ezt.a> $$0) {
      jh.b<dhz> $$1 = this.a.e(mh.bl);
      jh.b<dhx> $$2 = this.a.e(mh.bk);
      jh.b<dfx> $$3 = this.a.e(mh.aR);
      dhv $$4 = new dhv($$2.b(dhy.e), $$1.b(dia.q));
      dhv $$5 = new dhv($$2.b(dhy.e), $$1.b(dia.r));
      $$0.accept(
         ezk.ai,
         ezt.b()
            .a(
               ezs.a()
                  .a(fdq.a(1.0F))
                  .a(fah.a(a(czo.qq, czo.qr, $$5, $$3).b()).a(4))
                  .a(fah.a(a(czo.qu, czo.qv, $$4, $$3).b()).a(2))
                  .a(fah.a(a(czo.qy, czo.qz, $$4, $$3).b()).a(1))
            )
      );
      $$0.accept(
         ezk.ak,
         ezt.b()
            .a(ezs.a().a(fdq.a(1.0F)).a(fah.a(ezk.ai)))
            .a(
               ezs.a()
                  .a(fdq.a(1.0F))
                  .a(fab.a(czo.pP).a(4))
                  .a(fab.a(czo.pP).a(new fbp.a().a($$3.b(dgc.n), fdq.a(1.0F))))
                  .a(fab.a(czo.pP).a(new fbp.a().a($$3.b(dgc.q), fdq.a(1.0F))))
                  .a(fab.a(czo.pU))
            )
      );
      $$0.accept(
         ezk.aj,
         ezt.b()
            .a(ezs.a().a(fdq.a(1.0F)).a(fah.a(ezk.ai)))
            .a(
               ezs.a()
                  .a(fdq.a(1.0F))
                  .a(fab.a(czo.pj).a(2))
                  .a(fab.a(czo.pj).a(new fbp.a().a($$3.b(dgc.y), fdq.a(1.0F))))
                  .a(fab.a(czo.pj).a(new fbp.a().a($$3.b(dgc.z), fdq.a(1.0F))))
            )
      );
   }

   public static ezt.a a(czg $$0, czg $$1, dhv $$2, jh.b<dfx> $$3) {
      return ezt.b()
         .a(
            ezs.a()
               .a(fdq.a(1.0F))
               .a(fdc.a(0.5F))
               .a(fab.a($$0).a(fbk.a(kk.W, $$2)).a(new fbp.a().a($$3.b(dgc.a), fdq.a(4.0F)).a($$3.b(dgc.e), fdq.a(4.0F)).a($$3.b(dgc.b), fdq.a(4.0F))))
         )
         .a(
            ezs.a()
               .a(fdq.a(1.0F))
               .a(fdc.a(0.5F))
               .a(fab.a($$1).a(fbk.a(kk.W, $$2)).a(new fbp.a().a($$3.b(dgc.a), fdq.a(4.0F)).a($$3.b(dgc.e), fdq.a(4.0F)).a($$3.b(dgc.b), fdq.a(4.0F))))
         );
   }
}
