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

public class hhf {
   static final Logger a = LogUtils.getLogger();
   private final Map<akv, hho> b;
   final hho c;
   private final List<hhl> d = new ArrayList<>();
   private final Map<akv, hho> e = new HashMap<>();

   public hhf(Map<akv, hho> $$0, hho $$1) {
      this.b = $$0;
      this.c = $$1;
      this.e.put(hhb.a, $$1);
   }

   public void a() {
      this.e.put(gno.a, new gno());
   }

   public void a(hhl $$0) {
      this.d.add($$0);
   }

   public void b() {
      this.d.forEach($$0 -> $$0.a(new hhf.a()));
   }

   public Map<akv, hho> c() {
      return this.e;
   }

   public Set<akv> d() {
      return Sets.difference(this.b.keySet(), this.e.keySet());
   }

   hho a(akv $$0) {
      return this.e.computeIfAbsent($$0, this::b);
   }

   private hho b(akv $$0) {
      hho $$1 = this.b.get($$0);
      if ($$1 == null) {
         a.warn("Missing block model: '{}'", $$0);
         return this.c;
      } else {
         return $$1;
      }
   }

   class a implements hhl.a {
      private final List<akv> b = new ArrayList<>();
      private final Set<akv> c = new HashSet<>();

      @Override
      public hho a(akv $$0) {
         if (this.b.contains($$0)) {
            hhf.a.warn("Detected model loading loop: {}->{}", this.a(), $$0);
            return hhf.this.c;
         } else {
            hho $$1 = hhf.this.a($$0);
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
