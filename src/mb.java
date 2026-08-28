import com.google.common.collect.Maps;
import com.mojang.logging.LogUtils;
import com.mojang.serialization.Lifecycle;
import com.mojang.serialization.MapCodec;
import java.util.Map;
import java.util.function.Supplier;
import org.apache.commons.lang3.Validate;
import org.slf4j.Logger;

public class mb {
   private static final Logger aE = LogUtils.getLogger();
   private static final Map<aku, Supplier<?>> aF = Maps.newLinkedHashMap();
   private static final kn<kn<?>> aG = new jz<>(akt.a(mc.a), Lifecycle.stable());
   public static final jm<ecp> a = a(mc.G, "step", ecp::a);
   public static final ke<avz> b = a(mc.al, $$0 -> awa.of);
   public static final jm<etv> c = b(mc.D, "empty", $$0 -> etx.a);
   public static final ke<buc> d = a(mc.W, bug::a);
   public static final jm<dke> e = b(mc.f, "air", $$0 -> dkg.a);
   public static final jm<bvi<?>> f = b(mc.z, "pig", $$0 -> bvi.aQ);
   public static final jm<cxd> g = b(mc.K, "air", $$0 -> cxl.a);
   public static final ke<czc> h = a(mc.ad, czf::a);
   public static final ke<ls<?>> i = a(mc.Y, $$0 -> lt.b);
   public static final ke<duu<?>> j = b(mc.h, $$0 -> duu.a);
   public static final ke<aku> k = a(mc.r, $$0 -> awk.E);
   public static final jm<ean> l = a(mc.o, "empty", $$0 -> ean.c);
   public static final ke<esg<?>> m = a(mc.ah, $$0 -> esg.a);
   public static final ke<esu<?>> n = a(mc.ai, $$0 -> esu.b);
   public static final ke<erz<?>> o = a(mc.ac, $$0 -> erz.a);
   public static final ke<cuf<?>> p = a(mc.V, $$0 -> cuf.i);
   public static final ke<dcg<?>> q = a(mc.af, $$0 -> dcg.a);
   public static final ke<dcf<?>> r = a(mc.ae, $$0 -> dcf.b);
   public static final ke<bxb> s = a(mc.c, bxg::a);
   public static final ke<ecu<?>> t = a(mc.ab, $$0 -> ecu.a);
   public static final ke<it<?, ?>> u = a(mc.p, iu::a);
   public static final ke<awj<?>> v = a(mc.am, $$0 -> awk.c);
   public static final jm<cpi> w = a(mc.aw, "plains", $$0 -> cpi.c);
   public static final jm<cpg> x = a(mc.av, "none", $$0 -> cpg.b);
   public static final ke<chf> y = a(mc.aa, chg::a);
   public static final jm<cfc<?>> z = a(mc.U, "dummy", $$0 -> cfc.a);
   public static final jm<cgj<?>> A = a(mc.ak, "dummy", $$0 -> cgj.a);
   public static final ke<crk> B = a(mc.aj, $$0 -> crk.c);
   public static final ke<cri> C = a(mc.b, $$0 -> cri.b);
   public static final ke<exf> D = a(mc.Q, $$0 -> exc.b);
   public static final ke<eyd<?>> E = a(mc.N, $$0 -> eye.e);
   public static final ke<ezy> F = a(mc.M, $$0 -> ezz.a);
   public static final ke<fas> G = a(mc.P, $$0 -> fau.b);
   public static final ke<fak> H = a(mc.O, $$0 -> fam.c);
   public static final ke<fbb> I = a(mc.R, $$0 -> fbd.c);
   public static final ke<bsc<?>> J = a(mc.C, $$0 -> bsc.a);
   public static final ke<bse<?>> K = a(mc.J, $$0 -> bse.a);
   public static final ke<emr<?>> L = a(mc.H, $$0 -> emr.a);
   public static final ke<eew<?>> M = a(mc.i, $$0 -> eew.k);
   public static final ke<efu<?>> N = a(mc.k, $$0 -> efu.a);
   public static final ke<egu<?>> O = a(mc.A, $$0 -> egu.I);
   public static final ke<eph<?>> P = a(mc.ao, $$0 -> eph.a);
   public static final ke<epa> Q = a(mc.an, $$0 -> epa.c);
   public static final ke<eos<?>> R = a(mc.as, $$0 -> eos.f);
   public static final ke<enr<?>> S = a(mc.Z, $$0 -> enr.f);
   public static final ke<ela<?>> T = a(mc.j, $$0 -> ela.a);
   public static final ke<ekl<?>> U = a(mc.E, $$0 -> ekl.a);
   public static final ke<emg<?>> V = a(mc.au, $$0 -> emg.a);
   public static final ke<ekx<?>> W = a(mc.ag, $$0 -> ekx.a);
   public static final ke<elu<?>> X = a(mc.at, $$0 -> elu.b);
   public static final ke<eka<?>> Y = a(mc.B, $$0 -> eka.a);
   public static final ke<MapCodec<? extends dig>> Z = a(mc.e, dih::a);
   public static final ke<MapCodec<? extends dzn>> aa = a(mc.n, dzp::a);
   public static final ke<MapCodec<? extends eef.f>> ab = a(mc.S, eef.f::a);
   public static final ke<MapCodec<? extends eef.o>> ac = a(mc.T, eef.o::a);
   public static final ke<MapCodec<? extends edh>> ad = a(mc.t, edi::a);
   public static final ke<MapCodec<? extends dke>> ae = a(mc.g, dkf::a);
   public static final ke<esk<?>> af = a(mc.ar, $$0 -> esk.e);
   public static final ke<eps<?>> ag = a(mc.ap, $$0 -> eps.d);
   public static final ke<MapCodec<? extends epv>> ah = a(mc.aq, epw::a);
   public static final ke<cht> ai = a(mc.l, cht::a);
   public static final ke<cia> aj = a(mc.F, cia::a);
   public static final ke<dvk> ak = a(mc.ax, dvl::a);
   public static final ke<cvx> al = a(mc.q, cvy::a);
   public static final ke<as<?>> am = a(mc.ba, ap::a);
   public static final ke<yg<?>> an = a(mc.ay, yh::a);
   public static final ke<ku<?>> ao = a(mc.az, kv::a);
   public static final ke<MapCodec<? extends by>> ap = a(mc.aA, bz::a);
   public static final ke<cw.a<?>> aq = a(mc.aB, cx::a);
   public static final ke<evl> ar = a(mc.aC, evm::a);
   public static final ke<ku<?>> as = a(mc.aD, dds::a);
   public static final ke<MapCodec<? extends ddy>> at = a(mc.v, ddy::a);
   public static final ke<MapCodec<? extends dei>> au = a(mc.u, dei::a);
   public static final ke<MapCodec<? extends dej>> av = a(mc.w, dej::b);
   public static final ke<MapCodec<? extends dek>> aw = a(mc.y, dek::a);
   public static final ke<MapCodec<? extends dez>> ax = a(mc.x, dfa::a);
   public static final ke<das.a<?>> ay = a(mc.aE, $$0 -> das.a.a);
   public static final ke<ddb.a<?>> az = a(mc.aF, dde::a);
   public static final ke<ddh.i<?>> aA = a(mc.aG, ddj::a);
   public static final ke<dby> aB = a(mc.aH, dbx::a);
   public static final ke<ark> aC = a(mc.aI, $$0 -> ark.i);
   public static final ke<? extends ke<?>> aD = aG;

   private static <T> ke<T> a(akt<? extends ke<T>> $$0, mb.a<T> $$1) {
      return a($$0, new jz<>($$0, Lifecycle.stable(), false), $$1);
   }

   private static <T> ke<T> b(akt<? extends ke<T>> $$0, mb.a<T> $$1) {
      return a($$0, new jz<>($$0, Lifecycle.stable(), true), $$1);
   }

   private static <T> jm<T> a(akt<? extends ke<T>> $$0, String $$1, mb.a<T> $$2) {
      return a($$0, new jl<>($$1, $$0, Lifecycle.stable(), false), $$2);
   }

   private static <T> jm<T> b(akt<? extends ke<T>> $$0, String $$1, mb.a<T> $$2) {
      return a($$0, new jl<>($$1, $$0, Lifecycle.stable(), true), $$2);
   }

   private static <T, R extends kn<T>> R a(akt<? extends ke<T>> $$0, R $$1, mb.a<T> $$2) {
      akw.a(() -> "registry " + $$0.a());
      aku $$3 = $$0.a();
      aF.put($$3, () -> $$2.run($$1));
      aG.a((akt<kn<?>>)$$0, $$1, kd.a);
      return $$1;
   }

   public static void a() {
      b();
      c();
      b(aD);
   }

   private static void b() {
      aF.forEach(($$0, $$1) -> {
         if ($$1.get() == null) {
            aE.error("Unable to bootstrap registry '{}'", $$0);
         }
      });
   }

   private static void c() {
      aD.n();

      for (ke<?> $$0 : aD) {
         c($$0);
         $$0.n();
      }
   }

   private static <T extends ke<?>> void b(ke<T> $$0) {
      $$0.forEach($$1 -> {
         if ($$1.i().isEmpty()) {
            af.b("Registry '" + $$0.b((T)$$1) + "' was empty after loading");
         }

         if ($$1 instanceof jm) {
            aku $$2 = ((jm)$$1).b();
            Validate.notNull($$1.a($$2), "Missing default of DefaultedMappedRegistry: " + $$2, new Object[0]);
         }
      });
   }

   public static <T> js<T> a(ke<T> $$0) {
      return ((kn)$$0).p();
   }

   private static void c(ke<?> $$0) {
      ((jz)$$0).o();
   }

   @FunctionalInterface
   interface a<T> {
      Object run(ke<T> var1);
   }
}
