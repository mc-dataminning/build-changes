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

public class hgx {
   static final Logger a = LogUtils.getLogger();
   private final Map<aku, hhg> b;
   final hhg c;
   private final List<hhd> d = new ArrayList<>();
   private final Map<aku, hhg> e = new HashMap<>();

   public hgx(Map<aku, hhg> $$0, hhg $$1) {
      this.b = $$0;
      this.c = $$1;
      this.e.put(hgt.a, $$1);
   }

   public void a() {
      this.e.put(gnm.a, new gnm());
   }

   public void a(hhd $$0) {
      this.d.add($$0);
   }

   public void b() {
      this.d.forEach($$0 -> $$0.a(new hgx.a()));
   }

   public Map<aku, hhg> c() {
      return this.e;
   }

   public Set<aku> d() {
      return Sets.difference(this.b.keySet(), this.e.keySet());
   }

   hhg a(aku $$0) {
      return this.e.computeIfAbsent($$0, this::b);
   }

   private hhg b(aku $$0) {
      hhg $$1 = this.b.get($$0);
      if ($$1 == null) {
         a.warn("Missing block model: '{}'", $$0);
         return this.c;
      } else {
         return $$1;
      }
   }

   class a implements hhd.a {
      private final List<aku> b = new ArrayList<>();
      private final Set<aku> c = new HashSet<>();

      @Override
      public hhg a(aku $$0) {
         if (this.b.contains($$0)) {
            hgx.a.warn("Detected model loading loop: {}->{}", this.a(), $$0);
            return hgx.this.c;
         } else {
            hhg $$1 = hgx.this.a($$0);
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
