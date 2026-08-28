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
   private static final Map<alp, Supplier<?>> aE = Maps.newLinkedHashMap();
   private static final km<km<?>> aF = new jy<>(alo.a(mb.a), Lifecycle.stable());
   public static final jl<eck> a = a(mb.G, "step", eck::a);
   public static final kd<awu> b = a(mb.al, $$0 -> awv.oa);
   public static final jl<etp> c = b(mb.D, "empty", $$0 -> etr.a);
   public static final kd<bue> d = a(mb.W, bui::a);
   public static final jl<dkd> e = b(mb.f, "air", $$0 -> dkf.a);
   public static final jl<bvi<?>> f = b(mb.z, "pig", $$0 -> bvi.aR);
   public static final jl<cxc> g = b(mb.K, "air", $$0 -> cxk.a);
   public static final kd<czd> h = a(mb.ad, czg::a);
   public static final kd<lr<?>> i = a(mb.Y, $$0 -> ls.b);
   public static final kd<dus<?>> j = b(mb.h, $$0 -> dus.a);
   public static final kd<alp> k = a(mb.r, $$0 -> axf.E);
   public static final jl<eak> l = a(mb.o, "empty", $$0 -> eak.c);
   public static final kd<esa<?>> m = a(mb.ah, $$0 -> esa.a);
   public static final kd<eso<?>> n = a(mb.ai, $$0 -> eso.b);
   public static final kd<ert<?>> o = a(mb.ac, $$0 -> ert.a);
   public static final kd<cuc<?>> p = a(mb.V, $$0 -> cuc.i);
   public static final kd<dcg<?>> q = a(mb.af, $$0 -> dcg.a);
   public static final kd<dcf<?>> r = a(mb.ae, $$0 -> dcf.b);
   public static final kd<bxa> s = a(mb.c, bxf::a);
   public static final kd<ecp<?>> t = a(mb.ab, $$0 -> ecp.a);
   public static final kd<is<?, ?>> u = a(mb.p, it::a);
   public static final kd<axe<?>> v = a(mb.am, $$0 -> axf.c);
   public static final jl<cpf> w = a(mb.aw, "plains", $$0 -> cpf.c);
   public static final jl<cpd> x = a(mb.av, "none", $$0 -> cpd.b);
   public static final kd<che> y = a(mb.aa, chf::a);
   public static final jl<cfb<?>> z = a(mb.U, "dummy", $$0 -> cfb.a);
   public static final jl<cgi<?>> A = a(mb.ak, "dummy", $$0 -> cgi.a);
   public static final kd<crh> B = a(mb.aj, $$0 -> crh.c);
   public static final kd<crf> C = a(mb.b, $$0 -> crf.b);
   public static final kd<ewz> D = a(mb.Q, $$0 -> eww.b);
   public static final kd<exx<?>> E = a(mb.N, $$0 -> exy.e);
   public static final kd<ezs> F = a(mb.M, $$0 -> ezt.a);
   public static final kd<fam> G = a(mb.P, $$0 -> fao.b);
   public static final kd<fae> H = a(mb.O, $$0 -> fag.c);
   public static final kd<fav> I = a(mb.R, $$0 -> fax.c);
   public static final kd<bse<?>> J = a(mb.C, $$0 -> bse.a);
   public static final kd<bsg<?>> K = a(mb.J, $$0 -> bsg.a);
   public static final kd<eml<?>> L = a(mb.H, $$0 -> eml.a);
   public static final kd<eer<?>> M = a(mb.i, $$0 -> eer.k);
   public static final kd<efp<?>> N = a(mb.k, $$0 -> efp.a);
   public static final kd<egp<?>> O = a(mb.A, $$0 -> egp.I);
   public static final kd<epb<?>> P = a(mb.ao, $$0 -> epb.a);
   public static final kd<eou> Q = a(mb.an, $$0 -> eou.c);
   public static final kd<eom<?>> R = a(mb.as, $$0 -> eom.f);
   public static final kd<enl<?>> S = a(mb.Z, $$0 -> enl.f);
   public static final kd<ekv<?>> T = a(mb.j, $$0 -> ekv.a);
   public static final kd<ekg<?>> U = a(mb.E, $$0 -> ekg.a);
   public static final kd<ema<?>> V = a(mb.au, $$0 -> ema.a);
   public static final kd<eks<?>> W = a(mb.ag, $$0 -> eks.a);
   public static final kd<elo<?>> X = a(mb.at, $$0 -> elo.b);
   public static final kd<ejv<?>> Y = a(mb.B, $$0 -> ejv.a);
   public static final kd<MapCodec<? extends dif>> Z = a(mb.e, dig::a);
   public static final kd<MapCodec<? extends dzk>> aa = a(mb.n, dzm::a);
   public static final kd<MapCodec<? extends eea.f>> ab = a(mb.S, eea.f::a);
   public static final kd<MapCodec<? extends eea.o>> ac = a(mb.T, eea.o::a);
   public static final kd<MapCodec<? extends edc>> ad = a(mb.t, edd::a);
   public static final kd<MapCodec<? extends dkd>> ae = a(mb.g, dke::a);
   public static final kd<ese<?>> af = a(mb.ar, $$0 -> ese.e);
   public static final kd<epm<?>> ag = a(mb.ap, $$0 -> epm.d);
   public static final kd<MapCodec<? extends epp>> ah = a(mb.aq, epq::a);
   public static final kd<chs> ai = a(mb.l, chs::a);
   public static final kd<chz> aj = a(mb.F, chz::a);
   public static final kd<dvi> ak = a(mb.ax, dvj::a);
   public static final kd<cvv> al = a(mb.q, cvw::a);
   public static final kd<ar<?>> am = a(mb.aY, ao::a);
   public static final kd<zb<?>> an = a(mb.ay, zc::a);
   public static final kd<kt<?>> ao = a(mb.az, ku::a);
   public static final kd<MapCodec<? extends bx>> ap = a(mb.aA, by::a);
   public static final kd<cv.a<?>> aq = a(mb.aB, cw::a);
   public static final kd<evf> ar = a(mb.aC, evg::a);
   public static final kd<kt<?>> as = a(mb.aD, ddr::a);
   public static final kd<MapCodec<? extends ddx>> at = a(mb.v, ddx::a);
   public static final kd<MapCodec<? extends deh>> au = a(mb.u, deh::a);
   public static final kd<MapCodec<? extends dei>> av = a(mb.w, dei::b);
   public static final kd<MapCodec<? extends dej>> aw = a(mb.y, dej::a);
   public static final kd<MapCodec<? extends dey>> ax = a(mb.x, dez::a);
   public static final kd<das.a<?>> ay = a(mb.aE, $$0 -> das.a.a);
   public static final kd<dda.a<?>> az = a(mb.aF, ddd::a);
   public static final kd<ddg.i<?>> aA = a(mb.aG, ddi::a);
   public static final kd<dby> aB = a(mb.aH, dbx::a);
   public static final kd<? extends kd<?>> aC = aF;

   private static <T> kd<T> a(alo<? extends kd<T>> $$0, ma.a<T> $$1) {
      return a($$0, new jy<>($$0, Lifecycle.stable(), false), $$1);
   }

   private static <T> kd<T> b(alo<? extends kd<T>> $$0, ma.a<T> $$1) {
      return a($$0, new jy<>($$0, Lifecycle.stable(), true), $$1);
   }

   private static <T> jl<T> a(alo<? extends kd<T>> $$0, String $$1, ma.a<T> $$2) {
      return a($$0, new jk<>($$1, $$0, Lifecycle.stable(), false), $$2);
   }

   private static <T> jl<T> b(alo<? extends kd<T>> $$0, String $$1, ma.a<T> $$2) {
      return a($$0, new jk<>($$1, $$0, Lifecycle.stable(), true), $$2);
   }

   private static <T, R extends km<T>> R a(alo<? extends kd<T>> $$0, R $$1, ma.a<T> $$2) {
      alr.a(() -> "registry " + $$0.a());
      alp $$3 = $$0.a();
      aE.put($$3, () -> $$2.run($$1));
      aF.a((alo<km<?>>)$$0, $$1, kc.a);
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
            alp $$2 = ((jl)$$1).b();
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
