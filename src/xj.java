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

public class xj {
   public static final Codec<xj> a = Codec.withAlternative(xj.e.a.codec(), xj.e.b.codec()).xmap(xj::new, $$0 -> $$0.b);
   private final xj.e<?> b;

   public <T> xj(xj.a<T> $$0, T $$1) {
      this(new xj.e<>($$0, $$1));
   }

   private xj(xj.e<?> $$0) {
      this.b = $$0;
   }

   public xj.a<?> a() {
      return this.b.c;
   }

   @Nullable
   public <T> T a(xj.a<T> $$0) {
      return this.b.c == $$0 ? $$0.a(this.b.d) : null;
   }

   @Override
   public boolean equals(Object $$0) {
      if (this == $$0) {
         return true;
      } else {
         return $$0 != null && this.getClass() == $$0.getClass() ? ((xj)$$0).b.equals(this.b) : false;
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

   public static class a<T> implements azy {
      public static final xj.a<xd> a = new xj.a<>("show_text", true, xf.a, ($$0, $$1) -> DataResult.success($$0));
      public static final xj.a<xj.c> b = new xj.a<>("show_item", true, xj.c.b, xj.c::a);
      public static final xj.a<xj.b> c = new xj.a<>("show_entity", true, xj.b.a, xj.b::a);
      public static final Codec<xj.a<?>> d = azy.b(() -> new xj.a[]{a, b, c});
      public static final Codec<xj.a<?>> e = d.validate(xj.a::a);
      private final String f;
      private final boolean g;
      final MapCodec<xj.e<T>> h;
      final MapCodec<xj.e<T>> i;

      public a(String $$0, boolean $$1, Codec<T> $$2, final xj.d<T> $$3) {
         this.f = $$0;
         this.g = $$1;
         this.h = $$2.xmap($$0x -> new xj.e<>(this, (T)$$0x), $$0x -> $$0x.d).fieldOf("contents");
         this.i = (new Codec<xj.e<T>>() {
            public <D> DataResult<Pair<xj.e<T>, D>> decode(DynamicOps<D> $$0, D $$1) {
               return xf.a.decode($$0, $$1).flatMap($$2 -> {
                  DataResult<T> $$4;
                  if ($$0 instanceof akz<D> $$3xx) {
                     $$4 = $$3.parse((xd)$$2.getFirst(), $$3xx);
                  } else {
                     $$4 = $$3.parse((xd)$$2.getFirst(), null);
                  }

                  return $$4.map($$1xx -> Pair.of(new xj.e<>(a.this, $$1xx), $$2.getSecond()));
               });
            }

            public <D> DataResult<D> a(xj.e<T> $$0, DynamicOps<D> $$1, D $$2) {
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

      private static DataResult<xj.a<?>> a(@Nullable xj.a<?> $$0) {
         if ($$0 == null) {
            return DataResult.error(() -> "Unknown action");
         } else {
            return !$$0.a() ? DataResult.error(() -> "Action not allowed: " + $$0) : DataResult.success($$0, Lifecycle.stable());
         }
      }
   }

   public static class b {
      public static final Codec<xj.b> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(
                  lu.f.q().fieldOf("type").forGetter($$0x -> $$0x.b),
                  kh.f.fieldOf("id").forGetter($$0x -> $$0x.c),
                  xf.a.lenientOptionalFieldOf("name").forGetter($$0x -> $$0x.d)
               )
               .apply($$0, xj.b::new)
      );
      public final btq<?> b;
      public final UUID c;
      public final Optional<xd> d;
      @Nullable
      private List<xd> e;

      public b(btq<?> $$0, UUID $$1, @Nullable xd $$2) {
         this($$0, $$1, Optional.ofNullable($$2));
      }

      public b(btq<?> $$0, UUID $$1, Optional<xd> $$2) {
         this.b = $$0;
         this.c = $$1;
         this.d = $$2;
      }

      public static DataResult<xj.b> a(xd $$0, @Nullable akz<?> $$1) {
         try {
            uf $$2 = vd.a($$0.getString());
            DynamicOps<JsonElement> $$3 = (DynamicOps<JsonElement>)($$1 != null ? $$1.a(JsonOps.INSTANCE) : JsonOps.INSTANCE);
            DataResult<xd> $$4 = xf.a.parse($$3, JsonParser.parseString($$2.l("name")));
            btq<?> $$5 = lu.f.a(alb.a($$2.l("type")));
            UUID $$6 = UUID.fromString($$2.l("id"));
            return $$4.map($$2x -> new xj.b($$5, $$6, $$2x));
         } catch (Exception var7) {
            return DataResult.error(() -> "Failed to parse tooltip: " + var7.getMessage());
         }
      }

      public List<xd> a() {
         if (this.e == null) {
            this.e = new ArrayList<>();
            this.d.ifPresent(this.e::add);
            this.e.add(xd.a("gui.entity_tooltip.type", this.b.h()));
            this.e.add(xd.b(this.c.toString()));
         }

         return this.e;
      }

      @Override
      public boolean equals(Object $$0) {
         if (this == $$0) {
            return true;
         } else if ($$0 != null && this.getClass() == $$0.getClass()) {
            xj.b $$1 = (xj.b)$$0;
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
      public static final Codec<xj.c> a = cvl.b.xmap(xj.c::new, xj.c::a);
      private static final Codec<xj.c> c = cvl.g.xmap(xj.c::new, xj.c::a);
      public static final Codec<xj.c> b = Codec.withAlternative(a, c);
      private final jn<cvg> d;
      private final int e;
      private final ko f;
      @Nullable
      private cvl g;

      c(jn<cvg> $$0, int $$1, ko $$2) {
         this.d = $$0;
         this.e = $$1;
         this.f = $$2;
      }

      public c(cvl $$0) {
         this($$0.i(), $$0.J(), $$0.e());
      }

      @Override
      public boolean equals(Object $$0) {
         if (this == $$0) {
            return true;
         } else if ($$0 != null && this.getClass() == $$0.getClass()) {
            xj.c $$1 = (xj.c)$$0;
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

      public cvl a() {
         if (this.g == null) {
            this.g = new cvl(this.d, this.e, this.f);
         }

         return this.g;
      }

      private static DataResult<xj.c> a(xd $$0, @Nullable akz<?> $$1) {
         try {
            uf $$2 = vd.a($$0.getString());
            DynamicOps<vc> $$3 = (DynamicOps<vc>)($$1 != null ? $$1.a(ut.a) : ut.a);
            return cvl.b.parse($$3, $$2).map(xj.c::new);
         } catch (CommandSyntaxException var4) {
            return DataResult.error(() -> "Failed to parse item tag: " + var4.getMessage());
         }
      }
   }

   public interface d<T> {
      DataResult<T> parse(xd var1, @Nullable akz<?> var2);
   }

   static record e<T>(xj.a<T> c, T d) {
      public static final MapCodec<xj.e<?>> a = xj.a.e.dispatchMap("action", xj.e::a, $$0 -> $$0.h);
      public static final MapCodec<xj.e<?>> b = xj.a.e.dispatchMap("action", xj.e::a, $$0 -> $$0.i);

      public xj.a<T> a() {
         return this.c;
      }

      public T b() {
         return this.d;
      }
   }
}
