import com.google.gson.JsonElement;
import com.google.gson.JsonParser;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.datafixers.util.Either;
import com.mojang.datafixers.util.Pair;
import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.DynamicOps;
import com.mojang.serialization.JsonOps;
import com.mojang.serialization.Lifecycle;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.UUID;
import javax.annotation.Nullable;

public class wy {
   public static final Codec<wy> a = Codec.either(wy.e.a.codec(), wy.e.b.codec())
      .xmap($$0 -> new wy((wy.e<?>)$$0.map($$0x -> $$0x, $$0x -> $$0x)), $$0 -> Either.left($$0.b));
   private final wy.e<?> b;

   public <T> wy(wy.a<T> $$0, T $$1) {
      this(new wy.e<>($$0, $$1));
   }

   private wy(wy.e<?> $$0) {
      this.b = $$0;
   }

   public wy.a<?> a() {
      return this.b.c;
   }

   @Nullable
   public <T> T a(wy.a<T> $$0) {
      return this.b.c == $$0 ? $$0.a(this.b.d) : null;
   }

   @Override
   public boolean equals(Object $$0) {
      if (this == $$0) {
         return true;
      } else {
         return $$0 != null && this.getClass() == $$0.getClass() ? ((wy)$$0).b.equals(this.b) : false;
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

   public static class a<T> implements ayq {
      public static final wy.a<ws> a = new wy.a<>("show_text", true, wu.a, ($$0, $$1) -> DataResult.success($$0));
      public static final wy.a<wy.c> b = new wy.a<>("show_item", true, wy.c.b, wy.c::a);
      public static final wy.a<wy.b> c = new wy.a<>("show_entity", true, wy.b.a, wy.b::a);
      public static final Codec<wy.a<?>> d = ayq.b(() -> new wy.a[]{a, b, c});
      public static final Codec<wy.a<?>> e = axe.b(d, wy.a::a);
      private final String f;
      private final boolean g;
      final Codec<wy.e<T>> h;
      final Codec<wy.e<T>> i;

      public a(String $$0, boolean $$1, Codec<T> $$2, final wy.d<T> $$3) {
         this.f = $$0;
         this.g = $$1;
         this.h = $$2.xmap($$0x -> new wy.e<>(this, (T)$$0x), $$0x -> $$0x.d).fieldOf("contents").codec();
         this.i = new Codec<wy.e<T>>() {
            public <D> DataResult<Pair<wy.e<T>, D>> decode(DynamicOps<D> $$0, D $$1) {
               return wu.a.decode($$0, $$1).flatMap($$2 -> {
                  DataResult<T> $$4;
                  if ($$0 instanceof akd<D> $$3xx) {
                     $$4 = $$3.parse((ws)$$2.getFirst(), $$3xx);
                  } else {
                     $$4 = $$3.parse((ws)$$2.getFirst(), null);
                  }

                  return $$4.map($$1xx -> Pair.of(new wy.e<>(a.this, $$1xx), $$2.getSecond()));
               });
            }

            public <D> DataResult<D> a(wy.e<T> $$0, DynamicOps<D> $$1, D $$2) {
               return DataResult.error(() -> "Can't encode in legacy format");
            }
         };
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

      private static DataResult<wy.a<?>> a(@Nullable wy.a<?> $$0) {
         if ($$0 == null) {
            return DataResult.error(() -> "Unknown action");
         } else {
            return !$$0.a() ? DataResult.error(() -> "Action not allowed: " + $$0) : DataResult.success($$0, Lifecycle.stable());
         }
      }
   }

   public static class b {
      public static final Codec<wy.b> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(
                  lc.g.q().fieldOf("type").forGetter($$0x -> $$0x.b),
                  jp.f.fieldOf("id").forGetter($$0x -> $$0x.c),
                  axe.a(wu.a, "name").forGetter($$0x -> $$0x.d)
               )
               .apply($$0, wy.b::new)
      );
      public final bqr<?> b;
      public final UUID c;
      public final Optional<ws> d;
      @Nullable
      private List<ws> e;

      public b(bqr<?> $$0, UUID $$1, @Nullable ws $$2) {
         this($$0, $$1, Optional.ofNullable($$2));
      }

      public b(bqr<?> $$0, UUID $$1, Optional<ws> $$2) {
         this.b = $$0;
         this.c = $$1;
         this.d = $$2;
      }

      public static DataResult<wy.b> a(ws $$0, @Nullable akd<?> $$1) {
         try {
            ty $$2 = uw.a($$0.getString());
            DynamicOps<JsonElement> $$3 = (DynamicOps<JsonElement>)($$1 != null ? $$1.a(JsonOps.INSTANCE) : JsonOps.INSTANCE);
            DataResult<ws> $$4 = wu.a.parse($$3, JsonParser.parseString($$2.l("name")));
            bqr<?> $$5 = lc.g.a(new akf($$2.l("type")));
            UUID $$6 = UUID.fromString($$2.l("id"));
            return $$4.map($$2x -> new wy.b($$5, $$6, $$2x));
         } catch (Exception var7) {
            return DataResult.error(() -> "Failed to parse tooltip: " + var7.getMessage());
         }
      }

      public List<ws> a() {
         if (this.e == null) {
            this.e = new ArrayList<>();
            this.d.ifPresent(this.e::add);
            this.e.add(ws.a("gui.entity_tooltip.type", this.b.h()));
            this.e.add(ws.b(this.c.toString()));
         }

         return this.e;
      }

      @Override
      public boolean equals(Object $$0) {
         if (this == $$0) {
            return true;
         } else if ($$0 != null && this.getClass() == $$0.getClass()) {
            wy.b $$1 = (wy.b)$$0;
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
      public static final Codec<wy.c> a = csd.a.xmap(wy.c::new, wy.c::a);
      private static final Codec<wy.c> c = csd.d.xmap(wy.c::new, wy.c::a);
      public static final Codec<wy.c> b = axe.e(a, c);
      private final iv<cry> d;
      private final int e;
      private final jw f;
      @Nullable
      private csd g;

      c(iv<cry> $$0, int $$1, jw $$2) {
         this.d = $$0;
         this.e = $$1;
         this.f = $$2;
      }

      public c(csd $$0) {
         this($$0.g(), $$0.G(), $$0.c());
      }

      @Override
      public boolean equals(Object $$0) {
         if (this == $$0) {
            return true;
         } else if ($$0 != null && this.getClass() == $$0.getClass()) {
            wy.c $$1 = (wy.c)$$0;
            return this.e == $$1.e && this.d.equals($$1.d) && this.f.equals($$1.f);
         } else {
            return false;
         }
      }

      @Override
      public int hashCode() {
         int $$0 = this.d.hashCode();
         $$0 = 31 * $$0 + this.e;
         return 31 * $$0 + this.f.hashCode();
      }

      public csd a() {
         if (this.g == null) {
            this.g = new csd(this.d, this.e, this.f);
         }

         return this.g;
      }

      private static DataResult<wy.c> a(ws $$0, @Nullable akd<?> $$1) {
         try {
            ty $$2 = uw.a($$0.getString());
            DynamicOps<uv> $$3 = (DynamicOps<uv>)($$1 != null ? $$1.a(um.a) : um.a);
            return csd.a.parse($$3, $$2).map(wy.c::new);
         } catch (CommandSyntaxException var4) {
            return DataResult.error(() -> "Failed to parse item tag: " + var4.getMessage());
         }
      }
   }

   public interface d<T> {
      DataResult<T> parse(ws var1, @Nullable akd<?> var2);
   }

   static record e<T>(wy.a<T> c, T d) {
      public static final MapCodec<wy.e<?>> a = wy.a.e.dispatchMap("action", wy.e::a, $$0 -> $$0.h);
      public static final MapCodec<wy.e<?>> b = wy.a.e.dispatchMap("action", wy.e::a, $$0 -> $$0.i);

      public wy.a<T> a() {
         return this.c;
      }

      public T b() {
         return this.d;
      }
   }
}
