import com.google.common.collect.Maps;
import com.mojang.logging.LogUtils;
import com.mojang.serialization.Lifecycle;
import com.mojang.serialization.MapCodec;
import java.util.Map;
import java.util.function.Supplier;
import org.apache.commons.lang3.Validate;
import org.slf4j.Logger;

public class ma {
   private static final Logger aD = LogUtils.getLogger();
   private static final Map<alz, Supplier<?>> aE = Maps.newLinkedHashMap();
   private static final km<km<?>> aF = new jy<>(aly.a(mb.a), Lifecycle.stable());
   public static final jl<ecq> a = a(mb.G, "step", ecq::a);
   public static final kd<axe> b = a(mb.al, $$0 -> axf.nU);
   public static final jl<etv> c = b(mb.D, "empty", $$0 -> etx.a);
   public static final kd<bum> d = a(mb.W, buq::a);
   public static final jl<dkl> e = b(mb.f, "air", $$0 -> dkn.a);
   public static final jl<bvq<?>> f = b(mb.z, "pig", $$0 -> bvq.aR);
   public static final jl<cxk> g = b(mb.K, "air", $$0 -> cxs.a);
   public static final kd<czl> h = a(mb.ad, czo::a);
   public static final kd<lr<?>> i = a(mb.Y, $$0 -> ls.b);
   public static final kd<duy<?>> j = b(mb.h, $$0 -> duy.a);
   public static final kd<alz> k = a(mb.r, $$0 -> axp.E);
   public static final jl<eaq> l = a(mb.o, "empty", $$0 -> eaq.c);
   public static final kd<esg<?>> m = a(mb.ah, $$0 -> esg.a);
   public static final kd<esu<?>> n = a(mb.ai, $$0 -> esu.b);
   public static final kd<erz<?>> o = a(mb.ac, $$0 -> erz.a);
   public static final kd<cuk<?>> p = a(mb.V, $$0 -> cuk.i);
   public static final kd<dco<?>> q = a(mb.af, $$0 -> dco.a);
   public static final kd<dcn<?>> r = a(mb.ae, $$0 -> dcn.b);
   public static final kd<bxi> s = a(mb.c, bxn::a);
   public static final kd<ecv<?>> t = a(mb.ab, $$0 -> ecv.a);
   public static final kd<is<?, ?>> u = a(mb.p, it::a);
   public static final kd<axo<?>> v = a(mb.am, $$0 -> axp.c);
   public static final jl<cpn> w = a(mb.aw, "plains", $$0 -> cpn.c);
   public static final jl<cpl> x = a(mb.av, "none", $$0 -> cpl.b);
   public static final kd<chm> y = a(mb.aa, chn::a);
   public static final jl<cfj<?>> z = a(mb.U, "dummy", $$0 -> cfj.a);
   public static final jl<cgq<?>> A = a(mb.ak, "dummy", $$0 -> cgq.a);
   public static final kd<crp> B = a(mb.aj, $$0 -> crp.c);
   public static final kd<crn> C = a(mb.b, $$0 -> crn.b);
   public static final kd<exf> D = a(mb.Q, $$0 -> exc.b);
   public static final kd<eyd<?>> E = a(mb.N, $$0 -> eye.e);
   public static final kd<ezy> F = a(mb.M, $$0 -> ezz.a);
   public static final kd<fas> G = a(mb.P, $$0 -> fau.b);
   public static final kd<fak> H = a(mb.O, $$0 -> fam.c);
   public static final kd<fbb> I = a(mb.R, $$0 -> fbd.c);
   public static final kd<bsm<?>> J = a(mb.C, $$0 -> bsm.a);
   public static final kd<bso<?>> K = a(mb.J, $$0 -> bso.a);
   public static final kd<emr<?>> L = a(mb.H, $$0 -> emr.a);
   public static final kd<eex<?>> M = a(mb.i, $$0 -> eex.k);
   public static final kd<efv<?>> N = a(mb.k, $$0 -> efv.a);
   public static final kd<egv<?>> O = a(mb.A, $$0 -> egv.I);
   public static final kd<eph<?>> P = a(mb.ao, $$0 -> eph.a);
   public static final kd<epa> Q = a(mb.an, $$0 -> epa.c);
   public static final kd<eos<?>> R = a(mb.as, $$0 -> eos.f);
   public static final kd<enr<?>> S = a(mb.Z, $$0 -> enr.f);
   public static final kd<elb<?>> T = a(mb.j, $$0 -> elb.a);
   public static final kd<ekm<?>> U = a(mb.E, $$0 -> ekm.a);
   public static final kd<emg<?>> V = a(mb.au, $$0 -> emg.a);
   public static final kd<eky<?>> W = a(mb.ag, $$0 -> eky.a);
   public static final kd<elu<?>> X = a(mb.at, $$0 -> elu.b);
   public static final kd<ekb<?>> Y = a(mb.B, $$0 -> ekb.a);
   public static final kd<MapCodec<? extends din>> Z = a(mb.e, dio::a);
   public static final kd<MapCodec<? extends dzq>> aa = a(mb.n, dzs::a);
   public static final kd<MapCodec<? extends eeg.f>> ab = a(mb.S, eeg.f::a);
   public static final kd<MapCodec<? extends eeg.o>> ac = a(mb.T, eeg.o::a);
   public static final kd<MapCodec<? extends edi>> ad = a(mb.t, edj::a);
   public static final kd<MapCodec<? extends dkl>> ae = a(mb.g, dkm::a);
   public static final kd<esk<?>> af = a(mb.ar, $$0 -> esk.e);
   public static final kd<eps<?>> ag = a(mb.ap, $$0 -> eps.d);
   public static final kd<MapCodec<? extends epv>> ah = a(mb.aq, epw::a);
   public static final kd<cia> ai = a(mb.l, cia::a);
   public static final kd<cih> aj = a(mb.F, cih::a);
   public static final kd<dvo> ak = a(mb.ax, dvp::a);
   public static final kd<cwd> al = a(mb.q, cwe::a);
   public static final kd<ar<?>> am = a(mb.aY, ao::a);
   public static final kd<zm<?>> an = a(mb.ay, zn::a);
   public static final kd<kt<?>> ao = a(mb.az, ku::a);
   public static final kd<MapCodec<? extends bx>> ap = a(mb.aA, by::a);
   public static final kd<cv.a<?>> aq = a(mb.aB, cw::a);
   public static final kd<evl> ar = a(mb.aC, evm::a);
   public static final kd<kt<?>> as = a(mb.aD, ddz::a);
   public static final kd<MapCodec<? extends def>> at = a(mb.v, def::a);
   public static final kd<MapCodec<? extends dep>> au = a(mb.u, dep::a);
   public static final kd<MapCodec<? extends deq>> av = a(mb.w, deq::b);
   public static final kd<MapCodec<? extends der>> aw = a(mb.y, der::a);
   public static final kd<MapCodec<? extends dfg>> ax = a(mb.x, dfh::a);
   public static final kd<dba.a<?>> ay = a(mb.aE, $$0 -> dba.a.a);
   public static final kd<ddi.a<?>> az = a(mb.aF, ddl::a);
   public static final kd<ddo.i<?>> aA = a(mb.aG, ddq::a);
   public static final kd<dcg> aB = a(mb.aH, dcf::a);
   public static final kd<? extends kd<?>> aC = aF;

   private static <T> kd<T> a(aly<? extends kd<T>> $$0, ma.a<T> $$1) {
      return a($$0, new jy<>($$0, Lifecycle.stable(), false), $$1);
   }

   private static <T> kd<T> b(aly<? extends kd<T>> $$0, ma.a<T> $$1) {
      return a($$0, new jy<>($$0, Lifecycle.stable(), true), $$1);
   }

   private static <T> jl<T> a(aly<? extends kd<T>> $$0, String $$1, ma.a<T> $$2) {
      return a($$0, new jk<>($$1, $$0, Lifecycle.stable(), false), $$2);
   }

   private static <T> jl<T> b(aly<? extends kd<T>> $$0, String $$1, ma.a<T> $$2) {
      return a($$0, new jk<>($$1, $$0, Lifecycle.stable(), true), $$2);
   }

   private static <T, R extends km<T>> R a(aly<? extends kd<T>> $$0, R $$1, ma.a<T> $$2) {
      amb.a(() -> "registry " + $$0.a());
      alz $$3 = $$0.a();
      aE.put($$3, () -> $$2.run($$1));
      aF.a((aly<km<?>>)$$0, $$1, kc.a);
      return $$1;
   }

   public static void a() {
      b();
      c();
      b(aC);
   }

   private static void b() {
      aE.forEach(($$0, $$1) -> {
         if ($$1.get() == null) {
            aD.error("Unable to bootstrap registry '{}'", $$0);
         }
      });
   }

   private static void c() {
      aC.n();

      for (kd<?> $$0 : aC) {
         c($$0);
         $$0.n();
      }
   }

   private static <T extends kd<?>> void b(kd<T> $$0) {
      $$0.forEach($$1 -> {
         if ($$1.i().isEmpty()) {
            ae.b("Registry '" + $$0.b((T)$$1) + "' was empty after loading");
         }

         if ($$1 instanceof jl) {
            alz $$2 = ((jl)$$1).b();
            Validate.notNull($$1.a($$2), "Missing default of DefaultedMappedRegistry: " + $$2, new Object[0]);
         }
      });
   }

   public static <T> jr<T> a(kd<T> $$0) {
      return ((km)$$0).p();
   }

   private static void c(kd<?> $$0) {
      ((jy)$$0).o();
   }

   @FunctionalInterface
   interface a<T> {
      Object run(kd<T> var1);
   }
}
