import java.util.List;

public class ni {
   private static final ir a = new ir()
      .a(jz.aw, ox::a)
      .a(jz.at, ov::a)
      .a(jz.au, pu::a)
      .a(jz.aA, qj::a)
      .a(jz.aB, pg::a)
      .a(jz.aD, pf::a)
      .a(jz.aC, pc::a)
      .a(jz.aE, pb::a)
      .a(jz.ar, pm::a)
      .a(jz.aI, ctf::a)
      .a(jz.az, oy::a)
      .a(jz.av, dmm::a)
      .a(jz.ay, dmk::a)
      .a(jz.aH, dwl::a)
      .a(jz.ax, dux::a)
      .a(jz.as, un::a)
      .a(jz.aG, cnh::a)
      .a(jz.aF, cnf::a)
      .a(jz.q, bjj::a);

   private static void a(id.b $$0) {
      a($$0.b(jz.aA), $$0.b(jz.ar));
   }

   public static void a(ic<dvz> $$0, id<csq> $$1) {
      $$1.b().forEach($$1x -> {
         agg $$2 = $$1x.g().a();
         List<ig<dvz>> $$3 = ((csq)$$1x.a()).d().b();
         $$3.stream().flatMap(ig::a).forEach($$3x -> $$3x.d().ifLeft($$2xx -> {
               ib.c<dvz> $$3xx = $$0.b($$2xx);
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

   private static boolean a(dvz $$0) {
      return $$0.c().contains(dvn.a());
   }

   public static id.b a() {
      ip.b $$0 = ip.a(jy.ar);
      id.b $$1 = a.a($$0);
      a($$1);
      return $$1;
   }
}
