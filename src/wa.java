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

public class wa {
   public static final Codec<wa> a = Codec.either(wa.d.a.codec(), wa.d.b.codec())
      .xmap($$0 -> new wa((wa.d<?>)$$0.map($$0x -> $$0x, $$0x -> $$0x)), $$0 -> Either.left($$0.b));
   private final wa.d<?> b;

   public <T> wa(wa.a<T> $$0, T $$1) {
      this(new wa.d<>($$0, $$1));
   }

   private wa(wa.d<?> $$0) {
      this.b = $$0;
   }

   public wa.a<?> a() {
      return this.b.c;
   }

   @Nullable
   public <T> T a(wa.a<T> $$0) {
      return this.b.c == $$0 ? $$0.a(this.b.d) : null;
   }

   @Override
   public boolean equals(Object $$0) {
      if (this == $$0) {
         return true;
      } else {
         return $$0 != null && this.getClass() == $$0.getClass() ? ((wa)$$0).b.equals(this.b) : false;
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

   public static class a<T> implements axq {
      public static final wa.a<vu> a = new wa.a<>("show_text", true, vw.a, DataResult::success);
      public static final wa.a<wa.c> b = new wa.a<>("show_item", true, wa.c.b, wa.c::a);
      public static final wa.a<wa.b> c = new wa.a<>("show_entity", true, wa.b.a, wa.b::a);
      public static final Codec<wa.a<?>> d = axq.b(() -> new wa.a[]{a, b, c});
      public static final Codec<wa.a<?>> e = awe.b(d, wa.a::a);
      private final String f;
      private final boolean g;
      final Codec<wa.d<T>> h;
      final Codec<wa.d<T>> i;

      public a(String $$0, boolean $$1, Codec<T> $$2, Function<vu, DataResult<T>> $$3) {
         this.f = $$0;
         this.g = $$1;
         this.h = $$2.xmap($$0x -> new wa.d<>(this, (T)$$0x), $$0x -> $$0x.d).fieldOf("contents").codec();
         this.i = Codec.of(Encoder.error("Can't encode in legacy format"), vw.a.flatMap($$3).map($$0x -> new wa.d<>(this, (T)$$0x)));
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

      private static DataResult<wa.a<?>> a(@Nullable wa.a<?> $$0) {
         if ($$0 == null) {
            return DataResult.error(() -> "Unknown action");
         } else {
            return !$$0.a() ? DataResult.error(() -> "Action not allowed: " + $$0) : DataResult.success($$0, Lifecycle.stable());
         }
      }
   }

   public static class b {
      public static final Codec<wa.b> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(
                  ki.g.q().fieldOf("type").forGetter($$0x -> $$0x.b),
                  jf.f.fieldOf("id").forGetter($$0x -> $$0x.c),
                  awe.a(vw.a, "name").forGetter($$0x -> $$0x.d)
               )
               .apply($$0, wa.b::new)
      );
      public final bpd<?> b;
      public final UUID c;
      public final Optional<vu> d;
      @Nullable
      private List<vu> e;

      public b(bpd<?> $$0, UUID $$1, @Nullable vu $$2) {
         this($$0, $$1, Optional.ofNullable($$2));
      }

      public b(bpd<?> $$0, UUID $$1, Optional<vu> $$2) {
         this.b = $$0;
         this.c = $$1;
         this.d = $$2;
      }

      public static DataResult<wa.b> a(vu $$0) {
         try {
            ta $$1 = ty.a($$0.getString());
            vu $$2 = vu.a.a($$1.l("name"));
            bpd<?> $$3 = ki.g.a(new ajh($$1.l("type")));
            UUID $$4 = UUID.fromString($$1.l("id"));
            return DataResult.success(new wa.b($$3, $$4, $$2));
         } catch (Exception var5) {
            return DataResult.error(() -> "Failed to parse tooltip: " + var5.getMessage());
         }
      }

      public List<vu> a() {
         if (this.e == null) {
            this.e = new ArrayList<>();
            this.d.ifPresent(this.e::add);
            this.e.add(vu.a("gui.entity_tooltip.type", this.b.h()));
            this.e.add(vu.b(this.c.toString()));
         }

         return this.e;
      }

      @Override
      public boolean equals(Object $$0) {
         if (this == $$0) {
            return true;
         } else if ($$0 != null && this.getClass() == $$0.getClass()) {
            wa.b $$1 = (wa.b)$$0;
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
      public static final Codec<wa.c> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(
                  ki.h.q().fieldOf("id").forGetter($$0x -> $$0x.c),
                  awe.a(Codec.INT, "count", Integer.valueOf(1)).forGetter($$0x -> $$0x.d),
                  awe.a(ty.i, "tag").forGetter($$0x -> $$0x.e)
               )
               .apply($$0, wa.c::new)
      );
      public static final Codec<wa.c> b = Codec.either(ki.h.q(), a)
         .xmap($$0 -> (wa.c)$$0.map($$0x -> new wa.c($$0x, 1, Optional.empty()), $$0x -> $$0x), Either::right);
      private final cqh c;
      private final int d;
      private final Optional<ta> e;
      @Nullable
      private cqm f;

      c(cqh $$0, int $$1, @Nullable ta $$2) {
         this($$0, $$1, Optional.ofNullable($$2));
      }

      c(cqh $$0, int $$1, Optional<ta> $$2) {
         this.c = $$0;
         this.d = $$1;
         this.e = $$2;
      }

      public c(cqm $$0) {
         this($$0.d(), $$0.M(), $$0.w() != null ? Optional.of($$0.w().h()) : Optional.empty());
      }

      @Override
      public boolean equals(Object $$0) {
         if (this == $$0) {
            return true;
         } else if ($$0 != null && this.getClass() == $$0.getClass()) {
            wa.c $$1 = (wa.c)$$0;
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

      public cqm a() {
         if (this.f == null) {
            this.f = new cqm(this.c, this.d);
            this.e.ifPresent(this.f::c);
         }

         return this.f;
      }

      private static DataResult<wa.c> a(vu $$0) {
         try {
            ta $$1 = ty.a($$0.getString());
            return DataResult.success(new wa.c(cqm.a($$1)));
         } catch (CommandSyntaxException var2) {
            return DataResult.error(() -> "Failed to parse item tag: " + var2.getMessage());
         }
      }
   }

   static record d<T>(wa.a<T> c, T d) {
      public static final MapCodec<wa.d<?>> a = wa.a.e.dispatchMap("action", wa.d::a, $$0 -> $$0.h);
      public static final MapCodec<wa.d<?>> b = wa.a.e.dispatchMap("action", wa.d::a, $$0 -> $$0.i);

      public wa.a<T> a() {
         return this.c;
      }

      public T b() {
         return this.d;
      }
   }
}
