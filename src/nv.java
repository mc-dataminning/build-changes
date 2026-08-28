import java.util.function.BiConsumer;

public record nv(ji.a a) implements nm {
   @Override
   public void generate(BiConsumer<alq<fay>, fay.a> $$0) {
      ji.b<diz> $$1 = this.a.e(mi.bl);
      ji.b<dix> $$2 = this.a.e(mi.bk);
      ji.b<dgx> $$3 = this.a.e(mi.aR);
      div $$4 = new div($$2.b(diy.e), $$1.b(dja.q));
      div $$5 = new div($$2.b(diy.e), $$1.b(dja.r));
      $$0.accept(
         fap.ai,
         fay.b()
            .a(
               fax.a()
                  .a(fev.a(1.0F))
                  .a(fbm.a(a(dao.qq, dao.qr, $$5, $$3).b()).a(4))
                  .a(fbm.a(a(dao.qu, dao.qv, $$4, $$3).b()).a(2))
                  .a(fbm.a(a(dao.qy, dao.qz, $$4, $$3).b()).a(1))
            )
      );
      $$0.accept(
         fap.ak,
         fay.b()
            .a(fax.a().a(fev.a(1.0F)).a(fbm.a(fap.ai)))
            .a(
               fax.a()
                  .a(fev.a(1.0F))
                  .a(fbg.a(dao.pP).a(4))
                  .a(fbg.a(dao.pP).a(new fcu.a().a($$3.b(dhc.n), fev.a(1.0F))))
                  .a(fbg.a(dao.pP).a(new fcu.a().a($$3.b(dhc.q), fev.a(1.0F))))
                  .a(fbg.a(dao.pU))
            )
      );
      $$0.accept(
         fap.aj,
         fay.b()
            .a(fax.a().a(fev.a(1.0F)).a(fbm.a(fap.ai)))
            .a(
               fax.a()
                  .a(fev.a(1.0F))
                  .a(fbg.a(dao.pj).a(2))
                  .a(fbg.a(dao.pj).a(new fcu.a().a($$3.b(dhc.y), fev.a(1.0F))))
                  .a(fbg.a(dao.pj).a(new fcu.a().a($$3.b(dhc.z), fev.a(1.0F))))
            )
      );
   }

   public static fay.a a(dag $$0, dag $$1, div $$2, ji.b<dgx> $$3) {
      return fay.b()
         .a(
            fax.a()
               .a(fev.a(1.0F))
               .a(feh.a(0.5F))
               .a(fbg.a($$0).a(fcp.a(kl.W, $$2)).a(new fcu.a().a($$3.b(dhc.a), fev.a(4.0F)).a($$3.b(dhc.e), fev.a(4.0F)).a($$3.b(dhc.b), fev.a(4.0F))))
         )
         .a(
            fax.a()
               .a(fev.a(1.0F))
               .a(feh.a(0.5F))
               .a(fbg.a($$1).a(fcp.a(kl.W, $$2)).a(new fcu.a().a($$3.b(dhc.a), fev.a(4.0F)).a($$3.b(dhc.e), fev.a(4.0F)).a($$3.b(dhc.b), fev.a(4.0F))))
         );
   }
}
