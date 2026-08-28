import com.mojang.logging.LogUtils;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.UnaryOperator;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import org.slf4j.Logger;

public class hlh {
   public static final hle a = new hle(hiw.d, alg.b("block/fire_0"));
   public static final hle b = new hle(hiw.d, alg.b("block/fire_1"));
   public static final hle c = new hle(hiw.d, alg.b("block/lava_flow"));
   public static final hle d = new hle(hiw.d, alg.b("block/water_flow"));
   public static final hle e = new hle(hiw.d, alg.b("block/water_overlay"));
   public static final hle f = new hle(gqv.c, alg.b("entity/banner_base"));
   public static final hle g = new hle(gqv.d, alg.b("entity/shield_base"));
   public static final hle h = new hle(gqv.d, alg.b("entity/shield_base_nopattern"));
   public static final int i = 10;
   public static final List<alg> j = IntStream.range(0, 10).mapToObj($$0 -> alg.b("block/destroy_stage_" + $$0)).collect(Collectors.toList());
   public static final List<alg> k = j.stream().map($$0 -> $$0.a((UnaryOperator<String>)($$0x -> "textures/" + $$0x + ".png"))).collect(Collectors.toList());
   public static final List<gqk> l = k.stream().map(gqk::t).collect(Collectors.toList());
   static final Logger m = LogUtils.getLogger();
   private final giy n;
   final Map<hlh.a, hkx> o = new HashMap<>();
   private final Map<hlm, gru> p;
   private final Map<alg, hfj> q;
   final Map<alg, hls> r;
   final hls s;

   public hlh(giy $$0, Map<hlm, gru> $$1, Map<alg, hfj> $$2, Map<alg, hls> $$3, hls $$4) {
      this.n = $$0;
      this.p = $$1;
      this.q = $$2;
      this.r = $$3;
      this.s = $$4;
   }

   public hlh.b a(hlh.d $$0) {
      hkx $$1 = hls.a(this.s, new hlh.c($$0, () -> "missing"), hky.a);
      Map<hlm, hkx> $$2 = new HashMap<>(this.p.size());
      this.p.forEach(($$2x, $$3x) -> {
         try {
            hkx $$4x = $$3x.a(new hlh.c($$0, $$2x::toString));
            $$2.put($$2x, $$4x);
         } catch (Exception var6x) {
            m.warn("Unable to bake model: '{}': {}", $$2x, var6x);
         }
      });
      hfn $$3 = new hfr($$1);
      Map<alg, hfn> $$4 = new HashMap<>(this.q.size());
      Map<alg, hfj.a> $$5 = new HashMap<>(this.q.size());
      this.q.forEach(($$4x, $$5x) -> {
         hli $$6 = () -> $$4x + "#inventory";
         hlh.c $$7 = new hlh.c($$0, $$6);
         hfn.a $$8 = new hfn.a($$7, this.n, $$3, $$5x.c());

         try {
            hfn $$9 = $$5x.a().a($$8);
            $$4.put($$4x, $$9);
            if (!$$5x.b().equals(hfj.a.a)) {
               $$5.put($$4x, $$5x.b());
            }
         } catch (Exception var11) {
            m.warn("Unable to bake item model: '{}'", $$4x, var11);
         }
      });
      return new hlh.b($$1, $$2, $$3, $$4, $$5);
   }

   static record a(alg a, j b, boolean c) {
   }

   public static record b(hkx a, Map<hlm, hkx> b, hfn c, Map<alg, hfn> d, Map<alg, hfj.a> e) {
   }

   class c implements hlg {
      private final hli b;
      private final hlr c;

      c(final hlh.d $$0, final hli $$1) {
         this.c = $$0.a($$1);
         this.b = $$1;
      }

      @Override
      public hlr a() {
         return this.c;
      }

      private hls a(alg $$0) {
         hls $$1 = hlh.this.r.get($$0);
         if ($$1 == null) {
            hlh.m.warn("Requested a model that was not discovered previously: {}", $$0);
            return hlh.this.s;
         } else {
            return $$1;
         }
      }

      @Override
      public hkx a(alg $$0, hln $$1) {
         hlh.a $$2 = new hlh.a($$0, $$1.a(), $$1.b());
         hkx $$3 = hlh.this.o.get($$2);
         if ($$3 != null) {
            return $$3;
         } else {
            hls $$4 = this.a($$0);
            hkx $$5 = hls.a($$4, this, $$1);
            hlh.this.o.put($$2, $$5);
            return $$5;
         }
      }

      @Override
      public hli b() {
         return this.b;
      }
   }

   public interface d {
      hix a(hli var1, hle var2);

      hix a(hli var1, String var2);

      default hlr a(final hli $$0) {
         return new hlr() {
            @Override
            public hix a(hle $$0x) {
               return d.this.a($$0, $$0);
            }

            @Override
            public hix a(String $$0x) {
               return d.this.a($$0, $$0);
            }
         };
      }
   }
}
