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

public class xk {
   public static final Codec<xk> a = Codec.either(xk.e.a.codec(), xk.e.b.codec())
      .xmap($$0 -> new xk((xk.e<?>)$$0.map($$0x -> $$0x, $$0x -> $$0x)), $$0 -> Either.left($$0.b));
   private final xk.e<?> b;

   public <T> xk(xk.a<T> $$0, T $$1) {
      this(new xk.e<>($$0, $$1));
   }

   private xk(xk.e<?> $$0) {
      this.b = $$0;
   }

   public xk.a<?> a() {
      return this.b.c;
   }

   @Nullable
   public <T> T a(xk.a<T> $$0) {
      return this.b.c == $$0 ? $$0.a(this.b.d) : null;
   }

   @Override
   public boolean equals(Object $$0) {
      if (this == $$0) {
         return true;
      } else {
         return $$0 != null && this.getClass() == $$0.getClass() ? ((xk)$$0).b.equals(this.b) : false;
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

   public static class a<T> implements azg {
      public static final xk.a<xe> a = new xk.a<>("show_text", true, xg.a, ($$0, $$1) -> DataResult.success($$0));
      public static final xk.a<xk.c> b = new xk.a<>("show_item", true, xk.c.b, xk.c::a);
      public static final xk.a<xk.b> c = new xk.a<>("show_entity", true, xk.b.a, xk.b::a);
      public static final Codec<xk.a<?>> d = azg.b(() -> new xk.a[]{a, b, c});
      public static final Codec<xk.a<?>> e = axu.b(d, xk.a::a);
      private final String f;
      private final boolean g;
      final Codec<xk.e<T>> h;
      final Codec<xk.e<T>> i;

      public a(String $$0, boolean $$1, Codec<T> $$2, final xk.d<T> $$3) {
         this.f = $$0;
         this.g = $$1;
         this.h = $$2.xmap($$0x -> new xk.e<>(this, (T)$$0x), $$0x -> $$0x.d).fieldOf("contents").codec();
         this.i = new Codec<xk.e<T>>() {
            public <D> DataResult<Pair<xk.e<T>, D>> decode(DynamicOps<D> $$0, D $$1) {
               return xg.a.decode($$0, $$1).flatMap($$2 -> {
                  DataResult<T> $$4;
                  if ($$0 instanceof akr<D> $$3xx) {
                     $$4 = $$3.parse((xe)$$2.getFirst(), $$3xx);
                  } else {
                     $$4 = $$3.parse((xe)$$2.getFirst(), null);
                  }

                  return $$4.map($$1xx -> Pair.of(new xk.e<>(a.this, $$1xx), $$2.getSecond()));
               });
            }

            public <D> DataResult<D> a(xk.e<T> $$0, DynamicOps<D> $$1, D $$2) {
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

      private static DataResult<xk.a<?>> a(@Nullable xk.a<?> $$0) {
         if ($$0 == null) {
            return DataResult.error(() -> "Unknown action");
         } else {
            return !$$0.a() ? DataResult.error(() -> "Action not allowed: " + $$0) : DataResult.success($$0, Lifecycle.stable());
         }
      }
   }

   public static class b {
      public static final Codec<xk.b> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(
                  lh.g.q().fieldOf("type").forGetter($$0x -> $$0x.b),
                  ju.f.fieldOf("id").forGetter($$0x -> $$0x.c),
                  axu.a(xg.a, "name").forGetter($$0x -> $$0x.d)
               )
               .apply($$0, xk.b::new)
      );
      public final bsb<?> b;
      public final UUID c;
      public final Optional<xe> d;
      @Nullable
      private List<xe> e;

      public b(bsb<?> $$0, UUID $$1, @Nullable xe $$2) {
         this($$0, $$1, Optional.ofNullable($$2));
      }

      public b(bsb<?> $$0, UUID $$1, Optional<xe> $$2) {
         this.b = $$0;
         this.c = $$1;
         this.d = $$2;
      }

      public static DataResult<xk.b> a(xe $$0, @Nullable akr<?> $$1) {
         try {
            uk $$2 = vi.a($$0.getString());
            DynamicOps<JsonElement> $$3 = (DynamicOps<JsonElement>)($$1 != null ? $$1.a(JsonOps.INSTANCE) : JsonOps.INSTANCE);
            DataResult<xe> $$4 = xg.a.parse($$3, JsonParser.parseString($$2.l("name")));
            bsb<?> $$5 = lh.g.a(new akt($$2.l("type")));
            UUID $$6 = UUID.fromString($$2.l("id"));
            return $$4.map($$2x -> new xk.b($$5, $$6, $$2x));
         } catch (Exception var7) {
            return DataResult.error(() -> "Failed to parse tooltip: " + var7.getMessage());
         }
      }

      public List<xe> a() {
         if (this.e == null) {
            this.e = new ArrayList<>();
            this.d.ifPresent(this.e::add);
            this.e.add(xe.a("gui.entity_tooltip.type", this.b.h()));
            this.e.add(xe.b(this.c.toString()));
         }

         return this.e;
      }

      @Override
      public boolean equals(Object $$0) {
         if (this == $$0) {
            return true;
         } else if ($$0 != null && this.getClass() == $$0.getClass()) {
            xk.b $$1 = (xk.b)$$0;
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
      public static final Codec<xk.c> a = cuh.a.xmap(xk.c::new, xk.c::a);
      private static final Codec<xk.c> c = cuh.d.xmap(xk.c::new, xk.c::a);
      public static final Codec<xk.c> b = axu.e(a, c);
      private final ja<cuc> d;
      private final int e;
      private final kb f;
      @Nullable
      private cuh g;

      c(ja<cuc> $$0, int $$1, kb $$2) {
         this.d = $$0;
         this.e = $$1;
         this.f = $$2;
      }

      public c(cuh $$0) {
         this($$0.g(), $$0.G(), $$0.c());
      }

      @Override
      public boolean equals(Object $$0) {
         if (this == $$0) {
            return true;
         } else if ($$0 != null && this.getClass() == $$0.getClass()) {
            xk.c $$1 = (xk.c)$$0;
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

      public cuh a() {
         if (this.g == null) {
            this.g = new cuh(this.d, this.e, this.f);
         }

         return this.g;
      }

      private static DataResult<xk.c> a(xe $$0, @Nullable akr<?> $$1) {
         try {
            uk $$2 = vi.a($$0.getString());
            DynamicOps<vh> $$3 = (DynamicOps<vh>)($$1 != null ? $$1.a(uy.a) : uy.a);
            return cuh.a.parse($$3, $$2).map(xk.c::new);
         } catch (CommandSyntaxException var4) {
            return DataResult.error(() -> "Failed to parse item tag: " + var4.getMessage());
         }
      }
   }

   public interface d<T> {
      DataResult<T> parse(xe var1, @Nullable akr<?> var2);
   }

   static record e<T>(xk.a<T> c, T d) {
      public static final MapCodec<xk.e<?>> a = xk.a.e.dispatchMap("action", xk.e::a, $$0 -> $$0.h);
      public static final MapCodec<xk.e<?>> b = xk.a.e.dispatchMap("action", xk.e::a, $$0 -> $$0.i);

      public xk.a<T> a() {
         return this.c;
      }

      public T b() {
         return this.d;
      }
   }
}
