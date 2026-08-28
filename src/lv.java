import com.google.common.collect.Maps;
import com.mojang.logging.LogUtils;
import com.mojang.serialization.Lifecycle;
import com.mojang.serialization.MapCodec;
import java.util.Map;
import java.util.function.Supplier;
import org.apache.commons.lang3.Validate;
import org.slf4j.Logger;

public class lv {
   private static final Logger aB = LogUtils.getLogger();
   private static final Map<ale, Supplier<?>> aC = Maps.newLinkedHashMap();
   private static final kk<kk<?>> aD = new jw<>(ald.a(lw.a), Lifecycle.stable());
   public static final jj<dzp> a = a(lw.G, "step", dzp::a);
   public static final kb<awf> b = a(lw.al, $$0 -> awg.nD);
   public static final jj<eqs> c = b(lw.D, "empty", $$0 -> equ.a);
   public static final kb<bsw> d = a(lw.W, bta::a);
   public static final jj<dhm> e = b(lw.f, "air", $$0 -> dho.a);
   public static final jj<bty<?>> f = b(lw.z, "pig", $$0 -> bty.az);
   public static final jj<cvn> g = b(lw.K, "air", $$0 -> cvw.a);
   public static final kb<cxp> h = a(lw.ad, cxs::a);
   public static final kb<ln<?>> i = a(lw.Y, $$0 -> lo.b);
   public static final kb<drx<?>> j = b(lw.h, $$0 -> drx.a);
   public static final kb<ale> k = a(lw.r, $$0 -> awq.E);
   public static final jj<dxp> l = a(lw.o, "empty", $$0 -> dxp.c);
   public static final kb<epd<?>> m = a(lw.ah, $$0 -> epd.a);
   public static final kb<epr<?>> n = a(lw.ai, $$0 -> epr.b);
   public static final kb<eow<?>> o = a(lw.ac, $$0 -> eow.a);
   public static final kb<csi<?>> p = a(lw.V, $$0 -> csi.i);
   public static final kb<daq<?>> q = a(lw.af, $$0 -> daq.a);
   public static final kb<dap<?>> r = a(lw.ae, $$0 -> dap.b);
   public static final kb<bvp> s = a(lw.c, bvu::a);
   public static final kb<dzu<?>> t = a(lw.ab, $$0 -> dzu.a);
   public static final kb<iq<?, ?>> u = a(lw.p, ir::a);
   public static final kb<awp<?>> v = a(lw.am, $$0 -> awq.c);
   public static final jj<cnp> w = a(lw.aw, "plains", $$0 -> cnp.c);
   public static final jj<cnn> x = a(lw.av, "none", $$0 -> cnn.b);
   public static final kb<cft> y = a(lw.aa, cfu::a);
   public static final jj<cdq<?>> z = a(lw.U, "dummy", $$0 -> cdq.a);
   public static final jj<cex<?>> A = a(lw.ak, "dummy", $$0 -> cex.a);
   public static final kb<cpr> B = a(lw.aj, $$0 -> cpr.c);
   public static final kb<cpp> C = a(lw.b, $$0 -> cpp.b);
   public static final kb<euc> D = a(lw.Q, $$0 -> etz.b);
   public static final kb<eva<?>> E = a(lw.N, $$0 -> evb.e);
   public static final kb<ewx> F = a(lw.M, $$0 -> ewy.a);
   public static final kb<exr> G = a(lw.P, $$0 -> ext.b);
   public static final kb<exj> H = a(lw.O, $$0 -> exl.c);
   public static final kb<eya> I = a(lw.R, $$0 -> eyc.c);
   public static final kb<bqw<?>> J = a(lw.C, $$0 -> bqw.a);
   public static final kb<bqy<?>> K = a(lw.J, $$0 -> bqy.a);
   public static final kb<ejo<?>> L = a(lw.H, $$0 -> ejo.a);
   public static final kb<ebw<?>> M = a(lw.i, $$0 -> ebw.k);
   public static final kb<ecu<?>> N = a(lw.k, $$0 -> ecu.a);
   public static final kb<edu<?>> O = a(lw.A, $$0 -> edu.I);
   public static final kb<eme<?>> P = a(lw.ao, $$0 -> eme.a);
   public static final kb<elx> Q = a(lw.an, $$0 -> elx.c);
   public static final kb<elp<?>> R = a(lw.as, $$0 -> elp.f);
   public static final kb<eko<?>> S = a(lw.Z, $$0 -> eko.f);
   public static final kb<eia<?>> T = a(lw.j, $$0 -> eia.a);
   public static final kb<ehl<?>> U = a(lw.E, $$0 -> ehl.a);
   public static final kb<ejd<?>> V = a(lw.au, $$0 -> ejd.a);
   public static final kb<ehx<?>> W = a(lw.ag, $$0 -> ehx.a);
   public static final kb<eir<?>> X = a(lw.at, $$0 -> eir.b);
   public static final kb<eha<?>> Y = a(lw.B, $$0 -> eha.a);
   public static final kb<MapCodec<? extends dfo>> Z = a(lw.e, dfp::a);
   public static final kb<MapCodec<? extends dwp>> aa = a(lw.n, dwr::a);
   public static final kb<MapCodec<? extends ebf.f>> ab = a(lw.S, ebf.f::a);
   public static final kb<MapCodec<? extends ebf.o>> ac = a(lw.T, ebf.o::a);
   public static final kb<MapCodec<? extends eah>> ad = a(lw.t, eai::a);
   public static final kb<MapCodec<? extends dhm>> ae = a(lw.g, dhn::a);
   public static final kb<eph<?>> af = a(lw.ar, $$0 -> eph.e);
   public static final kb<emp<?>> ag = a(lw.ap, $$0 -> emp.d);
   public static final kb<MapCodec<? extends ems>> ah = a(lw.aq, emt::a);
   public static final kb<cgh> ai = a(lw.l, cgh::a);
   public static final kb<cgo> aj = a(lw.F, cgo::a);
   public static final kb<dsm> ak = a(lw.ax, dsn::a);
   public static final kb<cue> al = a(lw.q, cuf::a);
   public static final kb<aq<?>> am = a(lw.aX, an::a);
   public static final kb<yv<?>> an = a(lw.ay, yw::a);
   public static final kb<ctm> ao = a(lw.az, ctn::a);
   public static final kb<kr<?>> ap = a(lw.aA, ks::a);
   public static final kb<MapCodec<? extends bw>> aq = a(lw.aB, bx::a);
   public static final kb<ct.a<?>> ar = a(lw.aC, cu::a);
   public static final kb<esi> as = a(lw.aD, esj::a);
   public static final kb<kr<?>> at = a(lw.aE, dbo::a);
   public static final kb<MapCodec<? extends dbu>> au = a(lw.v, dbu::a);
   public static final kb<MapCodec<? extends dce>> av = a(lw.u, dce::a);
   public static final kb<MapCodec<? extends dcf>> aw = a(lw.w, dcf::b);
   public static final kb<MapCodec<? extends dcg>> ax = a(lw.y, dcg::a);
   public static final kb<MapCodec<? extends dcv>> ay = a(lw.x, dcw::a);
   public static final kb<czi.a<?>> az = a(lw.aF, $$0 -> czi.a.a);
   public static final kb<? extends kb<?>> aA = aD;

   private static <T> kb<T> a(ald<? extends kb<T>> $$0, lv.a<T> $$1) {
      return a($$0, new jw<>($$0, Lifecycle.stable(), false), $$1);
   }

   private static <T> kb<T> b(ald<? extends kb<T>> $$0, lv.a<T> $$1) {
      return a($$0, new jw<>($$0, Lifecycle.stable(), true), $$1);
   }

   private static <T> jj<T> a(ald<? extends kb<T>> $$0, String $$1, lv.a<T> $$2) {
      return a($$0, new ji<>($$1, $$0, Lifecycle.stable(), false), $$2);
   }

   private static <T> jj<T> b(ald<? extends kb<T>> $$0, String $$1, lv.a<T> $$2) {
      return a($$0, new ji<>($$1, $$0, Lifecycle.stable(), true), $$2);
   }

   private static <T, R extends kk<T>> R a(ald<? extends kb<T>> $$0, R $$1, lv.a<T> $$2) {
      alg.a(() -> "registry " + $$0);
      ale $$3 = $$0.a();
      aC.put($$3, () -> $$2.run($$1));
      aD.a((ald<kk<?>>)$$0, $$1, ka.a);
      return $$1;
   }

   public static void a() {
      b();
      c();
      b(aA);
   }

   private static void b() {
      aC.forEach(($$0, $$1) -> {
         if ($$1.get() == null) {
            aB.error("Unable to bootstrap registry '{}'", $$0);
         }
      });
   }

   private static void c() {
      aA.n();

      for (kb<?> $$0 : aA) {
         c($$0);
         $$0.n();
      }
   }

   private static <T extends kb<?>> void b(kb<T> $$0) {
      $$0.forEach($$1 -> {
         if ($$1.i().isEmpty()) {
            ad.b("Registry '" + $$0.b((T)$$1) + "' was empty after loading");
         }

         if ($$1 instanceof jj) {
            ale $$2 = ((jj)$$1).b();
            Validate.notNull($$1.a($$2), "Missing default of DefaultedMappedRegistry: " + $$2, new Object[0]);
         }
      });
   }

   public static <T> jp<T> a(kb<T> $$0) {
      return ((kk)$$0).p();
   }

   private static void c(kb<?> $$0) {
      ((jw)$$0).o();
   }

   @FunctionalInterface
   interface a<T> {
      Object run(kb<T> var1);
   }
}
