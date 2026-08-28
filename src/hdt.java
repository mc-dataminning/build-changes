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

public class hdt {
   static final Logger b = LogUtils.getLogger();
   public static final String a = "item/";
   private final Map<alp, heb> c;
   final heb d;
   private final Map<hdw, heb> e = new HashMap<>();
   private final Map<alp, heb> f = new HashMap<>();

   public hdt(Map<alp, heb> $$0, heb $$1) {
      this.c = $$0;
      this.d = $$1;
      this.a(hdq.c, $$1);
      this.f.put(hdq.b, $$1);
   }

   private static Set<hdw> d() {
      Set<hdw> $$0 = new HashSet<>();
      ma.g.c().forEach($$1 -> {
         alp $$2 = $$1.a().g().a(ku.i);
         if ($$2 != null) {
            $$0.add(hdw.a($$2));
         }

         if ($$1.a() instanceof cvt $$4) {
            $$0.add(hdw.a($$4.b()));
            $$0.add(hdw.a($$4.c()));
         }
      });
      $$0.add(gsj.i);
      $$0.add(gsj.j);
      return $$0;
   }

   private void a(hdw $$0, heb $$1) {
      this.e.put($$0, $$1);
   }

   public void a(hdk.c $$0) {
      this.f.put(hea.a, hea.c);
      this.f.put(hea.b, hea.d);
      Set<hdw> $$1 = d();
      $$0.a().forEach(($$1x, $$2) -> {
         this.a($$1x, $$2.b());
         $$1.remove($$1x);
      });
      this.c.keySet().forEach($$1x -> {
         if ($$1x.a().startsWith("item/")) {
            hdw $$2 = hdw.a($$1x.a((UnaryOperator<String>)($$0xx -> $$0xx.substring("item/".length()))));
            this.a($$2, new hdo($$1x));
            $$1.remove($$2);
         }
      });
      if (!$$1.isEmpty()) {
         b.warn("Missing mandatory models: {}", $$1.stream().map($$0x -> "\n\t" + $$0x).collect(Collectors.joining()));
      }
   }

   public void a() {
      this.e.values().forEach($$0 -> $$0.a(new hdt.a()));
   }

   public Map<hdw, heb> b() {
      return this.e;
   }

   public Map<alp, heb> c() {
      return this.f;
   }

   heb a(alp $$0) {
      return this.f.computeIfAbsent($$0, this::b);
   }

   private heb b(alp $$0) {
      heb $$1 = this.c.get($$0);
      if ($$1 == null) {
         b.warn("Missing block model: '{}'", $$0);
         return this.d;
      } else {
         return $$1;
      }
   }

   class a implements heb.a {
      private final List<alp> b = new ArrayList<>();
      private final Set<alp> c = new HashSet<>();

      @Override
      public heb a(alp $$0) {
         if (this.b.contains($$0)) {
            hdt.b.warn("Detected model loading loop: {}->{}", this.a(), $$0);
            return hdt.this.d;
         } else {
            heb $$1 = hdt.this.a($$0);
            if (this.c.add($$0)) {
               this.b.add($$0);
               $$1.a(this);
               this.b.remove($$0);
            }

            return $$1;
         }
      }

      private String a() {
         return this.b.stream().map(alp::toString).collect(Collectors.joining("->"));
      }
   }
}
