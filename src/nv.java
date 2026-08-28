import java.util.function.BiConsumer;

public record nv(ji.a a) implements nm {
   @Override
   public void generate(BiConsumer<alj<fao>, fao.a> $$0) {
      ji.b<dip> $$1 = this.a.e(mi.bl);
      ji.b<din> $$2 = this.a.e(mi.bk);
      ji.b<dgn> $$3 = this.a.e(mi.aR);
      dil $$4 = new dil($$2.b(dio.e), $$1.b(diq.q));
      dil $$5 = new dil($$2.b(dio.e), $$1.b(diq.r));
      $$0.accept(
         faf.ai,
         fao.b()
            .a(
               fan.a()
                  .a(fel.a(1.0F))
                  .a(fbc.a(a(dae.qq, dae.qr, $$5, $$3).b()).a(4))
                  .a(fbc.a(a(dae.qu, dae.qv, $$4, $$3).b()).a(2))
                  .a(fbc.a(a(dae.qy, dae.qz, $$4, $$3).b()).a(1))
            )
      );
      $$0.accept(
         faf.ak,
         fao.b()
            .a(fan.a().a(fel.a(1.0F)).a(fbc.a(faf.ai)))
            .a(
               fan.a()
                  .a(fel.a(1.0F))
                  .a(faw.a(dae.pP).a(4))
                  .a(faw.a(dae.pP).a(new fck.a().a($$3.b(dgs.n), fel.a(1.0F))))
                  .a(faw.a(dae.pP).a(new fck.a().a($$3.b(dgs.q), fel.a(1.0F))))
                  .a(faw.a(dae.pU))
            )
      );
      $$0.accept(
         faf.aj,
         fao.b()
            .a(fan.a().a(fel.a(1.0F)).a(fbc.a(faf.ai)))
            .a(
               fan.a()
                  .a(fel.a(1.0F))
                  .a(faw.a(dae.pj).a(2))
                  .a(faw.a(dae.pj).a(new fck.a().a($$3.b(dgs.y), fel.a(1.0F))))
                  .a(faw.a(dae.pj).a(new fck.a().a($$3.b(dgs.z), fel.a(1.0F))))
            )
      );
   }

   public static fao.a a(czw $$0, czw $$1, dil $$2, ji.b<dgn> $$3) {
      return fao.b()
         .a(
            fan.a()
               .a(fel.a(1.0F))
               .a(fdx.a(0.5F))
               .a(faw.a($$0).a(fcf.a(kl.W, $$2)).a(new fck.a().a($$3.b(dgs.a), fel.a(4.0F)).a($$3.b(dgs.e), fel.a(4.0F)).a($$3.b(dgs.b), fel.a(4.0F))))
         )
         .a(
            fan.a()
               .a(fel.a(1.0F))
               .a(fdx.a(0.5F))
               .a(faw.a($$1).a(fcf.a(kl.W, $$2)).a(new fck.a().a($$3.b(dgs.a), fel.a(4.0F)).a($$3.b(dgs.e), fel.a(4.0F)).a($$3.b(dgs.b), fel.a(4.0F))))
         );
   }
}
