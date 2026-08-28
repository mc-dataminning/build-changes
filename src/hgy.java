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

public class hgy {
   static final Logger a = LogUtils.getLogger();
   private final Map<aku, hhh> b;
   final hhh c;
   private final List<hhe> d = new ArrayList<>();
   private final Map<aku, hhh> e = new HashMap<>();

   public hgy(Map<aku, hhh> $$0, hhh $$1) {
      this.b = $$0;
      this.c = $$1;
      this.e.put(hgu.a, $$1);
   }

   public void a() {
      this.e.put(gnk.a, new gnk());
   }

   public void a(hhe $$0) {
      this.d.add($$0);
   }

   public void b() {
      this.d.forEach($$0 -> $$0.a(new hgy.a()));
   }

   public Map<aku, hhh> c() {
      return this.e;
   }

   public Set<aku> d() {
      return Sets.difference(this.b.keySet(), this.e.keySet());
   }

   hhh a(aku $$0) {
      return this.e.computeIfAbsent($$0, this::b);
   }

   private hhh b(aku $$0) {
      hhh $$1 = this.b.get($$0);
      if ($$1 == null) {
         a.warn("Missing block model: '{}'", $$0);
         return this.c;
      } else {
         return $$1;
      }
   }

   class a implements hhe.a {
      private final List<aku> b = new ArrayList<>();
      private final Set<aku> c = new HashSet<>();

      @Override
      public hhh a(aku $$0) {
         if (this.b.contains($$0)) {
            hgy.a.warn("Detected model loading loop: {}->{}", this.a(), $$0);
            return hgy.this.c;
         } else {
            hhh $$1 = hgy.this.a($$0);
            if (this.c.add($$0)) {
               this.b.add($$0);
               $$1.a(this);
               this.b.remove($$0);
            }

            return $$1;
         }
      }

      private String a() {
         return this.b.stream().map(aku::toString).collect(Collectors.joining("->"));
      }
   }
}
