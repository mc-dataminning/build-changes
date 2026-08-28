import com.mojang.logging.LogUtils;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.function.UnaryOperator;
import java.util.stream.Collectors;
import org.slf4j.Logger;

public class haq {
   static final Logger b = LogUtils.getLogger();
   public static final String a = "item/";
   private final Map<ali, hay> c;
   final hay d;
   private final Map<hat, hay> e = new HashMap<>();
   private final Map<ali, hay> f = new HashMap<>();

   public haq(Map<ali, hay> $$0, hay $$1) {
      this.c = $$0;
      this.d = $$1;
      this.a(han.c, $$1);
      this.f.put(han.b, $$1);
   }

   private static Set<hat> d() {
      Set<hat> $$0 = new HashSet<>();
      ly.g.c().forEach($$1 -> {
         ali $$2 = $$1.a().g().a(ku.i);
         if ($$2 != null) {
            $$0.add(hat.a($$2));
         }

         if ($$1.a() instanceof cuo $$4) {
            $$0.add(hat.a($$4.b()));
            $$0.add(hat.a($$4.c()));
         }
      });
      $$0.add(gpi.i);
      $$0.add(gpi.j);
      return $$0;
   }

   private void a(hat $$0, hay $$1) {
      this.e.put($$0, $$1);
   }

   public void a(hah.c $$0) {
      this.f.put(hax.a, hax.c);
      this.f.put(hax.b, hax.d);
      Set<hat> $$1 = d();
      $$0.a().forEach(($$1x, $$2) -> {
         this.a($$1x, $$2.b());
         $$1.remove($$1x);
      });
      this.c.keySet().forEach($$1x -> {
         if ($$1x.a().startsWith("item/")) {
            hat $$2 = hat.a($$1x.a((UnaryOperator<String>)($$0xx -> $$0xx.substring("item/".length()))));
            this.a($$2, new hal($$1x));
            $$1.remove($$2);
         }
      });
      if (!$$1.isEmpty()) {
         b.warn("Missing mandatory models: {}", $$1.stream().map($$0x -> "\n\t" + $$0x).collect(Collectors.joining()));
      }
   }

   public void a() {
      this.e.values().forEach($$0 -> $$0.a(new haq.a()));
   }

   public Map<hat, hay> b() {
      return this.e;
   }

   public Map<ali, hay> c() {
      return this.f;
   }

   hay a(ali $$0) {
      return this.f.computeIfAbsent($$0, this::b);
   }

   private hay b(ali $$0) {
      hay $$1 = this.c.get($$0);
      if ($$1 == null) {
         b.warn("Missing block model: '{}'", $$0);
         return this.d;
      } else {
         return $$1;
      }
   }

   class a implements hay.a {
      private final List<ali> b = new ArrayList<>();
      private final Set<ali> c = new HashSet<>();

      @Override
      public hay a(ali $$0) {
         if (this.b.contains($$0)) {
            haq.b.warn("Detected model loading loop: {}->{}", this.a(), $$0);
            return haq.this.d;
         } else {
            hay $$1 = haq.this.a($$0);
            if (this.c.add($$0)) {
               this.b.add($$0);
               $$1.a(this);
               this.b.remove($$0);
            }

            return $$1;
         }
      }

      private String a() {
         return this.b.stream().map(ali::toString).collect(Collectors.joining("->"));
      }
   }
}
