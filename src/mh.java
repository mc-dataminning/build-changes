import com.google.common.collect.Maps;
import com.mojang.logging.LogUtils;
import com.mojang.serialization.Lifecycle;
import com.mojang.serialization.MapCodec;
import java.util.Map;
import java.util.function.Consumer;
import java.util.function.Supplier;
import org.apache.commons.lang3.Validate;
import org.slf4j.Logger;

public class mh {
   private static final Logger aG = LogUtils.getLogger();
   private static final Map<alr, Supplier<?>> aH = Maps.newLinkedHashMap();
   private static final kc<kc<?>> aI = new jo<>(alq.a(mi.a), Lifecycle.stable());
   public static final jb<egq> a = a(mi.H, "step", egq::a);
   public static final jt<awx> b = a(mi.ap, $$0 -> awy.oj);
   public static final jb<exz> c = b(mi.F, "empty", $$0 -> eyb.a);
   public static final jt<bwg> d = a(mi.W, bwk::a);
   public static final jb<dno> e = b(mi.i, "air", $$0 -> dnq.a);
   public static final jb<bxn<?>> f = b(mi.B, "pig", $$0 -> bxn.aR);
   public static final jb<dag> g = b(mi.K, "air", $$0 -> dao.a);
   public static final jt<dce> h = a(mi.ae, dch::a);
   public static final jt<ly<?>> i = a(mi.Y, $$0 -> lz.b);
   public static final jt<dyq<?>> j = b(mi.e, $$0 -> dyq.a);
   public static final jt<alr> k = a(mi.p, $$0 -> axi.E);
   public static final jb<eeo> l = a(mi.l, "empty", $$0 -> eeo.c);
   public static final jt<ewk<?>> m = a(mi.al, $$0 -> ewk.a);
   public static final jt<ewy<?>> n = a(mi.ak, $$0 -> ewy.b);
   public static final jt<ewd<?>> o = a(mi.ad, $$0 -> ewd.a);
   public static final jt<cxk<?>> p = a(mi.V, $$0 -> cxk.i);
   public static final jt<dfm<?>> q = a(mi.ai, $$0 -> dfm.a);
   public static final jt<dfl<?>> r = a(mi.ah, $$0 -> dfl.b);
   public static final jt<bzg> s = a(mi.c, bzl::a);
   public static final jt<egv<?>> t = a(mi.ac, $$0 -> egv.a);
   public static final jt<ih<?, ?>> u = a(mi.m, ii::a);
   public static final jt<axh<?>> v = a(mi.ar, $$0 -> axi.c);
   public static final jb<crz> w = a(mi.aE, "plains", crz::a);
   public static final jb<crx> x = a(mi.aD, "none", crx::a);
   public static final jt<cjk> y = a(mi.aa, cjl::a);
   public static final jb<chh<?>> z = a(mi.U, "dummy", $$0 -> chh.a);
   public static final jb<cio<?>> A = a(mi.an, "dummy", $$0 -> cio.a);
   public static final jt<cue> B = a(mi.am, $$0 -> cue.c);
   public static final jt<cuc> C = a(mi.b, $$0 -> cuc.b);
   public static final jt<fbk> D = a(mi.P, $$0 -> fbh.b);
   public static final jt<fci<?>> E = a(mi.M, $$0 -> fcj.e);
   public static final jt<fed> F = a(mi.L, $$0 -> fee.a);
   public static final jt<fex> G = a(mi.O, $$0 -> fez.b);
   public static final jt<fep> H = a(mi.N, $$0 -> fer.c);
   public static final jt<ffg> I = a(mi.Q, $$0 -> ffi.c);
   public static final jt<bug<?>> J = a(mi.E, $$0 -> bug.a);
   public static final jt<bui<?>> K = a(mi.J, $$0 -> bui.a);
   public static final jt<eqv<?>> L = a(mi.I, $$0 -> eqv.a);
   public static final jt<eix<?>> M = a(mi.f, $$0 -> eix.k);
   public static final jt<ejv<?>> N = a(mi.j, $$0 -> ejv.a);
   public static final jt<ekw<?>> O = a(mi.D, $$0 -> ekw.J);
   public static final jt<etl<?>> P = a(mi.at, $$0 -> etl.a);
   public static final jt<ete> Q = a(mi.as, $$0 -> ete.c);
   public static final jt<esw<?>> R = a(mi.aw, $$0 -> esw.f);
   public static final jt<erv<?>> S = a(mi.Z, $$0 -> erv.f);
   public static final jt<epd<?>> T = a(mi.g, $$0 -> epd.a);
   public static final jt<eoo<?>> U = a(mi.G, $$0 -> eoo.a);
   public static final jt<eqk<?>> V = a(mi.aC, $$0 -> eqk.a);
   public static final jt<epa<?>> W = a(mi.aj, $$0 -> epa.a);
   public static final jt<epy<?>> X = a(mi.aB, $$0 -> epy.b);
   public static final jt<eod<?>> Y = a(mi.C, $$0 -> eod.a);
   public static final jt<MapCodec<? extends dlq>> Z = a(mi.d, dlr::a);
   public static final jt<MapCodec<? extends edo>> aa = a(mi.k, edq::a);
   public static final jt<MapCodec<? extends eig.f>> ab = a(mi.S, eig.f::a);
   public static final jt<MapCodec<? extends eig.o>> ac = a(mi.T, eig.o::a);
   public static final jt<MapCodec<? extends ehi>> ad = a(mi.t, ehj::a);
   public static final jt<MapCodec<? extends dno>> ae = a(mi.h, dnp::a);
   public static final jt<ewo<?>> af = a(mi.av, $$0 -> ewo.e);
   public static final jt<etw<?>> ag = a(mi.au, $$0 -> etw.d);
   public static final jt<MapCodec<? extends etz>> ah = a(mi.ab, eua::a);
   public static final jt<dzh> ai = a(mi.s, dzi::a);
   public static final jt<czb> aj = a(mi.o, czc::a);
   public static final jt<at<?>> ak = a(mi.bj, aq::a);
   public static final jt<yx<?>> al = a(mi.X, yy::a);
   public static final jt<kk<?>> am = a(mi.r, kl::a);
   public static final jt<MapCodec<? extends ca>> an = a(mi.A, cb::a);
   public static final jt<ku.b<?>> ao = a(mi.q, kv::a);
   public static final jt<ezq> ap = a(mi.R, ezr::a);
   public static final jt<kk<?>> aq = a(mi.u, dgy::a);
   public static final jt<MapCodec<? extends dhe>> ar = a(mi.w, dhe::a);
   public static final jt<MapCodec<? extends dho>> as = a(mi.v, dho::a);
   public static final jt<MapCodec<? extends dhp>> at = a(mi.x, dhp::b);
   public static final jt<MapCodec<? extends dhq>> au = a(mi.z, dhq::a);
   public static final jt<MapCodec<? extends dif>> av = a(mi.y, dig::a);
   public static final jt<ddy.a<?>> aw = a(mi.n, $$0 -> ddy.a.a);
   public static final jt<dgh.a<?>> ax = a(mi.ag, dgk::a);
   public static final jt<dgn.i<?>> ay = a(mi.ao, dgp::a);
   public static final jt<dfe> az = a(mi.af, dfd::a);
   public static final jt<asi> aA = a(mi.aA, $$0 -> asi.i);
   public static final jt<MapCodec<? extends tm>> aB = a(mi.ax, tm::a);
   public static final jt<MapCodec<? extends ss>> aC = a(mi.az, ss::a);
   public static final jt<MapCodec<? extends cum>> aD = a(mi.aq, cun::a);
   public static final jt<Consumer<sq>> aE = a(mi.ay, se::a);
   public static final jt<? extends jt<?>> aF = aI;

   private static <T> jt<T> a(alq<? extends jt<T>> $$0, mh.a<T> $$1) {
      return a($$0, new jo<>($$0, Lifecycle.stable(), false), $$1);
   }

   private static <T> jt<T> b(alq<? extends jt<T>> $$0, mh.a<T> $$1) {
      return a($$0, new jo<>($$0, Lifecycle.stable(), true), $$1);
   }

   private static <T> jb<T> a(alq<? extends jt<T>> $$0, String $$1, mh.a<T> $$2) {
      return a($$0, new ja<>($$1, $$0, Lifecycle.stable(), false), $$2);
   }

   private static <T> jb<T> b(alq<? extends jt<T>> $$0, String $$1, mh.a<T> $$2) {
      return a($$0, new ja<>($$1, $$0, Lifecycle.stable(), true), $$2);
   }

   private static <T, R extends kc<T>> R a(alq<? extends jt<T>> $$0, R $$1, mh.a<T> $$2) {
      alt.a(() -> "registry " + $$0.a());
      alr $$3 = $$0.a();
      aH.put($$3, () -> $$2.run($$1));
      aI.a((alq<kc<?>>)$$0, $$1, js.a);
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

      for (jt<?> $$0 : aF) {
         c($$0);
         $$0.n();
      }
   }

   private static <T extends jt<?>> void b(jt<T> $$0) {
      $$0.forEach($$1 -> {
         if ($$1.i().isEmpty()) {
            ag.b("Registry '" + $$0.b((T)$$1) + "' was empty after loading");
         }

         if ($$1 instanceof jb) {
            alr $$2 = ((jb)$$1).b();
            Validate.notNull($$1.a($$2), "Missing default of DefaultedMappedRegistry: " + $$2, new Object[0]);
         }
      });
   }

   public static <T> jh<T> a(jt<T> $$0) {
      return ((kc)$$0).p();
   }

   private static void c(jt<?> $$0) {
      ((jo)$$0).o();
   }

   @FunctionalInterface
   interface a<T> {
      Object run(jt<T> var1);
   }
}
