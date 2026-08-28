import com.mojang.brigadier.StringReader;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.stream.Stream;
import javax.annotation.Nullable;

public record xy(String d, @Nullable hn e) implements xx {
   public static final MapCodec<xy> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(Codec.STRING.fieldOf("entity").forGetter(xy::b)).apply($$0, xy::new));
   public static final xx.a<xy> b = new xx.a<>(a, "entity");

   public xy(String $$0) {
      this($$0, a($$0));
   }

   @Nullable
   private static hn a(String $$0) {
      try {
         ho $$1 = new ho(new StringReader($$0), true);
         return $$1.t();
      } catch (CommandSyntaxException var2) {
         return null;
      }
   }

   @Override
   public Stream<tw> a(ex $$0) throws CommandSyntaxException {
      if (this.e != null) {
         List<? extends bvs> $$1 = this.e.b($$0);
         return $$1.stream().map(dn::b);
      } else {
         return Stream.empty();
      }
   }

   @Override
   public xx.a<?> a() {
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
         if ($$0 instanceof xy $$1 && this.d.equals($$1.d)) {
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
   public hn c() {
      return this.e;
   }
}
