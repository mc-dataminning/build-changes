import com.mojang.brigadier.StringReader;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.stream.Stream;
import javax.annotation.Nullable;

public record yh(String d, @Nullable gj e) implements yi {
   public static final MapCodec<yh> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(Codec.STRING.fieldOf("block").forGetter(yh::b)).apply($$0, yh::new));
   public static final yi.a<yh> b = new yi.a<>(a, "block");

   public yh(String $$0) {
      this($$0, a($$0));
   }

   @Nullable
   private static gj a(String $$0) {
      try {
         return gh.a().a(new StringReader($$0));
      } catch (CommandSyntaxException var2) {
         return null;
      }
   }

   @Override
   public Stream<ua> a(ek $$0) {
      if (this.e != null) {
         asb $$1 = $$0.e();
         iw $$2 = this.e.c($$0);
         if ($$1.p($$2)) {
            dyo $$3 = $$1.c_($$2);
            if ($$3 != null) {
               return Stream.of($$3.b($$0.u()));
            }
         }
      }

      return Stream.empty();
   }

   @Override
   public yi.a<?> a() {
      return b;
   }

   @Override
   public String toString() {
      return "block=" + this.d;
   }

   @Override
   public boolean equals(Object $$0) {
      if (this == $$0) {
         return true;
      } else {
         if ($$0 instanceof yh $$1 && this.d.equals($$1.d)) {
            return true;
         }

         return false;
      }
   }

   @Override
   public int hashCode() {
      return this.d.hashCode();
   }

   public String b() {
      return this.d;
   }

   @Nullable
   public gj c() {
      return this.e;
   }
}
