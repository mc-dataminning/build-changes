import java.util.function.BiConsumer;

public class mq implements mj {
   @Override
   public void generate(iz.a $$0, BiConsumer<akl<epk>, epk.a> $$1) {
      iz.b<cvv> $$2 = $$0.a(lf.aP).orElseThrow();
      iz.b<cvt> $$3 = $$0.a(lf.aO).orElseThrow();
      cvs $$4 = new cvs($$3.a(cvu.e).orElseThrow(), $$2.a(cvw.q).orElseThrow());
      cvs $$5 = new cvs($$3.a(cvu.e).orElseThrow(), $$2.a(cvw.r).orElseThrow());
      $$1.accept(
         epd.aj,
         epk.b()
            .a(
               epj.a()
                  .a(ete.a(1.0F))
                  .a(epy.a(a(ctr.pC, ctr.pD, $$5).b()).a(4))
                  .a(epy.a(a(ctr.pG, ctr.pH, $$4).b()).a(2))
                  .a(epy.a(a(ctr.pK, ctr.pL, $$4).b()).a(1))
            )
      );
   }

   public static epk.a a(ctj $$0, ctj $$1, cvs $$2) {
      return epk.b()
         .a(epj.a().a(ete.a(1.0F)).a(esq.a(0.5F)).a(eps.a($$0).a(eqz.a(kb.J, $$2))))
         .a(epj.a().a(ete.a(1.0F)).a(esq.a(0.5F)).a(eps.a($$1).a(eqz.a(kb.J, $$2))));
   }
}
