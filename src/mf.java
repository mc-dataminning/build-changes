import com.google.common.collect.Maps;
import com.mojang.logging.LogUtils;
import com.mojang.serialization.Lifecycle;
import com.mojang.serialization.MapCodec;
import java.util.Map;
import java.util.function.Consumer;
import java.util.function.Supplier;
import org.apache.commons.lang3.Validate;
import org.slf4j.Logger;

public class mf {
   private static final Logger aG = LogUtils.getLogger();
   private static final Map<alg, Supplier<?>> aH = Maps.newLinkedHashMap();
   private static final ka<ka<?>> aI = new jm<>(alf.a(mg.a), Lifecycle.stable());
   public static final iz<efh> a = a(mg.H, "step", efh::a);
   public static final jr<awm> b = a(mg.ap, $$0 -> awn.oj);
   public static final iz<ewn> c = b(mg.F, "empty", $$0 -> ewp.a);
   public static final jr<bvh> d = a(mg.W, bvl::a);
   public static final iz<dmf> e = b(mg.i, "air", $$0 -> dmh.a);
   public static final iz<bwo<?>> f = b(mg.B, "pig", $$0 -> bwo.aQ);
   public static final iz<cyz> g = b(mg.K, "air", $$0 -> czh.a);
   public static final jr<dax> h = a(mg.ae, dba::a);
   public static final jr<lw<?>> i = a(mg.Y, $$0 -> lx.b);
   public static final jr<dxh<?>> j = b(mg.e, $$0 -> dxh.a);
   public static final jr<alg> k = a(mg.p, $$0 -> awx.E);
   public static final iz<edf> l = a(mg.l, "empty", $$0 -> edf.c);
   public static final jr<euy<?>> m = a(mg.al, $$0 -> euy.a);
   public static final jr<evm<?>> n = a(mg.ak, $$0 -> evm.b);
   public static final jr<eur<?>> o = a(mg.ad, $$0 -> eur.a);
   public static final jr<cwe<?>> p = a(mg.V, $$0 -> cwe.i);
   public static final jr<def<?>> q = a(mg.ai, $$0 -> def.a);
   public static final jr<dee<?>> r = a(mg.ah, $$0 -> dee.b);
   public static final jr<byf> s = a(mg.c, byk::a);
   public static final jr<efm<?>> t = a(mg.ac, $$0 -> efm.a);
   public static final jr<ie<?, ?>> u = a(mg.m, ig::a);
   public static final jr<aww<?>> v = a(mg.ar, $$0 -> awx.c);
   public static final iz<cqt> w = a(mg.aE, "plains", cqt::a);
   public static final iz<cqr> x = a(mg.aD, "none", cqr::a);
   public static final jr<cij> y = a(mg.aa, cik::a);
   public static final iz<cgg<?>> z = a(mg.U, "dummy", $$0 -> cgg.a);
   public static final iz<chn<?>> A = a(mg.an, "dummy", $$0 -> chn.a);
   public static final jr<csy> B = a(mg.am, $$0 -> csy.c);
   public static final jr<csw> C = a(mg.b, $$0 -> csw.b);
   public static final jr<ezy> D = a(mg.P, $$0 -> ezv.b);
   public static final jr<faw<?>> E = a(mg.M, $$0 -> fax.e);
   public static final jr<fcr> F = a(mg.L, $$0 -> fcs.a);
   public static final jr<fdl> G = a(mg.O, $$0 -> fdn.b);
   public static final jr<fdd> H = a(mg.N, $$0 -> fdf.c);
   public static final jr<fdu> I = a(mg.Q, $$0 -> fdw.c);
   public static final jr<bth<?>> J = a(mg.E, $$0 -> bth.a);
   public static final jr<btj<?>> K = a(mg.J, $$0 -> btj.a);
   public static final jr<epj<?>> L = a(mg.I, $$0 -> epj.a);
   public static final jr<eho<?>> M = a(mg.f, $$0 -> eho.k);
   public static final jr<eim<?>> N = a(mg.j, $$0 -> eim.a);
   public static final jr<ejm<?>> O = a(mg.D, $$0 -> ejm.I);
   public static final jr<erz<?>> P = a(mg.at, $$0 -> erz.a);
   public static final jr<ers> Q = a(mg.as, $$0 -> ers.c);
   public static final jr<erk<?>> R = a(mg.aw, $$0 -> erk.f);
   public static final jr<eqj<?>> S = a(mg.Z, $$0 -> eqj.f);
   public static final jr<ens<?>> T = a(mg.g, $$0 -> ens.a);
   public static final jr<end<?>> U = a(mg.G, $$0 -> end.a);
   public static final jr<eoy<?>> V = a(mg.aC, $$0 -> eoy.a);
   public static final jr<enp<?>> W = a(mg.aj, $$0 -> enp.a);
   public static final jr<eom<?>> X = a(mg.aB, $$0 -> eom.b);
   public static final jr<ems<?>> Y = a(mg.C, $$0 -> ems.a);
   public static final jr<MapCodec<? extends dkh>> Z = a(mg.d, dki::a);
   public static final jr<MapCodec<? extends ecf>> aa = a(mg.k, ech::a);
   public static final jr<MapCodec<? extends egx.f>> ab = a(mg.S, egx.f::a);
   public static final jr<MapCodec<? extends egx.o>> ac = a(mg.T, egx.o::a);
   public static final jr<MapCodec<? extends efz>> ad = a(mg.t, ega::a);
   public static final jr<MapCodec<? extends dmf>> ae = a(mg.h, dmg::a);
   public static final jr<evc<?>> af = a(mg.av, $$0 -> evc.e);
   public static final jr<esk<?>> ag = a(mg.au, $$0 -> esk.d);
   public static final jr<MapCodec<? extends esn>> ah = a(mg.ab, eso::a);
   public static final jr<dxy> ai = a(mg.s, dxz::a);
   public static final jr<cxu> aj = a(mg.o, cxv::a);
   public static final jr<as<?>> ak = a(mg.bj, ap::a);
   public static final jr<yp<?>> al = a(mg.X, yq::a);
   public static final jr<ki<?>> am = a(mg.r, kj::a);
   public static final jr<MapCodec<? extends by>> an = a(mg.A, bz::a);
   public static final jr<ks.b<?>> ao = a(mg.q, kt::a);
   public static final jr<eye> ap = a(mg.R, eyf::a);
   public static final jr<ki<?>> aq = a(mg.u, dfr::a);
   public static final jr<MapCodec<? extends dfx>> ar = a(mg.w, dfx::a);
   public static final jr<MapCodec<? extends dgh>> as = a(mg.v, dgh::a);
   public static final jr<MapCodec<? extends dgi>> at = a(mg.x, dgi::b);
   public static final jr<MapCodec<? extends dgj>> au = a(mg.z, dgj::a);
   public static final jr<MapCodec<? extends dgy>> av = a(mg.y, dgz::a);
   public static final jr<dcr.a<?>> aw = a(mg.n, $$0 -> dcr.a.a);
   public static final jr<dfa.a<?>> ax = a(mg.ag, dfd::a);
   public static final jr<dfg.i<?>> ay = a(mg.ao, dfi::a);
   public static final jr<ddx> az = a(mg.af, ddw::a);
   public static final jr<arx> aA = a(mg.aA, $$0 -> arx.i);
   public static final jr<MapCodec<? extends tl>> aB = a(mg.ax, tl::a);
   public static final jr<MapCodec<? extends sr>> aC = a(mg.az, sr::a);
   public static final jr<MapCodec<? extends ctg>> aD = a(mg.aq, cth::a);
   public static final jr<Consumer<sp>> aE = a(mg.ay, sd::a);
   public static final jr<? extends jr<?>> aF = aI;

   private static <T> jr<T> a(alf<? extends jr<T>> $$0, mf.a<T> $$1) {
      return a($$0, new jm<>($$0, Lifecycle.stable(), false), $$1);
   }

   private static <T> jr<T> b(alf<? extends jr<T>> $$0, mf.a<T> $$1) {
      return a($$0, new jm<>($$0, Lifecycle.stable(), true), $$1);
   }

   private static <T> iz<T> a(alf<? extends jr<T>> $$0, String $$1, mf.a<T> $$2) {
      return a($$0, new iy<>($$1, $$0, Lifecycle.stable(), false), $$2);
   }

   private static <T> iz<T> b(alf<? extends jr<T>> $$0, String $$1, mf.a<T> $$2) {
      return a($$0, new iy<>($$1, $$0, Lifecycle.stable(), true), $$2);
   }

   private static <T, R extends ka<T>> R a(alf<? extends jr<T>> $$0, R $$1, mf.a<T> $$2) {
      ali.a(() -> "registry " + $$0.a());
      alg $$3 = $$0.a();
      aH.put($$3, () -> $$2.run($$1));
      aI.a((alf<ka<?>>)$$0, $$1, jq.a);
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

      for (jr<?> $$0 : aF) {
         c($$0);
         $$0.n();
      }
   }

   private static <T extends jr<?>> void b(jr<T> $$0) {
      $$0.forEach($$1 -> {
         if ($$1.i().isEmpty()) {
            af.b("Registry '" + $$0.b((T)$$1) + "' was empty after loading");
         }

         if ($$1 instanceof iz) {
            alg $$2 = ((iz)$$1).b();
            Validate.notNull($$1.a($$2), "Missing default of DefaultedMappedRegistry: " + $$2, new Object[0]);
         }
      });
   }

   public static <T> jf<T> a(jr<T> $$0) {
      return ((ka)$$0).p();
   }

   private static void c(jr<?> $$0) {
      ((jm)$$0).o();
   }

   @FunctionalInterface
   interface a<T> {
      Object run(jr<T> var1);
   }
}
