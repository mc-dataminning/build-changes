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

public interface xg {
   Codec<xg> a = xg.a.e.dispatch("action", xg::a, $$0 -> $$0.h);

   xg.a a();

   public static enum a implements bam {
      a("show_text", true, xg.e.b),
      b("show_item", true, xg.d.b),
      c("show_entity", true, xg.c.b);

      public static final Codec<xg.a> d = bam.b(xg.a::values);
      public static final Codec<xg.a> e = d.validate(xg.a::a);
      private final String f;
      private final boolean g;
      final MapCodec<? extends xg> h;

      private a(final String $$0, final boolean $$1, final MapCodec<? extends xg> $$2) {
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

      private static DataResult<xg.a> a(xg.a $$0) {
         return !$$0.a() ? DataResult.error(() -> "Action not allowed: " + $$0) : DataResult.success($$0, Lifecycle.stable());
      }
   }

   public static class b {
      public static final MapCodec<xg.b> a = RecordCodecBuilder.mapCodec(
         $$0 -> $$0.group(
                  mg.f.q().fieldOf("id").forGetter($$0x -> $$0x.b),
                  jz.f.fieldOf("uuid").forGetter($$0x -> $$0x.c),
                  xc.a.optionalFieldOf("name").forGetter($$0x -> $$0x.d)
               )
               .apply($$0, xg.b::new)
      );
      public final bxc<?> b;
      public final UUID c;
      public final Optional<xa> d;
      @Nullable
      private List<xa> e;

      public b(bxc<?> $$0, UUID $$1, @Nullable xa $$2) {
         this($$0, $$1, Optional.ofNullable($$2));
      }

      public b(bxc<?> $$0, UUID $$1, Optional<xa> $$2) {
         this.b = $$0;
         this.c = $$1;
         this.d = $$2;
      }

      public List<xa> a() {
         if (this.e == null) {
            this.e = new ArrayList<>();
            this.d.ifPresent(this.e::add);
            this.e.add(xa.a("gui.entity_tooltip.type", this.b.h()));
            this.e.add(xa.b(this.c.toString()));
         }

         return this.e;
      }

      @Override
      public boolean equals(Object $$0) {
         if (this == $$0) {
            return true;
         } else if ($$0 != null && this.getClass() == $$0.getClass()) {
            xg.b $$1 = (xg.b)$$0;
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

   public static record c(xg.b c) implements xg {
      public static final MapCodec<xg.c> b = RecordCodecBuilder.mapCodec($$0 -> $$0.group(xg.b.a.forGetter(xg.c::b)).apply($$0, xg.c::new));

      @Override
      public xg.a a() {
         return xg.a.c;
      }

      public xg.b b() {
         return this.c;
      }
   }

   public static record d(czy c) implements xg {
      public static final MapCodec<xg.d> b = czy.a.xmap(xg.d::new, xg.d::b);

      public d(czy c) {
         c = c.v();
         this.c = c;
      }

      @Override
      public xg.a a() {
         return xg.a.b;
      }

      @Override
      public boolean equals(Object $$0) {
         if ($$0 instanceof xg.d $$1 && czy.a(this.c, $$1.c)) {
            return true;
         }

         return false;
      }

      @Override
      public int hashCode() {
         return czy.b(this.c);
      }

      public czy b() {
         return this.c;
      }
   }

   public static record e(xa c) implements xg {
      public static final MapCodec<xg.e> b = RecordCodecBuilder.mapCodec($$0 -> $$0.group(xc.a.fieldOf("value").forGetter(xg.e::b)).apply($$0, xg.e::new));

      @Override
      public xg.a a() {
         return xg.a.a;
      }

      public xa b() {
         return this.c;
      }
   }
}
