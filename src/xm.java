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

public interface xm {
   Codec<xm> a = xm.a.e.dispatch("action", xm::a, $$0 -> $$0.h);

   xm.a a();

   public static enum a implements bax {
      a("show_text", true, xm.e.b),
      b("show_item", true, xm.d.b),
      c("show_entity", true, xm.c.b);

      public static final Codec<xm.a> d = bax.b(xm.a::values);
      public static final Codec<xm.a> e = d.validate(xm.a::a);
      private final String f;
      private final boolean g;
      final MapCodec<? extends xm> h;

      private a(final String $$0, final boolean $$1, final MapCodec<? extends xm> $$2) {
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

      private static DataResult<xm.a> a(xm.a $$0) {
         return !$$0.a() ? DataResult.error(() -> "Action not allowed: " + $$0) : DataResult.success($$0, Lifecycle.stable());
      }
   }

   public static class b {
      public static final MapCodec<xm.b> a = RecordCodecBuilder.mapCodec(
         $$0 -> $$0.group(
                  mh.f.q().fieldOf("id").forGetter($$0x -> $$0x.b),
                  ka.f.fieldOf("uuid").forGetter($$0x -> $$0x.c),
                  xi.a.optionalFieldOf("name").forGetter($$0x -> $$0x.d)
               )
               .apply($$0, xm.b::new)
      );
      public final bxn<?> b;
      public final UUID c;
      public final Optional<xg> d;
      @Nullable
      private List<xg> e;

      public b(bxn<?> $$0, UUID $$1, @Nullable xg $$2) {
         this($$0, $$1, Optional.ofNullable($$2));
      }

      public b(bxn<?> $$0, UUID $$1, Optional<xg> $$2) {
         this.b = $$0;
         this.c = $$1;
         this.d = $$2;
      }

      public List<xg> a() {
         if (this.e == null) {
            this.e = new ArrayList<>();
            this.d.ifPresent(this.e::add);
            this.e.add(xg.a("gui.entity_tooltip.type", this.b.h()));
            this.e.add(xg.b(this.c.toString()));
         }

         return this.e;
      }

      @Override
      public boolean equals(Object $$0) {
         if (this == $$0) {
            return true;
         } else if ($$0 != null && this.getClass() == $$0.getClass()) {
            xm.b $$1 = (xm.b)$$0;
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

   public static record c(xm.b c) implements xm {
      public static final MapCodec<xm.c> b = RecordCodecBuilder.mapCodec($$0 -> $$0.group(xm.b.a.forGetter(xm.c::b)).apply($$0, xm.c::new));

      @Override
      public xm.a a() {
         return xm.a.c;
      }

      public xm.b b() {
         return this.c;
      }
   }

   public static record d(dak c) implements xm {
      public static final MapCodec<xm.d> b = dak.a.xmap(xm.d::new, xm.d::b);

      public d(dak c) {
         c = c.v();
         this.c = c;
      }

      @Override
      public xm.a a() {
         return xm.a.b;
      }

      @Override
      public boolean equals(Object $$0) {
         if ($$0 instanceof xm.d $$1 && dak.a(this.c, $$1.c)) {
            return true;
         }

         return false;
      }

      @Override
      public int hashCode() {
         return dak.b(this.c);
      }

      public dak b() {
         return this.c;
      }
   }

   public static record e(xg c) implements xm {
      public static final MapCodec<xm.e> b = RecordCodecBuilder.mapCodec($$0 -> $$0.group(xi.a.fieldOf("value").forGetter(xm.e::b)).apply($$0, xm.e::new));

      @Override
      public xm.a a() {
         return xm.a.a;
      }

      public xg b() {
         return this.c;
      }
   }
}
