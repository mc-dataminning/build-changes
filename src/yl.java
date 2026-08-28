import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.datafixers.util.Either;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;
import net.minecraft.server.MinecraftServer;

public record yl(Either<hk, String> d, String e) implements xe {
   public static final MapCodec<yl> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(Codec.either(hk.a, Codec.STRING).fieldOf("name").forGetter(yl::b), Codec.STRING.fieldOf("objective").forGetter(yl::c))
            .apply($$0, yl::new)
   );
   public static final MapCodec<yl> b = a.fieldOf("score");
   public static final xe.a<yl> c = new xe.a<>(b, "score");

   @Override
   public xe.a<?> a() {
      return c;
   }

   private ezw a(et $$0) throws CommandSyntaxException {
      Optional<hk> $$1 = this.d.left();
      if ($$1.isPresent()) {
         List<? extends bto> $$2 = $$1.get().b().b($$0);
         if (!$$2.isEmpty()) {
            if ($$2.size() != 1) {
               throw fg.a.create();
            } else {
               return $$2.getFirst();
            }
         } else {
            return ezw.c($$1.get().a());
         }
      } else {
         return ezw.c((String)this.d.right().orElseThrow());
      }
   }

   private xr a(ezw $$0, et $$1) {
      MinecraftServer $$2 = $$1.l();
      if ($$2 != null) {
         ezx $$3 = $$2.aJ();
         ezp $$4 = $$3.a(this.e);
         if ($$4 != null) {
            ezt $$5 = $$3.d($$0, $$4);
            if ($$5 != null) {
               return $$5.a($$4.a(yw.b));
            }
         }
      }

      return xd.i();
   }

   @Override
   public xr a(@Nullable et $$0, @Nullable bto $$1, int $$2) throws CommandSyntaxException {
      if ($$0 == null) {
         return xd.i();
      } else {
         ezw $$3 = this.a($$0);
         ezw $$4 = (ezw)($$1 != null && $$3.equals(ezw.cz) ? $$1 : $$3);
         return this.a($$4, $$0);
      }
   }

   @Override
   public String toString() {
      return "score{name='" + this.d + "', objective='" + this.e + "'}";
   }

   public Either<hk, String> b() {
      return this.d;
   }

   public String c() {
      return this.e;
   }
}
