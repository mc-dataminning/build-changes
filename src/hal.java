import com.google.common.collect.ImmutableList;
import com.google.common.collect.Maps;
import com.google.common.collect.ImmutableList.Builder;
import java.util.EnumMap;
import java.util.List;
import java.util.Map;
import javax.annotation.Nullable;

public class hal implements gzu {
   protected final List<gjd> a;
   protected final Map<jl, List<gjd>> b;
   protected final boolean c;
   protected final boolean d;
   protected final boolean e;
   protected final gxs f;
   protected final gjo g;

   public hal(List<gjd> $$0, Map<jl, List<gjd>> $$1, boolean $$2, boolean $$3, boolean $$4, gxs $$5, gjo $$6) {
      this.a = $$0;
      this.b = $$1;
      this.c = $$2;
      this.d = $$4;
      this.e = $$3;
      this.f = $$5;
      this.g = $$6;
   }

   @Override
   public List<gjd> a(@Nullable dvd $$0, @Nullable jl $$1, azr $$2) {
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
   public gxs e() {
      return this.f;
   }

   @Override
   public gjo f() {
      return this.g;
   }

   public static class a {
      private final Builder<gjd> a = ImmutableList.builder();
      private final EnumMap<jl, Builder<gjd>> b = Maps.newEnumMap(jl.class);
      private final boolean c;
      @Nullable
      private gxs d;
      private final boolean e;
      private final boolean f;
      private final gjo g;

      public a(gji $$0, boolean $$1) {
         this($$0.b(), $$0.c().a(), $$1, $$0.g());
      }

      private a(boolean $$0, boolean $$1, boolean $$2, gjo $$3) {
         this.c = $$0;
         this.e = $$1;
         this.f = $$2;
         this.g = $$3;

         for (jl $$4 : jl.values()) {
            this.b.put($$4, ImmutableList.builder());
         }
      }

      public hal.a a(jl $$0, gjd $$1) {
         this.b.get($$0).add($$1);
         return this;
      }

      public hal.a a(gjd $$0) {
         this.a.add($$0);
         return this;
      }

      public hal.a a(gxs $$0) {
         this.d = $$0;
         return this;
      }

      public hal.a a() {
         return this;
      }

      public gzu b() {
         if (this.d == null) {
            throw new RuntimeException("Missing particle!");
         } else {
            Map<jl, List<gjd>> $$0 = Maps.transformValues(this.b, Builder::build);
            return new hal(this.a.build(), new EnumMap<>($$0), this.c, this.e, this.f, this.d, this.g);
         }
      }
   }
}
