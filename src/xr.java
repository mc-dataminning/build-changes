import com.mojang.brigadier.StringReader;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.stream.Stream;
import javax.annotation.Nullable;

public record xr(String d, @Nullable hm e) implements xq {
   public static final MapCodec<xr> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(Codec.STRING.fieldOf("entity").forGetter(xr::b)).apply($$0, xr::new));
   public static final xq.a<xr> b = new xq.a<>(a, "entity");

   public xr(String $$0) {
      this($$0, a($$0));
   }

   @Nullable
   private static hm a(String $$0) {
      try {
         hn $$1 = new hn(new StringReader($$0), true);
         return $$1.t();
      } catch (CommandSyntaxException var2) {
         return null;
      }
   }

   @Override
   public Stream<tq> a(ex $$0) throws CommandSyntaxException {
      if (this.e != null) {
         List<? extends buj> $$1 = this.e.b($$0);
         return $$1.stream().map(dn::b);
      } else {
         return Stream.empty();
      }
   }

   @Override
   public xq.a<?> a() {
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
         if ($$0 instanceof xr $$1 && this.d.equals($$1.d)) {
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
   public hm c() {
      return this.e;
   }
}
