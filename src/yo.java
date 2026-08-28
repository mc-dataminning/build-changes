import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.datafixers.util.Either;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;
import net.minecraft.server.MinecraftServer;

public record yo(Either<hc, String> d, String e) implements xh {
   public static final MapCodec<yo> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(Codec.either(hc.a, Codec.STRING).fieldOf("name").forGetter(yo::b), Codec.STRING.fieldOf("objective").forGetter(yo::c))
            .apply($$0, yo::new)
   );
   public static final MapCodec<yo> b = a.fieldOf("score");
   public static final xh.a<yo> c = new xh.a<>(b, "score");

   @Override
   public xh.a<?> a() {
      return c;
   }

   private fhg a(ek $$0) throws CommandSyntaxException {
      Optional<hc> $$1 = this.d.left();
      if ($$1.isPresent()) {
         List<? extends bxe> $$2 = $$1.get().b().b($$0);
         if (!$$2.isEmpty()) {
            if ($$2.size() != 1) {
               throw ex.a.create();
            } else {
               return $$2.getFirst();
            }
         } else {
            return fhg.c($$1.get().a());
         }
      } else {
         return fhg.c((String)this.d.right().orElseThrow());
      }
   }

   private xu a(fhg $$0, ek $$1) {
      MinecraftServer $$2 = $$1.l();
      if ($$2 != null) {
         fhh $$3 = $$2.aJ();
         fgz $$4 = $$3.a(this.e);
         if ($$4 != null) {
            fhd $$5 = $$3.d($$0, $$4);
            if ($$5 != null) {
               return $$5.a($$4.a(yz.b));
            }
         }
      }

      return xg.i();
   }

   @Override
   public xu a(@Nullable ek $$0, @Nullable bxe $$1, int $$2) throws CommandSyntaxException {
      if ($$0 == null) {
         return xg.i();
      } else {
         fhg $$3 = this.a($$0);
         fhg $$4 = (fhg)($$1 != null && $$3.equals(fhg.cp) ? $$1 : $$3);
         return this.a($$4, $$0);
      }
   }

   @Override
   public String toString() {
      return "score{name='" + this.d + "', objective='" + this.e + "'}";
   }

   public Either<hc, String> b() {
      return this.d;
   }

   public String c() {
      return this.e;
   }
}
