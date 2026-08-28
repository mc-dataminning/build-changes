import java.util.function.BiConsumer;

public record nw(ji.a a) implements nm {
   @Override
   public void generate(BiConsumer<alj<fao>, fao.a> $$0) {
      ji.b<dlc> $$1 = this.a.e(mi.aG);
      $$0.accept(
         faf.am,
         fao.b()
            .a(
               fan.a()
                  .a(fel.a(1.0F))
                  .a(fbc.a(faf.an).a(10).b(-2))
                  .a(fbc.a(faf.ao).a(5).b(2).a(fdv.a(faj.b.a, bz.a.a().a(cf.a(true)))))
                  .a(fbc.a(faf.ap).a(85).b(-1))
            )
      );
      $$0.accept(faf.ap, a());
      $$0.accept(
         faf.an,
         fao.b()
            .a(
               fan.a()
                  .a(faw.a(dng.fF).a(17))
                  .a(faw.a(dae.qp).a(10).a(fcp.a(fes.a(0.0F, 0.9F))))
                  .a(faw.a(dae.rt).a(10))
                  .a(faw.a(dae.sH).a(10))
                  .a(faw.a(dae.tt).a(10).a(fcu.a(dbx.a)))
                  .a(faw.a(dae.qg).a(5))
                  .a(faw.a(dae.sd).a(2).a(fcp.a(fes.a(0.0F, 0.9F))))
                  .a(faw.a(dae.ph).a(10))
                  .a(faw.a(dae.qe).a(5))
                  .a(faw.a(dae.sn).a(1).a(fco.a(fel.a(10.0F))))
                  .a(faw.a(dng.gg).a(10))
                  .a(faw.a(dae.tm).a(10))
                  .a(faw.a(dng.nF).a(fdq.a(cv.a.a().a(jk.a($$1.b(dlj.y), $$1.b(dlj.z), $$1.b(dlj.A))))).a(10))
            )
      );
      $$0.accept(
         faf.ao,
         fao.b()
            .a(
               fan.a()
                  .a(faw.a(dae.vW))
                  .a(faw.a(dae.ou))
                  .a(faw.a(dae.pj).a(fcp.a(fes.a(0.0F, 0.25F))).a(fbn.a(this.a, fel.a(30.0F))))
                  .a(faw.a(dae.sd).a(fcp.a(fes.a(0.0F, 0.25F))).a(fbn.a(this.a, fel.a(30.0F))))
                  .a(faw.a(dae.rF).a(fbn.a(this.a, fel.a(30.0F))))
                  .a(faw.a(dae.xe))
            )
      );
   }

   public static fao.a a() {
      return fao.b().a(fan.a().a(faw.a(dae.sh).a(60)).a(faw.a(dae.si).a(25)).a(faw.a(dae.sj).a(2)).a(faw.a(dae.sk).a(13)));
   }

   public ji.a b() {
      return this.a;
   }
}
