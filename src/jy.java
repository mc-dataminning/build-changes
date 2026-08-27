import com.google.common.collect.Maps;
import com.mojang.logging.LogUtils;
import com.mojang.serialization.Codec;
import com.mojang.serialization.Lifecycle;
import com.mojang.serialization.MapCodec;
import java.util.Map;
import java.util.function.Supplier;
import org.apache.commons.lang3.Validate;
import org.slf4j.Logger;

public class jy {
   private static final Logger ar = LogUtils.getLogger();
   private static final Map<afw, Supplier<?>> as = Maps.newLinkedHashMap();
   public static final afw a = new afw("root");
   private static final ix<ix<?>> at = new ik<>(afv.a(a), Lifecycle.stable());
   public static final hw<dkl> b = b(jz.A, "step", $$0 -> dkl.P);
   public static final io<aqc> c = a(jz.ae, $$0 -> aqd.mc);
   public static final hw<ebd> d = b(jz.x, "empty", $$0 -> ebf.a);
   public static final io<bje> e = b(jz.P, $$0 -> bji.z);
   public static final hw<cua> f = b(jz.e, "air", $$0 -> cuc.a);
   public static final io<cot> g = b(jz.s, $$0 -> cox.x);
   public static final hw<bjx<?>> h = b(jz.t, "pig", $$0 -> bjx.av);
   public static final hw<cke> i = b(jz.E, "air", $$0 -> ckm.a);
   public static final hw<cmg> j = b(jz.W, "empty", $$0 -> cmj.b);
   public static final io<jr<?>> k = a(jz.R, $$0 -> js.c);
   public static final io<ddz<?>> l = b(jz.g, $$0 -> ddz.a);
   public static final hw<bzm> m = a(jz.Q, "kebab", bzn::a);
   public static final io<afw> n = a(jz.p, $$0 -> aqn.E);
   public static final hw<dic> o = a(jz.m, "empty", $$0 -> dic.c);
   public static final io<dzo<?>> p = a(jz.aa, $$0 -> dzo.a);
   public static final io<eac<?>> q = a(jz.ab, $$0 -> eac.b);
   public static final io<dzh<?>> r = a(jz.V, $$0 -> dzh.a);
   public static final io<cgu<?>> s = a(jz.O, $$0 -> cgu.h);
   public static final io<cnr<?>> t = a(jz.Y, $$0 -> cnr.a);
   public static final io<cnq<?>> u = a(jz.X, $$0 -> cnq.b);
   public static final io<blk> v = a(jz.b, $$0 -> blp.j);
   public static final io<dkq<?>> w = a(jz.U, $$0 -> dkq.a);
   public static final io<hf<?, ?>> x = a(jz.n, hg::a);
   public static final io<aqm<?>> y = a(jz.af, $$0 -> aqn.c);
   public static final hw<ccp> z = a(jz.ao, "plains", $$0 -> ccp.c);
   public static final hw<ccn> A = a(jz.an, "none", $$0 -> ccn.b);
   public static final io<bvl> B = a(jz.T, bvm::a);
   public static final hw<btk<?>> C = a(jz.N, "dummy", $$0 -> btk.a);
   public static final hw<bup<?>> D = a(jz.ad, "dummy", $$0 -> bup.a);
   public static final io<cek> E = a(jz.ac, $$0 -> cek.c);
   public static final io<cei> F = a(jz.a, $$0 -> cei.b);
   public static final io<eec> G = a(jz.J, $$0 -> edz.b);
   public static final io<eew> H = a(jz.G, $$0 -> eex.c);
   public static final io<egi> I = a(jz.F, $$0 -> egj.b);
   public static final io<ehb> J = a(jz.I, $$0 -> ehd.b);
   public static final io<egu> K = a(jz.H, $$0 -> egw.c);
   public static final io<ehj> L = a(jz.K, $$0 -> ehl.c);
   public static final io<bhf<?>> M = a(jz.w, $$0 -> bhf.a);
   public static final io<bhh<?>> N = a(jz.D, $$0 -> bhh.a);
   public static final io<dui<?>> O = a(jz.B, $$0 -> dui.a);
   public static final io<dms<?>> P = a(jz.h, $$0 -> dms.k);
   public static final io<dnp<?>> Q = a(jz.j, $$0 -> dnp.a);
   public static final io<doo<?>> R = a(jz.u, $$0 -> doo.I);
   public static final io<dwy<?>> S = a(jz.ah, $$0 -> dwy.a);
   public static final io<dwr> T = a(jz.ag, $$0 -> dwr.c);
   public static final io<dwj<?>> U = a(jz.ak, $$0 -> dwj.f);
   public static final io<dvi<?>> V = a(jz.S, $$0 -> dvi.f);
   public static final io<dsu<?>> W = a(jz.i, $$0 -> dsu.a);
   public static final io<dsf<?>> X = a(jz.y, $$0 -> dsf.a);
   public static final io<dtx<?>> Y = a(jz.am, $$0 -> dtx.a);
   public static final io<dsr<?>> Z = a(jz.Z, $$0 -> dsr.a);
   public static final io<dtl<?>> aa = a(jz.al, $$0 -> dtl.b);
   public static final io<dru<?>> ab = a(jz.v, $$0 -> dru.a);
   public static final io<Codec<? extends csb>> ac = a(jz.d, Lifecycle.stable(), csc::a);
   public static final io<Codec<? extends dhy>> ad = a(jz.l, Lifecycle.stable(), dia::a);
   public static final io<Codec<? extends dmb.f>> ae = a(jz.L, dmb.f::a);
   public static final io<Codec<? extends dmb.o>> af = a(jz.M, dmb.o::a);
   public static final io<Codec<? extends dld>> ag = a(jz.r, dle::a);
   public static final io<MapCodec<? extends cua>> ah = a(jz.f, cub::a);
   public static final io<dzs<?>> ai = a(jz.aj, $$0 -> dzs.e);
   public static final io<dxi<?>> aj = a(jz.ai, $$0 -> dxi.d);
   public static final io<bvy> ak = a(jz.k, bvy::a);
   public static final io<bwf> al = a(jz.z, $$0 -> bwf.a);
   public static final io<ddo> am = a(jz.c, ddp::a);
   public static final io<ckb> an = a(jz.C, ckd::a);
   public static final io<String> ao = a(jz.ap, den::a);
   public static final io<cip> ap = a(jz.o, ciq::a);
   public static final io<? extends io<?>> aq = at;

   private static <T> io<T> a(afv<? extends io<T>> $$0, jy.a<T> $$1) {
      return a($$0, Lifecycle.stable(), $$1);
   }

   private static <T> io<T> b(afv<? extends io<T>> $$0, jy.a<T> $$1) {
      return a($$0, new ik<>($$0, Lifecycle.stable(), true), $$1, Lifecycle.stable());
   }

   private static <T> hw<T> a(afv<? extends io<T>> $$0, String $$1, jy.a<T> $$2) {
      return a($$0, $$1, Lifecycle.stable(), $$2);
   }

   private static <T> hw<T> b(afv<? extends io<T>> $$0, String $$1, jy.a<T> $$2) {
      return b($$0, $$1, Lifecycle.stable(), $$2);
   }

   private static <T> io<T> a(afv<? extends io<T>> $$0, Lifecycle $$1, jy.a<T> $$2) {
      return a($$0, new ik<>($$0, $$1, false), $$2, $$1);
   }

   private static <T> hw<T> a(afv<? extends io<T>> $$0, String $$1, Lifecycle $$2, jy.a<T> $$3) {
      return a($$0, new hv<>($$1, $$0, $$2, false), $$3, $$2);
   }

   private static <T> hw<T> b(afv<? extends io<T>> $$0, String $$1, Lifecycle $$2, jy.a<T> $$3) {
      return a($$0, new hv<>($$1, $$0, $$2, true), $$3, $$2);
   }

   private static <T, R extends ix<T>> R a(afv<? extends io<T>> $$0, R $$1, jy.a<T> $$2, Lifecycle $$3) {
      afw $$4 = $$0.a();
      as.put($$4, () -> $$2.run($$1));
      at.a((afv<ix<?>>)$$0, $$1, $$3);
      return $$1;
   }

   public static void a() {
      b();
      c();
      a(aq);
   }

   private static void b() {
      as.forEach(($$0, $$1) -> {
         if ($$1.get() == null) {
            ar.error("Unable to bootstrap registry '{}'", $$0);
         }
      });
   }

   private static void c() {
      aq.l();

      for (io<?> $$0 : aq) {
         $$0.l();
      }
   }

   private static <T extends io<?>> void a(io<T> $$0) {
      $$0.forEach($$1 -> {
         if ($$1.e().isEmpty()) {
            ac.a("Registry '" + $$0.b((T)$$1) + "' was empty after loading");
         }

         if ($$1 instanceof hw) {
            afw $$2 = ((hw)$$1).a();
            Validate.notNull($$1.a($$2), "Missing default of DefaultedMappedRegistry: " + $$2, new Object[0]);
         }
      });
   }

   @FunctionalInterface
   interface a<T> {
      T run(io<T> var1);
   }
}
