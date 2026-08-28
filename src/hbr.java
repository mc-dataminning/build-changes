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

public class hbr {
   static final Logger b = LogUtils.getLogger();
   public static final String a = "item/";
   private final Map<alj, hbz> c;
   final hbz d;
   private final Map<hbu, hbz> e = new HashMap<>();
   private final Map<alj, hbz> f = new HashMap<>();

   public hbr(Map<alj, hbz> $$0, hbz $$1) {
      this.c = $$0;
      this.d = $$1;
      this.a(hbo.c, $$1);
      this.f.put(hbo.b, $$1);
   }

   private static Set<hbu> d() {
      Set<hbu> $$0 = new HashSet<>();
      lz.g.c().forEach($$1 -> {
         alj $$2 = $$1.a().g().a(ku.i);
         if ($$2 != null) {
            $$0.add(hbu.a($$2));
         }

         if ($$1.a() instanceof cuz $$4) {
            $$0.add(hbu.a($$4.b()));
            $$0.add(hbu.a($$4.c()));
         }
      });
      $$0.add(gqi.i);
      $$0.add(gqi.j);
      return $$0;
   }

   private void a(hbu $$0, hbz $$1) {
      this.e.put($$0, $$1);
   }

   public void a(hbi.c $$0) {
      this.f.put(hby.a, hby.c);
      this.f.put(hby.b, hby.d);
      Set<hbu> $$1 = d();
      $$0.a().forEach(($$1x, $$2) -> {
         this.a($$1x, $$2.b());
         $$1.remove($$1x);
      });
      this.c.keySet().forEach($$1x -> {
         if ($$1x.a().startsWith("item/")) {
            hbu $$2 = hbu.a($$1x.a((UnaryOperator<String>)($$0xx -> $$0xx.substring("item/".length()))));
            this.a($$2, new hbm($$1x));
            $$1.remove($$2);
         }
      });
      if (!$$1.isEmpty()) {
         b.warn("Missing mandatory models: {}", $$1.stream().map($$0x -> "\n\t" + $$0x).collect(Collectors.joining()));
      }
   }

   public void a() {
      this.e.values().forEach($$0 -> $$0.a(new hbr.a()));
   }

   public Map<hbu, hbz> b() {
      return this.e;
   }

   public Map<alj, hbz> c() {
      return this.f;
   }

   hbz a(alj $$0) {
      return this.f.computeIfAbsent($$0, this::b);
   }

   private hbz b(alj $$0) {
      hbz $$1 = this.c.get($$0);
      if ($$1 == null) {
         b.warn("Missing block model: '{}'", $$0);
         return this.d;
      } else {
         return $$1;
      }
   }

   class a implements hbz.a {
      private final List<alj> b = new ArrayList<>();
      private final Set<alj> c = new HashSet<>();

      @Override
      public hbz a(alj $$0) {
         if (this.b.contains($$0)) {
            hbr.b.warn("Detected model loading loop: {}->{}", this.a(), $$0);
            return hbr.this.d;
         } else {
            hbz $$1 = hbr.this.a($$0);
            if (this.c.add($$0)) {
               this.b.add($$0);
               $$1.a(this);
               this.b.remove($$0);
            }

            return $$1;
         }
      }

      private String a() {
         return this.b.stream().map(alj::toString).collect(Collectors.joining("->"));
      }
   }
}
