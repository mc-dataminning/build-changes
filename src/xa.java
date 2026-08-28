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

public class xa {
   public static final Codec<xa> a = Codec.withAlternative(xa.e.a.codec(), xa.e.b.codec()).xmap(xa::new, $$0 -> $$0.b);
   private final xa.e<?> b;

   public <T> xa(xa.a<T> $$0, T $$1) {
      this(new xa.e<>($$0, $$1));
   }

   private xa(xa.e<?> $$0) {
      this.b = $$0;
   }

   public xa.a<?> a() {
      return this.b.c;
   }

   @Nullable
   public <T> T a(xa.a<T> $$0) {
      return this.b.c == $$0 ? $$0.a(this.b.d) : null;
   }

   @Override
   public boolean equals(Object $$0) {
      if (this == $$0) {
         return true;
      } else {
         return $$0 != null && this.getClass() == $$0.getClass() ? ((xa)$$0).b.equals(this.b) : false;
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

   public static class a<T> implements azc {
      public static final xa.a<wu> a = new xa.a<>("show_text", true, ww.a, ($$0, $$1) -> DataResult.success($$0));
      public static final xa.a<xa.c> b = new xa.a<>("show_item", true, xa.c.b, xa.c::a);
      public static final xa.a<xa.b> c = new xa.a<>("show_entity", true, xa.b.a, xa.b::a);
      public static final Codec<xa.a<?>> d = azc.b(() -> new xa.a[]{a, b, c});
      public static final Codec<xa.a<?>> e = d.validate(xa.a::a);
      private final String f;
      private final boolean g;
      final MapCodec<xa.e<T>> h;
      final MapCodec<xa.e<T>> i;

      public a(String $$0, boolean $$1, Codec<T> $$2, final xa.d<T> $$3) {
         this.f = $$0;
         this.g = $$1;
         this.h = $$2.xmap($$0x -> new xa.e<>(this, (T)$$0x), $$0x -> $$0x.d).fieldOf("contents");
         this.i = (new Codec<xa.e<T>>() {
            public <D> DataResult<Pair<xa.e<T>, D>> decode(DynamicOps<D> $$0, D $$1) {
               return ww.a.decode($$0, $$1).flatMap($$2 -> {
                  DataResult<T> $$4;
                  if ($$0 instanceof aki<D> $$3xx) {
                     $$4 = $$3.parse((wu)$$2.getFirst(), $$3xx);
                  } else {
                     $$4 = $$3.parse((wu)$$2.getFirst(), null);
                  }

                  return $$4.map($$1xx -> Pair.of(new xa.e<>(a.this, $$1xx), $$2.getSecond()));
               });
            }

            public <D> DataResult<D> a(xa.e<T> $$0, DynamicOps<D> $$1, D $$2) {
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

      private static DataResult<xa.a<?>> a(@Nullable xa.a<?> $$0) {
         if ($$0 == null) {
            return DataResult.error(() -> "Unknown action");
         } else {
            return !$$0.a() ? DataResult.error(() -> "Action not allowed: " + $$0) : DataResult.success($$0, Lifecycle.stable());
         }
      }
   }

   public static class b {
      public static final Codec<xa.b> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(
                  lq.f.r().fieldOf("type").forGetter($$0x -> $$0x.b),
                  kd.f.fieldOf("id").forGetter($$0x -> $$0x.c),
                  ww.a.lenientOptionalFieldOf("name").forGetter($$0x -> $$0x.d)
               )
               .apply($$0, xa.b::new)
      );
      public final bsm<?> b;
      public final UUID c;
      public final Optional<wu> d;
      @Nullable
      private List<wu> e;

      public b(bsm<?> $$0, UUID $$1, @Nullable wu $$2) {
         this($$0, $$1, Optional.ofNullable($$2));
      }

      public b(bsm<?> $$0, UUID $$1, Optional<wu> $$2) {
         this.b = $$0;
         this.c = $$1;
         this.d = $$2;
      }

      public static DataResult<xa.b> a(wu $$0, @Nullable aki<?> $$1) {
         try {
            tx $$2 = uv.a($$0.getString());
            DynamicOps<JsonElement> $$3 = (DynamicOps<JsonElement>)($$1 != null ? $$1.a(JsonOps.INSTANCE) : JsonOps.INSTANCE);
            DataResult<wu> $$4 = ww.a.parse($$3, JsonParser.parseString($$2.l("name")));
            bsm<?> $$5 = lq.f.a(new akk($$2.l("type")));
            UUID $$6 = UUID.fromString($$2.l("id"));
            return $$4.map($$2x -> new xa.b($$5, $$6, $$2x));
         } catch (Exception var7) {
            return DataResult.error(() -> "Failed to parse tooltip: " + var7.getMessage());
         }
      }

      public List<wu> a() {
         if (this.e == null) {
            this.e = new ArrayList<>();
            this.d.ifPresent(this.e::add);
            this.e.add(wu.a("gui.entity_tooltip.type", this.b.h()));
            this.e.add(wu.b(this.c.toString()));
         }

         return this.e;
      }

      @Override
      public boolean equals(Object $$0) {
         if (this == $$0) {
            return true;
         } else if ($$0 != null && this.getClass() == $$0.getClass()) {
            xa.b $$1 = (xa.b)$$0;
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
      public static final Codec<xa.c> a = cuc.b.xmap(xa.c::new, xa.c::a);
      private static final Codec<xa.c> c = cuc.g.xmap(xa.c::new, xa.c::a);
      public static final Codec<xa.c> b = Codec.withAlternative(a, c);
      private final jj<ctx> d;
      private final int e;
      private final kk f;
      @Nullable
      private cuc g;

      c(jj<ctx> $$0, int $$1, kk $$2) {
         this.d = $$0;
         this.e = $$1;
         this.f = $$2;
      }

      public c(cuc $$0) {
         this($$0.h(), $$0.H(), $$0.d());
      }

      @Override
      public boolean equals(Object $$0) {
         if (this == $$0) {
            return true;
         } else if ($$0 != null && this.getClass() == $$0.getClass()) {
            xa.c $$1 = (xa.c)$$0;
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

      public cuc a() {
         if (this.g == null) {
            this.g = new cuc(this.d, this.e, this.f);
         }

         return this.g;
      }

      private static DataResult<xa.c> a(wu $$0, @Nullable aki<?> $$1) {
         try {
            tx $$2 = uv.a($$0.getString());
            DynamicOps<uu> $$3 = (DynamicOps<uu>)($$1 != null ? $$1.a(ul.a) : ul.a);
            return cuc.b.parse($$3, $$2).map(xa.c::new);
         } catch (CommandSyntaxException var4) {
            return DataResult.error(() -> "Failed to parse item tag: " + var4.getMessage());
         }
      }
   }

   public interface d<T> {
      DataResult<T> parse(wu var1, @Nullable aki<?> var2);
   }

   static record e<T>(xa.a<T> c, T d) {
      public static final MapCodec<xa.e<?>> a = xa.a.e.dispatchMap("action", xa.e::a, $$0 -> $$0.h);
      public static final MapCodec<xa.e<?>> b = xa.a.e.dispatchMap("action", xa.e::a, $$0 -> $$0.i);

      public xa.a<T> a() {
         return this.c;
      }

      public T b() {
         return this.d;
      }
   }
}
