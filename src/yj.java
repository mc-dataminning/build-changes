import com.mojang.brigadier.StringReader;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.stream.Stream;
import javax.annotation.Nullable;

public record yj(String d, @Nullable ha e) implements yi {
   public static final MapCodec<yj> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(Codec.STRING.fieldOf("entity").forGetter(yj::b)).apply($$0, yj::new));
   public static final yi.a<yj> b = new yi.a<>(a, "entity");

   public yj(String $$0) {
      this($$0, a($$0));
   }

   @Nullable
   private static ha a(String $$0) {
      try {
         hb $$1 = new hb(new StringReader($$0), true);
         return $$1.t();
      } catch (CommandSyntaxException var2) {
         return null;
      }
   }

   @Override
   public Stream<ua> a(ek $$0) throws CommandSyntaxException {
      if (this.e != null) {
         List<? extends bxe> $$1 = this.e.b($$0);
         return $$1.stream().map(da::b);
      } else {
         return Stream.empty();
      }
   }

   @Override
   public yi.a<?> a() {
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
         if ($$0 instanceof yj $$1 && this.d.equals($$1.d)) {
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
   public ha c() {
      return this.e;
   }
}
