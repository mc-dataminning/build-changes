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
   public static final ja<eft> a = a(mh.H, "step", eft::a);
   public static final js<awm> b = a(mh.ap, $$0 -> awn.oj);
   public static final ja<ewz> c = b(mh.F, "empty", $$0 -> exb.a);
   public static final js<bvk> d = a(mh.W, bvo::a);
   public static final ja<dmr> e = b(mh.i, "air", $$0 -> dmt.a);
   public static final ja<bwr<?>> f = b(mh.B, "pig", $$0 -> bwr.aQ);
   public static final ja<czj> g = b(mh.K, "air", $$0 -> czr.a);
   public static final js<dbh> h = a(mh.ae, dbk::a);
   public static final js<lx<?>> i = a(mh.Y, $$0 -> ly.b);
   public static final js<dxt<?>> j = b(mh.e, $$0 -> dxt.a);
   public static final js<alg> k = a(mh.p, $$0 -> awx.E);
   public static final ja<edr> l = a(mh.l, "empty", $$0 -> edr.c);
   public static final js<evk<?>> m = a(mh.al, $$0 -> evk.a);
   public static final js<evy<?>> n = a(mh.ak, $$0 -> evy.b);
   public static final js<evd<?>> o = a(mh.ad, $$0 -> evd.a);
   public static final js<cwo<?>> p = a(mh.V, $$0 -> cwo.i);
   public static final js<dep<?>> q = a(mh.ai, $$0 -> dep.a);
   public static final js<deo<?>> r = a(mh.ah, $$0 -> deo.b);
   public static final js<byk> s = a(mh.c, byp::a);
   public static final js<efy<?>> t = a(mh.ac, $$0 -> efy.a);
   public static final js<ig<?, ?>> u = a(mh.m, ih::a);
   public static final js<aww<?>> v = a(mh.ar, $$0 -> awx.c);
   public static final ja<crd> w = a(mh.aE, "plains", crd::a);
   public static final ja<crb> x = a(mh.aD, "none", crb::a);
   public static final js<cio> y = a(mh.aa, cip::a);
   public static final ja<cgl<?>> z = a(mh.U, "dummy", $$0 -> cgl.a);
   public static final ja<chs<?>> A = a(mh.an, "dummy", $$0 -> chs.a);
   public static final js<cti> B = a(mh.am, $$0 -> cti.c);
   public static final js<ctg> C = a(mh.b, $$0 -> ctg.b);
   public static final js<fak> D = a(mh.P, $$0 -> fah.b);
   public static final js<fbi<?>> E = a(mh.M, $$0 -> fbj.e);
   public static final js<fdd> F = a(mh.L, $$0 -> fde.a);
   public static final js<fdx> G = a(mh.O, $$0 -> fdz.b);
   public static final js<fdp> H = a(mh.N, $$0 -> fdr.c);
   public static final js<feg> I = a(mh.Q, $$0 -> fei.c);
   public static final js<btk<?>> J = a(mh.E, $$0 -> btk.a);
   public static final js<btm<?>> K = a(mh.J, $$0 -> btm.a);
   public static final js<epv<?>> L = a(mh.I, $$0 -> epv.a);
   public static final js<eia<?>> M = a(mh.f, $$0 -> eia.k);
   public static final js<eiy<?>> N = a(mh.j, $$0 -> eiy.a);
   public static final js<ejy<?>> O = a(mh.D, $$0 -> ejy.I);
   public static final js<esl<?>> P = a(mh.at, $$0 -> esl.a);
   public static final js<ese> Q = a(mh.as, $$0 -> ese.c);
   public static final js<erw<?>> R = a(mh.aw, $$0 -> erw.f);
   public static final js<eqv<?>> S = a(mh.Z, $$0 -> eqv.f);
   public static final js<eoe<?>> T = a(mh.g, $$0 -> eoe.a);
   public static final js<enp<?>> U = a(mh.G, $$0 -> enp.a);
   public static final js<epk<?>> V = a(mh.aC, $$0 -> epk.a);
   public static final js<eob<?>> W = a(mh.aj, $$0 -> eob.a);
   public static final js<eoy<?>> X = a(mh.aB, $$0 -> eoy.b);
   public static final js<ene<?>> Y = a(mh.C, $$0 -> ene.a);
   public static final js<MapCodec<? extends dkt>> Z = a(mh.d, dku::a);
   public static final js<MapCodec<? extends ecr>> aa = a(mh.k, ect::a);
   public static final js<MapCodec<? extends ehj.f>> ab = a(mh.S, ehj.f::a);
   public static final js<MapCodec<? extends ehj.o>> ac = a(mh.T, ehj.o::a);
   public static final js<MapCodec<? extends egl>> ad = a(mh.t, egm::a);
   public static final js<MapCodec<? extends dmr>> ae = a(mh.h, dms::a);
   public static final js<evo<?>> af = a(mh.av, $$0 -> evo.e);
   public static final js<esw<?>> ag = a(mh.au, $$0 -> esw.d);
   public static final js<MapCodec<? extends esz>> ah = a(mh.ab, eta::a);
   public static final js<dyk> ai = a(mh.s, dyl::a);
   public static final js<cye> aj = a(mh.o, cyf::a);
   public static final js<at<?>> ak = a(mh.bj, aq::a);
   public static final js<yp<?>> al = a(mh.X, yq::a);
   public static final js<kj<?>> am = a(mh.r, kk::a);
   public static final js<MapCodec<? extends bz>> an = a(mh.A, ca::a);
   public static final js<kt.b<?>> ao = a(mh.q, ku::a);
   public static final js<eyq> ap = a(mh.R, eyr::a);
   public static final js<kj<?>> aq = a(mh.u, dgb::a);
   public static final js<MapCodec<? extends dgh>> ar = a(mh.w, dgh::a);
   public static final js<MapCodec<? extends dgr>> as = a(mh.v, dgr::a);
   public static final js<MapCodec<? extends dgs>> at = a(mh.x, dgs::b);
   public static final js<MapCodec<? extends dgt>> au = a(mh.z, dgt::a);
   public static final js<MapCodec<? extends dhi>> av = a(mh.y, dhj::a);
   public static final js<ddb.a<?>> aw = a(mh.n, $$0 -> ddb.a.a);
   public static final js<dfk.a<?>> ax = a(mh.ag, dfn::a);
   public static final js<dfq.i<?>> ay = a(mh.ao, dfs::a);
   public static final js<deh> az = a(mh.af, deg::a);
   public static final js<arx> aA = a(mh.aA, $$0 -> arx.i);
   public static final js<MapCodec<? extends tl>> aB = a(mh.ax, tl::a);
   public static final js<MapCodec<? extends sr>> aC = a(mh.az, sr::a);
   public static final js<MapCodec<? extends ctq>> aD = a(mh.aq, ctr::a);
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
