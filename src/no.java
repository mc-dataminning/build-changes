import java.util.function.BiConsumer;

public record no(js.a a) implements ne {
   @Override
   public void generate(BiConsumer<ali<eus>, eus.a> $$0) {
      js.b<dgo> $$1 = this.a.d(ma.aG);
      $$0.accept(
         euj.am,
         eus.b()
            .a(
               eur.a()
                  .a(eyr.a(1.0F))
                  .a(evg.a(euj.an).a(10).b(-2))
                  .a(evg.a(euj.ao).a(5).b(2).a(eyb.a(eun.b.a, bw.a.a().a(cc.a(true)))))
                  .a(evg.a(euj.ap).a(85).b(-1))
            )
      );
      $$0.accept(euj.ap, a());
      $$0.accept(
         euj.an,
         eus.b()
            .a(
               eur.a()
                  .a(eva.a(dis.fm).a(17))
                  .a(eva.a(cwq.pC).a(10).a(ewt.a(eyy.a(0.0F, 0.9F))))
                  .a(eva.a(cwq.qE).a(10))
                  .a(eva.a(cwq.rQ).a(10))
                  .a(eva.a(cwq.sC).a(10).a(ewy.a(cym.a)))
                  .a(eva.a(cwq.pt).a(5))
                  .a(eva.a(cwq.rm).a(2).a(ewt.a(eyy.a(0.0F, 0.9F))))
                  .a(eva.a(cwq.ou).a(10))
                  .a(eva.a(cwq.pr).a(5))
                  .a(eva.a(cwq.rw).a(1).a(ews.a(eyr.a(10.0F))))
                  .a(eva.a(dis.fH).a(10))
                  .a(eva.a(cwq.sv).a(10))
                  .a(eva.a(dis.mZ).a(exw.a(dh.a.a().a(ju.a($$1.b(dgv.x), $$1.b(dgv.y), $$1.b(dgv.z))))).a(10))
            )
      );
      $$0.accept(
         euj.ao,
         eus.b()
            .a(
               eur.a()
                  .a(eva.a(cwq.vd))
                  .a(eva.a(cwq.nL))
                  .a(eva.a(cwq.ow).a(ewt.a(eyy.a(0.0F, 0.25F))).a(evr.a(this.a, eyr.a(30.0F))))
                  .a(eva.a(cwq.rm).a(ewt.a(eyy.a(0.0F, 0.25F))).a(evr.a(this.a, eyr.a(30.0F))))
                  .a(eva.a(cwq.qQ).a(evr.a(this.a, eyr.a(30.0F))))
                  .a(eva.a(cwq.wl))
            )
      );
   }

   public static eus.a a() {
      return eus.b().a(eur.a().a(eva.a(cwq.rq).a(60)).a(eva.a(cwq.rr).a(25)).a(eva.a(cwq.rs).a(2)).a(eva.a(cwq.rt).a(13)));
   }

   public js.a b() {
      return this.a;
   }
}
