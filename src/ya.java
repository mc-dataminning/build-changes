import com.mojang.brigadier.StringReader;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.stream.Stream;
import javax.annotation.Nullable;

public record ya(String d, @Nullable gt e) implements xz {
   public static final MapCodec<ya> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(Codec.STRING.fieldOf("entity").forGetter(ya::b)).apply($$0, ya::new));
   public static final xz.a<ya> b = new xz.a<>(a, "entity");

   public ya(String $$0) {
      this($$0, a($$0));
   }

   @Nullable
   private static gt a(String $$0) {
      try {
         gu $$1 = new gu(new StringReader($$0));
         return $$1.t();
      } catch (CommandSyntaxException var2) {
         return null;
      }
   }

   @Override
   public Stream<ud> a(ee $$0) throws CommandSyntaxException {
      if (this.e != null) {
         List<? extends brw> $$1 = this.e.b($$0);
         return $$1.stream().map(cv::b);
      } else {
         return Stream.empty();
      }
   }

   @Override
   public xz.a<?> a() {
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
         if ($$0 instanceof ya $$1 && this.d.equals($$1.d)) {
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
   public gt c() {
      return this.e;
   }
}
