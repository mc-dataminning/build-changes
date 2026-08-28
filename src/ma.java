import com.google.common.collect.Maps;
import com.mojang.logging.LogUtils;
import com.mojang.serialization.Lifecycle;
import com.mojang.serialization.MapCodec;
import java.util.Map;
import java.util.function.Supplier;
import org.apache.commons.lang3.Validate;
import org.slf4j.Logger;

public class ma {
   private static final Logger aC = LogUtils.getLogger();
   private static final Map<alz, Supplier<?>> aD = Maps.newLinkedHashMap();
   private static final km<km<?>> aE = new jy<>(aly.a(mb.a), Lifecycle.stable());
   public static final jl<ecj> a = a(mb.G, "step", ecj::a);
   public static final kd<axe> b = a(mb.al, $$0 -> axf.nT);
   public static final jl<eto> c = b(mb.D, "empty", $$0 -> etq.a);
   public static final kd<bui> d = a(mb.W, bum::a);
   public static final jl<dke> e = b(mb.f, "air", $$0 -> dkg.a);
   public static final jl<bvm<?>> f = b(mb.z, "pig", $$0 -> bvm.aR);
   public static final jl<cxg> g = b(mb.K, "air", $$0 -> cxo.a);
   public static final kd<czh> h = a(mb.ad, czk::a);
   public static final kd<lr<?>> i = a(mb.Y, $$0 -> ls.b);
   public static final kd<dur<?>> j = b(mb.h, $$0 -> dur.a);
   public static final kd<alz> k = a(mb.r, $$0 -> axp.E);
   public static final jl<eaj> l = a(mb.o, "empty", $$0 -> eaj.c);
   public static final kd<erz<?>> m = a(mb.ah, $$0 -> erz.a);
   public static final kd<esn<?>> n = a(mb.ai, $$0 -> esn.b);
   public static final kd<ers<?>> o = a(mb.ac, $$0 -> ers.a);
   public static final kd<cug<?>> p = a(mb.V, $$0 -> cug.i);
   public static final kd<dcj<?>> q = a(mb.af, $$0 -> dcj.a);
   public static final kd<dci<?>> r = a(mb.ae, $$0 -> dci.b);
   public static final kd<bxe> s = a(mb.c, bxj::a);
   public static final kd<eco<?>> t = a(mb.ab, $$0 -> eco.a);
   public static final kd<is<?, ?>> u = a(mb.p, it::a);
   public static final kd<axo<?>> v = a(mb.am, $$0 -> axp.c);
   public static final jl<cpj> w = a(mb.aw, "plains", $$0 -> cpj.c);
   public static final jl<cph> x = a(mb.av, "none", $$0 -> cph.b);
   public static final kd<chi> y = a(mb.aa, chj::a);
   public static final jl<cff<?>> z = a(mb.U, "dummy", $$0 -> cff.a);
   public static final jl<cgm<?>> A = a(mb.ak, "dummy", $$0 -> cgm.a);
   public static final kd<crl> B = a(mb.aj, $$0 -> crl.c);
   public static final kd<crj> C = a(mb.b, $$0 -> crj.b);
   public static final kd<ewy> D = a(mb.Q, $$0 -> ewv.b);
   public static final kd<exw<?>> E = a(mb.N, $$0 -> exx.e);
   public static final kd<ezt> F = a(mb.M, $$0 -> ezu.a);
   public static final kd<fan> G = a(mb.P, $$0 -> fap.b);
   public static final kd<faf> H = a(mb.O, $$0 -> fah.c);
   public static final kd<faw> I = a(mb.R, $$0 -> fay.c);
   public static final kd<bsi<?>> J = a(mb.C, $$0 -> bsi.a);
   public static final kd<bsk<?>> K = a(mb.J, $$0 -> bsk.a);
   public static final kd<emk<?>> L = a(mb.H, $$0 -> emk.a);
   public static final kd<eeq<?>> M = a(mb.i, $$0 -> eeq.k);
   public static final kd<efo<?>> N = a(mb.k, $$0 -> efo.a);
   public static final kd<ego<?>> O = a(mb.A, $$0 -> ego.I);
   public static final kd<epa<?>> P = a(mb.ao, $$0 -> epa.a);
   public static final kd<eot> Q = a(mb.an, $$0 -> eot.c);
   public static final kd<eol<?>> R = a(mb.as, $$0 -> eol.f);
   public static final kd<enk<?>> S = a(mb.Z, $$0 -> enk.f);
   public static final kd<eku<?>> T = a(mb.j, $$0 -> eku.a);
   public static final kd<ekf<?>> U = a(mb.E, $$0 -> ekf.a);
   public static final kd<elz<?>> V = a(mb.au, $$0 -> elz.a);
   public static final kd<ekr<?>> W = a(mb.ag, $$0 -> ekr.a);
   public static final kd<eln<?>> X = a(mb.at, $$0 -> eln.b);
   public static final kd<eju<?>> Y = a(mb.B, $$0 -> eju.a);
   public static final kd<MapCodec<? extends dig>> Z = a(mb.e, dih::a);
   public static final kd<MapCodec<? extends dzj>> aa = a(mb.n, dzl::a);
   public static final kd<MapCodec<? extends edz.f>> ab = a(mb.S, edz.f::a);
   public static final kd<MapCodec<? extends edz.o>> ac = a(mb.T, edz.o::a);
   public static final kd<MapCodec<? extends edb>> ad = a(mb.t, edc::a);
   public static final kd<MapCodec<? extends dke>> ae = a(mb.g, dkf::a);
   public static final kd<esd<?>> af = a(mb.ar, $$0 -> esd.e);
   public static final kd<epl<?>> ag = a(mb.ap, $$0 -> epl.d);
   public static final kd<MapCodec<? extends epo>> ah = a(mb.aq, epp::a);
   public static final kd<chw> ai = a(mb.l, chw::a);
   public static final kd<cid> aj = a(mb.F, cid::a);
   public static final kd<dvh> ak = a(mb.ax, dvi::a);
   public static final kd<cvz> al = a(mb.q, cwa::a);
   public static final kd<ar<?>> am = a(mb.aX, ao::a);
   public static final kd<zm<?>> an = a(mb.ay, zn::a);
   public static final kd<kt<?>> ao = a(mb.az, ku::a);
   public static final kd<MapCodec<? extends bx>> ap = a(mb.aA, by::a);
   public static final kd<cv.a<?>> aq = a(mb.aB, cw::a);
   public static final kd<eve> ar = a(mb.aC, evf::a);
   public static final kd<kt<?>> as = a(mb.aD, dds::a);
   public static final kd<MapCodec<? extends ddy>> at = a(mb.v, ddy::a);
   public static final kd<MapCodec<? extends dei>> au = a(mb.u, dei::a);
   public static final kd<MapCodec<? extends dej>> av = a(mb.w, dej::b);
   public static final kd<MapCodec<? extends dek>> aw = a(mb.y, dek::a);
   public static final kd<MapCodec<? extends dez>> ax = a(mb.x, dfa::a);
   public static final kd<daw.a<?>> ay = a(mb.aE, $$0 -> daw.a.a);
   public static final kd<ddc.a<?>> az = a(mb.aF, ddf::a);
   public static final kd<ddi.j<?>> aA = a(mb.aG, ddj::a);
   public static final kd<? extends kd<?>> aB = aE;

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
      amb.a(() -> "registry " + $$0);
      alz $$3 = $$0.a();
      aD.put($$3, () -> $$2.run($$1));
      aE.a((aly<km<?>>)$$0, $$1, kc.a);
      return $$1;
   }

   public static void a() {
      b();
      c();
      b(aB);
   }

   private static void b() {
      aD.forEach(($$0, $$1) -> {
         if ($$1.get() == null) {
            aC.error("Unable to bootstrap registry '{}'", $$0);
         }
      });
   }

   private static void c() {
      aB.n();

      for (kd<?> $$0 : aB) {
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
