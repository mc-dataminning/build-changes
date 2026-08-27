import com.google.common.collect.Maps;
import com.mojang.logging.LogUtils;
import com.mojang.serialization.Codec;
import com.mojang.serialization.Lifecycle;
import com.mojang.serialization.MapCodec;
import java.util.Map;
import java.util.function.Supplier;
import org.apache.commons.lang3.Validate;
import org.slf4j.Logger;

public class kh {
   private static final Logger au = LogUtils.getLogger();
   private static final Map<ajc, Supplier<?>> av = Maps.newLinkedHashMap();
   private static final jg<jg<?>> aw = new it<>(ajb.a(ki.a), Lifecycle.stable());
   public static final ig<dqr> a = a(ki.B, "step", dqr::a);
   public static final ix<ato> b = a(ki.af, $$0 -> atp.ne);
   public static final ig<ehq> c = b(ki.y, "empty", $$0 -> ehs.a);
   public static final ix<bnq> d = a(ki.Q, bnu::a);
   public static final ig<czf> e = b(ki.f, "air", $$0 -> czh.a);
   public static final ix<ctz> f = b(ki.t, $$0 -> cuc.x);
   public static final ig<bol<?>> g = b(ki.u, "pig", $$0 -> bol.ax);
   public static final ig<cpl> h = b(ki.F, "air", $$0 -> cpt.a);
   public static final ig<crm> i = a(ki.X, "empty", crp::a);
   public static final ix<ka<?>> j = a(ki.S, $$0 -> kb.c);
   public static final ix<djn<?>> k = b(ki.h, $$0 -> djn.a);
   public static final ig<ceh> l = a(ki.R, "kebab", cei::a);
   public static final ix<ajc> m = a(ki.q, $$0 -> atz.E);
   public static final ig<dof> n = a(ki.n, "empty", $$0 -> dof.c);
   public static final ix<egb<?>> o = a(ki.ab, $$0 -> egb.a);
   public static final ix<egp<?>> p = a(ki.ac, $$0 -> egp.b);
   public static final ix<efu<?>> q = a(ki.W, $$0 -> efu.a);
   public static final ix<cmb<?>> r = a(ki.P, $$0 -> cmb.i);
   public static final ix<csx<?>> s = a(ki.Z, $$0 -> csx.a);
   public static final ix<csw<?>> t = a(ki.Y, $$0 -> csw.b);
   public static final ix<bpz> u = a(ki.c, bqe::a);
   public static final ix<dqw<?>> v = a(ki.V, $$0 -> dqw.a);
   public static final ix<hn<?, ?>> w = a(ki.o, ho::a);
   public static final ix<aty<?>> x = a(ki.ag, $$0 -> atz.c);
   public static final ig<chs> y = a(ki.aq, "plains", $$0 -> chs.c);
   public static final ig<chq> z = a(ki.ap, "none", $$0 -> chq.b);
   public static final ix<cad> A = a(ki.U, cae::a);
   public static final ig<bya<?>> B = a(ki.O, "dummy", $$0 -> bya.a);
   public static final ig<bzh<?>> C = a(ki.ae, "dummy", $$0 -> bzh.a);
   public static final ix<cjp> D = a(ki.ad, $$0 -> cjp.c);
   public static final ix<cjn> E = a(ki.b, $$0 -> cjn.b);
   public static final ix<eks> F = a(ki.K, $$0 -> ekp.b);
   public static final ix<elm> G = a(ki.H, $$0 -> eln.c);
   public static final ix<emy> H = a(ki.G, $$0 -> emz.b);
   public static final ix<enr> I = a(ki.J, $$0 -> ent.b);
   public static final ix<enk> J = a(ki.I, $$0 -> enm.c);
   public static final ix<enz> K = a(ki.L, $$0 -> eob.c);
   public static final ix<blp<?>> L = a(ki.x, $$0 -> blp.a);
   public static final ix<blr<?>> M = a(ki.E, $$0 -> blr.a);
   public static final ix<eao<?>> N = a(ki.C, $$0 -> eao.a);
   public static final ix<dsy<?>> O = a(ki.i, $$0 -> dsy.k);
   public static final ix<dtv<?>> P = a(ki.k, $$0 -> dtv.a);
   public static final ix<duu<?>> Q = a(ki.v, $$0 -> duu.I);
   public static final ix<ede<?>> R = a(ki.ai, $$0 -> ede.a);
   public static final ix<ecx> S = a(ki.ah, $$0 -> ecx.c);
   public static final ix<ecp<?>> T = a(ki.am, $$0 -> ecp.f);
   public static final ix<ebo<?>> U = a(ki.T, $$0 -> ebo.f);
   public static final ix<dza<?>> V = a(ki.j, $$0 -> dza.a);
   public static final ix<dyl<?>> W = a(ki.z, $$0 -> dyl.a);
   public static final ix<ead<?>> X = a(ki.ao, $$0 -> ead.a);
   public static final ix<dyx<?>> Y = a(ki.aa, $$0 -> dyx.a);
   public static final ix<dzr<?>> Z = a(ki.an, $$0 -> dzr.b);
   public static final ix<dya<?>> aa = a(ki.w, $$0 -> dya.a);
   public static final ix<Codec<? extends cxh>> ab = a(ki.e, Lifecycle.stable(), cxi::a);
   public static final ix<Codec<? extends dob>> ac = a(ki.m, Lifecycle.stable(), dod::a);
   public static final ix<Codec<? extends dsh.f>> ad = a(ki.M, dsh.f::a);
   public static final ix<Codec<? extends dsh.o>> ae = a(ki.N, dsh.o::a);
   public static final ix<Codec<? extends drj>> af = a(ki.s, drk::a);
   public static final ix<MapCodec<? extends czf>> ag = a(ki.g, czg::a);
   public static final ix<egf<?>> ah = a(ki.al, $$0 -> egf.e);
   public static final ix<edo<?>> ai = a(ki.aj, $$0 -> edo.d);
   public static final ix<Codec<? extends edr>> aj = a(ki.ak, eds::a);
   public static final ix<caq> ak = a(ki.l, caq::a);
   public static final ix<cax> al = a(ki.A, $$0 -> cax.a);
   public static final ix<djc> am = a(ki.d, djd::a);
   public static final ix<cpi> an = a(ki.D, cpk::a);
   public static final ix<String> ao = a(ki.ar, dkc::a);
   public static final ix<cny> ap = a(ki.p, cnz::a);
   public static final ix<ap<?>> aq = a(ki.aI, am::a);
   public static final ix<xj<?>> ar = a(ki.as, xk::a);
   public static final ix<cnd> as = a(ki.at, cne::a);
   public static final ix<? extends ix<?>> at = aw;

   private static <T> ix<T> a(ajb<? extends ix<T>> $$0, kh.a<T> $$1) {
      return a($$0, Lifecycle.stable(), $$1);
   }

   private static <T> ix<T> b(ajb<? extends ix<T>> $$0, kh.a<T> $$1) {
      return a($$0, new it<>($$0, Lifecycle.stable(), true), $$1, Lifecycle.stable());
   }

   private static <T> ig<T> a(ajb<? extends ix<T>> $$0, String $$1, kh.a<T> $$2) {
      return a($$0, $$1, Lifecycle.stable(), $$2);
   }

   private static <T> ig<T> b(ajb<? extends ix<T>> $$0, String $$1, kh.a<T> $$2) {
      return b($$0, $$1, Lifecycle.stable(), $$2);
   }

   private static <T> ix<T> a(ajb<? extends ix<T>> $$0, Lifecycle $$1, kh.a<T> $$2) {
      return a($$0, new it<>($$0, $$1, false), $$2, $$1);
   }

   private static <T> ig<T> a(ajb<? extends ix<T>> $$0, String $$1, Lifecycle $$2, kh.a<T> $$3) {
      return a($$0, new ie<>($$1, $$0, $$2, false), $$3, $$2);
   }

   private static <T> ig<T> b(ajb<? extends ix<T>> $$0, String $$1, Lifecycle $$2, kh.a<T> $$3) {
      return a($$0, new ie<>($$1, $$0, $$2, true), $$3, $$2);
   }

   private static <T, R extends jg<T>> R a(ajb<? extends ix<T>> $$0, R $$1, kh.a<T> $$2, Lifecycle $$3) {
      aje.a(() -> "registry " + $$0);
      ajc $$4 = $$0.a();
      av.put($$4, () -> $$2.run($$1));
      aw.a((ajb<jg<?>>)$$0, $$1, $$3);
      return $$1;
   }

   public static void a() {
      b();
      c();
      a(at);
   }

   private static void b() {
      av.forEach(($$0, $$1) -> {
         if ($$1.get() == null) {
            au.error("Unable to bootstrap registry '{}'", $$0);
         }
      });
   }

   private static void c() {
      at.l();

      for (ix<?> $$0 : at) {
         $$0.l();
      }
   }

   private static <T extends ix<?>> void a(ix<T> $$0) {
      $$0.forEach($$1 -> {
         if ($$1.e().isEmpty()) {
            ac.a("Registry '" + $$0.b((T)$$1) + "' was empty after loading");
         }

         if ($$1 instanceof ig) {
            ajc $$2 = ((ig)$$1).a();
            Validate.notNull($$1.a($$2), "Missing default of DefaultedMappedRegistry: " + $$2, new Object[0]);
         }
      });
   }

   @FunctionalInterface
   interface a<T> {
      Object run(ix<T> var1);
   }
}
