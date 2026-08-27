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
   private static final Logger as = LogUtils.getLogger();
   private static final Map<agi, Supplier<?>> at = Maps.newLinkedHashMap();
   public static final agi a = new agi("root");
   private static final ix<ix<?>> au = new ik<>(agh.a(a), Lifecycle.stable());
   public static final hw<dls> b = b(jz.A, "step", $$0 -> dls.P);
   public static final io<aqq> c = a(jz.ae, $$0 -> aqr.mu);
   public static final hw<ecr> d = b(jz.x, "empty", $$0 -> ect.a);
   public static final io<bkb> e = b(jz.P, $$0 -> bkf.z);
   public static final hw<cva> f = b(jz.e, "air", $$0 -> cvc.a);
   public static final io<cpu> g = b(jz.s, $$0 -> cpy.x);
   public static final hw<bku<?>> h = b(jz.t, "pig", $$0 -> bku.av);
   public static final hw<cle> i = b(jz.E, "air", $$0 -> clm.a);
   public static final hw<cng> j = b(jz.W, "empty", $$0 -> cnj.b);
   public static final io<jr<?>> k = a(jz.R, $$0 -> js.c);
   public static final io<dff<?>> l = b(jz.g, $$0 -> dff.a);
   public static final hw<caj> m = a(jz.Q, "kebab", cak::a);
   public static final io<agi> n = a(jz.p, $$0 -> arb.E);
   public static final hw<djj> o = a(jz.m, "empty", $$0 -> djj.c);
   public static final io<ebc<?>> p = a(jz.aa, $$0 -> ebc.a);
   public static final io<ebq<?>> q = a(jz.ab, $$0 -> ebq.b);
   public static final io<eav<?>> r = a(jz.V, $$0 -> eav.a);
   public static final io<cht<?>> s = a(jz.O, $$0 -> cht.i);
   public static final io<cot<?>> t = a(jz.Y, $$0 -> cot.a);
   public static final io<cos<?>> u = a(jz.X, $$0 -> cos.b);
   public static final io<bmh> v = a(jz.b, $$0 -> bmm.j);
   public static final io<dlx<?>> w = a(jz.U, $$0 -> dlx.a);
   public static final io<hf<?, ?>> x = a(jz.n, hg::a);
   public static final io<ara<?>> y = a(jz.af, $$0 -> arb.c);
   public static final hw<cdm> z = a(jz.ap, "plains", $$0 -> cdm.c);
   public static final hw<cdk> A = a(jz.ao, "none", $$0 -> cdk.b);
   public static final io<bwi> B = a(jz.T, bwj::a);
   public static final hw<buh<?>> C = a(jz.N, "dummy", $$0 -> buh.a);
   public static final hw<bvm<?>> D = a(jz.ad, "dummy", $$0 -> bvm.a);
   public static final io<cfh> E = a(jz.ac, $$0 -> cfh.c);
   public static final io<cff> F = a(jz.a, $$0 -> cff.b);
   public static final io<efr> G = a(jz.J, $$0 -> efo.b);
   public static final io<egl> H = a(jz.G, $$0 -> egm.c);
   public static final io<ehx> I = a(jz.F, $$0 -> ehy.b);
   public static final io<eiq> J = a(jz.I, $$0 -> eis.b);
   public static final io<eij> K = a(jz.H, $$0 -> eil.c);
   public static final io<eiy> L = a(jz.K, $$0 -> eja.c);
   public static final io<bib<?>> M = a(jz.w, $$0 -> bib.a);
   public static final io<bid<?>> N = a(jz.D, $$0 -> bid.a);
   public static final io<dvp<?>> O = a(jz.B, $$0 -> dvp.a);
   public static final io<dnz<?>> P = a(jz.h, $$0 -> dnz.k);
   public static final io<dow<?>> Q = a(jz.j, $$0 -> dow.a);
   public static final io<dpv<?>> R = a(jz.u, $$0 -> dpv.I);
   public static final io<dyf<?>> S = a(jz.ah, $$0 -> dyf.a);
   public static final io<dxy> T = a(jz.ag, $$0 -> dxy.c);
   public static final io<dxq<?>> U = a(jz.al, $$0 -> dxq.f);
   public static final io<dwp<?>> V = a(jz.S, $$0 -> dwp.f);
   public static final io<dub<?>> W = a(jz.i, $$0 -> dub.a);
   public static final io<dtm<?>> X = a(jz.y, $$0 -> dtm.a);
   public static final io<dve<?>> Y = a(jz.an, $$0 -> dve.a);
   public static final io<dty<?>> Z = a(jz.Z, $$0 -> dty.a);
   public static final io<dus<?>> aa = a(jz.am, $$0 -> dus.b);
   public static final io<dtb<?>> ab = a(jz.v, $$0 -> dtb.a);
   public static final io<Codec<? extends ctc>> ac = a(jz.d, Lifecycle.stable(), ctd::a);
   public static final io<Codec<? extends djf>> ad = a(jz.l, Lifecycle.stable(), djh::a);
   public static final io<Codec<? extends dni.f>> ae = a(jz.L, dni.f::a);
   public static final io<Codec<? extends dni.o>> af = a(jz.M, dni.o::a);
   public static final io<Codec<? extends dmk>> ag = a(jz.r, dml::a);
   public static final io<MapCodec<? extends cva>> ah = a(jz.f, cvb::a);
   public static final io<ebg<?>> ai = a(jz.ak, $$0 -> ebg.e);
   public static final io<dyp<?>> aj = a(jz.ai, $$0 -> dyp.d);
   public static final io<Codec<? extends dys>> ak = a(jz.aj, dyt::a);
   public static final io<bwv> al = a(jz.k, bwv::a);
   public static final io<bxc> am = a(jz.z, $$0 -> bxc.a);
   public static final io<deu> an = a(jz.c, dev::a);
   public static final io<clb> ao = a(jz.C, cld::a);
   public static final io<String> ap = a(jz.aq, dfu::a);
   public static final io<cjp> aq = a(jz.o, cjq::a);
   public static final io<? extends io<?>> ar = au;

   private static <T> io<T> a(agh<? extends io<T>> $$0, jy.a<T> $$1) {
      return a($$0, Lifecycle.stable(), $$1);
   }

   private static <T> io<T> b(agh<? extends io<T>> $$0, jy.a<T> $$1) {
      return a($$0, new ik<>($$0, Lifecycle.stable(), true), $$1, Lifecycle.stable());
   }

   private static <T> hw<T> a(agh<? extends io<T>> $$0, String $$1, jy.a<T> $$2) {
      return a($$0, $$1, Lifecycle.stable(), $$2);
   }

   private static <T> hw<T> b(agh<? extends io<T>> $$0, String $$1, jy.a<T> $$2) {
      return b($$0, $$1, Lifecycle.stable(), $$2);
   }

   private static <T> io<T> a(agh<? extends io<T>> $$0, Lifecycle $$1, jy.a<T> $$2) {
      return a($$0, new ik<>($$0, $$1, false), $$2, $$1);
   }

   private static <T> hw<T> a(agh<? extends io<T>> $$0, String $$1, Lifecycle $$2, jy.a<T> $$3) {
      return a($$0, new hv<>($$1, $$0, $$2, false), $$3, $$2);
   }

   private static <T> hw<T> b(agh<? extends io<T>> $$0, String $$1, Lifecycle $$2, jy.a<T> $$3) {
      return a($$0, new hv<>($$1, $$0, $$2, true), $$3, $$2);
   }

   private static <T, R extends ix<T>> R a(agh<? extends io<T>> $$0, R $$1, jy.a<T> $$2, Lifecycle $$3) {
      agi $$4 = $$0.a();
      at.put($$4, () -> $$2.run($$1));
      au.a((agh<ix<?>>)$$0, $$1, $$3);
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

      for (io<?> $$0 : ar) {
         $$0.l();
      }
   }

   private static <T extends io<?>> void a(io<T> $$0) {
      $$0.forEach($$1 -> {
         if ($$1.e().isEmpty()) {
            ac.a("Registry '" + $$0.b((T)$$1) + "' was empty after loading");
         }

         if ($$1 instanceof hw) {
            agi $$2 = ((hw)$$1).a();
            Validate.notNull($$1.a($$2), "Missing default of DefaultedMappedRegistry: " + $$2, new Object[0]);
         }
      });
   }

   @FunctionalInterface
   interface a<T> {
      T run(io<T> var1);
   }
}
