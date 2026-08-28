import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.datafixers.util.Either;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;
import net.minecraft.server.MinecraftServer;

public record ys(Either<hn, String> d, String e) implements xl {
   public static final MapCodec<ys> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(Codec.either(hn.a, Codec.STRING).fieldOf("name").forGetter(ys::b), Codec.STRING.fieldOf("objective").forGetter(ys::c))
            .apply($$0, ys::new)
   );
   public static final MapCodec<ys> b = a.fieldOf("score");
   public static final xl.a<ys> c = new xl.a<>(b, "score");

   @Override
   public xl.a<?> a() {
      return c;
   }

   private fcv a(ew $$0) throws CommandSyntaxException {
      Optional<hn> $$1 = this.d.left();
      if ($$1.isPresent()) {
         List<? extends bvb> $$2 = $$1.get().b().b($$0);
         if (!$$2.isEmpty()) {
            if ($$2.size() != 1) {
               throw fj.a.create();
            } else {
               return $$2.getFirst();
            }
         } else {
            return fcv.c($$1.get().a());
         }
      } else {
         return fcv.c((String)this.d.right().orElseThrow());
      }
   }

   private xy a(fcv $$0, ew $$1) {
      MinecraftServer $$2 = $$1.l();
      if ($$2 != null) {
         fcw $$3 = $$2.aJ();
         fco $$4 = $$3.a(this.e);
         if ($$4 != null) {
            fcs $$5 = $$3.d($$0, $$4);
            if ($$5 != null) {
               return $$5.a($$4.a(zd.b));
            }
         }
      }

      return xk.i();
   }

   @Override
   public xy a(@Nullable ew $$0, @Nullable bvb $$1, int $$2) throws CommandSyntaxException {
      if ($$0 == null) {
         return xk.i();
      } else {
         fcv $$3 = this.a($$0);
         fcv $$4 = (fcv)($$1 != null && $$3.equals(fcv.cB) ? $$1 : $$3);
         return this.a($$4, $$0);
      }
   }

   @Override
   public String toString() {
      return "score{name='" + this.d + "', objective='" + this.e + "'}";
   }

   public Either<hn, String> b() {
      return this.d;
   }

   public String c() {
      return this.e;
   }
}
