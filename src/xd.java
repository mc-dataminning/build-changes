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

public class xd {
   public static final Codec<xd> a = Codec.withAlternative(xd.e.a.codec(), xd.e.b.codec()).xmap(xd::new, $$0 -> $$0.b);
   private final xd.e<?> b;

   public <T> xd(xd.a<T> $$0, T $$1) {
      this(new xd.e<>($$0, $$1));
   }

   private xd(xd.e<?> $$0) {
      this.b = $$0;
   }

   public xd.a<?> a() {
      return this.b.c;
   }

   @Nullable
   public <T> T a(xd.a<T> $$0) {
      return this.b.c == $$0 ? $$0.a(this.b.d) : null;
   }

   @Override
   public boolean equals(Object $$0) {
      if (this == $$0) {
         return true;
      } else {
         return $$0 != null && this.getClass() == $$0.getClass() ? ((xd)$$0).b.equals(this.b) : false;
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

   public static class a<T> implements ayx {
      public static final xd.a<wx> a = new xd.a<>("show_text", true, wz.a, ($$0, $$1) -> DataResult.success($$0));
      public static final xd.a<xd.c> b = new xd.a<>("show_item", true, xd.c.b, xd.c::a);
      public static final xd.a<xd.b> c = new xd.a<>("show_entity", true, xd.b.a, xd.b::a);
      public static final Codec<xd.a<?>> d = ayx.b(() -> new xd.a[]{a, b, c});
      public static final Codec<xd.a<?>> e = d.validate(xd.a::a);
      private final String f;
      private final boolean g;
      final MapCodec<xd.e<T>> h;
      final MapCodec<xd.e<T>> i;

      public a(String $$0, boolean $$1, Codec<T> $$2, final xd.d<T> $$3) {
         this.f = $$0;
         this.g = $$1;
         this.h = $$2.xmap($$0x -> new xd.e<>(this, (T)$$0x), $$0x -> $$0x.d).fieldOf("contents");
         this.i = (new Codec<xd.e<T>>() {
            public <D> DataResult<Pair<xd.e<T>, D>> decode(DynamicOps<D> $$0, D $$1) {
               return wz.a.decode($$0, $$1).flatMap($$2 -> {
                  DataResult<T> $$4;
                  if ($$0 instanceof akk<D> $$3xx) {
                     $$4 = $$3.parse((wx)$$2.getFirst(), $$3xx);
                  } else {
                     $$4 = $$3.parse((wx)$$2.getFirst(), null);
                  }

                  return $$4.map($$1xx -> Pair.of(new xd.e<>(a.this, $$1xx), $$2.getSecond()));
               });
            }

            public <D> DataResult<D> a(xd.e<T> $$0, DynamicOps<D> $$1, D $$2) {
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

      private static DataResult<xd.a<?>> a(@Nullable xd.a<?> $$0) {
         if ($$0 == null) {
            return DataResult.error(() -> "Unknown action");
         } else {
            return !$$0.a() ? DataResult.error(() -> "Action not allowed: " + $$0) : DataResult.success($$0, Lifecycle.stable());
         }
      }
   }

   public static class b {
      public static final Codec<xd.b> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(
                  le.g.q().fieldOf("type").forGetter($$0x -> $$0x.b),
                  jr.f.fieldOf("id").forGetter($$0x -> $$0x.c),
                  wz.a.lenientOptionalFieldOf("name").forGetter($$0x -> $$0x.d)
               )
               .apply($$0, xd.b::new)
      );
      public final bsa<?> b;
      public final UUID c;
      public final Optional<wx> d;
      @Nullable
      private List<wx> e;

      public b(bsa<?> $$0, UUID $$1, @Nullable wx $$2) {
         this($$0, $$1, Optional.ofNullable($$2));
      }

      public b(bsa<?> $$0, UUID $$1, Optional<wx> $$2) {
         this.b = $$0;
         this.c = $$1;
         this.d = $$2;
      }

      public static DataResult<xd.b> a(wx $$0, @Nullable akk<?> $$1) {
         try {
            ud $$2 = vb.a($$0.getString());
            DynamicOps<JsonElement> $$3 = (DynamicOps<JsonElement>)($$1 != null ? $$1.a(JsonOps.INSTANCE) : JsonOps.INSTANCE);
            DataResult<wx> $$4 = wz.a.parse($$3, JsonParser.parseString($$2.l("name")));
            bsa<?> $$5 = le.g.a(new akm($$2.l("type")));
            UUID $$6 = UUID.fromString($$2.l("id"));
            return $$4.map($$2x -> new xd.b($$5, $$6, $$2x));
         } catch (Exception var7) {
            return DataResult.error(() -> "Failed to parse tooltip: " + var7.getMessage());
         }
      }

      public List<wx> a() {
         if (this.e == null) {
            this.e = new ArrayList<>();
            this.d.ifPresent(this.e::add);
            this.e.add(wx.a("gui.entity_tooltip.type", this.b.h()));
            this.e.add(wx.b(this.c.toString()));
         }

         return this.e;
      }

      @Override
      public boolean equals(Object $$0) {
         if (this == $$0) {
            return true;
         } else if ($$0 != null && this.getClass() == $$0.getClass()) {
            xd.b $$1 = (xd.b)$$0;
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
      public static final Codec<xd.c> a = cto.a.xmap(xd.c::new, xd.c::a);
      private static final Codec<xd.c> c = cto.d.xmap(xd.c::new, xd.c::a);
      public static final Codec<xd.c> b = Codec.withAlternative(a, c);
      private final ix<ctj> d;
      private final int e;
      private final jy f;
      @Nullable
      private cto g;

      c(ix<ctj> $$0, int $$1, jy $$2) {
         this.d = $$0;
         this.e = $$1;
         this.f = $$2;
      }

      public c(cto $$0) {
         this($$0.h(), $$0.I(), $$0.d());
      }

      @Override
      public boolean equals(Object $$0) {
         if (this == $$0) {
            return true;
         } else if ($$0 != null && this.getClass() == $$0.getClass()) {
            xd.c $$1 = (xd.c)$$0;
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

      public cto a() {
         if (this.g == null) {
            this.g = new cto(this.d, this.e, this.f);
         }

         return this.g;
      }

      private static DataResult<xd.c> a(wx $$0, @Nullable akk<?> $$1) {
         try {
            ud $$2 = vb.a($$0.getString());
            DynamicOps<va> $$3 = (DynamicOps<va>)($$1 != null ? $$1.a(ur.a) : ur.a);
            return cto.a.parse($$3, $$2).map(xd.c::new);
         } catch (CommandSyntaxException var4) {
            return DataResult.error(() -> "Failed to parse item tag: " + var4.getMessage());
         }
      }
   }

   public interface d<T> {
      DataResult<T> parse(wx var1, @Nullable akk<?> var2);
   }

   static record e<T>(xd.a<T> c, T d) {
      public static final MapCodec<xd.e<?>> a = xd.a.e.dispatchMap("action", xd.e::a, $$0 -> $$0.h);
      public static final MapCodec<xd.e<?>> b = xd.a.e.dispatchMap("action", xd.e::a, $$0 -> $$0.i);

      public xd.a<T> a() {
         return this.c;
      }

      public T b() {
         return this.d;
      }
   }
}
