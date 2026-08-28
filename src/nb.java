import java.util.function.BiConsumer;

public class nb implements mu {
   @Override
   public void generate(jk.a $$0, BiConsumer<ald<eqm>, eqm.a> $$1) {
      jk.b<cwv> $$2 = $$0.a(lq.aP).orElseThrow();
      jk.b<cwt> $$3 = $$0.a(lq.aO).orElseThrow();
      cws $$4 = new cws($$3.a(cwu.e).orElseThrow(), $$2.a(cww.q).orElseThrow());
      cws $$5 = new cws($$3.a(cwu.e).orElseThrow(), $$2.a(cww.r).orElseThrow());
      $$1.accept(
         eqd.aj,
         eqm.b()
            .a(
               eql.a()
                  .a(euk.a(1.0F))
                  .a(era.a(a(cur.pC, cur.pD, $$5).b()).a(4))
                  .a(era.a(a(cur.pG, cur.pH, $$4).b()).a(2))
                  .a(era.a(a(cur.pK, cur.pL, $$4).b()).a(1))
            )
      );
      $$1.accept(
         eqd.al,
         eqm.b()
            .a(eql.a().a(euk.a(1.0F)).a(era.a(eqd.aj)))
            .a(
               eql.a()
                  .a(euk.a(1.0F))
                  .a(equ.a(cur.pa).a(4))
                  .a(equ.a(cur.pa).a(new esi.a().a(dac.n, euk.a(1.0F))))
                  .a(equ.a(cur.pa).a(new esi.a().a(dac.q, euk.a(1.0F))))
                  .a(equ.a(cur.pf))
            )
      );
      $$1.accept(
         eqd.ak,
         eqm.b()
            .a(eql.a().a(euk.a(1.0F)).a(era.a(eqd.aj)))
            .a(
               eql.a()
                  .a(euk.a(1.0F))
                  .a(equ.a(cur.ou).a(2))
                  .a(equ.a(cur.ou).a(new esi.a().a(dac.y, euk.a(1.0F))))
                  .a(equ.a(cur.ou).a(new esi.a().a(dac.z, euk.a(1.0F))))
            )
      );
   }

   public static eqm.a a(cuj $$0, cuj $$1, cws $$2) {
      return eqm.b()
         .a(
            eql.a()
               .a(euk.a(1.0F))
               .a(etw.a(0.5F))
               .a(equ.a($$0).a(esd.a(km.K, $$2)).a(new esi.a().a(dac.a, euk.a(4.0F)).a(dac.e, euk.a(4.0F)).a(dac.b, euk.a(4.0F))))
         )
         .a(
            eql.a()
               .a(euk.a(1.0F))
               .a(etw.a(0.5F))
               .a(equ.a($$1).a(esd.a(km.K, $$2)).a(new esi.a().a(dac.a, euk.a(4.0F)).a(dac.e, euk.a(4.0F)).a(dac.b, euk.a(4.0F))))
         );
   }
}
