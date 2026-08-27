public class pf {
   public static final ahf<dqs<?>> a = a("cave");
   public static final ahf<dqs<?>> b = a("cave_extra_underground");
   public static final ahf<dqs<?>> c = a("canyon");
   public static final ahf<dqs<?>> d = a("nether_cave");

   private static ahf<dqs<?>> a(String $$0) {
      return ahf.a(ke.av, new ahg($$0));
   }

   public static void a(pe<dqs<?>> $$0) {
      ii<cwp> $$1 = $$0.a(ke.f);
      $$0.a(
         a,
         dqu.a
            .a(
               new dqq(
                  0.15F,
                  dxp.a(dpj.b(8), dpj.a(180)),
                  bjk.b(0.1F, 0.9F),
                  dpj.b(8),
                  dqo.a(false, cwr.oS.o()),
                  $$1.b(asg.bh),
                  bjk.b(0.7F, 1.4F),
                  bjk.b(0.8F, 1.3F),
                  bjk.b(-1.0F, -0.4F)
               )
            )
      );
      $$0.a(
         b,
         dqu.a
            .a(
               new dqq(
                  0.07F,
                  dxp.a(dpj.b(8), dpj.a(47)),
                  bjk.b(0.1F, 0.9F),
                  dpj.b(8),
                  dqo.a(false, cwr.gv.o()),
                  $$1.b(asg.bh),
                  bjk.b(0.7F, 1.4F),
                  bjk.b(0.8F, 1.3F),
                  bjk.b(-1.0F, -0.4F)
               )
            )
      );
      $$0.a(
         c,
         dqu.c
            .a(
               new dql(
                  0.01F,
                  dxp.a(dpj.a(10), dpj.a(67)),
                  bjb.a(3.0F),
                  dpj.b(8),
                  dqo.a(false, cwr.oT.o()),
                  $$1.b(asg.bh),
                  bjk.b(-0.125F, 0.125F),
                  new dql.a(bjk.b(0.75F, 1.0F), bjj.a(0.0F, 6.0F, 2.0F), 3, bjk.b(0.75F, 1.0F), 1.0F, 0.0F)
               )
            )
      );
      $$0.a(d, dqu.b.a(new dqq(0.2F, dxp.a(dpj.a(0), dpj.c(1)), bjb.a(0.5F), dpj.b(10), $$1.b(asg.bi), bjb.a(1.0F), bjb.a(1.0F), bjb.a(-0.7F))));
   }
}
