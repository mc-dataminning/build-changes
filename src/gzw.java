import com.google.common.collect.ImmutableList;
import com.google.common.collect.Maps;
import com.google.common.collect.ImmutableList.Builder;
import java.util.EnumMap;
import java.util.List;
import java.util.Map;
import javax.annotation.Nullable;

public class gzw implements gzi {
   protected final List<gir> a;
   protected final Map<jk, List<gir>> b;
   protected final boolean c;
   protected final boolean d;
   protected final boolean e;
   protected final gxg f;
   protected final gjd g;
   protected final gjb h;

   public gzw(List<gir> $$0, Map<jk, List<gir>> $$1, boolean $$2, boolean $$3, boolean $$4, gxg $$5, gjd $$6, gjb $$7) {
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
   public List<gir> a(@Nullable dus $$0, @Nullable jk $$1, azn $$2) {
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
   public gxg e() {
      return this.f;
   }

   @Override
   public gjd f() {
      return this.g;
   }

   @Override
   public gjb g() {
      return this.h;
   }

   public static class a {
      private final Builder<gir> a = ImmutableList.builder();
      private final EnumMap<jk, Builder<gir>> b = Maps.newEnumMap(jk.class);
      private final gjb c;
      private final boolean d;
      @Nullable
      private gxg e;
      private final boolean f;
      private final boolean g;
      private final gjd h;

      public a(giw $$0, gjb $$1, boolean $$2) {
         this($$0.b(), $$0.c().a(), $$2, $$0.g(), $$1);
      }

      private a(boolean $$0, boolean $$1, boolean $$2, gjd $$3, gjb $$4) {
         this.c = $$4;
         this.d = $$0;
         this.f = $$1;
         this.g = $$2;
         this.h = $$3;

         for (jk $$5 : jk.values()) {
            this.b.put($$5, ImmutableList.builder());
         }
      }

      public gzw.a a(jk $$0, gir $$1) {
         this.b.get($$0).add($$1);
         return this;
      }

      public gzw.a a(gir $$0) {
         this.a.add($$0);
         return this;
      }

      public gzw.a a(gxg $$0) {
         this.e = $$0;
         return this;
      }

      public gzw.a a() {
         return this;
      }

      public gzi b() {
         if (this.e == null) {
            throw new RuntimeException("Missing particle!");
         } else {
            Map<jk, List<gir>> $$0 = Maps.transformValues(this.b, Builder::build);
            return new gzw(this.a.build(), new EnumMap<>($$0), this.d, this.f, this.g, this.e, this.h, this.c);
         }
      }
   }
}
