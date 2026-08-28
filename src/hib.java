import com.mojang.logging.LogUtils;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.UnaryOperator;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import org.slf4j.Logger;

public class hib {
   public static final hhy a = new hhy(hfq.d, aku.b("block/fire_0"));
   public static final hhy b = new hhy(hfq.d, aku.b("block/fire_1"));
   public static final hhy c = new hhy(hfq.d, aku.b("block/lava_flow"));
   public static final hhy d = new hhy(hfq.d, aku.b("block/water_flow"));
   public static final hhy e = new hhy(hfq.d, aku.b("block/water_overlay"));
   public static final hhy f = new hhy(gns.c, aku.b("entity/banner_base"));
   public static final hhy g = new hhy(gns.d, aku.b("entity/shield_base"));
   public static final hhy h = new hhy(gns.d, aku.b("entity/shield_base_nopattern"));
   public static final int i = 10;
   public static final List<aku> j = IntStream.range(0, 10).mapToObj($$0 -> aku.b("block/destroy_stage_" + $$0)).collect(Collectors.toList());
   public static final List<aku> k = j.stream().map($$0 -> $$0.a((UnaryOperator<String>)($$0x -> "textures/" + $$0x + ".png"))).collect(Collectors.toList());
   public static final List<gnh> l = k.stream().map(gnh::t).collect(Collectors.toList());
   static final Logger m = LogUtils.getLogger();
   private final gfy n;
   final Map<hib.a, hhr> o = new HashMap<>();
   private final Map<hig, gor> p;
   private final Map<aku, hcg> q;
   final Map<aku, him> r;
   final him s;

   public hib(gfy $$0, Map<hig, gor> $$1, Map<aku, hcg> $$2, Map<aku, him> $$3, him $$4) {
      this.n = $$0;
      this.p = $$1;
      this.q = $$2;
      this.r = $$3;
      this.s = $$4;
   }

   public hib.b a(hib.d $$0) {
      hhr $$1 = him.a(this.s, new hib.c($$0, () -> "missing"), hhs.a);
      Map<hig, hhr> $$2 = new HashMap<>(this.p.size());
      this.p.forEach(($$2x, $$3x) -> {
         try {
            hhr $$4x = $$3x.a(new hib.c($$0, $$2x::toString));
            $$2.put($$2x, $$4x);
         } catch (Exception var6x) {
            m.warn("Unable to bake model: '{}': {}", $$2x, var6x);
         }
      });
      hck $$3 = new hco($$1);
      Map<aku, hck> $$4 = new HashMap<>(this.q.size());
      Map<aku, hcg.a> $$5 = new HashMap<>(this.q.size());
      this.q.forEach(($$4x, $$5x) -> {
         hic $$6 = () -> $$4x + "#inventory";
         hib.c $$7 = new hib.c($$0, $$6);
         hck.a $$8 = new hck.a($$7, this.n, $$3);

         try {
            hck $$9 = $$5x.a().a($$8);
            $$4.put($$4x, $$9);
            if (!$$5x.b().equals(hcg.a.a)) {
               $$5.put($$4x, $$5x.b());
            }
         } catch (Exception var11) {
            m.warn("Unable to bake item model: '{}'", $$4x, var11);
         }
      });
      return new hib.b($$1, $$2, $$3, $$4, $$5);
   }

   static record a(aku a, j b, boolean c) {
   }

   public static record b(hhr a, Map<hig, hhr> b, hck c, Map<aku, hck> d, Map<aku, hcg.a> e) {
   }

   class c implements hia {
      private final hic b;
      private final hil c;

      c(final hib.d $$0, final hic $$1) {
         this.c = $$0.a($$1);
         this.b = $$1;
      }

      @Override
      public hil a() {
         return this.c;
      }

      private him a(aku $$0) {
         him $$1 = hib.this.r.get($$0);
         if ($$1 == null) {
            hib.m.warn("Requested a model that was not discovered previously: {}", $$0);
            return hib.this.s;
         } else {
            return $$1;
         }
      }

      @Override
      public hhr a(aku $$0, hih $$1) {
         hib.a $$2 = new hib.a($$0, $$1.a(), $$1.b());
         hhr $$3 = hib.this.o.get($$2);
         if ($$3 != null) {
            return $$3;
         } else {
            him $$4 = this.a($$0);
            hhr $$5 = him.a($$4, this, $$1);
            hib.this.o.put($$2, $$5);
            return $$5;
         }
      }

      @Override
      public hic b() {
         return this.b;
      }
   }

   public interface d {
      hfr a(hic var1, hhy var2);

      hfr a(hic var1, String var2);

      default hil a(final hic $$0) {
         return new hil() {
            @Override
            public hfr a(hhy $$0x) {
               return d.this.a($$0, $$0);
            }

            @Override
            public hfr a(String $$0x) {
               return d.this.a($$0, $$0);
            }
         };
      }
   }
}
