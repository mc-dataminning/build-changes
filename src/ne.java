import java.util.List;

public class ne {
   private static final ir a = new ir()
      .a(jz.av, or::a)
      .a(jz.as, op::a)
      .a(jz.at, po::a)
      .a(jz.az, qd::a)
      .a(jz.aA, pa::a)
      .a(jz.aC, oz::a)
      .a(jz.aB, ow::a)
      .a(jz.aD, ov::a)
      .a(jz.aq, pg::a)
      .a(jz.aH, csm::a)
      .a(jz.ay, os::a)
      .a(jz.au, dlr::a)
      .a(jz.ax, dlp::a)
      .a(jz.aG, dvq::a)
      .a(jz.aw, duc::a)
      .a(jz.ar, ue::a)
      .a(jz.aF, cmp::a)
      .a(jz.aE, cmn::a)
      .a(jz.q, biu::a);

   private static void a(id.b $$0) {
      a($$0.b(jz.az), $$0.b(jz.aq));
   }

   public static void a(ic<dve> $$0, id<crx> $$1) {
      $$1.b().forEach($$1x -> {
         afw $$2 = $$1x.g().a();
         List<ig<dve>> $$3 = ((crx)$$1x.a()).d().b();
         $$3.stream().flatMap(ig::a).forEach($$3x -> $$3x.d().ifLeft($$2xx -> {
               ib.c<dve> $$3xx = $$0.b($$2xx);
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

   private static boolean a(dve $$0) {
      return $$0.c().contains(dus.a());
   }

   public static id.b a() {
      ip.b $$0 = ip.a(jy.aq);
      id.b $$1 = a.a($$0);
      a($$1);
      return $$1;
   }
}
