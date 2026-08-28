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

public class hdw {
   static final Logger b = LogUtils.getLogger();
   public static final String a = "item/";
   private final Map<alz, hee> c;
   final hee d;
   private final Map<hdz, hee> e = new HashMap<>();
   private final Map<alz, hee> f = new HashMap<>();

   public hdw(Map<alz, hee> $$0, hee $$1) {
      this.c = $$0;
      this.d = $$1;
      this.a(hdt.c, $$1);
      this.f.put(hdt.b, $$1);
   }

   private static Set<hdz> d() {
      Set<hdz> $$0 = new HashSet<>();
      ma.g.c().forEach($$1 -> {
         alz $$2 = $$1.a().g().a(ku.i);
         if ($$2 != null) {
            $$0.add(hdz.a($$2));
         }

         if ($$1.a() instanceof cwb $$4) {
            $$0.add(hdz.a($$4.b()));
            $$0.add(hdz.a($$4.c()));
         }
      });
      $$0.add(gsm.i);
      $$0.add(gsm.j);
      return $$0;
   }

   private void a(hdz $$0, hee $$1) {
      this.e.put($$0, $$1);
   }

   public void a(hdn.c $$0) {
      this.f.put(hed.a, hed.c);
      this.f.put(hed.b, hed.d);
      Set<hdz> $$1 = d();
      $$0.a().forEach(($$1x, $$2) -> {
         this.a($$1x, $$2.b());
         $$1.remove($$1x);
      });
      this.c.keySet().forEach($$1x -> {
         if ($$1x.a().startsWith("item/")) {
            hdz $$2 = hdz.a($$1x.a((UnaryOperator<String>)($$0xx -> $$0xx.substring("item/".length()))));
            this.a($$2, new hdr($$1x));
            $$1.remove($$2);
         }
      });
      if (!$$1.isEmpty()) {
         b.warn("Missing mandatory models: {}", $$1.stream().map($$0x -> "\n\t" + $$0x).collect(Collectors.joining()));
      }
   }

   public void a() {
      this.e.values().forEach($$0 -> $$0.a(new hdw.a()));
   }

   public Map<hdz, hee> b() {
      return this.e;
   }

   public Map<alz, hee> c() {
      return this.f;
   }

   hee a(alz $$0) {
      return this.f.computeIfAbsent($$0, this::b);
   }

   private hee b(alz $$0) {
      hee $$1 = this.c.get($$0);
      if ($$1 == null) {
         b.warn("Missing block model: '{}'", $$0);
         return this.d;
      } else {
         return $$1;
      }
   }

   class a implements hee.a {
      private final List<alz> b = new ArrayList<>();
      private final Set<alz> c = new HashSet<>();

      @Override
      public hee a(alz $$0) {
         if (this.b.contains($$0)) {
            hdw.b.warn("Detected model loading loop: {}->{}", this.a(), $$0);
            return hdw.this.d;
         } else {
            hee $$1 = hdw.this.a($$0);
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
