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

public class hdy {
   static final Logger b = LogUtils.getLogger();
   public static final String a = "item/";
   private final Map<alz, heg> c;
   final heg d;
   private final Map<heb, heg> e = new HashMap<>();
   private final Map<alz, heg> f = new HashMap<>();

   public hdy(Map<alz, heg> $$0, heg $$1) {
      this.c = $$0;
      this.d = $$1;
      this.a(hdv.c, $$1);
      this.f.put(hdv.b, $$1);
   }

   private static Set<heb> d() {
      Set<heb> $$0 = new HashSet<>();
      ma.g.c().forEach($$1 -> {
         alz $$2 = $$1.a().g().a(ku.i);
         if ($$2 != null) {
            $$0.add(heb.a($$2));
         }

         if ($$1.a() instanceof cwc $$4) {
            $$0.add(heb.a($$4.b()));
            $$0.add(heb.a($$4.c()));
         }
      });
      $$0.add(gso.i);
      $$0.add(gso.j);
      return $$0;
   }

   private void a(heb $$0, heg $$1) {
      this.e.put($$0, $$1);
   }

   public void a(hdp.c $$0) {
      this.f.put(hef.a, hef.c);
      this.f.put(hef.b, hef.d);
      Set<heb> $$1 = d();
      $$0.a().forEach(($$1x, $$2) -> {
         this.a($$1x, $$2.b());
         $$1.remove($$1x);
      });
      this.c.keySet().forEach($$1x -> {
         if ($$1x.a().startsWith("item/")) {
            heb $$2 = heb.a($$1x.a((UnaryOperator<String>)($$0xx -> $$0xx.substring("item/".length()))));
            this.a($$2, new hdt($$1x));
            $$1.remove($$2);
         }
      });
      if (!$$1.isEmpty()) {
         b.warn("Missing mandatory models: {}", $$1.stream().map($$0x -> "\n\t" + $$0x).collect(Collectors.joining()));
      }
   }

   public void a() {
      this.e.values().forEach($$0 -> $$0.a(new hdy.a()));
   }

   public Map<heb, heg> b() {
      return this.e;
   }

   public Map<alz, heg> c() {
      return this.f;
   }

   heg a(alz $$0) {
      return this.f.computeIfAbsent($$0, this::b);
   }

   private heg b(alz $$0) {
      heg $$1 = this.c.get($$0);
      if ($$1 == null) {
         b.warn("Missing block model: '{}'", $$0);
         return this.d;
      } else {
         return $$1;
      }
   }

   class a implements heg.a {
      private final List<alz> b = new ArrayList<>();
      private final Set<alz> c = new HashSet<>();

      @Override
      public heg a(alz $$0) {
         if (this.b.contains($$0)) {
            hdy.b.warn("Detected model loading loop: {}->{}", this.a(), $$0);
            return hdy.this.d;
         } else {
            heg $$1 = hdy.this.a($$0);
            if (this.c.add($$0)) {
               this.b.add($$0);
               $$1.a(this);
               this.b.remove($$0);
            }

            return $$1;
         }
      }

      private String a() {
         return this.b.stream().map(alz::toString).collect(Collectors.joining("->"));
      }
   }
}
