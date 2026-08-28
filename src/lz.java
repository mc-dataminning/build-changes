import com.google.common.collect.Maps;
import com.mojang.logging.LogUtils;
import com.mojang.serialization.Lifecycle;
import com.mojang.serialization.MapCodec;
import java.util.Map;
import java.util.function.Supplier;
import org.apache.commons.lang3.Validate;
import org.slf4j.Logger;

public class lz {
   private static final Logger aA = LogUtils.getLogger();
   private static final Map<all, Supplier<?>> aB = Maps.newLinkedHashMap();
   private static final km<km<?>> aC = new jy<>(alk.a(ma.a), Lifecycle.stable());
   public static final jl<eak> a = a(ma.G, "step", eak::a);
   public static final kd<awn> b = a(ma.al, $$0 -> awo.nB);
   public static final jl<ern> c = b(ma.D, "empty", $$0 -> erp.a);
   public static final kd<btl> d = a(ma.W, btp::a);
   public static final jl<dij> e = b(ma.f, "air", $$0 -> dil.a);
   public static final jl<bup<?>> f = b(ma.z, "pig", $$0 -> bup.az);
   public static final jl<cwb> g = b(ma.K, "air", $$0 -> cwj.a);
   public static final kd<cyc> h = a(ma.ad, cyf::a);
   public static final kd<lr<?>> i = a(ma.Y, $$0 -> ls.b);
   public static final kd<dst<?>> j = b(ma.h, $$0 -> dst.a);
   public static final kd<all> k = a(ma.r, $$0 -> awy.E);
   public static final jl<dyk> l = a(ma.o, "empty", $$0 -> dyk.c);
   public static final kd<epy<?>> m = a(ma.ah, $$0 -> epy.a);
   public static final kd<eqm<?>> n = a(ma.ai, $$0 -> eqm.b);
   public static final kd<epr<?>> o = a(ma.ac, $$0 -> epr.a);
   public static final kd<ctb<?>> p = a(ma.V, $$0 -> ctb.i);
   public static final kd<daz<?>> q = a(ma.af, $$0 -> daz.a);
   public static final kd<day<?>> r = a(ma.ae, $$0 -> day.b);
   public static final kd<bwh> s = a(ma.c, bwm::a);
   public static final kd<eap<?>> t = a(ma.ab, $$0 -> eap.a);
   public static final kd<is<?, ?>> u = a(ma.p, it::a);
   public static final kd<awx<?>> v = a(ma.am, $$0 -> awy.c);
   public static final jl<coh> w = a(ma.aw, "plains", $$0 -> coh.c);
   public static final jl<cof> x = a(ma.av, "none", $$0 -> cof.b);
   public static final kd<cgl> y = a(ma.aa, cgm::a);
   public static final jl<cei<?>> z = a(ma.U, "dummy", $$0 -> cei.a);
   public static final jl<cfp<?>> A = a(ma.ak, "dummy", $$0 -> cfp.a);
   public static final kd<cqk> B = a(ma.aj, $$0 -> cqk.c);
   public static final kd<cqi> C = a(ma.b, $$0 -> cqi.b);
   public static final kd<eux> D = a(ma.Q, $$0 -> euu.b);
   public static final kd<evv<?>> E = a(ma.N, $$0 -> evw.e);
   public static final kd<exs> F = a(ma.M, $$0 -> ext.a);
   public static final kd<eym> G = a(ma.P, $$0 -> eyo.b);
   public static final kd<eye> H = a(ma.O, $$0 -> eyg.c);
   public static final kd<eyv> I = a(ma.R, $$0 -> eyx.c);
   public static final kd<brl<?>> J = a(ma.C, $$0 -> brl.a);
   public static final kd<brn<?>> K = a(ma.J, $$0 -> brn.a);
   public static final kd<ekj<?>> L = a(ma.H, $$0 -> ekj.a);
   public static final kd<ecr<?>> M = a(ma.i, $$0 -> ecr.k);
   public static final kd<edp<?>> N = a(ma.k, $$0 -> edp.a);
   public static final kd<eep<?>> O = a(ma.A, $$0 -> eep.I);
   public static final kd<emz<?>> P = a(ma.ao, $$0 -> emz.a);
   public static final kd<ems> Q = a(ma.an, $$0 -> ems.c);
   public static final kd<emk<?>> R = a(ma.as, $$0 -> emk.f);
   public static final kd<elj<?>> S = a(ma.Z, $$0 -> elj.f);
   public static final kd<eiv<?>> T = a(ma.j, $$0 -> eiv.a);
   public static final kd<eig<?>> U = a(ma.E, $$0 -> eig.a);
   public static final kd<ejy<?>> V = a(ma.au, $$0 -> ejy.a);
   public static final kd<eis<?>> W = a(ma.ag, $$0 -> eis.a);
   public static final kd<ejm<?>> X = a(ma.at, $$0 -> ejm.b);
   public static final kd<ehv<?>> Y = a(ma.B, $$0 -> ehv.a);
   public static final kd<MapCodec<? extends dgl>> Z = a(ma.e, dgm::a);
   public static final kd<MapCodec<? extends dxk>> aa = a(ma.n, dxm::a);
   public static final kd<MapCodec<? extends eca.f>> ab = a(ma.S, eca.f::a);
   public static final kd<MapCodec<? extends eca.o>> ac = a(ma.T, eca.o::a);
   public static final kd<MapCodec<? extends ebc>> ad = a(ma.t, ebd::a);
   public static final kd<MapCodec<? extends dij>> ae = a(ma.g, dik::a);
   public static final kd<eqc<?>> af = a(ma.ar, $$0 -> eqc.e);
   public static final kd<enk<?>> ag = a(ma.ap, $$0 -> enk.d);
   public static final kd<MapCodec<? extends enn>> ah = a(ma.aq, eno::a);
   public static final kd<cgz> ai = a(ma.l, cgz::a);
   public static final kd<chg> aj = a(ma.F, chg::a);
   public static final kd<dti> ak = a(ma.ax, dtj::a);
   public static final kd<cuu> al = a(ma.q, cuv::a);
   public static final kd<ar<?>> am = a(ma.aW, ao::a);
   public static final kd<zc<?>> an = a(ma.ay, zd::a);
   public static final kd<kt<?>> ao = a(ma.az, ku::a);
   public static final kd<MapCodec<? extends bx>> ap = a(ma.aA, by::a);
   public static final kd<cv.a<?>> aq = a(ma.aB, cw::a);
   public static final kd<etd> ar = a(ma.aC, ete::a);
   public static final kd<kt<?>> as = a(ma.aD, dbx::a);
   public static final kd<MapCodec<? extends dcd>> at = a(ma.v, dcd::a);
   public static final kd<MapCodec<? extends dcn>> au = a(ma.u, dcn::a);
   public static final kd<MapCodec<? extends dco>> av = a(ma.w, dco::b);
   public static final kd<MapCodec<? extends dcp>> aw = a(ma.y, dcp::a);
   public static final kd<MapCodec<? extends dde>> ax = a(ma.x, ddf::a);
   public static final kd<czr.a<?>> ay = a(ma.aE, $$0 -> czr.a.a);
   public static final kd<? extends kd<?>> az = aC;

   private static <T> kd<T> a(alk<? extends kd<T>> $$0, lz.a<T> $$1) {
      return a($$0, new jy<>($$0, Lifecycle.stable(), false), $$1);
   }

   private static <T> kd<T> b(alk<? extends kd<T>> $$0, lz.a<T> $$1) {
      return a($$0, new jy<>($$0, Lifecycle.stable(), true), $$1);
   }

   private static <T> jl<T> a(alk<? extends kd<T>> $$0, String $$1, lz.a<T> $$2) {
      return a($$0, new jk<>($$1, $$0, Lifecycle.stable(), false), $$2);
   }

   private static <T> jl<T> b(alk<? extends kd<T>> $$0, String $$1, lz.a<T> $$2) {
      return a($$0, new jk<>($$1, $$0, Lifecycle.stable(), true), $$2);
   }

   private static <T, R extends km<T>> R a(alk<? extends kd<T>> $$0, R $$1, lz.a<T> $$2) {
      aln.a(() -> "registry " + $$0);
      all $$3 = $$0.a();
      aB.put($$3, () -> $$2.run($$1));
      aC.a((alk<km<?>>)$$0, $$1, kc.a);
      return $$1;
   }

   public static void a() {
      b();
      c();
      b(az);
   }

   private static void b() {
      aB.forEach(($$0, $$1) -> {
         if ($$1.get() == null) {
            aA.error("Unable to bootstrap registry '{}'", $$0);
         }
      });
   }

   private static void c() {
      az.n();

      for (kd<?> $$0 : az) {
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
            all $$2 = ((jl)$$1).b();
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
