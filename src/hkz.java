import com.mojang.logging.LogUtils;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.UnaryOperator;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import org.slf4j.Logger;

public class hkz {
   public static final hkw a = new hkw(hio.d, alg.b("block/fire_0"));
   public static final hkw b = new hkw(hio.d, alg.b("block/fire_1"));
   public static final hkw c = new hkw(hio.d, alg.b("block/lava_flow"));
   public static final hkw d = new hkw(hio.d, alg.b("block/water_flow"));
   public static final hkw e = new hkw(hio.d, alg.b("block/water_overlay"));
   public static final hkw f = new hkw(gqn.c, alg.b("entity/banner_base"));
   public static final hkw g = new hkw(gqn.d, alg.b("entity/shield_base"));
   public static final hkw h = new hkw(gqn.d, alg.b("entity/shield_base_nopattern"));
   public static final int i = 10;
   public static final List<alg> j = IntStream.range(0, 10).mapToObj($$0 -> alg.b("block/destroy_stage_" + $$0)).collect(Collectors.toList());
   public static final List<alg> k = j.stream().map($$0 -> $$0.a((UnaryOperator<String>)($$0x -> "textures/" + $$0x + ".png"))).collect(Collectors.toList());
   public static final List<gqc> l = k.stream().map(gqc::t).collect(Collectors.toList());
   static final Logger m = LogUtils.getLogger();
   private final giq n;
   final Map<hkz.a, hkp> o = new HashMap<>();
   private final Map<hle, grm> p;
   private final Map<alg, hfb> q;
   final Map<alg, hlk> r;
   final hlk s;

   public hkz(giq $$0, Map<hle, grm> $$1, Map<alg, hfb> $$2, Map<alg, hlk> $$3, hlk $$4) {
      this.n = $$0;
      this.p = $$1;
      this.q = $$2;
      this.r = $$3;
      this.s = $$4;
   }

   public hkz.b a(hkz.d $$0) {
      hkp $$1 = hlk.a(this.s, new hkz.c($$0, () -> "missing"), hkq.a);
      Map<hle, hkp> $$2 = new HashMap<>(this.p.size());
      this.p.forEach(($$2x, $$3x) -> {
         try {
            hkp $$4x = $$3x.a(new hkz.c($$0, $$2x::toString));
            $$2.put($$2x, $$4x);
         } catch (Exception var6x) {
            m.warn("Unable to bake model: '{}': {}", $$2x, var6x);
         }
      });
      hff $$3 = new hfj($$1);
      Map<alg, hff> $$4 = new HashMap<>(this.q.size());
      Map<alg, hfb.a> $$5 = new HashMap<>(this.q.size());
      this.q.forEach(($$4x, $$5x) -> {
         hla $$6 = () -> $$4x + "#inventory";
         hkz.c $$7 = new hkz.c($$0, $$6);
         hff.a $$8 = new hff.a($$7, this.n, $$3, $$5x.c());

         try {
            hff $$9 = $$5x.a().a($$8);
            $$4.put($$4x, $$9);
            if (!$$5x.b().equals(hfb.a.a)) {
               $$5.put($$4x, $$5x.b());
            }
         } catch (Exception var11) {
            m.warn("Unable to bake item model: '{}'", $$4x, var11);
         }
      });
      return new hkz.b($$1, $$2, $$3, $$4, $$5);
   }

   static record a(alg a, j b, boolean c) {
   }

   public static record b(hkp a, Map<hle, hkp> b, hff c, Map<alg, hff> d, Map<alg, hfb.a> e) {
   }

   class c implements hky {
      private final hla b;
      private final hlj c;

      c(final hkz.d $$0, final hla $$1) {
         this.c = $$0.a($$1);
         this.b = $$1;
      }

      @Override
      public hlj a() {
         return this.c;
      }

      private hlk a(alg $$0) {
         hlk $$1 = hkz.this.r.get($$0);
         if ($$1 == null) {
            hkz.m.warn("Requested a model that was not discovered previously: {}", $$0);
            return hkz.this.s;
         } else {
            return $$1;
         }
      }

      @Override
      public hkp a(alg $$0, hlf $$1) {
         hkz.a $$2 = new hkz.a($$0, $$1.a(), $$1.b());
         hkp $$3 = hkz.this.o.get($$2);
         if ($$3 != null) {
            return $$3;
         } else {
            hlk $$4 = this.a($$0);
            hkp $$5 = hlk.a($$4, this, $$1);
            hkz.this.o.put($$2, $$5);
            return $$5;
         }
      }

      @Override
      public hla b() {
         return this.b;
      }
   }

   public interface d {
      hip a(hla var1, hkw var2);

      hip a(hla var1, String var2);

      default hlj a(final hla $$0) {
         return new hlj() {
            @Override
            public hip a(hkw $$0x) {
               return d.this.a($$0, $$0);
            }

            @Override
            public hip a(String $$0x) {
               return d.this.a($$0, $$0);
            }
         };
      }
   }
}
