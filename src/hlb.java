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

public class hlb {
   static final Logger a = LogUtils.getLogger();
   private final Map<alg, hlk> b;
   final hlk c;
   private final List<hlh> d = new ArrayList<>();
   private final Map<alg, hlk> e = new HashMap<>();

   public hlb(Map<alg, hlk> $$0, hlk $$1) {
      this.b = $$0;
      this.c = $$1;
      this.e.put(hkx.a, $$1);
   }

   public void a() {
      this.e.put(grh.a, new grh());
   }

   public void a(hlh $$0) {
      this.d.add($$0);
   }

   public void b() {
      this.d.forEach($$0 -> $$0.a(new hlb.a()));
   }

   public Map<alg, hlk> c() {
      return this.e;
   }

   public Set<alg> d() {
      return Sets.difference(this.b.keySet(), this.e.keySet());
   }

   hlk a(alg $$0) {
      return this.e.computeIfAbsent($$0, this::b);
   }

   private hlk b(alg $$0) {
      hlk $$1 = this.b.get($$0);
      if ($$1 == null) {
         a.warn("Missing block model: '{}'", $$0);
         return this.c;
      } else {
         return $$1;
      }
   }

   class a implements hlh.a {
      private final List<alg> b = new ArrayList<>();
      private final Set<alg> c = new HashSet<>();

      @Override
      public hlk a(alg $$0) {
         if (this.b.contains($$0)) {
            hlb.a.warn("Detected model loading loop: {}->{}", this.a(), $$0);
            return hlb.this.c;
         } else {
            hlk $$1 = hlb.this.a($$0);
            if (this.c.add($$0)) {
               this.b.add($$0);
               $$1.a(this);
               this.b.remove($$0);
            }

            return $$1;
         }
      }

      private String a() {
         return this.b.stream().map(alg::toString).collect(Collectors.joining("->"));
      }
   }
}
