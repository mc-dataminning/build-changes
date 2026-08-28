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

public class xv {
   public static final Codec<xv> a = Codec.withAlternative(xv.e.a.codec(), xv.e.b.codec()).xmap(xv::new, $$0 -> $$0.b);
   private final xv.e<?> b;

   public <T> xv(xv.a<T> $$0, T $$1) {
      this(new xv.e<>($$0, $$1));
   }

   private xv(xv.e<?> $$0) {
      this.b = $$0;
   }

   public xv.a<?> a() {
      return this.b.c;
   }

   @Nullable
   public <T> T a(xv.a<T> $$0) {
      return this.b.c == $$0 ? $$0.a(this.b.d) : null;
   }

   @Override
   public boolean equals(Object $$0) {
      if (this == $$0) {
         return true;
      } else {
         return $$0 != null && this.getClass() == $$0.getClass() ? ((xv)$$0).b.equals(this.b) : false;
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

   public static class a<T> implements azu {
      public static final xv.a<xp> a = new xv.a<>("show_text", true, xr.a, ($$0, $$1) -> DataResult.success($$0));
      public static final xv.a<xv.c> b = new xv.a<>("show_item", true, xv.c.b, xv.c::a);
      public static final xv.a<xv.b> c = new xv.a<>("show_entity", true, xv.b.a, xv.b::a);
      public static final Codec<xv.a<?>> d = azu.b(() -> new xv.a[]{a, b, c});
      public static final Codec<xv.a<?>> e = d.validate(xv.a::a);
      private final String f;
      private final boolean g;
      final MapCodec<xv.e<T>> h;
      final MapCodec<xv.e<T>> i;

      public a(String $$0, boolean $$1, Codec<T> $$2, final xv.d<T> $$3) {
         this.f = $$0;
         this.g = $$1;
         this.h = $$2.xmap($$0x -> new xv.e<>(this, (T)$$0x), $$0x -> $$0x.d).fieldOf("contents");
         this.i = (new Codec<xv.e<T>>() {
            public <D> DataResult<Pair<xv.e<T>, D>> decode(DynamicOps<D> $$0, D $$1) {
               return xr.a.decode($$0, $$1).flatMap($$2 -> {
                  DataResult<T> $$4;
                  if ($$0 instanceof ald<D> $$3xx) {
                     $$4 = $$3.parse((xp)$$2.getFirst(), $$3xx);
                  } else {
                     $$4 = $$3.parse((xp)$$2.getFirst(), null);
                  }

                  return $$4.map($$1xx -> Pair.of(new xv.e<>(a.this, $$1xx), $$2.getSecond()));
               });
            }

            public <D> DataResult<D> a(xv.e<T> $$0, DynamicOps<D> $$1, D $$2) {
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

      private static DataResult<xv.a<?>> a(@Nullable xv.a<?> $$0) {
         if ($$0 == null) {
            return DataResult.error(() -> "Unknown action");
         } else {
            return !$$0.a() ? DataResult.error(() -> "Action not allowed: " + $$0) : DataResult.success($$0, Lifecycle.stable());
         }
      }
   }

   public static class b {
      public static final Codec<xv.b> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(
                  lp.g.q().fieldOf("type").forGetter($$0x -> $$0x.b),
                  kc.f.fieldOf("id").forGetter($$0x -> $$0x.c),
                  xr.a.lenientOptionalFieldOf("name").forGetter($$0x -> $$0x.d)
               )
               .apply($$0, xv.b::new)
      );
      public final bta<?> b;
      public final UUID c;
      public final Optional<xp> d;
      @Nullable
      private List<xp> e;

      public b(bta<?> $$0, UUID $$1, @Nullable xp $$2) {
         this($$0, $$1, Optional.ofNullable($$2));
      }

      public b(bta<?> $$0, UUID $$1, Optional<xp> $$2) {
         this.b = $$0;
         this.c = $$1;
         this.d = $$2;
      }

      public static DataResult<xv.b> a(xp $$0, @Nullable ald<?> $$1) {
         try {
            us $$2 = vq.a($$0.getString());
            DynamicOps<JsonElement> $$3 = (DynamicOps<JsonElement>)($$1 != null ? $$1.a(JsonOps.INSTANCE) : JsonOps.INSTANCE);
            DataResult<xp> $$4 = xr.a.parse($$3, JsonParser.parseString($$2.l("name")));
            bta<?> $$5 = lp.g.a(new alf($$2.l("type")));
            UUID $$6 = UUID.fromString($$2.l("id"));
            return $$4.map($$2x -> new xv.b($$5, $$6, $$2x));
         } catch (Exception var7) {
            return DataResult.error(() -> "Failed to parse tooltip: " + var7.getMessage());
         }
      }

      public List<xp> a() {
         if (this.e == null) {
            this.e = new ArrayList<>();
            this.d.ifPresent(this.e::add);
            this.e.add(xp.a("gui.entity_tooltip.type", this.b.h()));
            this.e.add(xp.b(this.c.toString()));
         }

         return this.e;
      }

      @Override
      public boolean equals(Object $$0) {
         if (this == $$0) {
            return true;
         } else if ($$0 != null && this.getClass() == $$0.getClass()) {
            xv.b $$1 = (xv.b)$$0;
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
      public static final Codec<xv.c> a = cup.b.xmap(xv.c::new, xv.c::a);
      private static final Codec<xv.c> c = cup.g.xmap(xv.c::new, xv.c::a);
      public static final Codec<xv.c> b = Codec.withAlternative(a, c);
      private final ji<cuk> d;
      private final int e;
      private final kj f;
      @Nullable
      private cup g;

      c(ji<cuk> $$0, int $$1, kj $$2) {
         this.d = $$0;
         this.e = $$1;
         this.f = $$2;
      }

      public c(cup $$0) {
         this($$0.h(), $$0.I(), $$0.d());
      }

      @Override
      public boolean equals(Object $$0) {
         if (this == $$0) {
            return true;
         } else if ($$0 != null && this.getClass() == $$0.getClass()) {
            xv.c $$1 = (xv.c)$$0;
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

      public cup a() {
         if (this.g == null) {
            this.g = new cup(this.d, this.e, this.f);
         }

         return this.g;
      }

      private static DataResult<xv.c> a(xp $$0, @Nullable ald<?> $$1) {
         try {
            us $$2 = vq.a($$0.getString());
            DynamicOps<vp> $$3 = (DynamicOps<vp>)($$1 != null ? $$1.a(vg.a) : vg.a);
            return cup.b.parse($$3, $$2).map(xv.c::new);
         } catch (CommandSyntaxException var4) {
            return DataResult.error(() -> "Failed to parse item tag: " + var4.getMessage());
         }
      }
   }

   public interface d<T> {
      DataResult<T> parse(xp var1, @Nullable ald<?> var2);
   }

   static record e<T>(xv.a<T> c, T d) {
      public static final MapCodec<xv.e<?>> a = xv.a.e.dispatchMap("action", xv.e::a, $$0 -> $$0.h);
      public static final MapCodec<xv.e<?>> b = xv.a.e.dispatchMap("action", xv.e::a, $$0 -> $$0.i);

      public xv.a<T> a() {
         return this.c;
      }

      public T b() {
         return this.d;
      }
   }
}
