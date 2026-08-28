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
   private static final Map<ali, Supplier<?>> aH = Maps.newLinkedHashMap();
   private static final kb<kb<?>> aI = new jn<>(alh.a(mh.a), Lifecycle.stable());
   public static final ja<ege> a = a(mh.H, "step", ege::a);
   public static final js<awo> b = a(mh.ap, $$0 -> awp.oj);
   public static final ja<exn> c = b(mh.F, "empty", $$0 -> exp.a);
   public static final js<bvv> d = a(mh.W, bvz::a);
   public static final ja<dnc> e = b(mh.i, "air", $$0 -> dne.a);
   public static final ja<bxc<?>> f = b(mh.B, "pig", $$0 -> bxc.aR);
   public static final ja<czu> g = b(mh.K, "air", $$0 -> dac.a);
   public static final js<dbs> h = a(mh.ae, dbv::a);
   public static final js<lx<?>> i = a(mh.Y, $$0 -> ly.b);
   public static final js<dye<?>> j = b(mh.e, $$0 -> dye.a);
   public static final js<ali> k = a(mh.p, $$0 -> awz.E);
   public static final ja<eec> l = a(mh.l, "empty", $$0 -> eec.c);
   public static final js<evy<?>> m = a(mh.al, $$0 -> evy.a);
   public static final js<ewm<?>> n = a(mh.ak, $$0 -> ewm.b);
   public static final js<evr<?>> o = a(mh.ad, $$0 -> evr.a);
   public static final js<cwz<?>> p = a(mh.V, $$0 -> cwz.i);
   public static final js<dfa<?>> q = a(mh.ai, $$0 -> dfa.a);
   public static final js<dez<?>> r = a(mh.ah, $$0 -> dez.b);
   public static final js<byv> s = a(mh.c, bza::a);
   public static final js<egj<?>> t = a(mh.ac, $$0 -> egj.a);
   public static final js<ig<?, ?>> u = a(mh.m, ih::a);
   public static final js<awy<?>> v = a(mh.ar, $$0 -> awz.c);
   public static final ja<cro> w = a(mh.aE, "plains", cro::a);
   public static final ja<crm> x = a(mh.aD, "none", crm::a);
   public static final js<ciz> y = a(mh.aa, cja::a);
   public static final ja<cgw<?>> z = a(mh.U, "dummy", $$0 -> cgw.a);
   public static final ja<cid<?>> A = a(mh.an, "dummy", $$0 -> cid.a);
   public static final js<ctt> B = a(mh.am, $$0 -> ctt.c);
   public static final js<ctr> C = a(mh.b, $$0 -> ctr.b);
   public static final js<fay> D = a(mh.P, $$0 -> fav.b);
   public static final js<fbw<?>> E = a(mh.M, $$0 -> fbx.e);
   public static final js<fdr> F = a(mh.L, $$0 -> fds.a);
   public static final js<fel> G = a(mh.O, $$0 -> fen.b);
   public static final js<fed> H = a(mh.N, $$0 -> fef.c);
   public static final js<feu> I = a(mh.Q, $$0 -> few.c);
   public static final js<btv<?>> J = a(mh.E, $$0 -> btv.a);
   public static final js<btx<?>> K = a(mh.J, $$0 -> btx.a);
   public static final js<eqj<?>> L = a(mh.I, $$0 -> eqj.a);
   public static final js<eil<?>> M = a(mh.f, $$0 -> eil.k);
   public static final js<ejj<?>> N = a(mh.j, $$0 -> ejj.a);
   public static final js<ekk<?>> O = a(mh.D, $$0 -> ekk.J);
   public static final js<esz<?>> P = a(mh.at, $$0 -> esz.a);
   public static final js<ess> Q = a(mh.as, $$0 -> ess.c);
   public static final js<esk<?>> R = a(mh.aw, $$0 -> esk.f);
   public static final js<erj<?>> S = a(mh.Z, $$0 -> erj.f);
   public static final js<eor<?>> T = a(mh.g, $$0 -> eor.a);
   public static final js<eoc<?>> U = a(mh.G, $$0 -> eoc.a);
   public static final js<epy<?>> V = a(mh.aC, $$0 -> epy.a);
   public static final js<eoo<?>> W = a(mh.aj, $$0 -> eoo.a);
   public static final js<epm<?>> X = a(mh.aB, $$0 -> epm.b);
   public static final js<enr<?>> Y = a(mh.C, $$0 -> enr.a);
   public static final js<MapCodec<? extends dle>> Z = a(mh.d, dlf::a);
   public static final js<MapCodec<? extends edc>> aa = a(mh.k, ede::a);
   public static final js<MapCodec<? extends ehu.f>> ab = a(mh.S, ehu.f::a);
   public static final js<MapCodec<? extends ehu.o>> ac = a(mh.T, ehu.o::a);
   public static final js<MapCodec<? extends egw>> ad = a(mh.t, egx::a);
   public static final js<MapCodec<? extends dnc>> ae = a(mh.h, dnd::a);
   public static final js<ewc<?>> af = a(mh.av, $$0 -> ewc.e);
   public static final js<etk<?>> ag = a(mh.au, $$0 -> etk.d);
   public static final js<MapCodec<? extends etn>> ah = a(mh.ab, eto::a);
   public static final js<dyv> ai = a(mh.s, dyw::a);
   public static final js<cyp> aj = a(mh.o, cyq::a);
   public static final js<at<?>> ak = a(mh.bj, aq::a);
   public static final js<yr<?>> al = a(mh.X, ys::a);
   public static final js<kj<?>> am = a(mh.r, kk::a);
   public static final js<MapCodec<? extends bz>> an = a(mh.A, ca::a);
   public static final js<kt.b<?>> ao = a(mh.q, ku::a);
   public static final js<eze> ap = a(mh.R, ezf::a);
   public static final js<kj<?>> aq = a(mh.u, dgm::a);
   public static final js<MapCodec<? extends dgs>> ar = a(mh.w, dgs::a);
   public static final js<MapCodec<? extends dhc>> as = a(mh.v, dhc::a);
   public static final js<MapCodec<? extends dhd>> at = a(mh.x, dhd::b);
   public static final js<MapCodec<? extends dhe>> au = a(mh.z, dhe::a);
   public static final js<MapCodec<? extends dht>> av = a(mh.y, dhu::a);
   public static final js<ddm.a<?>> aw = a(mh.n, $$0 -> ddm.a.a);
   public static final js<dfv.a<?>> ax = a(mh.ag, dfy::a);
   public static final js<dgb.i<?>> ay = a(mh.ao, dgd::a);
   public static final js<des> az = a(mh.af, der::a);
   public static final js<arz> aA = a(mh.aA, $$0 -> arz.i);
   public static final js<MapCodec<? extends tl>> aB = a(mh.ax, tl::a);
   public static final js<MapCodec<? extends sr>> aC = a(mh.az, sr::a);
   public static final js<MapCodec<? extends cub>> aD = a(mh.aq, cuc::a);
   public static final js<Consumer<sp>> aE = a(mh.ay, sd::a);
   public static final js<? extends js<?>> aF = aI;

   private static <T> js<T> a(alh<? extends js<T>> $$0, mg.a<T> $$1) {
      return a($$0, new jn<>($$0, Lifecycle.stable(), false), $$1);
   }

   private static <T> js<T> b(alh<? extends js<T>> $$0, mg.a<T> $$1) {
      return a($$0, new jn<>($$0, Lifecycle.stable(), true), $$1);
   }

   private static <T> ja<T> a(alh<? extends js<T>> $$0, String $$1, mg.a<T> $$2) {
      return a($$0, new iz<>($$1, $$0, Lifecycle.stable(), false), $$2);
   }

   private static <T> ja<T> b(alh<? extends js<T>> $$0, String $$1, mg.a<T> $$2) {
      return a($$0, new iz<>($$1, $$0, Lifecycle.stable(), true), $$2);
   }

   private static <T, R extends kb<T>> R a(alh<? extends js<T>> $$0, R $$1, mg.a<T> $$2) {
      alk.a(() -> "registry " + $$0.a());
      ali $$3 = $$0.a();
      aH.put($$3, () -> $$2.run($$1));
      aI.a((alh<kb<?>>)$$0, $$1, jr.a);
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
            ali $$2 = ((ja)$$1).b();
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
