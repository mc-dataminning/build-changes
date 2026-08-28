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
   private static final Map<alk, Supplier<?>> aH = Maps.newLinkedHashMap();
   private static final kc<kc<?>> aI = new jo<>(alj.a(mi.a), Lifecycle.stable());
   public static final jb<egg> a = a(mi.H, "step", egg::a);
   public static final jt<awq> b = a(mi.ap, $$0 -> awr.oj);
   public static final jb<exp> c = b(mi.F, "empty", $$0 -> exr.a);
   public static final jt<bvx> d = a(mi.W, bwb::a);
   public static final jb<dne> e = b(mi.i, "air", $$0 -> dng.a);
   public static final jb<bxe<?>> f = b(mi.B, "pig", $$0 -> bxe.aR);
   public static final jb<czw> g = b(mi.K, "air", $$0 -> dae.a);
   public static final jt<dbu> h = a(mi.ae, dbx::a);
   public static final jt<ly<?>> i = a(mi.Y, $$0 -> lz.b);
   public static final jt<dyg<?>> j = b(mi.e, $$0 -> dyg.a);
   public static final jt<alk> k = a(mi.p, $$0 -> axb.E);
   public static final jb<eee> l = a(mi.l, "empty", $$0 -> eee.c);
   public static final jt<ewa<?>> m = a(mi.al, $$0 -> ewa.a);
   public static final jt<ewo<?>> n = a(mi.ak, $$0 -> ewo.b);
   public static final jt<evt<?>> o = a(mi.ad, $$0 -> evt.a);
   public static final jt<cxb<?>> p = a(mi.V, $$0 -> cxb.i);
   public static final jt<dfc<?>> q = a(mi.ai, $$0 -> dfc.a);
   public static final jt<dfb<?>> r = a(mi.ah, $$0 -> dfb.b);
   public static final jt<byx> s = a(mi.c, bzc::a);
   public static final jt<egl<?>> t = a(mi.ac, $$0 -> egl.a);
   public static final jt<ih<?, ?>> u = a(mi.m, ii::a);
   public static final jt<axa<?>> v = a(mi.ar, $$0 -> axb.c);
   public static final jb<crq> w = a(mi.aE, "plains", crq::a);
   public static final jb<cro> x = a(mi.aD, "none", cro::a);
   public static final jt<cjb> y = a(mi.aa, cjc::a);
   public static final jb<cgy<?>> z = a(mi.U, "dummy", $$0 -> cgy.a);
   public static final jb<cif<?>> A = a(mi.an, "dummy", $$0 -> cif.a);
   public static final jt<ctv> B = a(mi.am, $$0 -> ctv.c);
   public static final jt<ctt> C = a(mi.b, $$0 -> ctt.b);
   public static final jt<fba> D = a(mi.P, $$0 -> fax.b);
   public static final jt<fby<?>> E = a(mi.M, $$0 -> fbz.e);
   public static final jt<fdt> F = a(mi.L, $$0 -> fdu.a);
   public static final jt<fen> G = a(mi.O, $$0 -> fep.b);
   public static final jt<fef> H = a(mi.N, $$0 -> feh.c);
   public static final jt<few> I = a(mi.Q, $$0 -> fey.c);
   public static final jt<btx<?>> J = a(mi.E, $$0 -> btx.a);
   public static final jt<btz<?>> K = a(mi.J, $$0 -> btz.a);
   public static final jt<eql<?>> L = a(mi.I, $$0 -> eql.a);
   public static final jt<ein<?>> M = a(mi.f, $$0 -> ein.k);
   public static final jt<ejl<?>> N = a(mi.j, $$0 -> ejl.a);
   public static final jt<ekm<?>> O = a(mi.D, $$0 -> ekm.J);
   public static final jt<etb<?>> P = a(mi.at, $$0 -> etb.a);
   public static final jt<esu> Q = a(mi.as, $$0 -> esu.c);
   public static final jt<esm<?>> R = a(mi.aw, $$0 -> esm.f);
   public static final jt<erl<?>> S = a(mi.Z, $$0 -> erl.f);
   public static final jt<eot<?>> T = a(mi.g, $$0 -> eot.a);
   public static final jt<eoe<?>> U = a(mi.G, $$0 -> eoe.a);
   public static final jt<eqa<?>> V = a(mi.aC, $$0 -> eqa.a);
   public static final jt<eoq<?>> W = a(mi.aj, $$0 -> eoq.a);
   public static final jt<epo<?>> X = a(mi.aB, $$0 -> epo.b);
   public static final jt<ent<?>> Y = a(mi.C, $$0 -> ent.a);
   public static final jt<MapCodec<? extends dlg>> Z = a(mi.d, dlh::a);
   public static final jt<MapCodec<? extends ede>> aa = a(mi.k, edg::a);
   public static final jt<MapCodec<? extends ehw.f>> ab = a(mi.S, ehw.f::a);
   public static final jt<MapCodec<? extends ehw.o>> ac = a(mi.T, ehw.o::a);
   public static final jt<MapCodec<? extends egy>> ad = a(mi.t, egz::a);
   public static final jt<MapCodec<? extends dne>> ae = a(mi.h, dnf::a);
   public static final jt<ewe<?>> af = a(mi.av, $$0 -> ewe.e);
   public static final jt<etm<?>> ag = a(mi.au, $$0 -> etm.d);
   public static final jt<MapCodec<? extends etp>> ah = a(mi.ab, etq::a);
   public static final jt<dyx> ai = a(mi.s, dyy::a);
   public static final jt<cyr> aj = a(mi.o, cys::a);
   public static final jt<at<?>> ak = a(mi.bj, aq::a);
   public static final jt<yt<?>> al = a(mi.X, yu::a);
   public static final jt<kk<?>> am = a(mi.r, kl::a);
   public static final jt<MapCodec<? extends ca>> an = a(mi.A, cb::a);
   public static final jt<ku.b<?>> ao = a(mi.q, kv::a);
   public static final jt<ezg> ap = a(mi.R, ezh::a);
   public static final jt<kk<?>> aq = a(mi.u, dgo::a);
   public static final jt<MapCodec<? extends dgu>> ar = a(mi.w, dgu::a);
   public static final jt<MapCodec<? extends dhe>> as = a(mi.v, dhe::a);
   public static final jt<MapCodec<? extends dhf>> at = a(mi.x, dhf::b);
   public static final jt<MapCodec<? extends dhg>> au = a(mi.z, dhg::a);
   public static final jt<MapCodec<? extends dhv>> av = a(mi.y, dhw::a);
   public static final jt<ddo.a<?>> aw = a(mi.n, $$0 -> ddo.a.a);
   public static final jt<dfx.a<?>> ax = a(mi.ag, dga::a);
   public static final jt<dgd.i<?>> ay = a(mi.ao, dgf::a);
   public static final jt<deu> az = a(mi.af, det::a);
   public static final jt<asb> aA = a(mi.aA, $$0 -> asb.i);
   public static final jt<MapCodec<? extends tm>> aB = a(mi.ax, tm::a);
   public static final jt<MapCodec<? extends ss>> aC = a(mi.az, ss::a);
   public static final jt<MapCodec<? extends cud>> aD = a(mi.aq, cue::a);
   public static final jt<Consumer<sq>> aE = a(mi.ay, se::a);
   public static final jt<? extends jt<?>> aF = aI;

   private static <T> jt<T> a(alj<? extends jt<T>> $$0, mh.a<T> $$1) {
      return a($$0, new jo<>($$0, Lifecycle.stable(), false), $$1);
   }

   private static <T> jt<T> b(alj<? extends jt<T>> $$0, mh.a<T> $$1) {
      return a($$0, new jo<>($$0, Lifecycle.stable(), true), $$1);
   }

   private static <T> jb<T> a(alj<? extends jt<T>> $$0, String $$1, mh.a<T> $$2) {
      return a($$0, new ja<>($$1, $$0, Lifecycle.stable(), false), $$2);
   }

   private static <T> jb<T> b(alj<? extends jt<T>> $$0, String $$1, mh.a<T> $$2) {
      return a($$0, new ja<>($$1, $$0, Lifecycle.stable(), true), $$2);
   }

   private static <T, R extends kc<T>> R a(alj<? extends jt<T>> $$0, R $$1, mh.a<T> $$2) {
      alm.a(() -> "registry " + $$0.a());
      alk $$3 = $$0.a();
      aH.put($$3, () -> $$2.run($$1));
      aI.a((alj<kc<?>>)$$0, $$1, js.a);
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
            alk $$2 = ((jb)$$1).b();
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
