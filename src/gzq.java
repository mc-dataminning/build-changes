import com.mojang.logging.LogUtils;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;
import org.slf4j.Logger;

public class gzq {
   static final Logger a = LogUtils.getLogger();
   private final Map<ale, gzy> b;
   final gzy c;
   private final Map<gzt, gzy> d = new HashMap<>();
   private final Map<ale, gzy> e = new HashMap<>();

   public gzq(Map<ale, gzy> $$0, gzy $$1) {
      this.b = $$0;
      this.c = $$1;
      this.a(gzn.c, $$1);
      this.e.put(gzn.b, $$1);
   }

   private void a(ale $$0) {
      gzt $$1 = gzt.a($$0);
      ale $$2 = $$0.f("item/");
      gzy $$3 = this.b($$2);
      this.a($$1, $$3);
   }

   private void a(gzt $$0) {
      ale $$1 = $$0.b().f("item/");
      gzy $$2 = this.b($$1);
      this.a($$0, $$2);
   }

   private void a(gzt $$0, gzy $$1) {
      this.d.put($$0, $$1);
   }

   public void a(gzk.c $$0) {
      this.e.put(gzx.a, gzx.c);
      this.e.put(gzx.b, gzx.d);
      $$0.a().forEach(($$0x, $$1x) -> this.a($$0x, $$1x.b()));

      for (ale $$1 : lv.g.i()) {
         this.a($$1);
      }

      this.a(gom.i);
      this.a(gom.j);
      this.a(gom.a((cub)cvw.qV));
      this.a(gom.b((cub)cvw.qV));
   }

   public void a() {
      this.d.values().forEach($$0 -> $$0.a(new gzq.a(), gzy.a.a));
   }

   public Map<gzt, gzy> b() {
      return this.d;
   }

   public Map<ale, gzy> c() {
      return this.e;
   }

   gzy b(ale $$0) {
      return this.e.computeIfAbsent($$0, this::c);
   }

   private gzy c(ale $$0) {
      gzy $$1 = this.b.get($$0);
      if ($$1 == null) {
         a.warn("Missing block model: '{}'", $$0);
         return this.c;
      } else {
         return $$1;
      }
   }

   class a implements gzy.b {
      private final List<ale> b = new ArrayList<>();
      private final Set<ale> c = new HashSet<>();
      private gzy.a d = gzy.a.a;

      @Override
      public gzy a(ale $$0) {
         return this.b($$0, false);
      }

      @Override
      public gzy b(ale $$0) {
         if (this.d == gzy.a.b) {
            gzq.a.warn("Re-entrant override in {}->{}", this.a(), $$0);
         }

         this.d = gzy.a.b;
         gzy $$1 = this.b($$0, true);
         this.d = gzy.a.a;
         return $$1;
      }

      private boolean a(ale $$0, boolean $$1) {
         if (this.b.isEmpty()) {
            return false;
         } else if (!this.b.contains($$0)) {
            return false;
         } else if ($$1) {
            ale $$2 = this.b.getLast();
            return !$$2.equals($$0);
         } else {
            return true;
         }
      }

      private gzy b(ale $$0, boolean $$1) {
         if (this.a($$0, $$1)) {
            gzq.a.warn("Detected model loading loop: {}->{}", this.a(), $$0);
            return gzq.this.c;
         } else {
            gzy $$2 = gzq.this.b($$0);
            if (this.c.add($$0)) {
               this.b.add($$0);
               $$2.a(this, this.d);
               this.b.remove($$0);
            }

            return $$2;
         }
      }

      private String a() {
         return this.b.stream().map(ale::toString).collect(Collectors.joining("->"));
      }
   }
}
