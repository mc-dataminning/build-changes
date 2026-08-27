import com.mojang.brigadier.StringReader;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.stream.Stream;
import javax.annotation.Nullable;

public record xx(String d, @Nullable gs e) implements xw {
   public static final MapCodec<xx> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(Codec.STRING.fieldOf("entity").forGetter(xx::b)).apply($$0, xx::new));
   public static final xw.a<xx> b = new xw.a<>(a, "entity");

   public xx(String $$0) {
      this($$0, a($$0));
   }

   @Nullable
   private static gs a(String $$0) {
      try {
         gt $$1 = new gt(new StringReader($$0));
         return $$1.t();
      } catch (CommandSyntaxException var2) {
         return null;
      }
   }

   @Override
   public Stream<ua> a(ed $$0) throws CommandSyntaxException {
      if (this.e != null) {
         List<? extends brh> $$1 = this.e.b($$0);
         return $$1.stream().map(cv::b);
      } else {
         return Stream.empty();
      }
   }

   @Override
   public xw.a<?> a() {
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
         if ($$0 instanceof xx $$1 && this.d.equals($$1.d)) {
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
   public gs c() {
      return this.e;
   }
}
