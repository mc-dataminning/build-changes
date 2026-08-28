import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import java.util.List;
import java.util.Map;
import javax.annotation.Nullable;

public class grt implements grj {
   protected final List<geu> a;
   protected final Map<jf, List<geu>> b;
   protected final boolean c;
   protected final boolean d;
   protected final boolean e;
   protected final gpi f;
   protected final gfg g;
   protected final gfe h;

   public grt(List<geu> $$0, Map<jf, List<geu>> $$1, boolean $$2, boolean $$3, boolean $$4, gpi $$5, gfg $$6, gfe $$7) {
      this.a = $$0;
      this.b = $$1;
      this.c = $$2;
      this.d = $$4;
      this.e = $$3;
      this.f = $$5;
      this.g = $$6;
      this.h = $$7;
   }

   @Override
   public List<geu> a(@Nullable dsh $$0, @Nullable jf $$1, aym $$2) {
      return $$1 == null ? this.a : this.b.get($$1);
   }

   @Override
   public boolean a() {
      return this.c;
   }

   @Override
   public boolean b() {
      return this.d;
   }

   @Override
   public boolean c() {
      return this.e;
   }

   @Override
   public boolean d() {
      return false;
   }

   @Override
   public gpi e() {
      return this.f;
   }

   @Override
   public gfg f() {
      return this.g;
   }

   @Override
   public gfe g() {
      return this.h;
   }

   public static class a {
      private final List<geu> a = Lists.newArrayList();
      private final Map<jf, List<geu>> b = Maps.newEnumMap(jf.class);
      private final gfe c;
      private final boolean d;
      private gpi e;
      private final boolean f;
      private final boolean g;
      private final gfg h;

      public a(gez $$0, gfe $$1, boolean $$2) {
         this($$0.b(), $$0.c().a(), $$2, $$0.h(), $$1);
      }

      private a(boolean $$0, boolean $$1, boolean $$2, gfg $$3, gfe $$4) {
         for (jf $$5 : jf.values()) {
            this.b.put($$5, Lists.newArrayList());
         }

         this.c = $$4;
         this.d = $$0;
         this.f = $$1;
         this.g = $$2;
         this.h = $$3;
      }

      public grt.a a(jf $$0, geu $$1) {
         this.b.get($$0).add($$1);
         return this;
      }

      public grt.a a(geu $$0) {
         this.a.add($$0);
         return this;
      }

      public grt.a a(gpi $$0) {
         this.e = $$0;
         return this;
      }

      public grt.a a() {
         return this;
      }

      public grj b() {
         if (this.e == null) {
            throw new RuntimeException("Missing particle!");
         } else {
            return new grt(this.a, this.b, this.d, this.f, this.g, this.e, this.h, this.c);
         }
      }
   }
}
