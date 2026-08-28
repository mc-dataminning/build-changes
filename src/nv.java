import java.util.function.BiConsumer;

public record nv(jh.a a) implements nl {
   @Override
   public void generate(BiConsumer<alh<fam>, fam.a> $$0) {
      jh.b<dla> $$1 = this.a.e(mh.aG);
      $$0.accept(
         fad.am,
         fam.b()
            .a(
               fal.a()
                  .a(fej.a(1.0F))
                  .a(fba.a(fad.an).a(10).b(-2))
                  .a(fba.a(fad.ao).a(5).b(2).a(fdt.a(fah.b.a, by.a.a().a(ce.a(true)))))
                  .a(fba.a(fad.ap).a(85).b(-1))
            )
      );
      $$0.accept(fad.ap, a());
      $$0.accept(
         fad.an,
         fam.b()
            .a(
               fal.a()
                  .a(fau.a(dne.fF).a(17))
                  .a(fau.a(dac.qp).a(10).a(fcn.a(feq.a(0.0F, 0.9F))))
                  .a(fau.a(dac.rt).a(10))
                  .a(fau.a(dac.sH).a(10))
                  .a(fau.a(dac.tt).a(10).a(fcs.a(dbv.a)))
                  .a(fau.a(dac.qg).a(5))
                  .a(fau.a(dac.sd).a(2).a(fcn.a(feq.a(0.0F, 0.9F))))
                  .a(fau.a(dac.ph).a(10))
                  .a(fau.a(dac.qe).a(5))
                  .a(fau.a(dac.sn).a(1).a(fcm.a(fej.a(10.0F))))
                  .a(fau.a(dne.gg).a(10))
                  .a(fau.a(dac.tm).a(10))
                  .a(fau.a(dne.nF).a(fdo.a(cu.a.a().a(jj.a($$1.b(dlh.y), $$1.b(dlh.z), $$1.b(dlh.A))))).a(10))
            )
      );
      $$0.accept(
         fad.ao,
         fam.b()
            .a(
               fal.a()
                  .a(fau.a(dac.vW))
                  .a(fau.a(dac.ou))
                  .a(fau.a(dac.pj).a(fcn.a(feq.a(0.0F, 0.25F))).a(fbl.a(this.a, fej.a(30.0F))))
                  .a(fau.a(dac.sd).a(fcn.a(feq.a(0.0F, 0.25F))).a(fbl.a(this.a, fej.a(30.0F))))
                  .a(fau.a(dac.rF).a(fbl.a(this.a, fej.a(30.0F))))
                  .a(fau.a(dac.xe))
            )
      );
   }

   public static fam.a a() {
      return fam.b().a(fal.a().a(fau.a(dac.sh).a(60)).a(fau.a(dac.si).a(25)).a(fau.a(dac.sj).a(2)).a(fau.a(dac.sk).a(13)));
   }

   public jh.a b() {
      return this.a;
   }
}
