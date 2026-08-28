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

public class hkl {
   static final Logger a = LogUtils.getLogger();
   private final Map<ale, hku> b;
   final hku c;
   private final List<hkr> d = new ArrayList<>();
   private final Map<ale, hku> e = new HashMap<>();

   public hkl(Map<ale, hku> $$0, hku $$1) {
      this.b = $$0;
      this.c = $$1;
      this.e.put(hkh.a, $$1);
   }

   public void a() {
      this.e.put(gqs.a, new gqs());
   }

   public void a(hkr $$0) {
      this.d.add($$0);
   }

   public void b() {
      this.d.forEach($$0 -> $$0.a(new hkl.a()));
   }

   public Map<ale, hku> c() {
      return this.e;
   }

   public Set<ale> d() {
      return Sets.difference(this.b.keySet(), this.e.keySet());
   }

   hku a(ale $$0) {
      return this.e.computeIfAbsent($$0, this::b);
   }

   private hku b(ale $$0) {
      hku $$1 = this.b.get($$0);
      if ($$1 == null) {
         a.warn("Missing block model: '{}'", $$0);
         return this.c;
      } else {
         return $$1;
      }
   }

   class a implements hkr.a {
      private final List<ale> b = new ArrayList<>();
      private final Set<ale> c = new HashSet<>();

      @Override
      public hku a(ale $$0) {
         if (this.b.contains($$0)) {
            hkl.a.warn("Detected model loading loop: {}->{}", this.a(), $$0);
            return hkl.this.c;
         } else {
            hku $$1 = hkl.this.a($$0);
            if (this.c.add($$0)) {
               this.b.add($$0);
               $$1.a(this);
               this.b.remove($$0);
            }

            return $$1;
         }
      }

      private String a() {
         return this.b.stream().map(ale::toString).collect(Collectors.joining("->"));
      }
   }
}
