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

public class xn {
   public static final Codec<xn> a = Codec.withAlternative(xn.e.a.codec(), xn.e.b.codec()).xmap(xn::new, $$0 -> $$0.b);
   private final xn.e<?> b;

   public <T> xn(xn.a<T> $$0, T $$1) {
      this(new xn.e<>($$0, $$1));
   }

   private xn(xn.e<?> $$0) {
      this.b = $$0;
   }

   public xn.a<?> a() {
      return this.b.c;
   }

   @Nullable
   public <T> T a(xn.a<T> $$0) {
      return this.b.c == $$0 ? $$0.a(this.b.d) : null;
   }

   @Override
   public boolean equals(Object $$0) {
      if (this == $$0) {
         return true;
      } else {
         return $$0 != null && this.getClass() == $$0.getClass() ? ((xn)$$0).b.equals(this.b) : false;
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

   public static class a<T> implements baf {
      public static final xn.a<xh> a = new xn.a<>("show_text", true, xj.a, ($$0, $$1) -> DataResult.success($$0));
      public static final xn.a<xn.c> b = new xn.a<>("show_item", true, xn.c.b, xn.c::a);
      public static final xn.a<xn.b> c = new xn.a<>("show_entity", true, xn.b.a, xn.b::a);
      public static final Codec<xn.a<?>> d = baf.b(() -> new xn.a[]{a, b, c});
      public static final Codec<xn.a<?>> e = d.validate(xn.a::a);
      private final String f;
      private final boolean g;
      final MapCodec<xn.e<T>> h;
      final MapCodec<xn.e<T>> i;

      public a(String $$0, boolean $$1, Codec<T> $$2, final xn.d<T> $$3) {
         this.f = $$0;
         this.g = $$1;
         this.h = $$2.xmap($$0x -> new xn.e<>(this, (T)$$0x), $$0x -> $$0x.d).fieldOf("contents");
         this.i = (new Codec<xn.e<T>>() {
            public <D> DataResult<Pair<xn.e<T>, D>> decode(DynamicOps<D> $$0, D $$1) {
               return xj.a.decode($$0, $$1).flatMap($$2 -> {
                  DataResult<T> $$4;
                  if ($$0 instanceof alf<D> $$3xx) {
                     $$4 = $$3.parse((xh)$$2.getFirst(), $$3xx);
                  } else {
                     $$4 = $$3.parse((xh)$$2.getFirst(), null);
                  }

                  return $$4.map($$1xx -> Pair.of(new xn.e<>(a.this, $$1xx), $$2.getSecond()));
               });
            }

            public <D> DataResult<D> a(xn.e<T> $$0, DynamicOps<D> $$1, D $$2) {
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

      private static DataResult<xn.a<?>> a(@Nullable xn.a<?> $$0) {
         if ($$0 == null) {
            return DataResult.error(() -> "Unknown action");
         } else {
            return !$$0.a() ? DataResult.error(() -> "Action not allowed: " + $$0) : DataResult.success($$0, Lifecycle.stable());
         }
      }
   }

   public static class b {
      public static final Codec<xn.b> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(
                  lx.f.q().fieldOf("type").forGetter($$0x -> $$0x.b),
                  kj.f.fieldOf("id").forGetter($$0x -> $$0x.c),
                  xj.a.lenientOptionalFieldOf("name").forGetter($$0x -> $$0x.d)
               )
               .apply($$0, xn.b::new)
      );
      public final bug<?> b;
      public final UUID c;
      public final Optional<xh> d;
      @Nullable
      private List<xh> e;

      public b(bug<?> $$0, UUID $$1, @Nullable xh $$2) {
         this($$0, $$1, Optional.ofNullable($$2));
      }

      public b(bug<?> $$0, UUID $$1, Optional<xh> $$2) {
         this.b = $$0;
         this.c = $$1;
         this.d = $$2;
      }

      public static DataResult<xn.b> a(xh $$0, @Nullable alf<?> $$1) {
         try {
            uj $$2 = vh.a($$0.getString());
            DynamicOps<JsonElement> $$3 = (DynamicOps<JsonElement>)($$1 != null ? $$1.a(JsonOps.INSTANCE) : JsonOps.INSTANCE);
            DataResult<xh> $$4 = xj.a.parse($$3, JsonParser.parseString($$2.l("name")));
            bug<?> $$5 = lx.f.a(alh.a($$2.l("type")));
            UUID $$6 = UUID.fromString($$2.l("id"));
            return $$4.map($$2x -> new xn.b($$5, $$6, $$2x));
         } catch (Exception var7) {
            return DataResult.error(() -> "Failed to parse tooltip: " + var7.getMessage());
         }
      }

      public List<xh> a() {
         if (this.e == null) {
            this.e = new ArrayList<>();
            this.d.ifPresent(this.e::add);
            this.e.add(xh.a("gui.entity_tooltip.type", this.b.h()));
            this.e.add(xh.b(this.c.toString()));
         }

         return this.e;
      }

      @Override
      public boolean equals(Object $$0) {
         if (this == $$0) {
            return true;
         } else if ($$0 != null && this.getClass() == $$0.getClass()) {
            xn.b $$1 = (xn.b)$$0;
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
      public static final Codec<xn.c> a = cvx.b.xmap(xn.c::new, xn.c::a);
      private static final Codec<xn.c> c = cvx.g.xmap(xn.c::new, xn.c::a);
      public static final Codec<xn.c> b = Codec.withAlternative(a, c);
      private final jp<cvt> d;
      private final int e;
      private final kq f;
      @Nullable
      private cvx g;

      c(jp<cvt> $$0, int $$1, kq $$2) {
         this.d = $$0;
         this.e = $$1;
         this.f = $$2;
      }

      public c(cvx $$0) {
         this($$0.i(), $$0.L(), $$0.e());
      }

      @Override
      public boolean equals(Object $$0) {
         if (this == $$0) {
            return true;
         } else if ($$0 != null && this.getClass() == $$0.getClass()) {
            xn.c $$1 = (xn.c)$$0;
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

      public cvx a() {
         if (this.g == null) {
            this.g = new cvx(this.d, this.e, this.f);
         }

         return this.g;
      }

      private static DataResult<xn.c> a(xh $$0, @Nullable alf<?> $$1) {
         try {
            uj $$2 = vh.a($$0.getString());
            DynamicOps<vg> $$3 = (DynamicOps<vg>)($$1 != null ? $$1.a(ux.a) : ux.a);
            return cvx.b.parse($$3, $$2).map(xn.c::new);
         } catch (CommandSyntaxException var4) {
            return DataResult.error(() -> "Failed to parse item tag: " + var4.getMessage());
         }
      }
   }

   public interface d<T> {
      DataResult<T> parse(xh var1, @Nullable alf<?> var2);
   }

   static record e<T>(xn.a<T> c, T d) {
      public static final MapCodec<xn.e<?>> a = xn.a.e.dispatchMap("action", xn.e::a, $$0 -> $$0.h);
      public static final MapCodec<xn.e<?>> b = xn.a.e.dispatchMap("action", xn.e::a, $$0 -> $$0.i);

      public xn.a<T> a() {
         return this.c;
      }

      public T b() {
         return this.d;
      }
   }
}
