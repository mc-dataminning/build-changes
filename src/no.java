import java.util.function.BiConsumer;

public record no(js.a a) implements ne {
   @Override
   public void generate(BiConsumer<alk<eul>, eul.a> $$0) {
      js.b<dgh> $$1 = this.a.d(ma.aG);
      $$0.accept(
         euc.am,
         eul.b()
            .a(
               euk.a()
                  .a(eyk.a(1.0F))
                  .a(euz.a(euc.an).a(10).b(-2))
                  .a(euz.a(euc.ao).a(5).b(2).a(exu.a(eug.b.a, bw.a.a().a(cc.a(true)))))
                  .a(euz.a(euc.ap).a(85).b(-1))
            )
      );
      $$0.accept(euc.ap, a());
      $$0.accept(
         euc.an,
         eul.b()
            .a(
               euk.a()
                  .a(eut.a(dil.fm).a(17))
                  .a(eut.a(cwj.pC).a(10).a(ewm.a(eyr.a(0.0F, 0.9F))))
                  .a(eut.a(cwj.qE).a(10))
                  .a(eut.a(cwj.rQ).a(10))
                  .a(eut.a(cwj.sC).a(10).a(ewr.a(cyf.a)))
                  .a(eut.a(cwj.pt).a(5))
                  .a(eut.a(cwj.rm).a(2).a(ewm.a(eyr.a(0.0F, 0.9F))))
                  .a(eut.a(cwj.ou).a(10))
                  .a(eut.a(cwj.pr).a(5))
                  .a(eut.a(cwj.rw).a(1).a(ewl.a(eyk.a(10.0F))))
                  .a(eut.a(dil.fH).a(10))
                  .a(eut.a(cwj.sv).a(10))
                  .a(eut.a(dil.mZ).a(exp.a(dh.a.a().a(ju.a($$1.b(dgo.x), $$1.b(dgo.y), $$1.b(dgo.z))))).a(10))
            )
      );
      $$0.accept(
         euc.ao,
         eul.b()
            .a(
               euk.a()
                  .a(eut.a(cwj.vd))
                  .a(eut.a(cwj.nL))
                  .a(eut.a(cwj.ow).a(ewm.a(eyr.a(0.0F, 0.25F))).a(evk.a(this.a, eyk.a(30.0F))))
                  .a(eut.a(cwj.rm).a(ewm.a(eyr.a(0.0F, 0.25F))).a(evk.a(this.a, eyk.a(30.0F))))
                  .a(eut.a(cwj.qQ).a(evk.a(this.a, eyk.a(30.0F))))
                  .a(eut.a(cwj.wl))
            )
      );
   }

   public static eul.a a() {
      return eul.b().a(euk.a().a(eut.a(cwj.rq).a(60)).a(eut.a(cwj.rr).a(25)).a(eut.a(cwj.rs).a(2)).a(eut.a(cwj.rt).a(13)));
   }

   public js.a b() {
      return this.a;
   }
}
