import com.mojang.logging.LogUtils;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;
import org.slf4j.Logger;

public class gzl {
   static final Logger a = LogUtils.getLogger();
   private final Map<alc, gzt> b;
   final gzt c;
   private final Map<gzo, gzt> d = new HashMap<>();
   private final Map<alc, gzt> e = new HashMap<>();

   public gzl(Map<alc, gzt> $$0, gzt $$1) {
      this.b = $$0;
      this.c = $$1;
      this.a(gzi.c, $$1);
      this.e.put(gzi.b, $$1);
   }

   private void a(alc $$0) {
      gzo $$1 = gzo.a($$0);
      alc $$2 = $$0.f("item/");
      gzt $$3 = this.b($$2);
      this.a($$1, $$3);
   }

   private void a(gzo $$0) {
      alc $$1 = $$0.b().f("item/");
      gzt $$2 = this.b($$1);
      this.a($$0, $$2);
   }

   private void a(gzo $$0, gzt $$1) {
      this.d.put($$0, $$1);
   }

   public void a(gzf.c $$0) {
      this.e.put(gzs.a, gzs.c);
      this.e.put(gzs.b, gzs.d);
      $$0.a().forEach(($$0x, $$1x) -> this.a($$0x, $$1x.b()));

      for (alc $$1 : lu.g.f()) {
         this.a($$1);
      }

      this.a(goh.i);
      this.a(goh.j);
      this.a(goh.a((cty)cvt.qV));
      this.a(goh.b((cty)cvt.qV));
   }

   public void a() {
      this.d.values().forEach($$0 -> $$0.a(new gzl.a(), gzt.a.a));
   }

   public Map<gzo, gzt> b() {
      return this.d;
   }

   public Map<alc, gzt> c() {
      return this.e;
   }

   gzt b(alc $$0) {
      return this.e.computeIfAbsent($$0, this::c);
   }

   private gzt c(alc $$0) {
      gzt $$1 = this.b.get($$0);
      if ($$1 == null) {
         a.warn("Missing block model: '{}'", $$0);
         return this.c;
      } else {
         return $$1;
      }
   }

   class a implements gzt.b {
      private final List<alc> b = new ArrayList<>();
      private final Set<alc> c = new HashSet<>();
      private gzt.a d = gzt.a.a;

      @Override
      public gzt a(alc $$0) {
         return this.b($$0, false);
      }

      @Override
      public gzt b(alc $$0) {
         if (this.d == gzt.a.b) {
            gzl.a.warn("Re-entrant override in {}->{}", this.a(), $$0);
         }

         this.d = gzt.a.b;
         gzt $$1 = this.b($$0, true);
         this.d = gzt.a.a;
         return $$1;
      }

      private boolean a(alc $$0, boolean $$1) {
         if (this.b.isEmpty()) {
            return false;
         } else if (!this.b.contains($$0)) {
            return false;
         } else if ($$1) {
            alc $$2 = this.b.getLast();
            return !$$2.equals($$0);
         } else {
            return true;
         }
      }

      private gzt b(alc $$0, boolean $$1) {
         if (this.a($$0, $$1)) {
            gzl.a.warn("Detected model loading loop: {}->{}", this.a(), $$0);
            return gzl.this.c;
         } else {
            gzt $$2 = gzl.this.b($$0);
            if (this.c.add($$0)) {
               this.b.add($$0);
               $$2.a(this, this.d);
               this.b.remove($$0);
            }

            return $$2;
         }
      }

      private String a() {
         return this.b.stream().map(alc::toString).collect(Collectors.joining("->"));
      }
   }
}
