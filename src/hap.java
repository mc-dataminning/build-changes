import com.mojang.logging.LogUtils;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.function.UnaryOperator;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import org.slf4j.Logger;

public class hap {
   public static final ham a = new ham(gyc.d, ali.b("block/fire_0"));
   public static final ham b = new ham(gyc.d, ali.b("block/fire_1"));
   public static final ham c = new ham(gyc.d, ali.b("block/lava_flow"));
   public static final ham d = new ham(gyc.d, ali.b("block/water_flow"));
   public static final ham e = new ham(gyc.d, ali.b("block/water_overlay"));
   public static final ham f = new ham(gjc.c, ali.b("entity/banner_base"));
   public static final ham g = new ham(gjc.d, ali.b("entity/shield_base"));
   public static final ham h = new ham(gjc.d, ali.b("entity/shield_base_nopattern"));
   public static final int i = 10;
   public static final List<ali> j = IntStream.range(0, 10).mapToObj($$0 -> ali.b("block/destroy_stage_" + $$0)).collect(Collectors.toList());
   public static final List<ali> k = j.stream().map($$0 -> $$0.a((UnaryOperator<String>)($$0x -> "textures/" + $$0x + ".png"))).collect(Collectors.toList());
   public static final List<gir> l = k.stream().map(gir::s).collect(Collectors.toList());
   static final Logger m = LogUtils.getLogger();
   static final gjw n = new gjw();
   final Map<hap.a, haf> o = new HashMap<>();
   private final Map<hat, haf> p = new HashMap<>();
   private final Map<hat, hay> q;
   final Map<ali, hay> r;
   final hay s;

   public hap(Map<hat, hay> $$0, Map<ali, hay> $$1, hay $$2) {
      this.q = $$0;
      this.r = $$1;
      this.s = $$2;
   }

   public void a(hap.c $$0) {
      this.q.forEach(($$1, $$2) -> {
         haf $$3 = null;

         try {
            $$3 = new hap.b($$0, $$1).a($$2, hag.a);
         } catch (Exception var6) {
            m.warn("Unable to bake model: '{}': {}", $$1, var6);
         }

         if ($$3 != null) {
            this.p.put($$1, $$3);
         }
      });
   }

   public Map<hat, haf> a() {
      return this.p;
   }

   static record a(ali a, j b, boolean c) {
   }

   class b implements hao {
      private final Function<ham, gyd> b;

      b(final hap.c $$0, final hat $$1) {
         this.b = $$2 -> $$0.get($$1, $$2);
      }

      private hay a(ali $$0) {
         hay $$1 = hap.this.r.get($$0);
         if ($$1 == null) {
            hap.m.warn("Requested a model that was not discovered previously: {}", $$0);
            return hap.this.s;
         } else {
            return $$1;
         }
      }

      @Override
      public haf a(ali $$0, hau $$1) {
         hap.a $$2 = new hap.a($$0, $$1.b(), $$1.c());
         haf $$3 = hap.this.o.get($$2);
         if ($$3 != null) {
            return $$3;
         } else {
            hay $$4 = this.a($$0);
            haf $$5 = this.a($$4, $$1);
            hap.this.o.put($$2, $$5);
            return $$5;
         }
      }

      haf a(hay $$0, hau $$1) {
         if ($$0 instanceof gjt $$2 && $$2.f() == hax.c) {
            return hap.n.a(this.b, $$2).a(this.b, $$1, false);
         }

         return $$0.a(this, this.b, $$1);
      }
   }

   @FunctionalInterface
   public interface c {
      gyd get(hat var1, ham var2);
   }
}
