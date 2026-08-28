import com.google.common.collect.Maps;
import com.mojang.logging.LogUtils;
import com.mojang.serialization.Lifecycle;
import com.mojang.serialization.MapCodec;
import java.util.Map;
import java.util.function.Consumer;
import java.util.function.Supplier;
import org.apache.commons.lang3.Validate;
import org.slf4j.Logger;

public class mg {
   private static final Logger aG = LogUtils.getLogger();
   private static final Map<alg, Supplier<?>> aH = Maps.newLinkedHashMap();
   private static final kb<kb<?>> aI = new jn<>(alf.a(mh.a), Lifecycle.stable());
   public static final ja<efo> a = a(mh.H, "step", efo::a);
   public static final js<awm> b = a(mh.ap, $$0 -> awn.oj);
   public static final ja<ewu> c = b(mh.F, "empty", $$0 -> eww.a);
   public static final js<bvk> d = a(mh.W, bvo::a);
   public static final ja<dmm> e = b(mh.i, "air", $$0 -> dmo.a);
   public static final ja<bwr<?>> f = b(mh.B, "pig", $$0 -> bwr.aQ);
   public static final ja<czg> g = b(mh.K, "air", $$0 -> czo.a);
   public static final js<dbe> h = a(mh.ae, dbh::a);
   public static final js<lx<?>> i = a(mh.Y, $$0 -> ly.b);
   public static final js<dxo<?>> j = b(mh.e, $$0 -> dxo.a);
   public static final js<alg> k = a(mh.p, $$0 -> awx.E);
   public static final ja<edm> l = a(mh.l, "empty", $$0 -> edm.c);
   public static final js<evf<?>> m = a(mh.al, $$0 -> evf.a);
   public static final js<evt<?>> n = a(mh.ak, $$0 -> evt.b);
   public static final js<euy<?>> o = a(mh.ad, $$0 -> euy.a);
   public static final js<cwl<?>> p = a(mh.V, $$0 -> cwl.i);
   public static final js<dem<?>> q = a(mh.ai, $$0 -> dem.a);
   public static final js<del<?>> r = a(mh.ah, $$0 -> del.b);
   public static final js<byk> s = a(mh.c, byp::a);
   public static final js<eft<?>> t = a(mh.ac, $$0 -> eft.a);
   public static final js<ig<?, ?>> u = a(mh.m, ih::a);
   public static final js<aww<?>> v = a(mh.ar, $$0 -> awx.c);
   public static final ja<cra> w = a(mh.aE, "plains", cra::a);
   public static final ja<cqy> x = a(mh.aD, "none", cqy::a);
   public static final js<cio> y = a(mh.aa, cip::a);
   public static final ja<cgl<?>> z = a(mh.U, "dummy", $$0 -> cgl.a);
   public static final ja<chs<?>> A = a(mh.an, "dummy", $$0 -> chs.a);
   public static final js<ctf> B = a(mh.am, $$0 -> ctf.c);
   public static final js<ctd> C = a(mh.b, $$0 -> ctd.b);
   public static final js<faf> D = a(mh.P, $$0 -> fac.b);
   public static final js<fbd<?>> E = a(mh.M, $$0 -> fbe.e);
   public static final js<fcy> F = a(mh.L, $$0 -> fcz.a);
   public static final js<fds> G = a(mh.O, $$0 -> fdu.b);
   public static final js<fdk> H = a(mh.N, $$0 -> fdm.c);
   public static final js<feb> I = a(mh.Q, $$0 -> fed.c);
   public static final js<btk<?>> J = a(mh.E, $$0 -> btk.a);
   public static final js<btm<?>> K = a(mh.J, $$0 -> btm.a);
   public static final js<epq<?>> L = a(mh.I, $$0 -> epq.a);
   public static final js<ehv<?>> M = a(mh.f, $$0 -> ehv.k);
   public static final js<eit<?>> N = a(mh.j, $$0 -> eit.a);
   public static final js<ejt<?>> O = a(mh.D, $$0 -> ejt.I);
   public static final js<esg<?>> P = a(mh.at, $$0 -> esg.a);
   public static final js<erz> Q = a(mh.as, $$0 -> erz.c);
   public static final js<err<?>> R = a(mh.aw, $$0 -> err.f);
   public static final js<eqq<?>> S = a(mh.Z, $$0 -> eqq.f);
   public static final js<enz<?>> T = a(mh.g, $$0 -> enz.a);
   public static final js<enk<?>> U = a(mh.G, $$0 -> enk.a);
   public static final js<epf<?>> V = a(mh.aC, $$0 -> epf.a);
   public static final js<enw<?>> W = a(mh.aj, $$0 -> enw.a);
   public static final js<eot<?>> X = a(mh.aB, $$0 -> eot.b);
   public static final js<emz<?>> Y = a(mh.C, $$0 -> emz.a);
   public static final js<MapCodec<? extends dko>> Z = a(mh.d, dkp::a);
   public static final js<MapCodec<? extends ecm>> aa = a(mh.k, eco::a);
   public static final js<MapCodec<? extends ehe.f>> ab = a(mh.S, ehe.f::a);
   public static final js<MapCodec<? extends ehe.o>> ac = a(mh.T, ehe.o::a);
   public static final js<MapCodec<? extends egg>> ad = a(mh.t, egh::a);
   public static final js<MapCodec<? extends dmm>> ae = a(mh.h, dmn::a);
   public static final js<evj<?>> af = a(mh.av, $$0 -> evj.e);
   public static final js<esr<?>> ag = a(mh.au, $$0 -> esr.d);
   public static final js<MapCodec<? extends esu>> ah = a(mh.ab, esv::a);
   public static final js<dyf> ai = a(mh.s, dyg::a);
   public static final js<cyb> aj = a(mh.o, cyc::a);
   public static final js<at<?>> ak = a(mh.bj, aq::a);
   public static final js<yp<?>> al = a(mh.X, yq::a);
   public static final js<kj<?>> am = a(mh.r, kk::a);
   public static final js<MapCodec<? extends bz>> an = a(mh.A, ca::a);
   public static final js<kt.b<?>> ao = a(mh.q, ku::a);
   public static final js<eyl> ap = a(mh.R, eym::a);
   public static final js<kj<?>> aq = a(mh.u, dfy::a);
   public static final js<MapCodec<? extends dge>> ar = a(mh.w, dge::a);
   public static final js<MapCodec<? extends dgo>> as = a(mh.v, dgo::a);
   public static final js<MapCodec<? extends dgp>> at = a(mh.x, dgp::b);
   public static final js<MapCodec<? extends dgq>> au = a(mh.z, dgq::a);
   public static final js<MapCodec<? extends dhf>> av = a(mh.y, dhg::a);
   public static final js<dcy.a<?>> aw = a(mh.n, $$0 -> dcy.a.a);
   public static final js<dfh.a<?>> ax = a(mh.ag, dfk::a);
   public static final js<dfn.i<?>> ay = a(mh.ao, dfp::a);
   public static final js<dee> az = a(mh.af, ded::a);
   public static final js<arx> aA = a(mh.aA, $$0 -> arx.i);
   public static final js<MapCodec<? extends tl>> aB = a(mh.ax, tl::a);
   public static final js<MapCodec<? extends sr>> aC = a(mh.az, sr::a);
   public static final js<MapCodec<? extends ctn>> aD = a(mh.aq, cto::a);
   public static final js<Consumer<sp>> aE = a(mh.ay, sd::a);
   public static final js<? extends js<?>> aF = aI;

   private static <T> js<T> a(alf<? extends js<T>> $$0, mg.a<T> $$1) {
      return a($$0, new jn<>($$0, Lifecycle.stable(), false), $$1);
   }

   private static <T> js<T> b(alf<? extends js<T>> $$0, mg.a<T> $$1) {
      return a($$0, new jn<>($$0, Lifecycle.stable(), true), $$1);
   }

   private static <T> ja<T> a(alf<? extends js<T>> $$0, String $$1, mg.a<T> $$2) {
      return a($$0, new iz<>($$1, $$0, Lifecycle.stable(), false), $$2);
   }

   private static <T> ja<T> b(alf<? extends js<T>> $$0, String $$1, mg.a<T> $$2) {
      return a($$0, new iz<>($$1, $$0, Lifecycle.stable(), true), $$2);
   }

   private static <T, R extends kb<T>> R a(alf<? extends js<T>> $$0, R $$1, mg.a<T> $$2) {
      ali.a(() -> "registry " + $$0.a());
      alg $$3 = $$0.a();
      aH.put($$3, () -> $$2.run($$1));
      aI.a((alf<kb<?>>)$$0, $$1, jr.a);
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

      for (js<?> $$0 : aF) {
         c($$0);
         $$0.n();
      }
   }

   private static <T extends js<?>> void b(js<T> $$0) {
      $$0.forEach($$1 -> {
         if ($$1.i().isEmpty()) {
            ag.b("Registry '" + $$0.b((T)$$1) + "' was empty after loading");
         }

         if ($$1 instanceof ja) {
            alg $$2 = ((ja)$$1).b();
            Validate.notNull($$1.a($$2), "Missing default of DefaultedMappedRegistry: " + $$2, new Object[0]);
         }
      });
   }

   public static <T> jg<T> a(js<T> $$0) {
      return ((kb)$$0).p();
   }

   private static void c(js<?> $$0) {
      ((jn)$$0).o();
   }

   @FunctionalInterface
   interface a<T> {
      Object run(js<T> var1);
   }
}
