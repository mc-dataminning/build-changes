import com.google.common.collect.Maps;
import com.mojang.logging.LogUtils;
import com.mojang.serialization.Lifecycle;
import com.mojang.serialization.MapCodec;
import java.util.Map;
import java.util.function.Supplier;
import org.apache.commons.lang3.Validate;
import org.slf4j.Logger;

public class lu {
   private static final Logger aB = LogUtils.getLogger();
   private static final Map<alc, Supplier<?>> aC = Maps.newLinkedHashMap();
   private static final kj<kj<?>> aD = new jv<>(alb.a(lv.a), Lifecycle.stable());
   public static final ji<dzl> a = a(lv.G, "step", dzl::a);
   public static final ka<awd> b = a(lv.al, $$0 -> awe.nD);
   public static final ji<eqo> c = b(lv.D, "empty", $$0 -> eqq.a);
   public static final ka<bst> d = a(lv.W, bsx::a);
   public static final ji<dhj> e = b(lv.f, "air", $$0 -> dhl.a);
   public static final ji<btv<?>> f = b(lv.z, "pig", $$0 -> btv.az);
   public static final ji<cvk> g = b(lv.K, "air", $$0 -> cvt.a);
   public static final ka<cxm> h = a(lv.ad, cxp::a);
   public static final ka<lm<?>> i = a(lv.Y, $$0 -> ln.b);
   public static final ka<dru<?>> j = b(lv.h, $$0 -> dru.a);
   public static final ka<alc> k = a(lv.r, $$0 -> awo.E);
   public static final ji<dxl> l = a(lv.o, "empty", $$0 -> dxl.c);
   public static final ka<eoz<?>> m = a(lv.ah, $$0 -> eoz.a);
   public static final ka<epn<?>> n = a(lv.ai, $$0 -> epn.b);
   public static final ka<eos<?>> o = a(lv.ac, $$0 -> eos.a);
   public static final ka<csf<?>> p = a(lv.V, $$0 -> csf.i);
   public static final ka<dan<?>> q = a(lv.af, $$0 -> dan.a);
   public static final ka<dam<?>> r = a(lv.ae, $$0 -> dam.b);
   public static final ka<bvm> s = a(lv.c, bvr::a);
   public static final ka<dzq<?>> t = a(lv.ab, $$0 -> dzq.a);
   public static final ka<ip<?, ?>> u = a(lv.p, iq::a);
   public static final ka<awn<?>> v = a(lv.am, $$0 -> awo.c);
   public static final ji<cnm> w = a(lv.aw, "plains", $$0 -> cnm.c);
   public static final ji<cnk> x = a(lv.av, "none", $$0 -> cnk.b);
   public static final ka<cfq> y = a(lv.aa, cfr::a);
   public static final ji<cdn<?>> z = a(lv.U, "dummy", $$0 -> cdn.a);
   public static final ji<ceu<?>> A = a(lv.ak, "dummy", $$0 -> ceu.a);
   public static final ka<cpo> B = a(lv.aj, $$0 -> cpo.c);
   public static final ka<cpm> C = a(lv.b, $$0 -> cpm.b);
   public static final ka<ety> D = a(lv.Q, $$0 -> etv.b);
   public static final ka<euw<?>> E = a(lv.N, $$0 -> eux.e);
   public static final ka<ewt> F = a(lv.M, $$0 -> ewu.a);
   public static final ka<exn> G = a(lv.P, $$0 -> exp.b);
   public static final ka<exf> H = a(lv.O, $$0 -> exh.c);
   public static final ka<exw> I = a(lv.R, $$0 -> exy.c);
   public static final ka<bqt<?>> J = a(lv.C, $$0 -> bqt.a);
   public static final ka<bqv<?>> K = a(lv.J, $$0 -> bqv.a);
   public static final ka<ejk<?>> L = a(lv.H, $$0 -> ejk.a);
   public static final ka<ebs<?>> M = a(lv.i, $$0 -> ebs.k);
   public static final ka<ecq<?>> N = a(lv.k, $$0 -> ecq.a);
   public static final ka<edq<?>> O = a(lv.A, $$0 -> edq.I);
   public static final ka<ema<?>> P = a(lv.ao, $$0 -> ema.a);
   public static final ka<elt> Q = a(lv.an, $$0 -> elt.c);
   public static final ka<ell<?>> R = a(lv.as, $$0 -> ell.f);
   public static final ka<ekk<?>> S = a(lv.Z, $$0 -> ekk.f);
   public static final ka<ehw<?>> T = a(lv.j, $$0 -> ehw.a);
   public static final ka<ehh<?>> U = a(lv.E, $$0 -> ehh.a);
   public static final ka<eiz<?>> V = a(lv.au, $$0 -> eiz.a);
   public static final ka<eht<?>> W = a(lv.ag, $$0 -> eht.a);
   public static final ka<ein<?>> X = a(lv.at, $$0 -> ein.b);
   public static final ka<egw<?>> Y = a(lv.B, $$0 -> egw.a);
   public static final ka<MapCodec<? extends dfl>> Z = a(lv.e, dfm::a);
   public static final ka<MapCodec<? extends dwl>> aa = a(lv.n, dwn::a);
   public static final ka<MapCodec<? extends ebb.f>> ab = a(lv.S, ebb.f::a);
   public static final ka<MapCodec<? extends ebb.o>> ac = a(lv.T, ebb.o::a);
   public static final ka<MapCodec<? extends ead>> ad = a(lv.t, eae::a);
   public static final ka<MapCodec<? extends dhj>> ae = a(lv.g, dhk::a);
   public static final ka<epd<?>> af = a(lv.ar, $$0 -> epd.e);
   public static final ka<eml<?>> ag = a(lv.ap, $$0 -> eml.d);
   public static final ka<MapCodec<? extends emo>> ah = a(lv.aq, emp::a);
   public static final ka<cge> ai = a(lv.l, cge::a);
   public static final ka<cgl> aj = a(lv.F, cgl::a);
   public static final ka<dsj> ak = a(lv.ax, dsk::a);
   public static final ka<cub> al = a(lv.q, cuc::a);
   public static final ka<aq<?>> am = a(lv.aW, an::a);
   public static final ka<yu<?>> an = a(lv.ay, yv::a);
   public static final ka<ctj> ao = a(lv.az, ctk::a);
   public static final ka<kq<?>> ap = a(lv.aA, kr::a);
   public static final ka<MapCodec<? extends bw>> aq = a(lv.aB, bx::a);
   public static final ka<ct.a<?>> ar = a(lv.aC, cu::a);
   public static final ka<ese> as = a(lv.aD, esf::a);
   public static final ka<kq<?>> at = a(lv.aE, dbl::a);
   public static final ka<MapCodec<? extends dbr>> au = a(lv.v, dbr::a);
   public static final ka<MapCodec<? extends dcb>> av = a(lv.u, dcb::a);
   public static final ka<MapCodec<? extends dcc>> aw = a(lv.w, dcc::b);
   public static final ka<MapCodec<? extends dcd>> ax = a(lv.y, dcd::a);
   public static final ka<MapCodec<? extends dcs>> ay = a(lv.x, dct::a);
   public static final ka<czf.a<?>> az = a(lv.aF, $$0 -> czf.a.a);
   public static final ka<? extends ka<?>> aA = aD;

   private static <T> ka<T> a(alb<? extends ka<T>> $$0, lu.a<T> $$1) {
      return a($$0, new jv<>($$0, Lifecycle.stable(), false), $$1);
   }

   private static <T> ka<T> b(alb<? extends ka<T>> $$0, lu.a<T> $$1) {
      return a($$0, new jv<>($$0, Lifecycle.stable(), true), $$1);
   }

   private static <T> ji<T> a(alb<? extends ka<T>> $$0, String $$1, lu.a<T> $$2) {
      return a($$0, new jh<>($$1, $$0, Lifecycle.stable(), false), $$2);
   }

   private static <T> ji<T> b(alb<? extends ka<T>> $$0, String $$1, lu.a<T> $$2) {
      return a($$0, new jh<>($$1, $$0, Lifecycle.stable(), true), $$2);
   }

   private static <T, R extends kj<T>> R a(alb<? extends ka<T>> $$0, R $$1, lu.a<T> $$2) {
      ale.a(() -> "registry " + $$0);
      alc $$3 = $$0.a();
      aC.put($$3, () -> $$2.run($$1));
      aD.a((alb<kj<?>>)$$0, $$1, jz.a);
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
      aA.l();

      for (ka<?> $$0 : aA) {
         c($$0);
         $$0.l();
      }
   }

   private static <T extends ka<?>> void b(ka<T> $$0) {
      $$0.forEach($$1 -> {
         if ($$1.f().isEmpty()) {
            ad.b("Registry '" + $$0.b((T)$$1) + "' was empty after loading");
         }

         if ($$1 instanceof ji) {
            alc $$2 = ((ji)$$1).b();
            Validate.notNull($$1.a($$2), "Missing default of DefaultedMappedRegistry: " + $$2, new Object[0]);
         }
      });
   }

   public static <T> jo<T> a(ka<T> $$0) {
      return ((kj)$$0).n();
   }

   private static void c(ka<?> $$0) {
      ((jv)$$0).m();
   }

   @FunctionalInterface
   interface a<T> {
      Object run(ka<T> var1);
   }
}
