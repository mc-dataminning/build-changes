import com.mojang.brigadier.StringReader;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.stream.Stream;
import javax.annotation.Nullable;

public record yc(String d, @Nullable hi e) implements yb {
   public static final MapCodec<yc> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(Codec.STRING.fieldOf("entity").forGetter(yc::b)).apply($$0, yc::new));
   public static final yb.a<yc> b = new yb.a<>(a, "entity");

   public yc(String $$0) {
      this($$0, a($$0));
   }

   @Nullable
   private static hi a(String $$0) {
      try {
         hj $$1 = new hj(new StringReader($$0), true);
         return $$1.t();
      } catch (CommandSyntaxException var2) {
         return null;
      }
   }

   @Override
   public Stream<ub> a(et $$0) throws CommandSyntaxException {
      if (this.e != null) {
         List<? extends bsr> $$1 = this.e.b($$0);
         return $$1.stream().map(dk::b);
      } else {
         return Stream.empty();
      }
   }

   @Override
   public yb.a<?> a() {
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
         if ($$0 instanceof yc $$1 && this.d.equals($$1.d)) {
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
   public hi c() {
      return this.e;
   }
}
