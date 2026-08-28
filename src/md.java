import com.google.common.collect.Maps;
import com.mojang.logging.LogUtils;
import com.mojang.serialization.Lifecycle;
import com.mojang.serialization.MapCodec;
import java.util.Map;
import java.util.function.Consumer;
import java.util.function.Supplier;
import org.apache.commons.lang3.Validate;
import org.slf4j.Logger;

public class md {
   private static final Logger aH = LogUtils.getLogger();
   private static final Map<ald, Supplier<?>> aI = Maps.newLinkedHashMap();
   private static final ko<ko<?>> aJ = new ka<>(alc.a(me.a), Lifecycle.stable());
   public static final jn<edm> a = a(me.G, "step", edm::a);
   public static final kf<awj> b = a(me.al, $$0 -> awk.of);
   public static final jn<eus> c = b(me.D, "empty", $$0 -> euu.a);
   public static final kf<buu> d = a(me.W, buy::a);
   public static final jn<dku> e = b(me.f, "air", $$0 -> dkw.a);
   public static final jn<bwb<?>> f = b(me.z, "pig", $$0 -> bwb.aQ);
   public static final jn<cxu> g = b(me.K, "air", $$0 -> cyc.a);
   public static final kf<czs> h = a(me.ad, czv::a);
   public static final kf<lu<?>> i = a(me.Y, $$0 -> lv.b);
   public static final kf<dvn<?>> j = b(me.h, $$0 -> dvn.a);
   public static final kf<ald> k = a(me.r, $$0 -> awu.E);
   public static final jn<ebk> l = a(me.o, "empty", $$0 -> ebk.c);
   public static final kf<etd<?>> m = a(me.ah, $$0 -> etd.a);
   public static final kf<etr<?>> n = a(me.ai, $$0 -> etr.b);
   public static final kf<esw<?>> o = a(me.ac, $$0 -> esw.a);
   public static final kf<cuw<?>> p = a(me.V, $$0 -> cuw.i);
   public static final kf<dcw<?>> q = a(me.af, $$0 -> dcw.a);
   public static final kf<dcv<?>> r = a(me.ae, $$0 -> dcv.b);
   public static final kf<bxs> s = a(me.c, bxx::a);
   public static final kf<edr<?>> t = a(me.ab, $$0 -> edr.a);
   public static final kf<iu<?, ?>> u = a(me.p, iv::a);
   public static final kf<awt<?>> v = a(me.am, $$0 -> awu.c);
   public static final jn<cpz> w = a(me.aw, "plains", cpz::a);
   public static final jn<cpx> x = a(me.av, "none", cpx::a);
   public static final kf<chw> y = a(me.aa, chx::a);
   public static final jn<cft<?>> z = a(me.U, "dummy", $$0 -> cft.a);
   public static final jn<cha<?>> A = a(me.ak, "dummy", $$0 -> cha.a);
   public static final kf<csb> B = a(me.aj, $$0 -> csb.c);
   public static final kf<crz> C = a(me.b, $$0 -> crz.b);
   public static final kf<eyc> D = a(me.Q, $$0 -> exz.b);
   public static final kf<eza<?>> E = a(me.N, $$0 -> ezb.e);
   public static final kf<fav> F = a(me.M, $$0 -> faw.a);
   public static final kf<fbp> G = a(me.P, $$0 -> fbr.b);
   public static final kf<fbh> H = a(me.O, $$0 -> fbj.c);
   public static final kf<fby> I = a(me.R, $$0 -> fca.c);
   public static final kf<bsu<?>> J = a(me.C, $$0 -> bsu.a);
   public static final kf<bsw<?>> K = a(me.J, $$0 -> bsw.a);
   public static final kf<eno<?>> L = a(me.H, $$0 -> eno.a);
   public static final kf<eft<?>> M = a(me.i, $$0 -> eft.k);
   public static final kf<egr<?>> N = a(me.k, $$0 -> egr.a);
   public static final kf<ehr<?>> O = a(me.A, $$0 -> ehr.I);
   public static final kf<eqe<?>> P = a(me.ao, $$0 -> eqe.a);
   public static final kf<epx> Q = a(me.an, $$0 -> epx.c);
   public static final kf<epp<?>> R = a(me.as, $$0 -> epp.f);
   public static final kf<eoo<?>> S = a(me.Z, $$0 -> eoo.f);
   public static final kf<elx<?>> T = a(me.j, $$0 -> elx.a);
   public static final kf<eli<?>> U = a(me.E, $$0 -> eli.a);
   public static final kf<end<?>> V = a(me.au, $$0 -> end.a);
   public static final kf<elu<?>> W = a(me.ag, $$0 -> elu.a);
   public static final kf<emr<?>> X = a(me.at, $$0 -> emr.b);
   public static final kf<ekx<?>> Y = a(me.B, $$0 -> ekx.a);
   public static final kf<MapCodec<? extends diw>> Z = a(me.e, dix::a);
   public static final kf<MapCodec<? extends eak>> aa = a(me.n, eam::a);
   public static final kf<MapCodec<? extends efc.f>> ab = a(me.S, efc.f::a);
   public static final kf<MapCodec<? extends efc.o>> ac = a(me.T, efc.o::a);
   public static final kf<MapCodec<? extends eee>> ad = a(me.t, eef::a);
   public static final kf<MapCodec<? extends dku>> ae = a(me.g, dkv::a);
   public static final kf<eth<?>> af = a(me.ar, $$0 -> eth.e);
   public static final kf<eqp<?>> ag = a(me.ap, $$0 -> eqp.d);
   public static final kf<MapCodec<? extends eqs>> ah = a(me.aq, eqt::a);
   public static final kf<cik> ai = a(me.l, cik::a);
   public static final kf<cir> aj = a(me.F, cir::a);
   public static final kf<dwe> ak = a(me.ax, dwf::a);
   public static final kf<cwo> al = a(me.q, cwp::a);
   public static final kf<as<?>> am = a(me.bd, ap::a);
   public static final kf<ym<?>> an = a(me.ay, yn::a);
   public static final kf<kw<?>> ao = a(me.az, kx::a);
   public static final kf<MapCodec<? extends by>> ap = a(me.aA, bz::a);
   public static final kf<cw.a<?>> aq = a(me.aB, cx::a);
   public static final kf<ewi> ar = a(me.aC, ewj::a);
   public static final kf<kw<?>> as = a(me.aD, dei::a);
   public static final kf<MapCodec<? extends deo>> at = a(me.v, deo::a);
   public static final kf<MapCodec<? extends dey>> au = a(me.u, dey::a);
   public static final kf<MapCodec<? extends dez>> av = a(me.w, dez::b);
   public static final kf<MapCodec<? extends dfa>> aw = a(me.y, dfa::a);
   public static final kf<MapCodec<? extends dfp>> ax = a(me.x, dfq::a);
   public static final kf<dbi.a<?>> ay = a(me.aE, $$0 -> dbi.a.a);
   public static final kf<ddr.a<?>> az = a(me.aF, ddu::a);
   public static final kf<ddx.i<?>> aA = a(me.aG, ddz::a);
   public static final kf<dco> aB = a(me.aH, dcn::a);
   public static final kf<aru> aC = a(me.aI, $$0 -> aru.i);
   public static final kf<MapCodec<? extends tj>> aD = a(me.aK, tj::a);
   public static final kf<MapCodec<? extends sp>> aE = a(me.aL, sp::a);
   public static final kf<Consumer<sn>> aF = a(me.aJ, sc::a);
   public static final kf<? extends kf<?>> aG = aJ;

   private static <T> kf<T> a(alc<? extends kf<T>> $$0, md.a<T> $$1) {
      return a($$0, new ka<>($$0, Lifecycle.stable(), false), $$1);
   }

   private static <T> kf<T> b(alc<? extends kf<T>> $$0, md.a<T> $$1) {
      return a($$0, new ka<>($$0, Lifecycle.stable(), true), $$1);
   }

   private static <T> jn<T> a(alc<? extends kf<T>> $$0, String $$1, md.a<T> $$2) {
      return a($$0, new jm<>($$1, $$0, Lifecycle.stable(), false), $$2);
   }

   private static <T> jn<T> b(alc<? extends kf<T>> $$0, String $$1, md.a<T> $$2) {
      return a($$0, new jm<>($$1, $$0, Lifecycle.stable(), true), $$2);
   }

   private static <T, R extends ko<T>> R a(alc<? extends kf<T>> $$0, R $$1, md.a<T> $$2) {
      alf.a(() -> "registry " + $$0.a());
      ald $$3 = $$0.a();
      aI.put($$3, () -> $$2.run($$1));
      aJ.a((alc<ko<?>>)$$0, $$1, ke.a);
      return $$1;
   }

   public static void a() {
      b();
      c();
      b(aG);
   }

   private static void b() {
      aI.forEach(($$0, $$1) -> {
         if ($$1.get() == null) {
            aH.error("Unable to bootstrap registry '{}'", $$0);
         }
      });
   }

   private static void c() {
      aG.n();

      for (kf<?> $$0 : aG) {
         c($$0);
         $$0.n();
      }
   }

   private static <T extends kf<?>> void b(kf<T> $$0) {
      $$0.forEach($$1 -> {
         if ($$1.i().isEmpty()) {
            af.b("Registry '" + $$0.b((T)$$1) + "' was empty after loading");
         }

         if ($$1 instanceof jn) {
            ald $$2 = ((jn)$$1).b();
            Validate.notNull($$1.a($$2), "Missing default of DefaultedMappedRegistry: " + $$2, new Object[0]);
         }
      });
   }

   public static <T> jt<T> a(kf<T> $$0) {
      return ((ko)$$0).p();
   }

   private static void c(kf<?> $$0) {
      ((ka)$$0).o();
   }

   @FunctionalInterface
   interface a<T> {
      Object run(kf<T> var1);
   }
}
