import com.mojang.brigadier.StringReader;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.stream.Stream;
import javax.annotation.Nullable;

public record vw(String d, @Nullable fo e) implements vx {
   public static final MapCodec<vw> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(Codec.STRING.fieldOf("block").forGetter(vw::b)).apply($$0, vw::new));
   public static final vx.a<vw> b = new vx.a<>(a, "block");

   public vw(String $$0) {
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
   public Stream<sd> a(du $$0) {
      if (this.e != null) {
         ami $$1 = $$0.e();
         hx $$2 = this.e.c($$0);
         if ($$1.o($$2)) {
            dfi $$3 = $$1.c_($$2);
            if ($$3 != null) {
               return Stream.of($$3.o());
            }
         }
      }

      return Stream.empty();
   }

   @Override
   public vx.a<?> a() {
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
         if ($$0 instanceof vw $$1 && this.d.equals($$1.d)) {
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
