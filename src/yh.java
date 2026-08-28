import com.mojang.brigadier.StringReader;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.stream.Stream;
import javax.annotation.Nullable;

public record yh(String d, @Nullable hj e) implements yg {
   public static final MapCodec<yh> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(Codec.STRING.fieldOf("entity").forGetter(yh::b)).apply($$0, yh::new));
   public static final yg.a<yh> b = new yg.a<>(a, "entity");

   public yh(String $$0) {
      this($$0, a($$0));
   }

   @Nullable
   private static hj a(String $$0) {
      try {
         hk $$1 = new hk(new StringReader($$0), true);
         return $$1.t();
      } catch (CommandSyntaxException var2) {
         return null;
      }
   }

   @Override
   public Stream<ug> a(eu $$0) throws CommandSyntaxException {
      if (this.e != null) {
         List<? extends btr> $$1 = this.e.b($$0);
         return $$1.stream().map(dk::b);
      } else {
         return Stream.empty();
      }
   }

   @Override
   public yg.a<?> a() {
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
         if ($$0 instanceof yh $$1 && this.d.equals($$1.d)) {
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
   public hj c() {
      return this.e;
   }
}
