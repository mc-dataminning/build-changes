import java.util.function.BiConsumer;

public class nb implements mu {
   @Override
   public void generate(jk.a $$0, BiConsumer<ala<eqi>, eqi.a> $$1) {
      jk.b<cwr> $$2 = $$0.a(lq.aP).orElseThrow();
      jk.b<cwp> $$3 = $$0.a(lq.aO).orElseThrow();
      cwo $$4 = new cwo($$3.a(cwq.e).orElseThrow(), $$2.a(cws.q).orElseThrow());
      cwo $$5 = new cwo($$3.a(cwq.e).orElseThrow(), $$2.a(cws.r).orElseThrow());
      $$1.accept(
         epz.aj,
         eqi.b()
            .a(
               eqh.a()
                  .a(eug.a(1.0F))
                  .a(eqw.a(a(cun.pC, cun.pD, $$5).b()).a(4))
                  .a(eqw.a(a(cun.pG, cun.pH, $$4).b()).a(2))
                  .a(eqw.a(a(cun.pK, cun.pL, $$4).b()).a(1))
            )
      );
      $$1.accept(
         epz.al,
         eqi.b()
            .a(eqh.a().a(eug.a(1.0F)).a(eqw.a(epz.aj)))
            .a(
               eqh.a()
                  .a(eug.a(1.0F))
                  .a(eqq.a(cun.pa).a(4))
                  .a(eqq.a(cun.pa).a(new ese.a().a(czy.n, eug.a(1.0F))))
                  .a(eqq.a(cun.pa).a(new ese.a().a(czy.q, eug.a(1.0F))))
                  .a(eqq.a(cun.pf))
            )
      );
      $$1.accept(
         epz.ak,
         eqi.b()
            .a(eqh.a().a(eug.a(1.0F)).a(eqw.a(epz.aj)))
            .a(
               eqh.a()
                  .a(eug.a(1.0F))
                  .a(eqq.a(cun.ou).a(2))
                  .a(eqq.a(cun.ou).a(new ese.a().a(czy.y, eug.a(1.0F))))
                  .a(eqq.a(cun.ou).a(new ese.a().a(czy.z, eug.a(1.0F))))
            )
      );
   }

   public static eqi.a a(cuf $$0, cuf $$1, cwo $$2) {
      return eqi.b()
         .a(
            eqh.a()
               .a(eug.a(1.0F))
               .a(ets.a(0.5F))
               .a(eqq.a($$0).a(erz.a(km.J, $$2)).a(new ese.a().a(czy.a, eug.a(4.0F)).a(czy.e, eug.a(4.0F)).a(czy.b, eug.a(4.0F))))
         )
         .a(
            eqh.a()
               .a(eug.a(1.0F))
               .a(ets.a(0.5F))
               .a(eqq.a($$1).a(erz.a(km.J, $$2)).a(new ese.a().a(czy.a, eug.a(4.0F)).a(czy.e, eug.a(4.0F)).a(czy.b, eug.a(4.0F))))
         );
   }
}
