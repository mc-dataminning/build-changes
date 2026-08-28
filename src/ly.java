import com.google.common.collect.Maps;
import com.mojang.logging.LogUtils;
import com.mojang.serialization.Lifecycle;
import com.mojang.serialization.MapCodec;
import java.util.Map;
import java.util.function.Supplier;
import org.apache.commons.lang3.Validate;
import org.slf4j.Logger;

public class ly {
   private static final Logger aA = LogUtils.getLogger();
   private static final Map<ali, Supplier<?>> aB = Maps.newLinkedHashMap();
   private static final km<km<?>> aC = new jy<>(alh.a(lz.a), Lifecycle.stable());
   public static final jl<eag> a = a(lz.G, "step", eag::a);
   public static final kd<awk> b = a(lz.al, $$0 -> awl.nB);
   public static final jl<erj> c = b(lz.D, "empty", $$0 -> erl.a);
   public static final kd<bth> d = a(lz.W, btl::a);
   public static final jl<die> e = b(lz.f, "air", $$0 -> dig.a);
   public static final jl<bul<?>> f = b(lz.z, "pig", $$0 -> bul.az);
   public static final jl<cvx> g = b(lz.K, "air", $$0 -> cwf.a);
   public static final kd<cxy> h = a(lz.ad, cyb::a);
   public static final kd<lq<?>> i = a(lz.Y, $$0 -> lr.b);
   public static final kd<dso<?>> j = b(lz.h, $$0 -> dso.a);
   public static final kd<ali> k = a(lz.r, $$0 -> awv.E);
   public static final jl<dyg> l = a(lz.o, "empty", $$0 -> dyg.c);
   public static final kd<epu<?>> m = a(lz.ah, $$0 -> epu.a);
   public static final kd<eqi<?>> n = a(lz.ai, $$0 -> eqi.b);
   public static final kd<epn<?>> o = a(lz.ac, $$0 -> epn.a);
   public static final kd<csx<?>> p = a(lz.V, $$0 -> csx.i);
   public static final kd<dav<?>> q = a(lz.af, $$0 -> dav.a);
   public static final kd<dau<?>> r = a(lz.ae, $$0 -> dau.b);
   public static final kd<bwd> s = a(lz.c, bwi::a);
   public static final kd<eal<?>> t = a(lz.ab, $$0 -> eal.a);
   public static final kd<is<?, ?>> u = a(lz.p, it::a);
   public static final kd<awu<?>> v = a(lz.am, $$0 -> awv.c);
   public static final jl<cod> w = a(lz.aw, "plains", $$0 -> cod.c);
   public static final jl<cob> x = a(lz.av, "none", $$0 -> cob.b);
   public static final kd<cgh> y = a(lz.aa, cgi::a);
   public static final jl<cee<?>> z = a(lz.U, "dummy", $$0 -> cee.a);
   public static final jl<cfl<?>> A = a(lz.ak, "dummy", $$0 -> cfl.a);
   public static final kd<cqg> B = a(lz.aj, $$0 -> cqg.c);
   public static final kd<cqe> C = a(lz.b, $$0 -> cqe.b);
   public static final kd<eut> D = a(lz.Q, $$0 -> euq.b);
   public static final kd<evr<?>> E = a(lz.N, $$0 -> evs.e);
   public static final kd<exo> F = a(lz.M, $$0 -> exp.a);
   public static final kd<eyi> G = a(lz.P, $$0 -> eyk.b);
   public static final kd<eya> H = a(lz.O, $$0 -> eyc.c);
   public static final kd<eyr> I = a(lz.R, $$0 -> eyt.c);
   public static final kd<brh<?>> J = a(lz.C, $$0 -> brh.a);
   public static final kd<brj<?>> K = a(lz.J, $$0 -> brj.a);
   public static final kd<ekf<?>> L = a(lz.H, $$0 -> ekf.a);
   public static final kd<ecn<?>> M = a(lz.i, $$0 -> ecn.k);
   public static final kd<edl<?>> N = a(lz.k, $$0 -> edl.a);
   public static final kd<eel<?>> O = a(lz.A, $$0 -> eel.I);
   public static final kd<emv<?>> P = a(lz.ao, $$0 -> emv.a);
   public static final kd<emo> Q = a(lz.an, $$0 -> emo.c);
   public static final kd<emg<?>> R = a(lz.as, $$0 -> emg.f);
   public static final kd<elf<?>> S = a(lz.Z, $$0 -> elf.f);
   public static final kd<eir<?>> T = a(lz.j, $$0 -> eir.a);
   public static final kd<eic<?>> U = a(lz.E, $$0 -> eic.a);
   public static final kd<eju<?>> V = a(lz.au, $$0 -> eju.a);
   public static final kd<eio<?>> W = a(lz.ag, $$0 -> eio.a);
   public static final kd<eji<?>> X = a(lz.at, $$0 -> eji.b);
   public static final kd<ehr<?>> Y = a(lz.B, $$0 -> ehr.a);
   public static final kd<MapCodec<? extends dgg>> Z = a(lz.e, dgh::a);
   public static final kd<MapCodec<? extends dxg>> aa = a(lz.n, dxi::a);
   public static final kd<MapCodec<? extends ebw.f>> ab = a(lz.S, ebw.f::a);
   public static final kd<MapCodec<? extends ebw.o>> ac = a(lz.T, ebw.o::a);
   public static final kd<MapCodec<? extends eay>> ad = a(lz.t, eaz::a);
   public static final kd<MapCodec<? extends die>> ae = a(lz.g, dif::a);
   public static final kd<epy<?>> af = a(lz.ar, $$0 -> epy.e);
   public static final kd<eng<?>> ag = a(lz.ap, $$0 -> eng.d);
   public static final kd<MapCodec<? extends enj>> ah = a(lz.aq, enk::a);
   public static final kd<cgv> ai = a(lz.l, cgv::a);
   public static final kd<chc> aj = a(lz.F, chc::a);
   public static final kd<dtd> ak = a(lz.ax, dte::a);
   public static final kd<cuq> al = a(lz.q, cur::a);
   public static final kd<ar<?>> am = a(lz.aW, ao::a);
   public static final kd<yz<?>> an = a(lz.ay, za::a);
   public static final kd<kt<?>> ao = a(lz.az, ku::a);
   public static final kd<MapCodec<? extends bx>> ap = a(lz.aA, by::a);
   public static final kd<cv.a<?>> aq = a(lz.aB, cw::a);
   public static final kd<esz> ar = a(lz.aC, eta::a);
   public static final kd<kt<?>> as = a(lz.aD, dbt::a);
   public static final kd<MapCodec<? extends dbz>> at = a(lz.v, dbz::a);
   public static final kd<MapCodec<? extends dcj>> au = a(lz.u, dcj::a);
   public static final kd<MapCodec<? extends dck>> av = a(lz.w, dck::b);
   public static final kd<MapCodec<? extends dcl>> aw = a(lz.y, dcl::a);
   public static final kd<MapCodec<? extends dda>> ax = a(lz.x, ddb::a);
   public static final kd<czn.a<?>> ay = a(lz.aE, $$0 -> czn.a.a);
   public static final kd<? extends kd<?>> az = aC;

   private static <T> kd<T> a(alh<? extends kd<T>> $$0, ly.a<T> $$1) {
      return a($$0, new jy<>($$0, Lifecycle.stable(), false), $$1);
   }

   private static <T> kd<T> b(alh<? extends kd<T>> $$0, ly.a<T> $$1) {
      return a($$0, new jy<>($$0, Lifecycle.stable(), true), $$1);
   }

   private static <T> jl<T> a(alh<? extends kd<T>> $$0, String $$1, ly.a<T> $$2) {
      return a($$0, new jk<>($$1, $$0, Lifecycle.stable(), false), $$2);
   }

   private static <T> jl<T> b(alh<? extends kd<T>> $$0, String $$1, ly.a<T> $$2) {
      return a($$0, new jk<>($$1, $$0, Lifecycle.stable(), true), $$2);
   }

   private static <T, R extends km<T>> R a(alh<? extends kd<T>> $$0, R $$1, ly.a<T> $$2) {
      alk.a(() -> "registry " + $$0);
      ali $$3 = $$0.a();
      aB.put($$3, () -> $$2.run($$1));
      aC.a((alh<km<?>>)$$0, $$1, kc.a);
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
            ali $$2 = ((jl)$$1).b();
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
