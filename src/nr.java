import java.util.function.BiConsumer;

public record nr(js.a a) implements nh {
   @Override
   public void generate(BiConsumer<aly<ewu>, ewu.a> $$0) {
      js.b<dik> $$1 = this.a.d(mb.aI);
      $$0.accept(
         ewl.am,
         ewu.b()
            .a(
               ewt.a()
                  .a(far.a(1.0F))
                  .a(exi.a(ewl.an).a(10).b(-2))
                  .a(exi.a(ewl.ao).a(5).b(2).a(fab.a(ewp.b.a, bw.a.a().a(cc.a(true)))))
                  .a(exi.a(ewl.ap).a(85).b(-1))
            )
      );
      $$0.accept(ewl.ap, a());
      $$0.accept(
         ewl.an,
         ewu.b()
            .a(
               ewt.a()
                  .a(exc.a(dko.fA).a(17))
                  .a(exc.a(cxt.pX).a(10).a(eyv.a(fay.a(0.0F, 0.9F))))
                  .a(exc.a(cxt.rb).a(10))
                  .a(exc.a(cxt.sn).a(10))
                  .a(exc.a(cxt.sZ).a(10).a(eza.a(czp.a)))
                  .a(exc.a(cxt.pO).a(5))
                  .a(exc.a(cxt.rJ).a(2).a(eyv.a(fay.a(0.0F, 0.9F))))
                  .a(exc.a(cxt.oP).a(10))
                  .a(exc.a(cxt.pM).a(5))
                  .a(exc.a(cxt.rT).a(1).a(eyu.a(far.a(10.0F))))
                  .a(exc.a(dko.fV).a(10))
                  .a(exc.a(cxt.sS).a(10))
                  .a(exc.a(dko.nu).a(ezw.a(dh.a.a().a(ju.a($$1.b(dir.x), $$1.b(dir.y), $$1.b(dir.z))))).a(10))
            )
      );
      $$0.accept(
         ewl.ao,
         ewu.b()
            .a(
               ewt.a()
                  .a(exc.a(cxt.vB))
                  .a(exc.a(cxt.oe))
                  .a(exc.a(cxt.oR).a(eyv.a(fay.a(0.0F, 0.25F))).a(ext.a(this.a, far.a(30.0F))))
                  .a(exc.a(cxt.rJ).a(eyv.a(fay.a(0.0F, 0.25F))).a(ext.a(this.a, far.a(30.0F))))
                  .a(exc.a(cxt.rn).a(ext.a(this.a, far.a(30.0F))))
                  .a(exc.a(cxt.wJ))
            )
      );
   }

   public static ewu.a a() {
      return ewu.b().a(ewt.a().a(exc.a(cxt.rN).a(60)).a(exc.a(cxt.rO).a(25)).a(exc.a(cxt.rP).a(2)).a(exc.a(cxt.rQ).a(13)));
   }

   public js.a b() {
      return this.a;
   }
}
