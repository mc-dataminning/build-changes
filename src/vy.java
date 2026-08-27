import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.datafixers.util.Either;
import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.Encoder;
import com.mojang.serialization.Lifecycle;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.UUID;
import java.util.function.Function;
import javax.annotation.Nullable;

public class vy {
   public static final Codec<vy> a = Codec.either(vy.d.a.codec(), vy.d.b.codec())
      .xmap($$0 -> new vy((vy.d<?>)$$0.map($$0x -> $$0x, $$0x -> $$0x)), $$0 -> Either.left($$0.b));
   private final vy.d<?> b;

   public <T> vy(vy.a<T> $$0, T $$1) {
      this(new vy.d<>($$0, $$1));
   }

   private vy(vy.d<?> $$0) {
      this.b = $$0;
   }

   public vy.a<?> a() {
      return this.b.c;
   }

   @Nullable
   public <T> T a(vy.a<T> $$0) {
      return this.b.c == $$0 ? $$0.a(this.b.d) : null;
   }

   @Override
   public boolean equals(Object $$0) {
      if (this == $$0) {
         return true;
      } else {
         return $$0 != null && this.getClass() == $$0.getClass() ? ((vy)$$0).b.equals(this.b) : false;
      }
   }

   @Override
   public String toString() {
      return this.b.toString();
   }

   @Override
   public int hashCode() {
      return this.b.hashCode();
   }

   public static class a<T> implements axg {
      public static final vy.a<vs> a = new vy.a<>("show_text", true, vu.a, DataResult::success);
      public static final vy.a<vy.c> b = new vy.a<>("show_item", true, vy.c.b, vy.c::a);
      public static final vy.a<vy.b> c = new vy.a<>("show_entity", true, vy.b.a, vy.b::a);
      public static final Codec<vy.a<?>> d = axg.b(() -> new vy.a[]{a, b, c});
      public static final Codec<vy.a<?>> e = avu.a(d, vy.a::a);
      private final String f;
      private final boolean g;
      final Codec<vy.d<T>> h;
      final Codec<vy.d<T>> i;

      public a(String $$0, boolean $$1, Codec<T> $$2, Function<vs, DataResult<T>> $$3) {
         this.f = $$0;
         this.g = $$1;
         this.h = $$2.xmap($$0x -> new vy.d<>(this, (T)$$0x), $$0x -> $$0x.d).fieldOf("contents").codec();
         this.i = Codec.of(Encoder.error("Can't encode in legacy format"), vu.a.flatMap($$3).map($$0x -> new vy.d<>(this, (T)$$0x)));
      }

      public boolean a() {
         return this.g;
      }

      @Override
      public String c() {
         return this.f;
      }

      T a(Object $$0) {
         return (T)$$0;
      }

      @Override
      public String toString() {
         return "<action " + this.f + ">";
      }

      private static DataResult<vy.a<?>> a(@Nullable vy.a<?> $$0) {
         if ($$0 == null) {
            return DataResult.error(() -> "Unknown action");
         } else {
            return !$$0.a() ? DataResult.error(() -> "Action not allowed: " + $$0) : DataResult.success($$0, Lifecycle.stable());
         }
      }
   }

   public static class b {
      public static final Codec<vy.b> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(
                  kh.g.q().fieldOf("type").forGetter($$0x -> $$0x.b),
                  je.f.fieldOf("id").forGetter($$0x -> $$0x.c),
                  avu.a(vu.a, "name").forGetter($$0x -> $$0x.d)
               )
               .apply($$0, vy.b::new)
      );
      public final bol<?> b;
      public final UUID c;
      public final Optional<vs> d;
      @Nullable
      private List<vs> e;

      public b(bol<?> $$0, UUID $$1, @Nullable vs $$2) {
         this($$0, $$1, Optional.ofNullable($$2));
      }

      public b(bol<?> $$0, UUID $$1, Optional<vs> $$2) {
         this.b = $$0;
         this.c = $$1;
         this.d = $$2;
      }

      public static DataResult<vy.b> a(vs $$0) {
         try {
            sy $$1 = tw.a($$0.getString());
            vs $$2 = vs.a.a($$1.l("name"));
            bol<?> $$3 = kh.g.a(new ajc($$1.l("type")));
            UUID $$4 = UUID.fromString($$1.l("id"));
            return DataResult.success(new vy.b($$3, $$4, $$2));
         } catch (Exception var5) {
            return DataResult.error(() -> "Failed to parse tooltip: " + var5.getMessage());
         }
      }

      public List<vs> a() {
         if (this.e == null) {
            this.e = new ArrayList<>();
            this.d.ifPresent(this.e::add);
            this.e.add(vs.a("gui.entity_tooltip.type", this.b.h()));
            this.e.add(vs.b(this.c.toString()));
         }

         return this.e;
      }

      @Override
      public boolean equals(Object $$0) {
         if (this == $$0) {
            return true;
         } else if ($$0 != null && this.getClass() == $$0.getClass()) {
            vy.b $$1 = (vy.b)$$0;
            return this.b.equals($$1.b) && this.c.equals($$1.c) && this.d.equals($$1.d);
         } else {
            return false;
         }
      }

      @Override
      public int hashCode() {
         int $$0 = this.b.hashCode();
         $$0 = 31 * $$0 + this.c.hashCode();
         return 31 * $$0 + this.d.hashCode();
      }
   }

   public static class c {
      public static final Codec<vy.c> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(
                  kh.h.q().fieldOf("id").forGetter($$0x -> $$0x.c),
                  avu.a(Codec.INT, "count", Integer.valueOf(1)).forGetter($$0x -> $$0x.d),
                  avu.a(tw.i, "tag").forGetter($$0x -> $$0x.e)
               )
               .apply($$0, vy.c::new)
      );
      public static final Codec<vy.c> b = Codec.either(kh.h.q(), a)
         .xmap($$0 -> (vy.c)$$0.map($$0x -> new vy.c($$0x, 1, Optional.empty()), $$0x -> $$0x), Either::right);
      private final cpl c;
      private final int d;
      private final Optional<sy> e;
      @Nullable
      private cpq f;

      c(cpl $$0, int $$1, @Nullable sy $$2) {
         this($$0, $$1, Optional.ofNullable($$2));
      }

      c(cpl $$0, int $$1, Optional<sy> $$2) {
         this.c = $$0;
         this.d = $$1;
         this.e = $$2;
      }

      public c(cpq $$0) {
         this($$0.d(), $$0.M(), $$0.w() != null ? Optional.of($$0.w().h()) : Optional.empty());
      }

      @Override
      public boolean equals(Object $$0) {
         if (this == $$0) {
            return true;
         } else if ($$0 != null && this.getClass() == $$0.getClass()) {
            vy.c $$1 = (vy.c)$$0;
            return this.d == $$1.d && this.c.equals($$1.c) && this.e.equals($$1.e);
         } else {
            return false;
         }
      }

      @Override
      public int hashCode() {
         int $$0 = this.c.hashCode();
         $$0 = 31 * $$0 + this.d;
         return 31 * $$0 + this.e.hashCode();
      }

      public cpq a() {
         if (this.f == null) {
            this.f = new cpq(this.c, this.d);
            this.e.ifPresent(this.f::c);
         }

         return this.f;
      }

      private static DataResult<vy.c> a(vs $$0) {
         try {
            sy $$1 = tw.a($$0.getString());
            return DataResult.success(new vy.c(cpq.a($$1)));
         } catch (CommandSyntaxException var2) {
            return DataResult.error(() -> "Failed to parse item tag: " + var2.getMessage());
         }
      }
   }

   static record d<T>(vy.a<T> c, T d) {
      public static final MapCodec<vy.d<?>> a = vy.a.e.dispatchMap("action", vy.d::a, $$0 -> $$0.h);
      public static final MapCodec<vy.d<?>> b = vy.a.e.dispatchMap("action", vy.d::a, $$0 -> $$0.i);

      public vy.a<T> a() {
         return this.c;
      }

      public T b() {
         return this.d;
      }
   }
}
