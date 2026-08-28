import java.util.function.BiConsumer;

public record nu(jh.a a) implements nl {
   @Override
   public void generate(BiConsumer<alh<fam>, fam.a> $$0) {
      jh.b<din> $$1 = this.a.e(mh.bl);
      jh.b<dil> $$2 = this.a.e(mh.bk);
      jh.b<dgl> $$3 = this.a.e(mh.aR);
      dij $$4 = new dij($$2.b(dim.e), $$1.b(dio.q));
      dij $$5 = new dij($$2.b(dim.e), $$1.b(dio.r));
      $$0.accept(
         fad.ai,
         fam.b()
            .a(
               fal.a()
                  .a(fej.a(1.0F))
                  .a(fba.a(a(dac.qq, dac.qr, $$5, $$3).b()).a(4))
                  .a(fba.a(a(dac.qu, dac.qv, $$4, $$3).b()).a(2))
                  .a(fba.a(a(dac.qy, dac.qz, $$4, $$3).b()).a(1))
            )
      );
      $$0.accept(
         fad.ak,
         fam.b()
            .a(fal.a().a(fej.a(1.0F)).a(fba.a(fad.ai)))
            .a(
               fal.a()
                  .a(fej.a(1.0F))
                  .a(fau.a(dac.pP).a(4))
                  .a(fau.a(dac.pP).a(new fci.a().a($$3.b(dgq.n), fej.a(1.0F))))
                  .a(fau.a(dac.pP).a(new fci.a().a($$3.b(dgq.q), fej.a(1.0F))))
                  .a(fau.a(dac.pU))
            )
      );
      $$0.accept(
         fad.aj,
         fam.b()
            .a(fal.a().a(fej.a(1.0F)).a(fba.a(fad.ai)))
            .a(
               fal.a()
                  .a(fej.a(1.0F))
                  .a(fau.a(dac.pj).a(2))
                  .a(fau.a(dac.pj).a(new fci.a().a($$3.b(dgq.y), fej.a(1.0F))))
                  .a(fau.a(dac.pj).a(new fci.a().a($$3.b(dgq.z), fej.a(1.0F))))
            )
      );
   }

   public static fam.a a(czu $$0, czu $$1, dij $$2, jh.b<dgl> $$3) {
      return fam.b()
         .a(
            fal.a()
               .a(fej.a(1.0F))
               .a(fdv.a(0.5F))
               .a(fau.a($$0).a(fcd.a(kk.W, $$2)).a(new fci.a().a($$3.b(dgq.a), fej.a(4.0F)).a($$3.b(dgq.e), fej.a(4.0F)).a($$3.b(dgq.b), fej.a(4.0F))))
         )
         .a(
            fal.a()
               .a(fej.a(1.0F))
               .a(fdv.a(0.5F))
               .a(fau.a($$1).a(fcd.a(kk.W, $$2)).a(new fci.a().a($$3.b(dgq.a), fej.a(4.0F)).a($$3.b(dgq.e), fej.a(4.0F)).a($$3.b(dgq.b), fej.a(4.0F))))
         );
   }
}
