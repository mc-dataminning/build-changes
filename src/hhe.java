import com.google.common.collect.Sets;
import com.mojang.logging.LogUtils;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;
import org.slf4j.Logger;

public class hhe {
   static final Logger a = LogUtils.getLogger();
   private final Map<akv, hhn> b;
   final hhn c;
   private final List<hhk> d = new ArrayList<>();
   private final Map<akv, hhn> e = new HashMap<>();

   public hhe(Map<akv, hhn> $$0, hhn $$1) {
      this.b = $$0;
      this.c = $$1;
      this.e.put(hha.a, $$1);
   }

   public void a() {
      this.e.put(gnn.a, new gnn());
   }

   public void a(hhk $$0) {
      this.d.add($$0);
   }

   public void b() {
      this.d.forEach($$0 -> $$0.a(new hhe.a()));
   }

   public Map<akv, hhn> c() {
      return this.e;
   }

   public Set<akv> d() {
      return Sets.difference(this.b.keySet(), this.e.keySet());
   }

   hhn a(akv $$0) {
      return this.e.computeIfAbsent($$0, this::b);
   }

   private hhn b(akv $$0) {
      hhn $$1 = this.b.get($$0);
      if ($$1 == null) {
         a.warn("Missing block model: '{}'", $$0);
         return this.c;
      } else {
         return $$1;
      }
   }

   class a implements hhk.a {
      private final List<akv> b = new ArrayList<>();
      private final Set<akv> c = new HashSet<>();

      @Override
      public hhn a(akv $$0) {
         if (this.b.contains($$0)) {
            hhe.a.warn("Detected model loading loop: {}->{}", this.a(), $$0);
            return hhe.this.c;
         } else {
            hhn $$1 = hhe.this.a($$0);
            if (this.c.add($$0)) {
               this.b.add($$0);
               $$1.a(this);
               this.b.remove($$0);
            }

            return $$1;
         }
      }

      private String a() {
         return this.b.stream().map(akv::toString).collect(Collectors.joining("->"));
      }
   }
}
