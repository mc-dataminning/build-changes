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

public interface xe {
   Codec<xe> a = xe.a.e.dispatch("action", xe::a, $$0 -> $$0.h);

   xe.a a();

   public static enum a implements bak {
      a("show_text", true, xe.e.b),
      b("show_item", true, xe.d.b),
      c("show_entity", true, xe.c.b);

      public static final Codec<xe.a> d = bak.b(xe.a::values);
      public static final Codec<xe.a> e = d.validate(xe.a::a);
      private final String f;
      private final boolean g;
      final MapCodec<? extends xe> h;

      private a(final String $$0, final boolean $$1, final MapCodec<? extends xe> $$2) {
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

      private static DataResult<xe.a> a(xe.a $$0) {
         return !$$0.a() ? DataResult.error(() -> "Action not allowed: " + $$0) : DataResult.success($$0, Lifecycle.stable());
      }
   }

   public static class b {
      public static final MapCodec<xe.b> a = RecordCodecBuilder.mapCodec(
         $$0 -> $$0.group(
                  mf.f.q().fieldOf("id").forGetter($$0x -> $$0x.b),
                  jy.f.fieldOf("uuid").forGetter($$0x -> $$0x.c),
                  xa.a.optionalFieldOf("name").forGetter($$0x -> $$0x.d)
               )
               .apply($$0, xe.b::new)
      );
      public final bwm<?> b;
      public final UUID c;
      public final Optional<wy> d;
      @Nullable
      private List<wy> e;

      public b(bwm<?> $$0, UUID $$1, @Nullable wy $$2) {
         this($$0, $$1, Optional.ofNullable($$2));
      }

      public b(bwm<?> $$0, UUID $$1, Optional<wy> $$2) {
         this.b = $$0;
         this.c = $$1;
         this.d = $$2;
      }

      public List<wy> a() {
         if (this.e == null) {
            this.e = new ArrayList<>();
            this.d.ifPresent(this.e::add);
            this.e.add(wy.a("gui.entity_tooltip.type", this.b.h()));
            this.e.add(wy.b(this.c.toString()));
         }

         return this.e;
      }

      @Override
      public boolean equals(Object $$0) {
         if (this == $$0) {
            return true;
         } else if ($$0 != null && this.getClass() == $$0.getClass()) {
            xe.b $$1 = (xe.b)$$0;
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

   public static record c(xe.b c) implements xe {
      public static final MapCodec<xe.c> b = RecordCodecBuilder.mapCodec($$0 -> $$0.group(xe.b.a.forGetter(xe.c::b)).apply($$0, xe.c::new));

      @Override
      public xe.a a() {
         return xe.a.c;
      }

      public xe.b b() {
         return this.c;
      }
   }

   public static record d(cyy c) implements xe {
      public static final MapCodec<xe.d> b = cyy.a.xmap(xe.d::new, xe.d::b);

      public d(cyy c) {
         c = c.v();
         this.c = c;
      }

      @Override
      public xe.a a() {
         return xe.a.b;
      }

      @Override
      public boolean equals(Object $$0) {
         if ($$0 instanceof xe.d $$1 && cyy.a(this.c, $$1.c)) {
            return true;
         }

         return false;
      }

      @Override
      public int hashCode() {
         return cyy.b(this.c);
      }

      public cyy b() {
         return this.c;
      }
   }

   public static record e(wy c) implements xe {
      public static final MapCodec<xe.e> b = RecordCodecBuilder.mapCodec($$0 -> $$0.group(xa.a.fieldOf("value").forGetter(xe.e::b)).apply($$0, xe.e::new));

      @Override
      public xe.a a() {
         return xe.a.a;
      }

      public wy b() {
         return this.c;
      }
   }
}
