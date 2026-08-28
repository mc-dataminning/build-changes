import com.mojang.brigadier.StringReader;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.stream.Stream;
import javax.annotation.Nullable;

public record xz(String d, @Nullable gy e) implements xy {
   public static final MapCodec<xz> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(Codec.STRING.fieldOf("entity").forGetter(xz::b)).apply($$0, xz::new));
   public static final xy.a<xz> b = new xy.a<>(a, "entity");

   public xz(String $$0) {
      this($$0, a($$0));
   }

   @Nullable
   private static gy a(String $$0) {
      try {
         gz $$1 = new gz(new StringReader($$0), true);
         return $$1.t();
      } catch (CommandSyntaxException var2) {
         return null;
      }
   }

   @Override
   public Stream<tx> a(ei $$0) throws CommandSyntaxException {
      if (this.e != null) {
         List<? extends bwa> $$1 = this.e.b($$0);
         return $$1.stream().map(cy::b);
      } else {
         return Stream.empty();
      }
   }

   @Override
   public xy.a<?> a() {
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
         if ($$0 instanceof xz $$1 && this.d.equals($$1.d)) {
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
   public gy c() {
      return this.e;
   }
}
