public class rd {
   public static final ale<dzx<?>> a = a("cave");
   public static final ale<dzx<?>> b = a("cave_extra_underground");
   public static final ale<dzx<?>> c = a("canyon");
   public static final ale<dzx<?>> d = a("nether_cave");

   private static ale<dzx<?>> a(String $$0) {
      return ale.a(lq.aB, new alf($$0));
   }

   public static void a(rc<dzx<?>> $$0) {
      jj<dez> $$1 = $$0.a(lq.f);
      $$0.a(
         a,
         dzz.a
            .a(
               new dzv(
                  0.15F,
                  egu.a(dyo.b(8), dyo.a(180)),
                  bqe.b(0.1F, 0.9F),
                  dyo.b(8),
                  dzt.a(false, dfb.oS.o()),
                  $$1.b(awp.bi),
                  bqe.b(0.7F, 1.4F),
                  bqe.b(0.8F, 1.3F),
                  bqe.b(-1.0F, -0.4F)
               )
            )
      );
      $$0.a(
         b,
         dzz.a
            .a(
               new dzv(
                  0.07F,
                  egu.a(dyo.b(8), dyo.a(47)),
                  bqe.b(0.1F, 0.9F),
                  dyo.b(8),
                  dzt.a(false, dfb.gv.o()),
                  $$1.b(awp.bi),
                  bqe.b(0.7F, 1.4F),
                  bqe.b(0.8F, 1.3F),
                  bqe.b(-1.0F, -0.4F)
               )
            )
      );
      $$0.a(
         c,
         dzz.c
            .a(
               new dzq(
                  0.01F,
                  egu.a(dyo.a(10), dyo.a(67)),
                  bpv.a(3.0F),
                  dyo.b(8),
                  dzt.a(false, dfb.oT.o()),
                  $$1.b(awp.bi),
                  bqe.b(-0.125F, 0.125F),
                  new dzq.a(bqe.b(0.75F, 1.0F), bqd.a(0.0F, 6.0F, 2.0F), 3, bqe.b(0.75F, 1.0F), 1.0F, 0.0F)
               )
            )
      );
      $$0.a(d, dzz.b.a(new dzv(0.2F, egu.a(dyo.a(0), dyo.c(1)), bpv.a(0.5F), dyo.b(10), $$1.b(awp.bj), bpv.a(1.0F), bpv.a(1.0F), bpv.a(-0.7F))));
   }
}
