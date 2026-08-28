import java.util.function.BiConsumer;

public record nr(js.a a) implements nh {
   @Override
   public void generate(BiConsumer<aly<ewm>, ewm.a> $$0) {
      js.b<dic> $$1 = this.a.d(mb.aH);
      $$0.accept(
         ewd.am,
         ewm.b()
            .a(
               ewl.a()
                  .a(fal.a(1.0F))
                  .a(exa.a(ewd.an).a(10).b(-2))
                  .a(exa.a(ewd.ao).a(5).b(2).a(ezv.a(ewh.b.a, bw.a.a().a(cc.a(true)))))
                  .a(exa.a(ewd.ap).a(85).b(-1))
            )
      );
      $$0.accept(ewd.ap, a());
      $$0.accept(
         ewd.an,
         ewm.b()
            .a(
               ewl.a()
                  .a(ewu.a(dkg.fA).a(17))
                  .a(ewu.a(cxo.pX).a(10).a(eyn.a(fas.a(0.0F, 0.9F))))
                  .a(ewu.a(cxo.rb).a(10))
                  .a(ewu.a(cxo.sn).a(10))
                  .a(ewu.a(cxo.sZ).a(10).a(eys.a(czk.a)))
                  .a(ewu.a(cxo.pO).a(5))
                  .a(ewu.a(cxo.rJ).a(2).a(eyn.a(fas.a(0.0F, 0.9F))))
                  .a(ewu.a(cxo.oP).a(10))
                  .a(ewu.a(cxo.pM).a(5))
                  .a(ewu.a(cxo.rT).a(1).a(eym.a(fal.a(10.0F))))
                  .a(ewu.a(dkg.fV).a(10))
                  .a(ewu.a(cxo.sS).a(10))
                  .a(ewu.a(dkg.nu).a(ezq.a(dh.a.a().a(ju.a($$1.b(dij.x), $$1.b(dij.y), $$1.b(dij.z))))).a(10))
            )
      );
      $$0.accept(
         ewd.ao,
         ewm.b()
            .a(
               ewl.a()
                  .a(ewu.a(cxo.vB))
                  .a(ewu.a(cxo.oe))
                  .a(ewu.a(cxo.oR).a(eyn.a(fas.a(0.0F, 0.25F))).a(exl.a(this.a, fal.a(30.0F))))
                  .a(ewu.a(cxo.rJ).a(eyn.a(fas.a(0.0F, 0.25F))).a(exl.a(this.a, fal.a(30.0F))))
                  .a(ewu.a(cxo.rn).a(exl.a(this.a, fal.a(30.0F))))
                  .a(ewu.a(cxo.wJ))
            )
      );
   }

   public static ewm.a a() {
      return ewm.b().a(ewl.a().a(ewu.a(cxo.rN).a(60)).a(ewu.a(cxo.rO).a(25)).a(ewu.a(cxo.rP).a(2)).a(ewu.a(cxo.rQ).a(13)));
   }

   public js.a b() {
      return this.a;
   }
}
