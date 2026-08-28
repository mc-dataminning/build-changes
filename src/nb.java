import java.util.function.BiConsumer;

public class nb implements mu {
   @Override
   public void generate(jk.a $$0, BiConsumer<ald<eql>, eql.a> $$1) {
      jk.b<cwu> $$2 = $$0.a(lq.aP).orElseThrow();
      jk.b<cws> $$3 = $$0.a(lq.aO).orElseThrow();
      cwr $$4 = new cwr($$3.a(cwt.e).orElseThrow(), $$2.a(cwv.q).orElseThrow());
      cwr $$5 = new cwr($$3.a(cwt.e).orElseThrow(), $$2.a(cwv.r).orElseThrow());
      $$1.accept(
         eqc.aj,
         eql.b()
            .a(
               eqk.a()
                  .a(euj.a(1.0F))
                  .a(eqz.a(a(cuq.pC, cuq.pD, $$5).b()).a(4))
                  .a(eqz.a(a(cuq.pG, cuq.pH, $$4).b()).a(2))
                  .a(eqz.a(a(cuq.pK, cuq.pL, $$4).b()).a(1))
            )
      );
      $$1.accept(
         eqc.al,
         eql.b()
            .a(eqk.a().a(euj.a(1.0F)).a(eqz.a(eqc.aj)))
            .a(
               eqk.a()
                  .a(euj.a(1.0F))
                  .a(eqt.a(cuq.pa).a(4))
                  .a(eqt.a(cuq.pa).a(new esh.a().a(dab.n, euj.a(1.0F))))
                  .a(eqt.a(cuq.pa).a(new esh.a().a(dab.q, euj.a(1.0F))))
                  .a(eqt.a(cuq.pf))
            )
      );
      $$1.accept(
         eqc.ak,
         eql.b()
            .a(eqk.a().a(euj.a(1.0F)).a(eqz.a(eqc.aj)))
            .a(
               eqk.a()
                  .a(euj.a(1.0F))
                  .a(eqt.a(cuq.ou).a(2))
                  .a(eqt.a(cuq.ou).a(new esh.a().a(dab.y, euj.a(1.0F))))
                  .a(eqt.a(cuq.ou).a(new esh.a().a(dab.z, euj.a(1.0F))))
            )
      );
   }

   public static eql.a a(cui $$0, cui $$1, cwr $$2) {
      return eql.b()
         .a(
            eqk.a()
               .a(euj.a(1.0F))
               .a(etv.a(0.5F))
               .a(eqt.a($$0).a(esc.a(km.J, $$2)).a(new esh.a().a(dab.a, euj.a(4.0F)).a(dab.e, euj.a(4.0F)).a(dab.b, euj.a(4.0F))))
         )
         .a(
            eqk.a()
               .a(euj.a(1.0F))
               .a(etv.a(0.5F))
               .a(eqt.a($$1).a(esc.a(km.J, $$2)).a(new esh.a().a(dab.a, euj.a(4.0F)).a(dab.e, euj.a(4.0F)).a(dab.b, euj.a(4.0F))))
         );
   }
}
