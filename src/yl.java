import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableList.Builder;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.datafixers.util.Either;
import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.function.Consumer;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.annotation.Nullable;

public class yl implements xb {
   public static final Object[] a = new Object[0];
   private static final Codec<Object> d = ayw.b.validate(yl::b);
   private static final Codec<Object> e = Codec.either(d, xc.a)
      .xmap(
         $$0 -> $$0.map($$0x -> $$0x, $$0x -> Objects.requireNonNullElse($$0x.d(), $$0x)), $$0 -> $$0 instanceof xa $$1 ? Either.right($$1) : Either.left($$0)
      );
   public static final MapCodec<yl> b = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(
               Codec.STRING.fieldOf("translate").forGetter($$0x -> $$0x.h),
               Codec.STRING.lenientOptionalFieldOf("fallback").forGetter($$0x -> Optional.ofNullable($$0x.i)),
               e.listOf().optionalFieldOf("with").forGetter($$0x -> a($$0x.j))
            )
            .apply($$0, yl::a)
   );
   public static final xb.a<yl> c = new xb.a<>(b, "translatable");
   private static final xf f = xf.e("%");
   private static final xf g = xf.e("null");
   private final String h;
   @Nullable
   private final String i;
   private final Object[] j;
   @Nullable
   private tu k;
   private List<xf> l = ImmutableList.of();
   private static final Pattern m = Pattern.compile("%(?:(\\d+)\\$)?([A-Za-z%]|$)");

   private static DataResult<Object> b(@Nullable Object $$0) {
      return !a($$0) ? DataResult.error(() -> "This value needs to be parsed as component") : DataResult.success($$0);
   }

   public static boolean a(@Nullable Object $$0) {
      return $$0 instanceof Number || $$0 instanceof Boolean || $$0 instanceof String;
   }

   private static Optional<List<Object>> a(Object[] $$0) {
      return $$0.length == 0 ? Optional.empty() : Optional.of(Arrays.asList($$0));
   }

   private static Object[] a(Optional<List<Object>> $$0) {
      return $$0.<Object[]>map($$0x -> $$0x.isEmpty() ? a : $$0x.toArray()).orElse(a);
   }

   private static yl a(String $$0, Optional<String> $$1, Optional<List<Object>> $$2) {
      return new yl($$0, $$1.orElse(null), a($$2));
   }

   public yl(String $$0, @Nullable String $$1, Object[] $$2) {
      this.h = $$0;
      this.i = $$1;
      this.j = $$2;
   }

   @Override
   public xb.a<?> a() {
      return c;
   }

   private void e() {
      tu $$0 = tu.a();
      if ($$0 != this.k) {
         this.k = $$0;
         String $$1 = this.i != null ? $$0.a(this.h, this.i) : $$0.a(this.h);

         try {
            Builder<xf> $$2 = ImmutableList.builder();
            this.a($$1, $$2::add);
            this.l = $$2.build();
         } catch (ym var4) {
            this.l = ImmutableList.of(xf.e($$1));
         }
      }
   }

   private void a(String $$0, Consumer<xf> $$1) {
      Matcher $$2 = m.matcher($$0);

      try {
         int $$3 = 0;
         int $$4 = 0;

         while ($$2.find($$4)) {
            int $$5 = $$2.start();
            int $$6 = $$2.end();
            if ($$5 > $$4) {
               String $$7 = $$0.substring($$4, $$5);
               if ($$7.indexOf(37) != -1) {
                  throw new IllegalArgumentException();
               }

               $$1.accept(xf.e($$7));
            }

            String $$8 = $$2.group(2);
            String $$9 = $$0.substring($$5, $$6);
            if ("%".equals($$8) && "%%".equals($$9)) {
               $$1.accept(f);
            } else {
               if (!"s".equals($$8)) {
                  throw new ym(this, "Unsupported format: '" + $$9 + "'");
               }

               String $$10 = $$2.group(1);
               int $$11 = $$10 != null ? Integer.parseInt($$10) - 1 : $$3++;
               $$1.accept(this.a($$11));
            }

            $$4 = $$6;
         }

         if ($$4 < $$0.length()) {
            String $$12 = $$0.substring($$4);
            if ($$12.indexOf(37) != -1) {
               throw new IllegalArgumentException();
            }

            $$1.accept(xf.e($$12));
         }
      } catch (IllegalArgumentException var12) {
         throw new ym(this, var12);
      }
   }

   private xf a(int $$0) {
      if ($$0 >= 0 && $$0 < this.j.length) {
         Object $$1 = this.j[$$0];
         if ($$1 instanceof xa) {
            return (xa)$$1;
         } else {
            return $$1 == null ? g : xf.e($$1.toString());
         }
      } else {
         throw new ym(this, $$0);
      }
   }

   @Override
   public <T> Optional<T> a(xf.b<T> $$0, xx $$1) {
      this.e();

      for (xf $$2 : this.l) {
         Optional<T> $$3 = $$2.a($$0, $$1);
         if ($$3.isPresent()) {
            return $$3;
         }
      }

      return Optional.empty();
   }

   @Override
   public <T> Optional<T> a(xf.a<T> $$0) {
      this.e();

      for (xf $$1 : this.l) {
         Optional<T> $$2 = $$1.a($$0);
         if ($$2.isPresent()) {
            return $$2;
         }
      }

      return Optional.empty();
   }

   @Override
   public xo a(@Nullable ej $$0, @Nullable bwt $$1, int $$2) throws CommandSyntaxException {
      Object[] $$3 = new Object[this.j.length];

      for (int $$4 = 0; $$4 < $$3.length; $$4++) {
         Object $$5 = this.j[$$4];
         if ($$5 instanceof xa $$6) {
            $$3[$$4] = xd.a($$0, $$6, $$1, $$2);
         } else {
            $$3[$$4] = $$5;
         }
      }

      return xo.a(new yl(this.h, this.i, $$3));
   }

   @Override
   public boolean equals(Object $$0) {
      if (this == $$0) {
         return true;
      } else {
         if ($$0 instanceof yl $$1 && Objects.equals(this.h, $$1.h) && Objects.equals(this.i, $$1.i) && Arrays.equals(this.j, $$1.j)) {
            return true;
         }

         return false;
      }
   }

   @Override
   public int hashCode() {
      int $$0 = Objects.hashCode(this.h);
      $$0 = 31 * $$0 + Objects.hashCode(this.i);
      return 31 * $$0 + Arrays.hashCode(this.j);
   }

   @Override
   public String toString() {
      return "translation{key='" + this.h + "'" + (this.i != null ? ", fallback='" + this.i + "'" : "") + ", args=" + Arrays.toString(this.j) + "}";
   }

   public String b() {
      return this.h;
   }

   @Nullable
   public String c() {
      return this.i;
   }

   public Object[] d() {
      return this.j;
   }
}
