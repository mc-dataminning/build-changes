import com.mojang.brigadier.StringReader;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.stream.Stream;
import javax.annotation.Nullable;

public record wv(String d, @Nullable gi e) implements wu {
   public static final MapCodec<wv> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(Codec.STRING.fieldOf("entity").forGetter(wv::b)).apply($$0, wv::new));
   public static final wu.a<wv> b = new wu.a<>(a, "entity");

   public wv(String $$0) {
      this($$0, a($$0));
   }

   @Nullable
   private static gi a(String $$0) {
      try {
         gj $$1 = new gj(new StringReader($$0));
         return $$1.t();
      } catch (CommandSyntaxException var2) {
         return null;
      }
   }

   @Override
   public Stream<sy> a(du $$0) throws CommandSyntaxException {
      if (this.e != null) {
         List<? extends bof> $$1 = this.e.b($$0);
         return $$1.stream().map(co::b);
      } else {
         return Stream.empty();
      }
   }

   @Override
   public wu.a<?> a() {
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
         if ($$0 instanceof wv $$1 && this.d.equals($$1.d)) {
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
   public gi c() {
      return this.e;
   }
}
