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

public class xp {
   public static final Codec<xp> a = Codec.withAlternative(xp.e.a.codec(), xp.e.b.codec()).xmap(xp::new, $$0 -> $$0.b);
   private final xp.e<?> b;

   public <T> xp(xp.a<T> $$0, T $$1) {
      this(new xp.e<>($$0, $$1));
   }

   private xp(xp.e<?> $$0) {
      this.b = $$0;
   }

   public xp.a<?> a() {
      return this.b.c;
   }

   @Nullable
   public <T> T a(xp.a<T> $$0) {
      return this.b.c == $$0 ? $$0.a(this.b.d) : null;
   }

   @Override
   public boolean equals(Object $$0) {
      if (this == $$0) {
         return true;
      } else {
         return $$0 != null && this.getClass() == $$0.getClass() ? ((xp)$$0).b.equals(this.b) : false;
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

   public static class a<T> implements bai {
      public static final xp.a<xj> a = new xp.a<>("show_text", true, xl.a, ($$0, $$1) -> DataResult.success($$0));
      public static final xp.a<xp.c> b = new xp.a<>("show_item", true, xp.c.b, xp.c::a);
      public static final xp.a<xp.b> c = new xp.a<>("show_entity", true, xp.b.a, xp.b::a);
      public static final Codec<xp.a<?>> d = bai.b(() -> new xp.a[]{a, b, c});
      public static final Codec<xp.a<?>> e = d.validate(xp.a::a);
      private final String f;
      private final boolean g;
      final MapCodec<xp.e<T>> h;
      final MapCodec<xp.e<T>> i;

      public a(String $$0, boolean $$1, Codec<T> $$2, final xp.d<T> $$3) {
         this.f = $$0;
         this.g = $$1;
         this.h = $$2.xmap($$0x -> new xp.e<>(this, (T)$$0x), $$0x -> $$0x.d).fieldOf("contents");
         this.i = (new Codec<xp.e<T>>() {
            public <D> DataResult<Pair<xp.e<T>, D>> decode(DynamicOps<D> $$0, D $$1) {
               return xl.a.decode($$0, $$1).flatMap($$2 -> {
                  DataResult<T> $$4;
                  if ($$0 instanceof alh<D> $$3xx) {
                     $$4 = $$3.parse((xj)$$2.getFirst(), $$3xx);
                  } else {
                     $$4 = $$3.parse((xj)$$2.getFirst(), null);
                  }

                  return $$4.map($$1xx -> Pair.of(new xp.e<>(a.this, $$1xx), $$2.getSecond()));
               });
            }

            public <D> DataResult<D> a(xp.e<T> $$0, DynamicOps<D> $$1, D $$2) {
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

      private static DataResult<xp.a<?>> a(@Nullable xp.a<?> $$0) {
         if ($$0 == null) {
            return DataResult.error(() -> "Unknown action");
         } else {
            return !$$0.a() ? DataResult.error(() -> "Action not allowed: " + $$0) : DataResult.success($$0, Lifecycle.stable());
         }
      }
   }

   public static class b {
      public static final Codec<xp.b> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(
                  lz.f.q().fieldOf("type").forGetter($$0x -> $$0x.b),
                  kk.f.fieldOf("id").forGetter($$0x -> $$0x.c),
                  xl.a.lenientOptionalFieldOf("name").forGetter($$0x -> $$0x.d)
               )
               .apply($$0, xp.b::new)
      );
      public final bus<?> b;
      public final UUID c;
      public final Optional<xj> d;
      @Nullable
      private List<xj> e;

      public b(bus<?> $$0, UUID $$1, @Nullable xj $$2) {
         this($$0, $$1, Optional.ofNullable($$2));
      }

      public b(bus<?> $$0, UUID $$1, Optional<xj> $$2) {
         this.b = $$0;
         this.c = $$1;
         this.d = $$2;
      }

      public static DataResult<xp.b> a(xj $$0, @Nullable alh<?> $$1) {
         try {
            ul $$2 = vj.a($$0.getString());
            DynamicOps<JsonElement> $$3 = (DynamicOps<JsonElement>)($$1 != null ? $$1.a(JsonOps.INSTANCE) : JsonOps.INSTANCE);
            DataResult<xj> $$4 = xl.a.parse($$3, JsonParser.parseString($$2.l("name")));
            bus<?> $$5 = lz.f.a(alj.a($$2.l("type")));
            UUID $$6 = UUID.fromString($$2.l("id"));
            return $$4.map($$2x -> new xp.b($$5, $$6, $$2x));
         } catch (Exception var7) {
            return DataResult.error(() -> "Failed to parse tooltip: " + var7.getMessage());
         }
      }

      public List<xj> a() {
         if (this.e == null) {
            this.e = new ArrayList<>();
            this.d.ifPresent(this.e::add);
            this.e.add(xj.a("gui.entity_tooltip.type", this.b.h()));
            this.e.add(xj.b(this.c.toString()));
         }

         return this.e;
      }

      @Override
      public boolean equals(Object $$0) {
         if (this == $$0) {
            return true;
         } else if ($$0 != null && this.getClass() == $$0.getClass()) {
            xp.b $$1 = (xp.b)$$0;
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
      public static final Codec<xp.c> a = cwm.b.xmap(xp.c::new, xp.c::a);
      private static final Codec<xp.c> c = cwm.g.xmap(xp.c::new, xp.c::a);
      public static final Codec<xp.c> b = Codec.withAlternative(a, c);
      private final jq<cwi> d;
      private final int e;
      private final kr f;
      @Nullable
      private cwm g;

      c(jq<cwi> $$0, int $$1, kr $$2) {
         this.d = $$0;
         this.e = $$1;
         this.f = $$2;
      }

      public c(cwm $$0) {
         this($$0.i(), $$0.L(), $$0.e());
      }

      @Override
      public boolean equals(Object $$0) {
         if (this == $$0) {
            return true;
         } else if ($$0 != null && this.getClass() == $$0.getClass()) {
            xp.c $$1 = (xp.c)$$0;
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

      public cwm a() {
         if (this.g == null) {
            this.g = new cwm(this.d, this.e, this.f);
         }

         return this.g;
      }

      private static DataResult<xp.c> a(xj $$0, @Nullable alh<?> $$1) {
         try {
            ul $$2 = vj.a($$0.getString());
            DynamicOps<vi> $$3 = (DynamicOps<vi>)($$1 != null ? $$1.a(uz.a) : uz.a);
            return cwm.b.parse($$3, $$2).map(xp.c::new);
         } catch (CommandSyntaxException var4) {
            return DataResult.error(() -> "Failed to parse item tag: " + var4.getMessage());
         }
      }
   }

   public interface d<T> {
      DataResult<T> parse(xj var1, @Nullable alh<?> var2);
   }

   static record e<T>(xp.a<T> c, T d) {
      public static final MapCodec<xp.e<?>> a = xp.a.e.dispatchMap("action", xp.e::a, $$0 -> $$0.h);
      public static final MapCodec<xp.e<?>> b = xp.a.e.dispatchMap("action", xp.e::a, $$0 -> $$0.i);

      public xp.a<T> a() {
         return this.c;
      }

      public T b() {
         return this.d;
      }
   }
}
