import java.util.function.BiConsumer;

public record nv(jh.a a) implements nl {
   @Override
   public void generate(BiConsumer<alf<ezy>, ezy.a> $$0) {
      jh.b<dkp> $$1 = this.a.e(mh.aG);
      $$0.accept(
         ezp.am,
         ezy.b()
            .a(
               ezx.a()
                  .a(fdv.a(1.0F))
                  .a(fam.a(ezp.an).a(10).b(-2))
                  .a(fam.a(ezp.ao).a(5).b(2).a(fdf.a(ezt.b.a, by.a.a().a(ce.a(true)))))
                  .a(fam.a(ezp.ap).a(85).b(-1))
            )
      );
      $$0.accept(ezp.ap, a());
      $$0.accept(
         ezp.an,
         ezy.b()
            .a(
               ezx.a()
                  .a(fag.a(dmt.fF).a(17))
                  .a(fag.a(czr.qp).a(10).a(fbz.a(fec.a(0.0F, 0.9F))))
                  .a(fag.a(czr.rt).a(10))
                  .a(fag.a(czr.sH).a(10))
                  .a(fag.a(czr.tt).a(10).a(fce.a(dbk.a)))
                  .a(fag.a(czr.qg).a(5))
                  .a(fag.a(czr.sd).a(2).a(fbz.a(fec.a(0.0F, 0.9F))))
                  .a(fag.a(czr.ph).a(10))
                  .a(fag.a(czr.qe).a(5))
                  .a(fag.a(czr.sn).a(1).a(fby.a(fdv.a(10.0F))))
                  .a(fag.a(dmt.gg).a(10))
                  .a(fag.a(czr.tm).a(10))
                  .a(fag.a(dmt.nF).a(fda.a(cu.a.a().a(jj.a($$1.b(dkw.y), $$1.b(dkw.z), $$1.b(dkw.A))))).a(10))
            )
      );
      $$0.accept(
         ezp.ao,
         ezy.b()
            .a(
               ezx.a()
                  .a(fag.a(czr.vW))
                  .a(fag.a(czr.ou))
                  .a(fag.a(czr.pj).a(fbz.a(fec.a(0.0F, 0.25F))).a(fax.a(this.a, fdv.a(30.0F))))
                  .a(fag.a(czr.sd).a(fbz.a(fec.a(0.0F, 0.25F))).a(fax.a(this.a, fdv.a(30.0F))))
                  .a(fag.a(czr.rF).a(fax.a(this.a, fdv.a(30.0F))))
                  .a(fag.a(czr.xe))
            )
      );
   }

   public static ezy.a a() {
      return ezy.b().a(ezx.a().a(fag.a(czr.sh).a(60)).a(fag.a(czr.si).a(25)).a(fag.a(czr.sj).a(2)).a(fag.a(czr.sk).a(13)));
   }

   public jh.a b() {
      return this.a;
   }
}
