import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.datafixers.util.Either;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;
import net.minecraft.server.MinecraftServer;

public record yk(Either<hc, String> d, String e) implements xd {
   public static final MapCodec<yk> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(Codec.either(hc.a, Codec.STRING).fieldOf("name").forGetter(yk::b), Codec.STRING.fieldOf("objective").forGetter(yk::c))
            .apply($$0, yk::new)
   );
   public static final MapCodec<yk> b = a.fieldOf("score");
   public static final xd.a<yk> c = new xd.a<>(b, "score");

   @Override
   public xd.a<?> a() {
      return c;
   }

   private fgw a(ek $$0) throws CommandSyntaxException {
      Optional<hc> $$1 = this.d.left();
      if ($$1.isPresent()) {
         List<? extends bwv> $$2 = $$1.get().b().b($$0);
         if (!$$2.isEmpty()) {
            if ($$2.size() != 1) {
               throw ex.a.create();
            } else {
               return $$2.getFirst();
            }
         } else {
            return fgw.c($$1.get().a());
         }
      } else {
         return fgw.c((String)this.d.right().orElseThrow());
      }
   }

   private xq a(fgw $$0, ek $$1) {
      MinecraftServer $$2 = $$1.l();
      if ($$2 != null) {
         fgx $$3 = $$2.aJ();
         fgp $$4 = $$3.a(this.e);
         if ($$4 != null) {
            fgt $$5 = $$3.d($$0, $$4);
            if ($$5 != null) {
               return $$5.a($$4.a(yv.b));
            }
         }
      }

      return xc.i();
   }

   @Override
   public xq a(@Nullable ek $$0, @Nullable bwv $$1, int $$2) throws CommandSyntaxException {
      if ($$0 == null) {
         return xc.i();
      } else {
         fgw $$3 = this.a($$0);
         fgw $$4 = (fgw)($$1 != null && $$3.equals(fgw.cp) ? $$1 : $$3);
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
