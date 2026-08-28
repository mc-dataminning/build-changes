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
   public static final jl<ecr> a = a(mb.G, "step", ecr::a);
   public static final kd<axe> b = a(mb.al, $$0 -> axf.nU);
   public static final jl<etw> c = b(mb.D, "empty", $$0 -> ety.a);
   public static final kd<bun> d = a(mb.W, bur::a);
   public static final jl<dkm> e = b(mb.f, "air", $$0 -> dko.a);
   public static final jl<bvr<?>> f = b(mb.z, "pig", $$0 -> bvr.aR);
   public static final jl<cxl> g = b(mb.K, "air", $$0 -> cxt.a);
   public static final kd<czm> h = a(mb.ad, czp::a);
   public static final kd<lr<?>> i = a(mb.Y, $$0 -> ls.b);
   public static final kd<duz<?>> j = b(mb.h, $$0 -> duz.a);
   public static final kd<alz> k = a(mb.r, $$0 -> axp.E);
   public static final jl<ear> l = a(mb.o, "empty", $$0 -> ear.c);
   public static final kd<esh<?>> m = a(mb.ah, $$0 -> esh.a);
   public static final kd<esv<?>> n = a(mb.ai, $$0 -> esv.b);
   public static final kd<esa<?>> o = a(mb.ac, $$0 -> esa.a);
   public static final kd<cul<?>> p = a(mb.V, $$0 -> cul.i);
   public static final kd<dcp<?>> q = a(mb.af, $$0 -> dcp.a);
   public static final kd<dco<?>> r = a(mb.ae, $$0 -> dco.b);
   public static final kd<bxj> s = a(mb.c, bxo::a);
   public static final kd<ecw<?>> t = a(mb.ab, $$0 -> ecw.a);
   public static final kd<is<?, ?>> u = a(mb.p, it::a);
   public static final kd<axo<?>> v = a(mb.am, $$0 -> axp.c);
   public static final jl<cpo> w = a(mb.aw, "plains", $$0 -> cpo.c);
   public static final jl<cpm> x = a(mb.av, "none", $$0 -> cpm.b);
   public static final kd<chn> y = a(mb.aa, cho::a);
   public static final jl<cfk<?>> z = a(mb.U, "dummy", $$0 -> cfk.a);
   public static final jl<cgr<?>> A = a(mb.ak, "dummy", $$0 -> cgr.a);
   public static final kd<crq> B = a(mb.aj, $$0 -> crq.c);
   public static final kd<cro> C = a(mb.b, $$0 -> cro.b);
   public static final kd<exg> D = a(mb.Q, $$0 -> exd.b);
   public static final kd<eye<?>> E = a(mb.N, $$0 -> eyf.e);
   public static final kd<ezz> F = a(mb.M, $$0 -> faa.a);
   public static final kd<fat> G = a(mb.P, $$0 -> fav.b);
   public static final kd<fal> H = a(mb.O, $$0 -> fan.c);
   public static final kd<fbc> I = a(mb.R, $$0 -> fbe.c);
   public static final kd<bsn<?>> J = a(mb.C, $$0 -> bsn.a);
   public static final kd<bsp<?>> K = a(mb.J, $$0 -> bsp.a);
   public static final kd<ems<?>> L = a(mb.H, $$0 -> ems.a);
   public static final kd<eey<?>> M = a(mb.i, $$0 -> eey.k);
   public static final kd<efw<?>> N = a(mb.k, $$0 -> efw.a);
   public static final kd<egw<?>> O = a(mb.A, $$0 -> egw.I);
   public static final kd<epi<?>> P = a(mb.ao, $$0 -> epi.a);
   public static final kd<epb> Q = a(mb.an, $$0 -> epb.c);
   public static final kd<eot<?>> R = a(mb.as, $$0 -> eot.f);
   public static final kd<ens<?>> S = a(mb.Z, $$0 -> ens.f);
   public static final kd<elc<?>> T = a(mb.j, $$0 -> elc.a);
   public static final kd<ekn<?>> U = a(mb.E, $$0 -> ekn.a);
   public static final kd<emh<?>> V = a(mb.au, $$0 -> emh.a);
   public static final kd<ekz<?>> W = a(mb.ag, $$0 -> ekz.a);
   public static final kd<elv<?>> X = a(mb.at, $$0 -> elv.b);
   public static final kd<ekc<?>> Y = a(mb.B, $$0 -> ekc.a);
   public static final kd<MapCodec<? extends dio>> Z = a(mb.e, dip::a);
   public static final kd<MapCodec<? extends dzr>> aa = a(mb.n, dzt::a);
   public static final kd<MapCodec<? extends eeh.f>> ab = a(mb.S, eeh.f::a);
   public static final kd<MapCodec<? extends eeh.o>> ac = a(mb.T, eeh.o::a);
   public static final kd<MapCodec<? extends edj>> ad = a(mb.t, edk::a);
   public static final kd<MapCodec<? extends dkm>> ae = a(mb.g, dkn::a);
   public static final kd<esl<?>> af = a(mb.ar, $$0 -> esl.e);
   public static final kd<ept<?>> ag = a(mb.ap, $$0 -> ept.d);
   public static final kd<MapCodec<? extends epw>> ah = a(mb.aq, epx::a);
   public static final kd<cib> ai = a(mb.l, cib::a);
   public static final kd<cii> aj = a(mb.F, cii::a);
   public static final kd<dvp> ak = a(mb.ax, dvq::a);
   public static final kd<cwe> al = a(mb.q, cwf::a);
   public static final kd<ar<?>> am = a(mb.aY, ao::a);
   public static final kd<zm<?>> an = a(mb.ay, zn::a);
   public static final kd<kt<?>> ao = a(mb.az, ku::a);
   public static final kd<MapCodec<? extends bx>> ap = a(mb.aA, by::a);
   public static final kd<cv.a<?>> aq = a(mb.aB, cw::a);
   public static final kd<evm> ar = a(mb.aC, evn::a);
   public static final kd<kt<?>> as = a(mb.aD, dea::a);
   public static final kd<MapCodec<? extends deg>> at = a(mb.v, deg::a);
   public static final kd<MapCodec<? extends deq>> au = a(mb.u, deq::a);
   public static final kd<MapCodec<? extends der>> av = a(mb.w, der::b);
   public static final kd<MapCodec<? extends des>> aw = a(mb.y, des::a);
   public static final kd<MapCodec<? extends dfh>> ax = a(mb.x, dfi::a);
   public static final kd<dbb.a<?>> ay = a(mb.aE, $$0 -> dbb.a.a);
   public static final kd<ddj.a<?>> az = a(mb.aF, ddm::a);
   public static final kd<ddp.i<?>> aA = a(mb.aG, ddr::a);
   public static final kd<dch> aB = a(mb.aH, dcg::a);
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
