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

public class hhd {
   static final Logger a = LogUtils.getLogger();
   private final Map<akv, hhm> b;
   final hhm c;
   private final List<hhj> d = new ArrayList<>();
   private final Map<akv, hhm> e = new HashMap<>();

   public hhd(Map<akv, hhm> $$0, hhm $$1) {
      this.b = $$0;
      this.c = $$1;
      this.e.put(hgz.a, $$1);
   }

   public void a() {
      this.e.put(gnm.a, new gnm());
   }

   public void a(hhj $$0) {
      this.d.add($$0);
   }

   public void b() {
      this.d.forEach($$0 -> $$0.a(new hhd.a()));
   }

   public Map<akv, hhm> c() {
      return this.e;
   }

   public Set<akv> d() {
      return Sets.difference(this.b.keySet(), this.e.keySet());
   }

   hhm a(akv $$0) {
      return this.e.computeIfAbsent($$0, this::b);
   }

   private hhm b(akv $$0) {
      hhm $$1 = this.b.get($$0);
      if ($$1 == null) {
         a.warn("Missing block model: '{}'", $$0);
         return this.c;
      } else {
         return $$1;
      }
   }

   class a implements hhj.a {
      private final List<akv> b = new ArrayList<>();
      private final Set<akv> c = new HashSet<>();

      @Override
      public hhm a(akv $$0) {
         if (this.b.contains($$0)) {
            hhd.a.warn("Detected model loading loop: {}->{}", this.a(), $$0);
            return hhd.this.c;
         } else {
            hhm $$1 = hhd.this.a($$0);
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
