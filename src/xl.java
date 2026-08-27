import com.mojang.brigadier.StringReader;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.stream.Stream;
import javax.annotation.Nullable;

public record xl(String d, @Nullable gk e) implements xk {
   public static final MapCodec<xl> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(Codec.STRING.fieldOf("entity").forGetter(xl::b)).apply($$0, xl::new));
   public static final xk.a<xl> b = new xk.a<>(a, "entity");

   public xl(String $$0) {
      this($$0, a($$0));
   }

   @Nullable
   private static gk a(String $$0) {
      try {
         gl $$1 = new gl(new StringReader($$0));
         return $$1.t();
      } catch (CommandSyntaxException var2) {
         return null;
      }
   }

   @Override
   public Stream<to> a(dv $$0) throws CommandSyntaxException {
      if (this.e != null) {
         List<? extends bqa> $$1 = this.e.b($$0);
         return $$1.stream().map(co::b);
      } else {
         return Stream.empty();
      }
   }

   @Override
   public xk.a<?> a() {
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
         if ($$0 instanceof xl $$1 && this.d.equals($$1.d)) {
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
   public gk c() {
      return this.e;
   }
}
