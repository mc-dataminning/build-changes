import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

public class ra {
   public static ehj.c a(jb<dbw> $$0, Map<bsr, ehq> $$1, dwp.b $$2, ehu $$3) {
      return new ehj.c($$0, $$1, $$2, $$3);
   }

   private static ehj.c a(jb<dbw> $$0, dwp.b $$1, ehu $$2) {
      return a($$0, Map.of(), $$1, $$2);
   }

   private static ehj.c a(jb<dbw> $$0, ehu $$1) {
      return a($$0, Map.of(), dwp.b.e, $$1);
   }

   public static void a(qo<ehj> $$0) {
      iy<dbw> $$1 = $$0.a(lf.az);
      iy<eis> $$2 = $$0.a(lf.aM);
      $$0.a(
         ehd.a,
         new ejj(
            a($$1.b(avv.y), Map.of(bsr.a, new ehq(ehq.a.b, boi.a(new dci.c(bsa.aC, 1, 1, 1)))), dwp.b.e, ehu.c), $$2.b(qt.a), 7, efp.a(dxn.a(0)), true, dwt.a.a
         )
      );
      $$0.a(ehd.b, new ejn(a($$1.b(avv.t), dwp.b.d, ehu.a), ejn.a.a));
      $$0.a(ehd.c, new ejn(a($$1.b(avv.u), dwp.b.d, ehu.a), ejn.a.b));
      $$0.a(ehd.d, new ekf(a($$1.b(avv.Q), ehu.a)));
      $$0.a(ehd.e, new ejl(a($$1.b(avv.s), ehu.a)));
      $$0.a(ehd.f, new eje(a($$1.b(avv.q), ehu.a)));
      $$0.a(ehd.g, new eji(a($$1.b(avv.r), ehu.a)));
      $$0.a(ehd.h, new ejz(a($$1.b(avv.G), ehu.a), false));
      $$0.a(ehd.i, new ejz(a($$1.b(avv.F), ehu.a), true));
      $$0.a(
         ehd.j,
         new ekd(
            a(
               $$1.b(avv.J),
               Map.of(bsr.a, new ehq(ehq.a.a, boi.a(new dci.c(bsa.bo, 1, 1, 1))), bsr.b, new ehq(ehq.a.a, boi.a(new dci.c(bsa.p, 1, 1, 1)))),
               dwp.b.e,
               ehu.a
            )
         )
      );
      $$0.a(ehd.k, new ekb(a($$1.b(avv.H), ehu.b)));
      $$0.a(
         ehd.l,
         new ejt(
            a(
               $$1.b(avv.v),
               Map.of(bsr.a, new ehq(ehq.a.b, boi.a(new dci.c(bsa.Y, 1, 2, 4))), bsr.e, new ehq(ehq.a.b, dci.a), bsr.d, new ehq(ehq.a.b, dci.a)),
               dwp.b.e,
               ehu.a
            )
         )
      );
      $$0.a(ehd.m, new ejv(a($$1.b(avv.w), ehu.a), ejv.a.b, 0.3F, 0.9F));
      $$0.a(ehd.n, new ejv(a($$1.b(avv.x), ehu.a), ejv.a.a, 0.3F, 0.9F));
      $$0.a(ehd.o, new ejp(a($$1.b(avv.R), Map.of(bsr.a, new ehq(ehq.a.a, ejp.d)), dwp.b.h, ehu.a)));
      $$0.a(ehd.p, new ejr(a($$1.b(avv.S), dwp.b.h, ehu.c), eft.a(dxn.a(32), dxn.c(2))));
      $$0.a(ehd.q, new ejg(a($$1.b(avv.W), ehu.a)));
      $$0.a(ehd.r, new ejc(a($$1.b(avv.p), dwp.b.d, ehu.a)));
      $$0.a(ehd.s, new ejj(a($$1.b(avv.T), ehu.a), $$2.b(qk.a), 6, efp.a(dxn.a(33)), false));
      $$0.a(ehd.t, new ejj(a($$1.b(avv.L), ehu.c), $$2.b(qu.a), 6, efp.a(dxn.a(0)), true, dwt.a.a));
      $$0.a(ehd.u, new ejj(a($$1.b(avv.K), ehu.c), $$2.b(qq.a), 6, efp.a(dxn.a(0)), true, dwt.a.a));
      $$0.a(ehd.v, new ejj(a($$1.b(avv.M), ehu.c), $$2.b(qx.a), 6, efp.a(dxn.a(0)), true, dwt.a.a));
      $$0.a(ehd.w, new ejj(a($$1.b(avv.N), ehu.c), $$2.b(qy.a), 6, efp.a(dxn.a(0)), true, dwt.a.a));
      $$0.a(ehd.x, new ejj(a($$1.b(avv.O), ehu.c), $$2.b(rc.a), 6, efp.a(dxn.a(0)), true, dwt.a.a));
      $$0.a(
         ehd.y,
         new ejx(
            a($$1.b(avv.E), ehu.a),
            List.of(new ejx.a(ejw.b.e, 1.0F, 0.2F, false, false, true, false, 0.5F), new ejx.a(ejw.b.a, 0.5F, 0.2F, false, false, true, false, 0.5F))
         )
      );
      $$0.a(ehd.z, new ejx(a($$1.b(avv.z), ehu.a), new ejx.a(ejw.b.b, 0.0F, 0.0F, false, false, false, false, 1.0F)));
      $$0.a(ehd.A, new ejx(a($$1.b(avv.A), ehu.a), new ejx.a(ejw.b.a, 0.5F, 0.8F, true, true, false, false, 1.0F)));
      $$0.a(ehd.B, new ejx(a($$1.b(avv.C), ehu.a), new ejx.a(ejw.b.c, 0.0F, 0.5F, false, true, false, false, 1.0F)));
      $$0.a(
         ehd.C,
         new ejx(
            a($$1.b(avv.D), ehu.a),
            List.of(new ejx.a(ejw.b.d, 1.0F, 0.2F, false, false, true, false, 0.5F), new ejx.a(ejw.b.a, 0.5F, 0.2F, false, false, true, false, 0.5F))
         )
      );
      $$0.a(ehd.D, new ejx(a($$1.b(avv.B), ehu.a), new ejx.a(ejw.b.c, 0.0F, 0.8F, false, false, true, false, 1.0F)));
      $$0.a(ehd.E, new ejx(a($$1.b(avv.V), ehu.a), new ejx.a(ejw.b.f, 0.5F, 0.0F, false, false, false, true, 1.0F)));
      $$0.a(
         ehd.F,
         new ejj(
            a($$1.b(avv.U), Arrays.stream(bsr.values()).collect(Collectors.toMap($$0x -> $$0x, $$0x -> new ehq(ehq.a.b, boi.c()))), dwp.b.h, ehu.d),
            $$2.b(qf.a),
            Optional.of(new akm("city_anchor")),
            7,
            efp.a(dxn.a(-27)),
            false,
            Optional.empty(),
            116,
            List.of()
         )
      );
      $$0.a(ehd.G, new ejj(a($$1.b(avv.P), Map.of(), dwp.b.d, ehu.b), $$2.b(re.a), 7, efp.a(dxn.a(-15)), false, dwt.a.a));
   }
}
