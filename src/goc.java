import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import java.util.List;
import java.util.Map;
import javax.annotation.Nullable;

public class goc implements gns {
   protected final List<gbf> a;
   protected final Map<ij, List<gbf>> b;
   protected final boolean c;
   protected final boolean d;
   protected final boolean e;
   protected final gls f;
   protected final gbr g;
   protected final gbp h;

   public goc(List<gbf> $$0, Map<ij, List<gbf>> $$1, boolean $$2, boolean $$3, boolean $$4, gls $$5, gbr $$6, gbp $$7) {
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
   public List<gbf> a(@Nullable dpi $$0, @Nullable ij $$1, axt $$2) {
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
   public gls e() {
      return this.f;
   }

   @Override
   public gbr f() {
      return this.g;
   }

   @Override
   public gbp g() {
      return this.h;
   }

   public static class a {
      private final List<gbf> a = Lists.newArrayList();
      private final Map<ij, List<gbf>> b = Maps.newEnumMap(ij.class);
      private final gbp c;
      private final boolean d;
      private gls e;
      private final boolean f;
      private final boolean g;
      private final gbr h;

      public a(gbk $$0, gbp $$1, boolean $$2) {
         this($$0.b(), $$0.c().a(), $$2, $$0.h(), $$1);
      }

      private a(boolean $$0, boolean $$1, boolean $$2, gbr $$3, gbp $$4) {
         for (ij $$5 : ij.values()) {
            this.b.put($$5, Lists.newArrayList());
         }

         this.c = $$4;
         this.d = $$0;
         this.f = $$1;
         this.g = $$2;
         this.h = $$3;
      }

      public goc.a a(ij $$0, gbf $$1) {
         this.b.get($$0).add($$1);
         return this;
      }

      public goc.a a(gbf $$0) {
         this.a.add($$0);
         return this;
      }

      public goc.a a(gls $$0) {
         this.e = $$0;
         return this;
      }

      public goc.a a() {
         return this;
      }

      public gns b() {
         if (this.e == null) {
            throw new RuntimeException("Missing particle!");
         } else {
            return new goc(this.a, this.b, this.d, this.f, this.g, this.e, this.h, this.c);
         }
      }
   }
}
