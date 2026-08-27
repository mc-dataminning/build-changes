import com.google.common.collect.Maps;
import com.mojang.logging.LogUtils;
import com.mojang.serialization.Codec;
import com.mojang.serialization.Lifecycle;
import java.util.Map;
import java.util.function.Supplier;
import org.apache.commons.lang3.Validate;
import org.slf4j.Logger;

public class jc {
   private static final Logger aq = LogUtils.getLogger();
   private static final Map<aep, Supplier<?>> ar = Maps.newLinkedHashMap();
   public static final aep a = new aep("root");
   private static final ib<ib<?>> as = new hn<>(aeo.a(a), Lifecycle.stable());
   public static final ha<dji> b = b(jd.z, "step", $$0 -> dji.P);
   public static final hs<aot> c = a(jd.ad, $$0 -> aou.ma);
   public static final ha<eaa> d = b(jd.w, "empty", $$0 -> eac.a);
   public static final hs<bhr> e = a(jd.O, $$0 -> bhv.z);
   public static final ha<csk> f = b(jd.e, "air", $$0 -> csl.a);
   public static final hs<cnd> g = a(jd.r, $$0 -> cnh.x);
   public static final ha<bik<?>> h = b(jd.s, "pig", $$0 -> bik.av);
   public static final ha<cir> i = b(jd.D, "air", $$0 -> ciz.a);
   public static final ha<ckt> j = a(jd.V, "empty", $$0 -> ckw.b);
   public static final hs<iv<?>> k = a(jd.Q, $$0 -> iw.c);
   public static final hs<dcm<?>> l = a(jd.f, $$0 -> dcm.a);
   public static final ha<bya> m = a(jd.P, "kebab", byb::a);
   public static final hs<aep> n = a(jd.o, $$0 -> ape.E);
   public static final ha<dgz> o = a(jd.l, "empty", $$0 -> dgz.c);
   public static final hs<dyl<?>> p = a(jd.Z, $$0 -> dyl.a);
   public static final hs<dyz<?>> q = a(jd.aa, $$0 -> dyz.b);
   public static final hs<dye<?>> r = a(jd.U, $$0 -> dye.a);
   public static final hs<cfh<?>> s = a(jd.N, $$0 -> cfh.h);
   public static final hs<cmc<?>> t = a(jd.X, $$0 -> cmc.a);
   public static final hs<cmb<?>> u = a(jd.W, $$0 -> cmb.b);
   public static final hs<bjy> v = a(jd.b, $$0 -> bkd.k);
   public static final hs<djn<?>> w = a(jd.T, $$0 -> djn.a);
   public static final hs<gh<?, ?>> x = a(jd.m, gi::a);
   public static final hs<apd<?>> y = a(jd.ae, $$0 -> ape.c);
   public static final ha<cbd> z = a(jd.an, "plains", $$0 -> cbd.c);
   public static final ha<cbb> A = a(jd.am, "none", $$0 -> cbb.b);
   public static final hs<btz> B = a(jd.S, bua::a);
   public static final ha<bry<?>> C = a(jd.M, "dummy", $$0 -> bry.a);
   public static final ha<btd<?>> D = a(jd.ac, "dummy", $$0 -> btd.a);
   public static final hs<ccy> E = a(jd.ab, $$0 -> ccy.c);
   public static final hs<ccw> F = a(jd.a, $$0 -> ccw.b);
   public static final hs<edd> G = a(jd.I, $$0 -> eda.a);
   public static final hs<edx> H = a(jd.F, $$0 -> edy.b);
   public static final hs<efi> I = a(jd.E, $$0 -> efj.a);
   public static final hs<egb> J = a(jd.H, $$0 -> egd.a);
   public static final hs<efu> K = a(jd.G, $$0 -> efw.b);
   public static final hs<egj> L = a(jd.J, $$0 -> egl.b);
   public static final hs<bfs<?>> M = a(jd.v, $$0 -> bfs.a);
   public static final hs<bfu<?>> N = a(jd.C, $$0 -> bfu.a);
   public static final hs<dtf<?>> O = a(jd.A, $$0 -> dtf.a);
   public static final hs<dlp<?>> P = a(jd.g, $$0 -> dlp.k);
   public static final hs<dmm<?>> Q = a(jd.i, $$0 -> dmm.a);
   public static final hs<dnl<?>> R = a(jd.t, $$0 -> dnl.I);
   public static final hs<dvv<?>> S = a(jd.ag, $$0 -> dvv.a);
   public static final hs<dvo> T = a(jd.af, $$0 -> dvo.c);
   public static final hs<dvg<?>> U = a(jd.aj, $$0 -> dvg.f);
   public static final hs<duf<?>> V = a(jd.R, $$0 -> duf.f);
   public static final hs<drr<?>> W = a(jd.h, $$0 -> drr.a);
   public static final hs<drc<?>> X = a(jd.x, $$0 -> drc.a);
   public static final hs<dsu<?>> Y = a(jd.al, $$0 -> dsu.a);
   public static final hs<dro<?>> Z = a(jd.Y, $$0 -> dro.a);
   public static final hs<dsi<?>> aa = a(jd.ak, $$0 -> dsi.b);
   public static final hs<dqr<?>> ab = a(jd.u, $$0 -> dqr.a);
   public static final hs<Codec<? extends cqm>> ac = a(jd.d, Lifecycle.stable(), cqn::a);
   public static final hs<Codec<? extends dgv>> ad = a(jd.k, Lifecycle.stable(), dgx::a);
   public static final hs<Codec<? extends dky.f>> ae = a(jd.K, dky.f::a);
   public static final hs<Codec<? extends dky.o>> af = a(jd.L, dky.o::a);
   public static final hs<Codec<? extends dka>> ag = a(jd.q, dkb::a);
   public static final hs<dyp<?>> ah = a(jd.ai, $$0 -> dyp.e);
   public static final hs<dwf<?>> ai = a(jd.ah, $$0 -> dwf.d);
   public static final hs<bum> aj = a(jd.j, bum::a);
   public static final hs<but> ak = a(jd.y, $$0 -> but.a);
   public static final hs<dcb> al = a(jd.c, dcc::a);
   public static final hs<cio> am = a(jd.B, ciq::a);
   public static final hs<String> an = a(jd.ao, dda::a);
   public static final hs<chc> ao = a(jd.n, chd::a);
   public static final hs<? extends hs<?>> ap = as;

   private static <T> hs<T> a(aeo<? extends hs<T>> $$0, jc.a<T> $$1) {
      return a($$0, Lifecycle.stable(), $$1);
   }

   private static <T> ha<T> a(aeo<? extends hs<T>> $$0, String $$1, jc.a<T> $$2) {
      return a($$0, $$1, Lifecycle.stable(), $$2);
   }

   private static <T> ha<T> b(aeo<? extends hs<T>> $$0, String $$1, jc.a<T> $$2) {
      return b($$0, $$1, Lifecycle.stable(), $$2);
   }

   private static <T> hs<T> a(aeo<? extends hs<T>> $$0, Lifecycle $$1, jc.a<T> $$2) {
      return a($$0, new hn<>($$0, $$1, false), $$2, $$1);
   }

   private static <T> ha<T> a(aeo<? extends hs<T>> $$0, String $$1, Lifecycle $$2, jc.a<T> $$3) {
      return a($$0, new gz<>($$1, $$0, $$2, false), $$3, $$2);
   }

   private static <T> ha<T> b(aeo<? extends hs<T>> $$0, String $$1, Lifecycle $$2, jc.a<T> $$3) {
      return a($$0, new gz<>($$1, $$0, $$2, true), $$3, $$2);
   }

   private static <T, R extends ib<T>> R a(aeo<? extends hs<T>> $$0, R $$1, jc.a<T> $$2, Lifecycle $$3) {
      aep $$4 = $$0.a();
      ar.put($$4, () -> $$2.run($$1));
      as.a((aeo<ib<?>>)$$0, $$1, $$3);
      return $$1;
   }

   public static void a() {
      b();
      c();
      a(ap);
   }

   private static void b() {
      ar.forEach(($$0, $$1) -> {
         if ($$1.get() == null) {
            aq.error("Unable to bootstrap registry '{}'", $$0);
         }
      });
   }

   private static void c() {
      ap.l();

      for (hs<?> $$0 : ap) {
         $$0.l();
      }
   }

   private static <T extends hs<?>> void a(hs<T> $$0) {
      $$0.forEach($$1 -> {
         if ($$1.e().isEmpty()) {
            ac.a("Registry '" + $$0.b((T)$$1) + "' was empty after loading");
         }

         if ($$1 instanceof ha) {
            aep $$2 = ((ha)$$1).a();
            Validate.notNull($$1.a($$2), "Missing default of DefaultedMappedRegistry: " + $$2, new Object[0]);
         }
      });
   }

   @FunctionalInterface
   interface a<T> {
      T run(hs<T> var1);
   }
}
