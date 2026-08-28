import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.Lifecycle;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.UUID;
import javax.annotation.Nullable;

public interface xi {
   Codec<xi> a = xi.a.e.dispatch("action", xi::a, $$0 -> $$0.h);

   xi.a a();

   public static enum a implements bao {
      a("show_text", true, xi.e.b),
      b("show_item", true, xi.d.b),
      c("show_entity", true, xi.c.b);

      public static final Codec<xi.a> d = bao.b(xi.a::values);
      public static final Codec<xi.a> e = d.validate(xi.a::a);
      private final String f;
      private final boolean g;
      final MapCodec<? extends xi> h;

      private a(final String $$0, final boolean $$1, final MapCodec<? extends xi> $$2) {
         this.f = $$0;
         this.g = $$1;
         this.h = $$2;
      }

      public boolean a() {
         return this.g;
      }

      @Override
      public String c() {
         return this.f;
      }

      @Override
      public String toString() {
         return "<action " + this.f + ">";
      }

      private static DataResult<xi.a> a(xi.a $$0) {
         return !$$0.a() ? DataResult.error(() -> "Action not allowed: " + $$0) : DataResult.success($$0, Lifecycle.stable());
      }
   }

   public static class b {
      public static final MapCodec<xi.b> a = RecordCodecBuilder.mapCodec(
         $$0 -> $$0.group(
                  mh.f.q().fieldOf("id").forGetter($$0x -> $$0x.b),
                  ka.f.fieldOf("uuid").forGetter($$0x -> $$0x.c),
                  xe.a.optionalFieldOf("name").forGetter($$0x -> $$0x.d)
               )
               .apply($$0, xi.b::new)
      );
      public final bxe<?> b;
      public final UUID c;
      public final Optional<xc> d;
      @Nullable
      private List<xc> e;

      public b(bxe<?> $$0, UUID $$1, @Nullable xc $$2) {
         this($$0, $$1, Optional.ofNullable($$2));
      }

      public b(bxe<?> $$0, UUID $$1, Optional<xc> $$2) {
         this.b = $$0;
         this.c = $$1;
         this.d = $$2;
      }

      public List<xc> a() {
         if (this.e == null) {
            this.e = new ArrayList<>();
            this.d.ifPresent(this.e::add);
            this.e.add(xc.a("gui.entity_tooltip.type", this.b.h()));
            this.e.add(xc.b(this.c.toString()));
         }

         return this.e;
      }

      @Override
      public boolean equals(Object $$0) {
         if (this == $$0) {
            return true;
         } else if ($$0 != null && this.getClass() == $$0.getClass()) {
            xi.b $$1 = (xi.b)$$0;
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

   public static record c(xi.b c) implements xi {
      public static final MapCodec<xi.c> b = RecordCodecBuilder.mapCodec($$0 -> $$0.group(xi.b.a.forGetter(xi.c::b)).apply($$0, xi.c::new));

      @Override
      public xi.a a() {
         return xi.a.c;
      }

      public xi.b b() {
         return this.c;
      }
   }

   public static record d(daa c) implements xi {
      public static final MapCodec<xi.d> b = daa.a.xmap(xi.d::new, xi.d::b);

      public d(daa c) {
         c = c.v();
         this.c = c;
      }

      @Override
      public xi.a a() {
         return xi.a.b;
      }

      @Override
      public boolean equals(Object $$0) {
         if ($$0 instanceof xi.d $$1 && daa.a(this.c, $$1.c)) {
            return true;
         }

         return false;
      }

      @Override
      public int hashCode() {
         return daa.b(this.c);
      }

      public daa b() {
         return this.c;
      }
   }

   public static record e(xc c) implements xi {
      public static final MapCodec<xi.e> b = RecordCodecBuilder.mapCodec($$0 -> $$0.group(xe.a.fieldOf("value").forGetter(xi.e::b)).apply($$0, xi.e::new));

      @Override
      public xi.a a() {
         return xi.a.a;
      }

      public xc b() {
         return this.c;
      }
   }
}
