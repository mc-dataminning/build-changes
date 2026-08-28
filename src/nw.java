import java.util.function.BiConsumer;

public record nw(ji.a a) implements nm {
   @Override
   public void generate(BiConsumer<alq<fay>, fay.a> $$0) {
      ji.b<dlm> $$1 = this.a.e(mi.aG);
      $$0.accept(
         fap.am,
         fay.b()
            .a(
               fax.a()
                  .a(fev.a(1.0F))
                  .a(fbm.a(fap.an).a(10).b(-2))
                  .a(fbm.a(fap.ao).a(5).b(2).a(fef.a(fat.b.a, bz.a.a().a(cf.a(true)))))
                  .a(fbm.a(fap.ap).a(85).b(-1))
            )
      );
      $$0.accept(fap.ap, a());
      $$0.accept(
         fap.an,
         fay.b()
            .a(
               fax.a()
                  .a(fbg.a(dnq.fF).a(17))
                  .a(fbg.a(dao.qp).a(10).a(fcz.a(ffc.a(0.0F, 0.9F))))
                  .a(fbg.a(dao.rt).a(10))
                  .a(fbg.a(dao.sH).a(10))
                  .a(fbg.a(dao.tt).a(10).a(fde.a(dch.a)))
                  .a(fbg.a(dao.qg).a(5))
                  .a(fbg.a(dao.sd).a(2).a(fcz.a(ffc.a(0.0F, 0.9F))))
                  .a(fbg.a(dao.ph).a(10))
                  .a(fbg.a(dao.qe).a(5))
                  .a(fbg.a(dao.sn).a(1).a(fcy.a(fev.a(10.0F))))
                  .a(fbg.a(dnq.gg).a(10))
                  .a(fbg.a(dao.tm).a(10))
                  .a(fbg.a(dnq.nF).a(fea.a(cv.a.a().a(jk.a($$1.b(dlt.y), $$1.b(dlt.z), $$1.b(dlt.A))))).a(10))
            )
      );
      $$0.accept(
         fap.ao,
         fay.b()
            .a(
               fax.a()
                  .a(fbg.a(dao.vW))
                  .a(fbg.a(dao.ou))
                  .a(fbg.a(dao.pj).a(fcz.a(ffc.a(0.0F, 0.25F))).a(fbx.a(this.a, fev.a(30.0F))))
                  .a(fbg.a(dao.sd).a(fcz.a(ffc.a(0.0F, 0.25F))).a(fbx.a(this.a, fev.a(30.0F))))
                  .a(fbg.a(dao.rF).a(fbx.a(this.a, fev.a(30.0F))))
                  .a(fbg.a(dao.xe))
            )
      );
   }

   public static fay.a a() {
      return fay.b().a(fax.a().a(fbg.a(dao.sh).a(60)).a(fbg.a(dao.si).a(25)).a(fbg.a(dao.sj).a(2)).a(fbg.a(dao.sk).a(13)));
   }

   public ji.a b() {
      return this.a;
   }
}
