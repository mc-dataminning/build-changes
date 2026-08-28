import com.mojang.brigadier.StringReader;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.stream.Stream;
import javax.annotation.Nullable;

public record yb(String d, @Nullable gz e) implements ya {
   public static final MapCodec<yb> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(Codec.STRING.fieldOf("entity").forGetter(yb::b)).apply($$0, yb::new));
   public static final ya.a<yb> b = new ya.a<>(a, "entity");

   public yb(String $$0) {
      this($$0, a($$0));
   }

   @Nullable
   private static gz a(String $$0) {
      try {
         ha $$1 = new ha(new StringReader($$0), true);
         return $$1.t();
      } catch (CommandSyntaxException var2) {
         return null;
      }
   }

   @Override
   public Stream<tz> a(ej $$0) throws CommandSyntaxException {
      if (this.e != null) {
         List<? extends bwi> $$1 = this.e.b($$0);
         return $$1.stream().map(cz::b);
      } else {
         return Stream.empty();
      }
   }

   @Override
   public ya.a<?> a() {
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
         if ($$0 instanceof yb $$1 && this.d.equals($$1.d)) {
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
   public gz c() {
      return this.e;
   }
}
