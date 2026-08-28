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

public class hbg {
   static final Logger b = LogUtils.getLogger();
   public static final String a = "item/";
   private final Map<all, hbo> c;
   final hbo d;
   private final Map<hbj, hbo> e = new HashMap<>();
   private final Map<all, hbo> f = new HashMap<>();

   public hbg(Map<all, hbo> $$0, hbo $$1) {
      this.c = $$0;
      this.d = $$1;
      this.a(hbd.c, $$1);
      this.f.put(hbd.b, $$1);
   }

   private static Set<hbj> d() {
      Set<hbj> $$0 = new HashSet<>();
      lz.g.c().forEach($$1 -> {
         all $$2 = $$1.a().g().a(ku.i);
         if ($$2 != null) {
            $$0.add(hbj.a($$2));
         }

         if ($$1.a() instanceof cus $$4) {
            $$0.add(hbj.a($$4.b()));
            $$0.add(hbj.a($$4.c()));
         }
      });
      $$0.add(gpy.i);
      $$0.add(gpy.j);
      return $$0;
   }

   private void a(hbj $$0, hbo $$1) {
      this.e.put($$0, $$1);
   }

   public void a(hax.c $$0) {
      this.f.put(hbn.a, hbn.c);
      this.f.put(hbn.b, hbn.d);
      Set<hbj> $$1 = d();
      $$0.a().forEach(($$1x, $$2) -> {
         this.a($$1x, $$2.b());
         $$1.remove($$1x);
      });
      this.c.keySet().forEach($$1x -> {
         if ($$1x.a().startsWith("item/")) {
            hbj $$2 = hbj.a($$1x.a((UnaryOperator<String>)($$0xx -> $$0xx.substring("item/".length()))));
            this.a($$2, new hbb($$1x));
            $$1.remove($$2);
         }
      });
      if (!$$1.isEmpty()) {
         b.warn("Missing mandatory models: {}", $$1.stream().map($$0x -> "\n\t" + $$0x).collect(Collectors.joining()));
      }
   }

   public void a() {
      this.e.values().forEach($$0 -> $$0.a(new hbg.a()));
   }

   public Map<hbj, hbo> b() {
      return this.e;
   }

   public Map<all, hbo> c() {
      return this.f;
   }

   hbo a(all $$0) {
      return this.f.computeIfAbsent($$0, this::b);
   }

   private hbo b(all $$0) {
      hbo $$1 = this.c.get($$0);
      if ($$1 == null) {
         b.warn("Missing block model: '{}'", $$0);
         return this.d;
      } else {
         return $$1;
      }
   }

   class a implements hbo.a {
      private final List<all> b = new ArrayList<>();
      private final Set<all> c = new HashSet<>();

      @Override
      public hbo a(all $$0) {
         if (this.b.contains($$0)) {
            hbg.b.warn("Detected model loading loop: {}->{}", this.a(), $$0);
            return hbg.this.d;
         } else {
            hbo $$1 = hbg.this.a($$0);
            if (this.c.add($$0)) {
               this.b.add($$0);
               $$1.a(this);
               this.b.remove($$0);
            }

            return $$1;
         }
      }

      private String a() {
         return this.b.stream().map(all::toString).collect(Collectors.joining("->"));
      }
   }
}
