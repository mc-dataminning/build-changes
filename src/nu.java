import java.util.function.BiConsumer;

public record nu(jg.a a) implements nk {
   @Override
   public void generate(BiConsumer<alf<ezm>, ezm.a> $$0) {
      jg.b<dkd> $$1 = this.a.e(mg.aG);
      $$0.accept(
         ezd.am,
         ezm.b()
            .a(
               ezl.a()
                  .a(fdj.a(1.0F))
                  .a(faa.a(ezd.an).a(10).b(-2))
                  .a(faa.a(ezd.ao).a(5).b(2).a(fct.a(ezh.b.a, bx.a.a().a(cd.a(true)))))
                  .a(faa.a(ezd.ap).a(85).b(-1))
            )
      );
      $$0.accept(ezd.ap, a());
      $$0.accept(
         ezd.an,
         ezm.b()
            .a(
               ezl.a()
                  .a(ezu.a(dmh.fF).a(17))
                  .a(ezu.a(czh.qp).a(10).a(fbn.a(fdq.a(0.0F, 0.9F))))
                  .a(ezu.a(czh.rt).a(10))
                  .a(ezu.a(czh.sH).a(10))
                  .a(ezu.a(czh.tt).a(10).a(fbs.a(dba.a)))
                  .a(ezu.a(czh.qg).a(5))
                  .a(ezu.a(czh.sd).a(2).a(fbn.a(fdq.a(0.0F, 0.9F))))
                  .a(ezu.a(czh.ph).a(10))
                  .a(ezu.a(czh.qe).a(5))
                  .a(ezu.a(czh.sn).a(1).a(fbm.a(fdj.a(10.0F))))
                  .a(ezu.a(dmh.gg).a(10))
                  .a(ezu.a(czh.tm).a(10))
                  .a(ezu.a(dmh.nF).a(fco.a(ct.a.a().a(ji.a($$1.b(dkk.y), $$1.b(dkk.z), $$1.b(dkk.A))))).a(10))
            )
      );
      $$0.accept(
         ezd.ao,
         ezm.b()
            .a(
               ezl.a()
                  .a(ezu.a(czh.vW))
                  .a(ezu.a(czh.ou))
                  .a(ezu.a(czh.pj).a(fbn.a(fdq.a(0.0F, 0.25F))).a(fal.a(this.a, fdj.a(30.0F))))
                  .a(ezu.a(czh.sd).a(fbn.a(fdq.a(0.0F, 0.25F))).a(fal.a(this.a, fdj.a(30.0F))))
                  .a(ezu.a(czh.rF).a(fal.a(this.a, fdj.a(30.0F))))
                  .a(ezu.a(czh.xe))
            )
      );
   }

   public static ezm.a a() {
      return ezm.b().a(ezl.a().a(ezu.a(czh.sh).a(60)).a(ezu.a(czh.si).a(25)).a(ezu.a(czh.sj).a(2)).a(ezu.a(czh.sk).a(13)));
   }

   public jg.a b() {
      return this.a;
   }
}
