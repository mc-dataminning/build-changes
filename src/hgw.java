import com.mojang.logging.LogUtils;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.UnaryOperator;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import org.slf4j.Logger;

public class hgw {
   public static final hgt a = new hgt(hel.d, aku.b("block/fire_0"));
   public static final hgt b = new hgt(hel.d, aku.b("block/fire_1"));
   public static final hgt c = new hgt(hel.d, aku.b("block/lava_flow"));
   public static final hgt d = new hgt(hel.d, aku.b("block/water_flow"));
   public static final hgt e = new hgt(hel.d, aku.b("block/water_overlay"));
   public static final hgt f = new hgt(gmq.c, aku.b("entity/banner_base"));
   public static final hgt g = new hgt(gmq.d, aku.b("entity/shield_base"));
   public static final hgt h = new hgt(gmq.d, aku.b("entity/shield_base_nopattern"));
   public static final int i = 10;
   public static final List<aku> j = IntStream.range(0, 10).mapToObj($$0 -> aku.b("block/destroy_stage_" + $$0)).collect(Collectors.toList());
   public static final List<aku> k = j.stream().map($$0 -> $$0.a((UnaryOperator<String>)($$0x -> "textures/" + $$0x + ".png"))).collect(Collectors.toList());
   public static final List<gmf> l = k.stream().map(gmf::t).collect(Collectors.toList());
   static final Logger m = LogUtils.getLogger();
   private final gew n;
   final Map<hgw.a, hgm> o = new HashMap<>();
   private final Map<hhb, gnp> p;
   private final Map<aku, hbh.b> q;
   final Map<aku, hhh> r;
   final hhh s;

   public hgw(gew $$0, Map<hhb, gnp> $$1, Map<aku, hbh.b> $$2, Map<aku, hhh> $$3, hhh $$4) {
      this.n = $$0;
      this.p = $$1;
      this.q = $$2;
      this.r = $$3;
      this.s = $$4;
   }

   public hgw.b a(hgw.d $$0) {
      hgm $$1 = hhh.a(this.s, new hgw.c($$0, () -> "missing"), hgn.a);
      Map<hhb, hgm> $$2 = new HashMap<>(this.p.size());
      this.p.forEach(($$2x, $$3x) -> {
         try {
            hgm $$4x = $$3x.a(new hgw.c($$0, $$2x::toString));
            $$2.put($$2x, $$4x);
         } catch (Exception var6) {
            m.warn("Unable to bake model: '{}': {}", $$2x, var6);
         }
      });
      hbh $$3 = new hbl($$1);
      Map<aku, hbh> $$4 = new HashMap<>(this.q.size());
      this.q.forEach(($$3x, $$4x) -> {
         hgx $$5 = () -> $$3x + "#inventory";
         hgw.c $$6 = new hgw.c($$0, $$5);
         hbh.a $$7 = new hbh.a($$6, this.n, $$3);

         try {
            hbh $$8 = $$4x.a($$7);
            $$4.put($$3x, $$8);
         } catch (Exception var10) {
            m.warn("Unable to bake item model: '{}'", $$3x, var10);
         }
      });
      return new hgw.b($$1, $$2, $$3, $$4);
   }

   static record a(aku a, j b, boolean c) {
   }

   public static record b(hgm a, Map<hhb, hgm> b, hbh c, Map<aku, hbh> d) {
   }

   class c implements hgv {
      private final hgx b;
      private final hhg c;

      c(final hgw.d $$0, final hgx $$1) {
         this.c = $$0.a($$1);
         this.b = $$1;
      }

      @Override
      public hhg a() {
         return this.c;
      }

      private hhh a(aku $$0) {
         hhh $$1 = hgw.this.r.get($$0);
         if ($$1 == null) {
            hgw.m.warn("Requested a model that was not discovered previously: {}", $$0);
            return hgw.this.s;
         } else {
            return $$1;
         }
      }

      @Override
      public hgm a(aku $$0, hhc $$1) {
         hgw.a $$2 = new hgw.a($$0, $$1.a(), $$1.b());
         hgm $$3 = hgw.this.o.get($$2);
         if ($$3 != null) {
            return $$3;
         } else {
            hhh $$4 = this.a($$0);
            hgm $$5 = hhh.a($$4, this, $$1);
            hgw.this.o.put($$2, $$5);
            return $$5;
         }
      }

      @Override
      public hgx b() {
         return this.b;
      }
   }

   public interface d {
      hem a(hgx var1, hgt var2);

      hem a(hgx var1, String var2);

      default hhg a(final hgx $$0) {
         return new hhg() {
            @Override
            public hem a(hgt $$0x) {
               return d.this.a($$0, $$0);
            }

            @Override
            public hem a(String $$0x) {
               return d.this.a($$0, $$0);
            }
         };
      }
   }
}
