import com.google.common.collect.Maps;
import com.mojang.logging.LogUtils;
import com.mojang.serialization.Codec;
import com.mojang.serialization.Lifecycle;
import com.mojang.serialization.MapCodec;
import java.util.Map;
import java.util.function.Supplier;
import org.apache.commons.lang3.Validate;
import org.slf4j.Logger;

public class kc {
   private static final Logger as = LogUtils.getLogger();
   private static final Map<agm, Supplier<?>> at = Maps.newLinkedHashMap();
   public static final agm a = new agm("root");
   private static final jb<jb<?>> au = new io<>(agl.a(a), Lifecycle.stable());
   public static final ia<dlx> b = b(kd.A, "step", $$0 -> dlx.P);
   public static final is<aqu> c = a(kd.ae, $$0 -> aqv.mu);
   public static final ia<ecw> d = b(kd.x, "empty", $$0 -> ecy.a);
   public static final is<bkg> e = b(kd.P, $$0 -> bkk.z);
   public static final ia<cvf> f = b(kd.e, "air", $$0 -> cvh.a);
   public static final is<cpz> g = b(kd.s, $$0 -> cqd.x);
   public static final ia<bkz<?>> h = b(kd.t, "pig", $$0 -> bkz.av);
   public static final ia<clj> i = b(kd.E, "air", $$0 -> clr.a);
   public static final ia<cnl> j = b(kd.W, "empty", $$0 -> cno.b);
   public static final is<jv<?>> k = a(kd.R, $$0 -> jw.c);
   public static final is<dfk<?>> l = b(kd.g, $$0 -> dfk.a);
   public static final ia<cao> m = a(kd.Q, "kebab", cap::a);
   public static final is<agm> n = a(kd.p, $$0 -> arf.E);
   public static final ia<djo> o = a(kd.m, "empty", $$0 -> djo.c);
   public static final is<ebh<?>> p = a(kd.aa, $$0 -> ebh.a);
   public static final is<ebv<?>> q = a(kd.ab, $$0 -> ebv.b);
   public static final is<eba<?>> r = a(kd.V, $$0 -> eba.a);
   public static final is<chy<?>> s = a(kd.O, $$0 -> chy.i);
   public static final is<coy<?>> t = a(kd.Y, $$0 -> coy.a);
   public static final is<cox<?>> u = a(kd.X, $$0 -> cox.b);
   public static final is<bmm> v = a(kd.b, $$0 -> bmr.j);
   public static final is<dmc<?>> w = a(kd.U, $$0 -> dmc.a);
   public static final is<hj<?, ?>> x = a(kd.n, hk::a);
   public static final is<are<?>> y = a(kd.af, $$0 -> arf.c);
   public static final ia<cdr> z = a(kd.ap, "plains", $$0 -> cdr.c);
   public static final ia<cdp> A = a(kd.ao, "none", $$0 -> cdp.b);
   public static final is<bwn> B = a(kd.T, bwo::a);
   public static final ia<bum<?>> C = a(kd.N, "dummy", $$0 -> bum.a);
   public static final ia<bvr<?>> D = a(kd.ad, "dummy", $$0 -> bvr.a);
   public static final is<cfm> E = a(kd.ac, $$0 -> cfm.c);
   public static final is<cfk> F = a(kd.a, $$0 -> cfk.b);
   public static final is<efw> G = a(kd.J, $$0 -> eft.b);
   public static final is<egq> H = a(kd.G, $$0 -> egr.c);
   public static final is<eic> I = a(kd.F, $$0 -> eid.b);
   public static final is<eiv> J = a(kd.I, $$0 -> eix.b);
   public static final is<eio> K = a(kd.H, $$0 -> eiq.c);
   public static final is<ejd> L = a(kd.K, $$0 -> ejf.c);
   public static final is<bif<?>> M = a(kd.w, $$0 -> bif.a);
   public static final is<bih<?>> N = a(kd.D, $$0 -> bih.a);
   public static final is<dvu<?>> O = a(kd.B, $$0 -> dvu.a);
   public static final is<doe<?>> P = a(kd.h, $$0 -> doe.k);
   public static final is<dpb<?>> Q = a(kd.j, $$0 -> dpb.a);
   public static final is<dqa<?>> R = a(kd.u, $$0 -> dqa.I);
   public static final is<dyk<?>> S = a(kd.ah, $$0 -> dyk.a);
   public static final is<dyd> T = a(kd.ag, $$0 -> dyd.c);
   public static final is<dxv<?>> U = a(kd.al, $$0 -> dxv.f);
   public static final is<dwu<?>> V = a(kd.S, $$0 -> dwu.f);
   public static final is<dug<?>> W = a(kd.i, $$0 -> dug.a);
   public static final is<dtr<?>> X = a(kd.y, $$0 -> dtr.a);
   public static final is<dvj<?>> Y = a(kd.an, $$0 -> dvj.a);
   public static final is<dud<?>> Z = a(kd.Z, $$0 -> dud.a);
   public static final is<dux<?>> aa = a(kd.am, $$0 -> dux.b);
   public static final is<dtg<?>> ab = a(kd.v, $$0 -> dtg.a);
   public static final is<Codec<? extends cth>> ac = a(kd.d, Lifecycle.stable(), cti::a);
   public static final is<Codec<? extends djk>> ad = a(kd.l, Lifecycle.stable(), djm::a);
   public static final is<Codec<? extends dnn.f>> ae = a(kd.L, dnn.f::a);
   public static final is<Codec<? extends dnn.o>> af = a(kd.M, dnn.o::a);
   public static final is<Codec<? extends dmp>> ag = a(kd.r, dmq::a);
   public static final is<MapCodec<? extends cvf>> ah = a(kd.f, cvg::a);
   public static final is<ebl<?>> ai = a(kd.ak, $$0 -> ebl.e);
   public static final is<dyu<?>> aj = a(kd.ai, $$0 -> dyu.d);
   public static final is<Codec<? extends dyx>> ak = a(kd.aj, dyy::a);
   public static final is<bxa> al = a(kd.k, bxa::a);
   public static final is<bxh> am = a(kd.z, $$0 -> bxh.a);
   public static final is<dez> an = a(kd.c, dfa::a);
   public static final is<clg> ao = a(kd.C, cli::a);
   public static final is<String> ap = a(kd.aq, dfz::a);
   public static final is<cju> aq = a(kd.o, cjv::a);
   public static final is<? extends is<?>> ar = au;

   private static <T> is<T> a(agl<? extends is<T>> $$0, kc.a<T> $$1) {
      return a($$0, Lifecycle.stable(), $$1);
   }

   private static <T> is<T> b(agl<? extends is<T>> $$0, kc.a<T> $$1) {
      return a($$0, new io<>($$0, Lifecycle.stable(), true), $$1, Lifecycle.stable());
   }

   private static <T> ia<T> a(agl<? extends is<T>> $$0, String $$1, kc.a<T> $$2) {
      return a($$0, $$1, Lifecycle.stable(), $$2);
   }

   private static <T> ia<T> b(agl<? extends is<T>> $$0, String $$1, kc.a<T> $$2) {
      return b($$0, $$1, Lifecycle.stable(), $$2);
   }

   private static <T> is<T> a(agl<? extends is<T>> $$0, Lifecycle $$1, kc.a<T> $$2) {
      return a($$0, new io<>($$0, $$1, false), $$2, $$1);
   }

   private static <T> ia<T> a(agl<? extends is<T>> $$0, String $$1, Lifecycle $$2, kc.a<T> $$3) {
      return a($$0, new hz<>($$1, $$0, $$2, false), $$3, $$2);
   }

   private static <T> ia<T> b(agl<? extends is<T>> $$0, String $$1, Lifecycle $$2, kc.a<T> $$3) {
      return a($$0, new hz<>($$1, $$0, $$2, true), $$3, $$2);
   }

   private static <T, R extends jb<T>> R a(agl<? extends is<T>> $$0, R $$1, kc.a<T> $$2, Lifecycle $$3) {
      agm $$4 = $$0.a();
      at.put($$4, () -> $$2.run($$1));
      au.a((agl<jb<?>>)$$0, $$1, $$3);
      return $$1;
   }

   public static void a() {
      b();
      c();
      a(ar);
   }

   private static void b() {
      at.forEach(($$0, $$1) -> {
         if ($$1.get() == null) {
            as.error("Unable to bootstrap registry '{}'", $$0);
         }
      });
   }

   private static void c() {
      ar.l();

      for (is<?> $$0 : ar) {
         $$0.l();
      }
   }

   private static <T extends is<?>> void a(is<T> $$0) {
      $$0.forEach($$1 -> {
         if ($$1.e().isEmpty()) {
            ac.a("Registry '" + $$0.b((T)$$1) + "' was empty after loading");
         }

         if ($$1 instanceof ia) {
            agm $$2 = ((ia)$$1).a();
            Validate.notNull($$1.a($$2), "Missing default of DefaultedMappedRegistry: " + $$2, new Object[0]);
         }
      });
   }

   @FunctionalInterface
   interface a<T> {
      T run(is<T> var1);
   }
}
