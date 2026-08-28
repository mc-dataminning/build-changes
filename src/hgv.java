import com.mojang.logging.LogUtils;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.UnaryOperator;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import org.slf4j.Logger;

public class hgv {
   public static final hgs a = new hgs(hei.d, aku.b("block/fire_0"));
   public static final hgs b = new hgs(hei.d, aku.b("block/fire_1"));
   public static final hgs c = new hgs(hei.d, aku.b("block/lava_flow"));
   public static final hgs d = new hgs(hei.d, aku.b("block/water_flow"));
   public static final hgs e = new hgs(hei.d, aku.b("block/water_overlay"));
   public static final hgs f = new hgs(gms.c, aku.b("entity/banner_base"));
   public static final hgs g = new hgs(gms.d, aku.b("entity/shield_base"));
   public static final hgs h = new hgs(gms.d, aku.b("entity/shield_base_nopattern"));
   public static final int i = 10;
   public static final List<aku> j = IntStream.range(0, 10).mapToObj($$0 -> aku.b("block/destroy_stage_" + $$0)).collect(Collectors.toList());
   public static final List<aku> k = j.stream().map($$0 -> $$0.a((UnaryOperator<String>)($$0x -> "textures/" + $$0x + ".png"))).collect(Collectors.toList());
   public static final List<gmh> l = k.stream().map(gmh::t).collect(Collectors.toList());
   static final Logger m = LogUtils.getLogger();
   private final gey n;
   final Map<hgv.a, hgl> o = new HashMap<>();
   private final Map<hha, gnr> p;
   private final Map<aku, hbi.b> q;
   final Map<aku, hhg> r;
   final hhg s;

   public hgv(gey $$0, Map<hha, gnr> $$1, Map<aku, hbi.b> $$2, Map<aku, hhg> $$3, hhg $$4) {
      this.n = $$0;
      this.p = $$1;
      this.q = $$2;
      this.r = $$3;
      this.s = $$4;
   }

   public hgv.b a(hgv.d $$0) {
      hgl $$1 = hhg.a(this.s, new hgv.c($$0, () -> "missing"), hgm.a);
      Map<hha, hgl> $$2 = new HashMap<>(this.p.size());
      this.p.forEach(($$2x, $$3x) -> {
         try {
            hgl $$4x = $$3x.a(new hgv.c($$0, $$2x::toString));
            $$2.put($$2x, $$4x);
         } catch (Exception var6) {
            m.warn("Unable to bake model: '{}': {}", $$2x, var6);
         }
      });
      hbi $$3 = new hbm($$1);
      Map<aku, hbi> $$4 = new HashMap<>(this.q.size());
      this.q.forEach(($$3x, $$4x) -> {
         hgw $$5 = () -> $$3x + "#inventory";
         hgv.c $$6 = new hgv.c($$0, $$5);
         hbi.a $$7 = new hbi.a($$6, this.n, $$3);

         try {
            hbi $$8 = $$4x.a($$7);
            $$4.put($$3x, $$8);
         } catch (Exception var10) {
            m.warn("Unable to bake item model: '{}'", $$3x, var10);
         }
      });
      return new hgv.b($$1, $$2, $$3, $$4);
   }

   static record a(aku a, j b, boolean c) {
   }

   public static record b(hgl a, Map<hha, hgl> b, hbi c, Map<aku, hbi> d) {
   }

   class c implements hgu {
      private final hgw b;
      private final hhf c;

      c(final hgv.d $$0, final hgw $$1) {
         this.c = $$0.a($$1);
         this.b = $$1;
      }

      @Override
      public hhf a() {
         return this.c;
      }

      private hhg a(aku $$0) {
         hhg $$1 = hgv.this.r.get($$0);
         if ($$1 == null) {
            hgv.m.warn("Requested a model that was not discovered previously: {}", $$0);
            return hgv.this.s;
         } else {
            return $$1;
         }
      }

      @Override
      public hgl a(aku $$0, hhb $$1) {
         hgv.a $$2 = new hgv.a($$0, $$1.a(), $$1.b());
         hgl $$3 = hgv.this.o.get($$2);
         if ($$3 != null) {
            return $$3;
         } else {
            hhg $$4 = this.a($$0);
            hgl $$5 = hhg.a($$4, this, $$1);
            hgv.this.o.put($$2, $$5);
            return $$5;
         }
      }

      @Override
      public hgw b() {
         return this.b;
      }
   }

   public interface d {
      hej a(hgw var1, hgs var2);

      hej a(hgw var1, String var2);

      default hhf a(final hgw $$0) {
         return new hhf() {
            @Override
            public hej a(hgs $$0x) {
               return d.this.a($$0, $$0);
            }

            @Override
            public hej a(String $$0x) {
               return d.this.a($$0, $$0);
            }
         };
      }
   }
}
