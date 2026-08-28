import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableMap.Builder;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import java.util.HashMap;
import java.util.Map;

public class hdp {
   private static final ayi.b<aku, MapCodec<? extends hdo.a>> b = new ayi.b<>();
   public static final Codec<hdo.a> a = b.a(aku.a).dispatch(hdo.a::a, $$0 -> $$0);
   private static final Map<djm, hdo.a> c = ImmutableMap.builder()
      .put(djo.hb, new hdn.a(dqt.b.c))
      .put(djo.hf, new hdn.a(dqt.b.f))
      .put(djo.hj, new hdn.a(dqt.b.g))
      .put(djo.hl, new hdn.a(dqt.b.i))
      .put(djo.hn, new hdn.a(dqt.b.h))
      .put(djo.hh, new hdn.a(dqt.b.e))
      .put(djo.hd, new hdn.a(dqt.b.c))
      .put(djo.jh, new hdf.a(cvm.a))
      .put(djo.ji, new hdf.a(cvm.b))
      .put(djo.jj, new hdf.a(cvm.c))
      .put(djo.jk, new hdf.a(cvm.d))
      .put(djo.jl, new hdf.a(cvm.e))
      .put(djo.jm, new hdf.a(cvm.f))
      .put(djo.jn, new hdf.a(cvm.g))
      .put(djo.jo, new hdf.a(cvm.h))
      .put(djo.jp, new hdf.a(cvm.i))
      .put(djo.jq, new hdf.a(cvm.j))
      .put(djo.jr, new hdf.a(cvm.k))
      .put(djo.js, new hdf.a(cvm.l))
      .put(djo.jt, new hdf.a(cvm.m))
      .put(djo.ju, new hdf.a(cvm.n))
      .put(djo.jv, new hdf.a(cvm.o))
      .put(djo.jw, new hdf.a(cvm.p))
      .put(djo.bg, new hdg.a(cvm.a))
      .put(djo.bh, new hdg.a(cvm.b))
      .put(djo.bi, new hdg.a(cvm.c))
      .put(djo.bj, new hdg.a(cvm.d))
      .put(djo.bk, new hdg.a(cvm.e))
      .put(djo.bl, new hdg.a(cvm.f))
      .put(djo.bm, new hdg.a(cvm.g))
      .put(djo.bn, new hdg.a(cvm.h))
      .put(djo.bo, new hdg.a(cvm.i))
      .put(djo.bp, new hdg.a(cvm.j))
      .put(djo.bq, new hdg.a(cvm.k))
      .put(djo.br, new hdg.a(cvm.l))
      .put(djo.bs, new hdg.a(cvm.m))
      .put(djo.bt, new hdg.a(cvm.n))
      .put(djo.bu, new hdg.a(cvm.o))
      .put(djo.bv, new hdg.a(cvm.p))
      .put(djo.lr, new hdm.a())
      .put(djo.ls, new hdm.a(cvm.a))
      .put(djo.lt, new hdm.a(cvm.b))
      .put(djo.lu, new hdm.a(cvm.c))
      .put(djo.lv, new hdm.a(cvm.d))
      .put(djo.lw, new hdm.a(cvm.e))
      .put(djo.lx, new hdm.a(cvm.f))
      .put(djo.ly, new hdm.a(cvm.g))
      .put(djo.lz, new hdm.a(cvm.h))
      .put(djo.lA, new hdm.a(cvm.i))
      .put(djo.lB, new hdm.a(cvm.j))
      .put(djo.lC, new hdm.a(cvm.k))
      .put(djo.lD, new hdm.a(cvm.l))
      .put(djo.lE, new hdm.a(cvm.m))
      .put(djo.lF, new hdm.a(cvm.n))
      .put(djo.lG, new hdm.a(cvm.o))
      .put(djo.lH, new hdm.a(cvm.p))
      .put(djo.nz, new hdi.a())
      .put(djo.cD, new hdh.a(hdh.b))
      .put(djo.hs, new hdh.a(hdh.c))
      .put(djo.gb, new hdh.a(hdh.d))
      .put(djo.tR, new hdj.a())
      .build();
   private static final hdh.a d = new hdh.a(hdh.a);

   public static void a() {
      b.a(aku.b("bed"), hdg.a.a);
      b.a(aku.b("banner"), hdf.a.a);
      b.a(aku.b("conduit"), hdi.a.a);
      b.a(aku.b("chest"), hdh.a.a);
      b.a(aku.b("head"), hdn.a.a);
      b.a(aku.b("shulker_box"), hdm.a.a);
      b.a(aku.b("shield"), hdl.a.b);
      b.a(aku.b("trident"), hdq.a.a);
      b.a(aku.b("decorated_pot"), hdj.a.a);
   }

   public static Map<djm, hdo<?>> a(gey $$0) {
      Map<djm, hdo.a> $$1 = new HashMap<>(c);
      if (goo.b()) {
         $$1.put(djo.cD, d);
         $$1.put(djo.hs, d);
      }

      Builder<djm, hdo<?>> $$2 = ImmutableMap.builder();
      $$1.forEach(($$2x, $$3) -> {
         hdo<?> $$4 = $$3.a($$0);
         if ($$4 != null) {
            $$2.put($$2x, $$4);
         }
      });
      return $$2.build();
   }
}
