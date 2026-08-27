import com.mojang.brigadier.StringReader;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.stream.Stream;
import javax.annotation.Nullable;

public record wh(String d, @Nullable fo e) implements wi {
   public static final MapCodec<wh> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(Codec.STRING.fieldOf("block").forGetter(wh::b)).apply($$0, wh::new));
   public static final wi.a<wh> b = new wi.a<>(a, "block");

   public wh(String $$0) {
      this($$0, a($$0));
   }

   @Nullable
   private static fo a(String $$0) {
      try {
         return fm.a().a(new StringReader($$0));
      } catch (CommandSyntaxException var2) {
         return null;
      }
   }

   @Override
   public Stream<so> a(ds $$0) {
      if (this.e != null) {
         ane $$1 = $$0.e();
         hx $$2 = this.e.c($$0);
         if ($$1.p($$2)) {
            dhd $$3 = $$1.c_($$2);
            if ($$3 != null) {
               return Stream.of($$3.o());
            }
         }
      }

      return Stream.empty();
   }

   @Override
   public wi.a<?> a() {
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
         if ($$0 instanceof wh $$1 && this.d.equals($$1.d)) {
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
   public fo c() {
      return this.e;
   }
}
