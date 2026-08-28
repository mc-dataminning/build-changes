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

public class haf {
   static final Logger b = LogUtils.getLogger();
   public static final String a = "item/";
   private final Map<alh, han> c;
   final han d;
   private final Map<hai, han> e = new HashMap<>();
   private final Map<alh, han> f = new HashMap<>();

   public haf(Map<alh, han> $$0, han $$1) {
      this.c = $$0;
      this.d = $$1;
      this.a(hac.c, $$1);
      this.f.put(hac.b, $$1);
   }

   private static Set<hai> d() {
      Set<hai> $$0 = new HashSet<>();
      lx.g.c().forEach($$1 -> {
         alh $$2 = $$1.a().g().a(kt.i);
         if ($$2 != null) {
            $$0.add(hai.a($$2));
         }

         if ($$1.a() instanceof cuj $$4) {
            $$0.add(hai.a($$4.b()));
            $$0.add(hai.a($$4.c()));
         }
      });
      $$0.add(gox.i);
      $$0.add(gox.j);
      return $$0;
   }

   private void a(hai $$0, han $$1) {
      this.e.put($$0, $$1);
   }

   public void a(gzw.c $$0) {
      this.f.put(ham.a, ham.c);
      this.f.put(ham.b, ham.d);
      Set<hai> $$1 = d();
      $$0.a().forEach(($$1x, $$2) -> {
         this.a($$1x, $$2.b());
         $$1.remove($$1x);
      });
      this.c.keySet().forEach($$1x -> {
         if ($$1x.a().startsWith("item/")) {
            hai $$2 = hai.a($$1x.a((UnaryOperator<String>)($$0xx -> $$0xx.substring("item/".length()))));
            this.a($$2, new haa($$1x));
            $$1.remove($$2);
         }
      });
      if (!$$1.isEmpty()) {
         b.warn("Missing mandatory models: {}", $$1.stream().map($$0x -> "\n\t" + $$0x).collect(Collectors.joining()));
      }
   }

   public void a() {
      this.e.values().forEach($$0 -> $$0.a(new haf.a()));
   }

   public Map<hai, han> b() {
      return this.e;
   }

   public Map<alh, han> c() {
      return this.f;
   }

   han a(alh $$0) {
      return this.f.computeIfAbsent($$0, this::b);
   }

   private han b(alh $$0) {
      han $$1 = this.c.get($$0);
      if ($$1 == null) {
         b.warn("Missing block model: '{}'", $$0);
         return this.d;
      } else {
         return $$1;
      }
   }

   class a implements han.a {
      private final List<alh> b = new ArrayList<>();
      private final Set<alh> c = new HashSet<>();

      @Override
      public han a(alh $$0) {
         if (this.b.contains($$0)) {
            haf.b.warn("Detected model loading loop: {}->{}", this.a(), $$0);
            return haf.this.d;
         } else {
            han $$1 = haf.this.a($$0);
            if (this.c.add($$0)) {
               this.b.add($$0);
               $$1.a(this);
               this.b.remove($$0);
            }

            return $$1;
         }
      }

      private String a() {
         return this.b.stream().map(alh::toString).collect(Collectors.joining("->"));
      }
   }
}
