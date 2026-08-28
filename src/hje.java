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

public class hje {
   static final Logger a = LogUtils.getLogger();
   private final Map<ald, hjn> b;
   final hjn c;
   private final List<hjk> d = new ArrayList<>();
   private final Map<ald, hjn> e = new HashMap<>();

   public hje(Map<ald, hjn> $$0, hjn $$1) {
      this.b = $$0;
      this.c = $$1;
      this.e.put(hja.a, $$1);
   }

   public void a() {
      this.e.put(gpn.a, new gpn());
   }

   public void a(hjk $$0) {
      this.d.add($$0);
   }

   public void b() {
      this.d.forEach($$0 -> $$0.a(new hje.a()));
   }

   public Map<ald, hjn> c() {
      return this.e;
   }

   public Set<ald> d() {
      return Sets.difference(this.b.keySet(), this.e.keySet());
   }

   hjn a(ald $$0) {
      return this.e.computeIfAbsent($$0, this::b);
   }

   private hjn b(ald $$0) {
      hjn $$1 = this.b.get($$0);
      if ($$1 == null) {
         a.warn("Missing block model: '{}'", $$0);
         return this.c;
      } else {
         return $$1;
      }
   }

   class a implements hjk.a {
      private final List<ald> b = new ArrayList<>();
      private final Set<ald> c = new HashSet<>();

      @Override
      public hjn a(ald $$0) {
         if (this.b.contains($$0)) {
            hje.a.warn("Detected model loading loop: {}->{}", this.a(), $$0);
            return hje.this.c;
         } else {
            hjn $$1 = hje.this.a($$0);
            if (this.c.add($$0)) {
               this.b.add($$0);
               $$1.a(this);
               this.b.remove($$0);
            }

            return $$1;
         }
      }

      private String a() {
         return this.b.stream().map(ald::toString).collect(Collectors.joining("->"));
      }
   }
}
