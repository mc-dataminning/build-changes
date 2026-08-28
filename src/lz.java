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
   private static final Map<alj, Supplier<?>> aB = Maps.newLinkedHashMap();
   private static final km<km<?>> aC = new jy<>(ali.a(ma.a), Lifecycle.stable());
   public static final jl<ear> a = a(ma.G, "step", ear::a);
   public static final kd<awm> b = a(ma.al, $$0 -> awn.nB);
   public static final jl<eru> c = b(ma.D, "empty", $$0 -> erw.a);
   public static final kd<bto> d = a(ma.W, bts::a);
   public static final jl<diq> e = b(ma.f, "air", $$0 -> dis.a);
   public static final jl<bus<?>> f = b(ma.z, "pig", $$0 -> bus.aN);
   public static final jl<cwi> g = b(ma.K, "air", $$0 -> cwq.a);
   public static final kd<cyj> h = a(ma.ad, cym::a);
   public static final kd<lr<?>> i = a(ma.Y, $$0 -> ls.b);
   public static final kd<dta<?>> j = b(ma.h, $$0 -> dta.a);
   public static final kd<alj> k = a(ma.r, $$0 -> awx.E);
   public static final jl<dyr> l = a(ma.o, "empty", $$0 -> dyr.c);
   public static final kd<eqf<?>> m = a(ma.ah, $$0 -> eqf.a);
   public static final kd<eqt<?>> n = a(ma.ai, $$0 -> eqt.b);
   public static final kd<epy<?>> o = a(ma.ac, $$0 -> epy.a);
   public static final kd<cti<?>> p = a(ma.V, $$0 -> cti.i);
   public static final kd<dbg<?>> q = a(ma.af, $$0 -> dbg.a);
   public static final kd<dbf<?>> r = a(ma.ae, $$0 -> dbf.b);
   public static final kd<bwk> s = a(ma.c, bwp::a);
   public static final kd<eaw<?>> t = a(ma.ab, $$0 -> eaw.a);
   public static final kd<is<?, ?>> u = a(ma.p, it::a);
   public static final kd<aww<?>> v = a(ma.am, $$0 -> awx.c);
   public static final jl<cok> w = a(ma.aw, "plains", $$0 -> cok.c);
   public static final jl<coi> x = a(ma.av, "none", $$0 -> coi.b);
   public static final kd<cgo> y = a(ma.aa, cgp::a);
   public static final jl<cel<?>> z = a(ma.U, "dummy", $$0 -> cel.a);
   public static final jl<cfs<?>> A = a(ma.ak, "dummy", $$0 -> cfs.a);
   public static final kd<cqn> B = a(ma.aj, $$0 -> cqn.c);
   public static final kd<cql> C = a(ma.b, $$0 -> cql.b);
   public static final kd<eve> D = a(ma.Q, $$0 -> evb.b);
   public static final kd<ewc<?>> E = a(ma.N, $$0 -> ewd.e);
   public static final kd<exz> F = a(ma.M, $$0 -> eya.a);
   public static final kd<eyt> G = a(ma.P, $$0 -> eyv.b);
   public static final kd<eyl> H = a(ma.O, $$0 -> eyn.c);
   public static final kd<ezc> I = a(ma.R, $$0 -> eze.c);
   public static final kd<bro<?>> J = a(ma.C, $$0 -> bro.a);
   public static final kd<brq<?>> K = a(ma.J, $$0 -> brq.a);
   public static final kd<ekq<?>> L = a(ma.H, $$0 -> ekq.a);
   public static final kd<ecy<?>> M = a(ma.i, $$0 -> ecy.k);
   public static final kd<edw<?>> N = a(ma.k, $$0 -> edw.a);
   public static final kd<eew<?>> O = a(ma.A, $$0 -> eew.I);
   public static final kd<eng<?>> P = a(ma.ao, $$0 -> eng.a);
   public static final kd<emz> Q = a(ma.an, $$0 -> emz.c);
   public static final kd<emr<?>> R = a(ma.as, $$0 -> emr.f);
   public static final kd<elq<?>> S = a(ma.Z, $$0 -> elq.f);
   public static final kd<ejc<?>> T = a(ma.j, $$0 -> ejc.a);
   public static final kd<ein<?>> U = a(ma.E, $$0 -> ein.a);
   public static final kd<ekf<?>> V = a(ma.au, $$0 -> ekf.a);
   public static final kd<eiz<?>> W = a(ma.ag, $$0 -> eiz.a);
   public static final kd<ejt<?>> X = a(ma.at, $$0 -> ejt.b);
   public static final kd<eic<?>> Y = a(ma.B, $$0 -> eic.a);
   public static final kd<MapCodec<? extends dgs>> Z = a(ma.e, dgt::a);
   public static final kd<MapCodec<? extends dxr>> aa = a(ma.n, dxt::a);
   public static final kd<MapCodec<? extends ech.f>> ab = a(ma.S, ech.f::a);
   public static final kd<MapCodec<? extends ech.o>> ac = a(ma.T, ech.o::a);
   public static final kd<MapCodec<? extends ebj>> ad = a(ma.t, ebk::a);
   public static final kd<MapCodec<? extends diq>> ae = a(ma.g, dir::a);
   public static final kd<eqj<?>> af = a(ma.ar, $$0 -> eqj.e);
   public static final kd<enr<?>> ag = a(ma.ap, $$0 -> enr.d);
   public static final kd<MapCodec<? extends enu>> ah = a(ma.aq, env::a);
   public static final kd<chc> ai = a(ma.l, chc::a);
   public static final kd<chj> aj = a(ma.F, chj::a);
   public static final kd<dtp> ak = a(ma.ax, dtq::a);
   public static final kd<cvb> al = a(ma.q, cvc::a);
   public static final kd<ar<?>> am = a(ma.aW, ao::a);
   public static final kd<za<?>> an = a(ma.ay, zb::a);
   public static final kd<kt<?>> ao = a(ma.az, ku::a);
   public static final kd<MapCodec<? extends bx>> ap = a(ma.aA, by::a);
   public static final kd<cv.a<?>> aq = a(ma.aB, cw::a);
   public static final kd<etk> ar = a(ma.aC, etl::a);
   public static final kd<kt<?>> as = a(ma.aD, dce::a);
   public static final kd<MapCodec<? extends dck>> at = a(ma.v, dck::a);
   public static final kd<MapCodec<? extends dcu>> au = a(ma.u, dcu::a);
   public static final kd<MapCodec<? extends dcv>> av = a(ma.w, dcv::b);
   public static final kd<MapCodec<? extends dcw>> aw = a(ma.y, dcw::a);
   public static final kd<MapCodec<? extends ddl>> ax = a(ma.x, ddm::a);
   public static final kd<czy.a<?>> ay = a(ma.aE, $$0 -> czy.a.a);
   public static final kd<? extends kd<?>> az = aC;

   private static <T> kd<T> a(ali<? extends kd<T>> $$0, lz.a<T> $$1) {
      return a($$0, new jy<>($$0, Lifecycle.stable(), false), $$1);
   }

   private static <T> kd<T> b(ali<? extends kd<T>> $$0, lz.a<T> $$1) {
      return a($$0, new jy<>($$0, Lifecycle.stable(), true), $$1);
   }

   private static <T> jl<T> a(ali<? extends kd<T>> $$0, String $$1, lz.a<T> $$2) {
      return a($$0, new jk<>($$1, $$0, Lifecycle.stable(), false), $$2);
   }

   private static <T> jl<T> b(ali<? extends kd<T>> $$0, String $$1, lz.a<T> $$2) {
      return a($$0, new jk<>($$1, $$0, Lifecycle.stable(), true), $$2);
   }

   private static <T, R extends km<T>> R a(ali<? extends kd<T>> $$0, R $$1, lz.a<T> $$2) {
      all.a(() -> "registry " + $$0);
      alj $$3 = $$0.a();
      aB.put($$3, () -> $$2.run($$1));
      aC.a((ali<km<?>>)$$0, $$1, kc.a);
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
            alj $$2 = ((jl)$$1).b();
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
