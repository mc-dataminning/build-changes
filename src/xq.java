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

public class xq {
   public static final Codec<xq> a = Codec.withAlternative(xq.e.a.codec(), xq.e.b.codec()).xmap(xq::new, $$0 -> $$0.b);
   private final xq.e<?> b;

   public <T> xq(xq.a<T> $$0, T $$1) {
      this(new xq.e<>($$0, $$1));
   }

   private xq(xq.e<?> $$0) {
      this.b = $$0;
   }

   public xq.a<?> a() {
      return this.b.c;
   }

   @Nullable
   public <T> T a(xq.a<T> $$0) {
      return this.b.c == $$0 ? $$0.a(this.b.d) : null;
   }

   @Override
   public boolean equals(Object $$0) {
      if (this == $$0) {
         return true;
      } else {
         return $$0 != null && this.getClass() == $$0.getClass() ? ((xq)$$0).b.equals(this.b) : false;
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

   public static class a<T> implements baq {
      public static final xq.a<xk> a = new xq.a<>("show_text", true, xm.a, ($$0, $$1) -> DataResult.success($$0));
      public static final xq.a<xq.c> b = new xq.a<>("show_item", true, xq.c.b, xq.c::a);
      public static final xq.a<xq.b> c = new xq.a<>("show_entity", true, xq.b.a, xq.b::a);
      public static final Codec<xq.a<?>> d = baq.b(() -> new xq.a[]{a, b, c});
      public static final Codec<xq.a<?>> e = d.validate(xq.a::a);
      private final String f;
      private final boolean g;
      final MapCodec<xq.e<T>> h;
      final MapCodec<xq.e<T>> i;

      public a(String $$0, boolean $$1, Codec<T> $$2, final xq.d<T> $$3) {
         this.f = $$0;
         this.g = $$1;
         this.h = $$2.xmap($$0x -> new xq.e<>(this, (T)$$0x), $$0x -> $$0x.d).fieldOf("contents");
         this.i = (new Codec<xq.e<T>>() {
            public <D> DataResult<Pair<xq.e<T>, D>> decode(DynamicOps<D> $$0, D $$1) {
               return xm.a.decode($$0, $$1).flatMap($$2 -> {
                  DataResult<T> $$4;
                  if ($$0 instanceof aln<D> $$3xx) {
                     $$4 = $$3.parse((xk)$$2.getFirst(), $$3xx);
                  } else {
                     $$4 = $$3.parse((xk)$$2.getFirst(), null);
                  }

                  return $$4.map($$1xx -> Pair.of(new xq.e<>(a.this, $$1xx), $$2.getSecond()));
               });
            }

            public <D> DataResult<D> a(xq.e<T> $$0, DynamicOps<D> $$1, D $$2) {
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

      private static DataResult<xq.a<?>> a(@Nullable xq.a<?> $$0) {
         if ($$0 == null) {
            return DataResult.error(() -> "Unknown action");
         } else {
            return !$$0.a() ? DataResult.error(() -> "Action not allowed: " + $$0) : DataResult.success($$0, Lifecycle.stable());
         }
      }
   }

   public static class b {
      public static final Codec<xq.b> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(
                  ma.f.q().fieldOf("type").forGetter($$0x -> $$0x.b),
                  kk.f.fieldOf("id").forGetter($$0x -> $$0x.c),
                  xm.a.lenientOptionalFieldOf("name").forGetter($$0x -> $$0x.d)
               )
               .apply($$0, xq.b::new)
      );
      public final bvi<?> b;
      public final UUID c;
      public final Optional<xk> d;
      @Nullable
      private List<xk> e;

      public b(bvi<?> $$0, UUID $$1, @Nullable xk $$2) {
         this($$0, $$1, Optional.ofNullable($$2));
      }

      public b(bvi<?> $$0, UUID $$1, Optional<xk> $$2) {
         this.b = $$0;
         this.c = $$1;
         this.d = $$2;
      }

      public static DataResult<xq.b> a(xk $$0, @Nullable aln<?> $$1) {
         try {
            um $$2 = vk.a($$0.getString());
            DynamicOps<JsonElement> $$3 = (DynamicOps<JsonElement>)($$1 != null ? $$1.a(JsonOps.INSTANCE) : JsonOps.INSTANCE);
            DataResult<xk> $$4 = xm.a.parse($$3, JsonParser.parseString($$2.l("name")));
            bvi<?> $$5 = ma.f.a(alp.a($$2.l("type")));
            UUID $$6 = UUID.fromString($$2.l("id"));
            return $$4.map($$2x -> new xq.b($$5, $$6, $$2x));
         } catch (Exception var7) {
            return DataResult.error(() -> "Failed to parse tooltip: " + var7.getMessage());
         }
      }

      public List<xk> a() {
         if (this.e == null) {
            this.e = new ArrayList<>();
            this.d.ifPresent(this.e::add);
            this.e.add(xk.a("gui.entity_tooltip.type", this.b.h()));
            this.e.add(xk.b(this.c.toString()));
         }

         return this.e;
      }

      @Override
      public boolean equals(Object $$0) {
         if (this == $$0) {
            return true;
         } else if ($$0 != null && this.getClass() == $$0.getClass()) {
            xq.b $$1 = (xq.b)$$0;
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
      public static final Codec<xq.c> a = cxg.a.xmap(xq.c::new, xq.c::a);
      private static final Codec<xq.c> c = cxg.f.xmap(xq.c::new, xq.c::a);
      public static final Codec<xq.c> b = Codec.withAlternative(a, c);
      private final jq<cxc> d;
      private final int e;
      private final kr f;
      @Nullable
      private cxg g;

      c(jq<cxc> $$0, int $$1, kr $$2) {
         this.d = $$0;
         this.e = $$1;
         this.f = $$2;
      }

      public c(cxg $$0) {
         this($$0.i(), $$0.M(), $$0.e());
      }

      @Override
      public boolean equals(Object $$0) {
         if (this == $$0) {
            return true;
         } else if ($$0 != null && this.getClass() == $$0.getClass()) {
            xq.c $$1 = (xq.c)$$0;
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

      public cxg a() {
         if (this.g == null) {
            this.g = new cxg(this.d, this.e, this.f);
         }

         return this.g;
      }

      private static DataResult<xq.c> a(xk $$0, @Nullable aln<?> $$1) {
         try {
            um $$2 = vk.a($$0.getString());
            DynamicOps<vj> $$3 = (DynamicOps<vj>)($$1 != null ? $$1.a(va.a) : va.a);
            return cxg.a.parse($$3, $$2).map(xq.c::new);
         } catch (CommandSyntaxException var4) {
            return DataResult.error(() -> "Failed to parse item tag: " + var4.getMessage());
         }
      }
   }

   public interface d<T> {
      DataResult<T> parse(xk var1, @Nullable aln<?> var2);
   }

   static record e<T>(xq.a<T> c, T d) {
      public static final MapCodec<xq.e<?>> a = xq.a.e.dispatchMap("action", xq.e::a, $$0 -> $$0.h);
      public static final MapCodec<xq.e<?>> b = xq.a.e.dispatchMap("action", xq.e::a, $$0 -> $$0.i);

      public xq.a<T> a() {
         return this.c;
      }

      public T b() {
         return this.d;
      }
   }
}
