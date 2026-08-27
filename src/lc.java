import com.google.common.collect.Maps;
import com.mojang.logging.LogUtils;
import com.mojang.serialization.Codec;
import com.mojang.serialization.Lifecycle;
import com.mojang.serialization.MapCodec;
import java.util.Map;
import java.util.function.Supplier;
import org.apache.commons.lang3.Validate;
import org.slf4j.Logger;

public class lc {
   private static final Logger aw = LogUtils.getLogger();
   private static final Map<akf, Supplier<?>> ax = Maps.newLinkedHashMap();
   private static final jr<jr<?>> ay = new jd<>(ake.a(ld.a), Lifecycle.stable());
   public static final iq<dur> a = a(ld.C, "step", dur::a);
   public static final ji<auy> b = a(ld.ag, $$0 -> auz.ns);
   public static final iq<elq> c = b(ld.z, "empty", $$0 -> els.a);
   public static final ji<bpv> d = a(ld.R, bpz::a);
   public static final iq<dcv> e = b(ld.f, "air", $$0 -> dcx.a);
   public static final ji<cxn> f = b(ld.u, $$0 -> cxq.x);
   public static final iq<bqr<?>> g = b(ld.v, "pig", $$0 -> bqr.ay);
   public static final iq<cry> h = b(ld.G, "air", $$0 -> csg.a);
   public static final ji<cua> i = a(ld.Y, cud::a);
   public static final ji<kv<?>> j = a(ld.T, $$0 -> kw.b);
   public static final ji<dnf<?>> k = b(ld.h, $$0 -> dnf.a);
   public static final iq<cgr> l = a(ld.S, "kebab", cgs::a);
   public static final ji<akf> m = a(ld.r, $$0 -> avj.E);
   public static final iq<dst> n = a(ld.o, "empty", $$0 -> dst.c);
   public static final ji<ekb<?>> o = a(ld.ac, $$0 -> ekb.a);
   public static final ji<ekp<?>> p = a(ld.ad, $$0 -> ekp.b);
   public static final ji<eju<?>> q = a(ld.X, $$0 -> eju.a);
   public static final ji<cop<?>> r = a(ld.Q, $$0 -> cop.i);
   public static final ji<cwl<?>> s = a(ld.aa, $$0 -> cwl.a);
   public static final ji<cwk<?>> t = a(ld.Z, $$0 -> cwk.b);
   public static final ji<bsg> u = a(ld.c, bsl::a);
   public static final ji<duw<?>> v = a(ld.W, $$0 -> duw.a);
   public static final ji<hw<?, ?>> w = a(ld.p, hx::a);
   public static final ji<avi<?>> x = a(ld.ah, $$0 -> avj.c);
   public static final iq<ckd> y = a(ld.ar, "plains", $$0 -> ckd.c);
   public static final iq<ckb> z = a(ld.aq, "none", $$0 -> ckb.b);
   public static final ji<cck> A = a(ld.V, ccl::a);
   public static final iq<cah<?>> B = a(ld.P, "dummy", $$0 -> cah.a);
   public static final iq<cbo<?>> C = a(ld.af, "dummy", $$0 -> cbo.a);
   public static final ji<cmc> D = a(ld.ae, $$0 -> cmc.c);
   public static final ji<cma> E = a(ld.b, $$0 -> cma.b);
   public static final ji<eou> F = a(ld.L, $$0 -> eor.b);
   public static final ji<epq> G = a(ld.I, $$0 -> epr.c);
   public static final ji<eri> H = a(ld.H, $$0 -> erj.b);
   public static final ji<esb> I = a(ld.K, $$0 -> esd.b);
   public static final ji<eru> J = a(ld.J, $$0 -> erw.c);
   public static final ji<esj> K = a(ld.M, $$0 -> esl.c);
   public static final ji<bnu<?>> L = a(ld.y, $$0 -> bnu.a);
   public static final ji<bnw<?>> M = a(ld.F, $$0 -> bnw.a);
   public static final ji<eeo<?>> N = a(ld.D, $$0 -> eeo.a);
   public static final ji<dwy<?>> O = a(ld.i, $$0 -> dwy.k);
   public static final ji<dxv<?>> P = a(ld.k, $$0 -> dxv.a);
   public static final ji<dyu<?>> Q = a(ld.w, $$0 -> dyu.I);
   public static final ji<ehe<?>> R = a(ld.aj, $$0 -> ehe.a);
   public static final ji<egx> S = a(ld.ai, $$0 -> egx.c);
   public static final ji<egp<?>> T = a(ld.an, $$0 -> egp.f);
   public static final ji<efo<?>> U = a(ld.U, $$0 -> efo.f);
   public static final ji<eda<?>> V = a(ld.j, $$0 -> eda.a);
   public static final ji<ecl<?>> W = a(ld.A, $$0 -> ecl.a);
   public static final ji<eed<?>> X = a(ld.ap, $$0 -> eed.a);
   public static final ji<ecx<?>> Y = a(ld.ab, $$0 -> ecx.a);
   public static final ji<edr<?>> Z = a(ld.ao, $$0 -> edr.b);
   public static final ji<eca<?>> aa = a(ld.x, $$0 -> eca.a);
   public static final ji<Codec<? extends dax>> ab = a(ld.e, day::a);
   public static final ji<Codec<? extends drv>> ac = a(ld.n, drx::a);
   public static final ji<Codec<? extends dwh.f>> ad = a(ld.N, dwh.f::a);
   public static final ji<Codec<? extends dwh.o>> ae = a(ld.O, dwh.o::a);
   public static final ji<Codec<? extends dvj>> af = a(ld.t, dvk::a);
   public static final ji<MapCodec<? extends dcv>> ag = a(ld.g, dcw::a);
   public static final ji<ekf<?>> ah = a(ld.am, $$0 -> ekf.e);
   public static final ji<eho<?>> ai = a(ld.ak, $$0 -> eho.d);
   public static final ji<Codec<? extends ehr>> aj = a(ld.al, ehs::a);
   public static final ji<ccx> ak = a(ld.l, ccx::a);
   public static final ji<cde> al = a(ld.B, $$0 -> cde.a);
   public static final ji<crv> am = a(ld.E, crx::a);
   public static final ji<String> an = a(ld.as, dnu::a);
   public static final ji<cqo> ao = a(ld.q, cqp::a);
   public static final ji<ap<?>> ap = a(ld.aM, am::a);
   public static final ji<yj<?>> aq = a(ld.at, yk::a);
   public static final ji<cpt> ar = a(ld.au, cpu::a);
   public static final ji<jy<?>> as = a(ld.av, jz::a);
   public static final ji<MapCodec<? extends bs>> at = a(ld.aw, bt::a);
   public static final ji<ch.a<?>> au = a(ld.ax, ci::a);
   public static final ji<? extends ji<?>> av = ay;

   private static <T> ji<T> a(ake<? extends ji<T>> $$0, lc.a<T> $$1) {
      return a($$0, new jd<>($$0, Lifecycle.stable(), false), $$1);
   }

   private static <T> ji<T> b(ake<? extends ji<T>> $$0, lc.a<T> $$1) {
      return a($$0, new jd<>($$0, Lifecycle.stable(), true), $$1);
   }

   private static <T> iq<T> a(ake<? extends ji<T>> $$0, String $$1, lc.a<T> $$2) {
      return a($$0, new ip<>($$1, $$0, Lifecycle.stable(), false), $$2);
   }

   private static <T> iq<T> b(ake<? extends ji<T>> $$0, String $$1, lc.a<T> $$2) {
      return a($$0, new ip<>($$1, $$0, Lifecycle.stable(), true), $$2);
   }

   private static <T, R extends jr<T>> R a(ake<? extends ji<T>> $$0, R $$1, lc.a<T> $$2) {
      akh.a(() -> "registry " + $$0);
      akf $$3 = $$0.a();
      ax.put($$3, () -> $$2.run($$1));
      ay.a((ake<jr<?>>)$$0, $$1, jh.a);
      return $$1;
   }

   public static void a() {
      b();
      c();
      a(av);
   }

   private static void b() {
      ax.forEach(($$0, $$1) -> {
         if ($$1.get() == null) {
            aw.error("Unable to bootstrap registry '{}'", $$0);
         }
      });
   }

   private static void c() {
      av.l();

      for (ji<?> $$0 : av) {
         $$0.l();
      }
   }

   private static <T extends ji<?>> void a(ji<T> $$0) {
      $$0.forEach($$1 -> {
         if ($$1.e().isEmpty()) {
            ac.a("Registry '" + $$0.b((T)$$1) + "' was empty after loading");
         }

         if ($$1 instanceof iq) {
            akf $$2 = ((iq)$$1).a();
            Validate.notNull($$1.a($$2), "Missing default of DefaultedMappedRegistry: " + $$2, new Object[0]);
         }
      });
   }

   @FunctionalInterface
   interface a<T> {
      Object run(ji<T> var1);
   }
}
