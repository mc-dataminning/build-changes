import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

public class pq {
   public static dzf.c a(il<cun> $$0, Map<bmn, dzm> $$1, dol.b $$2, dzq $$3) {
      return new dzf.c($$0, $$1, $$2, $$3);
   }

   private static dzf.c a(il<cun> $$0, dol.b $$1, dzq $$2) {
      return a($$0, Map.of(), $$1, $$2);
   }

   private static dzf.c a(il<cun> $$0, dzq $$1) {
      return a($$0, Map.of(), dol.b.e, $$1);
   }

   public static void a(pe<dzf> $$0) {
      ii<cun> $$1 = $$0.a(ke.at);
      ii<eao> $$2 = $$0.a(ke.aG);
      $$0.a(
         dyz.a,
         new ebf(
            a($$1.b(asf.y), Map.of(bmn.a, new dzm(dzm.a.b, bio.a(new cuz.c(bly.az, 1, 1, 1)))), dol.b.e, dzq.c), $$2.b(pj.a), 7, dxl.a(dpj.a(0)), true, dop.a.a
         )
      );
      $$0.a(dyz.b, new ebj(a($$1.b(asf.t), dol.b.d, dzq.a), ebj.a.a));
      $$0.a(dyz.c, new ebj(a($$1.b(asf.u), dol.b.d, dzq.a), ebj.a.b));
      $$0.a(dyz.d, new ecb(a($$1.b(asf.Q), dzq.a)));
      $$0.a(dyz.e, new ebh(a($$1.b(asf.s), dzq.a)));
      $$0.a(dyz.f, new eba(a($$1.b(asf.q), dzq.a)));
      $$0.a(dyz.g, new ebe(a($$1.b(asf.r), dzq.a)));
      $$0.a(dyz.h, new ebv(a($$1.b(asf.G), dzq.a), false));
      $$0.a(dyz.i, new ebv(a($$1.b(asf.F), dzq.a), true));
      $$0.a(
         dyz.j,
         new ebz(
            a(
               $$1.b(asf.J),
               Map.of(bmn.a, new dzm(dzm.a.a, bio.a(new cuz.c(bly.bl, 1, 1, 1))), bmn.b, new dzm(dzm.a.a, bio.a(new cuz.c(bly.n, 1, 1, 1)))),
               dol.b.e,
               dzq.a
            )
         )
      );
      $$0.a(dyz.k, new ebx(a($$1.b(asf.H), dzq.b)));
      $$0.a(
         dyz.l,
         new ebp(
            a(
               $$1.b(asf.v),
               Map.of(bmn.a, new dzm(dzm.a.b, bio.a(new cuz.c(bly.W, 1, 2, 4))), bmn.e, new dzm(dzm.a.b, cuz.a), bmn.d, new dzm(dzm.a.b, cuz.a)),
               dol.b.e,
               dzq.a
            )
         )
      );
      $$0.a(dyz.m, new ebr(a($$1.b(asf.w), dzq.a), ebr.a.b, 0.3F, 0.9F));
      $$0.a(dyz.n, new ebr(a($$1.b(asf.x), dzq.a), ebr.a.a, 0.3F, 0.9F));
      $$0.a(dyz.o, new ebl(a($$1.b(asf.R), Map.of(bmn.a, new dzm(dzm.a.a, ebl.d)), dol.b.h, dzq.a)));
      $$0.a(dyz.p, new ebn(a($$1.b(asf.S), dol.b.h, dzq.c), dxp.a(dpj.a(32), dpj.c(2))));
      $$0.a(dyz.q, new ebc(a($$1.b(asf.W), dzq.a)));
      $$0.a(dyz.r, new eay(a($$1.b(asf.p), dol.b.d, dzq.a)));
      $$0.a(dyz.s, new ebf(a($$1.b(asf.T), dzq.a), $$2.b(pa.a), 6, dxl.a(dpj.a(33)), false));
      $$0.a(dyz.t, new ebf(a($$1.b(asf.L), dzq.c), $$2.b(pk.a), 6, dxl.a(dpj.a(0)), true, dop.a.a));
      $$0.a(dyz.u, new ebf(a($$1.b(asf.K), dzq.c), $$2.b(pg.a), 6, dxl.a(dpj.a(0)), true, dop.a.a));
      $$0.a(dyz.v, new ebf(a($$1.b(asf.M), dzq.c), $$2.b(pn.a), 6, dxl.a(dpj.a(0)), true, dop.a.a));
      $$0.a(dyz.w, new ebf(a($$1.b(asf.N), dzq.c), $$2.b(po.a), 6, dxl.a(dpj.a(0)), true, dop.a.a));
      $$0.a(dyz.x, new ebf(a($$1.b(asf.O), dzq.c), $$2.b(ps.a), 6, dxl.a(dpj.a(0)), true, dop.a.a));
      $$0.a(
         dyz.y,
         new ebt(
            a($$1.b(asf.E), dzq.a),
            List.of(new ebt.a(ebs.b.e, 1.0F, 0.2F, false, false, true, false, 0.5F), new ebt.a(ebs.b.a, 0.5F, 0.2F, false, false, true, false, 0.5F))
         )
      );
      $$0.a(dyz.z, new ebt(a($$1.b(asf.z), dzq.a), new ebt.a(ebs.b.b, 0.0F, 0.0F, false, false, false, false, 1.0F)));
      $$0.a(dyz.A, new ebt(a($$1.b(asf.A), dzq.a), new ebt.a(ebs.b.a, 0.5F, 0.8F, true, true, false, false, 1.0F)));
      $$0.a(dyz.B, new ebt(a($$1.b(asf.C), dzq.a), new ebt.a(ebs.b.c, 0.0F, 0.5F, false, true, false, false, 1.0F)));
      $$0.a(
         dyz.C,
         new ebt(
            a($$1.b(asf.D), dzq.a),
            List.of(new ebt.a(ebs.b.d, 1.0F, 0.2F, false, false, true, false, 0.5F), new ebt.a(ebs.b.a, 0.5F, 0.2F, false, false, true, false, 0.5F))
         )
      );
      $$0.a(dyz.D, new ebt(a($$1.b(asf.B), dzq.a), new ebt.a(ebs.b.c, 0.0F, 0.8F, false, false, true, false, 1.0F)));
      $$0.a(dyz.E, new ebt(a($$1.b(asf.V), dzq.a), new ebt.a(ebs.b.f, 0.5F, 0.0F, false, false, false, true, 1.0F)));
      $$0.a(
         dyz.F,
         new ebf(
            a($$1.b(asf.U), Arrays.stream(bmn.values()).collect(Collectors.toMap($$0x -> $$0x, $$0x -> new dzm(dzm.a.b, bio.c()))), dol.b.h, dzq.d),
            $$2.b(ov.a),
            Optional.of(new ahg("city_anchor")),
            7,
            dxl.a(dpj.a(-27)),
            false,
            Optional.empty(),
            116,
            List.of()
         )
      );
      $$0.a(dyz.G, new ebf(a($$1.b(asf.P), Map.of(), dol.b.d, dzq.b), $$2.b(pu.a), 7, dxl.a(dpj.a(-15)), false, dop.a.a));
   }
}
