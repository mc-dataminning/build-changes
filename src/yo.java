import com.mojang.brigadier.StringReader;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.stream.Stream;
import javax.annotation.Nullable;

public record yo(String d, @Nullable he e) implements yn {
   public static final MapCodec<yo> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(Codec.STRING.fieldOf("entity").forGetter(yo::b)).apply($$0, yo::new));
   public static final yn.a<yo> b = new yn.a<>(a, "entity");

   public yo(String $$0) {
      this($$0, a($$0));
   }

   @Nullable
   private static he a(String $$0) {
      try {
         hf $$1 = new hf(new StringReader($$0));
         return $$1.t();
      } catch (CommandSyntaxException var2) {
         return null;
      }
   }

   @Override
   public Stream<ur> a(ep $$0) throws CommandSyntaxException {
      if (this.e != null) {
         List<? extends bsp> $$1 = this.e.b($$0);
         return $$1.stream().map(dg::b);
      } else {
         return Stream.empty();
      }
   }

   @Override
   public yn.a<?> a() {
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
         if ($$0 instanceof yo $$1 && this.d.equals($$1.d)) {
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
   public he c() {
      return this.e;
   }
}
