import com.mojang.logging.LogUtils;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.function.UnaryOperator;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import org.slf4j.Logger;

public class hdw {
   public static final hdt a = new hdt(hbj.d, alz.b("block/fire_0"));
   public static final hdt b = new hdt(hbj.d, alz.b("block/fire_1"));
   public static final hdt c = new hdt(hbj.d, alz.b("block/lava_flow"));
   public static final hdt d = new hdt(hbj.d, alz.b("block/water_flow"));
   public static final hdt e = new hdt(hbj.d, alz.b("block/water_overlay"));
   public static final hdt f = new hdt(gmf.c, alz.b("entity/banner_base"));
   public static final hdt g = new hdt(gmf.d, alz.b("entity/shield_base"));
   public static final hdt h = new hdt(gmf.d, alz.b("entity/shield_base_nopattern"));
   public static final int i = 10;
   public static final List<alz> j = IntStream.range(0, 10).mapToObj($$0 -> alz.b("block/destroy_stage_" + $$0)).collect(Collectors.toList());
   public static final List<alz> k = j.stream().map($$0 -> $$0.a((UnaryOperator<String>)($$0x -> "textures/" + $$0x + ".png"))).collect(Collectors.toList());
   public static final List<glu> l = k.stream().map(glu::t).collect(Collectors.toList());
   static final Logger m = LogUtils.getLogger();
   static final gmz n = new gmz();
   final Map<hdw.a, hdm> o = new HashMap<>();
   private final Map<hea, hdm> p = new HashMap<>();
   private final Map<hea, hef> q;
   final Map<alz, hef> r;
   final hef s;

   public hdw(Map<hea, hef> $$0, Map<alz, hef> $$1, hef $$2) {
      this.q = $$0;
      this.r = $$1;
      this.s = $$2;
   }

   public void a(hdw.c $$0) {
      this.q.forEach(($$1, $$2) -> {
         hdm $$3 = null;

         try {
            $$3 = new hdw.b($$0, $$1).a($$2, hdn.a);
         } catch (Exception var6) {
            m.warn("Unable to bake model: '{}': {}", $$1, var6);
         }

         if ($$3 != null) {
            this.p.put($$1, $$3);
         }
      });
   }

   public Map<hea, hdm> a() {
      return this.p;
   }

   static record a(alz a, j b, boolean c) {
   }

   class b implements hdv {
      private final Function<hdt, hbk> b;

      b(final hdw.c $$0, final hea $$1) {
         this.b = $$2 -> $$0.get($$1, $$2);
      }

      private hef a(alz $$0) {
         hef $$1 = hdw.this.r.get($$0);
         if ($$1 == null) {
            hdw.m.warn("Requested a model that was not discovered previously: {}", $$0);
            return hdw.this.s;
         } else {
            return $$1;
         }
      }

      @Override
      public hdm a(alz $$0, heb $$1) {
         hdw.a $$2 = new hdw.a($$0, $$1.b(), $$1.c());
         hdm $$3 = hdw.this.o.get($$2);
         if ($$3 != null) {
            return $$3;
         } else {
            hef $$4 = this.a($$0);
            hdm $$5 = this.a($$4, $$1);
            hdw.this.o.put($$2, $$5);
            return $$5;
         }
      }

      hdm a(hef $$0, heb $$1) {
         if ($$0 instanceof gmw $$2 && $$2.f() == hee.c) {
            return hdw.n.a(this.b, $$2).a(this.b, $$1, false);
         }

         return $$0.a(this, this.b, $$1);
      }
   }

   @FunctionalInterface
   public interface c {
      hbk get(hea var1, hdt var2);
   }
}
