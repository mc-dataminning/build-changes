import com.google.gson.JsonElement;
import com.google.gson.JsonParser;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
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

public class xu {
   public static final Codec<xu> a = Codec.withAlternative(xu.e.a.codec(), xu.e.b.codec()).xmap(xu::new, $$0 -> $$0.b);
   private final xu.e<?> b;

   public <T> xu(xu.a<T> $$0, T $$1) {
      this(new xu.e<>($$0, $$1));
   }

   private xu(xu.e<?> $$0) {
      this.b = $$0;
   }

   public xu.a<?> a() {
      return this.b.c;
   }

   @Nullable
   public <T> T a(xu.a<T> $$0) {
      return this.b.c == $$0 ? $$0.a(this.b.d) : null;
   }

   @Override
   public boolean equals(Object $$0) {
      if (this == $$0) {
         return true;
      } else {
         return $$0 != null && this.getClass() == $$0.getClass() ? ((xu)$$0).b.equals(this.b) : false;
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

   public static class a<T> implements azs {
      public static final xu.a<xo> a = new xu.a<>("show_text", true, xq.a, ($$0, $$1) -> DataResult.success($$0));
      public static final xu.a<xu.c> b = new xu.a<>("show_item", true, xu.c.b, xu.c::a);
      public static final xu.a<xu.b> c = new xu.a<>("show_entity", true, xu.b.a, xu.b::a);
      public static final Codec<xu.a<?>> d = azs.b(() -> new xu.a[]{a, b, c});
      public static final Codec<xu.a<?>> e = d.validate(xu.a::a);
      private final String f;
      private final boolean g;
      final MapCodec<xu.e<T>> h;
      final MapCodec<xu.e<T>> i;

      public a(String $$0, boolean $$1, Codec<T> $$2, final xu.d<T> $$3) {
         this.f = $$0;
         this.g = $$1;
         this.h = $$2.xmap($$0x -> new xu.e<>(this, (T)$$0x), $$0x -> $$0x.d).fieldOf("contents");
         this.i = (new Codec<xu.e<T>>() {
            public <D> DataResult<Pair<xu.e<T>, D>> decode(DynamicOps<D> $$0, D $$1) {
               return xq.a.decode($$0, $$1).flatMap($$2 -> {
                  DataResult<T> $$4;
                  if ($$0 instanceof alc<D> $$3xx) {
                     $$4 = $$3.parse((xo)$$2.getFirst(), $$3xx);
                  } else {
                     $$4 = $$3.parse((xo)$$2.getFirst(), null);
                  }

                  return $$4.map($$1xx -> Pair.of(new xu.e<>(a.this, $$1xx), $$2.getSecond()));
               });
            }

            public <D> DataResult<D> a(xu.e<T> $$0, DynamicOps<D> $$1, D $$2) {
               return DataResult.error(() -> "Can't encode in legacy format");
            }
         }).fieldOf("value");
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

      private static DataResult<xu.a<?>> a(@Nullable xu.a<?> $$0) {
         if ($$0 == null) {
            return DataResult.error(() -> "Unknown action");
         } else {
            return !$$0.a() ? DataResult.error(() -> "Action not allowed: " + $$0) : DataResult.success($$0, Lifecycle.stable());
         }
      }
   }

   public static class b {
      public static final Codec<xu.b> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(
                  lp.g.q().fieldOf("type").forGetter($$0x -> $$0x.b),
                  kc.f.fieldOf("id").forGetter($$0x -> $$0x.c),
                  xq.a.lenientOptionalFieldOf("name").forGetter($$0x -> $$0x.d)
               )
               .apply($$0, xu.b::new)
      );
      public final bsy<?> b;
      public final UUID c;
      public final Optional<xo> d;
      @Nullable
      private List<xo> e;

      public b(bsy<?> $$0, UUID $$1, @Nullable xo $$2) {
         this($$0, $$1, Optional.ofNullable($$2));
      }

      public b(bsy<?> $$0, UUID $$1, Optional<xo> $$2) {
         this.b = $$0;
         this.c = $$1;
         this.d = $$2;
      }

      public static DataResult<xu.b> a(xo $$0, @Nullable alc<?> $$1) {
         try {
            ur $$2 = vp.a($$0.getString());
            DynamicOps<JsonElement> $$3 = (DynamicOps<JsonElement>)($$1 != null ? $$1.a(JsonOps.INSTANCE) : JsonOps.INSTANCE);
            DataResult<xo> $$4 = xq.a.parse($$3, JsonParser.parseString($$2.l("name")));
            bsy<?> $$5 = lp.g.a(new ale($$2.l("type")));
            UUID $$6 = UUID.fromString($$2.l("id"));
            return $$4.map($$2x -> new xu.b($$5, $$6, $$2x));
         } catch (Exception var7) {
            return DataResult.error(() -> "Failed to parse tooltip: " + var7.getMessage());
         }
      }

      public List<xo> a() {
         if (this.e == null) {
            this.e = new ArrayList<>();
            this.d.ifPresent(this.e::add);
            this.e.add(xo.a("gui.entity_tooltip.type", this.b.h()));
            this.e.add(xo.b(this.c.toString()));
         }

         return this.e;
      }

      @Override
      public boolean equals(Object $$0) {
         if (this == $$0) {
            return true;
         } else if ($$0 != null && this.getClass() == $$0.getClass()) {
            xu.b $$1 = (xu.b)$$0;
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
      public static final Codec<xu.c> a = cun.b.xmap(xu.c::new, xu.c::a);
      private static final Codec<xu.c> c = cun.g.xmap(xu.c::new, xu.c::a);
      public static final Codec<xu.c> b = Codec.withAlternative(a, c);
      private final ji<cui> d;
      private final int e;
      private final kj f;
      @Nullable
      private cun g;

      c(ji<cui> $$0, int $$1, kj $$2) {
         this.d = $$0;
         this.e = $$1;
         this.f = $$2;
      }

      public c(cun $$0) {
         this($$0.h(), $$0.I(), $$0.d());
      }

      @Override
      public boolean equals(Object $$0) {
         if (this == $$0) {
            return true;
         } else if ($$0 != null && this.getClass() == $$0.getClass()) {
            xu.c $$1 = (xu.c)$$0;
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

      public cun a() {
         if (this.g == null) {
            this.g = new cun(this.d, this.e, this.f);
         }

         return this.g;
      }

      private static DataResult<xu.c> a(xo $$0, @Nullable alc<?> $$1) {
         try {
            ur $$2 = vp.a($$0.getString());
            DynamicOps<vo> $$3 = (DynamicOps<vo>)($$1 != null ? $$1.a(vf.a) : vf.a);
            return cun.b.parse($$3, $$2).map(xu.c::new);
         } catch (CommandSyntaxException var4) {
            return DataResult.error(() -> "Failed to parse item tag: " + var4.getMessage());
         }
      }
   }

   public interface d<T> {
      DataResult<T> parse(xo var1, @Nullable alc<?> var2);
   }

   static record e<T>(xu.a<T> c, T d) {
      public static final MapCodec<xu.e<?>> a = xu.a.e.dispatchMap("action", xu.e::a, $$0 -> $$0.h);
      public static final MapCodec<xu.e<?>> b = xu.a.e.dispatchMap("action", xu.e::a, $$0 -> $$0.i);

      public xu.a<T> a() {
         return this.c;
      }

      public T b() {
         return this.d;
      }
   }
}
