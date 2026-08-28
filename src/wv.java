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

public class wv {
   public static final Codec<wv> a = Codec.withAlternative(wv.e.a.codec(), wv.e.b.codec()).xmap(wv::new, $$0 -> $$0.b);
   private final wv.e<?> b;

   public <T> wv(wv.a<T> $$0, T $$1) {
      this(new wv.e<>($$0, $$1));
   }

   private wv(wv.e<?> $$0) {
      this.b = $$0;
   }

   public wv.a<?> a() {
      return this.b.c;
   }

   @Nullable
   public <T> T a(wv.a<T> $$0) {
      return this.b.c == $$0 ? $$0.a(this.b.d) : null;
   }

   @Override
   public boolean equals(Object $$0) {
      if (this == $$0) {
         return true;
      } else {
         return $$0 != null && this.getClass() == $$0.getClass() ? ((wv)$$0).b.equals(this.b) : false;
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

   public static class a<T> implements azv {
      public static final wv.a<wp> a = new wv.a<>("show_text", true, wr.a, ($$0, $$1) -> DataResult.success($$0));
      public static final wv.a<wv.c> b = new wv.a<>("show_item", true, wv.c.b, wv.c::a);
      public static final wv.a<wv.b> c = new wv.a<>("show_entity", true, wv.b.a, wv.b::a);
      public static final Codec<wv.a<?>> d = azv.b(() -> new wv.a[]{a, b, c});
      public static final Codec<wv.a<?>> e = d.validate(wv.a::a);
      private final String f;
      private final boolean g;
      final MapCodec<wv.e<T>> h;
      final MapCodec<wv.e<T>> i;

      public a(String $$0, boolean $$1, Codec<T> $$2, final wv.d<T> $$3) {
         this.f = $$0;
         this.g = $$1;
         this.h = $$2.xmap($$0x -> new wv.e<>(this, (T)$$0x), $$0x -> $$0x.d).fieldOf("contents");
         this.i = (new Codec<wv.e<T>>() {
            public <D> DataResult<Pair<wv.e<T>, D>> decode(DynamicOps<D> $$0, D $$1) {
               return wr.a.decode($$0, $$1).flatMap($$2 -> {
                  DataResult<T> $$4;
                  if ($$0 instanceof akt<D> $$3xx) {
                     $$4 = $$3.parse((wp)$$2.getFirst(), $$3xx);
                  } else {
                     $$4 = $$3.parse((wp)$$2.getFirst(), null);
                  }

                  return $$4.map($$1xx -> Pair.of(new wv.e<>(a.this, $$1xx), $$2.getSecond()));
               });
            }

            public <D> DataResult<D> a(wv.e<T> $$0, DynamicOps<D> $$1, D $$2) {
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

      private static DataResult<wv.a<?>> a(@Nullable wv.a<?> $$0) {
         if ($$0 == null) {
            return DataResult.error(() -> "Unknown action");
         } else {
            return !$$0.a() ? DataResult.error(() -> "Action not allowed: " + $$0) : DataResult.success($$0, Lifecycle.stable());
         }
      }
   }

   public static class b {
      public static final Codec<wv.b> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(
                  mb.f.q().fieldOf("type").forGetter($$0x -> $$0x.b),
                  kl.f.fieldOf("id").forGetter($$0x -> $$0x.c),
                  wr.a.lenientOptionalFieldOf("name").forGetter($$0x -> $$0x.d)
               )
               .apply($$0, wv.b::new)
      );
      public final but<?> b;
      public final UUID c;
      public final Optional<wp> d;
      @Nullable
      private List<wp> e;

      public b(but<?> $$0, UUID $$1, @Nullable wp $$2) {
         this($$0, $$1, Optional.ofNullable($$2));
      }

      public b(but<?> $$0, UUID $$1, Optional<wp> $$2) {
         this.b = $$0;
         this.c = $$1;
         this.d = $$2;
      }

      public static DataResult<wv.b> a(wp $$0, @Nullable akt<?> $$1) {
         try {
            tq $$2 = uo.a($$0.getString());
            DynamicOps<JsonElement> $$3 = (DynamicOps<JsonElement>)($$1 != null ? $$1.a(JsonOps.INSTANCE) : JsonOps.INSTANCE);
            DataResult<wp> $$4 = wr.a.parse($$3, JsonParser.parseString($$2.l("name")));
            but<?> $$5 = mb.f.a(akv.a($$2.l("type")));
            UUID $$6 = UUID.fromString($$2.l("id"));
            return $$4.map($$2x -> new wv.b($$5, $$6, $$2x));
         } catch (Exception var7) {
            return DataResult.error(() -> "Failed to parse tooltip: " + var7.getMessage());
         }
      }

      public List<wp> a() {
         if (this.e == null) {
            this.e = new ArrayList<>();
            this.d.ifPresent(this.e::add);
            this.e.add(wp.a("gui.entity_tooltip.type", this.b.h()));
            this.e.add(wp.b(this.c.toString()));
         }

         return this.e;
      }

      @Override
      public boolean equals(Object $$0) {
         if (this == $$0) {
            return true;
         } else if ($$0 != null && this.getClass() == $$0.getClass()) {
            wv.b $$1 = (wv.b)$$0;
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
      public static final Codec<wv.c> a = cwq.a.xmap(wv.c::new, wv.c::a);
      private static final Codec<wv.c> c = cwq.f.xmap(wv.c::new, wv.c::a);
      public static final Codec<wv.c> b = Codec.withAlternative(a, c);
      private final jr<cwm> d;
      private final int e;
      private final ks f;
      @Nullable
      private cwq g;

      c(jr<cwm> $$0, int $$1, ks $$2) {
         this.d = $$0;
         this.e = $$1;
         this.f = $$2;
      }

      public c(cwq $$0) {
         this($$0.i(), $$0.M(), $$0.d());
      }

      @Override
      public boolean equals(Object $$0) {
         if (this == $$0) {
            return true;
         } else if ($$0 != null && this.getClass() == $$0.getClass()) {
            wv.c $$1 = (wv.c)$$0;
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

      public cwq a() {
         if (this.g == null) {
            this.g = new cwq(this.d, this.e, this.f);
         }

         return this.g;
      }

      private static DataResult<wv.c> a(wp $$0, @Nullable akt<?> $$1) {
         try {
            tq $$2 = uo.a($$0.getString());
            DynamicOps<un> $$3 = (DynamicOps<un>)($$1 != null ? $$1.a(ue.a) : ue.a);
            return cwq.a.parse($$3, $$2).map(wv.c::new);
         } catch (CommandSyntaxException var4) {
            return DataResult.error(() -> "Failed to parse item tag: " + var4.getMessage());
         }
      }
   }

   public interface d<T> {
      DataResult<T> parse(wp var1, @Nullable akt<?> var2);
   }

   static record e<T>(wv.a<T> c, T d) {
      public static final MapCodec<wv.e<?>> a = wv.a.e.dispatchMap("action", wv.e::a, $$0 -> $$0.h);
      public static final MapCodec<wv.e<?>> b = wv.a.e.dispatchMap("action", wv.e::a, $$0 -> $$0.i);

      public wv.a<T> a() {
         return this.c;
      }

      public T b() {
         return this.d;
      }
   }
}
