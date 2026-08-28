import java.util.function.BiConsumer;

public record nu(jg.a a) implements nk {
   @Override
   public void generate(BiConsumer<alf<eze>, eze.a> $$0) {
      jg.b<djy> $$1 = this.a.e(mg.aG);
      $$0.accept(
         eyv.am,
         eze.b()
            .a(
               ezd.a()
                  .a(fdb.a(1.0F))
                  .a(ezs.a(eyv.an).a(10).b(-2))
                  .a(ezs.a(eyv.ao).a(5).b(2).a(fcl.a(eyz.b.a, bx.a.a().a(cd.a(true)))))
                  .a(ezs.a(eyv.ap).a(85).b(-1))
            )
      );
      $$0.accept(eyv.ap, a());
      $$0.accept(
         eyv.an,
         eze.b()
            .a(
               ezd.a()
                  .a(ezm.a(dmc.fC).a(17))
                  .a(ezm.a(czc.qm).a(10).a(fbf.a(fdi.a(0.0F, 0.9F))))
                  .a(ezm.a(czc.rq).a(10))
                  .a(ezm.a(czc.sC).a(10))
                  .a(ezm.a(czc.to).a(10).a(fbk.a(dav.a)))
                  .a(ezm.a(czc.qd).a(5))
                  .a(ezm.a(czc.rY).a(2).a(fbf.a(fdi.a(0.0F, 0.9F))))
                  .a(ezm.a(czc.pe).a(10))
                  .a(ezm.a(czc.qb).a(5))
                  .a(ezm.a(czc.si).a(1).a(fbe.a(fdb.a(10.0F))))
                  .a(ezm.a(dmc.gd).a(10))
                  .a(ezm.a(czc.th).a(10))
                  .a(ezm.a(dmc.nC).a(fcg.a(ct.a.a().a(ji.a($$1.b(dkf.y), $$1.b(dkf.z), $$1.b(dkf.A))))).a(10))
            )
      );
      $$0.accept(
         eyv.ao,
         eze.b()
            .a(
               ezd.a()
                  .a(ezm.a(czc.vR))
                  .a(ezm.a(czc.or))
                  .a(ezm.a(czc.pg).a(fbf.a(fdi.a(0.0F, 0.25F))).a(fad.a(this.a, fdb.a(30.0F))))
                  .a(ezm.a(czc.rY).a(fbf.a(fdi.a(0.0F, 0.25F))).a(fad.a(this.a, fdb.a(30.0F))))
                  .a(ezm.a(czc.rC).a(fad.a(this.a, fdb.a(30.0F))))
                  .a(ezm.a(czc.wZ))
            )
      );
   }

   public static eze.a a() {
      return eze.b().a(ezd.a().a(ezm.a(czc.sc).a(60)).a(ezm.a(czc.sd).a(25)).a(ezm.a(czc.se).a(2)).a(ezm.a(czc.sf).a(13)));
   }

   public jg.a b() {
      return this.a;
   }
}
