import com.google.common.collect.Maps;
import com.mojang.logging.LogUtils;
import com.mojang.serialization.Lifecycle;
import com.mojang.serialization.MapCodec;
import java.util.Map;
import java.util.function.Consumer;
import java.util.function.Supplier;
import org.apache.commons.lang3.Validate;
import org.slf4j.Logger;

public class mf {
   private static final Logger aG = LogUtils.getLogger();
   private static final Map<ale, Supplier<?>> aH = Maps.newLinkedHashMap();
   private static final ka<ka<?>> aI = new jm<>(ald.a(mg.a), Lifecycle.stable());
   public static final iz<eeo> a = a(mg.H, "step", eeo::a);
   public static final jr<awk> b = a(mg.ap, $$0 -> awl.of);
   public static final iz<evu> c = b(mg.F, "empty", $$0 -> evw.a);
   public static final jr<bvc> d = a(mg.W, bvg::a);
   public static final iz<dlu> e = b(mg.i, "air", $$0 -> dlw.a);
   public static final iz<bwj<?>> f = b(mg.B, "pig", $$0 -> bwj.aQ);
   public static final iz<cyo> g = b(mg.K, "air", $$0 -> cyw.a);
   public static final jr<dam> h = a(mg.ae, dap::a);
   public static final jr<lw<?>> i = a(mg.Y, $$0 -> lx.b);
   public static final jr<dwp<?>> j = b(mg.e, $$0 -> dwp.a);
   public static final jr<ale> k = a(mg.p, $$0 -> awv.E);
   public static final iz<ecm> l = a(mg.l, "empty", $$0 -> ecm.c);
   public static final jr<euf<?>> m = a(mg.al, $$0 -> euf.a);
   public static final jr<eut<?>> n = a(mg.ak, $$0 -> eut.b);
   public static final jr<ety<?>> o = a(mg.ad, $$0 -> ety.a);
   public static final jr<cvt<?>> p = a(mg.V, $$0 -> cvt.i);
   public static final jr<ddu<?>> q = a(mg.ai, $$0 -> ddu.a);
   public static final jr<ddt<?>> r = a(mg.ah, $$0 -> ddt.b);
   public static final jr<bya> s = a(mg.c, byf::a);
   public static final jr<eet<?>> t = a(mg.ac, $$0 -> eet.a);
   public static final jr<ie<?, ?>> u = a(mg.m, ig::a);
   public static final jr<awu<?>> v = a(mg.ar, $$0 -> awv.c);
   public static final iz<cqj> w = a(mg.aE, "plains", cqj::a);
   public static final iz<cqh> x = a(mg.aD, "none", cqh::a);
   public static final jr<cie> y = a(mg.aa, cif::a);
   public static final iz<cgb<?>> z = a(mg.U, "dummy", $$0 -> cgb.a);
   public static final iz<chi<?>> A = a(mg.an, "dummy", $$0 -> chi.a);
   public static final jr<csn> B = a(mg.am, $$0 -> csn.c);
   public static final jr<csl> C = a(mg.b, $$0 -> csl.b);
   public static final jr<eze> D = a(mg.P, $$0 -> ezb.b);
   public static final jr<fac<?>> E = a(mg.M, $$0 -> fad.e);
   public static final jr<fbx> F = a(mg.L, $$0 -> fby.a);
   public static final jr<fcr> G = a(mg.O, $$0 -> fct.b);
   public static final jr<fcj> H = a(mg.N, $$0 -> fcl.c);
   public static final jr<fda> I = a(mg.Q, $$0 -> fdc.c);
   public static final jr<btc<?>> J = a(mg.E, $$0 -> btc.a);
   public static final jr<bte<?>> K = a(mg.J, $$0 -> bte.a);
   public static final jr<eoq<?>> L = a(mg.I, $$0 -> eoq.a);
   public static final jr<egv<?>> M = a(mg.f, $$0 -> egv.k);
   public static final jr<eht<?>> N = a(mg.j, $$0 -> eht.a);
   public static final jr<eit<?>> O = a(mg.D, $$0 -> eit.I);
   public static final jr<erg<?>> P = a(mg.at, $$0 -> erg.a);
   public static final jr<eqz> Q = a(mg.as, $$0 -> eqz.c);
   public static final jr<eqr<?>> R = a(mg.aw, $$0 -> eqr.f);
   public static final jr<epq<?>> S = a(mg.Z, $$0 -> epq.f);
   public static final jr<emz<?>> T = a(mg.g, $$0 -> emz.a);
   public static final jr<emk<?>> U = a(mg.G, $$0 -> emk.a);
   public static final jr<eof<?>> V = a(mg.aC, $$0 -> eof.a);
   public static final jr<emw<?>> W = a(mg.aj, $$0 -> emw.a);
   public static final jr<ent<?>> X = a(mg.aB, $$0 -> ent.b);
   public static final jr<elz<?>> Y = a(mg.C, $$0 -> elz.a);
   public static final jr<MapCodec<? extends djw>> Z = a(mg.d, djx::a);
   public static final jr<MapCodec<? extends ebm>> aa = a(mg.k, ebo::a);
   public static final jr<MapCodec<? extends ege.f>> ab = a(mg.S, ege.f::a);
   public static final jr<MapCodec<? extends ege.o>> ac = a(mg.T, ege.o::a);
   public static final jr<MapCodec<? extends efg>> ad = a(mg.t, efh::a);
   public static final jr<MapCodec<? extends dlu>> ae = a(mg.h, dlv::a);
   public static final jr<euj<?>> af = a(mg.av, $$0 -> euj.e);
   public static final jr<err<?>> ag = a(mg.au, $$0 -> err.d);
   public static final jr<MapCodec<? extends eru>> ah = a(mg.ab, erv::a);
   public static final jr<dxg> ai = a(mg.s, dxh::a);
   public static final jr<cxj> aj = a(mg.o, cxk::a);
   public static final jr<as<?>> ak = a(mg.bh, ap::a);
   public static final jr<yn<?>> al = a(mg.X, yo::a);
   public static final jr<ki<?>> am = a(mg.r, kj::a);
   public static final jr<MapCodec<? extends by>> an = a(mg.A, bz::a);
   public static final jr<ks.b<?>> ao = a(mg.q, kt::a);
   public static final jr<exk> ap = a(mg.R, exl::a);
   public static final jr<ki<?>> aq = a(mg.u, dfg::a);
   public static final jr<MapCodec<? extends dfm>> ar = a(mg.w, dfm::a);
   public static final jr<MapCodec<? extends dfw>> as = a(mg.v, dfw::a);
   public static final jr<MapCodec<? extends dfx>> at = a(mg.x, dfx::b);
   public static final jr<MapCodec<? extends dfy>> au = a(mg.z, dfy::a);
   public static final jr<MapCodec<? extends dgn>> av = a(mg.y, dgo::a);
   public static final jr<dcg.a<?>> aw = a(mg.n, $$0 -> dcg.a.a);
   public static final jr<dep.a<?>> ax = a(mg.ag, des::a);
   public static final jr<dev.i<?>> ay = a(mg.ao, dex::a);
   public static final jr<ddm> az = a(mg.af, ddl::a);
   public static final jr<arv> aA = a(mg.aA, $$0 -> arv.i);
   public static final jr<MapCodec<? extends tk>> aB = a(mg.ax, tk::a);
   public static final jr<MapCodec<? extends sq>> aC = a(mg.az, sq::a);
   public static final jr<MapCodec<? extends csv>> aD = a(mg.aq, csw::a);
   public static final jr<Consumer<so>> aE = a(mg.ay, sd::a);
   public static final jr<? extends jr<?>> aF = aI;

   private static <T> jr<T> a(ald<? extends jr<T>> $$0, mf.a<T> $$1) {
      return a($$0, new jm<>($$0, Lifecycle.stable(), false), $$1);
   }

   private static <T> jr<T> b(ald<? extends jr<T>> $$0, mf.a<T> $$1) {
      return a($$0, new jm<>($$0, Lifecycle.stable(), true), $$1);
   }

   private static <T> iz<T> a(ald<? extends jr<T>> $$0, String $$1, mf.a<T> $$2) {
      return a($$0, new iy<>($$1, $$0, Lifecycle.stable(), false), $$2);
   }

   private static <T> iz<T> b(ald<? extends jr<T>> $$0, String $$1, mf.a<T> $$2) {
      return a($$0, new iy<>($$1, $$0, Lifecycle.stable(), true), $$2);
   }

   private static <T, R extends ka<T>> R a(ald<? extends jr<T>> $$0, R $$1, mf.a<T> $$2) {
      alg.a(() -> "registry " + $$0.a());
      ale $$3 = $$0.a();
      aH.put($$3, () -> $$2.run($$1));
      aI.a((ald<ka<?>>)$$0, $$1, jq.a);
      return $$1;
   }

   public static void a() {
      b();
      c();
      b(aF);
   }

   private static void b() {
      aH.forEach(($$0, $$1) -> {
         if ($$1.get() == null) {
            aG.error("Unable to bootstrap registry '{}'", $$0);
         }
      });
   }

   private static void c() {
      aF.n();

      for (jr<?> $$0 : aF) {
         c($$0);
         $$0.n();
      }
   }

   private static <T extends jr<?>> void b(jr<T> $$0) {
      $$0.forEach($$1 -> {
         if ($$1.i().isEmpty()) {
            af.b("Registry '" + $$0.b((T)$$1) + "' was empty after loading");
         }

         if ($$1 instanceof iz) {
            ale $$2 = ((iz)$$1).b();
            Validate.notNull($$1.a($$2), "Missing default of DefaultedMappedRegistry: " + $$2, new Object[0]);
         }
      });
   }

   public static <T> jf<T> a(jr<T> $$0) {
      return ((ka)$$0).p();
   }

   private static void c(jr<?> $$0) {
      ((jm)$$0).o();
   }

   @FunctionalInterface
   interface a<T> {
      Object run(jr<T> var1);
   }
}
