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

   private ezh a(et $$0) throws CommandSyntaxException {
      Optional<hk> $$1 = this.d.left();
      if ($$1.isPresent()) {
         List<? extends btj> $$2 = $$1.get().b().b($$0);
         if (!$$2.isEmpty()) {
            if ($$2.size() != 1) {
               throw fg.a.create();
            }

            return $$2.getFirst();
         }
      }

      return ezh.c((String)this.d.right().orElseThrow());
   }

   private xr a(ezh $$0, et $$1) {
      MinecraftServer $$2 = $$1.l();
      if ($$2 != null) {
         ezi $$3 = $$2.aJ();
         eza $$4 = $$3.a(this.e);
         if ($$4 != null) {
            eze $$5 = $$3.d($$0, $$4);
            if ($$5 != null) {
               return $$5.a($$4.a(yw.b));
            }
         }
      }

      return xd.i();
   }

   @Override
   public xr a(@Nullable et $$0, @Nullable btj $$1, int $$2) throws CommandSyntaxException {
      if ($$0 == null) {
         return xd.i();
      } else {
         ezh $$3 = this.a($$0);
         ezh $$4 = (ezh)($$1 != null && $$3.equals(ezh.cA) ? $$1 : $$3);
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
