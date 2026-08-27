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

public class uo {
   public static final Codec<uo> a = Codec.either(uo.d.a.codec(), uo.d.b.codec())
      .xmap($$0 -> new uo((uo.d<?>)$$0.map($$0x -> $$0x, $$0x -> $$0x)), $$0 -> Either.left($$0.b));
   private final uo.d<?> b;

   public <T> uo(uo.a<T> $$0, T $$1) {
      this(new uo.d<>($$0, $$1));
   }

   private uo(uo.d<?> $$0) {
      this.b = $$0;
   }

   public uo.a<?> a() {
      return this.b.c;
   }

   @Nullable
   public <T> T a(uo.a<T> $$0) {
      return this.b.c == $$0 ? $$0.a(this.b.d) : null;
   }

   @Override
   public boolean equals(Object $$0) {
      if (this == $$0) {
         return true;
      } else {
         return $$0 != null && this.getClass() == $$0.getClass() ? ((uo)$$0).b.equals(this.b) : false;
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

   public static class a<T> implements atr {
      public static final uo.a<ui> a = new uo.a<>("show_text", true, uk.a, DataResult::success);
      public static final uo.a<uo.c> b = new uo.a<>("show_item", true, uo.c.b, uo.c::a);
      public static final uo.a<uo.b> c = new uo.a<>("show_entity", true, uo.b.a, uo.b::a);
      public static final Codec<uo.a<?>> d = atr.b(() -> new uo.a[]{a, b, c});
      public static final Codec<uo.a<?>> e = asg.a(d, uo.a::a);
      private final String f;
      private final boolean g;
      final Codec<uo.d<T>> h;
      final Codec<uo.d<T>> i;

      public a(String $$0, boolean $$1, Codec<T> $$2, Function<ui, DataResult<T>> $$3) {
         this.f = $$0;
         this.g = $$1;
         this.h = $$2.xmap($$0x -> new uo.d<>(this, (T)$$0x), $$0x -> $$0x.d).fieldOf("contents").codec();
         this.i = Codec.of(Encoder.error("Can't encode in legacy format"), uk.a.flatMap($$3).map($$0x -> new uo.d<>(this, (T)$$0x)));
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

      private static DataResult<uo.a<?>> a(@Nullable uo.a<?> $$0) {
         if ($$0 == null) {
            return DataResult.error(() -> "Unknown action");
         } else {
            return !$$0.a() ? DataResult.error(() -> "Action not allowed: " + $$0) : DataResult.success($$0, Lifecycle.stable());
         }
      }
   }

   public static class b {
      public static final Codec<uo.b> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(
                  jy.h.q().fieldOf("type").forGetter($$0x -> $$0x.b),
                  iv.d.fieldOf("id").forGetter($$0x -> $$0x.c),
                  asg.a(uk.a, "name").forGetter($$0x -> $$0x.d)
               )
               .apply($$0, uo.b::new)
      );
      public final bjx<?> b;
      public final UUID c;
      public final Optional<ui> d;
      @Nullable
      private List<ui> e;

      public b(bjx<?> $$0, UUID $$1, @Nullable ui $$2) {
         this($$0, $$1, Optional.ofNullable($$2));
      }

      public b(bjx<?> $$0, UUID $$1, Optional<ui> $$2) {
         this.b = $$0;
         this.c = $$1;
         this.d = $$2;
      }

      public static DataResult<uo.b> a(ui $$0) {
         try {
            rt $$1 = so.a($$0.getString());
            ui $$2 = ui.a.a($$1.l("name"));
            bjx<?> $$3 = jy.h.a(new afw($$1.l("type")));
            UUID $$4 = UUID.fromString($$1.l("id"));
            return DataResult.success(new uo.b($$3, $$4, $$2));
         } catch (Exception var5) {
            return DataResult.error(() -> "Failed to parse tooltip: " + var5.getMessage());
         }
      }

      public List<ui> a() {
         if (this.e == null) {
            this.e = new ArrayList<>();
            this.d.ifPresent(this.e::add);
            this.e.add(ui.a("gui.entity_tooltip.type", this.b.h()));
            this.e.add(ui.b(this.c.toString()));
         }

         return this.e;
      }

      @Override
      public boolean equals(Object $$0) {
         if (this == $$0) {
            return true;
         } else if ($$0 != null && this.getClass() == $$0.getClass()) {
            uo.b $$1 = (uo.b)$$0;
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
      public static final Codec<uo.c> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(
                  jy.i.q().fieldOf("id").forGetter($$0x -> $$0x.c),
                  asg.a(Codec.INT, "count", Integer.valueOf(1)).forGetter($$0x -> $$0x.d),
                  asg.a(so.i, "tag").forGetter($$0x -> $$0x.e)
               )
               .apply($$0, uo.c::new)
      );
      public static final Codec<uo.c> b = Codec.either(jy.i.q(), a)
         .xmap($$0 -> (uo.c)$$0.map($$0x -> new uo.c($$0x, 1, Optional.empty()), $$0x -> $$0x), Either::right);
      private final cke c;
      private final int d;
      private final Optional<rt> e;
      @Nullable
      private ckj f;

      c(cke $$0, int $$1, @Nullable rt $$2) {
         this($$0, $$1, Optional.ofNullable($$2));
      }

      c(cke $$0, int $$1, Optional<rt> $$2) {
         this.c = $$0;
         this.d = $$1;
         this.e = $$2;
      }

      public c(ckj $$0) {
         this($$0.d(), $$0.L(), $$0.v() != null ? Optional.of($$0.v().h()) : Optional.empty());
      }

      @Override
      public boolean equals(Object $$0) {
         if (this == $$0) {
            return true;
         } else if ($$0 != null && this.getClass() == $$0.getClass()) {
            uo.c $$1 = (uo.c)$$0;
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

      public ckj a() {
         if (this.f == null) {
            this.f = new ckj(this.c, this.d);
            this.e.ifPresent(this.f::c);
         }

         return this.f;
      }

      private static DataResult<uo.c> a(ui $$0) {
         try {
            rt $$1 = so.a($$0.getString());
            return DataResult.success(new uo.c(ckj.a($$1)));
         } catch (CommandSyntaxException var2) {
            return DataResult.error(() -> "Failed to parse item tag: " + var2.getMessage());
         }
      }
   }

   static record d<T>(uo.a<T> c, T d) {
      public static final MapCodec<uo.d<?>> a = uo.a.e.dispatchMap("action", uo.d::a, $$0 -> $$0.h);
      public static final MapCodec<uo.d<?>> b = uo.a.e.dispatchMap("action", uo.d::a, $$0 -> $$0.i);

      public uo.a<T> a() {
         return this.c;
      }

      public T b() {
         return this.d;
      }
   }
}
