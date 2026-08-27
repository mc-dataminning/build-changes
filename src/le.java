import com.google.common.collect.Maps;
import com.mojang.logging.LogUtils;
import com.mojang.serialization.Lifecycle;
import com.mojang.serialization.MapCodec;
import java.util.Map;
import java.util.function.Supplier;
import org.apache.commons.lang3.Validate;
import org.slf4j.Logger;

public class le {
   private static final Logger ax = LogUtils.getLogger();
   private static final Map<akm, Supplier<?>> ay = Maps.newLinkedHashMap();
   private static final jt<jt<?>> az = new jf<>(akl.a(lf.a), Lifecycle.stable());
   public static final is<dvu> a = a(lf.C, "step", dvu::a);
   public static final jk<avg> b = a(lf.ag, $$0 -> avh.nC);
   public static final is<emt> c = b(lf.z, "empty", $$0 -> emv.a);
   public static final jk<bra> d = a(lf.R, bre::a);
   public static final is<ddy> e = b(lf.f, "air", $$0 -> dea.a);
   public static final jk<cyz> f = b(lf.u, $$0 -> czc.x);
   public static final is<bsa<?>> g = b(lf.v, "pig", $$0 -> bsa.az);
   public static final is<ctj> h = b(lf.G, "air", $$0 -> ctr.a);
   public static final jk<cvn> i = a(lf.Y, cvq::a);
   public static final jk<kx<?>> j = a(lf.T, $$0 -> ky.b);
   public static final jk<doi<?>> k = b(lf.h, $$0 -> doi.a);
   public static final is<cic> l = a(lf.S, "kebab", cid::a);
   public static final jk<akm> m = a(lf.r, $$0 -> avr.E);
   public static final is<dtw> n = a(lf.o, "empty", $$0 -> dtw.c);
   public static final jk<ele<?>> o = a(lf.ac, $$0 -> ele.a);
   public static final jk<els<?>> p = a(lf.ad, $$0 -> els.b);
   public static final jk<ekx<?>> q = a(lf.X, $$0 -> ekx.a);
   public static final jk<cqa<?>> r = a(lf.Q, $$0 -> cqa.i);
   public static final jk<cxz<?>> s = a(lf.aa, $$0 -> cxz.a);
   public static final jk<cxy<?>> t = a(lf.Z, $$0 -> cxy.b);
   public static final jk<btr> u = a(lf.c, btw::a);
   public static final jk<dvz<?>> v = a(lf.W, $$0 -> dvz.a);
   public static final jk<hy<?, ?>> w = a(lf.p, hz::a);
   public static final jk<avq<?>> x = a(lf.ah, $$0 -> avr.c);
   public static final is<clo> y = a(lf.ar, "plains", $$0 -> clo.c);
   public static final is<clm> z = a(lf.aq, "none", $$0 -> clm.b);
   public static final jk<cdv> A = a(lf.V, cdw::a);
   public static final is<cbs<?>> B = a(lf.P, "dummy", $$0 -> cbs.a);
   public static final is<ccz<?>> C = a(lf.af, "dummy", $$0 -> ccz.a);
   public static final jk<cnn> D = a(lf.ae, $$0 -> cnn.c);
   public static final jk<cnl> E = a(lf.b, $$0 -> cnl.b);
   public static final jk<epw> F = a(lf.L, $$0 -> ept.b);
   public static final jk<eqs> G = a(lf.I, $$0 -> eqt.e);
   public static final jk<esm> H = a(lf.H, $$0 -> esn.c);
   public static final jk<etf> I = a(lf.K, $$0 -> eth.b);
   public static final jk<esy> J = a(lf.J, $$0 -> eta.c);
   public static final jk<eto> K = a(lf.M, $$0 -> etq.c);
   public static final jk<boy<?>> L = a(lf.y, $$0 -> boy.a);
   public static final jk<bpa<?>> M = a(lf.F, $$0 -> bpa.a);
   public static final jk<efr<?>> N = a(lf.D, $$0 -> efr.a);
   public static final jk<dyb<?>> O = a(lf.i, $$0 -> dyb.k);
   public static final jk<dyy<?>> P = a(lf.k, $$0 -> dyy.a);
   public static final jk<dzx<?>> Q = a(lf.w, $$0 -> dzx.I);
   public static final jk<eih<?>> R = a(lf.aj, $$0 -> eih.a);
   public static final jk<eia> S = a(lf.ai, $$0 -> eia.c);
   public static final jk<ehs<?>> T = a(lf.an, $$0 -> ehs.f);
   public static final jk<egr<?>> U = a(lf.U, $$0 -> egr.f);
   public static final jk<eed<?>> V = a(lf.j, $$0 -> eed.a);
   public static final jk<edo<?>> W = a(lf.A, $$0 -> edo.a);
   public static final jk<efg<?>> X = a(lf.ap, $$0 -> efg.a);
   public static final jk<eea<?>> Y = a(lf.ab, $$0 -> eea.a);
   public static final jk<eeu<?>> Z = a(lf.ao, $$0 -> eeu.b);
   public static final jk<edd<?>> aa = a(lf.x, $$0 -> edd.a);
   public static final jk<MapCodec<? extends dca>> ab = a(lf.e, dcb::a);
   public static final jk<MapCodec<? extends dsy>> ac = a(lf.n, dta::a);
   public static final jk<MapCodec<? extends dxk.f>> ad = a(lf.N, dxk.f::a);
   public static final jk<MapCodec<? extends dxk.o>> ae = a(lf.O, dxk.o::a);
   public static final jk<MapCodec<? extends dwm>> af = a(lf.t, dwn::a);
   public static final jk<MapCodec<? extends ddy>> ag = a(lf.g, ddz::a);
   public static final jk<eli<?>> ah = a(lf.am, $$0 -> eli.e);
   public static final jk<eir<?>> ai = a(lf.ak, $$0 -> eir.d);
   public static final jk<MapCodec<? extends eiu>> aj = a(lf.al, eiv::a);
   public static final jk<cei> ak = a(lf.l, cei::a);
   public static final jk<cep> al = a(lf.B, cep::a);
   public static final jk<ctg> am = a(lf.E, cti::a);
   public static final jk<String> an = a(lf.as, dox::a);
   public static final jk<crz> ao = a(lf.q, csa::a);
   public static final jk<ap<?>> ap = a(lf.aN, am::a);
   public static final jk<yo<?>> aq = a(lf.at, yp::a);
   public static final jk<cre> ar = a(lf.au, crf::a);
   public static final jk<ka<?>> as = a(lf.av, kb::a);
   public static final jk<MapCodec<? extends bs>> at = a(lf.aw, bt::a);
   public static final jk<ci.a<?>> au = a(lf.ax, cj::a);
   public static final jk<eoe> av = a(lf.ay, eof::a);
   public static final jk<? extends jk<?>> aw = az;

   private static <T> jk<T> a(akl<? extends jk<T>> $$0, le.a<T> $$1) {
      return a($$0, new jf<>($$0, Lifecycle.stable(), false), $$1);
   }

   private static <T> jk<T> b(akl<? extends jk<T>> $$0, le.a<T> $$1) {
      return a($$0, new jf<>($$0, Lifecycle.stable(), true), $$1);
   }

   private static <T> is<T> a(akl<? extends jk<T>> $$0, String $$1, le.a<T> $$2) {
      return a($$0, new ir<>($$1, $$0, Lifecycle.stable(), false), $$2);
   }

   private static <T> is<T> b(akl<? extends jk<T>> $$0, String $$1, le.a<T> $$2) {
      return a($$0, new ir<>($$1, $$0, Lifecycle.stable(), true), $$2);
   }

   private static <T, R extends jt<T>> R a(akl<? extends jk<T>> $$0, R $$1, le.a<T> $$2) {
      ako.a(() -> "registry " + $$0);
      akm $$3 = $$0.a();
      ay.put($$3, () -> $$2.run($$1));
      az.a((akl<jt<?>>)$$0, $$1, jj.a);
      return $$1;
   }

   public static void a() {
      b();
      c();
      a(aw);
   }

   private static void b() {
      ay.forEach(($$0, $$1) -> {
         if ($$1.get() == null) {
            ax.error("Unable to bootstrap registry '{}'", $$0);
         }
      });
   }

   private static void c() {
      aw.l();

      for (jk<?> $$0 : aw) {
         $$0.l();
      }
   }

   private static <T extends jk<?>> void a(jk<T> $$0) {
      $$0.forEach($$1 -> {
         if ($$1.e().isEmpty()) {
            ac.a("Registry '" + $$0.b((T)$$1) + "' was empty after loading");
         }

         if ($$1 instanceof is) {
            akm $$2 = ((is)$$1).a();
            Validate.notNull($$1.a($$2), "Missing default of DefaultedMappedRegistry: " + $$2, new Object[0]);
         }
      });
   }

   @FunctionalInterface
   interface a<T> {
      Object run(jk<T> var1);
   }
}
