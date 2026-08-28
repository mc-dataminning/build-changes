import java.util.function.BiConsumer;

public record nu(jh.a a) implements nl {
   @Override
   public void generate(BiConsumer<alf<ezy>, ezy.a> $$0) {
      jh.b<dic> $$1 = this.a.e(mh.bl);
      jh.b<dia> $$2 = this.a.e(mh.bk);
      jh.b<dga> $$3 = this.a.e(mh.aR);
      dhy $$4 = new dhy($$2.b(dib.e), $$1.b(did.q));
      dhy $$5 = new dhy($$2.b(dib.e), $$1.b(did.r));
      $$0.accept(
         ezp.ai,
         ezy.b()
            .a(
               ezx.a()
                  .a(fdv.a(1.0F))
                  .a(fam.a(a(czr.qq, czr.qr, $$5, $$3).b()).a(4))
                  .a(fam.a(a(czr.qu, czr.qv, $$4, $$3).b()).a(2))
                  .a(fam.a(a(czr.qy, czr.qz, $$4, $$3).b()).a(1))
            )
      );
      $$0.accept(
         ezp.ak,
         ezy.b()
            .a(ezx.a().a(fdv.a(1.0F)).a(fam.a(ezp.ai)))
            .a(
               ezx.a()
                  .a(fdv.a(1.0F))
                  .a(fag.a(czr.pP).a(4))
                  .a(fag.a(czr.pP).a(new fbu.a().a($$3.b(dgf.n), fdv.a(1.0F))))
                  .a(fag.a(czr.pP).a(new fbu.a().a($$3.b(dgf.q), fdv.a(1.0F))))
                  .a(fag.a(czr.pU))
            )
      );
      $$0.accept(
         ezp.aj,
         ezy.b()
            .a(ezx.a().a(fdv.a(1.0F)).a(fam.a(ezp.ai)))
            .a(
               ezx.a()
                  .a(fdv.a(1.0F))
                  .a(fag.a(czr.pj).a(2))
                  .a(fag.a(czr.pj).a(new fbu.a().a($$3.b(dgf.y), fdv.a(1.0F))))
                  .a(fag.a(czr.pj).a(new fbu.a().a($$3.b(dgf.z), fdv.a(1.0F))))
            )
      );
   }

   public static ezy.a a(czj $$0, czj $$1, dhy $$2, jh.b<dga> $$3) {
      return ezy.b()
         .a(
            ezx.a()
               .a(fdv.a(1.0F))
               .a(fdh.a(0.5F))
               .a(fag.a($$0).a(fbp.a(kk.W, $$2)).a(new fbu.a().a($$3.b(dgf.a), fdv.a(4.0F)).a($$3.b(dgf.e), fdv.a(4.0F)).a($$3.b(dgf.b), fdv.a(4.0F))))
         )
         .a(
            ezx.a()
               .a(fdv.a(1.0F))
               .a(fdh.a(0.5F))
               .a(fag.a($$1).a(fbp.a(kk.W, $$2)).a(new fbu.a().a($$3.b(dgf.a), fdv.a(4.0F)).a($$3.b(dgf.e), fdv.a(4.0F)).a($$3.b(dgf.b), fdv.a(4.0F))))
         );
   }
}
