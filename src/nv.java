import java.util.function.BiConsumer;

public record nv(jh.a a) implements nl {
   @Override
   public void generate(BiConsumer<alf<ezt>, ezt.a> $$0) {
      jh.b<dkk> $$1 = this.a.e(mh.aG);
      $$0.accept(
         ezk.am,
         ezt.b()
            .a(
               ezs.a()
                  .a(fdq.a(1.0F))
                  .a(fah.a(ezk.an).a(10).b(-2))
                  .a(fah.a(ezk.ao).a(5).b(2).a(fda.a(ezo.b.a, by.a.a().a(ce.a(true)))))
                  .a(fah.a(ezk.ap).a(85).b(-1))
            )
      );
      $$0.accept(ezk.ap, a());
      $$0.accept(
         ezk.an,
         ezt.b()
            .a(
               ezs.a()
                  .a(fab.a(dmo.fF).a(17))
                  .a(fab.a(czo.qp).a(10).a(fbu.a(fdx.a(0.0F, 0.9F))))
                  .a(fab.a(czo.rt).a(10))
                  .a(fab.a(czo.sH).a(10))
                  .a(fab.a(czo.tt).a(10).a(fbz.a(dbh.a)))
                  .a(fab.a(czo.qg).a(5))
                  .a(fab.a(czo.sd).a(2).a(fbu.a(fdx.a(0.0F, 0.9F))))
                  .a(fab.a(czo.ph).a(10))
                  .a(fab.a(czo.qe).a(5))
                  .a(fab.a(czo.sn).a(1).a(fbt.a(fdq.a(10.0F))))
                  .a(fab.a(dmo.gg).a(10))
                  .a(fab.a(czo.tm).a(10))
                  .a(fab.a(dmo.nF).a(fcv.a(cu.a.a().a(jj.a($$1.b(dkr.y), $$1.b(dkr.z), $$1.b(dkr.A))))).a(10))
            )
      );
      $$0.accept(
         ezk.ao,
         ezt.b()
            .a(
               ezs.a()
                  .a(fab.a(czo.vW))
                  .a(fab.a(czo.ou))
                  .a(fab.a(czo.pj).a(fbu.a(fdx.a(0.0F, 0.25F))).a(fas.a(this.a, fdq.a(30.0F))))
                  .a(fab.a(czo.sd).a(fbu.a(fdx.a(0.0F, 0.25F))).a(fas.a(this.a, fdq.a(30.0F))))
                  .a(fab.a(czo.rF).a(fas.a(this.a, fdq.a(30.0F))))
                  .a(fab.a(czo.xe))
            )
      );
   }

   public static ezt.a a() {
      return ezt.b().a(ezs.a().a(fab.a(czo.sh).a(60)).a(fab.a(czo.si).a(25)).a(fab.a(czo.sj).a(2)).a(fab.a(czo.sk).a(13)));
   }

   public jh.a b() {
      return this.a;
   }
}
