import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.datafixers.util.Either;
import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.Encoder;
import com.mojang.serialization.Lifecycle;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.UUID;
import java.util.function.Function;
import javax.annotation.Nullable;

public class tr {
   public static final Codec<tr> a = Codec.either(tr.d.a.codec(), tr.d.b.codec())
      .xmap($$0 -> new tr((tr.d<?>)$$0.map($$0x -> $$0x, $$0x -> $$0x)), $$0 -> Either.left($$0.b));
   private final tr.d<?> b;

   public <T> tr(tr.a<T> $$0, T $$1) {
      this(new tr.d<>($$0, $$1));
   }

   private tr(tr.d<?> $$0) {
      this.b = $$0;
   }

   public tr.a<?> a() {
      return this.b.c;
   }

   @Nullable
   public <T> T a(tr.a<T> $$0) {
      return this.b.c == $$0 ? $$0.a(this.b.d) : null;
   }

   @Override
   public boolean equals(Object $$0) {
      if (this == $$0) {
         return true;
      } else {
         return $$0 != null && this.getClass() == $$0.getClass() ? ((tr)$$0).b.equals(this.b) : false;
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

   public static class a<T> implements asu {
      public static final tr.a<tl> a = new tr.a<>("show_text", true, tn.a, DataResult::success);
      public static final tr.a<tr.c> b = new tr.a<>("show_item", true, tr.c.b, tr.c::a);
      public static final tr.a<tr.b> c = new tr.a<>("show_entity", true, tr.b.a, tr.b::a);
      public static final Codec<tr.a<?>> d = asu.b(() -> new tr.a[]{a, b, c});
      public static final Codec<tr.a<?>> e = arj.a(d, tr.a::a);
      private final String f;
      private final boolean g;
      final Codec<tr.d<T>> h;
      final Codec<tr.d<T>> i;

      public a(String $$0, boolean $$1, Codec<T> $$2, Function<tl, DataResult<T>> $$3) {
         this.f = $$0;
         this.g = $$1;
         this.h = $$2.xmap($$0x -> new tr.d<>(this, (T)$$0x), $$0x -> $$0x.d).fieldOf("contents").codec();
         this.i = Codec.of(Encoder.error("Can't encode in legacy format"), tn.a.flatMap($$3).map($$0x -> new tr.d<>(this, (T)$$0x)));
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

      private static DataResult<tr.a<?>> a(@Nullable tr.a<?> $$0) {
         if ($$0 == null) {
            return DataResult.error(() -> "Unknown action");
         } else {
            return !$$0.a() ? DataResult.error(() -> "Action not allowed: " + $$0) : DataResult.success($$0, Lifecycle.stable());
         }
      }
   }

   public static class b {
      public static final Codec<tr.b> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(
                  jb.h.q().fieldOf("type").forGetter($$0x -> $$0x.b),
                  hx.d.fieldOf("id").forGetter($$0x -> $$0x.c),
                  arj.a(tn.a, "name").forGetter($$0x -> $$0x.d)
               )
               .apply($$0, tr.b::new)
      );
      public final bja<?> b;
      public final UUID c;
      public final Optional<tl> d;
      @Nullable
      private List<tl> e;

      public b(bja<?> $$0, UUID $$1, @Nullable tl $$2) {
         this($$0, $$1, Optional.ofNullable($$2));
      }

      public b(bja<?> $$0, UUID $$1, Optional<tl> $$2) {
         this.b = $$0;
         this.c = $$1;
         this.d = $$2;
      }

      public static DataResult<tr.b> a(tl $$0) {
         try {
            qw $$1 = rr.a($$0.getString());
            tl $$2 = tl.a.a($$1.l("name"));
            bja<?> $$3 = jb.h.a(new aez($$1.l("type")));
            UUID $$4 = UUID.fromString($$1.l("id"));
            return DataResult.success(new tr.b($$3, $$4, $$2));
         } catch (Exception var5) {
            return DataResult.error(() -> "Failed to parse tooltip: " + var5.getMessage());
         }
      }

      public List<tl> a() {
         if (this.e == null) {
            this.e = new ArrayList<>();
            this.d.ifPresent(this.e::add);
            this.e.add(tl.a("gui.entity_tooltip.type", this.b.h()));
            this.e.add(tl.b(this.c.toString()));
         }

         return this.e;
      }

      @Override
      public boolean equals(Object $$0) {
         if (this == $$0) {
            return true;
         } else if ($$0 != null && this.getClass() == $$0.getClass()) {
            tr.b $$1 = (tr.b)$$0;
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
      public static final Codec<tr.c> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(
                  jb.i.q().fieldOf("id").forGetter($$0x -> $$0x.c),
                  arj.a(Codec.INT, "count", Integer.valueOf(1)).forGetter($$0x -> $$0x.d),
                  arj.a(rr.i, "tag").forGetter($$0x -> $$0x.e)
               )
               .apply($$0, tr.c::new)
      );
      public static final Codec<tr.c> b = Codec.either(jb.i.q(), a)
         .xmap($$0 -> (tr.c)$$0.map($$0x -> new tr.c($$0x, 1, Optional.empty()), $$0x -> $$0x), Either::right);
      private final cjg c;
      private final int d;
      private final Optional<qw> e;
      @Nullable
      private cjl f;

      c(cjg $$0, int $$1, @Nullable qw $$2) {
         this($$0, $$1, Optional.ofNullable($$2));
      }

      c(cjg $$0, int $$1, Optional<qw> $$2) {
         this.c = $$0;
         this.d = $$1;
         this.e = $$2;
      }

      public c(cjl $$0) {
         this($$0.d(), $$0.L(), $$0.v() != null ? Optional.of($$0.v().h()) : Optional.empty());
      }

      @Override
      public boolean equals(Object $$0) {
         if (this == $$0) {
            return true;
         } else if ($$0 != null && this.getClass() == $$0.getClass()) {
            tr.c $$1 = (tr.c)$$0;
            return this.d == $$1.d && this.c.equals($$1.c) && this.e.equals($$1.e);
         } else {
            return false;
         }
      }

      @Override
      public int hashCode() {
         int $$0 = this.c.hashCode();
         $$0 = 31 * $$0 + this.d;
         return 31 * $$0 + this.e.hashCode();
      }

      public cjl a() {
         if (this.f == null) {
            this.f = new cjl(this.c, this.d);
            this.e.ifPresent(this.f::c);
         }

         return this.f;
      }

      private static DataResult<tr.c> a(tl $$0) {
         try {
            qw $$1 = rr.a($$0.getString());
            return DataResult.success(new tr.c(cjl.a($$1)));
         } catch (CommandSyntaxException var2) {
            return DataResult.error(() -> "Failed to parse item tag: " + var2.getMessage());
         }
      }
   }

   static record d<T>(tr.a<T> c, T d) {
      public static final MapCodec<tr.d<?>> a = tr.a.e.dispatchMap("action", tr.d::a, $$0 -> $$0.h);
      public static final MapCodec<tr.d<?>> b = tr.a.e.dispatchMap("action", tr.d::a, $$0 -> $$0.i);

      public tr.a<T> a() {
         return this.c;
      }

      public T b() {
         return this.d;
      }
   }
}
