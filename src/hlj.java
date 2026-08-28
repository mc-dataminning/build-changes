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

public class hlj {
   static final Logger a = LogUtils.getLogger();
   private final Map<alg, hls> b;
   final hls c;
   private final List<hlp> d = new ArrayList<>();
   private final Map<alg, hls> e = new HashMap<>();

   public hlj(Map<alg, hls> $$0, hls $$1) {
      this.b = $$0;
      this.c = $$1;
      this.e.put(hlf.a, $$1);
   }

   public void a() {
      this.e.put(grp.a, new grp());
   }

   public void a(hlp $$0) {
      this.d.add($$0);
   }

   public void b() {
      this.d.forEach($$0 -> $$0.a(new hlj.a()));
   }

   public Map<alg, hls> c() {
      return this.e;
   }

   public Set<alg> d() {
      return Sets.difference(this.b.keySet(), this.e.keySet());
   }

   hls a(alg $$0) {
      return this.e.computeIfAbsent($$0, this::b);
   }

   private hls b(alg $$0) {
      hls $$1 = this.b.get($$0);
      if ($$1 == null) {
         a.warn("Missing block model: '{}'", $$0);
         return this.c;
      } else {
         return $$1;
      }
   }

   class a implements hlp.a {
      private final List<alg> b = new ArrayList<>();
      private final Set<alg> c = new HashSet<>();

      @Override
      public hls a(alg $$0) {
         if (this.b.contains($$0)) {
            hlj.a.warn("Detected model loading loop: {}->{}", this.a(), $$0);
            return hlj.this.c;
         } else {
            hls $$1 = hlj.this.a($$0);
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
