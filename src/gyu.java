import com.mojang.logging.LogUtils;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;
import org.slf4j.Logger;

public class gyu {
   static final Logger a = LogUtils.getLogger();
   private final Map<alb, gzc> b;
   final gzc c;
   private final Map<gyx, gzc> d = new HashMap<>();
   private final Map<alb, gzc> e = new HashMap<>();

   public gyu(Map<alb, gzc> $$0, gzc $$1) {
      this.b = $$0;
      this.c = $$1;
      this.a(gyr.c, $$1);
      this.e.put(gyr.b, $$1);
   }

   private void a(alb $$0) {
      gyx $$1 = gyx.a($$0);
      alb $$2 = $$0.f("item/");
      gzc $$3 = this.b($$2);
      this.a($$1, $$3);
   }

   private void a(gyx $$0) {
      alb $$1 = $$0.b().f("item/");
      gzc $$2 = this.b($$1);
      this.a($$0, $$2);
   }

   private void a(gyx $$0, gzc $$1) {
      this.d.put($$0, $$1);
   }

   public void a(gyo.c $$0) {
      this.e.put(gzb.a, gzb.c);
      this.e.put(gzb.b, gzb.d);
      $$0.a().forEach(($$0x, $$1x) -> this.a($$0x, $$1x.b()));

      for (alb $$1 : lu.g.f()) {
         this.a($$1);
      }

      this.a(gnq.i);
      this.a(gnq.j);
      this.a(gnq.a((cts)cvo.qV));
      this.a(gnq.b((cts)cvo.qV));
   }

   public void a() {
      this.d.values().forEach($$0 -> $$0.a(new gyu.a(), gzc.a.a));
   }

   public Map<gyx, gzc> b() {
      return this.d;
   }

   public Map<alb, gzc> c() {
      return this.e;
   }

   gzc b(alb $$0) {
      return this.e.computeIfAbsent($$0, this::c);
   }

   private gzc c(alb $$0) {
      gzc $$1 = this.b.get($$0);
      if ($$1 == null) {
         a.warn("Missing block model: '{}'", $$0);
         return this.c;
      } else {
         return $$1;
      }
   }

   class a implements gzc.b {
      private final List<alb> b = new ArrayList<>();
      private final Set<alb> c = new HashSet<>();
      private gzc.a d = gzc.a.a;

      @Override
      public gzc a(alb $$0) {
         return this.b($$0, false);
      }

      @Override
      public gzc b(alb $$0) {
         if (this.d == gzc.a.b) {
            gyu.a.warn("Re-entrant override in {}->{}", this.a(), $$0);
         }

         this.d = gzc.a.b;
         gzc $$1 = this.b($$0, true);
         this.d = gzc.a.a;
         return $$1;
      }

      private boolean a(alb $$0, boolean $$1) {
         if (this.b.isEmpty()) {
            return false;
         } else if (!this.b.contains($$0)) {
            return false;
         } else if ($$1) {
            alb $$2 = this.b.getLast();
            return !$$2.equals($$0);
         } else {
            return true;
         }
      }

      private gzc b(alb $$0, boolean $$1) {
         if (this.a($$0, $$1)) {
            gyu.a.warn("Detected model loading loop: {}->{}", this.a(), $$0);
            return gyu.this.c;
         } else {
            gzc $$2 = gyu.this.b($$0);
            if (this.c.add($$0)) {
               this.b.add($$0);
               $$2.a(this, this.d);
               this.b.remove($$0);
            }

            return $$2;
         }
      }

      private String a() {
         return this.b.stream().map(alb::toString).collect(Collectors.joining("->"));
      }
   }
}
