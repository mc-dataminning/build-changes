import java.util.List;

public class nj {
   private static final ir a = new ir()
      .a(jz.aw, oy::a)
      .a(jz.at, ow::a)
      .a(jz.au, pv::a)
      .a(jz.aA, qk::a)
      .a(jz.aB, ph::a)
      .a(jz.aD, pg::a)
      .a(jz.aC, pd::a)
      .a(jz.aE, pc::a)
      .a(jz.ar, pn::a)
      .a(jz.aI, ctn::a)
      .a(jz.az, oz::a)
      .a(jz.av, dmy::a)
      .a(jz.ay, dmw::a)
      .a(jz.aH, dwx::a)
      .a(jz.ax, dvj::a)
      .a(jz.as, un::a)
      .a(jz.aG, cnp::a)
      .a(jz.aF, cnn::a)
      .a(jz.q, bjr::a);

   private static void a(id.b $$0) {
      a($$0.b(jz.aA), $$0.b(jz.ar));
   }

   public static void a(ic<dwl> $$0, id<csy> $$1) {
      $$1.b().forEach($$1x -> {
         agi $$2 = $$1x.g().a();
         List<ig<dwl>> $$3 = ((csy)$$1x.a()).d().b();
         $$3.stream().flatMap(ig::a).forEach($$3x -> $$3x.d().ifLeft($$2xx -> {
               ib.c<dwl> $$3xx = $$0.b($$2xx);
               if (!a($$3xx.a())) {
                  ac.a("Placed feature " + $$2xx.a() + " in biome " + $$2 + " is missing BiomeFilter.biome()");
               }
            }).ifRight($$1xxx -> {
               if (!a($$1xxx)) {
                  ac.a("Placed inline feature in biome " + $$1x + " is missing BiomeFilter.biome()");
               }
            }));
      });
   }

   private static boolean a(dwl $$0) {
      return $$0.c().contains(dvz.a());
   }

   public static id.b a() {
      ip.b $$0 = ip.a(jy.ar);
      id.b $$1 = a.a($$0);
      a($$1);
      return $$1;
   }
}
