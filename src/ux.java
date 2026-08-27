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

public class ux {
   public static final Codec<ux> a = Codec.either(ux.d.a.codec(), ux.d.b.codec())
      .xmap($$0 -> new ux((ux.d<?>)$$0.map($$0x -> $$0x, $$0x -> $$0x)), $$0 -> Either.left($$0.b));
   private final ux.d<?> b;

   public <T> ux(ux.a<T> $$0, T $$1) {
      this(new ux.d<>($$0, $$1));
   }

   private ux(ux.d<?> $$0) {
      this.b = $$0;
   }

   public ux.a<?> a() {
      return this.b.c;
   }

   @Nullable
   public <T> T a(ux.a<T> $$0) {
      return this.b.c == $$0 ? $$0.a(this.b.d) : null;
   }

   @Override
   public boolean equals(Object $$0) {
      if (this == $$0) {
         return true;
      } else {
         return $$0 != null && this.getClass() == $$0.getClass() ? ((ux)$$0).b.equals(this.b) : false;
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

   public static class a<T> implements aug {
      public static final ux.a<ur> a = new ux.a<>("show_text", true, ut.a, DataResult::success);
      public static final ux.a<ux.c> b = new ux.a<>("show_item", true, ux.c.b, ux.c::a);
      public static final ux.a<ux.b> c = new ux.a<>("show_entity", true, ux.b.a, ux.b::a);
      public static final Codec<ux.a<?>> d = aug.b(() -> new ux.a[]{a, b, c});
      public static final Codec<ux.a<?>> e = asu.a(d, ux.a::a);
      private final String f;
      private final boolean g;
      final Codec<ux.d<T>> h;
      final Codec<ux.d<T>> i;

      public a(String $$0, boolean $$1, Codec<T> $$2, Function<ur, DataResult<T>> $$3) {
         this.f = $$0;
         this.g = $$1;
         this.h = $$2.xmap($$0x -> new ux.d<>(this, (T)$$0x), $$0x -> $$0x.d).fieldOf("contents").codec();
         this.i = Codec.of(Encoder.error("Can't encode in legacy format"), ut.a.flatMap($$3).map($$0x -> new ux.d<>(this, (T)$$0x)));
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

      private static DataResult<ux.a<?>> a(@Nullable ux.a<?> $$0) {
         if ($$0 == null) {
            return DataResult.error(() -> "Unknown action");
         } else {
            return !$$0.a() ? DataResult.error(() -> "Action not allowed: " + $$0) : DataResult.success($$0, Lifecycle.stable());
         }
      }
   }

   public static class b {
      public static final Codec<ux.b> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(
                  jy.h.q().fieldOf("type").forGetter($$0x -> $$0x.b),
                  iv.d.fieldOf("id").forGetter($$0x -> $$0x.c),
                  asu.a(ut.a, "name").forGetter($$0x -> $$0x.d)
               )
               .apply($$0, ux.b::new)
      );
      public final bku<?> b;
      public final UUID c;
      public final Optional<ur> d;
      @Nullable
      private List<ur> e;

      public b(bku<?> $$0, UUID $$1, @Nullable ur $$2) {
         this($$0, $$1, Optional.ofNullable($$2));
      }

      public b(bku<?> $$0, UUID $$1, Optional<ur> $$2) {
         this.b = $$0;
         this.c = $$1;
         this.d = $$2;
      }

      public static DataResult<ux.b> a(ur $$0) {
         try {
            rz $$1 = sx.a($$0.getString());
            ur $$2 = ur.a.a($$1.l("name"));
            bku<?> $$3 = jy.h.a(new agi($$1.l("type")));
            UUID $$4 = UUID.fromString($$1.l("id"));
            return DataResult.success(new ux.b($$3, $$4, $$2));
         } catch (Exception var5) {
            return DataResult.error(() -> "Failed to parse tooltip: " + var5.getMessage());
         }
      }

      public List<ur> a() {
         if (this.e == null) {
            this.e = new ArrayList<>();
            this.d.ifPresent(this.e::add);
            this.e.add(ur.a("gui.entity_tooltip.type", this.b.h()));
            this.e.add(ur.b(this.c.toString()));
         }

         return this.e;
      }

      @Override
      public boolean equals(Object $$0) {
         if (this == $$0) {
            return true;
         } else if ($$0 != null && this.getClass() == $$0.getClass()) {
            ux.b $$1 = (ux.b)$$0;
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
      public static final Codec<ux.c> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(
                  jy.i.q().fieldOf("id").forGetter($$0x -> $$0x.c),
                  asu.a(Codec.INT, "count", Integer.valueOf(1)).forGetter($$0x -> $$0x.d),
                  asu.a(sx.i, "tag").forGetter($$0x -> $$0x.e)
               )
               .apply($$0, ux.c::new)
      );
      public static final Codec<ux.c> b = Codec.either(jy.i.q(), a)
         .xmap($$0 -> (ux.c)$$0.map($$0x -> new ux.c($$0x, 1, Optional.empty()), $$0x -> $$0x), Either::right);
      private final cle c;
      private final int d;
      private final Optional<rz> e;
      @Nullable
      private clj f;

      c(cle $$0, int $$1, @Nullable rz $$2) {
         this($$0, $$1, Optional.ofNullable($$2));
      }

      c(cle $$0, int $$1, Optional<rz> $$2) {
         this.c = $$0;
         this.d = $$1;
         this.e = $$2;
      }

      public c(clj $$0) {
         this($$0.d(), $$0.L(), $$0.v() != null ? Optional.of($$0.v().h()) : Optional.empty());
      }

      @Override
      public boolean equals(Object $$0) {
         if (this == $$0) {
            return true;
         } else if ($$0 != null && this.getClass() == $$0.getClass()) {
            ux.c $$1 = (ux.c)$$0;
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

      public clj a() {
         if (this.f == null) {
            this.f = new clj(this.c, this.d);
            this.e.ifPresent(this.f::c);
         }

         return this.f;
      }

      private static DataResult<ux.c> a(ur $$0) {
         try {
            rz $$1 = sx.a($$0.getString());
            return DataResult.success(new ux.c(clj.a($$1)));
         } catch (CommandSyntaxException var2) {
            return DataResult.error(() -> "Failed to parse item tag: " + var2.getMessage());
         }
      }
   }

   static record d<T>(ux.a<T> c, T d) {
      public static final MapCodec<ux.d<?>> a = ux.a.e.dispatchMap("action", ux.d::a, $$0 -> $$0.h);
      public static final MapCodec<ux.d<?>> b = ux.a.e.dispatchMap("action", ux.d::a, $$0 -> $$0.i);

      public ux.a<T> a() {
         return this.c;
      }

      public T b() {
         return this.d;
      }
   }
}
