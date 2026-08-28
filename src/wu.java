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

public class wu {
   public static final Codec<wu> a = Codec.withAlternative(wu.e.a.codec(), wu.e.b.codec()).xmap(wu::new, $$0 -> $$0.b);
   private final wu.e<?> b;

   public <T> wu(wu.a<T> $$0, T $$1) {
      this(new wu.e<>($$0, $$1));
   }

   private wu(wu.e<?> $$0) {
      this.b = $$0;
   }

   public wu.a<?> a() {
      return this.b.c;
   }

   @Nullable
   public <T> T a(wu.a<T> $$0) {
      return this.b.c == $$0 ? $$0.a(this.b.d) : null;
   }

   @Override
   public boolean equals(Object $$0) {
      if (this == $$0) {
         return true;
      } else {
         return $$0 != null && this.getClass() == $$0.getClass() ? ((wu)$$0).b.equals(this.b) : false;
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
      public static final wu.a<wo> a = new wu.a<>("show_text", true, wq.a, ($$0, $$1) -> DataResult.success($$0));
      public static final wu.a<wu.c> b = new wu.a<>("show_item", true, wu.c.b, wu.c::a);
      public static final wu.a<wu.b> c = new wu.a<>("show_entity", true, wu.b.a, wu.b::a);
      public static final Codec<wu.a<?>> d = azu.b(() -> new wu.a[]{a, b, c});
      public static final Codec<wu.a<?>> e = d.validate(wu.a::a);
      private final String f;
      private final boolean g;
      final MapCodec<wu.e<T>> h;
      final MapCodec<wu.e<T>> i;

      public a(String $$0, boolean $$1, Codec<T> $$2, final wu.d<T> $$3) {
         this.f = $$0;
         this.g = $$1;
         this.h = $$2.xmap($$0x -> new wu.e<>(this, (T)$$0x), $$0x -> $$0x.d).fieldOf("contents");
         this.i = (new Codec<wu.e<T>>() {
            public <D> DataResult<Pair<wu.e<T>, D>> decode(DynamicOps<D> $$0, D $$1) {
               return wq.a.decode($$0, $$1).flatMap($$2 -> {
                  DataResult<T> $$4;
                  if ($$0 instanceof aks<D> $$3xx) {
                     $$4 = $$3.parse((wo)$$2.getFirst(), $$3xx);
                  } else {
                     $$4 = $$3.parse((wo)$$2.getFirst(), null);
                  }

                  return $$4.map($$1xx -> Pair.of(new wu.e<>(a.this, $$1xx), $$2.getSecond()));
               });
            }

            public <D> DataResult<D> a(wu.e<T> $$0, DynamicOps<D> $$1, D $$2) {
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

      private static DataResult<wu.a<?>> a(@Nullable wu.a<?> $$0) {
         if ($$0 == null) {
            return DataResult.error(() -> "Unknown action");
         } else {
            return !$$0.a() ? DataResult.error(() -> "Action not allowed: " + $$0) : DataResult.success($$0, Lifecycle.stable());
         }
      }
   }

   public static class b {
      public static final Codec<wu.b> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(
                  mb.f.q().fieldOf("type").forGetter($$0x -> $$0x.b),
                  kl.f.fieldOf("id").forGetter($$0x -> $$0x.c),
                  wq.a.lenientOptionalFieldOf("name").forGetter($$0x -> $$0x.d)
               )
               .apply($$0, wu.b::new)
      );
      public final buq<?> b;
      public final UUID c;
      public final Optional<wo> d;
      @Nullable
      private List<wo> e;

      public b(buq<?> $$0, UUID $$1, @Nullable wo $$2) {
         this($$0, $$1, Optional.ofNullable($$2));
      }

      public b(buq<?> $$0, UUID $$1, Optional<wo> $$2) {
         this.b = $$0;
         this.c = $$1;
         this.d = $$2;
      }

      public static DataResult<wu.b> a(wo $$0, @Nullable aks<?> $$1) {
         try {
            tq $$2 = uo.a($$0.getString());
            DynamicOps<JsonElement> $$3 = (DynamicOps<JsonElement>)($$1 != null ? $$1.a(JsonOps.INSTANCE) : JsonOps.INSTANCE);
            DataResult<wo> $$4 = wq.a.parse($$3, JsonParser.parseString($$2.l("name")));
            buq<?> $$5 = mb.f.a(aku.a($$2.l("type")));
            UUID $$6 = UUID.fromString($$2.l("id"));
            return $$4.map($$2x -> new wu.b($$5, $$6, $$2x));
         } catch (Exception var7) {
            return DataResult.error(() -> "Failed to parse tooltip: " + var7.getMessage());
         }
      }

      public List<wo> a() {
         if (this.e == null) {
            this.e = new ArrayList<>();
            this.d.ifPresent(this.e::add);
            this.e.add(wo.a("gui.entity_tooltip.type", this.b.h()));
            this.e.add(wo.b(this.c.toString()));
         }

         return this.e;
      }

      @Override
      public boolean equals(Object $$0) {
         if (this == $$0) {
            return true;
         } else if ($$0 != null && this.getClass() == $$0.getClass()) {
            wu.b $$1 = (wu.b)$$0;
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
      public static final Codec<wu.c> a = cwn.a.xmap(wu.c::new, wu.c::a);
      private static final Codec<wu.c> c = cwn.f.xmap(wu.c::new, wu.c::a);
      public static final Codec<wu.c> b = Codec.withAlternative(a, c);
      private final jr<cwj> d;
      private final int e;
      private final ks f;
      @Nullable
      private cwn g;

      c(jr<cwj> $$0, int $$1, ks $$2) {
         this.d = $$0;
         this.e = $$1;
         this.f = $$2;
      }

      public c(cwn $$0) {
         this($$0.i(), $$0.M(), $$0.d());
      }

      @Override
      public boolean equals(Object $$0) {
         if (this == $$0) {
            return true;
         } else if ($$0 != null && this.getClass() == $$0.getClass()) {
            wu.c $$1 = (wu.c)$$0;
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

      public cwn a() {
         if (this.g == null) {
            this.g = new cwn(this.d, this.e, this.f);
         }

         return this.g;
      }

      private static DataResult<wu.c> a(wo $$0, @Nullable aks<?> $$1) {
         try {
            tq $$2 = uo.a($$0.getString());
            DynamicOps<un> $$3 = (DynamicOps<un>)($$1 != null ? $$1.a(ue.a) : ue.a);
            return cwn.a.parse($$3, $$2).map(wu.c::new);
         } catch (CommandSyntaxException var4) {
            return DataResult.error(() -> "Failed to parse item tag: " + var4.getMessage());
         }
      }
   }

   public interface d<T> {
      DataResult<T> parse(wo var1, @Nullable aks<?> var2);
   }

   static record e<T>(wu.a<T> c, T d) {
      public static final MapCodec<wu.e<?>> a = wu.a.e.dispatchMap("action", wu.e::a, $$0 -> $$0.h);
      public static final MapCodec<wu.e<?>> b = wu.a.e.dispatchMap("action", wu.e::a, $$0 -> $$0.i);

      public wu.a<T> a() {
         return this.c;
      }

      public T b() {
         return this.d;
      }
   }
}
