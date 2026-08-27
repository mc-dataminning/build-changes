import com.mojang.brigadier.StringReader;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.stream.Stream;
import javax.annotation.Nullable;

public record xv(String d, @Nullable gr e) implements xu {
   public static final MapCodec<xv> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(Codec.STRING.fieldOf("entity").forGetter(xv::b)).apply($$0, xv::new));
   public static final xu.a<xv> b = new xu.a<>(a, "entity");

   public xv(String $$0) {
      this($$0, a($$0));
   }

   @Nullable
   private static gr a(String $$0) {
      try {
         gs $$1 = new gs(new StringReader($$0));
         return $$1.t();
      } catch (CommandSyntaxException var2) {
         return null;
      }
   }

   @Override
   public Stream<ty> a(ec $$0) throws CommandSyntaxException {
      if (this.e != null) {
         List<? extends bql> $$1 = this.e.b($$0);
         return $$1.stream().map(cu::b);
      } else {
         return Stream.empty();
      }
   }

   @Override
   public xu.a<?> a() {
      return b;
   }

   @Override
   public String toString() {
      return "entity=" + this.d;
   }

   @Override
   public boolean equals(Object $$0) {
      if (this == $$0) {
         return true;
      } else {
         if ($$0 instanceof xv $$1 && this.d.equals($$1.d)) {
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
   public gr c() {
      return this.e;
   }
}
