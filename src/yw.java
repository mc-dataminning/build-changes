import com.mojang.brigadier.StringReader;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.stream.Stream;
import javax.annotation.Nullable;

public record yw(String d, @Nullable gu e) implements yx {
   public static final MapCodec<yw> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(Codec.STRING.fieldOf("block").forGetter(yw::b)).apply($$0, yw::new));
   public static final yx.a<yw> b = new yx.a<>(a, "block");

   public yw(String $$0) {
      this($$0, a($$0));
   }

   @Nullable
   private static gu a(String $$0) {
      try {
         return gs.a().a(new StringReader($$0));
      } catch (CommandSyntaxException var2) {
         return null;
      }
   }

   @Override
   public Stream<ux> a(ew $$0) {
      if (this.e != null) {
         ash $$1 = $$0.e();
         jh $$2 = this.e.c($$0);
         if ($$1.p($$2)) {
            dux $$3 = $$1.c_($$2);
            if ($$3 != null) {
               return Stream.of($$3.b($$0.u()));
            }
         }
      }

      return Stream.empty();
   }

   @Override
   public yx.a<?> a() {
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
         if ($$0 instanceof yw $$1 && this.d.equals($$1.d)) {
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
   public gu c() {
      return this.e;
   }
}
