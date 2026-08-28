import com.google.common.collect.Maps;
import com.mojang.logging.LogUtils;
import com.mojang.serialization.Lifecycle;
import com.mojang.serialization.MapCodec;
import java.util.Map;
import java.util.function.Supplier;
import org.apache.commons.lang3.Validate;
import org.slf4j.Logger;

public class lx {
   private static final Logger aA = LogUtils.getLogger();
   private static final Map<alh, Supplier<?>> aB = Maps.newLinkedHashMap();
   private static final kl<kl<?>> aC = new jx<>(alg.a(ly.a), Lifecycle.stable());
   public static final jk<eaa> a = a(ly.G, "step", eaa::a);
   public static final kc<awj> b = a(ly.al, $$0 -> awk.nB);
   public static final jk<erd> c = b(ly.D, "empty", $$0 -> erf.a);
   public static final kc<btc> d = a(ly.W, btg::a);
   public static final jk<dhy> e = b(ly.f, "air", $$0 -> dia.a);
   public static final jk<bug<?>> f = b(ly.z, "pig", $$0 -> bug.az);
   public static final jk<cvt> g = b(ly.K, "air", $$0 -> cwb.a);
   public static final kc<cxu> h = a(ly.ad, cxx::a);
   public static final kc<lp<?>> i = a(ly.Y, $$0 -> lq.b);
   public static final kc<dsi<?>> j = b(ly.h, $$0 -> dsi.a);
   public static final kc<alh> k = a(ly.r, $$0 -> awu.E);
   public static final jk<dya> l = a(ly.o, "empty", $$0 -> dya.c);
   public static final kc<epo<?>> m = a(ly.ah, $$0 -> epo.a);
   public static final kc<eqc<?>> n = a(ly.ai, $$0 -> eqc.b);
   public static final kc<eph<?>> o = a(ly.ac, $$0 -> eph.a);
   public static final kc<css<?>> p = a(ly.V, $$0 -> css.i);
   public static final kc<dap<?>> q = a(ly.af, $$0 -> dap.a);
   public static final kc<dao<?>> r = a(ly.ae, $$0 -> dao.b);
   public static final kc<bvy> s = a(ly.c, bwd::a);
   public static final kc<eaf<?>> t = a(ly.ab, $$0 -> eaf.a);
   public static final kc<ir<?, ?>> u = a(ly.p, is::a);
   public static final kc<awt<?>> v = a(ly.am, $$0 -> awu.c);
   public static final jk<cny> w = a(ly.aw, "plains", $$0 -> cny.c);
   public static final jk<cnw> x = a(ly.av, "none", $$0 -> cnw.b);
   public static final kc<cgc> y = a(ly.aa, cgd::a);
   public static final jk<cdz<?>> z = a(ly.U, "dummy", $$0 -> cdz.a);
   public static final jk<cfg<?>> A = a(ly.ak, "dummy", $$0 -> cfg.a);
   public static final kc<cqb> B = a(ly.aj, $$0 -> cqb.c);
   public static final kc<cpz> C = a(ly.b, $$0 -> cpz.b);
   public static final kc<eun> D = a(ly.Q, $$0 -> euk.b);
   public static final kc<evl<?>> E = a(ly.N, $$0 -> evm.e);
   public static final kc<exi> F = a(ly.M, $$0 -> exj.a);
   public static final kc<eyc> G = a(ly.P, $$0 -> eye.b);
   public static final kc<exu> H = a(ly.O, $$0 -> exw.c);
   public static final kc<eyl> I = a(ly.R, $$0 -> eyn.c);
   public static final kc<brc<?>> J = a(ly.C, $$0 -> brc.a);
   public static final kc<bre<?>> K = a(ly.J, $$0 -> bre.a);
   public static final kc<ejz<?>> L = a(ly.H, $$0 -> ejz.a);
   public static final kc<ech<?>> M = a(ly.i, $$0 -> ech.k);
   public static final kc<edf<?>> N = a(ly.k, $$0 -> edf.a);
   public static final kc<eef<?>> O = a(ly.A, $$0 -> eef.I);
   public static final kc<emp<?>> P = a(ly.ao, $$0 -> emp.a);
   public static final kc<emi> Q = a(ly.an, $$0 -> emi.c);
   public static final kc<ema<?>> R = a(ly.as, $$0 -> ema.f);
   public static final kc<ekz<?>> S = a(ly.Z, $$0 -> ekz.f);
   public static final kc<eil<?>> T = a(ly.j, $$0 -> eil.a);
   public static final kc<ehw<?>> U = a(ly.E, $$0 -> ehw.a);
   public static final kc<ejo<?>> V = a(ly.au, $$0 -> ejo.a);
   public static final kc<eii<?>> W = a(ly.ag, $$0 -> eii.a);
   public static final kc<ejc<?>> X = a(ly.at, $$0 -> ejc.b);
   public static final kc<ehl<?>> Y = a(ly.B, $$0 -> ehl.a);
   public static final kc<MapCodec<? extends dga>> Z = a(ly.e, dgb::a);
   public static final kc<MapCodec<? extends dxa>> aa = a(ly.n, dxc::a);
   public static final kc<MapCodec<? extends ebq.f>> ab = a(ly.S, ebq.f::a);
   public static final kc<MapCodec<? extends ebq.o>> ac = a(ly.T, ebq.o::a);
   public static final kc<MapCodec<? extends eas>> ad = a(ly.t, eat::a);
   public static final kc<MapCodec<? extends dhy>> ae = a(ly.g, dhz::a);
   public static final kc<eps<?>> af = a(ly.ar, $$0 -> eps.e);
   public static final kc<ena<?>> ag = a(ly.ap, $$0 -> ena.d);
   public static final kc<MapCodec<? extends end>> ah = a(ly.aq, ene::a);
   public static final kc<cgq> ai = a(ly.l, cgq::a);
   public static final kc<cgx> aj = a(ly.F, cgx::a);
   public static final kc<dsx> ak = a(ly.ax, dsy::a);
   public static final kc<cum> al = a(ly.q, cun::a);
   public static final kc<aq<?>> am = a(ly.aW, an::a);
   public static final kc<yy<?>> an = a(ly.ay, yz::a);
   public static final kc<ks<?>> ao = a(ly.az, kt::a);
   public static final kc<MapCodec<? extends bw>> ap = a(ly.aA, bx::a);
   public static final kc<cu.a<?>> aq = a(ly.aB, cv::a);
   public static final kc<est> ar = a(ly.aC, esu::a);
   public static final kc<ks<?>> as = a(ly.aD, dbn::a);
   public static final kc<MapCodec<? extends dbt>> at = a(ly.v, dbt::a);
   public static final kc<MapCodec<? extends dcd>> au = a(ly.u, dcd::a);
   public static final kc<MapCodec<? extends dce>> av = a(ly.w, dce::b);
   public static final kc<MapCodec<? extends dcf>> aw = a(ly.y, dcf::a);
   public static final kc<MapCodec<? extends dcu>> ax = a(ly.x, dcv::a);
   public static final kc<czh.a<?>> ay = a(ly.aE, $$0 -> czh.a.a);
   public static final kc<? extends kc<?>> az = aC;

   private static <T> kc<T> a(alg<? extends kc<T>> $$0, lx.a<T> $$1) {
      return a($$0, new jx<>($$0, Lifecycle.stable(), false), $$1);
   }

   private static <T> kc<T> b(alg<? extends kc<T>> $$0, lx.a<T> $$1) {
      return a($$0, new jx<>($$0, Lifecycle.stable(), true), $$1);
   }

   private static <T> jk<T> a(alg<? extends kc<T>> $$0, String $$1, lx.a<T> $$2) {
      return a($$0, new jj<>($$1, $$0, Lifecycle.stable(), false), $$2);
   }

   private static <T> jk<T> b(alg<? extends kc<T>> $$0, String $$1, lx.a<T> $$2) {
      return a($$0, new jj<>($$1, $$0, Lifecycle.stable(), true), $$2);
   }

   private static <T, R extends kl<T>> R a(alg<? extends kc<T>> $$0, R $$1, lx.a<T> $$2) {
      alj.a(() -> "registry " + $$0);
      alh $$3 = $$0.a();
      aB.put($$3, () -> $$2.run($$1));
      aC.a((alg<kl<?>>)$$0, $$1, kb.a);
      return $$1;
   }

   public static void a() {
      b();
      c();
      b(az);
   }

   private static void b() {
      aB.forEach(($$0, $$1) -> {
         if ($$1.get() == null) {
            aA.error("Unable to bootstrap registry '{}'", $$0);
         }
      });
   }

   private static void c() {
      az.n();

      for (kc<?> $$0 : az) {
         c($$0);
         $$0.n();
      }
   }

   private static <T extends kc<?>> void b(kc<T> $$0) {
      $$0.forEach($$1 -> {
         if ($$1.i().isEmpty()) {
            ad.b("Registry '" + $$0.b((T)$$1) + "' was empty after loading");
         }

         if ($$1 instanceof jk) {
            alh $$2 = ((jk)$$1).b();
            Validate.notNull($$1.a($$2), "Missing default of DefaultedMappedRegistry: " + $$2, new Object[0]);
         }
      });
   }

   public static <T> jq<T> a(kc<T> $$0) {
      return ((kl)$$0).p();
   }

   private static void c(kc<?> $$0) {
      ((jx)$$0).o();
   }

   @FunctionalInterface
   interface a<T> {
      Object run(kc<T> var1);
   }
}
