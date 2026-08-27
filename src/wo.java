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

public class wo {
   public static final Codec<wo> a = Codec.either(wo.e.a.codec(), wo.e.b.codec())
      .xmap($$0 -> new wo((wo.e<?>)$$0.map($$0x -> $$0x, $$0x -> $$0x)), $$0 -> Either.left($$0.b));
   private final wo.e<?> b;

   public <T> wo(wo.a<T> $$0, T $$1) {
      this(new wo.e<>($$0, $$1));
   }

   private wo(wo.e<?> $$0) {
      this.b = $$0;
   }

   public wo.a<?> a() {
      return this.b.c;
   }

   @Nullable
   public <T> T a(wo.a<T> $$0) {
      return this.b.c == $$0 ? $$0.a(this.b.d) : null;
   }

   @Override
   public boolean equals(Object $$0) {
      if (this == $$0) {
         return true;
      } else {
         return $$0 != null && this.getClass() == $$0.getClass() ? ((wo)$$0).b.equals(this.b) : false;
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

   public static class a<T> implements ayg {
      public static final wo.a<wi> a = new wo.a<>("show_text", true, wk.a, ($$0, $$1) -> DataResult.success($$0));
      public static final wo.a<wo.c> b = new wo.a<>("show_item", true, wo.c.b, wo.c::a);
      public static final wo.a<wo.b> c = new wo.a<>("show_entity", true, wo.b.a, wo.b::a);
      public static final Codec<wo.a<?>> d = ayg.b(() -> new wo.a[]{a, b, c});
      public static final Codec<wo.a<?>> e = awu.b(d, wo.a::a);
      private final String f;
      private final boolean g;
      final Codec<wo.e<T>> h;
      final Codec<wo.e<T>> i;

      public a(String $$0, boolean $$1, Codec<T> $$2, final wo.d<T> $$3) {
         this.f = $$0;
         this.g = $$1;
         this.h = $$2.xmap($$0x -> new wo.e<>(this, (T)$$0x), $$0x -> $$0x.d).fieldOf("contents").codec();
         this.i = new Codec<wo.e<T>>() {
            public <D> DataResult<Pair<wo.e<T>, D>> decode(DynamicOps<D> $$0, D $$1) {
               return wk.a.decode($$0, $$1).flatMap($$2 -> {
                  DataResult<T> $$4;
                  if ($$0 instanceof ajt<D> $$3xx) {
                     $$4 = $$3.parse((wi)$$2.getFirst(), $$3xx);
                  } else {
                     $$4 = $$3.parse((wi)$$2.getFirst(), null);
                  }

                  return $$4.map($$1xx -> Pair.of(new wo.e<>(a.this, $$1xx), $$2.getSecond()));
               });
            }

            public <D> DataResult<D> a(wo.e<T> $$0, DynamicOps<D> $$1, D $$2) {
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

      private static DataResult<wo.a<?>> a(@Nullable wo.a<?> $$0) {
         if ($$0 == null) {
            return DataResult.error(() -> "Unknown action");
         } else {
            return !$$0.a() ? DataResult.error(() -> "Action not allowed: " + $$0) : DataResult.success($$0, Lifecycle.stable());
         }
      }
   }

   public static class b {
      public static final Codec<wo.b> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(
                  kt.g.q().fieldOf("type").forGetter($$0x -> $$0x.b),
                  jh.f.fieldOf("id").forGetter($$0x -> $$0x.c),
                  awu.a(wk.a, "name").forGetter($$0x -> $$0x.d)
               )
               .apply($$0, wo.b::new)
      );
      public final bqg<?> b;
      public final UUID c;
      public final Optional<wi> d;
      @Nullable
      private List<wi> e;

      public b(bqg<?> $$0, UUID $$1, @Nullable wi $$2) {
         this($$0, $$1, Optional.ofNullable($$2));
      }

      public b(bqg<?> $$0, UUID $$1, Optional<wi> $$2) {
         this.b = $$0;
         this.c = $$1;
         this.d = $$2;
      }

      public static DataResult<wo.b> a(wi $$0, @Nullable ajt<?> $$1) {
         try {
            to $$2 = um.a($$0.getString());
            DynamicOps<JsonElement> $$3 = (DynamicOps<JsonElement>)($$1 != null ? $$1.a(JsonOps.INSTANCE) : JsonOps.INSTANCE);
            DataResult<wi> $$4 = wk.a.parse($$3, JsonParser.parseString($$2.l("name")));
            bqg<?> $$5 = kt.g.a(new ajv($$2.l("type")));
            UUID $$6 = UUID.fromString($$2.l("id"));
            return $$4.map($$2x -> new wo.b($$5, $$6, $$2x));
         } catch (Exception var7) {
            return DataResult.error(() -> "Failed to parse tooltip: " + var7.getMessage());
         }
      }

      public List<wi> a() {
         if (this.e == null) {
            this.e = new ArrayList<>();
            this.d.ifPresent(this.e::add);
            this.e.add(wi.a("gui.entity_tooltip.type", this.b.h()));
            this.e.add(wi.b(this.c.toString()));
         }

         return this.e;
      }

      @Override
      public boolean equals(Object $$0) {
         if (this == $$0) {
            return true;
         } else if ($$0 != null && this.getClass() == $$0.getClass()) {
            wo.b $$1 = (wo.b)$$0;
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
      public static final Codec<wo.c> a = crs.a.xmap(wo.c::new, wo.c::a);
      private static final Codec<wo.c> c = crs.d.xmap(wo.c::new, wo.c::a);
      public static final Codec<wo.c> b = awu.e(a, c);
      private final in<crn> d;
      private final int e;
      private final jo f;
      @Nullable
      private crs g;

      c(in<crn> $$0, int $$1, jo $$2) {
         this.d = $$0;
         this.e = $$1;
         this.f = $$2;
      }

      public c(crs $$0) {
         this($$0.g(), $$0.G(), $$0.c());
      }

      @Override
      public boolean equals(Object $$0) {
         if (this == $$0) {
            return true;
         } else if ($$0 != null && this.getClass() == $$0.getClass()) {
            wo.c $$1 = (wo.c)$$0;
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

      public crs a() {
         if (this.g == null) {
            this.g = new crs(this.d, this.e, this.f);
         }

         return this.g;
      }

      private static DataResult<wo.c> a(wi $$0, @Nullable ajt<?> $$1) {
         try {
            to $$2 = um.a($$0.getString());
            DynamicOps<ul> $$3 = (DynamicOps<ul>)($$1 != null ? $$1.a(uc.a) : uc.a);
            return crs.a.parse($$3, $$2).map(wo.c::new);
         } catch (CommandSyntaxException var4) {
            return DataResult.error(() -> "Failed to parse item tag: " + var4.getMessage());
         }
      }
   }

   public interface d<T> {
      DataResult<T> parse(wi var1, @Nullable ajt<?> var2);
   }

   static record e<T>(wo.a<T> c, T d) {
      public static final MapCodec<wo.e<?>> a = wo.a.e.dispatchMap("action", wo.e::a, $$0 -> $$0.h);
      public static final MapCodec<wo.e<?>> b = wo.a.e.dispatchMap("action", wo.e::a, $$0 -> $$0.i);

      public wo.a<T> a() {
         return this.c;
      }

      public T b() {
         return this.d;
      }
   }
}
