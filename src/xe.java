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

public class xe {
   public static final Codec<xe> a = Codec.withAlternative(xe.e.a.codec(), xe.e.b.codec()).xmap(xe::new, $$0 -> $$0.b);
   private final xe.e<?> b;

   public <T> xe(xe.a<T> $$0, T $$1) {
      this(new xe.e<>($$0, $$1));
   }

   private xe(xe.e<?> $$0) {
      this.b = $$0;
   }

   public xe.a<?> a() {
      return this.b.c;
   }

   @Nullable
   public <T> T a(xe.a<T> $$0) {
      return this.b.c == $$0 ? $$0.a(this.b.d) : null;
   }

   @Override
   public boolean equals(Object $$0) {
      if (this == $$0) {
         return true;
      } else {
         return $$0 != null && this.getClass() == $$0.getClass() ? ((xe)$$0).b.equals(this.b) : false;
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

   public static class a<T> implements azj {
      public static final xe.a<wy> a = new xe.a<>("show_text", true, xa.a, ($$0, $$1) -> DataResult.success($$0));
      public static final xe.a<xe.c> b = new xe.a<>("show_item", true, xe.c.b, xe.c::a);
      public static final xe.a<xe.b> c = new xe.a<>("show_entity", true, xe.b.a, xe.b::a);
      public static final Codec<xe.a<?>> d = azj.b(() -> new xe.a[]{a, b, c});
      public static final Codec<xe.a<?>> e = d.validate(xe.a::a);
      private final String f;
      private final boolean g;
      final MapCodec<xe.e<T>> h;
      final MapCodec<xe.e<T>> i;

      public a(String $$0, boolean $$1, Codec<T> $$2, final xe.d<T> $$3) {
         this.f = $$0;
         this.g = $$1;
         this.h = $$2.xmap($$0x -> new xe.e<>(this, (T)$$0x), $$0x -> $$0x.d).fieldOf("contents");
         this.i = (new Codec<xe.e<T>>() {
            public <D> DataResult<Pair<xe.e<T>, D>> decode(DynamicOps<D> $$0, D $$1) {
               return xa.a.decode($$0, $$1).flatMap($$2 -> {
                  DataResult<T> $$4;
                  if ($$0 instanceof ako<D> $$3xx) {
                     $$4 = $$3.parse((wy)$$2.getFirst(), $$3xx);
                  } else {
                     $$4 = $$3.parse((wy)$$2.getFirst(), null);
                  }

                  return $$4.map($$1xx -> Pair.of(new xe.e<>(a.this, $$1xx), $$2.getSecond()));
               });
            }

            public <D> DataResult<D> a(xe.e<T> $$0, DynamicOps<D> $$1, D $$2) {
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

      private static DataResult<xe.a<?>> a(@Nullable xe.a<?> $$0) {
         if ($$0 == null) {
            return DataResult.error(() -> "Unknown action");
         } else {
            return !$$0.a() ? DataResult.error(() -> "Action not allowed: " + $$0) : DataResult.success($$0, Lifecycle.stable());
         }
      }
   }

   public static class b {
      public static final Codec<xe.b> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(
                  lt.f.r().fieldOf("type").forGetter($$0x -> $$0x.b),
                  kg.f.fieldOf("id").forGetter($$0x -> $$0x.c),
                  xa.a.lenientOptionalFieldOf("name").forGetter($$0x -> $$0x.d)
               )
               .apply($$0, xe.b::new)
      );
      public final bsw<?> b;
      public final UUID c;
      public final Optional<wy> d;
      @Nullable
      private List<wy> e;

      public b(bsw<?> $$0, UUID $$1, @Nullable wy $$2) {
         this($$0, $$1, Optional.ofNullable($$2));
      }

      public b(bsw<?> $$0, UUID $$1, Optional<wy> $$2) {
         this.b = $$0;
         this.c = $$1;
         this.d = $$2;
      }

      public static DataResult<xe.b> a(wy $$0, @Nullable ako<?> $$1) {
         try {
            ua $$2 = uy.a($$0.getString());
            DynamicOps<JsonElement> $$3 = (DynamicOps<JsonElement>)($$1 != null ? $$1.a(JsonOps.INSTANCE) : JsonOps.INSTANCE);
            DataResult<wy> $$4 = xa.a.parse($$3, JsonParser.parseString($$2.l("name")));
            bsw<?> $$5 = lt.f.a(akq.a($$2.l("type")));
            UUID $$6 = UUID.fromString($$2.l("id"));
            return $$4.map($$2x -> new xe.b($$5, $$6, $$2x));
         } catch (Exception var7) {
            return DataResult.error(() -> "Failed to parse tooltip: " + var7.getMessage());
         }
      }

      public List<wy> a() {
         if (this.e == null) {
            this.e = new ArrayList<>();
            this.d.ifPresent(this.e::add);
            this.e.add(wy.a("gui.entity_tooltip.type", this.b.h()));
            this.e.add(wy.b(this.c.toString()));
         }

         return this.e;
      }

      @Override
      public boolean equals(Object $$0) {
         if (this == $$0) {
            return true;
         } else if ($$0 != null && this.getClass() == $$0.getClass()) {
            xe.b $$1 = (xe.b)$$0;
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
      public static final Codec<xe.c> a = cuo.b.xmap(xe.c::new, xe.c::a);
      private static final Codec<xe.c> c = cuo.g.xmap(xe.c::new, xe.c::a);
      public static final Codec<xe.c> b = Codec.withAlternative(a, c);
      private final jm<cuj> d;
      private final int e;
      private final kn f;
      @Nullable
      private cuo g;

      c(jm<cuj> $$0, int $$1, kn $$2) {
         this.d = $$0;
         this.e = $$1;
         this.f = $$2;
      }

      public c(cuo $$0) {
         this($$0.h(), $$0.H(), $$0.d());
      }

      @Override
      public boolean equals(Object $$0) {
         if (this == $$0) {
            return true;
         } else if ($$0 != null && this.getClass() == $$0.getClass()) {
            xe.c $$1 = (xe.c)$$0;
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

      public cuo a() {
         if (this.g == null) {
            this.g = new cuo(this.d, this.e, this.f);
         }

         return this.g;
      }

      private static DataResult<xe.c> a(wy $$0, @Nullable ako<?> $$1) {
         try {
            ua $$2 = uy.a($$0.getString());
            DynamicOps<ux> $$3 = (DynamicOps<ux>)($$1 != null ? $$1.a(uo.a) : uo.a);
            return cuo.b.parse($$3, $$2).map(xe.c::new);
         } catch (CommandSyntaxException var4) {
            return DataResult.error(() -> "Failed to parse item tag: " + var4.getMessage());
         }
      }
   }

   public interface d<T> {
      DataResult<T> parse(wy var1, @Nullable ako<?> var2);
   }

   static record e<T>(xe.a<T> c, T d) {
      public static final MapCodec<xe.e<?>> a = xe.a.e.dispatchMap("action", xe.e::a, $$0 -> $$0.h);
      public static final MapCodec<xe.e<?>> b = xe.a.e.dispatchMap("action", xe.e::a, $$0 -> $$0.i);

      public xe.a<T> a() {
         return this.c;
      }

      public T b() {
         return this.d;
      }
   }
}
