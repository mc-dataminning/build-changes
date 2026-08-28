import java.util.function.BiConsumer;

public record nl(jr.a a) implements nc {
   @Override
   public void generate(BiConsumer<alg<eub>, eub.a> $$0) {
      jr.b<ddm> $$1 = this.a.d(ly.aY);
      jr.b<ddk> $$2 = this.a.d(ly.aX);
      jr.b<dbm> $$3 = this.a.d(ly.aM);
      ddj $$4 = new ddj($$2.b(ddl.e), $$1.b(ddn.q));
      ddj $$5 = new ddj($$2.b(ddl.e), $$1.b(ddn.r));
      $$0.accept(
         ets.ai,
         eub.b()
            .a(
               eua.a()
                  .a(eya.a(1.0F))
                  .a(eup.a(a(cwb.pD, cwb.pE, $$5, $$3).b()).a(4))
                  .a(eup.a(a(cwb.pH, cwb.pI, $$4, $$3).b()).a(2))
                  .a(eup.a(a(cwb.pL, cwb.pM, $$4, $$3).b()).a(1))
            )
      );
      $$0.accept(
         ets.ak,
         eub.b()
            .a(eua.a().a(eya.a(1.0F)).a(eup.a(ets.ai)))
            .a(
               eua.a()
                  .a(eya.a(1.0F))
                  .a(euj.a(cwb.pc).a(4))
                  .a(euj.a(cwb.pc).a(new evx.a().a($$3.b(dbr.n), eya.a(1.0F))))
                  .a(euj.a(cwb.pc).a(new evx.a().a($$3.b(dbr.q), eya.a(1.0F))))
                  .a(euj.a(cwb.ph))
            )
      );
      $$0.accept(
         ets.aj,
         eub.b()
            .a(eua.a().a(eya.a(1.0F)).a(eup.a(ets.ai)))
            .a(
               eua.a()
                  .a(eya.a(1.0F))
                  .a(euj.a(cwb.ow).a(2))
                  .a(euj.a(cwb.ow).a(new evx.a().a($$3.b(dbr.y), eya.a(1.0F))))
                  .a(euj.a(cwb.ow).a(new evx.a().a($$3.b(dbr.z), eya.a(1.0F))))
            )
      );
   }

   public static eub.a a(cvt $$0, cvt $$1, ddj $$2, jr.b<dbm> $$3) {
      return eub.b()
         .a(
            eua.a()
               .a(eya.a(1.0F))
               .a(exm.a(0.5F))
               .a(euj.a($$0).a(evs.a(kt.T, $$2)).a(new evx.a().a($$3.b(dbr.a), eya.a(4.0F)).a($$3.b(dbr.e), eya.a(4.0F)).a($$3.b(dbr.b), eya.a(4.0F))))
         )
         .a(
            eua.a()
               .a(eya.a(1.0F))
               .a(exm.a(0.5F))
               .a(euj.a($$1).a(evs.a(kt.T, $$2)).a(new evx.a().a($$3.b(dbr.a), eya.a(4.0F)).a($$3.b(dbr.e), eya.a(4.0F)).a($$3.b(dbr.b), eya.a(4.0F))))
         );
   }
}
